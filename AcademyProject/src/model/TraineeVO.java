package model;

import java.util.Objects;

public class TraineeVO {
	private int no;  // 수강 일련번호
	private String sd_num;  // 학번
	private String I_abbre;  // 과목약어
	private String t_section;  // 과목구분
	private String t_date;  // 등록일
	public TraineeVO() {
		super();
	}
	public TraineeVO(int no, String sd_num, String i_abbre, String t_section, String t_date) {
		super();
		this.no = no;
		this.sd_num = sd_num;
		I_abbre = i_abbre;
		this.t_section = t_section;
		this.t_date = t_date;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSd_num() {
		return sd_num;
	}
	public void setSd_num(String sd_num) {
		this.sd_num = sd_num;
	}
	public String getI_abbre() {
		return I_abbre;
	}
	public void setI_abbre(String i_abbre) {
		I_abbre = i_abbre;
	}
	public String getT_section() {
		return t_section;
	}
	public void setT_section(String t_section) {
		this.t_section = t_section;
	}
	public String getT_date() {
		return t_date;
	}
	public void setT_date(String t_date) {
		this.t_date = t_date;
	}
	@Override
	public int hashCode() {
		return Objects.hash(I_abbre, no, sd_num, t_date, t_section);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TraineeVO other = (TraineeVO) obj;
		return Objects.equals(I_abbre, other.I_abbre) && no == other.no && Objects.equals(sd_num, other.sd_num)
				&& Objects.equals(t_date, other.t_date) && Objects.equals(t_section, other.t_section);
	}
	@Override
	public String toString() {
		return "TraineeVO [no=" + no + ", sd_num=" + sd_num + ", I_abbre=" + I_abbre + ", t_section=" + t_section
				+ ", t_date=" + t_date + "]";
	}
	
	
	
}
