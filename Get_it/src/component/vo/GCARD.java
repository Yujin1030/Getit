package component.vo;

public class GCARD {

	private String gcardCode;
	private int gcardNum;
	private String gcardName;
	private int gcardPrice;
	private String gcardContent;
	private int gcardCount;
	private String gcardfileName;      
	private String gcardfilePath;	
	public GCARD() {}

	public String getGcardfileName() {
		return gcardfileName;
	}

	public void setGcardfileName(String gcardfileName) {
		this.gcardfileName = gcardfileName;
	}

	public String getGcardfilePath() {
		return gcardfilePath;
	}

	public void setGcardfilePath(String gcardfilePath) {
		this.gcardfilePath = gcardfilePath;
	}

	public String getGcardCode() {
		return gcardCode;
	}

	public void setGcardCode(String gcardCode) {
		this.gcardCode = gcardCode;
	}

	public int getGcardNum() {
		return gcardNum;
	}

	public void setGcardNum(int gcardNum) {
		this.gcardNum = gcardNum;
	}

	public String getGcardName() {
		return gcardName;
	}

	public void setGcardName(String gcardName) {
		this.gcardName = gcardName;
	}

	public int getGcardPrice() {
		return gcardPrice;
	}

	public void setGcardPrice(int gcardPrice) {
		this.gcardPrice = gcardPrice;
	}

	public String getGcardContent() {
		return gcardContent;
	}

	public void setGcardContent(String gcardContent) {
		this.gcardContent = gcardContent;
	}

	public int getGcardCount() {
		return gcardCount;
	}

	public void setGcardCount(int gcardCount) {
		this.gcardCount = gcardCount;
	}

	@Override
	public String toString() {
		return "GCARD [gcardCode=" + gcardCode + ", gcardNum=" + gcardNum + ", gcardName=" + gcardName + ", gcardPrice="
				+ gcardPrice + ", gcardContent=" + gcardContent + ", gcardCount=" + gcardCount + "]";
	}
	
	

}
