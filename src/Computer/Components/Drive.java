package Computer.Components;

public class Drive {
    private boolean open;
    private double speed;
   public Drive(){

    }
    public Drive(boolean open,double read_speed){
        this.open = open;
        this.speed = read_speed;
    }
    public boolean getOpen(){
        return open;
    }
    public double getRead_speed(){
        return speed;
    }
    public void setOpen(boolean open){
        this.open = open;
    }
    public void setRead_speed(double read_speed)
    {
        this.speed = read_speed;
    }
    @Override
    public boolean equals(Object o){

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Drive drive = (Drive) o;
        return speed == drive.speed;

    }
    @Override
    public int hashCode() {
        return Double.hashCode(this.speed);
    }
    @Override
    public String toString() {
        return "CPU[" + this.speed +
                this.open;

    }
}
