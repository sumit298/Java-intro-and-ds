package Comparable_And_Comparator;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private int price;
    private int ram;

    Laptop(String brand, int price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", ram = " + ram + ", price = " + price + " ]";
    }

    // Sorting parameter i.e by ram
    @Override
    public int compareTo(Laptop o) {
        // this > o return +;
        // this == o return 0;
        // this < o return -;
        if (this.getRam() > o.ram)
            return 1;
        else
            return -1;
    }

}
