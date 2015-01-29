package com.senacor.services.base;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

/**
 * Created by rwinzing on 20.01.15.
 */
public abstract class HZService {
    protected HazelcastInstance hz = null;

    public abstract String getDescription();

    protected void signalOnline() {
        System.out.println(this.getClass().getSimpleName()+" is online now");
    }

    protected HZService() {
        this.hz = Hazelcast.newHazelcastInstance();;
    }
}
