package T1908a.lap5;

public class testPerson {
    public static void main(String[]  args){
        Student stu1 = new Student("Tran Thi Buoi","Viet Nam");
        stu1.addCourseGrade("IM123",123);
        stu1.addCourseGrade("Im1234",234);
        stu1.printGrandes();
        System.out.println("Average is" + stu1.getAverageGrade());

        Teacher t1 = new Teacher("Tran Phuong","American");
        System.out.println(t1);
        String[] courses = {"IM123","IM234","IM12353"};
        for(String course : courses){
            if(t1.addCourse(course)){
                System.out.println(course + "added");
            }else{
                System.out.println(course + " cannot be added");
            }
        }
        for (String course : courses){
            if(t1.removeCourse(course)){
                System.out.println(course+"removed");
            }else{
                System.out.println(course+ " cannot be removed");
            }
        }
    }
}
