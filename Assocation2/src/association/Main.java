package association;

import java.util.ArrayList;
import java.util.List;

public class Main {

	   static{
		   
		   int i=5;
		   char c='a';
		   System.out.println(c+i);
		   
	   }
	public static void main(String[] args) {
	
		Course c1 = new Course();
		c1.setCourseName("Compiler");
		c1.setCourseCode("cse-4102");
		c1.setCourseCredit(3);
		
		Course c2 = new Course();
		c2.setCourseName("Distributed System");
		c2.setCourseCode("cse-4202");
		c2.setCourseCredit(3);
		
		List<Course> courses = new ArrayList<>();
		courses.add(c1); courses.add(c2);
		
		
		Department mydept = new Department();
		mydept.setDeptName("CSE");
		mydept.setCourses(courses);
		mydept.setCapacity(60);
		
		for(Course obj : mydept.getCourses()){
			System.out.println(
					"CourseName   : "+obj.getCourseName()+"\n"+
					"CourseCode   : "+obj.getCourseCode()+"\n"+
					"CourseCredit : "+obj.getCourseCredit());
			
			System.out.println();
		}
		
		

	}

}
