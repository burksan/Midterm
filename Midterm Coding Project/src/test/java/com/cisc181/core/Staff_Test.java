package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> staff = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() throws PersonException {
	
		
		Staff staff1 = new Staff("Callie", "Adams", "Foster", new Date(1996, 11, 11), "711 Main Street", "(302)-111-1111", "cfoster@udel.edu", "12pm-3pm", 3, 100000, new Date(2012, 6, 15), eTitle.MS);
		Staff staff2 = new Staff("Brandon", "Adams", "Foster", new Date(1996, 10, 11), "712 Main Street", "(302)-222-2222", "bfoster@udel.edu","3pm-4pm", 3, 150000, new Date(2012, 6, 15), eTitle.MR);
		Staff staff3 = new Staff("Jude", "Adams", "Foster", new Date(1996, 9, 11),  "713 Main Street", "(302)-333-3333", "jfoster@udel.edu","4pm-6pm", 3, 600050, new Date(2012, 6, 15), eTitle.MR);
		Staff staff4 = new Staff("Mariana", "Adams", "Foster", new Date(1996, 8, 11), "714 Main Street", "(302)-444-4444", "mfoster@udel.edu","6pm-10pm", 3, 525600, new Date(2012, 6, 15), eTitle.MS);
		Staff staff5 = new Staff("Jesus", "Adams", "Foster", new Date(1996, 7, 11),  "715 Main Street", "(302)-555-5555", "jsusfstr@udel.edu", "11am-1pm", 3, 430000, new Date(2012, 6, 15), eTitle.MR);
		Staff staff6 = new Staff("Steph", "Adams", "Foster", new Date(1996, 6, 11), "716 Laurel Avenue", "3026366366", "sfsoter@udel.edu", "11am-1pm", 3, 430000, new Date(2012, 6, 15), eTitle.MRS);
		Staff staff7 = new Staff("Lena", "Adams", "Foster", new Date(2019, 12, 11),  "717 Laurel Avenue", "(302)-777-7777", "lfsoter@udel.edu", "11am-1pm", 3, 430000, new Date(2012, 6, 15), eTitle.MRS);
	
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
