package prf.agenda.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PhoneVoips")
public class PhoneVoips {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String number;

    private String type;

    @ManyToOne
    @JoinColumn(name = "agendaId")
    private AgendaVoips agendaVoips;

    public PhoneVoips(){

    }

    public PhoneVoips(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AgendaVoips getAgendaVoips() {
        return agendaVoips;
    }

    public void setAgendaVoips(AgendaVoips agendaVoips) {
        this.agendaVoips = agendaVoips;
    }
}
