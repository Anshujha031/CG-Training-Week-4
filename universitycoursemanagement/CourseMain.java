package org.example.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class CourseMain {
    public static void main(String[] args) {
        Course<ExamCourse> cex = new Course<>(new ExamCourse());
        Course<AssignmentCourse> ca = new Course<>(new AssignmentCourse());
        Course<ResearchCourse> cr = new Course<>(new ResearchCourse());

        List<Course<? extends CourseType>> courses = new ArrayList<>();
        courses.add(cex);
        courses.add(ca);
        courses.add(cr);

        for(Course<? extends CourseType> course : courses){
            course.display();
        }

    }
}
