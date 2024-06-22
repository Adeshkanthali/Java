package Github.MultiThreading;

public class Demo {
    static class Hii extends Thread{

        @Override
        public void run() {                                // run method
            System.out.println("In run method");
            System.out.println(Thread.currentThread().getName());
        }

    }

    static class Hello implements Runnable{

        @Override
        public void run() {
            System.out.println("In run Hello method");
            System.out.println(Thread.currentThread().getName());
        }

        public static void main(String[] args) {

            System.out.println("In main thread");
            System.out.println(Thread.currentThread().getName());

            Hii hii = new Hii();                         // Hii method object
            hii.start();                                //call hii method in multithreading

            Hello hello = new Hello();                  // Hello method
            Thread t1 = new Thread(hello);
            t1.start();

        }
    }
}
