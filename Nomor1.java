import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        int jumlahGanjil = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }

        System.out.println("Jumlah bilangan ganjil dari 1 hingga " + N + " adalah " + jumlahGanjil);

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
