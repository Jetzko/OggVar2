public class Team {
    String teamName;

    Programmer p1;
    Programmer p2;

    public void printTeamDetails(){
        System.out.println(teamName);
        System.out.println("---------");
        System.out.println(p1.getName());
        System.out.println(p1.getProgrammingLanguage());
        System.out.println(p1.getYearsOfExperience());
        System.out.println("---------");
        System.out.println(p2.getName());
        System.out.println(p2.getProgrammingLanguage());
        System.out.println(p2.getYearsOfExperience());
    }
}
