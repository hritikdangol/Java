class Device {
    String deviceName;

    Device(String dn) {
        this.deviceName = dn;
    }
    void operate() {
        System.out.println("Displayinggg");
    }
}
class Light extends Device {
    Light(String dn) {
        super(dn);
    }
    @Override
    void operate() {
        System.out.println(deviceName + ": Light is turned ON");
    }
}
class Thermostat extends Device {

    Thermostat(String dn) {
        super(dn);
    }
    @Override
    void operate() {
        System.out.println(deviceName + ": Temperature is set");
    }
}

class SecurityCamera extends Device {

    SecurityCamera(String dn) {
        super(dn);
    }
    @Override
    void operate() {
        System.out.println(deviceName + ": Recording started");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        Device[] d1 = new Device[3];
        d1[0] = new Light("Flash");
        d1[1] = new Thermostat("AC");
        d1[2] = new SecurityCamera("Video");
        for (int i = 0; i < d1.length; i++) {
            d1[i].operate();
        }//// two ways to initaializeds the arrays
Device[] d2 = new Device[] { new Light("LED"),new Thermostat("Thermometer"),  new SecurityCamera("Screen") };
 for (int i = 0; i < d2.length; i++) {
            d2[i].operate();
    }
}
}