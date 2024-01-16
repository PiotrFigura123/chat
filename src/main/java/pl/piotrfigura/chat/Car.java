package pl.piotrfigura.chat;

public class Car {

    private String name;
    private Integer age;
    private Integer capa;
    private String test;

    private Car(String name, Integer age, Integer capa) {
        this.name = name;
        this.age = age;
        this.capa = capa;
    }
    public static class CarBuilder {

        private String name;
        private Integer age;
        private Integer capa;

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public CarBuilder setCapa(Integer capa) {
            this.capa = capa;
            return this;
        }

        public Car build() {
            return new Car(name, age, capa);
        }
    }
}
