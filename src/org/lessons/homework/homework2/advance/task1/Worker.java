package org.lessons.homework.homework2.advance.task1;

public class Worker {
    private int vodkaBrokenCount;
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void brokeVodka(Storage storage) {
        if (storage.getVodkaCount() > 0) {
            vodkaBrokenCount++;
            storage.setVodkaCount(storage.getVodkaCount() - 1);
            System.out.println("Ура, я испортил водку");
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "vodkaBrokenCount=" + vodkaBrokenCount +
                ", name='" + name + '\'' +
                '}';
    }
}
