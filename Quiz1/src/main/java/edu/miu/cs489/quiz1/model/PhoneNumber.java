package edu.miu.cs489.quiz1.model;

import java.util.Objects;

public class PhoneNumber {
    private String number;
    private String label;

    public PhoneNumber() {
    }

    public PhoneNumber(String number, String label) {
        this.number = number;
        this.label = label;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(getNumber(), that.getNumber()) && Objects.equals(getLabel(), that.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getLabel());
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "number='" + number + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
