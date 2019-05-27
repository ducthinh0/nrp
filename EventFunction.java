import java.util.*;

public class EventFunction {
	public List<List<RosterEvent>>  createEventList(int numberOfDays){
		List<List<RosterEvent>>  eventList= new ArrayList();
		for (int i =0; i<=numberOfDays; i++){
			List<RosterEvent> temp= new ArrayList();
			for (int j=0; j<=5; j++){
				RosterEvent tempEvent= new RosterEvent("No event", 0,0);
				tempEvent.setNumberOfPeople(tempEvent);
				temp.add(tempEvent);
			}
			eventList.add(temp);
		}
		return eventList;
	}
	public int[] checkBNeeded(int day,List<WorkingDate> workingDate){
	    WorkingDate date= workingDate.get(day);
	    List<RosterEvent> eventList= date.getEventList();
	   	int [] result= {0,0};
	   	for (int i=1; i<= eventList.size();i++){
	   		RosterEvent event= eventList.get(i-1);
	   		int [] numberOfB2=event.getNumberOfB_require();
	   		result[0] = result[0] + numberOfB2[0];
	   		result[1] = result[1] + numberOfB2[1];
	   	}
	   	RosterMember DMM= date.getDMM();
	   	if (DMM.getRole().equals("B1"))
	   		result[0]= result[0] - 1;
	   	else 
	   		result[1]= result[1] -1 ;
	   	List<RosterMember> rosterMember = date.getWorkingNight();
	   	for (int i =0; i<rosterMember.size();i++){
	   		RosterMember member= rosterMember.get(i);
	   		if (member.getRole().equals("B1"))
	   			result[0] = result[0] -1 ;
	   		else if (member.getRole().equals("B2"))
	   			result[1] = result[1] - 1;
	   	}
	   	if (result[0]<0)
	   		result [0]=0;
	   	if (result[1]<0)
	   		result[1]=0;
	   	return result;
   }
   public int checkMCNeeded(int day,List<WorkingDate> WorkingDate){
	   int result=0;
	   WorkingDate date= WorkingDate.get(day);
	   List<RosterEvent> eventList=date.getEventList();
	   for (int i=1; i<= eventList.size();i++){
	   		RosterEvent event= eventList.get(i-1);
	   		int numberOfMC=event.getNumberMC_require();
	   		result = result+ numberOfMC;
	   }
	   List<RosterMember> rosterMember= date.getWorkingNight();
	   for(int j=0; j<rosterMember.size(); j++){
		   RosterMember member= rosterMember.get(j);
		   if (member.getRole().equals("MC")){
			   result= result - 1;
		   }
	   }
	 
	   if (result <0)
		   result = 0;
	   return result;
   }
   public int[] checkANeeded(int day,List<WorkingDate> workingDate){
	   WorkingDate date= workingDate.get(day);
	   int result[]={0,0,0};
	   int totalA=0;
	   int totalANeeded=0;
	   int[] numberOfA1AndA2={0,0};
	   int[] numberOfA1AndA2Needed={0,0};
	   List<RosterMember> rosterMember= date.getWorkingNight();
	   for (int i=0; i<rosterMember.size();i++){
		   RosterMember member= rosterMember.get(i);
		   if (member.getRole().equals("A1"))
			   numberOfA1AndA2[0] =  numberOfA1AndA2[0]+1;
		   else if (member.getRole().equals("A2"))
			   numberOfA1AndA2[1] =  numberOfA1AndA2[1]+1; 
	   }
	   totalA=numberOfA1AndA2[0] + numberOfA1AndA2[1];
	   
	   List<RosterEvent> eventList=date.getEventList();
	   for (int i=1; i<= eventList.size();i++){
	   		RosterEvent event= eventList.get(i-1);
	   		if (event.getEventCode().equals("EngChg") || event.getEventCode().equals("APUChange")){
	   			int[] numberOfA=event.getNumberOfA_require();
	   			numberOfA1AndA2Needed[0]=numberOfA1AndA2Needed[0] + numberOfA[0];
	   			numberOfA1AndA2Needed[1]=numberOfA1AndA2Needed[1] + numberOfA[1];
	   			totalANeeded=totalANeeded + numberOfA[0]+numberOfA[1];
	        }
	   		else {
	   			int [] numberOfA=event.getNumberOfA_require();
	   			totalANeeded=totalANeeded+ numberOfA[0];
	   		}	   			
	   }
	   int numberARequireForACheck= totalANeeded- (numberOfA1AndA2Needed[0]+numberOfA1AndA2Needed[1]);
	   int remainA1=numberOfA1AndA2[0]- numberOfA1AndA2Needed[0];
	   int remainA2=numberOfA1AndA2[1]- numberOfA1AndA2Needed[1];
	   
	   if (remainA1>=0){
		   numberARequireForACheck=numberARequireForACheck- remainA1;
	   }
	   
	   if (remainA2>=0){
		   numberARequireForACheck=numberARequireForACheck- remainA1;
	   }
	   if (remainA1<0){
		   result[0]=-1*remainA1;
	   }
	   else result[0]=0;
	   if (remainA2<0){
		   result[1]=-1*remainA2;
	   }
	   else result[1]=0;
	   if (numberARequireForACheck <0){
		   numberARequireForACheck=0;
	   }
	   if (numberARequireForACheck<=0)
		   numberARequireForACheck=0;
	   result[2]=numberARequireForACheck;
	   return result;
	
   }
 

}
	

