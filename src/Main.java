import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        1. ნატურალურ რიცხვს ეწოდება პოლიდრომი, თუ ამ რიცხვში ციფრების შებრუნებული რიგით ჩაწერის
//        შემდეგ რიცხვის სიდიდე არ შეიცვლება. მაგ 121, 13431 და ა.შ. აჩვენეთ შეტანილი ნატურალური
//        რიცხვი არის თუ არა პოლიდრომი.

        int number, lastIndex , reverse = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for check polydrome : ");

        number = sc.nextInt();

        int saveNumber = number;

        while (number != 0){
            lastIndex = number %10;
            reverse = reverse * 10 + lastIndex;
            number = number / 10;
        }

        if(reverse == saveNumber){
            System.out.println("this number is polydrome.");
        }
        else if (reverse != saveNumber){
            System.out.println("this number is not polydrome.");
        }




//        ----------------------------------------------------------------------------------




 //        ----------------------------------------------------------------------------------


//3. შეიტანეთ მთელი დადებითი რიცხვი, დაბეჭდეთ რიცხვის შებრუნებული რიგის გაორკეცებული
//        ნამრავლი. გაითვალისწინეთ ბოლოში ნულების არსებობა.

        int number2, remainder, reverse2 = 0;

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter any number : ");

        number2 = sc2.nextInt();

        while (number2 !=0){
            remainder = number2 % 10;
            reverse2 = reverse2 * 10 + remainder;
            number2 = number2 / 10;
        }

        int gaorkecebuli = reverse2 * reverse2;

        System.out.println("shebrunebuli gaorkecebuli ricxvis namravli : " + gaorkecebuli);



//        ----------------------------------------------------------------------------------


//        4. განსაზღვრეთ 6x5 ნამდვილი ტიპის მატრიცა. ელემენტებს მიანიჭეთ შემთხვევითი მნიშვნელობები [a;b]
//        (a და b მთელი რიცხვებია). დაალაგეთ კლებადობით მატრიცის პირველი სვეტი, მიღებული პირველი
//        სვეტის შესაბამისად გადაანაცვლეთ სტრიქონები, დაბეჭდეთ თავდაპირველი და მიღებული
//        მატრიცები.




        Random r = new Random();
        int[][] matrix = new int[6][5];

        System.out.println("\n");
        System.out.println("tavdapirveli matrica");

        for (int i = 0 ; i < 6; i++){
            for (int j = 0 ; j < 5 ; j++){
                matrix[i][j] = r.nextInt(20);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
        System.out.println("matricis pirveli rigi");


        for (int col = 0; col < 5; col++){
            System.out.println(matrix[0][col]);
        }




//        ----------------------------------------------------------------------------------



//        5. განსაზღვრეთ 100 ელემენტიანი მთელი ტიპის მასივი. ელემენტებს მიანიჭეთ შემთხვევითი
//        მნიშვნელობები [0; 99]-შუალედიდან. დათვალეთ რამდენი ელემენტია მის ინდექსზე მეტი.


        int myArray [] = new int[100];

        Random rd = new Random();

        int count = 0;

        for (int i = 0 ; i < myArray.length; i++){
            myArray[i] = rd.nextInt(0,99);

            while (myArray[i] > i){
                System.out.println(myArray[i]);
                count++;
                break;
            }
        }

        System.out.println("mis indeqsze metia " + count + " elementi");




    }
}