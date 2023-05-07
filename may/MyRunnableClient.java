package may;

public class MyRunnableClient {
	 public static void main(String[] args) {
	        
	        MyRunnable runnable = new MyRunnable();
	        
	        Thread thread1 = new Thread(runnable);
	        
	        thread1.start();
	        
	        for(int i=0;i<=10;i++) {
	            System.out.println("main thread");
	        }

	    }

	}

