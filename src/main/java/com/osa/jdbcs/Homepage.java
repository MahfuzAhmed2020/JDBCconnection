package com.osa.jdbcs;

import com.osa.sqlhelper.Common;

public class Homepage {
	public static void main(String[] args) {
//		int numberOfEmails=Common.getMockdata().getEmailAddress().length();
//		for( int i=0; i<numberOfEmails; i++) {
//			System.out.println(Common.getMockdata().getEmailAddress());
//		}
		 for(int i=0; i<Common.getAddress().size(); i++) {
			 System.out.println(Common.getAddress().get(i).getCity());
		 }
	}


}
