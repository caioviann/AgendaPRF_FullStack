package prf.agenda.service;

import org.springframework.stereotype.Service;
import prf.agenda.model.AgendaVoips;
import prf.agenda.repository.AgendaVoipsRepository;

import java.util.List;

@Service
public class AgendaVoipsService {
    private final AgendaVoipsRepository agendaVoipsRepository;

    public AgendaVoipsService(AgendaVoipsRepository agendaVoipsRepository) {
        this.agendaVoipsRepository = agendaVoipsRepository;
    }

    public List<AgendaVoips> agendaVoipsList(){
        return agendaVoipsRepository.findAll();
    }
}
