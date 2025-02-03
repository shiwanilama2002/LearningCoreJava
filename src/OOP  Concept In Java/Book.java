package OOPConcept;
class bookinfo{
	String title;
	String author;
	int price;
	bookinfo(String title,String author,int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
		
	}
}
public class Book {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookinfo[] book = { new bookinfo("Java"," Dr.ABC",10000),	
				            new bookinfo("C Programiming"," Dainel",50000),
		};
		for(bookinfo book1: book) {
			book1.display();
		}

}
}
