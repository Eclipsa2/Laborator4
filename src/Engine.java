public class Engine {
    private String transmission;
    private int power;
    private int numberCyl;

    public Engine(String transmission, int power, int numberCyl) {
        this.transmission = transmission;
        this.power = power;
        this.numberCyl = numberCyl;
    }

    public Engine()
    {
        this.transmission = "None";
        this.power = 0;
        this.numberCyl = 0;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberCyl() {
        return numberCyl;
    }

    public void setNumberCyl(int numberCyl) {
        this.numberCyl = numberCyl;
    }

    @Override
    public String toString()
    {
        return (this.transmission + "/" + this.numberCyl + "/" + this.power);
    }
}
