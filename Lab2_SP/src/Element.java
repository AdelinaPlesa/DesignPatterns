
public interface Element {
	public void add(Element e);
	public void remove(Element e);
	public void getChild(int index);
	public void print();
	public void accept(Visitor v);

}
