package com.gaurav;

import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import com.typesafe.config.ConfigFactory;

/**
 * Hello world!
 *
 */
public class RemotingClient
{
    public static void main( String[] args )
    {
        try {
            ConfigFactory.load();
            ActorSystem actorSystem = ActorSystem.create("SampleActorSystem");
            ActorSelection selection = actorSystem.actorSelection("akka.tcp://SampleActorSystem@127.0.0.1:2552/user/PrintActor");
            for (int i=1; i <= 100; i++) {
                selection.tell("Hello-Actor - " + i, null);
            }



            System.in.read();
        }catch(Exception ex) {
            ex.printStackTrace();
        }


    }
}
