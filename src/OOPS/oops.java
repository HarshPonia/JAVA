package OOPS;

public class oops {

        public static void main(String[] args) {
                Students student;
                student = new Students();
                System.out.println(student);

                System.out.println(student.firstname +student.lastname);
                System.out.println("\n----------\n");

                student.fullname();

                System.out.println(student.roll_no);
                System.out.println(student.section);

//                Students students = new Students();

//                System.out.println(new Students());


        }

}
