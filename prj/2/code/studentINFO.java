//Tyler Vultaggio
//Project 2
//Due 5/15/2020

public class studentINFO
{
	private double GPA;
	private int clubs;
	private String RA;
	private String clean;


	public studentINFO(double GPA, int clubs, String RA, String clean)
	{
		this.GPA = GPA;
		this.clubs = clubs;
		this.RA = RA;
		this.clean = clean;
	}
	
	public studentINFO()
	{
		GPA = 3.79;
		clubs = 2;
		RA = "no";
		clean = "yes";
	}
	
	
	public double getGPA()
	{
		return GPA;
	}
	
	public void setGPA(double GPA)
	{
		this.GPA = GPA;
	}
	
	public int getClubs()
	{
		return clubs;
	}
	
	public void setClubs(int clubs)
	{
		this.clubs = clubs;
	}
	
	public String getRA()
	{
		return RA.toLowerCase();
	}
	
	public void setRA(String RA)
	{
		this.RA = RA;
	}
	
	public String getClean()
	{
		return clean.toLowerCase();
	}
	
	public void setClean(String clean)
	{
		this.clean = clean;
	}

}
