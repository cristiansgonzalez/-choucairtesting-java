package co.com.choucair.certification.automatizacion.model;

public class DataUserDevices {
    private String sOComputer;
    private String version;
    private String languague;
    private String mobile;
    private String modelo;
    private String sysOp;

    public String getsOComputer() {
        return sOComputer;
    }

    public void setsOComputer(String sOComputer) {
        this.sOComputer = sOComputer;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLanguague() {
        return languague;
    }

    public void setLanguague(String languague) {
        this.languague = languague;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSysOp() {
        return sysOp;
    }

    public void setSysOp(String sysOp) {
        this.sysOp = sysOp;
    }
}
