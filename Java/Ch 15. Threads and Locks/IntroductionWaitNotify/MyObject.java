package IntroductionWaitNotify;

public class MyObject {
    public synchronized void foo(String name) throws InterruptedException {
        this.wait(1000);
        System.out.println("Thread " + name + ".foo(): starting");
        Thread.sleep(3000);
        System.out.println("Thread " + name + ".foo(): ending");
        this.notify();
    }
}
