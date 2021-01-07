package com.test.rostkowski.exam.onlineshop.helpDesk.facades;

import com.test.rostkowski.exam.onlineshop.helpDesk.enteties.SupportTicket;

public interface HelpDeskFacade {

	void addNewSupportTicket(SupportTicket supportTicket);
	
	SupportTicket getNextSupportTicket();

	/**
	 * @return amount of tickets that are not processed
	 */
	int getNumberOfTickets();
}
