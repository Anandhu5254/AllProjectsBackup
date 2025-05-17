package sampleSpace;

public class Book1 {

private String Title;
private String Author;
private int Price;
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}

 void applyDiscount(float percentage)
{
	 Price-=Price*(percentage/100);
}
 public static void main(String[] args) {
	
	 Book1 b1=new Book1();
	 b1.setAuthor("Krisnan Nair");
	 b1.setTitle("Leelamayam");
	 b1.setPrice(1000);
	 System.out.println(b1.getAuthor());
	 System.out.println(b1.getTitle());
	 System.out.println(b1.Price); //price before appliyng discount
	 b1.applyDiscount(25); //price after applying discount
	 
	 System.out.println(b1.Price);
}
}
