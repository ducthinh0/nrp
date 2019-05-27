import java.util.*;

public class WorkingDate {
	public List<RosterMember> workingDay;
	public List<RosterMember> workingNight;
	RosterMember DMM;
	List<RosterEvent> eventList;
	
	WorkingDate(){
		this.workingDay=new ArrayList();
		this.workingNight=new ArrayList();
	}

	public List<RosterMember> getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(List<RosterMember> workingDay) {
		this.workingDay = workingDay;
	}

	public List<RosterMember> getWorkingNight() {
		return workingNight;
	}

	public void setWorkingNight(List<RosterMember> workingNight) {
		this.workingNight = workingNight;
	}

	public RosterMember getDMM() {
		return DMM;
	}

	public void setDMM(RosterMember dMM) {
		DMM = dMM;
	}

	public List<RosterEvent> getEventList() {
		return eventList;
	}

	public void setEventList(List<RosterEvent> eventList) {
		this.eventList = eventList;
	};
}
