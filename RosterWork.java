import java.util.*;

public class RosterWork {
	public static void main(String args[]){
		RosterFunction rt= new RosterFunction();
		CreateTeam ct=new CreateTeam();
		EventFunction ef= new EventFunction();
		Team team1= ct.createTeam1();
		Team team2= ct.createTeam2();
		Team team3= ct.createTeam3();
		Team team4= ct.createTeam4();
		Team team5= ct.createTeam5();
		Team team6= ct.createTeam6();
		Team team7= ct.createTeam7();
		Team team8=ct.createTeam8();
		
		List<Team> listTeam=new ArrayList();
		listTeam.add(team1);
		listTeam.add(team2);
		listTeam.add(team3);
		listTeam.add(team4);
		listTeam.add(team5);
		listTeam.add(team6);
		listTeam.add(team7);
		listTeam.add(team8);
		
		List<RosterMember> DMMList = ct.createDMMList();
		rt.setDMMWork(DMMList, 30);
		rt.CreateBasicWorkScheduleForATeamList(listTeam, 3, 30);
		
		
		
		RosterEvent event= new RosterEvent("EngChg", 1, 1);
		event.setNumberOfPeople(event);
		RosterEvent event1=new RosterEvent("A01",1,1);
		event.setNumberOfPeople(event1);
		RosterEvent event2=new RosterEvent("APUChange",1,1);
		event.setNumberOfPeople(event2);
		List<RosterEvent> eventOnDay15= new ArrayList();
		eventOnDay15.add(event1);
		eventOnDay15.add(event2);
		eventOnDay15.add(event);
		for (int i=0;i<=30; i++){
			System.out.print(i + "\t");
		}
		
	
	
		System.out.println("");
		for (Team team: listTeam){
			team.addBasicWorkingScheduleToMember();
			List<String> basicWorkingSchedule=team.getTeamBasicWorkingSchedule();
			System.out.print(listTeam.indexOf(team)+1);
			for (String string : basicWorkingSchedule){
				System.out.print(string + "\t");				
			}
			System.out.println("");
		}
		List<Team> priority= rt.setPriorityForTeam(listTeam, 4);
		List<RosterMember> MCList=rt.getMCList(listTeam);
		rt.setDMMWork(DMMList, 30);
		for (RosterMember DMM: DMMList){
			List<String> temp= DMM.getWorkingDaysDetail();
			for (String string: temp){
				System.out.print(string + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		List<WorkingDate> workingDate= rt.createWorkingDate();
		rt.setMemberForWorkingDate(workingDate, listTeam);
		rt.setDMMForWokringDate(workingDate, DMMList);
		WorkingDate date15= workingDate.get(15);
		date15.setEventList(eventOnDay15);
		int[] result= ef.checkANeeded(15, workingDate);
		System.out.println("");
	}
}
