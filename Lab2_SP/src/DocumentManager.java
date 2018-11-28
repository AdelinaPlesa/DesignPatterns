
public class DocumentManager {
	private static DocumentManager sharedInstance = null;
	private Book book = null;

	private DocumentManager() {

	}

	public static DocumentManager getInstance() {
		if (sharedInstance == null) {
			sharedInstance = new DocumentManager();
		}
		return sharedInstance;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}
}
