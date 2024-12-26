package day21;

public class BookManagement {

	private String Authorname;
	private double price;
	private String Title;
	private int NoOfPages;



	public String getAuthorname() {
		return Authorname;
	}


	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public BookManagement(String authorname, double price, String title, int noOfPages) {
		super();
		Authorname = authorname;
		this.price = price;
		Title = title;
		NoOfPages = noOfPages;
	}


	public int getNoOfPages() {
		return NoOfPages;
	}


	public void setNoOfPages(int noOfPages) {
		NoOfPages = noOfPages;
	}
	
	public BookManagement() {
		super();
	}


	@Override
	public String toString() {
		return "BookManagement [Authorname=" + Authorname + ", price=" + price + ", Title=" + Title + ", NoOfPages="
				+ NoOfPages + "]";
	}


	

	
	
}
	
	
	
	
	
	
	

