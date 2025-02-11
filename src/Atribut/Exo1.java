package Atribut;

public class Exo1 {
    public static void main(String[] args) {
        livre HarryPotter = new livre("HarryPotter");

        System.out.println(HarryPotter.getName());
        HarryPotter.setName("HarryPotter A L ecole Des Sorciers");
        System.out.println(HarryPotter.getName());
    }
    static class livre {
        private String name;

        public livre(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}