package be.isach.flappysqueezie;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Created by Sacha on 10/12/15.
 */
public class Main implements Runnable {

    /**
     * Resolution of the game.
     */
    private final int WIDTH = 1280, HEIGHT = 720;

    /**
     * Main Game Thread.
     */
    private Thread thread;

    /**
     * {@code true} if game is running, otherwise {@code false}.
     */
    private boolean running = false;

    /**
     * Window ID.
     */
    private long window;

    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        thread = new Thread(this, "Game Main Thread");
        thread.start();
        running = true;
    }

    public void run() {
        init();
        while (running) {
            update();
            render();
        }
    }

    public void init() {
        if (glfwInit() == GL_FALSE) {
            //TODO
        }
        glfwWindowHint(WIDTH, HEIGHT);
        window = glfwCreateWindow(WIDTH, HEIGHT, "Flappy Squeezie", NULL, NULL);

    }

    public void update() {

    }

    public void render() {

    }

}
