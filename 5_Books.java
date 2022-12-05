public class Books {
    private String name, author;
    private int page, days;

    public void setBooks (String name, String author, int page, int days) {
        this.name=name;
        this.author=author;
        this.page=page;
        this.days=days;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public int getDays() {
        return days;
    }
}
