package IntroductionB;

public class ExampleB {
	public static void main(String args[]) {
		ThreadExample instance = new ThreadExample();
		instance.start();
		
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
            instance.join(); // Main thread waits for workerThread to complete
            System.out.println("Main thread resumed after worker thread completed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.out.println("Main thread interrupted while waiting.");
        }
        System.out.println("Program Terminating.");
    }
}
