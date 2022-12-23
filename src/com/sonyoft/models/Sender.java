package com.sonyoft.models;

public class Sender {

	public void send(String msg) {
		System.out.println("Sending the message : [ " + msg + " ]");
		try {
			System.out.println("wainting ...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted.\n" + e.getMessage());
		}
		System.out.println("The message: [ " + msg + " ] is sent");
	}
}
