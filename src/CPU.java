import java.text.NumberFormat;
import java.util.Locale;

public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        String generasi;

        Processor(int cores, String manufacturer, String name, String generasi) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
            this.generasi = generasi;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name + " Gen" + this.generasi);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM + "GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    // inner class Harddisk
    public class Harddisk {
        int kapasitas;
        String manufacturer;

        Harddisk(int kapasitas, String manufacturer) {
            this.kapasitas = kapasitas;
            this.manufacturer = manufacturer;
        }

        public void getHarddiskInfo() {
            System.out.println("Kapasitas Harddisk: " + this.kapasitas + "GB");
            System.out.println("Merek Harddisk: " + this.manufacturer);
        }
    }

    // inner class Motherboard
    public class Motherboard {
        String merek;
        String model;

        Motherboard(String merek, String model) {
            this.merek = merek;
            this.model = model;
        }

        public void getMotherboardInfo() {
            System.out.println("Merek Motherboard: " + this.merek);
            System.out.println("Model Motherboard: " + this.model);
        }
    }

    // inner class PowerSupply
    public class PowerSupply {
        String merek;
        int wattage;

        PowerSupply(String merek, int wattage) {
            this.merek = merek;
            this.wattage = wattage;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Merek Power Supply : " + this.merek);
            System.out.println("Watt Power Supply : " + this.wattage + " Watt");
        }
    }

    public class VGACard{
        String merek;

        String generasi;

        int memori;

        VGACard(String merek, String generasi, int memori){
            this.merek = merek;
            this.generasi = generasi;
            this.memori = memori;
        }

        public void  getVGACardInfo(){
            System.out.println("Merek VGA : " + this.merek);
            System.out.println("Generasi VGA : " + this.generasi);
            System.out.println("VRAM VGA : " + this.memori + "GB");
        }
    }
}