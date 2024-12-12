import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        
        System.out.println("Deret angka dari 1 hingga " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Jumlah deret angka dari 1 hingga " + N + " adalah: " + sum);

        double rataRata = (double) sum / N;
        System.out.println("Rata-rata deret angka dari 1 hingga " + N + " adalah: " + rataRata);

        /* Pekerjaan anda berakhir sini */
        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
