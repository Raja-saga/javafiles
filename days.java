import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day");
        int day = input.nextInt();
/*        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("weekday");
                break;
            case 5:
            case 6:
                System.out.println("weekend days");
                break;
            default:
                System.out.println("invalid");

        }*/

        switch (day){
            case 1,2,3,4-> System.out.println("weekday");
            case 5,6-> System.out.println("weekend");
            default -> System.out.println("Ivalid code values ");
        }

    }

}
