public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addTonerAmount(int tonerAmount) {
        int tempTonerLevel = tonerLevel + tonerAmount;
        if (tempTonerLevel > 100 || tonerAmount < 0) return -1;

        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) pagesToPrint = (pages / 2) + (pages % 2);

        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
