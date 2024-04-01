package edu.sejong.ex;

public class Grade {
	private int kor;
	private int eng;
	private int math;
	
	public Grade() {
		// TODO Auto-generated constructor stub
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int sum() {
		System.out.println(this.kor + this.eng + this.math);
		return this.kor + this.eng + this.math;
	}
	
	public double avg() {
		System.out.println((this.kor + this.eng + this.math)/3.0);
		return (this.kor + this.eng + this.math)/3.0;
	}
	
	public String grade() {
		String grade = "가"; 
		if(avg() >= 90) {
			grade = "수";
		}else if(avg() >= 80) {
			grade = "우";
		}else if(avg() >= 70) {
			grade = "미";
		}else if(avg() >= 60) {
			grade = "양";
		}
		System.out.println(grade);
		return grade;
	}
}
