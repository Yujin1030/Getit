package component.vo;

public class CPU {
	
	
	private String cpuCode;
	private int productNum;
	private String cpuName;
	private int cputPrice;
	private String cputContent;
	private int cputCount;
	
	public CPU() {}

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

	public int getCputPrice() {
		return cputPrice;
	}

	public void setCputPrice(int cputPrice) {
		this.cputPrice = cputPrice;
	}

	public String getCputContent() {
		return cputContent;
	}

	public void setCputContent(String cputContent) {
		this.cputContent = cputContent;
	}

	public int getCputCount() {
		return cputCount;
	}

	public void setCputCount(int cputCount) {
		this.cputCount = cputCount;
	}

	@Override
	public String toString() {
		return "CPU [cpuCode=" + cpuCode + ", productNum=" + productNum + ", cpuName=" + cpuName + ", cputPrice="
				+ cputPrice + ", cputContent=" + cputContent + ", cputCount=" + cputCount + "]";
	}

		
}
