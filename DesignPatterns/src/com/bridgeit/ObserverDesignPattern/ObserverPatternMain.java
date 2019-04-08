package com.bridgeit.ObserverDesignPattern;

public class ObserverPatternMain {

	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer obj1 = new MyTopicSubscriber("Srujan");
		Observer obj2 = new MyTopicSubscriber("Suman");
		Observer obj3 = new MyTopicSubscriber("SsBrothers");
		
		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		//attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		
		//check if any update is available
		obj1.update();
		
		//now send message to subject
		topic.postMessage("New Message");
	}

}

