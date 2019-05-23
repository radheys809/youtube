package com.example.ticket;

import com.example.ticket.queue.UserQueue;

public class BookTicket implements Runnable {
	
		  private UserQueue queue;
		 
		   public BookTicket(UserQueue queue)
		   {
		      this.queue=queue;
		   }
		 // entry point or shared location
		   @Override
		   public void run()
		   {
		      System.out.printf("%s: Going to book  a ticket  \n", Thread.currentThread().getName());
		      queue.bookTicket( new Object());
		   }

}
