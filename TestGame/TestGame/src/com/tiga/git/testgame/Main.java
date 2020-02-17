package com.tiga.git.testgame;

import org.lwjglx.util.vector.Vector2f;

import com.tiga.git.engine.Window;

public class Main implements Runnable {

	public Thread TestGame;
	public Window window;
	public final Vector2f wh = new Vector2f(640, 480);
	
	public void start() {
		
		Thread Testgame = new Thread(this, "TestGame");
		Testgame.start();
		
	}
	
	public void init() {
		
		window = new Window((int) wh.getX(), (int) wh.getY(), "TestGame");
		window.create();
		
	}
	
	public void update() {
		
		window.update();
		
	}
	
	public void render() {
		
		window.swapBuffers();
		
	}
	
	public void run() {
		
		init(); 
		
		while (!window.shouldClose()) {
			
			update();
			render();
			
		}
		
		close();
		
	}
	
	public void close() {
		
		window.destroy();
		
	}
	
	public static void main(String[] args) {
		
		new Main().start();

	}


}
