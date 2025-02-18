import java.util.Scanner;

public class Ticket {
    private int[] tik;
    public Ticket(){
        tik = new int[49];
        for (int i = 0; i < tik.length; i++){
            tik[i] = i + 1;
        }
    }
    public void print_mas(){
        System.out.println("______________________");
        for (int i = 0; i < tik.length; i++){
            if (tik[i] == 0) System.out.print("| X");
            else System.out.printf("|%2d", tik[i]);
            if ((i + 1) % 7 == 0) {
                System.out.println("|\n----------------------");
            }
        }
        System.out.println("\n");
    }
    public int[] randomize(){
        int a = (int) (1 + Math.random() * 49);
        tik[a-1] = 0;
        return tik;
    }
    public int[] sorting(){
        for (int i = 0; i < tik.length; i++){
            int pos = i;
            int min = tik[i];
            for (int j = i + 1; j < tik.length; j++){
                if (tik[j] < min){
                    pos = j;
                    min = tik[j];
                }
            }
            tik[pos] = tik[i];
            tik[i] = min;
        }
        return tik;
    }
    public int[] shuffle_arr(){
        int[] buf = new int[49];
        for (int i = 0; i < tik.length; i++){
            buf[i] = tik[i];
        }
        for (int i = tik.length - 1; i > 0; i--){
            int index = (int) (1 + Math.random() * 49) - 1;
            if (tik[index] == buf[i]) continue;
            else {
                int temp = tik[i];
                tik[index] = tik[i];
                tik[i] = temp;
            }
        }
        return tik;
    }

    public void menu(){
        int NUM;
        while (true){
            System.out.println("Выберите действие:\n" +
                    "1. Исключить из билета 6 случайных чисел\n" +
                    "2. Отсортировать числа в билете\n" +
                    "3. Показать билет\n" +
                    "0. Выйти из программмы\n");
            Scanner scanner = new Scanner(System.in);
            NUM = scanner.nextInt();
            if (NUM == 0) break;
            switch (NUM){
                case 1:
                    for (int i = 0; i <= 5; i++) {
                        randomize();
                    }
                    break;
                case 2:
                    shuffle_arr();
                    break;
                case 3:
                    print_mas();
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }
}


