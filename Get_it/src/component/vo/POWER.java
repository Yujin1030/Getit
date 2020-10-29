package component.vo;

public class POWER {

	private String powerCode;
	private int powerNum;
	private String powerName;
	private int powerPrice;
	private String powerContent;
	private int powerCount;
	private String powerfileName; 
	private String powerfilePath;
	public POWER() {}

	public String getPowerfileName() {
		return powerfileName;
	}

	public void setPowerfileName(String powerfileName) {
		this.powerfileName = powerfileName;
	}

	public String getPowerfilePath() {
		return powerfilePath;
	}

	public void setPowerfilePath(String powerfilePath) {
		this.powerfilePath = powerfilePath;
	}

	public String getPowerCode() {
		return powerCode;
	}

	public void setPowerCode(String powerCode) {
		this.powerCode = powerCode;
	}

	public int getPowerNum() {
		return powerNum;
	}

	public void setPowerNum(int powerNum) {
		this.powerNum = powerNum;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public int getPowerPrice() {
		return powerPrice;
	}

	public void setPowerPrice(int powerPrice) {
		this.powerPrice = powerPrice;
	}

	public String getPowerContent() {
		return powerContent;
	}

	public void setPowerContent(String powerContent) {
		this.powerContent = powerContent;
	}

	public int getPowerCount() {
		return powerCount;
	}

	public void setPowerCount(int powerCount) {
		this.powerCount = powerCount;
	}

	@Override
	public String toString() {
		return "POWER [powerCode=" + powerCode + ", powerNum=" + powerNum + ", powerName=" + powerName + ", powerPrice="
				+ powerPrice + ", powerContent=" + powerContent + ", powerCount=" + powerCount + "]";
	}
	
	
}
