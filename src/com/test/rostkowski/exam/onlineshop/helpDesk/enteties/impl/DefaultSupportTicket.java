package com.test.rostkowski.exam.onlineshop.helpDesk.enteties.impl;

import com.test.rostkowski.exam.onlineshop.helpDesk.enteties.Priority;
import com.test.rostkowski.exam.onlineshop.helpDesk.enteties.RequestType;
import com.test.rostkowski.exam.onlineshop.helpDesk.enteties.SupportTicket;

public class DefaultSupportTicket implements SupportTicket {
	
	private static int counter;
	
	private RequestType requestType;
	private int sequentialNumber;
	
	{
		sequentialNumber = ++counter;
	}

	public DefaultSupportTicket() {
		
	}
	
	public DefaultSupportTicket(RequestType requestType) {
		this.requestType = requestType;
	}
	
	@Override
	public Priority getPriority() {
		if(requestType == null) {
			return null;
		}
		return this.requestType.getPriority();
	}

	@Override
	public int getSequentialNumber() {
		return this.sequentialNumber;
	}

	@Override
	public RequestType getRequestType() {
		return this.requestType;
	}

}
