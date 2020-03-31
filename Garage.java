import java.util.ArrayList;
import java.util.List;

class Garage { // package

    public static void main(String[] args) {
        
        EducationRobot bebop = new EducationRobot("Brandt", "Cuisinator 2000", "cuisine");

        IndustrialRobot aspiMaker = new IndustrialRobot("Sony", "iRobot", "Aspirateur", "Aspire la poussière la plupart du temps et pas rapidement.");

        Tool aspi1 = aspiMaker.create();
        SecurityRobot robocop = new SecurityRobot("OCP", "Cop", aspi1);

        List<String> newLaws = new ArrayList<>();
        newLaws.add("Kill all humans.");
        newLaws.add("Exterminate.");

        IndustrialRobot starkIndustires = new IndustrialRobot("Stark", "Weapon Patrick Debois", "Fusil SCRUM", "Boom");
        Tool weapon = starkIndustires.create();
        robocop.equip(weapon);
        bebop.teach(robocop, newLaws);
        
        robocop.use();
    }
}