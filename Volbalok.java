package tugas02;

/**
 *
 * @author Ni Kadek Juni Antari
 * 2201010172
 */

public class Volbalok {
    private double panjang, lebar, tinggi, vol;

    public Volbalok(double Pj, double Lb, double Tg){
        panjang = Pj;
        lebar = Lb;
        tinggi = Tg;
    }

    Volbalok(double nvol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPANJANG (double nVAL){
        this.panjang = nVAL;
        panjang = nVAL;
    }
    public double getPANJANG(){
        return panjang;
    }
    public void setLEBAR (double nVAL){
        this.lebar = nVAL;
        lebar = nVAL;
    }
    public double getLEBAR(){
        return lebar;
    }
    public void setTINGGI (double nVAL){
        this.tinggi = nVAL;
        tinggi = nVAL;
    }
    public double getTINGGI(){
        return tinggi;
    }
    void Volbalok(){
        vol = (this.panjang*this.lebar*this.tinggi);
    }
    public double getVOL(){
        return vol;
    }
}