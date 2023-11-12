package Computer.Components;

public class HardDrive {
    int size;
    double speed;
    String type;
    public HardDrive(){

    }
    public HardDrive(int size,String type){
        this.size = size;
        this.type = type;
    }
    public void setSize(int size){
    this.size = size;
    }
    public int getSize(){
        return size;
    }
    @Override
    public boolean equals(Object o){

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        HardDrive hardDrive= (HardDrive) o;
        return size == hardDrive.size &&
                speed == hardDrive.speed &&
                type.equals(hardDrive.type);

    }
    @Override
    public int hashCode() {
        return Integer.hashCode(this.size) +
                Double.hashCode(this.speed) +
                type.hashCode();
    }
    @Override
    public String toString() {
        return "CPU[" + this.speed +
                this.size;

    }
}
