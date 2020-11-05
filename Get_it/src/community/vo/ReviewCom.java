package community.vo;

import java.sql.Date;

public class ReviewCom {
	private Integer commentNo;
	private String cContents;
	private Date cDate;
	private Integer reviewNo;
	private String memberId;
	
	public ReviewCom() {}

	public Integer getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(Integer commentNo) {
		this.commentNo = commentNo;
	}

	public String getcContents() {
		return cContents;
	}

	public void setcContents(String cContents) {
		this.cContents = cContents;
	}

	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}

	public Integer getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(Integer reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
}
