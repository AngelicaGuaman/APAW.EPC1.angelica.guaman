package es.upm.miw.apaw.builder;

import es.upm.miw.apaw.entities.Category;
import es.upm.miw.apaw.entities.Jury;
import es.upm.miw.apaw.entities.Photographer;
import es.upm.miw.apaw.entities.Competition;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PhotographyCompetitionBuilder {

    private List<Photographer> photographerList;

    private List<Jury> juryList;

    private Competition photographyCompetition;

    public PhotographyCompetitionBuilder(String id) {
        this.photographyCompetition = new Competition(id);
    }

    public PhotographyCompetitionBuilder(String id, Category category, String reference, LocalDateTime date, int price, List<Photographer> photographerList, List<Jury> juryList) {
        this.photographyCompetition = new Competition(id);
        this.photographyCompetition.setCategory(category);
        this.photographyCompetition.setReference(reference);
        this.photographyCompetition.setDate(date);
        this.photographyCompetition.setPrice(price);
        this.photographyCompetition.setPhotographerList(photographerList);
        this.photographyCompetition.setJuryList(juryList);
    }

    public PhotographyCompetitionBuilder category(Category category) {
        this.photographyCompetition.setCategory(category);

        return this;
    }

    public PhotographyCompetitionBuilder reference(String reference) {
        this.photographyCompetition.setReference(reference);

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

    public Competition build() {
        return this.photographyCompetition;
    }
}
