public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person a = new Person();

        a.printHeight();
    }
}

class Person {
    double height_m;
    double weight_kg;

    void setHeight_m(double height_m) {
        this.height_m = height_m;
    }

    void printHeight() {
        System.out.println("My height is: " + height_m);
    }

}