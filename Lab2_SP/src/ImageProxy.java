
public class ImageProxy implements Element{
	private String imgProxy;
	private Image img = null;
	
	public ImageProxy (String imgProxy){
		this.imgProxy = imgProxy;
	}
	
	public void print(){
		if(img == null){
			img = new Image(imgProxy);
		}
		img.print();
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
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
	public void accept(Visitor v) {
		v.visit(this);
	}
}
