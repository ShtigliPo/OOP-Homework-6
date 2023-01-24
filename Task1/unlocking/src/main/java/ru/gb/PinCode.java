package ru.gb;

public class PinCode implements UnlockMethod {
    
    private int pincode;

    public PinCode(int pincode) {
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }

    @Override
    public void unlock() {
        System.out.println("pincode....");
        System.out.println("Телефон разблокирован по пин-коду");
    }

}
