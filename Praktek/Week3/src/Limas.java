
public class Limas {
    int tinggi;
    int sisiAlas;

    Limas(){
        
    }

    double hitungVolumeLimas(){
        double vol = 0;
        double luasAlas = sisiAlas*sisiAlas;
       
        vol = (1.0/3.0)*luasAlas*tinggi;
        return vol;
    }

    double hitungLuasPermukaanLimas(){
        double lp = 0;
        double luasAlas = sisiAlas*sisiAlas;
        double sisiMiring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(0.5*sisiAlas, 2));
        double luasSelimut  = 4* (0.5*0.5*sisiAlas*sisiMiring);
        lp = luasAlas+luasSelimut;
        return lp;
    }
}
