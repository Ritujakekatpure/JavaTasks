package Student;

public class StudentTest {
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();

        s1.setRollNumber(101);
        s1.setName("Rituja");
        s1.setCourse("C++");
        s1.setMarks1(79);
        s1.setMarks2(68);
        s1.setMarks3(69);

        s2.setRollNumber(102);
        s2.setName("Shruti");
        s2.setCourse("Java");
        s2.setMarks1(77);
        s2.setMarks2(86);
        s2.setMarks3(64);

        s3.setRollNumber(103);
        s3.setName("Nidhi");
        s3.setCourse("Python");
        s3.setMarks1(70);
        s3.setMarks2(78);
        s3.setMarks3(80);

        s4.setRollNumber(104);
        s4.setName("Rishabh");
        s4.setCourse("C++");
        s4.setMarks1(66);
        s4.setMarks2(82);
        s4.setMarks3(65);

        s5.setRollNumber(105);
        s5.setName("Rishi");
        s5.setCourse("JavaScript");
        s5.setMarks1(49);
        s5.setMarks2(58);
        s5.setMarks3(60);

        System.out.println(s1);
        System.out.println(s1.calculateGrade());
        System.out.println(s2);
        System.out.println(s2.calculateGrade());
        System.out.println(s3);
        System.out.println(s3.calculateGrade());
        System.out.println(s4);
        System.out.println(s4.calculateGrade());
        System.out.println(s5);
        System.out.println(s5.calculateGrade());

    }
}
