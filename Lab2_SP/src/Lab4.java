import java.util.ArrayList;

public class Lab4 {
	private static ArrayList<Author> authors;

	public static void main (String []args){
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author gheo = new Author ("Radu Pavel Gheo");
		authors = null;
		authors.add(gheo);
		noapteBuna.addAuthor(authors);
		noapteBuna.add(new Paragraph("Multumesc, ... "));
		Element cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Aici..."));
		Element cap11 = new Section("Subcapitol 1.1");
		cap11.add(new Section("Sub subcapitol 1.1.1"));
		cap11.add(new Paragraph("Primul sub subcapitol"));
		cap11.add(new Section("Sub subcaptiol 1.1.2"));
		cap11.add(new Paragraph("Al doilea sub subcapitol"));
		Element cap12 = new Section("Subcapitol 1.2");
		cap1.add(cap11);
		cap1.add(cap12);
		noapteBuna.add(cap1);
		
		noapteBuna.print();
	}
}
