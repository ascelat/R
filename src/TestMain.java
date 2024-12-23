public class TestMain {
    public static void main(String[] args) {
        Car car1 = new Car("Ауди", "красный", 2010);

        Motorbike motorbike1 = new Motorbike("Кавасаки", "Белый", 2011);


        car1.info();
        car1.yearDifference(2024);

        System.out.println();
        motorbike1.info();
        motorbike1.yearDifference(2024);
        System.out.println();

        Airplane air1 = new Airplane("Россия", 2000, 15, 5);
        air1.info();
        air1.fillUp(25);
    }
}
