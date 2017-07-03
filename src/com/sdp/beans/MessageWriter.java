package com.sdp.beans;

import com.sdp.helper.MessageConverterFactory;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public void writeMessge(String message) {
		String cMessage = null;
		//messageConverter = new HTMLMessageConverterImpl();
		/*
		 * If we are creating the object using Concrete class name of the other class then our class is 
		 * tightly coupled with other class. so to avoid this situation you have to go for Factory Design Pattern
		 * so we are not using new keyword and we are not refering Concrete class names of other class instead of this 
		 * we are making on Factory class that is responsible to create the object of other class.
		 */
		//messageConverter = new PDFMessageConverterImpl();
		//messageConverter = MessageConverterFactory.createMessageConverter("html");
		messageConverter = MessageConverterFactory.createMessageConverter("pdf");
		cMessage = messageConverter.convert(message);
		System.out.println(cMessage);
	}
}
