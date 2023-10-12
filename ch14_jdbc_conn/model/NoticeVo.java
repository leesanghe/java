package ch14_jdbc_conn.model;

public class NoticeVo {
	private String notice;
	private int bbsno;
	@Override
	public String toString() {
		return "NoticeVo [notice=" + notice + "]";
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}
	
}
