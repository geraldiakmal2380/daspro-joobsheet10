import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        //inisialisasi dan deklarasi
        Scanner mlebu = new Scanner(System.in);
        int[][] nilai = new int[10][6];
        int nilai_pengguna_yg_masuk;
        //disini mulai loopingnya
        for (int i=0;i<10;i++){
            System.out.println("Selamat datang pelanggan ke-"+(i+1));
            
            for(int j=0;j<6;j++){
                while (true) {
                    System.out.print("Bagaimana pengalaman anda menggunakan siakad(1-5):");
                    nilai_pengguna_yg_masuk = mlebu.nextInt();

                    if (nilai_pengguna_yg_masuk<1 || nilai_pengguna_yg_masuk>5){
                        System.out.println("Masukan angka dari 1-5 ajah");
                    }
                    else{
                        nilai[i][j] = nilai_pengguna_yg_masuk;
                        System.out.printf("%s \n%d %d %d %d %d %d\n","pelanggan ke-"+(i+1),nilai[i][0],nilai[i][1],nilai[i][2],nilai[i][3],nilai[i][4],nilai[i][5]);
                        break;
                    }
                }
                mlebu.close();
               
                
            }
        }
    }
}
