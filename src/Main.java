import adapter.WebAdapter;
import adapter.WebClient;
import adapter.WebService;
import builder_pattern.car.BmwM5Builder;
import builder_pattern.car.Car;
import builder_pattern.car.CarBuilder;
import builder_pattern.person.Person;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("observable/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();



    }


    public static void main(String[] args) {


        /*==============================================================================
         *                         Builder Design Pattern
         * ==============================================================================*/


        Person mehran =
                new Person("Mehran",
                        "","Rafiee",
                        22,183,65, Person.Gender.MALE);

        Person mehran_with_builder = new Person.Builder()
                .setFirst_name("mehran",
                        "","Rafiee", Person.Gender.MALE)
                .setAge(22)
                .setWeight(65)
                .setTall(183)
                .setGender(Person.Gender.MALE)
                .build();
//
//        System.out.println(mehran);
//        System.out.println(mehran_with_builder);


//        Car
        Car car = new Car(Car.Type.SUV,
                "white","Sorento",
                "KIA",4);
//
        Car custom_car = new CarBuilder()
                .setModel_name("MadeUpName")
                .setFactory("Mine")
                .setNumber_of_doors(5)
                .setColor("blue")
                .setType(Car.Type.Crossover)
                .build();
//
        Car bmw_m5 = new BmwM5Builder()
                .setColor("Black").setFactory("P")
                .build();
//
//        System.out.println(car);
//        System.out.println(custom_car);
//        System.out.println(bmw_m5);



        /*==============================================================================
         *                         Adapter Design Pattern
         * ==============================================================================*/

        WebService service = new WebService("127.0.0.1");


        WebAdapter adapter = new WebAdapter();
        WebClient client = new WebClient(adapter);

        adapter.connect(service);
        client.doWork();

        /*==============================================================================
         *                         Observable Design Pattern
         * ==============================================================================*/



        launch(args);
    }
}
