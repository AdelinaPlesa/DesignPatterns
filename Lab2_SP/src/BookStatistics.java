
public class BookStatistics implements Visitor {
	private int numberOfImageProxy = 0;
	private int numberOfParagraphs = 0;
	private int numberOfImages = 0;
	private int numberOfSections = 0;
	@SuppressWarnings("unused")
	private int numberOfBooks = 0;
	private int numberOfTables = 0;

	@Override
	public void visit(Image image) {
		numberOfImages++;
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		numberOfImageProxy++;
	}

	@Override
	public void visit(Paragraph paragraph) {
		numberOfParagraphs++;
	}

	@Override
	public void visit(Table table) {
		numberOfTables++;
	}

	@Override
	public void visit(Book book) {
		numberOfBooks++;
	}

	public void printStatistics() {
		System.out.println("Book Statistics:");
		System.out.println("*** Number of images: " + numberOfImages);
		System.out.println("*** Number of tables: " + numberOfTables);
		System.out.println("*** Number of paragraphs: " + numberOfParagraphs);
		System.out.println("*** Number of proxy images: " + numberOfImageProxy);
		System.out.println("*** Number of sections: " + numberOfSections);
	}

	@Override
	public void visit(Section section) {
		numberOfSections++;
	}
}
