public class kerucut {
    int jariJarikrc;
    int sisiMiring;

    kerucut(){
        
    }

    double hitungVolumekrc(){
        double vol = 0;
        double luasAlas = 3.14*jariJarikrc*jariJarikrc;
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2)+ Math.pow(jariJarikrc, 2));

        vol = (1.0/3.0)*luasAlas*tinggi;
        return vol;
    }

    double hitungPermukaankrc(){
        double lp = 0;
        lp = 3.14*jariJarikrc*(jariJarikrc+sisiMiring);
        return lp;
    }
}
