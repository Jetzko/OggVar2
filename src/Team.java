public class Team {
    String teamName;

    Programmer p1;
    Programmer p2;
   public Team(String teamName){
       this.teamName = teamName;
   }
    public void printTeamDetails(){
        System.out.println(teamName);
        System.out.println("---------");
        System.out.println("Name: " + p1.getName());
        System.out.println("Programming Language: " + p1.getProgrammingLanguage());
        System.out.println("Year of Experience: " + p1.getYearsOfExperience());
        System.out.println("---------");
        System.out.println("Name: " + p2.getName());
        System.out.println("Programming Language: " + p2.getProgrammingLanguage());
        System.out.println("Year of Experience: " + p2.getYearsOfExperience());
        System.out.println("---------");
        System.out.println();
    }
}
