package ru.skypro.homework.dto;

public class Object {
  private int count;
  private Announcemenst results;

    public Object(int count, Announcemenst results) {
        this.count = count;
        this.results = results;
    }

    public Object() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Announcemenst getResults() {
        return results;
    }

    public void setResults(Announcemenst results) {
        this.results = results;
    }
}
