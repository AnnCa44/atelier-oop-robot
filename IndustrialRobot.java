public class IndustrialRobot extends Robot {

    private String toolName;
    private String toolEffect;

    public IndustrialRobot(String brand, String model, String toolName, String toolEffect) {
        super(brand, model);
        
        this.toolName = toolName;
        this.toolEffect = toolEffect;
    }

    public Tool create() {

        // create a tool
        Tool tool = new Tool(this.toolName, this.toolEffect);

        return tool;
    }
}