package com.ea;

import java.awt.im.InputContext;
import java.util.HashMap;

import org.testng.annotations.Test;

public class  Charactercount
{
	
	
	public void test1(String InputString) {
		
		HashMap<Character, Integer> charactercount= new HashMap<Character,Integer>();
			
			char[]strarray=InputString.toCharArray();
			
			
			for (char c:strarray) {
				
			if (charactercount.containsKey(c)) {
				charactercount.put(c, charactercount.get(c)+1);
			}else {
				charactercount.put(c,1);
				
			}

			}
			System.out.println(charactercount);
			}
				
	
		
		@Test
		public void test2() {
			String inputstring="My name is Mirja";
			test1(inputstring);
			
		}
		
	
}