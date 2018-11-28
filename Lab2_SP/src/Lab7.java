
public class Lab7 {
	
	public static void main(String[] args) throws Exception {		
		Builder jsonBuilder = new JSONBuilder("book.json");
		jsonBuilder.build();
		Element myBook = jsonBuilder.getResult();
		myBook.print();
	}
}
