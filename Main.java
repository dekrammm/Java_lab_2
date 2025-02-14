public class Main extends Ticket {
    public static void main(String[] args) {
        Ticket tik = new Ticket();
        tik.print_mas();
        for (int i = 0; i <= 5; i++) {
            tik.randomize();
            tik.print_mas();
        }
        tik.sorting();
    }
}

