package try2;

public class hw2 {
    public static void main(String[] args) {
        //System.out.println(first( 2, 5, 7,1));
        //System.out.println(second(4,6));
        //third(0);
        //System.out.println(fourth(-56));
        //fifth("Name:");
    }
    public static int first ( int a, int b, int c, int d){

        return  a * (b + (c / d));
    }

    public static boolean second(int a, int b){
        boolean e;
        if (((a+b)>=10)&&((a+b)<=20)) {
            e=true;
        }else {
            e = false;
        }

        return e;
    }

    public static void third(int a){
        String e;
        if (a < 0){
            System.out.println("число отрицательное");
        }else {
            System.out.println("число положительное");
        }

    }

    public static boolean fourth (int a) {
        boolean e=true;
        if (a > 0) {
            e=false;
        }
        return e ;



    }

    public static void fifth (String n) {
        System.out.println("hi, " + n+" !");

    }
}
