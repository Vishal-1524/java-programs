package practice;

public class pirmeNumber 
{
	 public static void main(String[] args) {
	        System.out.println("Prime numbers from 1 to 50:");
	        for (int i = 2; i <= 50; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime==true) {
	                System.out.print(i + " ");
	            }
	        }
	    }
}
