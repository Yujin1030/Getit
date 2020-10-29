package component.vo;

public class HDD {

	
	private String hddCode;
	private int hddNum;
	private String hddName;
	private int hddPrice;
	private String hddContent;
	private int hddCount;
	private String hddfileName;   
	private String hddfilePath;
	public HDD() {}

	public String getHddfileName() {
		return hddfileName;
	}

	public void setHddfileName(String hddfileName) {
		this.hddfileName = hddfileName;
	}

	public String getHddfilePath() {
		return hddfilePath;
	}

	public void setHddfilePath(String hddfilePath) {
		this.hddfilePath = hddfilePath;
	}

	public String getHddCode() {
		return hddCode;
	}

	public void setHddCode(String hddCode) {
		this.hddCode = hddCode;
	}

	public int getHddNum() {
		return hddNum;
	}

	public void setHddNum(int hddNum) {
		this.hddNum = hddNum;
	}

	public String getHddName() {
		return hddName;
	}

	public void setHddName(String hddName) {
		this.hddName = hddName;
	}

	public int getHddPrice() {
		return hddPrice;
	}

	public void setHddPrice(int hddPrice) {
		this.hddPrice = hddPrice;
	}

	public String getHddContent() {
		return hddContent;
	}

	public void setHddContent(String hddContent) {
		this.hddContent = hddContent;
	}

	public int getHddCount() {
		return hddCount;
	}

	public void setHddCount(int hddCount) {
		this.hddCount = hddCount;
	}

	@Override
	public String toString() {
		return "HDD [hddCode=" + hddCode + ", hddNum=" + hddNum + ", hddName=" + hddName + ", hddPrice=" + hddPrice
				+ ", hddContent=" + hddContent + ", hddCount=" + hddCount + "]";
	}
	
	
	
}
