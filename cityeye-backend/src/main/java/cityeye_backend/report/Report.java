package cityeye_backend.report;

public class Report {
    private Long id;
    private String title;
    private String description;
    private String location;
    private String status;

    public Report() {
    }

    public Report(Long id, String title, String description,
                  String location, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() { return location; }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) {
        this.status = status;
    }
}