package try2;

import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        Scanner scanOne = new Scanner(System.in);
//        int a = scanOne.nextInt();//чтение целого числа в переменную
//        String b = scanOne.nextLine();//чтение введённой  строки
//        String c = scanOne.next();//чтение слова до пробела
//        scanOne.close();//закрытие сканер
        System.out.println("insert digit: ");
        int a = scanOne.nextInt();
        System.out.println(" "+ a*2);
        scanOne.close();
    }
}
