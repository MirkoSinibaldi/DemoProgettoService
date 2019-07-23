package it.k2.demo.demoProgettoService.models;

public class GenreDto
{
    private String description;

    public GenreDto() {}

    public GenreDto(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
