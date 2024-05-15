public class sllMhsMain {
    public static void main(String[] args) {
        linkedListMhs sll = new linkedListMhs();
        sll.addFirst(new mahasiswaWeek11("111" , "Anton"));
        sll.addLast(new mahasiswaWeek11("115" , "Sari"));
        sll.print();
        sll.insertAfter("111", new mahasiswaWeek11("112", "Prita"));
    }
}
