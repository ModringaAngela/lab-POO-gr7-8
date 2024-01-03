package pregatire.zoo.ui;

import pregatire.zoo.Zoo;

public class Model {

    private String output;
    private Zoo zoo;

    public Model() {
    }

    public String getOutput() {
        return this.output;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
