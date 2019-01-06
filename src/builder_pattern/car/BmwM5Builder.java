package builder_pattern.car;

public class BmwM5Builder extends CarBuilder {


    public BmwM5Builder() {
        setFactory("BMW");
        setType(Car.Type.Sport);
        setModel_name("M5");
        setNumber_of_doors(2);

    }

    @Override
    public CarBuilderInterface setFactory(String factory) {
        return super.setFactory("BMW");
    }


    @Override
    public CarBuilderInterface setType(Car.Type type) {
        return super.setType(Car.Type.Sport);
    }
}
