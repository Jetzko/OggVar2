public class Main {
    public static void main(String[] args) {
        CompetitionRules.printRules();

        Team teamA = new Team("Team A");
        Team teamB = new Team("Team B");

        teamA.p1 = new Programmer("Mario", "Java", 6);
        teamA.p2 = new Programmer("Lucrezia", "Kotlin", 3);
        teamB.p1 = new Programmer("Maria", "Kotlin", 7);
        teamB.p2 = new Programmer("Flavio", "Java", 2);

        System.out.println();
        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}