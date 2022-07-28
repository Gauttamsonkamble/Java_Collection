package com.java;

public class Students {

		private int roll;
		private String name;
		private float per;
		
		public  Students()
		{
			super();
		}
		
		public Students(int roll, String name, float per) {
			super();
			this.roll = roll;
			this.name = name;
			this.per = per;
		}
		
				@Override
		public String toString() {
			return "Students [roll=" + roll + ", name=" + name + ", per=" + per + "]";
		}
		
		

	}


