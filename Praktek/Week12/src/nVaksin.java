public class nVaksin {
    String nama;
    int noAntri;
    nVaksin prev, next;

    public nVaksin(int no, String nama) {
        this.nama = nama;
        this.prev = null;
        this.next = null;
        noAntri=no;
    }
}
