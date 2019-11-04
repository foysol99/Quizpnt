package Quiz;

public class Exam1 {


    //create a program which will
    // - take a specific number of student name from the console
    // - for each student, it should ask for 4 subjects name and marks for them all
    // - your code should get the avg marks & total for the each of the students
    // - store all the students name, marks, subjects in individual ArrayList/Hashset and print all subjects, students name from that


    //Tips : You may want to use
    // o handle as many numbers of student user may want to.
    //Think Smartly !


    String name;
    String subject;
    double marks;

    public static void main(String[] args) {
        ;
        Quiz.Exam1 info = new Quiz.Exam1();
        Quiz.Exam1 info2 = new Quiz.Exam1();
        Quiz.Exam1 info1 = new Quiz.Exam1();
        info.name = "Foysol";
        info.subject = "Math";
        info.marks = 65.4;

        info1.name = "Tanveer";
        info1.subject = "Social Science";
        info1.marks = 87.4;


        info2.name = "Nafi";
        info2.subject = "Science";
        info2.marks = 82.3;

        System.out.print(info.name + " ,");
        System.out.print(info.subject + " =");
        System.out.println(info.marks + " ");

        System.out.print(info1.name + " ,");
        System.out.print(info1.subject + " =");
        System.out.println(info1.marks + " ");

        System.out.print(info2.name + " ,");
        System.out.print(info2.subject + " =");
        System.out.println(info2.marks + " ");
    }
}
