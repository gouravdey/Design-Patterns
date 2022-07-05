package com.gd.creational.abstractfactory.gcp;

import com.gd.creational.abstractfactory.Storage;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMb) {
        System.out.println("Allocated " + capacityInMb + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
