package com.example.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=false)
@EnableSwagger2
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

//	public static void WriteObjectToFile(Object serObj) {
//
//		try {
//			FileOutputStream fileOut = new FileOutputStream("/Users/dilipkaushalye/Documents/test-file/student.txt", true);
//			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//			objectOut.writeObject(serObj);
//			objectOut.close();
//			System.out.println("The Object  was succesfully written to a file");
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//
//	public static void readObjectToFile() {
//
//		try {
//
//			FileInputStream fi = new FileInputStream(new File("/Users/dilipkaushalye/Documents/test-file/student.txt"));
//			ObjectInputStream oi = new ObjectInputStream(fi);
//
//			// Read objects
//			Student pr1 = (Student) oi.readObject();
//
//			System.out.println("Student: "+pr1);
//			System.out.println("Student: "+(Student) oi.readObject());
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}

}
