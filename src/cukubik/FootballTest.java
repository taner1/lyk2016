package cukubik;

public class FootballTest {
public static void main(String args[]){
	FootballClub besiktas = new FootballClub("Beþiktaþ","Siyah Beyaz","Ýnönü",5000000,41903);
	FootballClub genclerbirligi= new FootballClub("asda","Siyah beyaz", null, 0, 0);
			SimulateMatch futbol = new SimulateMatch();
	futbol.setAsHomeTeam(besiktas.getClubName());
	futbol.setGuestTeamName(genclerbirligi.getClubName());
	futbol.rollTheBall();
	futbol.homeTeamScoresAGoal();
	futbol.guestTeamScoresAGoal();
	futbol.homeTeamScoresAGoal();
	futbol.homeTeamScoresAGoal();
	futbol.homeTeamScoresAGoal();
	
}
}
