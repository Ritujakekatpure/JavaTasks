package Student;

public class Student {
  private int rollno;
  private String name;
  private String course;
  private double marks1;
  private double marks2;
  private double marks3;

  public int getRollNumber() {
    return rollno;
  }

  public void setRollNumber(int rollno) {
    this.rollno = rollno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public double getMarks1() {
    return marks1;
  }

  public void setMarks1(double marks1) {
    this.marks1 = marks1;
  }

  public double getMarks2() {
    return marks2;
  }

  public void setMarks2(double marks2) {
    this.marks2 = marks2;
  }

  public double getMarks3() {
    return marks3;
  }

  public void setMarks3(double marks3) {
    this.marks3 = marks3;
  }

  public String toString() {
    return "Student{" + "rollno=" + rollno + ", name=" + name + ", course=" + course + ", marks1=" + marks1
        + ", marks2=" + marks2 + ", marks3=" + marks3 + " }";
  }

  public double calculateTotal() {
    return marks1 + marks2 + marks3;
  }

  public double calculateAverage() {
    return (marks1 + marks2 + marks3)/3;
  }

  public String calculateGrade()
  {
    double av=calculateAverage();
    if(av>=90)
    {
       return "A+";
    }
    else if(av>=75)
    {
       return "A";
    }
    else if(av>=65)
    {
       return "B";
    }
    else if(av>=55)
    {
       return "C";
    }else if(av>=45)
    {
       return "D";
    }
    else{
      return "Fail";
    }
  }

  }

