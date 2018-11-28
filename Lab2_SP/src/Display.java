
public class Display implements Visitor {
	private String imageMessages = "";
	private String paragraphMessages = "";

	@Override
	public void visit(Image image) {
		image.print();
	}

	@Override
	public void visit(ImageProxy imageProxy) {
	}

	@Override
	public void visit(Paragraph paragraph) {
		paragraph.print();
	}

	@Override
	public void visit(Table table) {
	}

	@Override
	public void visit(Book book) {
	}

	public void printStatistics() {
		System.out.println("Book Statistics:");
	}

	@Override
	public void visit(Section section) {
	}

}
