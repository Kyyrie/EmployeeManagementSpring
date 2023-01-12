package org.snva.ems;

import org.snva.ems.config.UserConfig;
import org.snva.ems.uiservices.IEmployeeUIService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world!");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(UserConfig.class);
        annotationConfigApplicationContext.refresh();
        //annotationConfigApplicationContext.getBean("reader")
        IEmployeeUIService bufferedReader = (IEmployeeUIService) annotationConfigApplicationContext.getBean("employeeUIServiceImpl");
        Runner runner = (Runner) annotationConfigApplicationContext.getBean("Runner");
        runner.checkUserOptions();

        /*try {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


    }
}