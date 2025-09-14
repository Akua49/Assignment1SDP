public class Car {
    private String brand;
    private String model;
    private String engine;
    private int seats;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.engine = builder.engine;
        this.seats = builder.seats;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model +
                ", engine=" + engine + ", seats=" + seats + "]";
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private String engine;
        private int seats;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}