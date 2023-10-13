package com.miniproject.SchoolManagement1;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.miniproject.SchoolManagement1.School;

public class SchoolTest 
{
	@Test
   public void searchTest()
	{
		School t1=new School();
		t1.search("101");
		String student_id="101";
		boolean result=t1.search(student_id);
		assertTrue(result);
	  
   }
	@Test
	public void searchTest2() {
		School t1=new School();
		t1.search("101");
		String student_id="102";
		boolean result=t1.search(student_id);
		assertFalse(result);
	}	
	
    @Test
		public void searchTest3()
		{
			School t1=new School();
			t1.search1("101");
			String teacher_id="101";
			boolean result=t1.search(teacher_id);
			assertTrue(result);
		  
	   }
    @Test
	public void searchTest4()
	{
		School t1=new School();
		t1.search1("101");
		String teacher_id="101";
		boolean result=t1.search(teacher_id);
		assertTrue(result);
	  
   }
    
	  
   }
	


