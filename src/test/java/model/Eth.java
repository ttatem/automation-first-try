package model;

public class Eth {
    public String blockchainName;
    public double ethPurchasePrice;
    public double ethCurrentPrice;
    public boolean inProfit;
    public boolean cryptoIsScam;

    public String getBlockchainName() {
        return blockchainName;
    }

    public void setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
    }

    public double getEthPurchasePrice() {
        return ethPurchasePrice;
    }

    public void setEthPurchasePrice(double ethPurchasePrice) {
        this.ethPurchasePrice = ethPurchasePrice;
    }

    public double getEthCurrentPrice() {
        return ethCurrentPrice;
    }

    public void setEthCurrentPrice(double ethCurrentPrice) {
        this.ethCurrentPrice = ethCurrentPrice;
    }

    public boolean isInProfit() {
        return inProfit;
    }

    public void setInProfit(boolean inProfit) {
        this.inProfit = inProfit;
    }

    public boolean isCryptoIsScam() {
        return cryptoIsScam;
    }

    public void setCryptoIsScam(boolean cryptoIsScam) {
        this.cryptoIsScam = cryptoIsScam;
    }
}
