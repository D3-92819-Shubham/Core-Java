package sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import domain.*;
import util.StudentCityMarksName;

import domain.Student;

public class Program {
	
	public static void printStudent(Student [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
	
	public static Student[] getInstance() {
		Student[] arr = new Student[5];
		arr[1] = new Student (1, "omkar", "satara", 85);
		arr[2] = new Student (2, "sahil", "nagpur", 95);
		arr[3] = new Student (3, "shubham", "satara", 80);
		arr[4] = new Student (4, "om", "vaduj", 87);
		arr[0] = new Student (5, "karan", "dharashiv", 82);
        
	    return arr;
	}
	public static void main(String[] args) {
		
		Student [] arr = getInstance();
		
		System.out.println("Before Sorting");
		printStudent(arr);
		Arrays.sort(arr, new StudentCityMarksName());
		System.out.println();
		System.out.println("After Sorting");
		printStudent(arr);
		
		
	}

}
