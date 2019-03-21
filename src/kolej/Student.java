package kolej;

public class Student {
	protected int id;
	protected String studName;
	protected String icNum;
	protected int matrixID;
	protected int contactNum;
	protected String email;
	protected String course;

	public Student() {
	}

	public Student(int id) {
		this.id = id;
	}

	public Student(int id, String studName, String icNum, int matrixID, int contactNum, String email, String course) {
		this(studName, icNum, matrixID, contactNum, email, course);
		this.id = id;
	}
	
	public Student(String studName, String icNum, int matrixID, int contactNum, String email, String course) {
		this.studName = studName;
		this.icNum = icNum;
		this.matrixID = matrixID;
		this.contactNum = contactNum;
		this.email = email;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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