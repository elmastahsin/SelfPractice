package day30_inheritance.bookTask;

public class EBook extends Book{
    private int pages;

    private String size;

    public EBook(String title, String type, String author, double price, int pages, String size) {
        super(title, type, author, price);
       setPages(pages);
       setSize(size);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {//1. pages can not be set to zero or negative
        if (pages < 0) {
            System.err.println("Invalid page number " + pages);
        }
        this.pages = pages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void readBook(){
        System.out.println("reading book..");
    }
}
/*2 Create a sub class of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()*/