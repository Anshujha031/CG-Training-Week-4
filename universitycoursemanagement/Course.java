package org.example.universitycoursemanagement;

public class Course <T extends CourseType>{
    T CourseType ;
    public Course(T CourseType){
        this.CourseType = CourseType;
    }

    public void display(){
        System.out.println(CourseType.getCourseName());
    }
}
