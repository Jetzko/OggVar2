public class Programmer {
   private final String name;
   private final String programmingLanguage;
   private final int yearsOfExperience;

    public Programmer(String name, String programmingLanguage, int yearsOfExperience) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getName(){
        return name;
    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    public void printProgrammerDetails() {
        System.out.println(name);
        System.out.println(programmingLanguage);
        System.out.println(yearsOfExperience);
    }
}
