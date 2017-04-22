package com.java2novice.SpecialPrograms;

//===============================================================
class IRCTC1 implements Runnable{
	int tickets = 10;

	public void run()
	{
	synchronized(this)
	{
		System.out.println("Avialble Tickets: " + tickets + "-----");
		if(tickets > 0){
			try{Thread.currentThread().sleep(1000);}catch(Exception e){}
			//for taking passenger details, ticket details and for payment

			System.out.print("Enter Number of Tickets to Reserve: ");
			int resTkts = Integer.parseInt(System.console().readLine());
			for(int i=1; i<=resTkts; i++)
			{
				System.out.print("Enter Passenger Name: ");
				String pname = System.console().readLine();
				tickets = tickets -1;
				System.out.print(pname + " Reserved 1 Ticket.-----");
				System.out.println("Remaining Tickets are: " + tickets);
			}
			
		}
		else{System.out.println("---- No tickets. Cant proceed for Reservation. ----");}
	}
	}
}
class IRCTC{
	public static void main(String[] args){
		
		IRCTC1 rs = new IRCTC1();
		for(int p=1; p<=20; p++){
			Thread t = new Thread(rs); t.start();
		}
	}

	

}
