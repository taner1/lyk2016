package cukubik;

public class FootballClub extends Football {
private String clubName;
private String stadiumName;
private String colors;
private int clubValue;
private int stadiumCapacity;
public FootballClub(String clubName,String stadiumName,String colors,int clubValue,int stadiumCapacity){
	this.clubName=clubName;
	this.stadiumName=stadiumName;
	this.colors=colors;
	this.clubValue=clubValue;
	this.stadiumCapacity=stadiumCapacity;
}
	@Override
	protected void hasHooliganism() {
		// TODO Auto-generated method stub
		
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public int getClubValue() {
		return clubValue;
	}
	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}
	public int getStadiumCapacity() {
		return stadiumCapacity;
	}
	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}
	@Override
	public void rollTheBall() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void OpponentScore() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void haveWinner() {
		// TODO Auto-generated method stub
		
	}
public void displayTeam(){
	System.out.println("takim adi");
}
}
