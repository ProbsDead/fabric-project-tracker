package model;

import java.util.Scanner;

public class Needle {
    private int needleId;
    private String material;
    private double mmSize;
    private String usSize;
    private boolean isRound;
    private boolean inUse;
    private String knitOrCrochet;

    public Needle(String usSize, double mmSize, String material) {
    }

    public Needle(String usSize, double mmSize, String material, boolean inUse) {
    }

    public int getNeedleId() {
        return needleId;
    }

    public void setNeedleId(int needleId) {
        this.needleId = needleId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getMmSize() {
        return mmSize;
    }

    public void setMmSize(double mmSize) {
        this.mmSize = mmSize;
    }

    public String getUsSize() {
        return usSize;
    }

    public void setUsSize(String usSize) {
        this.usSize = usSize;
    }

    public boolean isRound() {
        return isRound;
    }

    public void setRound(boolean round) {
        isRound = round;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public String getKnitOrCrochet() {
        return knitOrCrochet;
    }

    public void setKnitOrCrochet(String knitOrCrochet) {
        this.knitOrCrochet = knitOrCrochet;
    }

    public Needle() {
    }

    public Needle(int needleId, String material, double mmSize, String usSize, boolean isRound, boolean inUse, String knitOrCrochet) {
        this.needleId = needleId;
        this.material = material;
        this.mmSize = mmSize;
        this.usSize = usSize;
        this.isRound = isRound;
        this.inUse = inUse;
        this.knitOrCrochet = knitOrCrochet;
    }

    public void addNeedleToFile() {
        System.out.println("Is this a (C)rochet hook or (K)nitting needle: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("c")) {
            Crochet crochet = new Crochet();
            crochet.addNeedleToFile();
        } else if (userInput.equalsIgnoreCase("k")) {
            Knit knit = new Knit();
            knit.addNeedleToFile();
        }
    }

    public double usToMmConverterKnit(String usSize){
        switch(usSize){
            case "00000":
                setMmSize(1.0);
                break;
            case "0000": 
                setMmSize(1.25);
                break;
            case "000":
                setMmSize(1.5);
                break;
            case "00":
                setMmSize(1.75);
                break;
            case"0":
                setMmSize(2.0);
                break;
            case "1":
                setMmSize(2.25);
                break;
            case "1.5":
                setMmSize(2.5);
                break;
            case "2":
                setMmSize(2.75);
                break;
            case "2.5":
                setMmSize(3.0);
                break;
            case "3":
                setMmSize(3.25);
                break;
            case "4":
                setMmSize(3.5);
                break;
            case "5":
                setMmSize(3.75);
                break;
            case "6":
                setMmSize(4.0);
                break;
            case "7":
                setMmSize(4.5);
                break;
            case "8":
                setMmSize(5.0);
                break;
            case "9":
                setMmSize(5.5);
                break;
            case "10":
                setMmSize(6.0);
                break;
            case "10.5":
                setMmSize(6.5);
                break;
            case "11":
                setMmSize(8.0);
                break;
            case "13":
                setMmSize(9.0);
                break;
            case "14":
                setMmSize(9.5);
                break;
            case "15":
                setMmSize(10.0);
                break;
            case "17":
                setMmSize(12.0);
                break;
            case "19":
                setMmSize(16.0);
                break;
            case "35":
                setMmSize(19.0);
                break;
            case "50":
                setMmSize(25.0);
                break;
        }
        return getMmSize();
    }

}


