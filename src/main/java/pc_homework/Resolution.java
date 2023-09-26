package pc_homework;

public class Resolution {
    private int width;
    private int height;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}


//    Create a Resolution class with these two properties width and height.Private int width; int height;
//        Make sure you add all that is necessary, getters, setters etc..
//        Ensure that you have a string representation of the object.