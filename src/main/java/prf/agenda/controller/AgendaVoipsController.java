package prf.agenda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import prf.agenda.dto.AgendaVoipsDTO;
import prf.agenda.service.AgendaVoipsService;

import java.util.List;

@RestController
@RequestMapping("/v1/agenda")
public class AgendaVoipsController {
    private final AgendaVoipsService agendaVoipsService;


    public AgendaVoipsController(AgendaVoipsService agendaVoipsService) {
        this.agendaVoipsService = agendaVoipsService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AgendaVoipsDTO> agendaVoipsList(){
        return agendaVoipsService.agendaVoipsList();
    }
}
