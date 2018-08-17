package com.leetcode;
//string to int  consider about some situation
public class _008_StringToInteger {

		public static int toMyAtoi(String str){
			if(str.isEmpty()) return 0;
			int sign = 0,base = 0, i=0, n=str.length();
			while(i<n&& str.charAt(i)== ' ') ++i;
			if(str.charAt(i) =='+' || str.charAt(i) =='-'){
				sign = (str.charAt(i++) =='+')? 1 : -1;
			}
			while(i < n && str.charAt(i) >='0' 
				&& str.charAt(i) <= '9'){
				if(base > Integer.MAX_VALUE /10 ||(base == Integer.MAX_VALUE /10)
						&& str.charAt(i) - '0' >7){
					return (sign ==1 )?Integer.MAX_VALUE :Integer.MIN_VALUE;
				}
				base = 10*base + (str.charAt(i++) - '0' );
			}
			return base *sign;
		}
		public static void main(String[] args) {
			String str = "  -89C ";
			System.out.println("xRE:"+toMyAtoi(str));
				
		}
}