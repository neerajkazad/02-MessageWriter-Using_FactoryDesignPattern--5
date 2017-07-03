package com.sdp.test;

import com.sdp.beans.IMessageConverter;
import com.sdp.beans.MessageWriter;

public class SDPTest {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		messageWriter.writeMessge("Welcome to Strategy Design Pattern");
		
		
	}
}
