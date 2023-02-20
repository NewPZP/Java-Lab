package io.github.newpzp.design.decorator.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
