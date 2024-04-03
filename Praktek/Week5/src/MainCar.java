public class MainCar {
    public static void main(String[] args) {
        Cars[] car = {
            new Cars("BMW ", "M2 Coupe", 2016, 6816, 728),
            new Cars("Ford ", "Fiesta ST", 2014, 3921, 575),
            new Cars("Nissan ", "370Z", 2009, 4360, 657),
            new Cars("Subaru ", "BRZ", 2014, 4058, 609),
            new Cars("Subaru ", "Impreza WRX STI", 2013, 6255, 703),
            new Cars("Toyota ", "AE86 Trueno", 1986, 3700, 553),
            new Cars("Toyota ", "86/GT86", 2014, 4180, 609),
            new Cars("Volkswagen ", "Golf GTI", 2014, 4180, 631)    
        };

        Cars cr = new Cars();
        System.out.println("=======================================");
        System.out.println("Top acceleration tertinggi: " + cr.accelerationTertinggi(car, 0, car.length - 1));
        System.out.println("=======================================");
        System.out.println("Top acceleration terendah: " + cr.accelerationTerendah(car, 0, car.length - 1));
        System.out.println("=======================================");
        System.out.printf("Rata-rata top power: %.1f\n", cr.AvgPowers(car));

    }
}