package day3assingment2;

import java.util.*;
public abstract class Election_Partylist {

	public static void main(String[] args) {
		HashSet<Election_party> parties= new HashSet<Election_party>();
		parties.add(new Election_party(1,"BJP","01-02-2020","Jaipur","Rajasthan","10-02-2020"));
		parties.add(new Election_party(2,"Congress","01-02-2020","Jaipur","Rajasthan","10-02-2020"));
		parties.add(new Election_party(3,"BJP","04-02-2020","Kota","Rajasthan","10-02-2020"));
		parties.add(new Election_party(4,"Congress","04-02-2020","Jaipur","Rajasthan","10-02-2020"));
		
//		for (Election_party e : parties) {
//			if(e.getName())
//		}
		System.out.println(parties);
		List<String> arrlist = new ArrayList<String>();
		ArrayList<String> commonDate=new ArrayList<String>();
		
		
		for(Election_party e :parties)
			{
				
			if(arrlist.contains(e.getElectiondate())) {
				System.out.println("Parties with common date are");
				commonDate.add(e.getElectiondate());
				//commonDate.add(e.getName());
				
			}
			arrlist.add(e.getElectiondate());
			//sarrlist.add(e.getName());
				
			}
		
	
	for(Election_party e1 :parties)
	{
		if(commonDate.contains(e1.getElectiondate()))
		{
			System.out.println(e1);
		}
	}
	}
	

}
