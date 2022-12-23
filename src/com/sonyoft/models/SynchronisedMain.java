package com.sonyoft.models;

public class SynchronisedMain {

	public static void main(String[] args) {
		Sender send = new Sender();
		ThreadedSend threadedSend1 = new ThreadedSend("Hello", send);
		ThreadedSend threadedSend2 = new ThreadedSend("Bye", send);
		threadedSend1.start();
		threadedSend2.start();
		try {
			threadedSend1.join();
			threadedSend2.join();
		} catch (InterruptedException e) {
			System.err.println("Interrupted.\n" + e.getMessage());
		}
	}

}
