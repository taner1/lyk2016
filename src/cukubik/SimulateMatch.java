package cukubik;

public class SimulateMatch extends Football {
private String homeTeamName;
private String guestTeamName;
private int scoresOfHomeTeam=0;
private int scoresOfGuestTeam=0;
private Object O;
private Object O2;
public void setAsHomeTeam(Object O) {
	this.O= O;
	System.out.println=(O+"ev sahibi");
}
public void setAsGuestTeam(Object O2) {
	this.O2= O2;
	System.out.println=(O2 + "deplasman");
}
public void homeTeamScoresAGoal(){
	System.out.println(O+"GOOL ATTI");
	scoresOfHomeTeam++;
}
public void guestTeamScoresAGoal(){
	System.out.println(O2+"GOOL ATTI");
	scoresOfGuestTeam++;
}
public void endOffFirstHalf(){
System.out.println("ilk yari bitti");
}
public void endOfGame(){
	System.out.println("Mac bitti");
}
public void announceWinner(){
	int x= scoresOfHomeTeam;
	int y= scoresOfGuestTeam;
	if(x>y) System.out.println("kazanan"+ O+"sonuc"+scoresOfHomeTeam+"-"+"scoresOfGuestTeam");
	if(x<y) System.out.println("kazanan"+ O2+"sonuc"+scoresOfHomeTeam+"-"+"scoresOfGuestTeam");
	if(x=y) System.out.println("Berabere");
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
@Override
protected void hasHooliganism() {
	// TODO Auto-generated method stub
	
}
public String getHomeTeamName() {
	return homeTeamName;
}
public void setHomeTeamName(String homeTeamName) {
	this.homeTeamName = homeTeamName;
}
public int getScoresOfHomeTeam() {
	return scoresOfHomeTeam;
}
public void setScoresOfHomeTeam(int scoresOfHomeTeam) {
	this.scoresOfHomeTeam = scoresOfHomeTeam;
}
public String getGuestTeamName() {
	return guestTeamName;
}
public void setGuestTeamName(String guestTeamName) {
	this.guestTeamName = guestTeamName;
}
public int getScoresOfGuestTeam() {
	return scoresOfGuestTeam;
}
public void setScoresOfGuestTeam(int scoresOfGuestTeam) {
	this.scoresOfGuestTeam = scoresOfGuestTeam;
}
}
