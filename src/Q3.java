
public class Q3 {
    public static void main(String[] args) {
   
        if( args == null || args.length == 0 ){
            System.err.println("Invalid data input");
            System.exit(-1);
        }
        
        String fName = "";
        String title ="";
        String sName = "";
        
        for(int i=0; i<args.length; i++){
            String temp = args[i];
            boolean found = false;
            
            if (i == args.length -1){
                title = temp;
            }else{
                
                if (temp.matches("\\[.*\\]") ) { //check for "["  "]"
                    temp = temp.replace('[', '\u0000');
                    temp = temp.replace(']', '\u0000');
                    
                   sName = temp.substring(0, 2).toUpperCase() + 
                           temp.substring(2).toLowerCase();
                   found = true;
                   
                }

                if(!found){
                    fName +=  temp.substring(0,1).toUpperCase() +
                          temp.substring(1).toLowerCase() + " ";
                }else{
                    fName += sName + " ";
                }
             
            }
   
        }
               
        System.out.println("To "+ fName);
        System.out.println("Wishing you a Merry Christmas, " + title + " " + sName);
        
        
    }
    
}
