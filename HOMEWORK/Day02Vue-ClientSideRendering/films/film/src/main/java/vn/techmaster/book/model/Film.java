package vn.techmaster.book.model;

public class Film {
    private String name;
    private String directors;
    private int yearProduce;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public int getYearProduce() {
        return yearProduce;
    }

    public void setYearProduce(int yearProduce) {
        this.yearProduce = yearProduce;
    }

    public Film(String name, String directors, int yearProduce) {
        this.name = name;
        this.directors = directors;
        this.yearProduce = yearProduce;
    }

    @Override
    public String toString() {
        return "Film [directors=" + directors + ", name=" + name + ", yearProduce=" + yearProduce + "]";
    }
    
}
