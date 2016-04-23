package teacher_students;

import java.util.Scanner;

public class TestStuTea {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Student[] stu = new Student[4];
		Teacher[] tea = new Teacher[2];
		for (int i = 0; i < tea.length; i++) {
			System.out.println("请创建并输入第"+(i+1)+"个老师的基本信息：");
			tea[i] = createTeacher();
		}
		for (int j = 0; j < stu.length; j++) {
			System.out.println("请创建并输入第"+(j+1)+"个学生的基本信息：");
			stu[j] = createStudent();
		}
		
	}
	
	//创建老师对象并赋值
	public static Teacher createTeacher(){
		Teacher tea = new Teacher() ;
		System.out.println("请输入老师的姓名：\t");
		tea.teaName = input.next();
		System.out.println("请输入老师专业：\t");
		tea.teaSpecialty = input.next();
		System.out.println("请输入老师所授课程：\t");
		tea.teaCourse = input.next();
		System.out.println("请输入老师教龄：\t");
		tea.teaYears = input.nextInt();
		return tea;}
	//创建学生对象并赋值
	public static Student createStudent(){
		Student stu = new Student();
		System.out.println("请输入学生姓名：");
		stu.stuName = input.next();
		System.out.println("请输入学生性别数值（1代表男，2代表女）：");
		stu.stuSex = input.nextInt();
		System.out.println("请输入学生年龄：");
		stu.stuAge = input.nextInt();
		System.out.println("请输入学生年级：");
		stu.stuGrade = input.nextInt();
		return stu;
	}
	//创建教师类
	static class  Teacher{
		 String teaName;
		 String teaSpecialty;
		 String teaCourse;
		 int teaYears;
	}
	//创建学生类
	static class Student{
		String stuName;
		int stuSex;
		int stuAge;
		int stuGrade;
		public void learn(){
			System.out.println(stuName+"正在认真学习");
		}
		public String doHomework(int hour){
			return "现在时间"+hour+"点"+stuName+"正在写作业1";
		}
	}
	
}
