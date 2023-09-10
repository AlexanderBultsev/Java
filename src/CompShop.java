import java.util.ArrayList;

public class CompShop {
    private ArrayList<Computer> computers;

    public CompShop() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(String modelName, String cpuName, String gpuName, double price) {
        computers.add(new Computer(modelName, cpuName, gpuName, price));
    }

    public ArrayList<Computer> findComputer(String modelName, String cpuName, String gpuName) {
        ArrayList<Computer> resComputers = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getModelName().equals(modelName) && computer.getCpuName().equals(cpuName) && computer.getGpuName().equals(gpuName)) {
                resComputers.add(computer);
            }
        }
        return resComputers;
    }

    public void deleteComputer(String modelName, String cpuName, String gpuName) {
        for (Computer computer : computers) {
            if (computer.getModelName().equals(modelName) && computer.getCpuName().equals(cpuName) && computer.getGpuName().equals(gpuName)) {
                computers.remove(computer);
            }
        }
    }

    @Override
    public String toString() {
        return "CompShop{" +
                "computers=" + computers +
                '}';
    }
}
