package vn.edu.iuh.fit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.edu.iuh.fit.collectionInjection.Person;
import vn.edu.iuh.fit.objectInjection.StudentObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//  println Teo
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("teo.xml");
//        Student student = ctx.getBean("t2", Student.class);
//        System.out.println(student);

//  println Object
//        ApplicationContext context = new ClassPathXmlApplicationContext("objectInjection.xml");
//        StudentObject student_ = context.getBean("st1",StudentObject.class);
//        System.out.println(student_);

//  println Collection
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionInjection.xml");
        Person per = context.getBean("person", Person.class);
        System.out.println(per);
    }
}