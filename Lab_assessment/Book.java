package Lab_assessment;

public class Book extends LibraryItem {
    private int pageCounts;

    Book(String title, String author, int year, LibraryItemType itemType, int pageCounts) {
        super(title, author, year, itemType);
        this.pageCounts = pageCounts;
    }

    public int getPageCounts() {
        return pageCounts;
    }

    public void setPageCounts(int pageCounts) {
        this.pageCounts = pageCounts;
    }

}
