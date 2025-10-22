package Student;

class Student {
    private int StuID = 1;
    private final String Department="CE";
    private String StuName;
    private int Semester;
    
    public Student(String StuName, int Semester){
    setStuID(this.StuID);
    int ID = this.StuID;
    this.StuID=ID;
    this.StuName=StuName;
    this.Semester=Semester;
    }
    
    public int getStuID(){
    return StuID;
    }
    public void setStuID(int StuID){
    StuID = StuID + 1;
    }
    public String getStuName(){
    return StuName;
    }
    public String getDepartment(){
    return Department;
    }
    public int getSemester(){
    return Semester;
    }
    
    void display(){
        System.out.println("Student ID: "+StuID);
        System.out.println("Student Name: "+StuName);
        System.out.println("Department: "+Department);
        System.out.println("Semester: "+Semester);
      }

}
