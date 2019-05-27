import java.util.*;

public class Team {
	public int teamNumber;
	private List<RosterMember> listOfMember; //default: null list;
	private List<String> teamBasicWorkingSchedule; //default: null list;
	public int getTeamNumber() {
		return teamNumber;
	}
	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}
	public List<RosterMember> getListOfMember() {
		return listOfMember;
	}
	public void setListOfMember(List<RosterMember> listOfMember) {
		this.listOfMember = listOfMember;
	}
	public List<String> getTeamBasicWorkingSchedule() {
		return teamBasicWorkingSchedule;
	}
	public void setTeamBasicWorkingSchedule(List<String> teamBasicWorkingSchedule) {
		this.teamBasicWorkingSchedule = teamBasicWorkingSchedule;
	}
	
	public Team(Integer number, List<RosterMember> listOfMember,
			List<String> teamBasicWorkingSchedule){
		this.teamNumber=number;
		this.listOfMember=listOfMember;
		this.teamBasicWorkingSchedule=teamBasicWorkingSchedule;
	}
	
	//Thêm 1 member mới cho team
	public void addMember(RosterMember member){
		this.listOfMember.add(member);
	}
	
	
	//Tạo lịch cơ bản cho cả team
	public void createBasicWorkingSchedule(int firstStartingDay, int numberOfDays ){
		List<String> temp=this.getTeamBasicWorkingSchedule();
		int condition1=(firstStartingDay+1)%8;
		int condition2=(firstStartingDay+2)%8;
		int condition3=(firstStartingDay+3)%8;
		for (int i=0;i<=numberOfDays;i++){
			temp.add(" "); //add null element;
		}
		temp.set(firstStartingDay, "D");
		temp.set(firstStartingDay + 1, "N");
		temp.set(firstStartingDay + 2, "N");
		temp.set(firstStartingDay + 3, "N");
		temp.set(firstStartingDay + 4, "R");
		temp.set(firstStartingDay + 5, "R");
		temp.set(firstStartingDay + 6, "R");
		temp.set(firstStartingDay + 7, "R");
		for(String day: temp){
			int n=temp.indexOf(day); 
			if (n%8 == firstStartingDay%8)
				temp.set(n, "D");
			else if((n%8 == condition1) || (n%8 == condition2) || (n%8 == condition3) )
				temp.set(n, "N");
			else temp.set(n, "R");
			
		}
		temp.set(0," ");
	}
	
	//Copy lịch làm việc của team cho các thành viên.
	public void addBasicWorkingScheduleToMember(){
		List<RosterMember> temp= this.getListOfMember();
		List<String> basicSchedule=this.getTeamBasicWorkingSchedule();
		for (int i=1; i<=temp.size();i++){
			List<String> temp1= temp.get(i-1).getWorkingDaysDetail();
			temp1.addAll(basicSchedule);
		}
		
	}	
}
