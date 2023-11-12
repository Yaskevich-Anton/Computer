package Computer.Components;

public class RAM {
    private int memory;
    private double speed;
    public RAM(){

    }
    public RAM(int memory){
        this.memory = memory;
    }
    public void setMemory(int memory){
        this.memory=memory;
    }
    public int getMemory(){
        return memory;
    }

    @Override
    public boolean equals(Object o){

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RAM ram = (RAM) o;
        return memory == ram.memory &&
               speed == ram.speed;

    }
    @Override
    public int hashCode() {
        return Integer.hashCode(this.memory) +
                Double.hashCode(this.speed);


    }
    @Override
    public String toString() {
        return "CPU[" + this.speed +
                this.memory;

    }
}
