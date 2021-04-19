package try2;

import com.sun.xml.internal.fastinfoset.util.CharArrayString;

import java.util.Arrays;
import java.util.Random;

public class Arrayz {
    public static void main(String[] args) {
//        int [] arrOne = new int[3];
//        arrOne [0] = 3;
//        arrOne [1] = 1;
//        arrOne [2] = 33;
//        for (int i = 0; i < arrOne.length; i++) {
//            System.out.println(" "+arrOne [i]);
//        }
//        int [] arrTwo = {3, 1, 33};
//        System.out.println(Arrays.toString(arrTwo));
//двумерные  массивы

//        int [] [] table = new int[3][4]; //первый индекс указывает на строку второй на столбец
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[i].length; j++) {
//                System.out.print(table [i] [j]+ " ");
//            }
//            System.out.println();


//        }
        Random rand = new Random();
        int [][] arrThree = new int[3][3];
        System.out.print("  ");
        for (int i = 1; i <arrThree[1].length +1 ; i++) {
            System.out.print(i + " ");
        }

        for (int i = 0; i <arrThree.length ; i++) {
            System.out.println();
            System.out.print(i + 1 + "|");

            for (int j = 0; j <arrThree.length ; j++) {
                arrThree[i][j]= rand.nextInt(5);
                System.out.print(arrThree[i][j]+" ");
            }

        }
            }
}
