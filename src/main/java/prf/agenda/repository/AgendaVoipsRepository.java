package prf.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prf.agenda.model.AgendaVoips;

public interface AgendaVoipsRepository extends JpaRepository<AgendaVoips, Long> {
}
