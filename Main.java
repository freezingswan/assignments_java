class Student{
    String name;
    int age;
    // Default Constructor
    // Student(){
    //    name="Default Name";
    //    age=18;
    // }
    // Parameterized constructor
    Student(String n, int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Name: "+name+", Age: "+ age);
    }
}
public class Main {
    public static void main(String[] args){
        Student student1= new Student("Alice",20);
        student1.display();
    }
}