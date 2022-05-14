import java.util.ArrayList;
import java.util.Scanner;

public class PencatatanPengunjung {
    Scanner input = new Scanner(System.in);

    //     membuat atribut dan array list
    private ArrayList<String> dataUser = new ArrayList<String>();
    private int option;


    //     Method ShowOption digunakan untuk menampilkan daftar aksi yang bisa dipilih oleh user
    public void showOption(){
        System.out.println("==========   *Pilihan Opsi*   ===============");
        System.out.println("1. Input Data Pengunjung");
        System.out.println("2. Tampilkan List Pengunjung");
        System.out.println("3. Keluar");
        System.out.print("Masukan Opsi: ");
        option = input.nextInt();
        System.out.println();
    }

    //     method InputData digunakan untuk melakukan operasi input data yang dimasukan user ke dalam arraylist
    private void InputData(){
        System.out.println("==========   *Input Data Pengunjung*   ==========");
        System.out.println("Masukan Nama Pengunjung: ");
        String df = input.next();
        dataUser.add(df);
    }

    //     method ShowData digunakan untuk mengambil dan menampilkan data yang aada pada arraylist
    private void ShowData(){
        int k = 1;
        System.out.println("==========   *Daftar Pengunjung*   ==========");
        System.out.println("Jumlah Pengunjung = " + dataUser.size());
        System.out.println();
        for (int i = 0; i < dataUser.size(); i++){
            System.out.println( k+i +" "+ dataUser.get(i));
        }
    }

//      method getOptio digunakan untuk menangani inputan opsi dari user

    public void getOption(){
        Boolean quit = false;

        while (!quit){
            int opt = this.option;

            switch (opt){
                case 1:
                    InputData();
                    System.out.println();
                    showOption();
                    break;
                case 2:
                    ShowData();
                    System.out.println();
                    showOption();
                    break;
                case 3:
                    System.out.println("============================");
                    System.out.println("=====   Sampai Jumpa   =====");
                    System.out.println("============================");
                    quit = true;
            }
        }
    }
}
