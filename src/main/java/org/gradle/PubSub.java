package org.gradle;

import java.util.Arrays;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
/**
 * 
 * @author hsoo3
 * @since 20181016
 * Observable�� �Ѱ�: 
 * 1. data�� ���� �𸥴�.
 * 2. Exception Handling�� ��ƴ�.
 * => Reactive JAVA �ʿ�
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
