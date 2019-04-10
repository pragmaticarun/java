import java.lang.Math;


public class ThreeSort {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Not enough arguments to sort 3 numbers");
            return;
        }

        int []a = new int[3];
        a[0] = Integer.parseInt(args[0]);
        a[1] = Integer.parseInt(args[1]);
        a[2] = Integer.parseInt(args[2]);

        int min = a[0];
        int max = a[0];

        for (int i = 1; i < 3; i++) {
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
        }

        System.out.print(min + " ");
        for (int i = 0; i < 3; i++) {
            if (min != a[i] && max != a[i]) {
                System.out.print(a[i] + " ");
                break;
            }
        }
        System.out.println(max + " ");
    }
}
