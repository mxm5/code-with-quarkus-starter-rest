package io.mxm.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "film", schema = "sakila", catalog = "")
public class FilmEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id", nullable = false)
    private Short filmId;
    @Basic
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "release_year", nullable = true)
    private Object releaseYear;
    @Basic
    @Column(name = "language_id", nullable = false)
    private Short languageId;
    @Basic
    @Column(name = "original_language_id", nullable = true)
    private Short originalLanguageId;
    @Basic
    @Column(name = "rental_duration", nullable = false)
    private Short rentalDuration;
    @Basic
    @Column(name = "rental_rate", nullable = false, precision = 2)
    private BigDecimal rentalRate;
    @Basic
    @Column(name = "length", nullable = true)
    private Short length;
    @Basic
    @Column(name = "replacement_cost", nullable = false, precision = 2)
    private BigDecimal replacementCost;
    @Basic
    @Column(name = "rating", nullable = true , columnDefinition = "enum ('G', 'PG', 'PG-13', 'R', 'NC-17') default 'G'")
    private Object rating; // should be defined by the column definition
    @Basic
    @Column(name = "special_features", nullable = true , columnDefinition = "set ('Trailers', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')")
    private Object specialFeatures; // should be defined by the column definition
    @Basic
    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;


    @JoinTable(
            name = "film_actor",
            joinColumns = {@JoinColumn(name = "film_id")},
            inverseJoinColumns = {@JoinColumn(name = "film_id")}
    )
    @ManyToMany
    private List<ActorEntity> actors = new ArrayList<>();


    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Object releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Short getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Short languageId) {
        this.languageId = languageId;
    }

    public Short getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Short originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public Short getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Object getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(Object specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmEntity that = (FilmEntity) o;

        if (filmId != null ? !filmId.equals(that.filmId) : that.filmId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (releaseYear != null ? !releaseYear.equals(that.releaseYear) : that.releaseYear != null) return false;
        if (languageId != null ? !languageId.equals(that.languageId) : that.languageId != null) return false;
        if (originalLanguageId != null ? !originalLanguageId.equals(that.originalLanguageId) : that.originalLanguageId != null)
            return false;
        if (rentalDuration != null ? !rentalDuration.equals(that.rentalDuration) : that.rentalDuration != null)
            return false;
        if (rentalRate != null ? !rentalRate.equals(that.rentalRate) : that.rentalRate != null) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (replacementCost != null ? !replacementCost.equals(that.replacementCost) : that.replacementCost != null)
            return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (specialFeatures != null ? !specialFeatures.equals(that.specialFeatures) : that.specialFeatures != null)
            return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = filmId != null ? filmId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (releaseYear != null ? releaseYear.hashCode() : 0);
        result = 31 * result + (languageId != null ? languageId.hashCode() : 0);
        result = 31 * result + (originalLanguageId != null ? originalLanguageId.hashCode() : 0);
        result = 31 * result + (rentalDuration != null ? rentalDuration.hashCode() : 0);
        result = 31 * result + (rentalRate != null ? rentalRate.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (replacementCost != null ? replacementCost.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (specialFeatures != null ? specialFeatures.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
