package T1908a.lap5;

public class Teacher extends Person {
    private int numCourses =0;
    private String[] courses;
    private static final int MAX_COURSES = 5;
    public Teacher(String name,String address ){
        super(name,address);
        this.numCourses = 0;
        courses = new String[MAX_COURSES];
    }
    @Override
    public String toString(){
        return "Teacher :" +super.toString();
    }
    public boolean addCourse( String course){
        for(int i = 0 ; i<numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
        }
            courses[numCourses] = course;
            numCourses ++;
            return true;
    }
    //Removes a course . Returns false if the course cannot be found in the course list
    public boolean removeCourse(String course){
        boolean found = false;
        int cournseIndex = -1 ;
        for(int i = 0 ; i< numCourses ; i++){
            if(courses[i].equals(course)){
                cournseIndex = i;
                found = true;
                break;
            }
        }
        if(found){
            for( int i = cournseIndex ; i<numCourses-1;i++){
                courses[i] = courses[i+1];
            }
            numCourses --;
            return true;
        }else{
            return false;
        }
    }
}
