package kolej;

public class StudentBean {
	
    private String studName;
    private String icNum;
    private String matrixID;
    private String contactNum;
    private String email;
    private String course;
    public boolean valid;
	
    public String getStudName() {
       return studName;
	}

    public void setStudName(String newStudName) {
    	studName = newStudName;
	}

	
    public String getICNum() {
       return icNum;
			}

    public void setICNum(String newIcNum) {
       icNum = newIcNum;
			}
			

    public String getMatrixID() {
       return matrixID;
	}

    public void setMatrixID(String newMatrixID) {
       matrixID = newMatrixID;
	}
	
			
    public String getContactNum() {
       return contactNum;
			}

    public void setContactNum(String newContactNum) {
       contactNum = newContactNum;
			}
    
    public String getEmail() {
        return email;
 			}

     public void setEmail(String newEmail) {
        email = newEmail;
 			}
     
     public String getCourse() {
         return course;
  			}

      public void setCourse(String newCourse) {
         course = newCourse;
  			}
      
      public boolean isValid() {
          return valid;
   	}

       public void setValid(boolean newValid) {
          valid = newValid;
   	}	
}