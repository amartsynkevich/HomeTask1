import java.util.Scanner;

public class mamarama
{
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String str;
        {
            System.out.println("Введите текст, который будет выведен в обратном порядке ");
            str = text.nextLine();
            StringBuffer buffer = new StringBuffer(str);
            buffer.reverse();
            System.out.println(buffer);
        }
        {
            System.out.println("Введите текст, слова которого будут выведены построчно ");
            str = text.nextLine();
            String[] Strings = str.split(" ");
            for (int i = 0; i < Strings.length; i++) {
                System.out.println(Strings[i]);
            }
            {
                System.out.println("Введите текст, пробелы в котором будут заменены на звездочки ");
                str = text.nextLine();
                System.out.println(str.replace(' ', '*'));
            }
            {
                System.out.println("Введите текст, символы которого будут переведены в верхний регистр");
                str = text.nextLine();
                System.out.println(str.toUpperCase());
            }
            {
                System.out.println("Введите текст, из которого нужно вывести символы с 5-го по 10-й");
                str = text.nextLine();
                System.out.println(str.substring(4, 10));
            }
        }
    }
}
