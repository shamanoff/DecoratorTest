package decorator;

public class TeamLead extends DeveloperDecorator {


    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendReport(){
        return " Send Report! ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendReport();
    }


}
