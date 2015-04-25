package form;

import java.util.List;

public class SearchStoreConditionForm {

	private String name;
	private List<String> area;
	private List<String> category;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getArea() {
		return area;
	}
	public void setArea(List<String> area) {
		this.area = area;
	}
	public List<String> getCategory() {
		return category;
	}
	public void setCategory(List<String> category) {
		this.category = category;
	}


}
