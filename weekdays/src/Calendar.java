import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner Days = new Scanner(System.in);
        String day;
        {
            System.out.println("Введите число от 1 до 7");
            day = Days.next();
            switch (day) {
                case "1":
                    System.out.println("Понедельник");
                    break;
                case "2":
                    System.out.println("Вторник");
                    break;
                case "3":
                    System.out.println("Среда");
                    break;
                case "4":
                    System.out.println("Четверг");
                    break;
                case "5":
                    System.out.println("Пятница");
                    break;
                case "6":
                    System.out.println("Суббота");
                    break;
                case "7":
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Введено неверное число");
                    break;

            }
        }
    }
}
