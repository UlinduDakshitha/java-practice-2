public class Diploma extends Postgraduate {
    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public double calculateGrade() {
         return getMarks();
    }
}
