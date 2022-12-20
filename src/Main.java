public class Main {
    public static void main(String[] args) {


        CompetitionRules rules = CompetitionRules.getInstance();
        CompetitionRules.printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.p1 = new Programmer("Mario", "Java", 6);
        teamA.p2 = new Programmer("Lucrezia", "Kotlin", 3);
        teamB.p1 = new Programmer("Maria", "Kotlin", 7);
        teamB.p2 = new Programmer("Flavio", "Java", 2);


        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}