package Device;

class Device {
    protected String name;

    Device(String name) {
        this.name = name;
    }
    final void power() {
        System.out.println("Device is ON");
    }
    void function() {
        System.out.println(name + " works");
    }
    static void info() {
        System.out.println("Device info");
    }
}
class Phone extends Device {
    Phone(String name) {
        super(name);
    }
    void function() {
        super.function();
        System.out.println(name + " makes calls");
    }
    static void info() {
        System.out.println("Phone info");
    }
}
class SmartPhone extends Phone {
    SmartPhone(String name) {
        super(name);
    }
}
class Laptop extends Device {
    Laptop(String name) {
        super(name);
    }

    void function() {
        System.out.println(name + " runs programs");
    }
}
final class Lab {}

public class Main {
    public static void main(String[] args) {

        Phone p = new Phone("samsung");
        p.function();
        p.power();
        SmartPhone sp = new SmartPhone("iPhone");
        sp.function();

        Laptop l = new Laptop("hp");
        l.function();

        Device.info();
        Phone.info();

        Lab lab = new Lab();
    }
}