package component.vo;

public class CPU {
	
	
	private String cpuCode;
	private int productNum;
	private String cpuName;
	private int cpuPrice;
	private String cpuContent;
	private int cpuCount;
	private String cpufileName;  
	private String cpufilePath;
	public CPU() {}

	public String getCpufileName() {
		return cpufileName;
	}

	public void setCpufileName(String cpufileName) {
		this.cpufileName = cpufileName;
	}

	public String getCpufilePath() {
		return cpufilePath;
	}

	public void setCpufilePath(String cpufilePath) {
		this.cpufilePath = cpufilePath;
	}

	public String getCpuCode() {
		return cpuCode;
	}

	public void setCpuCode(String cpuCode) {
		this.cpuCode = cpuCode;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getCpuName() {
		return cpuName;
	}

	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}

	public int getCpuPrice() {
		return cpuPrice;
	}

	public void setCpuPrice(int cpuPrice) {
		this.cpuPrice = cpuPrice;
	}

	public String getCpuContent() {
		return cpuContent;
	}

	public void setCpuContent(String cpuContent) {
		this.cpuContent = cpuContent;
	}

	public int getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(int cpuCount) {
		this.cpuCount = cpuCount;
	}

	@Override
	public String toString() {
		return "CPU [cpuCode=" + cpuCode + ", productNum=" + productNum + ", cpuName=" + cpuName + ", cpuPrice="
				+ cpuPrice + ", cpuContent=" + cpuContent + ", cpuCount=" + cpuCount + "]";
	}

	
	
}