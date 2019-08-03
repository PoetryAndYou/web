package test;

/**
 * @author rui
 * @create 2019-08-01 14:51
 */
public class s {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (true==(y = true))) {
            z++;
            System.out.println(z);
        }
        if ((x = false) || (++z == 43)) {
            z++;
        }
        System.out.println("z = " + z);
    }
}
