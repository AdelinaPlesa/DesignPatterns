import java.util.ArrayList;
import java.util.List;

public class Section implements Element{

	private String title;
	private List<Element> content = new ArrayList<Element>();
	
	public Section(String title){
		this.title = title;
	}
	
	public Section(String title, List<Element> content){
		this.title = title;
		this.content = content;
	}
	
	@Override
	public void add(Element e) {
		content.add(e);
		
	}
	@Override
	public void remove(Element e) {
		content.remove(e);		
	}
	@Override
	public void getChild(int index) {
		content.get(index);
		
	}
	@Override
	public void print() {
		System.out.println(title);
		for(Element elem : content){
			elem.print();
		}
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Element> getContent() {
		return content;
	}
	public void setContent(List<Element> content) {
		this.content = content;
	}
	

	@Override
	public void accept(Visitor v) {
		for(Element elem: content){
			elem.accept(v);
		}
	}
	
	

}
