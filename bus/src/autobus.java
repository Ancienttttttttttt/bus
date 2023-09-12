import java.util.Scanner;

public class autobus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int mesto = 0;
        String fio = null;
        String command = null;
        String[] mesta = new String[8];
        for (int i = 0; i < mesta.length; i++) {
            mesta[i] = String.valueOf(i+1);
        }
        while (true) {
                System.out.println("Введите команду 'Выберите место' или 'Пересадка пассажира'");
                command = scanner.nextLine();
            for (int i = 0; i < mesta.length; i++) {
                System.out.println(mesta[i] + "            " + mesta[i + 1]);
                i++;
            }
                if (command.equals("Выберите место")) {
                    System.out.println("Место №");
                    mesto = scanner.nextInt();
                    fio = scanner1.nextLine();
                    mesta[mesto - 1] = mesto + " " + fio;

                }
                if (command.equals("Пересадка пассажира")) {
                    System.out.println("Пересадка на место №");
                    mesta[mesto - 1] = String.valueOf(mesto);
                    mesto = scanner.nextInt();
                    fio = scanner1.nextLine();
                    mesta[mesto - 1] = mesto + " " + fio;
                }
                System.out.println();
        }
    }
}
