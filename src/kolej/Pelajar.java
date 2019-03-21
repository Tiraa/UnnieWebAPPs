package kolej;

public class Pelajar {
	private Long id;
	private String studName;
	private String icNum;
    private int matrixID;
    private int contactNum;
    private String email;
    private String course;
 
    public Pelajar() {
        // Do Nothing
    }
 
    public Pelajar(String studName, String icNum, int matrixID, int contactNum, String email, String course) {
        this.studName = studName;
        this.icNum = icNum;
        this.matrixID = matrixID;
        this.contactNum = contactNum;
        this.email = email;
        this.course = course;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getStudName() {
        return studName;
    }
 
    public void setStudName(String studName) {
        this.studName = studName;
    }
 
    public String getICNum() {
        return icNum;
    }
 
    public void setICNum(String icNum) {
        this.icNum = icNum;
    }
    
    public int getMatrixID() {
        return matrixID;
    }
 
    public void setMatrixID(int matrixID) {
        this.matrixID = matrixID;
    }
    
    public int getContactNum() {
        return contactNum;
    }
 
    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCourse() {
        return course;
    }
 
    public void setCourse(String course) {
        this.course = course;
    }
}