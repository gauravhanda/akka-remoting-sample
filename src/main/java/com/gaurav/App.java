package com.gaurav;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.event.Logging;
import com.typesafe.config.ConfigFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            ConfigFactory.load();
            ActorSystem actorSystem = ActorSystem.create("SampleActorSystem");
            ActorRef actorRef = actorSystem.actorOf(Props.create(PrintMessageActor.class), "PrintActor");
            System.out.println(actorRef.path());

            System.in.read();
        }catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
