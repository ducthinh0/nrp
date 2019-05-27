import java.util.*;
public class RosterMember {
	public String name;
	private List<String> workingDaysDetail;
	private List<Integer> absenceDays;
	public String role;
	
	public RosterMember(String name, List<String> working, List<Integer> absence, String role){
		this.name=name;
		this.workingDaysDetail=working;
		this.absenceDays=absence;
		this.role=role;
	}
	public RosterMember(String name){
		this.name=name;
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getWorkingDaysDetail() {
		return workingDaysDetail;
	}

	public void setWorkingDaysDetail(List<String> workingDaysDetail) {
		this.workingDaysDetail = workingDaysDetail;
	}

	public List<Integer> getAbsenceDays() {
		return absenceDays;
	}

	public void setAbsenceDays(List<Integer> absenceDays) {
		this.absenceDays = absenceDays;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean checkDuplicateAbsenceDay(Integer day){
		List<Integer> temp= this.getAbsenceDays();
		int n=0;
		boolean found=false;
		while(n<temp.size() && !found){
			if(temp.get(n)== day)
				found=true;
			else n=n+1;
		}
		return found;
	}
	public void addOneAbsenceDay(Integer day){
		Integer n= (this.getWorkingDaysDetail().size())-1;
		boolean duplicate=this.checkDuplicateAbsenceDay(day);
		if(!duplicate && day < n){
			String dayToAbsence=this.getWorkingDaysDetail().get(day);
			if (dayToAbsence.equals("D")|| dayToAbsence.equals("N")){
				this.getWorkingDaysDetail().set(day, "A");
			}
			this.absenceDays.add(day);
			Collections.sort(this.absenceDays);
		}
	}
	public void addAbsenceDays(List<Integer> days){
		
		for (int i=1; i<=days.size();i++){
			this.addOneAbsenceDay(days.get(i-1));
		}
	}
}
