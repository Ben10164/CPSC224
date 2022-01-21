public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person a = new Person();
        a.setHeight_m(2.0);
        // a.height_m = 3.0; Doesnt work since height_m is private
        a.printHeight();
    }
}

class Person {
    private double height_m;

    void setHeight_m(double newHeight_m) {
        if (newHeight_m >= 3) { // taller than 3 meters? i dont think so
            this.height_m = 0.0;
        } else {
            this.height_m = newHeight_m;
        }
    }

    void printHeight() {
        System.out.println("My height is: " + height_m);
    }

}