class Student 
{    //class//
        String name;
        int age;
        void Displayinfo()  //method(what it can be done)//
        {
              System.out.println("Name: " + name);
              System.out.println("Age: " + age);
        }
}   
        public class Displayrecord {
         public static void main (String[] args) {
        Student s1 = new Student();
        s1.name = "Hrithik Dangol";
        s1.age = 20;
        s1.Displayinfo();//function call//
    }
    
}
