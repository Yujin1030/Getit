package component.vo;

public class SSD {
	
	private String ssdCode;
	private int ssdNum;
	private String ssdName;
	private int ssdPrice;
	private String ssdContent;
	private int ssdCount;
	
	public SSD() {}

	public String getSsdCode() {
		return ssdCode;
	}

	public void setSsdCode(String ssdCode) {
		this.ssdCode = ssdCode;
	}

	public int getSsdNum() {
		return ssdNum;
	}

	public void setSsdNum(int ssdNum) {
		this.ssdNum = ssdNum;
	}

	public String getSsdName() {
		return ssdName;
	}

	public void setSsdName(String ssdName) {
		this.ssdName = ssdName;
	}

	public int getSsdPrice() {
		return ssdPrice;
	}

	public void setSsdPrice(int ssdPrice) {
		this.ssdPrice = ssdPrice;
	}

	public String getSsdContent() {
		return ssdContent;
	}

	public void setSsdContent(String ssdContent) {
		this.ssdContent = ssdContent;
	}

	public int getSsdCount() {
		return ssdCount;
	}

	public void setSsdCount(int ssdCount) {
		this.ssdCount = ssdCount;
	}

	@Override
	public String toString() {
		return "SSD [ssdCode=" + ssdCode + ", ssdNum=" + ssdNum + ", ssdName=" + ssdName + ", ssdPrice=" + ssdPrice
				+ ", ssdContent=" + ssdContent + ", ssdCount=" + ssdCount + "]";
	}

	
	
	
}
