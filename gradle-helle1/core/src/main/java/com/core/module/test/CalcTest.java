package com.core.module.test;


import java.util.ArrayList;
import java.util.List;

public class CalcTest {
	public static void main(String[] args) {
		//�����洢�����µ�����
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("����",7));//7������
		empList.add(new Employee("����",8));//8������
		empList.add(new Employee("����",9));//9������
		empList.add(new Employee("����",10));//10������
		empList.add(new Employee("����",11));//6������
		empList.add(new Employee("����",12));//12������
		String empName=empList.get(0).getName();//��ȡ������ĳ���ֶε�ֵ������������5�������Ƚ�
		int count=1;//���ִ�����Ĭ��һ��
		//�������
		String empName1="";//�����Ƚϵ�
		for (int i = 1; i < 6; i++) {
			empName1=empList.get(i).getName();
			if(empName1.equals(empName)){
				if(++count>3){
					System.out.println("�����Ĵ���");
					break;
				}
			}
		}
		System.out.println("���ִ�����"+count);
	}
}

class Employee {
	//����name���жϳ���4��
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
