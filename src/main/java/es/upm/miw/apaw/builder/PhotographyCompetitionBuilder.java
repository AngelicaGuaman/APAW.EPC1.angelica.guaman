package es.upm.miw.apaw.builder;

import es.upm.miw.apaw.entities.Category;
import es.upm.miw.apaw.entities.Jury;
import es.upm.miw.apaw.entities.Photographer;
import es.upm.miw.apaw.entities.PhotographyCompetition;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PhotographyCompetitionBuilder {

    private List<Photographer> photographerList;

    private List<Jury> juryList;

    private PhotographyCompetition photographyCompetition;

    public PhotographyCompetitionBuilder(String id) {
        this.photographyCompetition = new PhotographyCompetition(id);
    }

    public PhotographyCompetitionBuilder(String id, Category category, String description, LocalDateTime date, int price, List<Photographer> photographerList, List<Jury> juryList) {
        this.photographyCompetition = new PhotographyCompetition(id);
        this.photographyCompetition.setCategory(category);
        this.photographyCompetition.setDescription(description);
        this.photographyCompetition.setDate(date);
        this.photographyCompetition.setPrice(price);
        this.photographyCompetition.setPhotographerList(photographerList);
        this.photographyCompetition.setJuryList(juryList);
    }

    public PhotographyCompetitionBuilder category(Category category) {
        this.photographyCompetition.setCategory(category);

        return this;
    }

    public PhotographyCompetitionBuilder description(String description) {
        this.photographyCompetition.setDescription(description);

        return this;
    }

    public PhotographyCompetitionBuilder date(LocalDateTime date) {
        this.photographyCompetition.setDate(date);

        return this;
    }

    public PhotographyCompetitionBuilder price(int price) {
        this.photographyCompetition.setPrice(price);

        return this;
    }

    public PhotographyCompetitionBuilder photographer(Photographer photographer) {
        if (this.photographerList == null) {
            this.photographerList = new ArrayList<>();
            this.photographyCompetition.setPhotographerList(this.photographerList);
        }

        this.photographerList.add(photographer);

        return this;
    }

    public PhotographyCompetitionBuilder jury(Jury jury) {
        if (this.juryList == null) {
            this.juryList = new ArrayList<>();
            this.photographyCompetition.setJuryList(this.juryList);
        }

        this.juryList.add(jury);

        return this;
    }

    public PhotographyCompetition build() {
        return this.photographyCompetition;
    }
}
