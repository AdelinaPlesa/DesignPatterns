import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
	private String title;
	private List<Author> authors = new ArrayList<Author>();
	private List<Element> chapters = new ArrayList<Element>();

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void addAuthor(ArrayList<Author> authors) {
		this.authors = authors;
	}

	@Override
	public void add(Element e) {
		chapters.add(e);

	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		System.out.println(title);
		for (Element elem : chapters) {
			elem.print();
		}

	}

	@Override
	public void accept(Visitor v) {
		for (Element element : chapters) {
			element.accept(v);
		}
	}

}
