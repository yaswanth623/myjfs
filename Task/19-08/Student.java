package task;

public class Student {
	private int Rollno;
	private int clgid;
	private String name;
	private String gender;
	private int sem;
	private int marks;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public int getClgid() {
		return clgid;
	}
	public void setClgid(int clgid) {
		this.clgid = clgid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollno, int clgid, String name, String gender, int sem, int marks) {
		super();
		Rollno = rollno;
		this.clgid = clgid;
		this.name = name;
		this.gender = gender;
		this.sem = sem;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", clgid=" + clgid + ", name=" + name + ", gender=" + gender + ", sem="
				+ sem + ", marks=" + marks + "]";
	}
	public Student() {}
}
