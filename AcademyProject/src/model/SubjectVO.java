package model;

import java.util.Objects;

public class SubjectVO {

	private int no;  // 학과 일련번호
	private String s_num;  // 학과 번호
	private String s_name;  // 학과명
	public SubjectVO() {
		super();
	}
	public SubjectVO(int no, String s_num, String s_name) {
		super();
		this.no = no;
		this.s_num = s_num;
		this.s_name = s_name;
	}
	public SubjectVO(String s_num, String s_name) {
		super();
		this.s_num = s_num;
		this.s_name = s_name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getS_num() {
		return s_num;
	}
	public void setS_num(String s_num) {
		this.s_num = s_num;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	@Override
	public String toString() {
		return String.format("%3d \\t %-30s \\t\\t %-10s", no, s_num, s_name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(no, s_name, s_num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubjectVO other = (SubjectVO) obj;
		return no == other.no && Objects.equals(s_name, other.s_name) && Objects.equals(s_num, other.s_num);
	}
	
}
