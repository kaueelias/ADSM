package br.usjt.SpringBoot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.SpringBootLab.model.PrevisaoDoTempo;
import br.usjt.SpringBootLab.repository.PrevisaoDoTempoRepository;
@Service
public class PrevisaoDoTempoService {
	@Autowired
	private PrevisaoDoTempoRepository previsaoDoTempoRepo;
	
	public void salvar (PrevisaoDoTempo previsao) {
		previsaoDoTempoRepo.save(previsao);
	}
	
	public List <PrevisaoDoTempo> listarTodos(){
		return previsaoDoTempoRepo.findAll();
	}

}
