package day12;

public class SingleBooks {
	    private String Title;
		private String Author;
		private double  Price;
		private int  Numberofcopies;
		
public SingleBooks() 
{	
	
}
public SingleBooks(String Title,String Author,int Price,int Numberofcopies) {
					this.Title=Title;
					this.Author=Author;
					this.Price=Price;
					this.Numberofcopies=Numberofcopies;
					
					}
				public void setTitle(String Title) {
					this.Title=Title;
				}
					public void setAuthor(String Author) {
						this.Author=Author;
					}
					public void setPrice(double Price) {
						this.Price=Price;
					}
					public void setNumberofcopies(int Numberofcopies) {
						this.Numberofcopies=Numberofcopies;
					}
					
					public String getTitle() {
						return Title;
					}
					public String getAuthor() {
						return Author;
					}
					public double getPrice() {
						return Price;
					}
					public int getNumberofcopies() {
						return Numberofcopies;
				}
					public String toString() {
						return"your Title:"+Title+"\n your Author:"+Author+"\n your Price:"+Price+"\n your Numberofcopies:"+Numberofcopies;
					
			
		}
			
	}

