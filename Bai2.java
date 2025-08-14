
package bai2;
public class Bai2 {
    public static void main(String[] args) {

        System.out.println("bai 1:");
        System.out.println("(1) " + (1 + 2));
        System.out.println("(2) " + (3.5 + 8));
        System.out.println("(3) " + (1.0 / 2));
        System.out.println("(4) " + (4.5 + 7));
        System.out.println("(5) " + (4 * 5 + 1));
        System.out.println("(6) " + (20 % 3 + 2 - 7));

    
        System.out.println("bai 21: ");
        int x = 1;
        int y = x + ++x - x-- - x++ + x - x--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

 
        System.out.println("bai 22: ");
        x = 1;
        int z = x - x-- - x++ + --x - x + x-- + x;
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }
}
