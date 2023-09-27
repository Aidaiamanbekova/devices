public class Tablet extends Device {
    private String screenType;
    private boolean hasStylus;

    // Constructor for Tablet class
    public Tablet(String type, double price, double weight, String screenType, boolean hasStylus) {
        super(type, price, weight);
        this.screenType = screenType;
        this.hasStylus = hasStylus;
    }

    // Getter and setter methods for screenType
    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    // Getter and setter methods for hasStylus
    public boolean hasStylus() {
        return hasStylus;
    }

    public void setStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override public String toString() {
        return "Tablet{" +                "screenType='" + screenType + '\'' +
                ", hasStylus=" + hasStylus +
                '}';
    }
}
