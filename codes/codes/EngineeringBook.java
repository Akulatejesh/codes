package codes;

public class EngineeringBook extends Book{
	private String Category;

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
	public String toString() {
		return super.toString()	+Category;
		}
}
