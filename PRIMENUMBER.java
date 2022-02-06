package com.capgemini.sfdc;

public class PRIMENUMBER {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=100;
			int num1=2;
			System.out.println("List of Prime numners upto 100="+ num);
			if(num1==1) System.out.println("its not a prime");
			else {
			for(int i=num1;i<=num;i++) {
				int count=2;
				for(int j=2;j<i;j++) {
					if(i%j==0)
						count++;
				}
				if(count==2) {
					System.out.println(i);
				}
			}
	}

}
}
