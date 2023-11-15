public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(12,"Intel","I7","13");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
        CPU.Harddisk harddisk1TB = myKomputer.new Harddisk(1000, "Seagate");
        CPU.Motherboard motherboardMSI = myKomputer.new Motherboard("Asrock", "B660M-HDV LGA 1700");
        CPU.PowerSupply psuCorsair = myKomputer.new PowerSupply("Corsair", 500);
        CPU.VGACard gtx1060 = myKomputer.new VGACard("Nvidia", "RTX 4060", 12);

        harddisk1TB.getHarddiskInfo();
        motherboardMSI.getMotherboardInfo();
        psuCorsair.getPowerSupplyInfo();
        gtx1060.getVGACardInfo();
    }
}