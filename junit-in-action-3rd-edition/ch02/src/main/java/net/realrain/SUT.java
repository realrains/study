package net.realrain;

public class SUT {

    private String systemName;
    private boolean verified;

    public SUT() {
        this.systemName = "테스트 대상 시스템";
        this.verified = false;
    }

    public void verify() {
        this.verified = true;
    }

    public boolean isVerified() {
        return verified;
    }

    public String getSystemName() {
        return systemName;
    }
}
