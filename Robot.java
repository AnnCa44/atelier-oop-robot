import java.util.ArrayList;
import java.util.List;

public abstract class Robot {

    private String brand;
    private String model;
    private List<String> laws;

    public Robot(String brand, String model) {
        this.brand = brand;
        this.model = model;

        List<String> assimovLaws = new ArrayList<>();
        assimovLaws.add("A robot may not injure a human being or, through inaction, allow a human being to come to harm.");
        assimovLaws.add("A robot must obey the orders given it by human beings except where such orders would conflict with the First Law.");
        assimovLaws.add("A robot must protect its own existence as long as such protection does not conflict with the First or Second Laws.");

        this.laws = assimovLaws;
    }

    public List<String> getLaws() {

        return this.laws;
    }

    protected void setLaws(List<String> laws) {

        this.laws = laws;
    }

    public void identify() {
        System.out.println(this.brand + " - " + this.model);
    }
}