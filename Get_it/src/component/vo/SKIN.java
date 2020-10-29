package component.vo;

public class SKIN {

	private String skinCode;
	private int skinNum;
	private String skinName;
	private int skinPrice;
	private String skinContent;
	private int skinCount;
	public SKIN() {}
	private String skinfileName; 
	private String skinfilePath;
	public String getSkinCode() {
		return skinCode;
	}

	public String getSkinfileName() {
		return skinfileName;
	}

	public void setSkinfileName(String skinfileName) {
		this.skinfileName = skinfileName;
	}

	public String getSkinfilePath() {
		return skinfilePath;
	}

	public void setSkinfilePath(String skinfilePath) {
		this.skinfilePath = skinfilePath;
	}

	public void setSkinCode(String skinCode) {
		this.skinCode = skinCode;
	}

	public int getSkinNum() {
		return skinNum;
	}

	public void setSkinNum(int skinNum) {
		this.skinNum = skinNum;
	}

	public String getSkinName() {
		return skinName;
	}

	public void setSkinName(String skinName) {
		this.skinName = skinName;
	}

	public int getSkinPrice() {
		return skinPrice;
	}

	public void setSkinPrice(int skinPrice) {
		this.skinPrice = skinPrice;
	}

	public String getSkinContent() {
		return skinContent;
	}

	public void setSkinContent(String skinContent) {
		this.skinContent = skinContent;
	}

	public int getSkinCount() {
		return skinCount;
	}

	public void setSkinCount(int skinCount) {
		this.skinCount = skinCount;
	}

	@Override
	public String toString() {
		return "SKIN [skinCode=" + skinCode + ", skinNum=" + skinNum + ", skinName=" + skinName + ", skinPrice="
				+ skinPrice + ", skinContent=" + skinContent + ", skinCount=" + skinCount + "]";
	}

	
	
}
