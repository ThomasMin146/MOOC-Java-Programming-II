/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Book implements Comparable<Book>{
    private String name;
    private int ageRecommendations;

    public Book(String name, int ageRecommendations) {
        this.name = name;
        this.ageRecommendations = ageRecommendations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeRecommendations() {
        return ageRecommendations;
    }

    public void setAgeRecommendations(int ageRecommendations) {
        this.ageRecommendations = ageRecommendations;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + ageRecommendations + " year-olds or older)";
    }

    @Override
    public int compareTo(Book book) {
        return this.ageRecommendations - book.ageRecommendations;
    }
    
    
    
}
