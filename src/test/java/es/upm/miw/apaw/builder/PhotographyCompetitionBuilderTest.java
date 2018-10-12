package es.upm.miw.apaw.builder;

import es.upm.miw.apaw.entities.Category;
import es.upm.miw.apaw.entities.Jury;
import es.upm.miw.apaw.entities.Photographer;
import es.upm.miw.apaw.entities.Competition;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhotographyCompetitionBuilderTest {

    @Test
    void testFull() {
        LocalDateTime date = LocalDateTime.now();
        Competition photographyCompetition = new PhotographyCompetitionBuilder("1").category(Category.MACRO).reference("Competición Macro")
                .jury(new Jury("1", "Angélica")).photographer(new Photographer("1", "Jose")).photographer(new Photographer("2", "Ruth"))
                .price(40).date(date).build();

        assertEquals("1", photographyCompetition.getId());
        assertEquals(Category.MACRO, photographyCompetition.getCategory());
        assertEquals("Competición Macro", photographyCompetition.getReference());
        assertEquals(new Integer(40), photographyCompetition.getPrice());
        assertEquals(date, photographyCompetition.getDate());

        assertEquals(1, photographyCompetition.getJuryList().size());
        assertEquals("1", photographyCompetition.getJuryList().get(0).getId());
        assertEquals("Angélica", photographyCompetition.getJuryList().get(0).getNick());

        assertEquals(2, photographyCompetition.getPhotographerList().size());
        assertEquals("1", photographyCompetition.getPhotographerList().get(0).getId());
        assertEquals("Jose", photographyCompetition.getPhotographerList().get(0).getNick());

        assertEquals("2", photographyCompetition.getPhotographerList().get(1).getId());
        assertEquals("Ruth", photographyCompetition.getPhotographerList().get(1).getNick());
    }

    @Test
    void testConstructorIntCategoryStringLocalDateTimeDoubleListList() {
        List<Jury> juryList = new ArrayList<>();
        Jury jury = new Jury("1", "Angélica");
        jury.setEmail("angelica@etsisi.upm.es");
        juryList.add(jury);
        jury = new Jury("2", "Ruth");
        jury.setEmail("ruth@etsisi.upm.es");
        juryList.add(jury);

        Photographer photographer = new Photographer("1", "Jose");
        photographer.setEmail("jose@etsisi.upm.es");
        List<Photographer> photographerList = new ArrayList<>();
        photographerList.add(photographer);

        LocalDateTime date = LocalDateTime.now();

        Competition photographyCompetition = new PhotographyCompetitionBuilder("1", Category.MACRO, "Competición Macro", date, 40, photographerList, juryList).build();

        assertEquals("1", photographyCompetition.getId());
        assertEquals(Category.MACRO, photographyCompetition.getCategory());
        assertEquals("Competición Macro", photographyCompetition.getReference());
        assertEquals(date, photographyCompetition.getDate());
        assertEquals(new Integer(40), photographyCompetition.getPrice());

        assertEquals(2, photographyCompetition.getJuryList().size());
        assertEquals("1", photographyCompetition.getJuryList().get(0).getId());
        assertEquals("Angélica", photographyCompetition.getJuryList().get(0).getNick());
        assertEquals("angelica@etsisi.upm.es", photographyCompetition.getJuryList().get(0).getEmail());

        assertEquals("2", photographyCompetition.getJuryList().get(1).getId());
        assertEquals("Ruth", photographyCompetition.getJuryList().get(1).getNick());
        assertEquals("ruth@etsisi.upm.es", photographyCompetition.getJuryList().get(1).getEmail());

        assertEquals(1, photographyCompetition.getPhotographerList().size());
        assertEquals("1", photographyCompetition.getPhotographerList().get(0).getId());
        assertEquals("Jose", photographyCompetition.getPhotographerList().get(0).getNick());
        assertEquals("jose@etsisi.upm.es", photographyCompetition.getPhotographerList().get(0).getEmail());

    }
}
