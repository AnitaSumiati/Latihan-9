package randomnumber;

import java.util.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class Random {

    public static void main(String[] args) {

        int tebakan = (int) (Math.random() * 10);
        while (true) {

            JOptionPane.showMessageDialog(null, "Anda Memasuki Kawasan Game Tebak Angka\n");
            JOptionPane.showMessageDialog(null, "Anda Hanya Memiliki Tiga kali kesempatan");
            for (int kesempatan = 2; kesempatan >= 0; kesempatan--) {
                String input = JOptionPane.showInputDialog("Silahkan masukan tebakan angka (0-10):");
                int angka = Integer.parseInt(input);
                if (kesempatan == 0) {
                    JOptionPane.showMessageDialog(null, "Maaf ...\n\nAnda Kalah ");
                    break;
                }
                if (angka == tebakan) {
                    JOptionPane.showMessageDialog(null, "Selamat ....\n\nAnda Menang Cuy");
                    break;
                } else if (angka < tebakan) {
                    JOptionPane.showMessageDialog(null, "Silahkan masukan angka yang lebih besar" + " Kesempatan Anda Berkurang,Sisa Kesempatan " + kesempatan, "PESAN", 2);
                } else {
                    JOptionPane.showMessageDialog(null, "Silahkan masukan angka yang lebih kecil" + " Kesempatan Anda Berkurang,Sisa Kesempatan " + kesempatan, "PESAN", 2);
                }
            }
            int option = JOptionPane.showConfirmDialog(null, "Mau Mencoba Game Ini Kembali ?");
            if (option == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Terimakasih Telah Mencoba Game Tebak Angka");
                System.exit(0);

            }
        }
    }
}
