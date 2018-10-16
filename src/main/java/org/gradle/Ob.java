package org.gradle;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author hsoo3
 * @since 20181016
 * Observer Pattern Thread »Æ¿Œ
 */
public class Ob {
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
				System.out.println(Thread.currentThread().getName()+", arg:"+arg);
			}
		};
		IntObservable io = new IntObservable();
		io.addObserver(ob);
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(io);
		
		System.out.println(Thread.currentThread().getName() + " EXIT");
		es.shutdown();
	}

}
