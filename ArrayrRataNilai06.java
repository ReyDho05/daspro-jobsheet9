import java.util.Scanner;
/**
 * ArrayrRataNilai06
 */
public class ArrayrRataNilai06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa :");
        int jumlah=sc.nextInt();
        int[] nilaiMhs = new int[jumlah];
        int lulus=0, tdklulus=0;
        double rata2, rata3, total =0, totallulus=0, totaltdk=0;
        for (int i=0;i<nilaiMhs.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]=sc.nextInt();
            if (nilaiMhs[i]>70) {
                lulus++;
                totallulus+=nilaiMhs[i];
            } else{
                tdklulus++;
                totaltdk+=nilaiMhs[i];
            }
        } rata2=totallulus/lulus;
        rata3=totaltdk/tdklulus;
        System.out.println("Rata-rata nilai lulus "+rata2);
        System.out.println("Rata-rata nilai tidak lulus "+rata3);
    }
}