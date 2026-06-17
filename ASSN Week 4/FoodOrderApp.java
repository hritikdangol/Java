class FoodItem{
    private String name;
    private double price;
    FoodItem(String n, double p){
        this.name=n;
        this.price=p;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price = price;
    }
    void displayitem(){
        System.out.println("DISPLAYINGG");
    }
}
class pizza extends FoodItem{
    String size;
    String toppings[];
    pizza(String n,double t, String s, String[] tp){
        super(n,t);
        this.size = s;
        this.toppings = tp;
    }
    @Override
    void displayitem(){
        System.out.println("PIZZA");
        System.out.println("Name:" +getname());
        System.out.println("Price:" +getprice());
        System.out.println("Size:"+size);
        for(int i=0;i<toppings.length;i++){
            System.out.println("Toppings:"+toppings[i]);
        }
    }
}

class burger extends FoodItem{
    boolean cheese;
    String pattytype;
    burger(String n,double t, boolean c, String pt){
        super(n,t);
        this.cheese = c;
        this.pattytype = pt;
    }
    @Override
    void displayitem(){
        System.out.println("BURGER");
        System.out.println("Name:" +getname());
        System.out.println("Price:" +getprice());
        System.out.println("Cheese:"+cheese);
        System.out.println("Patty Type:"+pattytype);
    }
}

class salad extends FoodItem{
    String ingredients[];
    salad(String n,double t, String[] ig){
        super(n,t);
        this.ingredients = ig;
    }
    @Override
    void displayitem(){
        System.out.println("SALAD");
        System.out.println("Name:" +getname());
        System.out.println("Price:" +getprice());
        for(int i=0;i<ingredients.length;i++)
        {
        System.out.println("Ingredients:"+ingredients[i]);
    }
}
}
public class FoodOrderApp{
    public static void main(String [] args){
        pizza p1=new pizza("Cheese Pizza", 800, "Large", new String[]{"cheese","Tomatoes"});
        burger b1 = new burger("Chicken Burger", 250, true, "Chicken");
        String[] ingredients = {"Lettuce", "Tomato"};
        salad s1 = new salad("Garden Salad", 180, ingredients);
        p1.displayitem();
        b1.displayitem();
        s1.displayitem();
    }
}