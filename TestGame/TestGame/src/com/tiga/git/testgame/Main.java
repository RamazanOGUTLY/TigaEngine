package com.tiga.git.testgame;

import com.tiga.git.engine.Window;

public class Main implements Runnable {

	public Thread TestGame;
	public Window window;
	public final int width = 640, height = 480;
	
	public void start() {
		
		TestGame = new Thread(this, "TestGame");
		TestGame.start();
		
	}
	
	public void init() {
		
		window = new Window(width, height, "RetroCraft");
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
