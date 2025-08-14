package com.example;



import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    private List<Course> courses = new ArrayList<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void addCourse() {
        if (applicationContext.containsBean("Maths")) {
            Course math = applicationContext.getBean("Maths", Course.class);
            courses.add(math);
        }
    }

    public void showCourses() {
        for (Course c : courses) {
            System.out.println("Teacher has course: " + c.getName());
        }
    }
}
