package tugas02;

import java.util.Scanner;

/**
 *
 * @author Ni Kadek Juni Antari
 * 2201010172
 */
public class Tugas02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);

        System.out.print("Nilai Panjang : ");
        double nAlas = dIN.nextDouble();

        System.out.print("Nilai Lebar : ");
        double nLebar = dIN.nextDouble();

        System.out.print("Nilai Tinggi : ");
        double nTinggi = dIN.nextDouble();

        Volbalok Vb = new Volbalok(nAlas, nLebar, nTinggi);

//        LS.setALAS(71);
//        LS.setTINGGI(86);

        Vb.Volbalok();   

        System.out.println("Nilai Panjang : "+ Vb.getPANJANG());
        System.out.println("Nilai Lebar : "+ Vb.getLEBAR());
        System.out.println("Nilai Tinggi : "+ Vb.getTINGGI());
        System.out.println("Jadi Volume Balok : ");
        System.out.println("Volume = Panjang x Lebar x Tinggi");
        System.out.println("     = "+ Vb.getPANJANG() + " x "+ Vb.getLEBAR()+" x "+Vb.getTINGGI());
        System.out.println("     = "+ Vb.getVOL());
    }

}
