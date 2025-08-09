package IntroductionA;

public class ExampleA {

	public static void main(String[] args) {
		RunnableThreadExample instance = new RunnableThreadExample();
		Thread thread = new Thread(instance);
		thread.start();
		
		/* waits until earlier thread counts to 5 (slowly) */
        /*
		while (instance.count != 5) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}
        */
        try {
            thread.join(); // Main thread waits for workerThread to complete
            System.out.println("Main thread resumed after worker thread completed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.out.println("Main thread interrupted while waiting.");
        }
		System.out.println("Program Terminating.");
	}
}
