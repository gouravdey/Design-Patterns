package com.gd.creational.abstractfactory.aws;

import com.gd.creational.abstractfactory.Instance;
import com.gd.creational.abstractfactory.ResourceFactory;
import com.gd.creational.abstractfactory.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new S3Storage(capacityInMb);
    }
}
