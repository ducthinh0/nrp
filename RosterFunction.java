import java.util.*;

public class RosterFunction {

	/*teamList: list of the teams
	 * firstTeam: team có ngày băt đầu ở ngày thứ nhất
	 * 
	 */
	public void CreateBasicWorkScheduleForATeamList(List<Team> teamList, int firstTeam, int numberOfDays){
	
		int m=firstTeam;
		int i=1;
		int j=1;
		while(m<=teamList.size()){
			Team team=teamList.get(m-1);
			team.createBasicWorkingSchedule(i, numberOfDays);
			i=i+1;
			m=m+1;
		}
		while(j< firstTeam){
			Team team=teamList.get(j-1);
			team.createBasicWorkingSchedule(i, numberOfDays);
			j=j+1;
			i=i+1;
		}
	}
	/*Chia 1, sau đó chia 2
	 * Trong thực tê thì 4 làm 4 nghỉ nên có thể làm đến chia 3
	 * Tạm thời là chia 2 trong giả thiết test: 3 làm 3 nghỉ
	 */
	public List<Team> setPriorityForTeam(List<Team> teamList, int dayOfEvent){
		List <Team> temp= new ArrayList();
		temp.addAll(teamList);
		List <Team> result= new ArrayList();
		
		int numberOfTeams=teamList.size();
		for (int i = 1; i<=numberOfTeams; i++){
			Team team=temp.get(i-1);
			List<String> workingSchedule=team.getTeamBasicWorkingSchedule();
			String checkBefore=workingSchedule.get(dayOfEvent - 1);
			
			String checkAfter = null;
			if(dayOfEvent < workingSchedule.size()-1){
				checkAfter=workingSchedule.get(dayOfEvent + 1);
			}
			String checkCurrent = workingSchedule.get(dayOfEvent);
			if ((checkBefore.equals("N") || checkAfter.equals("D")) && checkCurrent.equals("R")){
				result.add(team);
			}				
		}
		temp.removeAll(result);		
		numberOfTeams= numberOfTeams-result.size();
		for (int i = 1; i<=numberOfTeams; i++){
			Team team=temp.get(i-1);
			List<String> workingSchedule=team.getTeamBasicWorkingSchedule();
			String checkBefore1=null;
			if (dayOfEvent >=2){
				checkBefore1=workingSchedule.get(dayOfEvent-2);
			}
			String checkAfter1 = null;
			if(dayOfEvent < workingSchedule.size()-2){
				checkAfter1=workingSchedule.get(dayOfEvent + 2);
			}
			
			String checkCurrent= workingSchedule.get(dayOfEvent);
			String checkCurrentBeforeOneDay= workingSchedule.get(dayOfEvent - 1);
			String checkCurrentAfterOneDay= workingSchedule.get(dayOfEvent + 1); 
			
			Boolean checkCondition1= (checkCurrent.equals("R") && checkCurrentBeforeOneDay.equals("R"));
			Boolean checkCondition2= (checkCurrent.equals("R") && checkCurrentAfterOneDay.equals("R"));
			
			if ((checkBefore1.equals("N") || checkAfter1.equals("D"))&& (checkCondition1 || checkCondition2)){
				result.add(team);
			}							
		}
		temp.removeAll(result);
		numberOfTeams= numberOfTeams-result.size();
		
		for (int i = 1; i<=numberOfTeams; i++){
			Team team=temp.get(i-1);
			List<String> workingSchedule=team.getTeamBasicWorkingSchedule();
			String checkBefore1=null;
			if (dayOfEvent >=3){
				checkBefore1=workingSchedule.get(dayOfEvent-3);
			}
			String checkAfter1 = null;
			if(dayOfEvent < workingSchedule.size()-3){
				checkAfter1=workingSchedule.get(dayOfEvent + 3);
			}
			String checkCurrent= workingSchedule.get(dayOfEvent);
			String checkCurrentBeforeOneDay= workingSchedule.get(dayOfEvent - 1);
			String checkCurrentAfterOneDay= workingSchedule.get(dayOfEvent + 1);
			String checkCurrentBeforeTwoDays= workingSchedule.get(dayOfEvent - 2);
			String checkCurrentAfterTwoDays= workingSchedule.get(dayOfEvent + 2);
			
			Boolean checkCondition1= (checkCurrent.equals("R") && checkCurrentBeforeOneDay.equals("R") &&
									  checkCurrentBeforeTwoDays.equals("R"));
			Boolean checkCondition2= (checkCurrent.equals("R") && checkCurrentAfterOneDay.equals("R")) &&
								      checkCurrentAfterTwoDays.equals("R");
			if ((checkBefore1.equals("N") || checkAfter1.equals("D")) && (checkCondition1 || checkCondition2)){
				result.add(team);
			}							
		}
		temp.removeAll(result);
		result.addAll(temp);
		return result;
	}
	
