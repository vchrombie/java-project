package studentDiary;

import java.io.Serializable;
import java.util.ArrayList;

public class Semester implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int no;
    ArrayList<Course> courses;
    SGPA sgpa;
    
    Semester(){

    }
    
    Semester(int no){
        this.no = no;
        courses = new ArrayList<Course>();
        sgpa = new SGPA();
    }
    
    public void addCourse(){
        Course c = new Course();
        c.addCourse();
        courses.add(c);
    }
    
    public void calculateSGPA(){
        sgpa.setSGpa(courses);
    }
    
    public String toString(){
        String s = " ";
        for(Course i:courses)
            s += i.toString();
        return "Semester No:" + no + '\n' + s + sgpa.toString();
    }
    
    public void print(){
        System.out.println(this.toString());
    }

}
