package edu.sejong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainClass {
    public static void main( String[] args ){
        Calculator calculator = new Calculator();
        calculator.setFirstNum(10);
        calculator.setSecondNum(10);
        
        calculator.addition();
        calculator.subtraction();
        // ================================================
        // 스프링 활용
        String configLocation = "classpath:appCTX.xml";
        
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        
        //calculator = (Calculator) ctx.getBean("calculator");
        //Calculator.class 는 Calculator.java가 컴파일되어 생성된 파일을 의미한다.
        //형변환하지 않기 위해 클래스 이름을 직접 알려주는 것이다. 
        calculator = ctx.getBean("calculator", Calculator.class);
        
        System.out.println(calculator);
        calculator.setFirstNum(10);
        calculator.setSecondNum(10);
        	
        calculator.addition();
    	calculator.subtraction();
    	calculator.multiplication();
    	calculator.division();
    	
    	MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
    	System.out.println(myCalculator);
    	
    	System.out.println(myCalculator.getFirstNum());
    	System.out.println(myCalculator.getSecondNum());
    	
    	myCalculator.add();
    	myCalculator.sub();
    	
    	
    	//Grade grade = ctx.getBean("grade", Grade.class);
    	Grade grade = (Grade)ctx.getBean("grade");
    	
    	grade.sum();
    	grade.avg();
    	grade.grade();
    	
    	//////////////////////////////////////////
    	ctx = new GenericXmlApplicationContext("classpath:appCTX2.xml");
    	MyInfo myInfo = (MyInfo)ctx.getBean("myInfo");
    	
//    	System.out.println(myInfo.getName());
//    	System.out.println(myInfo.getHeight());
//    	System.out.println(myInfo.getWeight());
//    	System.out.println(myInfo.getHobbys());
    	myInfo.getInfo();
    	
    	//////////////////////////////////////////
    	ctx = new GenericXmlApplicationContext("classpath:appCTX3.xml");
    	Pencil pencil = (Pencil)ctx.getBean("pencil");
    	pencil.use();
    	
    	//////////////////////////////////////////
    	ctx = new GenericXmlApplicationContext("classpath:appCTX4.xml","classpath:appCTX5.xml");
    	Student student1 = (Student) ctx.getBean("student1");
    	System.out.println(student1.getName());
    	System.out.println(student1.getHobbys());
    	
    	StudentInfo studentInfo = (StudentInfo) ctx.getBean("studentInfo1");
    	Student student2 = studentInfo.getStudent();   	
    	
    	if(student1 == student2) {
    		System.out.println("같습니다.");
    	}
    	
    	Student student3 = (Student) ctx.getBean("student2");
    	
    	if(student2 == student3) {
    		System.out.println("같습니다.");
    	}else {
    		System.out.println("같지 않습니다.");
    	}
    }
}
