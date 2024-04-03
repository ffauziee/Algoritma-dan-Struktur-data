public class Cars {
    String merek, tipe;
    int tahun, top_acceleration, top_power;

    Cars(String merek, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merek = merek;
        this.tahun = tahun;
        this.tipe = tipe;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    Cars (){

    }

    int accelerationTertinggi (Cars[]cars, int klm1, int klm2) {
        if(klm1 == klm2){
            return cars[klm1].top_acceleration;
        }else if(klm1 < klm2){
            int mid = (klm1 + klm2) / 2;
            int klm1max = accelerationTertinggi(cars, klm1, mid);
            int klm2max = accelerationTertinggi(cars, mid + 1, klm2);

            if(klm1max > klm2max){
                return klm1max;
            }else{
                return klm2max;
            }
        }
        return -1;
    }
    int accelerationTerendah (Cars [] cars, int klm1, int klm2){
        if (klm1 == klm2) {
            return cars[klm1].top_acceleration;
        } else if (klm1 < klm2) {
            int mid = (klm1 + klm2) / 2;
            int klm1min = accelerationTerendah(cars, klm1, mid);
            int klm2min = accelerationTerendah(cars, mid + 1, klm2);
           
            if (klm1min < klm2min) {
                return klm1min;
            } else {
                return klm2min;
            }
        }
        return -1;
        
    }
    
    double AvgPowers (Cars [] cars){
        double total = 0;
        for (Cars car : cars) {
            total += car.top_power;
        }
        return total/cars.length;
    }
}