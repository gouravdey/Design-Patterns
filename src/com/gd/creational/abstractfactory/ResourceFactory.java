package com.gd.creational.abstractfactory;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capacityInMb);
}
