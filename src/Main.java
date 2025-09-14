public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .brand("Toyota")
                .model("Camry")
                .engine("V6")
                .seats(5)
                .build();

        System.out.println(car);
    }
}
