

public class OpenCommand implements Command {

  @Override
  public void execute() {
    JSONBuilder jsonBuilder = new JSONBuilder("book.json");
    jsonBuilder.build();
    Book book = new Book("carte1");
    book.add(jsonBuilder.getResult());
    DocumentManager.getInstance().setBook(book);
    book.print();
  }

}
