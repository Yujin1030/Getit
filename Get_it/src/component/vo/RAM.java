package component.vo;

public class RAM {

	
	private String ramCode;
	private int ramNum;
	private String ramName;
	private int ramPrice;
	private String ramContent;
	private int ramCount;
	private String ramfileName;  
	private String ramfilePath;
	public RAM() {}

	public String getRamfileName() {
		return ramfileName;
	}

	public void setRamfileName(String ramfileName) {
		this.ramfileName = ramfileName;
	}

	public String getRamfilePath() {
		return ramfilePath;
	}

	public void setRamfilePath(String ramfilePath) {
		this.ramfilePath = ramfilePath;
	}

	public String getRamCode() {
		return ramCode;
	}

	public void setRamCode(String ramCode) {
		this.ramCode = ramCode;
	}

	public int getRamNum() {
		return ramNum;
	}

	public void setRamNum(int ramNum) {
		this.ramNum = ramNum;
	}

	public String getRamName() {
		return ramName;
	}

	public void setRamName(String ramName) {
		this.ramName = ramName;
	}

	public int getRamPrice() {
		return ramPrice;
	}

	public void setRamPrice(int ramPrice) {
		this.ramPrice = ramPrice;
	}

	public String getRamContent() {
		return ramContent;
	}

	public void setRamContent(String ramContent) {
		this.ramContent = ramContent;
	}

	public int getRamCount() {
		return ramCount;
	}

	public void setRamCount(int ramCount) {
		this.ramCount = ramCount;
	}

	@Override
	public String toString() {
		return "RAM [ramCode=" + ramCode + ", ramNum=" + ramNum + ", ramName=" + ramName + ", ramPrice=" + ramPrice
				+ ", ramContent=" + ramContent + ", ramCount=" + ramCount + "]";
	}
	
	
	
}
