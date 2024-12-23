public class Motorbike implements GroundTransport{
    private String model;
    private String color;
    private int year;

    public Motorbike() {}

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String model() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void info() {
        System.out.println("Это мотоцикл");
    }

    @Override
    public void yearDifference(int year) {
        System.out.println(Math.abs(this.year - year));
    }
}
