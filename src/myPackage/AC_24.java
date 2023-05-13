package myPackage;

class Pen{
    String colour;
    String type;

    void printColour(){
        System.out.println(colour);
    }
}
class Student{
    String name;
    int age ;
    void printInfo(){
        System.out.println(this.name+" "+this.age);
    }
}
class CompileTimePolymorphism{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    CompileTimePolymorphism(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Shape{
    public String name;
    int age;
    protected String gender;
    private String password;
    //Getters
    public String getPassword(){
        return this.password;
    }
    //Setters
    public  void setPassword(String pass){
        this.password=pass;
    }
}
public class AC_24 {
    public static void main(String[] args) {
        Shape sh = new Shape();
        sh.name="khizar";
        sh.age=10;
        sh.gender="Male";
        sh.setPassword("kh123");
        System.out.println(sh.getPassword());
//        Pen pen1 = new Pen();
//        Pen pen2 = new Pen();
//        pen1.colour = "blue";
//        pen2.colour = "black";
//        pen1.printColour();
//        pen2.printColour();
//        Student s1 = new Student();
//        s1.name="khizar";
//        s1.age=21;
//        s1.printInfo();
//
//        CompileTimePolymorphism ct = new CompileTimePolymorphism("khizar",21);
//        ct.printInfo(23);
    }
}
