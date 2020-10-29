package other.model.vo;

public class Other {
	private int oProductNo;
	private String oProductCode;
	private String oProductName;
	private int oProductAcount;
	private int oProductPrice;
	private String oProductContents;
	private String fileName;
	private String filePath;
	
	public Other() {}

	public int getoProductNo() {
		return oProductNo;
	}

	public void setoProductNo(int oProductNo) {
		this.oProductNo = oProductNo;
	}

	public String getoProductCode() {
		return oProductCode;
	}

	public void setoProductCode(String oProductCode) {
		this.oProductCode = oProductCode;
	}

	public String getoProductName() {
		return oProductName;
	}

	public void setoProductName(String oProductName) {
		this.oProductName = oProductName;
	}

	public int getoProductAcount() {
		return oProductAcount;
	}

	public void setoProductAcount(int oProductAcount) {
		this.oProductAcount = oProductAcount;
	}

	public int getoProductPrice() {
		return oProductPrice;
	}

	public void setoProductPrice(int oProductPrice) {
		this.oProductPrice = oProductPrice;
	}

	public String getoProductContents() {
		return oProductContents;
	}

	public void setoProductContents(String oProductContents) {
		this.oProductContents = oProductContents;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		return "Other [oProductNo=" + oProductNo + ", oProductCode=" + oProductCode + ", oProductName=" + oProductName
				+ ", oProductAcount=" + oProductAcount + ", oProductPrice=" + oProductPrice + ", oProductContents="
				+ oProductContents + ", fileName=" + fileName + ", filePath=" + filePath + "]";
	}
}
