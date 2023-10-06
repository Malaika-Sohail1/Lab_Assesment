package Lab_assessment;

public class Library {
    int counter=0;
    LibraryItem[] libraryItems=new LibraryItem[100];
    public void addItem(LibraryItem item){
           libraryItems[counter++]=item;
    }
    public void borrowItem(LibraryItem item){
    for(int i=0;i< libraryItems.length;i++){
        if (libraryItems[i].equals(item)){
            libraryItems[i].setBorrowed(true);
            break;
        }

    }

    }
    public void returnItem(LibraryItem item) {

        for (int i = 0; i < libraryItems.length; i++) {
            if(libraryItems[i]!=null)
                if (libraryItems[i].equals(item))
                libraryItems[i].setBorrowed(false);
        }
    }
    public void displayAvailableItems() {

        for (int i = 0; i < libraryItems.length; i++) {
            if(libraryItems[i]!=null)
            System.out.println(libraryItems[i]);
        }
    }
    public void displayBorrowedItems() {
            for(int i=0;i< libraryItems.length;i++){

            }
    }
    }