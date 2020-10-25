package component.vo;

public class COOLER {


	
	private String coolerCode;
	private int coolerNum;
	private String coolerName;
	private int coolerPrice;
	private String coolerContent;
	private int coolerCount;
	
	public COOLER() {}

	public String getCoolerCode() {
		return coolerCode;
	}

	public void setCoolerCode(String coolerCode) {
		this.coolerCode = coolerCode;
	}

	public int getCoolerNum() {
		return coolerNum;
	}

	public void setCoolerNum(int coolerNum) {
		this.coolerNum = coolerNum;
	}

	public String getCoolerName() {
		return coolerName;
	}

	public void setCoolerName(String coolerName) {
		this.coolerName = coolerName;
	}

	public int getCoolerPrice() {
		return coolerPrice;
	}

	public void setCoolerPrice(int coolerPrice) {
		this.coolerPrice = coolerPrice;
	}

	public String getCoolerContent() {
		return coolerContent;
	}

	public void setCoolerContent(String coolerContent) {
		this.coolerContent = coolerContent;
	}

	public int getCoolerCount() {
		return coolerCount;
	}

	public void setCoolerCount(int coolerCount) {
		this.coolerCount = coolerCount;
	}

	@Override
	public String toString() {
		return "COOLER [coolerCode=" + coolerCode + ", coolerNum=" + coolerNum + ", coolerName=" + coolerName
				+ ", coolerPrice=" + coolerPrice + ", coolerContent=" + coolerContent + ", coolerCount=" + coolerCount
				+ "]";
	}
	
	
	
}
