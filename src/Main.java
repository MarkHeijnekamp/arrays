import java.util.*;
public class Main {

    public static void main(String[] args)
    {

    int[] getallen = new int[5];

        getallen[0] = 678976543;
        getallen[1] = 456788765;
        getallen[2] = 45678;
        getallen[3] = 423354;
        getallen[4] = 67543;

    int[] lijstjegetallen = { 13,543,5675,567};

        System.out.println(Arrays.toString(lijstjegetallen));


        lijstjegetallen = Arrays.copyOf( lijstjegetallen, lijstjegetallen.length + 1 );

   Scanner input = new Scanner(System.in);

   lijstjegetallen[lijstjegetallen.length - 1] = input.nextInt();

        System.out.println(Arrays.toString(lijstjegetallen));

    }
}
