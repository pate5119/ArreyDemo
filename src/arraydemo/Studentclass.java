
package arraydemo;


public class Studentclass {
   
    private String  studentID ;
    private String  studentname ;

    public Studentclass(String studentID, String studentname) {
        this.studentID = studentID;
        this.studentname = studentname;
    }
    
    
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    
    
}
