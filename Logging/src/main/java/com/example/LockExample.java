package com.example;

import com.example.ticket.BookTicket;
import com.example.ticket.queue.UserQueue;

public class LockExample {
	
	public static void main(String[] args)
	{
		 UserQueue queue=new UserQueue();
	      
		 // main thread
	      Thread thread[] = new Thread[10];
	      for (int i = 0; i < 10; i++)
	      {
	         thread[i] = new Thread(new BookTicket(queue), "Thread " + i);
	      }
	      for (int i = 0; i < 10; i++)
	      {
	         thread[i].start();
	      }
	   }

}
