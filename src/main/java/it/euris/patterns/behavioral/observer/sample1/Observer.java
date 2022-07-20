package it.euris.patterns.behavioral.observer.sample1;


public interface Observer {
    void update(String news);
}

class NewsChannel implements Observer {

    private String description;

    NewsChannel(String description) {
        this.description = description;
    }

    @Override
    public void update(String news) {
        System.out.println(getDescription() + ": Breaking News available: " + news);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}