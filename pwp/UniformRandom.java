import java.lang.Math;

public class UniformRandom {
    public static void main(String[] args) {
        double[] random = new double[5];
        double sum = 0.0;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        
        for(int i = 0; i < 5; i++) {
	    random[i] = Math.random();
            sum += random[i];
            System.out.print(random[i] + " ");
            min = Math.min(min,random[i]);
            max = Math.max(max,random[i]);
        }
        System.out.println("");
        double avg = sum / 5;
        System.out.println("Average = " + avg);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }
}
