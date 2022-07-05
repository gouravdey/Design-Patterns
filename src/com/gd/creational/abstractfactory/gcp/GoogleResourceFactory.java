package com.gd.creational.abstractfactory.gcp;

import com.gd.creational.abstractfactory.Instance;
import com.gd.creational.abstractfactory.ResourceFactory;
import com.gd.creational.abstractfactory.Storage;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new GoogleCloudStorage(capacityInMb);
    }
}
