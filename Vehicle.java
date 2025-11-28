package domain;

public class Vehicle {
    private String licenseNum = "";
    private boolean inOut;
    private String type = "";
    private byte pos = 0;

    public Vehicle (String licenseNum, boolean inOut, String type, byte pos){
        this.licenseNum = licenseNum;
        this.inOut = inOut;
        this.type = type;
        this.pos = pos;
    }

    public String getType(){
        return type;
    }

    public void setPos(byte ps){
        pos = ps;
    }

    public void showData(){
        System.out.println("Placa: " + licenseNum + ", Estado: " + inOut + ", Tipo: " + type + "Ubicación: " + pos);
    }
}