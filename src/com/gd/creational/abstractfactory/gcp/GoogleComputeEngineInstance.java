package com.gd.creational.abstractfactory.gcp;

import com.gd.creational.abstractfactory.Instance;
import com.gd.creational.abstractfactory.Storage;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute engine instance stopped");
    }
}
