public class Laptop {
    String brand;
    int ramSize;  
    int storage;   

    Laptop(String b, int rs, int s) {
        this.brand = b;
        this.ramSize = rs;
        this.storage = s;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ramSize + " GB");
        System.out.println("Storage: " + storage + " GB");
    }
}

 class Laptopspecs {
    public static void main(String[] args) {
        Laptop[] L= new Laptop[3];
        L[0] = new Laptop("Dell", 8, 512);
        L[1] = new Laptop("HP", 4, 256);
        L[2] = new Laptop("Lenovo", 16, 1024);
      for (int i=0;i<L.length;i++) {
            if (L[i].ramSize >= 8) {
                L[i].display();
                System.out.println();
            }
        else{
            System.out.println("No laptops with 8GB or more RAM available.");
        }
    }
}
}