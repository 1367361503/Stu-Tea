package teacher_students;

import java.util.Scanner;

public class TestStuTea {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Student[] stu = new Student[4];
		Teacher[] tea = new Teacher[2];
		for (int i = 0; i < tea.length; i++) {
			System.out.println("�봴���������"+(i+1)+"����ʦ�Ļ�����Ϣ��");
			tea[i] = createTeacher();
		}
		for (int j = 0; j < stu.length; j++) {
			System.out.println("�봴���������"+(j+1)+"��ѧ���Ļ�����Ϣ��");
			stu[j] = createStudent();
		}
		
	}
	
	//������ʦ���󲢸�ֵ
	public static Teacher createTeacher(){
		Teacher tea = new Teacher() ;
		System.out.println("��������ʦ��������\t");
		tea.teaName = input.next();
		System.out.println("��������ʦרҵ��\t");
		tea.teaSpecialty = input.next();
		System.out.println("��������ʦ���ڿγ̣�\t");
		tea.teaCourse = input.next();
		System.out.println("��������ʦ���䣺\t");
		tea.teaYears = input.nextInt();
		return tea;}
	//����ѧ�����󲢸�ֵ
	public static Student createStudent(){
		Student stu = new Student();
		System.out.println("������ѧ��������");
		stu.stuName = input.next();
		System.out.println("������ѧ���Ա���ֵ��1�����У�2����Ů����");
		stu.stuSex = input.nextInt();
		System.out.println("������ѧ�����䣺");
		stu.stuAge = input.nextInt();
		System.out.println("������ѧ���꼶��");
		stu.stuGrade = input.nextInt();
		return stu;
	}
	//������ʦ��
	static class  Teacher{
		 String teaName;
		 String teaSpecialty;
		 String teaCourse;
		 int teaYears;
	}
	//����ѧ����
	static class Student{
		String stuName;
		int stuSex;
		int stuAge;
		int stuGrade;
		public void learn(){
			System.out.println(stuName+"��������ѧϰ");
		}
		public String doHomework(int hour){
			return "����ʱ��"+hour+"��"+stuName+"����д��ҵ1";
		}
	}
	
}
