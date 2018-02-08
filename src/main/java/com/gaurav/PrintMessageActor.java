package com.gaurav;

import akka.actor.UntypedActor;

public class PrintMessageActor extends UntypedActor {
    @Override
    public void onReceive(Object message) {
        System.out.println("Message received " + message);
    }
}
