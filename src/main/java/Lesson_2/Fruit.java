package Lesson_2;

public enum Fruit {

    ORANGE("Апельсин",2), APPLE("Яблоко",3), BANANA("Банан",4), CHERRY("Вишня",1);

    Fruit(String rus, int weight) {
        this.rus = rus;
        this.weight = weight;
    }

    private String rus;
    private int weight;

    public String getRus() {
        return rus;
    }

    public int getWeight() {
        return weight;
    }
}
