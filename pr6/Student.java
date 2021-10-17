package pr6;

import java.util.Random;

class Student implements Comparable <Student> {
    private int id;
    private int GPA;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
    @Override
    public String toString ()
    {
        return "Student{ " + "id = " + id + ", GPA = " + GPA + " }";
    }

    @Override
    public int compareTo (Student o)
    {
        return o.GPA - this.GPA;
    }
    public static Student [] getSamples (boolean flag)
    {
        Student[] students = new Student[10];
        if (flag == true) {
            for (int i = 0; i < 10; i++)
            {
                Student student = new Student ();
                student.setId((int) (Math.random() * 1000));
                students[i] = student;
            }
        }
        else
        {
            for (int i = 0; i < 10; i++)
            {
                Student student = new Student ();
                student.setGPA(( (int) (Math.random() * 4)+2));
                students[i] = student;
            }
        }
        return students;
    }

}