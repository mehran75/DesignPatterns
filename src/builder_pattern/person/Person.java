package builder_pattern.person;

public class Person {




    private String first_name;
    private String mid_name;
    private String last_name;

    private int age;
    private int tall;
    private int weight;

    private Gender gender;



    public Person(String first_name,
                  String mid_name, String last_name,
                  int age, int tall, int weight, Gender gender) {

        this.first_name = first_name;
        this.mid_name = mid_name;
        this.last_name = last_name;
        this.age = age;
        this.tall = tall;
        this.weight = weight;
        this.gender = gender;
    }


    /**
     * description: constructor with all class fields
     *
     * @param first_name: first name
     * @param mid_name: mid name of person
     * @param last_name: last name
     * @param gender: gender of person
     *
     * */
    public Person(String first_name,
                  String mid_name, String last_name,
                  Gender gender) {
        this.first_name = first_name;
        this.mid_name = mid_name;
        this.last_name = last_name;
        this.gender = gender;
    }


    /**
     * @param builder: contain all of our needed object
     * */
    public Person(Builder builder) {
        this.first_name = builder.first_name;
        this.mid_name = builder.mid_name;
        this.last_name = builder.last_name;
        this.age = builder.age;
        this.tall = builder.tall;
        this.weight = builder.weight;
        this.gender = builder.gender;
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMid_name() {
        return mid_name;
    }

    public void setMid_name(String mid_name) {
        this.mid_name = mid_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", mid_name='" + mid_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", tall=" + tall +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }

    /**
     * @see java.lang.Enum
     * */
    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }


    /**
     * Person Builder class*/
    public static class Builder {
        private String first_name;
        private String mid_name;
        private String last_name;

        private int age;
        private int tall;
        private int weight;

        private Gender gender;


        public Builder setFirst_name(String first_name,String mid_name,
                                     String last_name,
                                     Gender gender) {
            this.first_name = first_name;
            this.mid_name = mid_name;
            this.last_name = last_name;
            this.gender = gender;

            return this;
        }

        public Builder setMid_name(String mid_name) {
            this.mid_name = mid_name;
            return this;
        }

        public Builder setLast_name(String last_name) {
            this.last_name = last_name;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }


        public Builder setTall(int tall) {
            this.tall = tall;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }


        public Person build(){
            return new Person(this);
        }
    }


}
