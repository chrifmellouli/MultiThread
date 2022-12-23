package com.sonyoft.models;

public class ThreadedSend extends Thread {

	private String msg;
	private Sender sender;

	public ThreadedSend(String msg, Sender sender) {
		super();
		this.msg = msg;
		this.sender = sender;
	}

	@Override
	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
	}

}
