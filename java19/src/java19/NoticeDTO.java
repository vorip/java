package java19;

public class NoticeDTO {
	String title;
	String contents;
	String name;
	String pw;
	public NoticeDTO(String title, String contents, String name, String pw) {
		this.title = title;
		this.contents = contents;
		this.name = name;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "NoticeDTO [title=" + title + ", contents=" + contents + ", name=" + name + ", pw=" + pw + "]";
	}

}
