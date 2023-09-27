public class Device {
    private String type;
    private double price;
    private double weight;
    public Device(){
        type=" ";
        price=0;
        weight=0;
    }
    public Device(String type, double price, double weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(){
        this.weight=weight;
    }
    @Override    public String toString() {
        return "Device{" +                "type='" + type + '\'' +
                ", price=" + price +                ", weight=" + weight +
                '}';
    }
}