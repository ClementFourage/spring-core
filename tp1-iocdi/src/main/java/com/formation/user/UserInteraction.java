package com.formation.user;

import com.formation.service.IFeedback;

import java.text.MessageFormat;

public class UserInteraction {
	private IFeedback feedback;

//	public UserInteraction() {
//		feedback = factory.getFeedback();
//	}

	public void sayHello(String name) {
		feedback.say(MessageFormat.format("Hello {0} !", name));
	}

	public void sayGoodBye(String name) {
		feedback.say(MessageFormat.format("Goodbye {0} !", name));
	}

	public void setFeedback(IFeedback feedback) {
		this.feedback = feedback;
	}

}