package com.core.module.test;


import java.util.ArrayList;
import java.util.List;

public class CalcTest {
	public static void main(String[] args) {
		//用来存储六个月的数据
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("张三",7));//7月数据
		empList.add(new Employee("王五",8));//8月数据
		empList.add(new Employee("张三",9));//9月数据
		empList.add(new Employee("张三",10));//10月数据
		empList.add(new Employee("李四",11));//6月数据
		empList.add(new Employee("张三",12));//12月数据
		String empName=empList.get(0).getName();//获取第七月某个字段的值，用来和其他5个月做比较
		int count=1;//出现次数，默认一次
		//便利五次
		String empName1="";//用来比较的
		for (int i = 1; i < 6; i++) {
			empName1=empList.get(i).getName();
			if(empName1.equals(empName)){
				if(++count>3){
					System.out.println("出现四次了");
					break;
				}
			}
		}
		System.out.println("出现次数："+count);
	}
}

class Employee {
	//假设name是判断出现4次
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
