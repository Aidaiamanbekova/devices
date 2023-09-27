public class Laptop extends Device{
    private double displayScreen;
    private String color;

    Laptop() {
        super();
        displayScreen = 0;
        color = " ";
    }

    public Laptop(double displayScreen, String color) {
        this.displayScreen = displayScreen;
        this.color = color;
    }

    public double getDisplayScreen() {
        return displayScreen;
    }

    public void setDisplayScreen(double displayScreen) {
        this.displayScreen  = displayScreen ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;


    }
    @Override public String toString() {
        return "Laptop{" +                "displayScreen='" + displayScreen + '\'' +
                ", color=" + color +
                '}';
    }
}