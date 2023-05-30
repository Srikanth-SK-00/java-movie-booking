package booking;

import java.util.*;

public class reg {
    static String location(int n) {
        switch (n) {
            case 1:

                return ("chennai");
            case 2:
                return ("madurai");

            case 3:
                return ("coimbature ");

        }
        return null;

    }

    static String theater(int city) {
        switch (city) {
            case 1:

                return ("pvr");

            case 2:
                return ("inox");

            default:
                return ("spi");

        }

    }

    static String timming(int time) {
        switch (time) {
            case 1:

                return ("10:00");

            case 2:
                return ("12:00");

            case 3:
                return ("3:00");

            default:
                return ("6:00");

        }

    }

    static void login(int[] array) {

        Scanner sc = new Scanner(System.in);
        int u = 0;
        String username[] = new String[3];
        String password[] = new String[3];

        System.out.println("1.login");
        System.out.println("2.signup");
        int q = sc.nextInt();
        switch (q) {
            case 1:
                System.out.print("Enter username: ");
                username[u] = sc.next();
                u++;

                System.out.print("Enter password: ");
                password[u] = sc.next();
                u++;

                break;
            case 2:

                System.out.print("Enter username: ");
                username[u] = sc.next();
                u++;

                System.out.print("Enter password: ");
                password[u] = sc.next();
                u++;
                System.out.print("Enter Email: ");
                String mailString = sc.nextLine();

                break;
        }
        System.out.println("  ");
        System.out.println("------Registeration Sucessfull------ ");
        System.out.println(" ");
        System.out.println("1.book tickets");
        System.out.println("2.history");
        int ment = sc.nextInt();
        switch (ment) {
            case 1:
                book(array);
                break;

            default:
                System.out.println("****** No history found ******");
                System.out.println(" ");
                System.out.println("2.book ticket");
                System.out.println("3.logout");
                System.out.println("4.exit");
                int we = sc.nextInt();
                switch (we) {
                    case 2:
                        book(array);

                        break;
                    case 3:
                        login(array);
                    default:
                        break;
                }

                break;
        }

    }

    static void book(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("1. Chennai");
        System.out.println("2. Madurai");
        System.out.println("3. Coimbature");
        System.out.print("Select location: ");

        int n = sc.nextInt();
        System.out.println(location(n) + " selected");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("1. PVR");
        System.out.println("2. INOX");
        System.out.println("3. SPI");
        System.out.print("select theater: ");
        int city = sc.nextInt();
        System.out.println(theater(city) + " selected");
        System.out.println("  ");

        System.out.println("  ");
        System.out.println("1. 10:00            2.  12:00");
        System.out.println("3. 3:00             4.  6:00");
        System.out.print("select timming: ");
        int time = sc.nextInt();
        System.out.println(timming(time) + " show selected");
        System.out.println("  ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 26)
                System.out.println("  ");
            if (array[i] != -1)
                System.out.print(array[i] + "  ");
            else
                System.out.print("  ");

            if (array[i] % 5 == 0) {
                System.out.println("  ");
            }

        }
        System.out.print("enter no seat you want: ");
        int seat = sc.nextInt();

        System.out.println();
        int a[] = new int[seat];
        for (int i = 0; i < seat; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (a[i] == array[j]) {
                    array[j] = -1;
                }
            }
        }

        System.out.println("1.UPI id");
        System.out.println("2. debit card ");
        System.out.print("choose pament method: ");
        int pay = sc.nextInt();
        switch (pay) {
            case 1:
                System.out.print("ENTER UPI ID: ");
                String str = sc.next();
                break;

            default:
                System.out.println("Enter card details: ");
                System.out.print("  ");
                System.out.print("card name: ");
                String cardname = sc.next();
                System.out.print("card no: ");
                String cardno = sc.next();
                System.out.print("ccv: ");
                String cardccv = sc.next();
                break;
        }
        System.out.println("****PAYMENT SUCESSFULL*****");

        System.out.println("     ");
        System.out.println(">>>>>>>>>> Menu >>>>>>>>>>");
        System.out.println("1.history");
        System.out.println("2.book another ticket");
        System.out.println("3.logout");
        System.out.println("4.exit");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("location : " + location(n));
                System.out.println("theater  : " + theater(city));
                System.out.println("timming  :" + timming(time));
                System.out.println("seats    :" + seat);
                System.out.print("  ");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + "  ");
                }
                System.out.println();
                ;
                System.out.println("2.book another ticket");
                System.out.println("3.logout");
                System.out.println("4.exit");
                int as = sc.nextInt();
                switch (as) {
                    case 2:
                        book(array);
                        break;
                    case 3:
                        login(array);
                    default:

                        break;
                }

                break;
            case 2:
                book(array);
            case 3:
                login(array);

            default:

                break;
        }
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        login(array);

    }

}
