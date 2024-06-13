public class transaksiPajak {
    int kode;
    String noTNKB;
    String nama;
    long nominalBayar;
    long denda;

    public transaksiPajak(int kode, String noTNKB, String nama, long nominalBayar, long denda) {
        this.kode = kode;
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
    }

    public void printTransaksi() {
        System.out.printf("| %d\t| %s\t\t| %s\t |%d\t\t| %d\t|\n", kode, noTNKB, nama, nominalBayar, denda);
    }
}