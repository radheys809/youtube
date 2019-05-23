package com.example.ticket.queue;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UserQueue {
	private final Lock queueLock = new ReentrantLock();
	 
	   public void bookTicket(Object document)
	   {
	      queueLock.lock();// lock the method for every thread no another one is acces this if one is already processing the task
	      try
	      {
	         Long duration = (long) (Math.random() * 10000);
	         System.out.println(Thread.currentThread().getName() + ": UserQueue  booking a ticket in " + (duration / 1000) + " seconds :: Time - " + new Date());
	         Thread.sleep(duration);
	      } catch (InterruptedException e)
	      {
	         e.printStackTrace();
	      } finally
	      {
	         System.out.printf("%s: The Ticket  has booked \n", Thread.currentThread().getName());
	         queueLock.unlock();/// unloak the resource
	      }
	   }

}
