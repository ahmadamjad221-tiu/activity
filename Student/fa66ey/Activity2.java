package fa66ey;


public class Activity2 {
   private String Brand;
    private String Processor;
    private double Ramsize;

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setRamsize(double ramsize) {
        Ramsize = ramsize;
    }

    public double getRamsize() {
        return Ramsize;
    }

    public void upgradeRam(double additionalRam) {
        Ramsize += additionalRam;
        System.out.println("RAM upgraded by " + additionalRam + " GB. Total RAM is now " + Ramsize + " GB.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + Brand);
        System.out.println("Processor: " + Processor);
        System.out.println("RAM Size: " + Ramsize + " GB");
    } 
}
