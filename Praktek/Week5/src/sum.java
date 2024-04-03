public class sum {
    String nama;
    private double[] keuntunganBulanan;
    public sum(String nama, int jmlbln){
        this.nama = nama;
        this.keuntunganBulanan = new double[jmlbln];
    }

    public void keuntunganBulanan(int bulan, double keuntungan){
        keuntunganBulanan[bulan - 1] = keuntungan;
    }
    public double hitungTotalKeuntungan(){
        double total = 0;
        for(double keuntungan : keuntunganBulanan){
            total += keuntungan;
        }
        return total;
    }

    public double hitungTotalKeuntunganBruteForce(){
        int total = 0;
        for(double keuntungan : keuntunganBulanan){
            total += keuntungan;
        }
        return total;
    }

    public double hitungTotalKeuntunganDivide(){
        return hitungTotalKeuntunganDivide(keuntunganBulanan, 0, keuntunganBulanan.length - 1);
    }
    private double hitungTotalKeuntunganDivide(double[]arr, int l, int r){
        if(l == r){
            return arr[l];
        } else if (l < r){
            int mid = (l + r)/2;
            double lsum = hitungTotalKeuntunganDivide(arr, l , mid -1);
            double rsum = hitungTotalKeuntunganDivide(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
