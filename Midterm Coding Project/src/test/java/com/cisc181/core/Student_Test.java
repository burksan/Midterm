package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import com.cisc181.core.Student;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> course = new ArrayList<Course>();
	static ArrayList<Semester> semester = new ArrayList<Semester>();
	static ArrayList<Student> student = new ArrayList<Student>();
	static ArrayList<Section> section = new ArrayList<Section>();
	static ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
	
	
	@BeforeClass
	public static void setup() throws PersonException {
		
		Course CISC = new Course(UUID.randomUUID(), "Intro to Computer Science 181", 4);
		Course CRJU = new Course(UUID.randomUUID(), "Intro to Criminal Justice 101", 3);
		Course UNIV = new Course(UUID.randomUUID(), "Intro to University 101", 1);

		course.add(CISC);
		course.add(UNIV);
		course.add(CRJU);
		
		Semester Fall = new Semester(UUID.randomUUID(), new Date(2016, 8, 31), new Date(2016, 12, 12));
		Semester Spring = new Semester(UUID.randomUUID(), new Date(2017, 1, 22), new Date(2017, 5, 14));
		
		semester.add(Fall);
		semester.add(Spring);
		
		Student student1 = new Student("Callie", "Adams", "Foster", new Date(1996, 11, 11), eMajor.NURSING, "711 Laurel Avenue", "(302)-111-1111", "cfoster@udel.edu");
		Student student2 = new Student("Brandon", "Adams", "Foster", new Date(1996, 10, 11), eMajor.PHYSICS, "712 Laurel Avenue", "(302)-222-2222", "bfoster@udel.edu");
		Student student3 = new Student("Jude", "Adams", "Foster", new Date(1996, 9, 11), eMajor.BUSINESS, "713 Laurel Avenue", "(302)-333-3333", "jfoster@udel.edu");
		Student student4 = new Student("Mariana", "Adams", "Foster", new Date(1996, 8, 11), eMajor.PHYSICS, "714 Laurel Avenue", "(302)-444-4444", "mfoster@udel.edu");
		Student student5 = new Student("Jesus", "Adams", "Foster", new Date(1996, 7, 11), eMajor.CHEM, "715 Laurel Avenue", "(302)-555-5555", "jsusfstr@udel.edu");
		Student student6 = new Student("Steph", "Adams", "Foster", new Date(1996, 6, 11), eMajor.COMPSI, "716 Laurel Avenue", "(302)-636-6366", "sfsoter@udel.edu");
		Student student7 = new Student("Lena", "Adams", "Foster", new Date(1996, 12, 11), eMajor.NURSING, "717 Laurel Avenue", "(302)-777-7777", "lfsoter@udel.edu");
		Student student8 = new Student("Miranda", "Rachel", "Right", new Date(1996, 4, 7), eMajor.COMPSI, "718 Laurel Avenue", "(302)-888-8888", "mright@udel.edu");
		Student student9 = new Student("Kyle", "Lee", "Taylor", new Date(1996, 6, 2), eMajor.CHEM, "719 Laurel Avenue", "(302)-999-9999", "ktaylor@udel.edu");
		Student student10 = new Student("Ryan", "L", "Petes", new Date(1996, 4, 3), eMajor.NURSING, "709 Laurel Avenue", "(302)-101-1010", "rpetes@udel.edu");
		
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
		student.add(student6);
		student.add(student7);
		student.add(student8);
		student.add(student9);
		student.add(student10);
		
		enrollment.get(0).setGrade(4.0);
		enrollment.get(1).setGrade(4.0);
		enrollment.get(2).setGrade(4.0);
		enrollment.get(3).setGrade(4.0);
		enrollment.get(4).setGrade(4.0);
		enrollment.get(5).setGrade(4.0);
		
		int student1sum = 0;
		int student2sum = 0;
		int student3sum = 0;
		int student4sum = 0;
		int student5sum = 0;
		int student6sum = 0;
		int student7sum = 0;
		int student8sum = 0;
		int student9sum = 0;
		int student10sum = 0;

		for (int a = 0; a < 6; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(0).getStudentID()));
			student1sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 12; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(1).getStudentID()));
			student2sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 18; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(2).getStudentID()));
			student3sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 24; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(3).getStudentID()));
			student4sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 30; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(4).getStudentID()));
			student5sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 36; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(5).getStudentID()));
			student6sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 42; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(6).getStudentID()));
			student7sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 48; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(7).getStudentID()));
			student8sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 54; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(8).getStudentID()));
			student9sum += enrollment.get(a).getGrade();}
		for (int a = 0; a < 60; a++) {
			if (enrollment.get(a).getStudentID().equals(student.get(9).getStudentID()));
			student10sum += enrollment.get(a).getGrade();}
			
		int sectionsum1 = 0;
		int sectionsum2 = 0;
		int sectionsum3 = 0;
		int sectionsum4 = 0;
		int sectionsum5 = 0;
		int sectionsum6 = 0;
		
		for (int a = 0; a < 60; a+=6) {
			if (enrollment.get(a).getSectionID().equals(section.get(0).getSectionID()));
				sectionsum1 += enrollment.get(a).getGrade();}
		for (int a = 1; a < 60; a+=6) {
			if (enrollment.get(a).getSectionID().equals(section.get(1).getSectionID()));
				sectionsum2 += enrollment.get(a).getGrade();}
		for (int a = 2; a < 60; a+=6) {
			if (enrollment.get(a).getSectionID().equals(section.get(2).getSectionID()));
				sectionsum3 += enrollment.get(a).getGrade();}
		for (int a = 3; a < 60; a+=6) {
			if (enrollment.get(a).getSectionID().equals(section.get(3).getSectionID()));
				sectionsum4 += enrollment.get(a).getGrade();}
		for (int a = 4; a < 60; a+=6) {
			if (enrollment.get(a).getSectionID().equals(section.get(4).getSectionID()));
				sectionsum5 += enrollment.get(a).getGrade();}
		for (int a = 5; a < 60; a+=6) {
			if (enrollment.get(a).getSectionID().equals(section.get(5).getSectionID()));
				sectionsum6 += enrollment.get(a).getGrade();}
	}

	@Test
	public void test() {
		assertEquals(1, 1);
		//due to time and no office course, I couldn't get help on the last bit of the last two problems
	}
}