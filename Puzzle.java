public class Puzzle {
    private int price;
    private static double volume;
    private int number;
    private String type = "wooden";
    private String material = "plywood board";

    public static double totalVolume = 0;


    public Puzzle() {
    }

    public Puzzle(int number, double volume, int price) {
        this(number, volume, price, null, null);
    }

    public Puzzle(int price, double volume, int number, String type, String material) {
        setPrice(price);
        setVolum(volume);
        setNumber(number);
        setType(type);
        setMaterial(material);
    }


    public String toString() {
        return "Puzzle is cost " + price + " UAH, has " + number + "  Details, is " + volume + " square meter,has " + type + "  is plywood board material " + material + ".";
    }

    static void printStaticSum() {
        System.out.println("Puzzle can have " + volume + " square meter");
    }

    public void printSum() {
        System.out.println("The puzzle can have " + volume + " square meter, total meter " + totalVolume + ".");
    }

    public void resetValues(int price, double volume, int number, String type, String material) {
        setPrice(price);
        setVolum(volume);
        setNumber(number);
        setType(type);
        setMaterial(material);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVolum() {
        return volume;
    }

    public void setVolum(double volum) {
        this.volume = volum;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getVolume() {
        return volume;
    }

    public String gettype() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
