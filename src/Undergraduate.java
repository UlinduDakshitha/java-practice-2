public class Undergraduate extends Students{
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String reSearchTopic) {
        this.courseName = courseName ;
    }

    @Override
    public double calculateGrade() {
        return getMarks();
    }
}
