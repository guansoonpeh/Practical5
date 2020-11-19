
public class Student {
   private String studentID;
   private String name;
   private String school;

    public Student(String studentID, String name, String school) {
        this.studentID = studentID;
        this.name = name;
        this.school = school;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
   
    public static boolean validateStudentID(Student student){
        
       String id = student.getStudentID();
       
       if (student.getSchool().equals("FASC")){
           return id.matches("A\\d{5}");
       }else  if (student.getSchool().equals("FAFB")){
            return id.matches("B\\d{5}");
       }else{
           return false;
       }
        
    }
   

}
