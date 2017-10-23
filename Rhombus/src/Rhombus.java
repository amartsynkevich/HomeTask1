import java.util.Scanner;
import java.lang.String;


public class Rhombus {
    public static void main(String[] args) {
        int size = 0;

        Scanner Count = new Scanner(System.in);
        {
            System.out.println("Введите длину ребра ");
            size = Count.nextInt();

            for (int v = -(size - 1); v <= size - 1; v++) {
                for (int h = -(size - 1); h <= size - 1; h++) {
                    if (-h - v == size - 1 ||
                            -h + v == size - 1 ||
                            h - v == size - 1 ||
                            h + v == size - 1) {

                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print('\n');
            }
        }
    }
}


