package recommend.model.vo;

public class Recommend {
	// 완제품 테이블 목록
	// 완제품
	private int aNo;  
	private String aName;
	private int aPrice;
	private int aAccount;
	private String aDetail;
	private String aCategory;
	private String fileName;
	private String filePath;
	// POWER
	private String powerCode;
	// SSD
	private String ssdCode;
	// SKIN
	private String skinCode;
	// GPU
	private String gcardCode;
	// HDD
	private String hddCode;
	// CPUCOOLER
	private String coolerCode;
	// RAM
	private String ramCode;
	// CPU
	private String cpuCode;
	// MAINBOARD
	private String mainboardCode;
	
	
	public String getMainboardCode() {
		return mainboardCode;
	}
	public void setMainboardCode(String mainboardCode) {
		this.mainboardCode = mainboardCode;
	}
	public int getaNo() {
		return aNo;
	}
	public void setaNo(int aNo) {
		this.aNo = aNo;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public int getaPrice() {
		return aPrice;
	}
	public void setaPrice(int aPrice) {
		this.aPrice = aPrice;
	}
	public int getaAccount() {
		return aAccount;
	}
	public void setaAccount(int aAccount) {
		this.aAccount = aAccount;
	}
	public String getaDetail() {
		return aDetail;
	}
	public void setaDetail(String aDetail) {
		this.aDetail = aDetail;
	}
	public String getaCategory() {
		return aCategory;
	}
	public void setaCategory(String aCategory) {
		this.aCategory = aCategory;
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
	public String getPowerCode() {
		return powerCode;
	}
	public void setPowerCode(String powerCode) {
		this.powerCode = powerCode;
	}
	public String getSsdCode() {
		return ssdCode;
	}
	public void setSsdCode(String ssdCode) {
		this.ssdCode = ssdCode;
	}
	public String getSkinCode() {
		return skinCode;
	}
	public void setSkinCode(String skinCode) {
		this.skinCode = skinCode;
	}
	public String getGcardCode() {
		return gcardCode;
	}
	public void setGcardCode(String gcardCode) {
		this.gcardCode = gcardCode;
	}
	public String getHddCode() {
		return hddCode;
	}
	public void setHddCode(String hddCode) {
		this.hddCode = hddCode;
	}
	public String getCoolerCode() {
		return coolerCode;
	}
	public void setCoolerCode(String coolerCode) {
		this.coolerCode = coolerCode;
	}
	public String getRamCode() {
		return ramCode;
	}
	public void setRamCode(String ramCode) {
		this.ramCode = ramCode;
	}
	public String getCpuCode() {
		return cpuCode;
	}
	public void setCpuCode(String cpuCode) {
		this.cpuCode = cpuCode;
	}
	@Override
	public String toString() {
		return "Recommend [aNo=" + aNo + ", aName=" + aName + ", aPrice=" + aPrice + ", aAccount=" + aAccount
				+ ", aDetail=" + aDetail + ", aCategory=" + aCategory + ", fileName=" + fileName + ", filePath="
				+ filePath + ", powerCode=" + powerCode + ", ssdCode=" + ssdCode + ", skinCode=" + skinCode
				+ ", gcardCode=" + gcardCode + ", hddCode=" + hddCode + ", coolerCode=" + coolerCode + ", ramCode="
				+ ramCode + ", cpuCode=" + cpuCode + "]";
	}
	
	
	
	
}
