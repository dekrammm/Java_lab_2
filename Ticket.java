public class Ticket {
    private int[] tik;

    public Ticket(){
        tik = new int[49];
        for (int i = 0; i < tik.length; i++){
            tik[i] = i + 1;
        }
    }

    public void print_mas(){
        for (int i = 0; i < tik.length; i++){
            System.out.print(tik[i] + " ");
            if ((i + 1) % 7 == 0) System.out.print("\n");
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

        for (int i = tik.length - 1; i > 0; i--){
            int index = (int) (1 + Math.random() * 49) - 1;
            buf[i] = tik[i];
            int temp = tik[i];
            tik[index] = tik[i];
            tik[i] = temp;
        }
        return tik;
    }
}


