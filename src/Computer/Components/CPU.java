package Computer.Components;

public class CPU {
    private double speed;
    private int Number_of_cores;
    public CPU(){

    }
    public CPU(double speed,int Number_of_cores){
        this.speed = speed;
        this.Number_of_cores = Number_of_cores;
    }
    public void setSpeed(double speed) {
        this.speed=speed;
    }
    public double getSpeed(){
        return speed;
    }
    public void setNumber_of_cores(int Number_of_cores){
        this.Number_of_cores = Number_of_cores;
    }
    public int getNumber_of_cores(){
        return Number_of_cores;
    }

    @Override
    public boolean equals(Object o){

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CPU cpu = (CPU) o;
        return speed == cpu.speed &&
               Number_of_cores == cpu.Number_of_cores;

    }
    @Override
    public int hashCode() {
        return Integer.hashCode(this.Number_of_cores) +
                Double.hashCode(this.speed);

    }
    @Override
    public String toString() {
        return "CPU[" + this.speed +
                this.Number_of_cores + "]";

    }
}
