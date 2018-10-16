package org.gradle;

import java.util.Arrays;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
/**
 * 
 * @author hsoo3
 * @since 20181016
 * Observable의 한계: 
 * 1. data의 끝을 모른다.
 * 2. Exception Handling이 어렵다.
 * => Reactive JAVA 필요
 */
public class PubSub {

	public static void main(String[] args) {
		Iterable<Integer> it = Arrays.asList(1,2,3,4,5);
		
		Publisher p = new Publisher() {

			public void subscribe(Subscriber subscriber) {
				// TODO Auto-generated method stub

			}
			
		};
		
	}
}
