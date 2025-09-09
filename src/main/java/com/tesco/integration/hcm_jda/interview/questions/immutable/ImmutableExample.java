package com.tesco.integration.hcm_jda.interview.questions.immutable;

import java.util.*;

public final class ImmutableExample {

    private final String empName;
    private final int age;
    private final Address address;
    private final List<String> phoneNumbers;
    private final Map<String, String> metadata;


    public ImmutableExample(String empName, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata){

        this.empName = empName;
        this.age = age;
        this.address = new Address(address.getStreet(),address.getCity());
        this.phoneNumbers = Collections.unmodifiableList(List.copyOf(phoneNumbers));
        this.metadata = Collections.unmodifiableMap(Map.copyOf(metadata));
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Map<String, String> getMetadata() {
        return  metadata;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Immutable class cannot be cloned");
    }

    // Optional: prevent deserialization from breaking immutability
    protected Object readResolve() {
        return this;
    }
}
