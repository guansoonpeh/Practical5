
public class PAQ2 {
    
    
    public static void main(String[] args) {
        
        Student s1 = new Student("W12345", "John", "FAFB");
        
        
        System.out.println( (Student.validateStudentID(s1)? "Valid ID" : "Invalid ID")  );
        
    }
}
