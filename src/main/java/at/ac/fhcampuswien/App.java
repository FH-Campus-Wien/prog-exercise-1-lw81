package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        long c = 80L;
        int cnew = (int) c;
        float d = 44e-1f;
        int dnew = (int) d;
        double e = 5.5f;
        int enew = (int)e;
        double f = 8.88e1;
        int fnew = (int)f;
        double g = 99.9;
        int gnew = (int)g;
        int h = 012;
        int sum = (a+b+cnew+dnew+enew+fnew+gnew+h);
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int sum = i+j;

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        y = x + y;
        x = y - x;
        y = y - x;
        System.out.print(
                "Before Swap:" + System.lineSeparator() +
                "x: " +
                "y: " +
                "After Swap:" + System.lineSeparator() +
                "x: " + x + System.lineSeparator() +
                "y: " + y + System.lineSeparator());

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.print("n1: " +
                    "n2: " +
                    "n1 > n2" + System.lineSeparator());

        }else if (n2 > n1){
            System.out.print("n1: " +
                    "n2: " +
                    "n2 > n1" + System.lineSeparator());
        }else if(n1 == n2) {
            System.out.print("n1: " +
                    "n2: " +
                    "n1 == n2" + System.lineSeparator());
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        int rev = scanner.nextInt();
        if (rev < 0 || rev >= 100000){
            System.out.print("Enter annual Revenue: " +
                    "Invalid Revenue" + System.lineSeparator());
        }else if (rev >= 0 && rev < 20000 ){
            System.out.print("Enter annual Revenue: " +
                "Poor Sales Revenue" + System.lineSeparator());
        }else if (rev >= 20000 && rev <50000) {
            System.out.print("Enter annual Revenue: " +
                    "Average Sales Revenue" + System.lineSeparator());
        }else if (rev >= 50000 && rev < 80000) {
            System.out.print("Enter annual Revenue: " +
                    "Good Sales Revenue" + System.lineSeparator());
        }else if (rev >= 80000 && rev < 100000) {
            System.out.print("Enter annual Revenue: " +
                    "Excellent Sales Revenue" + System.lineSeparator());
        }

        }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        int cClass = scanner.nextInt();
        switch (cClass){
            case 1:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        int lyear = scanner.nextInt();

        if (lyear%4 == 0 && lyear%400 == 0){
            System.out.println("Year: " + "Leapyear");
        }else if(lyear%100 == 0){
            System.out.println("Year: " + "Not a Leapyear");
        }else {
            System.out.println("Year: " + "Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n1 = num%10;
        int n2 = ((num/10)%10)*10;
        int n3 = num/100;
        num = n1*100 + n2 + n3;
        System.out.println("Number: " + num);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}