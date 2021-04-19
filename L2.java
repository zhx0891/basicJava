package try2;

public class L2 {
    public static void main(String[] args) {
        //switc();
        //forik();
        //forich();
        //forik4forik();
        //white();
    }

    public static void switc() {
        int a = 5;
        switch (a) {
            case 10:
                System.out.println("\'a= 10");
                break;
            case 0:
                System.out.println("\'a= 0");
                break;
            case 1:
                System.out.println("\'a= 1");
                break;
            default:
                System.out.println("ни один из вариантов не подошёл'");
        }
    }

    public static void forik() {
        for (int i = 0; i < 10; i++) { //здесь (управляющая переменная; условие цикла; действие с переменной)
            if (i > 5) {
                break;
            }
            System.out.println("i= " + i);

        }
    }

    public static void forich() {
        String [] sn ={"1", "2", "3", "4", "5"};
        for (String i : sn) {
            System.out.print(i + " ");
        }

    }

    private static void forik4forik (){
        for (int i = 1; i <= 9 ; i++) {
            System.out.println();
            for (int j = 1; j <= 9 ; j++) {
                System.out.print(i*j+" ");
            }

        }
    }

    public static void white () {
        int i = 10;
        int j = 0;
        while (i != 0) {
            System.out.println(i);
            i--;
        }
        do {
            j++;
            System.out.println(j);
        }
        while (j != 10) ;

    }


    }
