import java.util.List;

public class EducationRobot extends Robot {

    private String subject;

    public EducationRobot(String brand, String model, String subject) {
        
        super(brand, model); // initialize 3 Asimov laws
        this.subject = subject;
    }

    public void teach(Robot robot, List<String> laws) {
        
        robot.setLaws(laws);
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }
}