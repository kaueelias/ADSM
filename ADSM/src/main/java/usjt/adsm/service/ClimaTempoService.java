package usjt.adsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usjt.adsm.model.Clima;
import usjt.adsm.repository.ClimaTempoRepository;


@Service
public class ClimaTempoService {


	@Autowired
	private ClimaTempoRepository climaTempoRepo;

	public List<Clima> listarTodos() {
		List <Clima> periodos = climaTempoRepo.findAll();
		return periodos;
	}
}
