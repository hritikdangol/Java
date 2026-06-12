class Animal {
    void makesound(){
        System.out.println("Makes a sound");
    }
}
class Cat extends Animal{
    @Override
    void makesound(){
        System.out.println("MEOW");
    }
}
class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("BARK");
    }
}
class Cow extends Animal{
    @Override
    void makesound(){
        System.out.println("MOO");
    }
}
public class Animalsounds{
    public static void main(String[] args){
            Animal[] a1= new Animal[3];
            a1[0]=new Dog();
            a1[1]=new Cow();
            a1[2]=new Cat();
            for(int i=0;i<a1.length;i++)
            {
                a1[i].makesound();
            }
    }
}


    
    
