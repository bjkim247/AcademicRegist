package model;

import java.util.Objects;

public class LessonVO {
	private int no;  // 과목 일련번호
	private String I_abbre;  //과목약어
	private String I_name;  //과목명
	public LessonVO() {
		super();
	}
	public LessonVO(int no, String i_abbre, String i_name) {
		super();
		this.no = no;
		I_abbre = i_abbre;
		I_name = i_name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getI_abbre() {
		return I_abbre;
	}
	public void setI_abbre(String i_abbre) {
		I_abbre = i_abbre;
	}
	public String getI_name() {
		return I_name;
	}
	public void setI_name(String i_name) {
		I_name = i_name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(I_abbre, I_name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LessonVO other = (LessonVO) obj;
		return Objects.equals(I_abbre, other.I_abbre) && Objects.equals(I_name, other.I_name) && no == other.no;
	}
	@Override
	public String toString() {
		return "LessonVO [no=" + no + ", I_abbre=" + I_abbre + ", I_name=" + I_name + "]";
	}
	
	
}
