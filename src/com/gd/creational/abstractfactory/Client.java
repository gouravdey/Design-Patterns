package com.gd.creational.abstractfactory;

import com.gd.creational.abstractfactory.aws.AwsResourceFactory;
import com.gd.creational.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(ResourceFactory factory) {
        resourceFactory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageInMb) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageInMb);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {

        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        Client gcp = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Instance.Capacity.micro, 40960);
        i2.start();
        i2.stop();
    }
}
