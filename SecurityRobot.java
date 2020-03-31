public class SecurityRobot extends Robot {

    private Tool tool;

    public SecurityRobot(String brand, String model, Tool tool) {
        super(brand, model);
        this.tool = tool;
    }

    public void equip(Tool tool) {
        this.tool = tool;
    }

    public void use() {

        System.out.println(this.tool.getEffect());
    }
}