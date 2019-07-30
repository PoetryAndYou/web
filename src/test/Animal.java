package test;

public abstract class Animal {
    public abstract void eat();

    float a = 1.3f;

    public abstract void sleep();

}
/*
1/1+1/2+1/3!+1/20!
1.7182818284590455
1.7182818284590455
1.7182818284590455
 */


class test {
    static int num = 0;

    public static void main(String[] args) {
        int i = 1;
        double sum = 0;
        while (i <= 20) {
            double x = f(i);
            sum += 1 / x;
            System.out.println(sum + " " + i);
//            System.out.println(x);

            i++;
        }
        System.out.println(sum);
    }

    static double f(int i) {
        if (i == 1) {
            return 1;
        } else {

            return f(i - 1) * i;
        }

    }

}

class test1 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            double x = 1;
            for (int j = 1; j <= i; j++) {
                x *= j;
            }
            sum += 1 / x;
        }
        System.out.println(sum);
    }


}

class test2 {
    public static void main(String[] args) {
        double x = 1;
        double sum = 0;

        for (int i = 1; i <= 20; i++) {
            x *= i;
            sum += 1 / x;
        }
        System.out.println(sum);
    }
}

