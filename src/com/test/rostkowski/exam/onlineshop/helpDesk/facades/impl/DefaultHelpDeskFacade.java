package com.test.rostkowski.exam.onlineshop.helpDesk.facades.impl;

import java.util.PriorityQueue;
import java.util.Queue;

import com.test.rostkowski.exam.onlineshop.helpDesk.enteties.SupportTicket;
import com.test.rostkowski.exam.onlineshop.helpDesk.facades.HelpDeskFacade;
import com.test.rostkowski.exam.onlineshop.helpDesk.utils.CustomSupportTicketsComparator;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
	
	private Queue<SupportTicket> tickets;
	
	{
		tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}

	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		tickets.offer(supportTicket);
		
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		return tickets.poll();
	}

	@Override
	public int getNumberOfTickets() {
		return tickets.size();
	}

}
