package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if (name == null) {
            return false;
        }
        return name.length() >= 3 &&
                name.length() <= 19 &&
                !name.startsWith(" ") &&
                !name.endsWith(" ") &&
                countSpaces(name) == 1;

    }

    private int countSpaces(String name) {
        int simbCount = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                simbCount++;
            }
        }
        return simbCount;
    }

}
