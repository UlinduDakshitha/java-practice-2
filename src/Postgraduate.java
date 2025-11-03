public class Postgraduate extends Undergraduate {
    private String reSearchTopic;

    public String getReSearchTopic() {
        return reSearchTopic;
    }

    public void setReSearchTopic(String reSearchTopic) {
        this.reSearchTopic = reSearchTopic;
    }

    @Override
    public double calculateGrade() {
         return getMarks();
    }
}
