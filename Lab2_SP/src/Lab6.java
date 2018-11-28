import java.util.ArrayList;

public class Lab6{
	public static void main(String []args){
		long startTime = System.currentTimeMillis();
		Book mybook = new Book("Disco Titanic");
		Author gheo = new Author("Radu Pavel Gheo");
		
		ArrayList authors = new ArrayList<Author>();
		authors.add(gheo);
		
		mybook.addAuthor(authors);
		Section section1 = new Section("Chapter 1");
		Section section2 = new Section("Chapter 2");
		Section subsection1 = new Section("Subchapter 1.1");
		Section subsubsection1 = new Section("SubSubchapter 1.1.1");
		Section subsubsection2 = new Section("SubSubchapter 1.1.2");

		Image image1 = new Image("image1");
		Paragraph Paragraph1 = new Paragraph("Paragraph1");
		Paragraph Paragraph2 = new Paragraph("Paragraph2");
		Paragraph2.setAlignStrategy(new AlignCenter());
		Paragraph prefaceParagraph = new Paragraph("prefaceParagraph");
		Table table1 = new Table("table1");

		section1.add(image1);
		section1.add(prefaceParagraph);
		section1.add(table1);
		section1.add(subsection1);
		subsection1.add(subsubsection1);
		subsection1.add(Paragraph1);
		subsection1.add(subsubsection2);
		subsection1.add(Paragraph2);
		
		mybook.add(section1);
		mybook.add(section2);
		System.out.println(mybook);
		
		
		Book otherBook = new Book("Something Interesting");
		Author ion = new Author("Ion Ionescu Americanu");
		
		ArrayList authors1 = new ArrayList<Author>();
		authors1.add(ion);
		authors1.add(gheo);
		
		
		otherBook.addAuthor(authors1);
		Section section11 = new Section("Chapter 1");
		//section11.add(new ImageProxy("Something Bugatti"));
		//section11.add(new ImageProxy("Boeing 747"));
		Section section21 = new Section("Chapter 2");
		Section subsection11 = new Section("Subchapter 1.1");
		Section subsubsection11 = new Section("SubSubchapter 1.1.1");
		Section subsubsection21 = new Section("SubSubchapter 1.1.2");


		section11.add(image1);
		section11.add(prefaceParagraph);
		section11.add(table1);
		section11.add(subsection1);
		subsection11.add(subsubsection1);
		subsection11.add(Paragraph1);
		subsection11.add(subsubsection2);
		subsection11.add(Paragraph2);
		
		otherBook.add(section11);
		otherBook.add(section21);
		System.out.println(otherBook);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	
}