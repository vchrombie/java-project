package studentDiary;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Library implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Dues due;
    Date issue, dueDate;
    int issueNo=0;
    Books book;
    public Library(){
        due = new Dues();
        book = new Books();
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        issue = cal.getTime();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        dueDate = cal.getTime();
    }
    public Dues getDue(){
        return due;
    }
    public Library(Dues due, Books book){
        this.due = due;
        this.book = book;
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        issue = cal.getTime();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        dueDate = cal.getTime();
    }
    public void extendDueDate(){
    if(issueNo>=2){
        System.out.println("Cannot extend any longer.Please return immediately to avoid fine");
    }
    else{
        issueNo++;
        Calendar cal = Calendar.getInstance();
        cal.setTime(dueDate);
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        dueDate = cal.getTime();
    }
    }
    public String toString(){
        SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
        return book.toString() + "\nIssue date" + dateOnly.format(issue) + "\nDue date:" + dateOnly.format(dueDate) + "\nFine(if any):" + due.getFine() +"₹";

    }

    public void addFine(){
        due.addDues();
    }


}
