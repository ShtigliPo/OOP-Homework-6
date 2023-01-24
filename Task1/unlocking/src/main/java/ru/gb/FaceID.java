package ru.gb;

public class FaceID implements UnlockMethod {
    
    private String faceID;   

    public FaceID(String faceID) {
        this.faceID = faceID;
    }

    public String getFaceID() {
        return faceID;
    }

    @Override
    public void unlock() {
        System.out.println("faceID....");
        System.out.println("Телефон разблокирован по лицу");
    }

}
