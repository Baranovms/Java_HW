package Java_HW.HW_6;

import java.util.Objects;

public class Notebook {
    private String brand;
    private String model;
    private String size;
    private String operativeMemory;
    private String hardDisk;
    private String System;
    private String color;

    public Notebook(String brand, String model, String size, String operativeMemory, String hardDisk, String system, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.operativeMemory = operativeMemory;
        this.hardDisk = hardDisk;
        this.System = system;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getOperativeMemory() {
        return operativeMemory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getMySystem() {
        return System;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook noteBook = (Notebook) o;
        return Objects.equals(brand, noteBook.brand) && Objects.equals(model, noteBook.model) && Objects.equals(size, noteBook.size) && Objects.equals(operativeMemory, noteBook.operativeMemory) && Objects.equals(hardDisk, noteBook.hardDisk) && Objects.equals(System, noteBook.System) && Objects.equals(color, noteBook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, size, operativeMemory, hardDisk, System, color);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", operativeMemory='" + operativeMemory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", System='" + System + '\'' +
                ", color='" + color + '\'' +
                '}' + '\n';
    }
}