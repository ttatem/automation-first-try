package model;

public class Keyboard {
    public String brand;
    public String model;
    public boolean Wireless;
    public String currentCharge;
    public boolean haveRGB;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWireless() {
        return Wireless;
    }

    public void setWireless(boolean wireless) {
        Wireless = wireless;
    }

    public String getCurrentCharge() {
        return currentCharge;
    }

    public void setCurrentCharge(String currentCharge) {
        this.currentCharge = currentCharge;
    }

    public boolean isHaveRGB() {
        return haveRGB;
    }

    public void setHaveRGB(boolean haveRGB) {
        this.haveRGB = haveRGB;
    }
}
