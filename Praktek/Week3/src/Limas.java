
public class Limas {
    int tinggiLimas;
    int sisiAlasLimas;

    Limas(){
        
    }

    double hitungVolumeLimas(){
        double vol = 0;
        double luasAlas = sisiAlasLimas*sisiAlasLimas;
       
        vol = (1.0/3.0)*luasAlas*tinggiLimas;
        return vol;
    }

    double hitungLuasPermukaanLimas(){
        double lp = 0;
        double luasAlasLimas = sisiAlasLimas*sisiAlasLimas;
        double sisiMiringLimas = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(0.5*sisiAlasLimas, 2));
        double luasSelimut  = 4* (0.5*0.5*sisiAlasLimas*sisiMiringLimas);
        lp = luasAlasLimas+luasSelimut;
        return lp;
    }
}
