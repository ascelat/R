public class Airplane implements AirTransport{
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane() {}

    public Airplane(String producer, int year, int length,
                    int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public void fillUp(int fill) {
        fuel += fill;
        System.out.println("Бак заполнен на " + fill);
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public void info() {
        System.out.println("Самолет. Изготовитель: " + producer + ", год выпуска: " + year +
                "\nдлинна: " + length + ", вес: " + weight +
                ", кол-во топлива в баке: " + fuel);
    }
}
