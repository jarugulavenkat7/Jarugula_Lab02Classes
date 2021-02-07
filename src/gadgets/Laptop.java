/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgets;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Laptop {
    private String laptopBrand;
    private String processor;
    private double display;
    private int hardDrive;
    private String operatingSystem;
    private boolean touch ;
 /**
 * Constructs Laptop with the given laptopBrand, processor, operatingSystem, 
 * hardDrive,display and touch.
 * @param laptopBrand Laptop Brand name like HP/Dell
 * @param processor Name of the processor
 * @param operatingSystem  OS name like Windows/Linux
 * @param hardDrive Memory size in GB’s
 * @param display Screen size in inches
 * @param touch Is supported touch screen or not.
 */
    public Laptop(String laptopBrand, String processor,  String operatingSystem,
            int hardDrive, double display, boolean touch) {
        this.laptopBrand = laptopBrand;
        this.processor = processor;
        this.display = display;
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
        this.touch = touch;
    }
/**
 * Constructs Laptop with the default values of instance variables
 */
    public Laptop() {
    }
/**
 * Returns brand of the laptop
 * @return Laptop Brand name like HP/Dell 
 */
    public String getLaptopBrand() {
        return laptopBrand;
    }
/**
 * Sets brand of the laptop
 * @param laptopBrand The laptopBrand to set
 */
    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }
/**
 * Returns processor of the laptop
 * @return Name of the processor 
 */
    public String getProcessor() {
        return processor;
    }
/**
 * Sets processor of the laptop
 * @param processor The processor to set
 */
    public void setProcessor(String processor) {
        this.processor = processor;
    }
/**
 * Returns screen size of the laptop
 * @return Screen size in inches
 */
    public double getDisplay() {
        return display;
    }
/**
 * Sets screen size of the laptop
 * @param display The display to set
 */
    public void setDisplay(double display) {
        this.display = display;
    }
/**
 * Returns memory size of the laptop
 * @return Memory size in GB’s
 */
    public int getHardDrive() {
        return hardDrive;
    }
/**
 * Sets memory size of the laptop
 * @param hardDrive The hardDrive to set
 */
    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
/**
 * Returns operating system of the laptop
 * @return OS name like Windows/Linux
 */
    public String getOperatingSystem() {
        return operatingSystem;
    }
/**
 * Sets the operatingSystem of the laptop
 * @param operatingSystem The operatingSystem to set
 */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
/**
 *  Returns Is supported touch screen or not.
 * @return Is supported touch screen or not.
 */
    public boolean isTouch() {
        return touch;
    }
/**
 * Returns Is supported touch screen or not.
 * @param touch The touch to set
 */
    public void setTouch(boolean touch) {
        this.touch = touch;
    }
/**
 * Returns Laptop object in string format
 * @return Laptop object in string format
 */
    @Override
    public String toString() {
        return "Laptop Brand: " + laptopBrand +
               "\nLaptop Processor: " + processor + 
               "\nLaptop Operating System: " + operatingSystem + 
               "\nLaptop Hard Drive: " + hardDrive +
               "\nLaptop Display: " + display + 
               "\nLaptop Is Touch: " + touch;
    }
    
    
    
    
    
    
    
}
