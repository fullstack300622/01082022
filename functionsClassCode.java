import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        printHelloWorld();
//        sayHelloToClass();
//        String name = "Beni";
//        sayHelloTo(name);
//        printNameAndAge(33,"Beni");

//        printSum(10,20);
//        int x = sum(10,20);
//        System.out.println(x);

        String name = returnNameBeni();
        System.out.println(name);

    }

    private static String returnNameBeni(){
//        String beniName= "Beni";
        return "Beni";
    }

    private static int sum(int a,int b){
        int sum =a+b;
        return (sum);
    }

    private static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    private static void printNameAndAge(int age, String name) {
        System.out.println("hello " + name + " your age is " + age);
    }

    private static void sayHelloTo(String s) {
        System.out.println("Hello " + s);
    }

    private static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static void sayHelloToClass() {
        System.out.println("Hello class");
    }


}
