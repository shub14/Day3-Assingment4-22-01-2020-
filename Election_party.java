package day3assingment2;

public class Election_party {
	private int electionid;
	private String name;
	private String electiondate;
	private String district;
	private String constituency;
	private String countingdate;
	
	Election_party(int electionid,String name, String electiondate, String district,String constituency,String countingdate){
		this.setElectionid(electionid);
		this.setName(name);
		this.setElectiondate(electiondate);
		this.setDistrict(district);
		this.setConstituency(constituency);
		this.setCountingdate(countingdate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getElectiondate() {
		return electiondate;
	}

	public void setElectiondate(String electiondate) {
		this.electiondate = electiondate;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCountingdate() {
		return countingdate;
	}

	public void setCountingdate(String countingdate) {
		this.countingdate = countingdate;
	}

	public int getElectionid() {
		return electionid;
	}

	public void setElectionid(int electionid) {
		this.electionid = electionid;
	}
	public String toString() {
		return " Electionid: " + electionid + " Name: " +name+ " Electiondate:  " + electiondate + " District: "+ district+ " Constituency: " + constituency + " Countingdate: "+ countingdate; 
				
	}
	public int hashCode() {
		int code=0;
		code=electionid*20;
		code+=name.hashCode();
		return name.hashCode();
	}
	
	
	
	public boolean equals(Object o) {
		boolean flag=false;
		if(o instanceof Election_party) {
			Election_party p=(Election_party)o;
			if(p.name==this.name) {
				flag=true;
			}
		}
		return flag;

	}
	
}
