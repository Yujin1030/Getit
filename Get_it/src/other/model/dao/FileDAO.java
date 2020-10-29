package other.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.JDBCTemplate;
import other.model.vo.Other;

public class FileDAO {
	public int uploadFile(Connection conn, Other other, String systemFileName) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE OTHER_PRODUCT SET PICTURE_NAME = ?, PICTURE_PATH = ? WHERE O_PRODUCT_NO = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, systemFileName);
			pstmt.setString(2, other.getFilePath());
			pstmt.setInt(3, other.getoProductNo());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
}
