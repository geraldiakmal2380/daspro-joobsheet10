import java.util.Scanner;
public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        int baris,kolom,next;
        String nama;
        char maukeluarya;

        String[][] penonton = new String[4][2];

        while (true) {
            while (true) {
                System.out.println("Silahkan Masukan pilihan anda");
            System.out.println("1.Input data");
            System.out.println("2.Daftar  penonton");
            System.out.println("3.keluar");
            System.out.print("Masukan pilihan(1/2/3):");
            next = mlebu.nextInt();
            if (next == 1){
                System.out.print("Masukan Nama : ");
                nama = mlebu.next();
                System.out.print("Masukan baris : ");
                baris = mlebu.nextInt();
                System.out.print("Masukan kolom : ");
                kolom = mlebu.nextInt();

                penonton[baris-1][kolom-1] = nama;
                break;
            }

            else if (next == 2){
                for (int i=0;i<penonton.length;i++){
                for (int j=0;j<penonton[i].length;j++){
                    System.out.println("Baris ke-"+i+" kolom ke-"+j+" adalah "+penonton[i][j]);
                }
            }
                break;
            }
            else if (next == 3){
                mlebu.close();
                break;
            }
            else{
                System.out.println("Masukan angka yang benar");
            }
            }
            
            System.out.print("input penonton lainnya?(y/n):");
            maukeluarya = mlebu.next().charAt(0);
            if (maukeluarya == 'n'){
                mlebu.close();
                break;
            }
    }
}
}
