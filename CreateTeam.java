import java.util.*;


public class CreateTeam {
	public Team createTeam1(){
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		List<String> workingDaysDetail5=new ArrayList();
		List<Integer> absence5= new ArrayList();
		List<String> workingDaysDetail6=new ArrayList();
		List<Integer> absence6= new ArrayList();
		List<String> workingDaysDetail7=new ArrayList();
		List<Integer> absence7= new ArrayList();
		List<String> workingDaysDetail8=new ArrayList();
		List<Integer> absence8= new ArrayList();
		
		RosterMember member1=new RosterMember("NVA",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("NVB",workingDaysDetail2,absence2,"B2");
		RosterMember member3=new RosterMember("NVC",workingDaysDetail3,absence3,"B2");
		RosterMember member4=new RosterMember("NVD",workingDaysDetail4,absence4,"A1");
		RosterMember member5=new RosterMember("NVE",workingDaysDetail5,absence5,"A2");
		RosterMember member6=new RosterMember("NVF",workingDaysDetail6,absence6,"A2");
		RosterMember member7=new RosterMember("NVG",workingDaysDetail7,absence7,"MC");
		RosterMember member8=new RosterMember("NVH",workingDaysDetail8,absence8,"MC");
		
		List<RosterMember> team1Roster= new ArrayList();
		List<String> team1WorkSchedule=new ArrayList();
		Team testTeam1=new Team(1,team1Roster, team1WorkSchedule);
		
		testTeam1.addMember(member1);
		testTeam1.addMember(member2);
		testTeam1.addMember(member3);
		testTeam1.addMember(member4);
		testTeam1.addMember(member5);
		testTeam1.addMember(member6);
		testTeam1.addMember(member7);
		testTeam1.addMember(member8);
		return testTeam1;
	}
	
	public Team createTeam2(){
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		List<String> workingDaysDetail5=new ArrayList();
		List<Integer> absence5= new ArrayList();
		List<String> workingDaysDetail6=new ArrayList();
		List<Integer> absence6= new ArrayList();
		List<String> workingDaysDetail7=new ArrayList();
		List<Integer> absence7= new ArrayList();
		List<String> workingDaysDetail8=new ArrayList();
		List<Integer> absence8= new ArrayList();
		
		RosterMember member1=new RosterMember("AVA",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("AVB",workingDaysDetail2,absence2,"B1");
		RosterMember member3=new RosterMember("AVC",workingDaysDetail3,absence3,"B2");
		RosterMember member4=new RosterMember("AVD",workingDaysDetail4,absence4,"A1");
		RosterMember member5=new RosterMember("AVE",workingDaysDetail5,absence5,"A1");
		RosterMember member6=new RosterMember("AVF",workingDaysDetail6,absence6,"A2");
		RosterMember member7=new RosterMember("AVG",workingDaysDetail7,absence7,"MC");
		RosterMember member8=new RosterMember("AVH",workingDaysDetail8,absence8,"MC");
		
		List<RosterMember> team1Roster= new ArrayList();
		List<String> team1WorkSchedule=new ArrayList();
		Team testTeam1=new Team(2,team1Roster, team1WorkSchedule);
		
		testTeam1.addMember(member1);
		testTeam1.addMember(member2);
		testTeam1.addMember(member3);
		testTeam1.addMember(member4);
		testTeam1.addMember(member5);
		testTeam1.addMember(member6);
		testTeam1.addMember(member7);
		testTeam1.addMember(member8);
		return testTeam1;
	}
	
	public Team createTeam3(){
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		List<String> workingDaysDetail5=new ArrayList();
		List<Integer> absence5= new ArrayList();
		List<String> workingDaysDetail6=new ArrayList();
		List<Integer> absence6= new ArrayList();
		List<String> workingDaysDetail7=new ArrayList();
		List<Integer> absence7= new ArrayList();
		List<String> workingDaysDetail8=new ArrayList();
		List<Integer> absence8= new ArrayList();
		
		RosterMember member1=new RosterMember("BVA",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("BVB",workingDaysDetail2,absence2,"B2");
		RosterMember member3=new RosterMember("BVC",workingDaysDetail3,absence3,"A1");
		RosterMember member4=new RosterMember("BVD",workingDaysDetail4,absence4,"A2");
		RosterMember member5=new RosterMember("BVE",workingDaysDetail5,absence5,"A2");
		RosterMember member6=new RosterMember("BVF",workingDaysDetail6,absence6,"MC");
		RosterMember member7=new RosterMember("BVG",workingDaysDetail7,absence7,"MC");
		RosterMember member8=new RosterMember("BVH",workingDaysDetail8,absence8,"MC");
		
		List<RosterMember> team1Roster= new ArrayList();
		List<String> team1WorkSchedule=new ArrayList();
		Team testTeam1=new Team(3,team1Roster, team1WorkSchedule);
		
		testTeam1.addMember(member1);
		testTeam1.addMember(member2);
		testTeam1.addMember(member3);
		testTeam1.addMember(member4);
		testTeam1.addMember(member5);
		testTeam1.addMember(member6);
		testTeam1.addMember(member7);
		testTeam1.addMember(member8);
		return testTeam1;
	}
	
	public Team createTeam4(){
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		List<String> workingDaysDetail5=new ArrayList();
		List<Integer> absence5= new ArrayList();
		List<String> workingDaysDetail6=new ArrayList();
		List<Integer> absence6= new ArrayList();
		List<String> workingDaysDetail7=new ArrayList();
		List<Integer> absence7= new ArrayList();
		List<String> workingDaysDetail8=new ArrayList();
		List<Integer> absence8= new ArrayList();
		
		RosterMember member1=new RosterMember("CVA",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("CVB",workingDaysDetail2,absence2,"B2");
		RosterMember member3=new RosterMember("CVC",workingDaysDetail3,absence3,"A1");
		RosterMember member4=new RosterMember("CVD",workingDaysDetail4,absence4,"A1");
		RosterMember member5=new RosterMember("CVE",workingDaysDetail5,absence5,"A2");
		RosterMember member6=new RosterMember("CVF",workingDaysDetail6,absence6,"MC");
		RosterMember member7=new RosterMember("CVG",workingDaysDetail7,absence7,"MC");
		RosterMember member8=new RosterMember("CVH",workingDaysDetail8,absence8,"MC");
		
		List<RosterMember> team1Roster= new ArrayList();
		List<String> team1WorkSchedule=new ArrayList();
		Team testTeam1=new Team(4,team1Roster, team1WorkSchedule);
		
		testTeam1.addMember(member1);
		testTeam1.addMember(member2);
		testTeam1.addMember(member3);
		testTeam1.addMember(member4);
		testTeam1.addMember(member5);
		testTeam1.addMember(member6);
		testTeam1.addMember(member7);
		testTeam1.addMember(member8);
		return testTeam1;
	}
	
	public Team createTeam5(){
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		List<String> workingDaysDetail5=new ArrayList();
		List<Integer> absence5= new ArrayList();
		List<String> workingDaysDetail6=new ArrayList();
		List<Integer> absence6= new ArrayList();
		List<String> workingDaysDetail7=new ArrayList();
		List<Integer> absence7= new ArrayList();
		List<String> workingDaysDetail8=new ArrayList();
		List<Integer> absence8= new ArrayList();
		
		RosterMember member1=new RosterMember("DVA",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("DVB",workingDaysDetail2,absence2,"B2");
		RosterMember member3=new RosterMember("DVC",workingDaysDetail3,absence3,"A1");
		RosterMember member4=new RosterMember("DVD",workingDaysDetail4,absence4,"A2");
		RosterMember member5=new RosterMember("DVE",workingDaysDetail5,absence5,"MC");
		RosterMember member6=new RosterMember("DVF",workingDaysDetail6,absence6,"MC");
		RosterMember member7=new RosterMember("DVG",workingDaysDetail7,absence7,"MC");
		RosterMember member8=new RosterMember("DVH",workingDaysDetail8,absence8,"MC");
		
		List<RosterMember> team1Roster= new ArrayList();
		List<String> team1WorkSchedule=new ArrayList();
		Team testTeam1=new Team(5,team1Roster, team1WorkSchedule);
		
		testTeam1.addMember(member1);
		testTeam1.addMember(member2);
		testTeam1.addMember(member3);
		testTeam1.addMember(member4);
		testTeam1.addMember(member5);
		testTeam1.addMember(member6);
		testTeam1.addMember(member7);
		testTeam1.addMember(member8);
		return testTeam1;
	}

	public Team createTeam6(){
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		List<String> workingDaysDetail5=new ArrayList();
		List<Integer> absence5= new ArrayList();
		List<String> workingDaysDetail6=new ArrayList();
		List<Integer> absence6= new ArrayList();
		List<String> workingDaysDetail7=new ArrayList();
		List<Integer> absence7= new ArrayList();
		List<String> workingDaysDetail8=new ArrayList();
		List<Integer> absence8= new ArrayList();
		
		RosterMember member1=new RosterMember("EVA",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("EVB",workingDaysDetail2,absence2,"B2");
		RosterMember member3=new RosterMember("EVC",workingDaysDetail3,absence3,"A1");
		RosterMember member4=new RosterMember("EVD",workingDaysDetail4,absence4,"A1");
		RosterMember member5=new RosterMember("EVE",workingDaysDetail5,absence5,"A2");
		RosterMember member6=new RosterMember("EVF",workingDaysDetail6,absence6,"A2");
		RosterMember member7=new RosterMember("EVG",workingDaysDetail7,absence7,"MC");
		RosterMember member8=new RosterMember("EVH",workingDaysDetail8,absence8,"MC");
		
		List<RosterMember> team1Roster= new ArrayList();
		List<String> team1WorkSchedule=new ArrayList();
		Team testTeam1=new Team(6,team1Roster, team1WorkSchedule);
		
		testTeam1.addMember(member1);
		testTeam1.addMember(member2);
		testTeam1.addMember(member3);
		testTeam1.addMember(member4);
		testTeam1.addMember(member5);
		testTeam1.addMember(member6);
		testTeam1.addMember(member7);
		testTeam1.addMember(member8);
		return testTeam1;
	}
	
	public Team createTeam7(){
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		List<String> workingDaysDetail5=new ArrayList();
		List<Integer> absence5= new ArrayList();
		List<String> workingDaysDetail6=new ArrayList();
		List<Integer> absence6= new ArrayList();
		List<String> workingDaysDetail7=new ArrayList();
		List<Integer> absence7= new ArrayList();
		List<String> workingDaysDetail8=new ArrayList();
		List<Integer> absence8= new ArrayList();
		
		RosterMember member1=new RosterMember("FVA",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("FVB",workingDaysDetail2,absence2,"B2");
		RosterMember member3=new RosterMember("FVC",workingDaysDetail3,absence3,"A1");
		RosterMember member4=new RosterMember("FVD",workingDaysDetail4,absence4,"A1");
		RosterMember member5=new RosterMember("FVE",workingDaysDetail5,absence5,"A2");
		RosterMember member6=new RosterMember("FVF",workingDaysDetail6,absence6,"A2");
		RosterMember member7=new RosterMember("FVG",workingDaysDetail7,absence7,"MC");
		RosterMember member8=new RosterMember("FVH",workingDaysDetail8,absence8,"MC");
		
		List<RosterMember> team1Roster= new ArrayList();
		List<String> team1WorkSchedule=new ArrayList();
		Team testTeam1=new Team(7,team1Roster, team1WorkSchedule);
		
		testTeam1.addMember(member1);
		testTeam1.addMember(member2);
		testTeam1.addMember(member3);
		testTeam1.addMember(member4);
		testTeam1.addMember(member5);
		testTeam1.addMember(member6);
		testTeam1.addMember(member7);
		testTeam1.addMember(member8);
		return testTeam1;
	}
	
	public Team createTeam8(){
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		List<String> workingDaysDetail5=new ArrayList();
		List<Integer> absence5= new ArrayList();
		List<String> workingDaysDetail6=new ArrayList();
		List<Integer> absence6= new ArrayList();
		List<String> workingDaysDetail7=new ArrayList();
		List<Integer> absence7= new ArrayList();
		List<String> workingDaysDetail8=new ArrayList();
		List<Integer> absence8= new ArrayList();
		
		RosterMember member1=new RosterMember("GVA",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("GVB",workingDaysDetail2,absence2,"B2");
		RosterMember member3=new RosterMember("GVC",workingDaysDetail3,absence3,"A1");
		RosterMember member4=new RosterMember("GVD",workingDaysDetail4,absence4,"A1");
		RosterMember member5=new RosterMember("GVE",workingDaysDetail5,absence5,"A2");
		RosterMember member6=new RosterMember("GVF",workingDaysDetail6,absence6,"A2");
		RosterMember member7=new RosterMember("GVG",workingDaysDetail7,absence7,"MC");
		RosterMember member8=new RosterMember("GVH",workingDaysDetail8,absence8,"MC");
		
		List<RosterMember> team1Roster= new ArrayList();
		List<String> team1WorkSchedule=new ArrayList();
		Team testTeam1=new Team(8,team1Roster, team1WorkSchedule);
		
		testTeam1.addMember(member1);
		testTeam1.addMember(member2);
		testTeam1.addMember(member3);
		testTeam1.addMember(member4);
		testTeam1.addMember(member5);
		testTeam1.addMember(member6);
		testTeam1.addMember(member7);
		testTeam1.addMember(member8);
		return testTeam1;
	}
	public List<RosterMember> createDMMList(){
		List<RosterMember> DMMList=new ArrayList();
		List<String> workingDaysDetail1=new ArrayList();
		List<Integer> absence1= new ArrayList();
		List<String> workingDaysDetail2=new ArrayList();
		List<Integer> absence2= new ArrayList();
		List<String> workingDaysDetail3=new ArrayList();
		List<Integer> absence3= new ArrayList();
		List<String> workingDaysDetail4=new ArrayList();
		List<Integer> absence4= new ArrayList();
		
		RosterMember member1=new RosterMember("DMM1",workingDaysDetail1,absence1,"B1");
		RosterMember member2=new RosterMember("DMM2",workingDaysDetail2,absence2,"B2");
		RosterMember member3=new RosterMember("DMM3",workingDaysDetail3,absence3,"B1");
		RosterMember member4=new RosterMember("DMM4",workingDaysDetail4,absence4,"B2");
		
		DMMList.add(member1);
		DMMList.add(member2);
		DMMList.add(member3);
		DMMList.add(member4);
		return DMMList;	
	}
}
