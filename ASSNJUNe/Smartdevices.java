class Smartdevice {
    String brand;
    String model;
Smartdevice(String b, String m) {
    this.brand=b;
    this.model=m;
}
void turnon(){
    System.out.println("Turned on");
}
void turnoff(){
    System.out.println("Turned off");
}
}
class Smartphone extends Smartdevice{
    Smartphone(String b,String m){
        super(b,m);
    }
    @Override
    void turnon(){
        System.out.println("phone"+brand + " " +model+ "is turned on");
    }
    @Override
    void turnoff(){
        System.out.println("phone"+brand + " " +model+ "is turned off");
    }
}
class Smartwatch extends Smartdevice{
    Smartwatch(String b,String m){
        super(b,m);
    }
    @Override
    void turnon(){
        System.out.println("Wach" +brand + " " +model+ "is turned on");
    }
    @Override
    void turnoff(){
        System.out.println("Watch" +brand + " " +model+ "is turned off");
    }
}
public class Smartdevices {
public static void main(String[] args) {
    Smartdevice s1 = new Smartphone("Generic", "ModelX");
    Smartdevice s2 = new Smartwatch("Apple", "iPhone 13");
    s1.turnon();
    s1.turnoff();
    s2.turnon();
    s2.turnoff();
}
}
