package day30_inheritance.cryptoTask;

public class Doge extends CryptoToken{
    public Doge(double price, int quantity, long marketCap, long volume, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
