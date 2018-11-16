import builder_pattern.car.BmwM5Builder;
import builder_pattern.car.Car;
import builder_pattern.car.CarBuilder;
import builder_pattern.person.Person;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//


//        Builder design pattern

        Person mehran =
                new Person("Mehran","","Rafiee",22,183,65, Person.Gender.MALE);

        Person mehran_with_builder = new Person.Builder()
                .setFirst_name("mehran")
                .setMid_name("")
                .setLast_name("Rafiee")
                .setAge(22)
                .setWeight(65)
                .setTall(183)
                .setGender(Person.Gender.MALE)
                .build();

        System.out.println(mehran);
        System.out.println(mehran_with_builder);


//        Car
        Car car = new Car(Car.Type.SUV,"white","Sorento","KIA",4);

        Car custom_car = new CarBuilder()
                .setModel_name("MadeUpName")
                .setFactory("Mine")
                .setNumber_of_doors(5)
                .setColor("blue")
                .setType(Car.Type.Crossover)
                .build();

        Car bmw_m5 = new BmwM5Builder()
                .setColor("Black")
                .build();

        System.out.println(car);
        System.out.println(custom_car);
        System.out.println(bmw_m5);

    }


    public static void main(String[] args) {
        launch(args);
    }
}