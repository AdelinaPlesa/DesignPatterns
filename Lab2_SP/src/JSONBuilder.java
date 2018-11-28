import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 */

/**
 * @author George
 *
 */
public class JSONBuilder implements Builder {
	private String fileName;
	private Element document;

	public JSONBuilder(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public Element getResult() {
		// TODO Auto-generated method stub
		return document;
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		try {
			HashMap<String, Object> map = mapper.readValue(new File(fileName), HashMap.class);
			document = processMap(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		Section sec = new Section((String) map.get("title"));
		Collection<HashMap<String, Object>> childMap = (Collection<HashMap<String, Object>>) map.get("children");
		childMap.forEach(subMap -> {
			Element elem = processMap(subMap);
			if (elem != null) {
				sec.add(elem);
			}
		});
		return sec;
	}

	private Element processMap(HashMap<String, Object> subMap) {
		if ("Image".equals((String) subMap.get("class"))) {
			return buildImage(subMap);
		}

		if ("Section".equals((String) subMap.get("class"))) {
			return buildSection(subMap);
		}
		if ("Paragraph".equals((String) subMap.get("class"))) {
			return buildParagraph(subMap);
		}
		if ("ImageProxy".equals((String) subMap.get("class"))) {
			return buildImageProxy(subMap);
		}

		// if((String)subMap.get("class") != null & ((String)subMap.get("class")).equals("Image"))
		return null;
	}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		Paragraph par = new Paragraph((String) map.get("text"));
		return par;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		Image img = new Image((String) map.get("url"));
		return img;
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		ImageProxy imgp = new ImageProxy((String) map.get("url"));
		return imgp;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		Table tbl = new Table((String) map.get("table"));
		return tbl;
	}

}