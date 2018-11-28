
public interface Visitor {
	public void visit(Image i);
	public void visit(Table t);
	public void visit(Paragraph p);
	public void visit(ImageProxy ip);
	public void visit(Book b);
	public void visit(Section section);

}
