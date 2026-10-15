package prf.agenda.dto;

import java.util.List;
import java.util.Set;

public class AgendaVoipsDTO {
    private String sector;
    private String name;
    private List<PhoneVoipsDTO> phoneVoips;

    public AgendaVoipsDTO() {
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

    public List<PhoneVoipsDTO> getPhoneVoips() {
        return phoneVoips;
    }

    public void setPhoneVoips(List<PhoneVoipsDTO> phoneVoips) {
        this.phoneVoips = phoneVoips;
    }
}
