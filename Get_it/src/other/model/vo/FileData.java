package other.model.vo;

public class FileData {
	private String fileName;
	private String filePath;
	private String contFileName;
	private String contFilePath;
	
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
	public String getContFileName() {
		return contFileName;
	}
	public void setContFileName(String contFileName) {
		this.contFileName = contFileName;
	}
	public String getContFilePath() {
		return contFilePath;
	}
	public void setContFilePath(String contFilePath) {
		this.contFilePath = contFilePath;
	}
	
	@Override
	public String toString() {
		return "FileData [fileName=" + fileName + ", filePath=" + filePath + ", contFileName=" + contFileName
				+ ", contFilePath=" + contFilePath + "]";
	}
}
