import java.time.LocalDate;

public class Student 
{
    private int stuId;
    private String stuName;
    private LocalDate dob;
    private String course;
    private long mobileNo;
    private char gender;
    private String joiningDate;
    private boolean isMembershipExpired;
    public Student() {
    }
    public Student(int stuId, String stuName, LocalDate dob, String course, long mobileNo, char gender,
            String joiningDate, boolean isMembershipExpired) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.dob = dob;
        this.course = course;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.joiningDate = joiningDate;
        this.isMembershipExpired = isMembershipExpired;
    }
    public int getStuId() {
        return stuId;
    }
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
    public boolean isMembershipExpired() {
        return isMembershipExpired;
    }
    public void setMembershipExpired(boolean isMembershipExpired) {
        this.isMembershipExpired = isMembershipExpired;
    }
    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", stuName=" + stuName + ", dob=" + dob + ", course=" + course
                + ", mobileNo=" + mobileNo + ", gender=" + gender + ", joiningDate=" + joiningDate
                + ", isMembershipExpired=" + isMembershipExpired + "]";
    }
}