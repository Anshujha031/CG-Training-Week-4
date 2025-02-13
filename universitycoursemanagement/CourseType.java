package org.example.universitycoursemanagement;

public abstract class CourseType {
    private String courseType;

    public CourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseType;
    }

}

    class ExamCourse extends CourseType {

        public ExamCourse() {
            super("ExamCourse");
        }
    }


    class AssignmentCourse extends CourseType{
    public AssignmentCourse(){
        super("AssignmentCourse");
    }
    }

class ResearchCourse extends CourseType{
    public ResearchCourse(){
        super("ResearchCourse");
    }
}






