package domain;

public class ArticleBean {
	private int seq; //글번호
	private String title,content,writer,redDate;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRedDate() {
		return redDate;
	}
	public void setRedDate(String redDate) {
		this.redDate = redDate;
	}
	@Override
	public String toString() {
		return "게시판]\n"
				+ "글번호=" + seq + "\n"
				+ "제목=" + title + "\n"
				+ "내용=" + content + "\n"
				+ "작가=" + writer+ "\n"
				+ "작성일=" + redDate + "\n";
	}
	
}
