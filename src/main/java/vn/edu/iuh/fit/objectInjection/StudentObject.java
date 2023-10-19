package vn.edu.iuh.fit.objectInjection;

public class StudentObject {
    private ClassObject aClass;
    private String stuName;
    private long stuId;

    public ClassObject getaClass() {
        return aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "aClass=" + aClass +
                ", stuName='" + stuName + '\'' +
                ", stuId='" + stuId + '\'' +
                '}';
    }

    public StudentObject(ClassObject aClass, String stuName, long stuId) {
        this.aClass = aClass;
        this.stuName = stuName;
        this.stuId = stuId;
    }

    public void setaClass(ClassObject aClass) {
        this.aClass = aClass;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public long getStuId() {
        return stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }
}
