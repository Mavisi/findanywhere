package model;

public class Beacon {
    
    private int id;
    private String uuid;
    private int major;
    private int minor;
    private int txPower;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public int getMajor() {
        return major;
    }
    public void setMajor(int major) {
        this.major = major;
    }
    public int getMinor() {
        return minor;
    }
    public void setMinor(int minor) {
        this.minor = minor;
    }
    public int getTxPower() {
        return txPower;
    }
    public void setTxPower(int txPower) {
        this.txPower = txPower;
    }
    
}
