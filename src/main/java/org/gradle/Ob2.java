package org.gradle;

import java.util.Observable;
import java.util.Observer;

public class Ob2 {
	static class IntObservable extends Observable implements Runnable {
		
		public void run() {
			for (int i=0; i <= 10; i++) {
				setChanged();
				notifyObservers(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Observer ob = new Observer() {
			public void update(Observable o, Object arg) {
				System.out.println(arg);
			}
		};
		IntObservable io = new IntObservable();
		io.addObserver(ob);
		
		io.run();
	}

}