	public List<RosterMember> getB2List(List<Team> listTeam){
		List<RosterMember> result= new ArrayList();
		for (int i = 1; i<=listTeam.size();i++){
			Team team= listTeam.get(i-1);
			List<RosterMember> rosterList=team.getListOfMember();
			for (int j = 1; j<=rosterList.size();j++){
				RosterMember temp = rosterList.get(j-1);
				if (temp.getRole().equals("B2"))
					result.add(temp);
			}	
		}
		return result;		
	}
	
	public List<RosterMember> getB1List(List<Team> listTeam){
		List<RosterMember> result= new ArrayList();
		for (int i = 1; i<=listTeam.size();i++){
			Team team= listTeam.get(i-1);
			List<RosterMember> rosterList=team.getListOfMember();
			for (int j = 1; j<=rosterList.size();j++){
				RosterMember temp = rosterList.get(j-1);
				if (temp.getRole().equals("B1"))
					result.add(temp);
			}	
		}
		return result;		
	}
	
	public List<RosterMember> getAList(List<Team> listTeam){
		List<RosterMember> result= new ArrayList();
		for (int i = 1; i<=listTeam.size();i++){
			Team team= listTeam.get(i-1);
			List<RosterMember> rosterList=team.getListOfMember();
			for (int j = 1; j<=rosterList.size();j++){
				RosterMember temp = rosterList.get(j-1);
				if (temp.getRole().equals("A1") || temp.getRole().equals("A2"))
					result.add(temp);
			}	
		}
		return result;		
	}
	
	public List<RosterMember> getMCList(List<Team> listTeam){
		List<RosterMember> result= new ArrayList();
		for (int i = 1; i<=listTeam.size();i++){
			Team team= listTeam.get(i-1);
			List<RosterMember> rosterList=team.getListOfMember();
			for (int j = 1; j<=rosterList.size();j++){
				RosterMember temp = rosterList.get(j-1);
				if (temp.getRole().equals("MC"))
					result.add(temp);
			}	
		}
		return result;		
	}
	
	public void setDMMWork(List<RosterMember> DMMList, int numberOfDays){
		int numberOfDMM= DMMList.size();
		for (int i=1; i<=numberOfDMM; i++){
			RosterMember temp= DMMList.get(i-1);
			for (int j=0; j<=numberOfDays;j++){
				temp.getWorkingDaysDetail().add(" ");
			}
		}
		int k=1;
		while (k<=numberOfDMM){
			RosterMember temp1 = DMMList.get(k-1);
			List<String> workingDetails = temp1.getWorkingDaysDetail();
			workingDetails.set(k, "D");
			workingDetails.set(k+1, "N");
			workingDetails.set(k+2, "R");
			workingDetails.set(k+3, "R");
			int condition1= (k+1)%4;
			for (int n=1; n<workingDetails.size(); n++){
				if (n%4 == k %4){
					workingDetails.set(n, "D");
				}
				else if (n%4 == condition1){
					workingDetails.set(n, "N");
				}
				else workingDetails.set(n, "R");
			}
			k++;
		}
	}
	
	public List<WorkingDate> createWorkingDate(){
		List<WorkingDate> workingDateList= new ArrayList();
		for (int i=0; i<=30; i++){
			WorkingDate workingDate= new WorkingDate();
			workingDateList.add(workingDate);
		}
		return workingDateList;
	}
	
	public void setMemberForWorkingDate(List<WorkingDate> workingDate, List<Team> listTeam){
		for (int i=1; i<workingDate.size(); i++){
			WorkingDate temp= workingDate.get(i);
			List<RosterMember> day= new ArrayList();
			List<RosterMember> night= new ArrayList();
			for (int j=1; j<=listTeam.size(); j++){
				Team team= listTeam.get(j-1);
				List<RosterMember> rosterMember= team.getListOfMember();
				for (int k=0; k<rosterMember.size(); k++){
					RosterMember tempMember= rosterMember.get(k);
					List<String> workingDetail =tempMember.getWorkingDaysDetail();
					if (workingDetail.get(i).equals("D"))
						day.add(tempMember);
					else if (workingDetail.get(i).equals("N"))
						night.add(tempMember);
				}
			}
			temp.setWorkingDay(day);
			temp.setWorkingNight(night);
			workingDate.set(i, temp);
			System.out.println("");
			
		}
		
	}
	
	public void setDMMForWokringDate(List<WorkingDate> workingDate, List<RosterMember> DMMList){
		for (int i=1; i< workingDate.size();i++){
			WorkingDate date= workingDate.get(i);
			boolean found= false;
			int j=0;
			while(!found){
				RosterMember DMM= DMMList.get(j);
				if (DMM.getWorkingDaysDetail().get(i).equals("N")){
					date.setDMM(DMM);
					found=true;
				}
				else j=j+1;
			}
		}
	}
}

