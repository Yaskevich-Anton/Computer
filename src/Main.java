import Computer.Components.CPU;
import Computer.Computer;


public class Main {
    public static void main(String[] main){
        Computer computer = new Computer();
        CPU cpu = new CPU();
        computer.getOpen();
        cpu.setSpeed(254.4);
    }
}
