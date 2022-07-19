package it.euris.patterns.creational.builder;


public class Computer {

    private String ram;
    private String hd;
    private String motherboard;
    private Boolean bluetooth;
    private String mouse;

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.hd = computerBuilder.hd;
        this.motherboard = computerBuilder.motherboard;
        this.bluetooth = computerBuilder.bluetooth;
        this.mouse = computerBuilder.mouse;
    }

    public String getRam() {
        return ram;
    }

    public String getHd() {
        return hd;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public String getMouse() {
        return mouse;
    }

    public static class ComputerBuilder {
        private String ram;
        private String hd;
        private String motherboard;
        private boolean bluetooth = true;
        private String mouse;

        public ComputerBuilder(String ram, String hd, String motherboard) {
            this.ram = ram;
            this.hd = hd;
            this.motherboard = motherboard;
        }

        public ComputerBuilder bluetooth(boolean hasBluetooth){
            this.bluetooth = hasBluetooth;
            return this;
        }

        public ComputerBuilder mouse(String m){
            this.mouse = m;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
