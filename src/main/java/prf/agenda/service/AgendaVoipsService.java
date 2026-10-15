package prf.agenda.service;

import org.springframework.stereotype.Service;
import prf.agenda.dto.AgendaVoipsDTO;
import prf.agenda.dto.PhoneVoipsDTO;
import prf.agenda.model.AgendaVoips;
import prf.agenda.repository.AgendaVoipsRepository;

import java.util.List;

@Service
public class AgendaVoipsService {
    private final AgendaVoipsRepository agendaVoipsRepository;

    public AgendaVoipsService(AgendaVoipsRepository agendaVoipsRepository) {
        this.agendaVoipsRepository = agendaVoipsRepository;
    }

    public List<AgendaVoipsDTO> agendaVoipsList(){
        return agendaVoipsRepository.findAll()
                .stream()
                .map(a -> {
                    AgendaVoipsDTO dto = new AgendaVoipsDTO();
                    dto.setSector(a.getSector());
                    dto.setName(a.getName());
                    dto.setPhoneVoips(a.getPhoneVoips().stream()
                            .map(p -> new PhoneVoipsDTO(p.getNumber(), p.getType()))
                            .toList());
                    return dto;
                })
                .toList();

    }
}
