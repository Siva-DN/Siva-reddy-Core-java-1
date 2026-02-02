package com.exceptionhandiling;

//Try with Multiple catches..?
public class TryWithMultipleCatches1 {

	public static void main(String[] args) {
		System.out.println("main method Started !!");

		try {
			System.out.println("In Try ");
			System.out.println(10 / 2);
//			System.out.println(0 / 0);//AE
			System.out.println(0.0/ 0.0);//NAN(Not A Number)
			System.out.println(10.0 / 0);//Infinity
			System.out.println(10.5/0.0);//Infinity
			System.out.println(10);
			
		} catch (ArithmeticException ae) {
			System.err.println("In catch AR !!!");
			System.out.println(ae.getMessage());

		} catch (NullPointerException Np) {
			System.err.println("In catch NP !!!");
			System.out.println(Np.getMessage());

		} catch (Exception e) {
			System.err.println("In catch Ex !!!");
			System.out.println(e.getMessage());

		}
		System.out.println("main method ended !!!");

	}

}
