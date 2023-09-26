package pc_homework;

public class Pc {
    private Case pcCase;
    private MotherBoard motherboard;
    private Monitor monitor;

    public Pc(Case pcCase, MotherBoard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Pc() {

    }

    private void drawLogo(){
        monitor.drawPixel(10,20,"blue");
    }
   public void description(){
       System.out.println("Welcome to worst buy below is the description of the pc on sale today" + monitor.toString() + monitor.toString());


   }

    @Override
    public String toString() {
        return "Pc{" +
                "pcCase=" + pcCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
    public void powerUp(){
        pcCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Macbook");
    }

    public static void main(String[] args) {

        Pc apple = new Pc();
        apple.description();
        apple.powerUp();



    }

}
