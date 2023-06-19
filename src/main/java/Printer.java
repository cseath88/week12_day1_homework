public class Printer {

    private int paperLeft;
    private int toner;

    public Printer(int paperLeft, int toner) {
        this.paperLeft = paperLeft;
        this.toner = toner;
    }

    public int printFunction(int pages, int copies) {
        int totalPages = pages * copies;
        if(totalPages <= this.paperLeft) {
            this.paperLeft -= totalPages;
            this.toner -= totalPages;
        }
        return paperLeft;
    }

}
