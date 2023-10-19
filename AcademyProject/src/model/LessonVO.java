package model;

public class LessonVO {
	private int no;
	private String I_abbre;
	private String I_name;
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
	
	
}
