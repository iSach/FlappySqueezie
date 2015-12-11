package be.isach.flappysqueezie;

/**
 * Created by Sacha on 10/12/15.
 */
public class Main implements Runnable {

    private final int WIDTH = 1280, HEIGHT = 720;

    private Thread thread;

    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        thread = new Thread(this, "Game Main Thread");
        thread.start();
    }

    public void run() {

    }

}
