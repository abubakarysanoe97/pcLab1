package pc_homework;

public class Monitor {
    private Resolution resolution;
    private int modelNumber;
    private int manufacturerName;

    public void drawPixel(int x, int y, String color) {
        System.out.println("Drawing pixel at coordinates (" + x + ", " + y + ") with color: " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", modelNumber=" + modelNumber +
                ", manufacturerName=" + manufacturerName +
                '}';
    }
}
