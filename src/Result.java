import java.util.Scanner;
public class Result {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Students[] students=new Students[10];

        for(int i=0;i<10;i++){

            System.out.print("Enter your name:");
            String name=sc.next();

            System.out.print("Enter your registeration number:");
            String regNo= sc.next();

            System.out.print("Enter your marks:");
            double marks= sc.nextDouble();

            System.out.print("Enter your type:");
            String type= sc.next();

            switch (type){

                case "Undergraduate":
                    Undergraduate undergraduate=new Undergraduate();
                    undergraduate.setName(name);
                    undergraduate.setRegNo(regNo);
                    undergraduate.setMarks(marks);
                    undergraduate.setCourseName("Computer science");
                    students[i]=undergraduate;

                case "Postgraduate":
                    Postgraduate postgraduate=new Postgraduate();
                    postgraduate.setName(name);
                    postgraduate.setRegNo(regNo);
                    postgraduate.setMarks(marks);
                    postgraduate.setReSearchTopic("computer");
                    students[i]=postgraduate;


                case "Diploma":
                    Diploma diploma=new Diploma();
                    diploma.setName(name);
                    diploma.setRegNo(regNo);
                    diploma.setMarks(marks);
                    diploma.setDuration(4);
                    students[i]=diploma;

            }

        }
        
    }
}
