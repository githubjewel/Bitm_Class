package demo;

public class Mobile {

	private String brandName;
	private String modelNumber;
	private String type;
 
	public String setOs(){
		
		if(type.equalsIgnoreCase("featured"))
			return "Null";	
		return "OS";
	}
	
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
