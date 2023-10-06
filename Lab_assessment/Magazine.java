package Lab_assessment;

public class Magazine extends LibraryItem{
   private int issueNumber;
    Magazine(String title, String author, int year, LibraryItemType itemType,int issueNumbers) {
        super(title, author, year, itemType);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
