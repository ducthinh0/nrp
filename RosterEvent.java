import java.util.*;

public class RosterEvent {
	private String eventCode;
	public int [] numberOfB_require;
	public int [] numberOfA_require;
	public int numberMC_require;
	public int eventDay;
	public int numberOfDays;
	
	public RosterEvent(String eventCode, int eventDay, int numberOfDays){
		this.eventCode= eventCode;
		this.eventDay= eventDay;
		this.numberOfDays=numberOfDays;
	}
	public void setNumberOfPeople(RosterEvent event){
		if (event.getEventCode().equals("N")){
			int [] numberOfB= {3,2};
			event.setNumberOfB_require(numberOfB);
			int [] numberOfA= {7,0};
			event.setNumberOfA_require(numberOfA);
			event.setNumberMC_require(7);
		}
		else if (event.getEventCode().equals("EngChg")){
			int [] numberOfB= {2,1};
			event.setNumberOfB_require(numberOfB);
			int [] numberOfA= {2,1};
			event.setNumberOfA_require(numberOfA);
			event.setNumberMC_require(3);
		}
		else if (event.getEventCode().equals("APUChange")){
			int [] numberOfB= {2,0};
			event.setNumberOfB_require(numberOfB);
			int [] numberOfA= {0,0};
			event.setNumberOfA_require(numberOfA);
			event.setNumberMC_require(2);
		}
		else if(event.getEventCode().equals("No event")){
			int [] numberOfB= {0,0};
			event.setNumberOfB_require(numberOfB);
			int [] numberOfA= {0,0};
			event.setNumberOfA_require(numberOfA);
			event.setNumberMC_require(0);
		}
	
		else if (event.getEventCode().substring(0, 1).equals("A")){
			if (checkACheckType(event).equals("light")){
				int [] numberOfB= {6,4};
				event.setNumberOfB_require(numberOfB);
				int [] numberOfA= {8,0};
				event.setNumberOfA_require(numberOfA);
				event.setNumberMC_require(10);
			}
			else{
				int [] numberOfB= {5,3};
				event.setNumberOfB_require(numberOfB);
				int [] numberOfA= {7,0};
				event.setNumberOfA_require(numberOfA);
				event.setNumberMC_require(10);
			}
		}
	}
	
	public String checkACheckType(RosterEvent event){
		String type= event.getEventCode();
		int lenght= type.length();
		String codeACheck= type.substring(lenght-1);
		int a = Integer.parseInt(codeACheck);
		if (a%2 == 0){
			return "heavy";
		}
		else return "light";
		
	}
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	public int[] getNumberOfB_require() {
		return numberOfB_require;
	}
	public void setNumberOfB_require(int[] numberOfB_require) {
		this.numberOfB_require = numberOfB_require;
	}
	public int[] getNumberOfA_require() {
		return numberOfA_require;
	}
	public void setNumberOfA_require(int[] numberOfA_require) {
		this.numberOfA_require = numberOfA_require;
	}
	public int getNumberMC_require() {
		return numberMC_require;
	}
	public void setNumberMC_require(int numberMC_require) {
		this.numberMC_require = numberMC_require;
	}
	public int getEventDay() {
		return eventDay;
	}
	public void setEventDay(int eventDay) {
		this.eventDay = eventDay;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
}
