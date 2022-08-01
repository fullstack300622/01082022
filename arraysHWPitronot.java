import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        double[] doubleArray = new double[]{0.9, -6.5555, 3.24, 10.11, 20.35};
//        Scanner s = new Scanner(System.in);
//        System.out.println(doubleArray.length);

        //print the first number
//        double firstIndexValue = doubleArray[0];
//        System.out.println(firstIndexValue);

//        //print the middle value
//        System.out.println(doubleArray[2]);
//
//        //Print the last number
//        System.out.println(doubleArray[doubleArray.length - 1]);

        //write a for loop which prints all the element in the array
//        for (int i = 0; i < doubleArray.length; i++) {
//            System.out.println(doubleArray[i]);
//        }

//    //write a for loop which prints all the element in the array in reverse
//        for (int i = doubleArray.length - 1; i >= 0; i--) {
//            System.out.println(doubleArray[i]);
//        }

//       use scanner to read a double number from the user.
//       print all the elements in the array which are bigger than the user-number
//        double[] doubleArray = new double[]{0.9, -6.5555, 3.24, 10.11, 20.35};
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("please enter number");
//        double userInputNum = s.nextDouble();
//        for (int i = 0; i < doubleArray.length; i++) {
//            if(doubleArray[i]>userInputNum){
//                System.out.println(doubleArray[i]);
//            }
//        }

//        -- 2. create an array A of integer numbers with these numbers: 4, 10, 20, 40, 1000
//-- 2.1. create a second array B with these numbers: 0, 0, 0, 0, 0
//-- 2.2. copy all elements from A to B

//        int[] A = {4, 10, 20, 40, 100};
//        int[] B = new int[]{0, 0, 0, 0, 0};
//
//        for (int i = 0; i < B.length; i++) {
//            B[i] = A[i];
//            System.out.println(B[i]);
//        }

        //print
//        for (int i = 0; i < B.length; i++) {
//            System.out.println(B[i]);
//        }

//check if the array is a polindrom
        int[] array = {1, 3, 5, 8, 8, 5, 3, 1};
        int rightPointer = array.length / 2;  //4
        int leftPointer = (array.length / 2) - 1; //3

        boolean isPolindrom = true;
        if (array.length % 2 == 0) {
            for (int i = rightPointer; i < array.length; i++, leftPointer--) {
                if (array[i] == array[leftPointer]) {
                    //good
                } else {
                    isPolindrom = false;
                }
            }
        } else {
            isPolindrom = false;
        }

        if (isPolindrom){
            System.out.println("Polyndrom");
        }else{
            System.out.println("Not Polyndrom");
        }


    }
}
