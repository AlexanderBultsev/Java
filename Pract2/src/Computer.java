public class Computer {
    public String modelName;
    public String cpuName;
    public String gpuName;
    public double price;

    public Computer(String modelName, String cpuName, String gpuName, double price) {
        this.modelName = modelName;
        this.cpuName = cpuName;
        this.gpuName = gpuName;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName = gpuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "modelName='" + modelName + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", gpuName='" + gpuName + '\'' +
                ", price=" + price +
                '}';
    }
}
