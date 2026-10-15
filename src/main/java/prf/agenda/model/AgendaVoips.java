package prf.agenda.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AgendaVoips")
public class AgendaVoips {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String sector;

    private String name;

    @OneToMany(mappedBy = "agendaVoips", cascade = CascadeType.ALL)
    private List<PhoneVoips> phoneVoips = new ArrayList<>();

    public AgendaVoips(){

    }

    public AgendaVoips(String sector, String name) {
        this.sector = sector;
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
