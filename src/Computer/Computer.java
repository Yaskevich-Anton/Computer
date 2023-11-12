package Computer;

import Computer.Components.CPU;
import Computer.Components.Drive;
import Computer.Components.HardDrive;
import Computer.Components.RAM;

public class Computer {

    private boolean open;
    private boolean health = true;
    private CPU cpu;
    private Drive drive;
    private HardDrive hardDrive;
    private RAM ram;
    public Computer() {
        cpu = new CPU();
        drive = new Drive();
        hardDrive = new HardDrive();
        ram = new RAM();
    }
    public Computer(CPU cpu,Drive drive,HardDrive hardDrive, RAM ram ){
        this.cpu = cpu;
        this.drive = drive;
        this.hardDrive = hardDrive;
        this.ram = ram;
    }
    public void turnOn() {
        this.open = true;
    }
    public void turnOff(){
        this.open = false;
    }
    public boolean getOpen(){
        return open;
    }
    public boolean healthCheck(){
        if(health == true) {
            System.out.println("Components.Computer is healthy");
        }
        else
            System.out.println("Components.Computer is infected");
        return health;
    }

    }