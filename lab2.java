import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите значение x:");
        double x = input.nextDouble();

        System.out.println("Введите значение a:");
        double a = input.nextDouble();

        System.out.println("Введите значение b:");
        double b = input.nextDouble();


        double result1;
        if (x <= 3) {
            double insideLog = Math.abs(x);
            result1 = b + 2 * Math.log(insideLog);
        } else {
            result1 = (x * x) / (x * x + a);
        }
        System.out.println("Результат для функции 1: " + result1);


        double result2;
        if (x > 0) {
            result2 = a + Math.pow(Math.E, -x);
        } else {
            result2 = 2 / Math.cos(b * x + 1);
        }
        System.out.println("Результат для функции 2: " + result2);


        double result3;
        if (x <= 1) {
            result3 = 1 / (a * a + x * x);
        } else {
            double insideLog = Math.abs(x);
            result3 = b * Math.log(insideLog);
        }
        System.out.println("Результат для функции 3: " + result3);


        double result9;

        if(x >=2) {
            result9 = Math.sqrt(1 + x * Math.sqrt(a * x));
        } else {
            result9 = a * Math.sin(b * x) + 3;
        }

        System.out.println("Результат для функции 4: " + result9);


        double result10;

        if(x <= 0) {

            result10 = Math.sqrt(Math.pow(Math.E, 2 * x -b) - 1);

        } else {
            result10 = 1 / (x * x + a);
        }

        System.out.println("Результат для функции 5: " + result10);



        double result11;

        if(x > 4) {
            result11 = Math.sqrt(a + Math.sin(x));

        } else {

            result11 = Math.tan(b* x);

        }

        System.out.println("Результат для функции 6: " + result11);

        input.close();
    }
}