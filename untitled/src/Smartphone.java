public class Smartphone extends Device{
    private double screenSize;
    private double cameraResolution;

    Smartphone() {
        super();
        screenSize = 0;
        cameraResolution = 0;
    }

    public Smartphone(double screenSize, double cameraResolution) {
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;


    }
    @Override public String toString() {
        return "Smartphone{" +                "screenSize='" + screenSize + '\'' +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}