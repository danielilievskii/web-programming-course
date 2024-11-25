package mk.ukim.finki.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Event {
    private Long id;
    private String name;
    private String description;
    private double popularityScore;
    private int availableTickets;
    private Location location;
    private List<Comment> comments;

    public Event(String name, String description, double popularityScore, Location location) {
        this.id = (long) (Math.random() * 500);
        this.name = name;
        this.description = description;
        this.popularityScore = popularityScore;
        this.availableTickets = 50;
        this.location = location;
        this.comments = new ArrayList<>();
    }
}