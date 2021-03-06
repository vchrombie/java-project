package studentDiary;


import java.io.Serializable;
import java.util.Scanner;

public class Course implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    Scanner s = new Scanner(System.in);

	String courseName;
    String courseCode;
    FirstPeriodicalMark fpm;
    SecondPeriodicalMark spm;
    EndSemesterMark endsem;
    InternalMark im;
    ContinuousAssessmentMark cam;
    GPA gpa;
    boolean supply = false;

    public Course() {
        fpm = new FirstPeriodicalMark();
        spm = new SecondPeriodicalMark();
        endsem = new EndSemesterMark();
        im = new InternalMark();
        cam = new ContinuousAssessmentMark();
        gpa = new GPA();
    }

    public void addCourse() {
        System.out.println("Enter course name and code");
        courseName = s.nextLine();
        courseCode = s.nextLine();
    }

    public void CalculateInternal() {
        im.setMark(fpm, spm, cam);
    }

    public void CalculateGPA() {
        gpa.setGpa(im, endsem);
    }
    
    public String toString(){
        return "Course name:" + courseName + '\n' + "Course code:" + courseCode + '\n' +fpm.toString() + spm.toString() + endsem.toString() + im.toString() + cam.toString() + gpa.toString();
    }
    
    public void print() {
        System.out.println(toString());
    }
    
    public void addSupply(){
        supply = true;
    }
    
}

