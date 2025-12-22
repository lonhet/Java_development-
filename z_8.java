import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

class Car {

    private String brand;
    private int year;
    private double price;
    private String configuration;
    private String country;
    private LocalDate saleDate;
    private String buyerFullName;

    public Car() {}

    public Car(String brand, int year, double price, String configuration,
               String country, LocalDate saleDate, String buyerFullName) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.configuration = configuration;
        this.country = country;
        this.saleDate = saleDate;
        this.buyerFullName = buyerFullName;}

    public String getBrand() {
        return brand;}

    public void setBrand(String brand) {
        this.brand = brand;}

    public double getPrice() {
        return price;}

    public void setPrice(double price) {
        this.price = price;}

    @Override
    public String toString() {
        return String.format(
                "Марка: %s%nГод выпуска: %d%nЦена: %.2f%nКомплектация: %s%n" +
                "Страна: %s%nДата продажи: %s%nПокупатель: %s%n",
                brand, year, price, configuration, country, saleDate, buyerFullName);}
}

class GroupCar {

    private int groupId;    
    private Car[] cars;

    public GroupCar() {
        this.groupId = 0;
        this.cars = new Car[0];}

    public GroupCar(int groupId, Car[] cars) {
        this.groupId = groupId;
        this.cars = cars;}

    public Car[] getCars() {
        return cars;}

    public void setCars(Car[] cars) {
        this.cars = cars;}

    public Car getCar(int index) {
        if (index >= 0 && index < cars.length) {
            return cars[index];}
        return null;}

    public void setCar(int index, Car car) {
        if (index >= 0 && index < cars.length) {
            cars[index] = car;}}

    public void addCar(Car car) {
        cars = Arrays.copyOf(cars, cars.length + 1);
        cars[cars.length - 1] = car;}

    public void removeCarByBrand(String brand) {
        cars = Arrays.stream(cars)
                .filter(c -> !c.getBrand().equalsIgnoreCase(brand))
                .toArray(Car[]::new);}

    public void sortByPrice() {
        Arrays.sort(cars, Comparator.comparingDouble(Car::getPrice));}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Группа №" + groupId + "\n");
        for (Car car : cars) {
            sb.append(car).append("\n");}
        return sb.toString();}
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020, 1500000,
                "Comfort", "Japan",
                LocalDate.of(2024, 5, 12), "Иванов И.И.");

        Car car2 = new Car("BMW", 2019, 2300000,
                "Luxury", "Germany",
                LocalDate.of(2024, 6, 1), "Петров П.П.");

        GroupCar group = new GroupCar(1, new Car[]{car1, car2});

        System.out.println("До сортировки:");
        System.out.println(group);
        group.sortByPrice();

        System.out.println("После сортировки по цене:");
        System.out.println(group);
        group.removeCarByBrand("Toyota");

        System.out.println("После удаления Toyota:");
        System.out.println(group);}
}
