package decorator;

public class Main {

    public static void main(String[] args) {

        Developer developer = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());

    }
}
