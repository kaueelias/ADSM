package br.usjt.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.SpringBootLab.model.PrevisaoDoTempo;
import br.usjt.SpringBootLab.service.PrevisaoDoTempoService;

@Controller
public class PrevisaoDoTempoController {
	//@Autowired
	//private PrevisaoDoTempoRepository previsaoDoTempoRepo;
	@Autowired
	private PrevisaoDoTempoService previsaoService;
	

	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsoes");
		mv.addObject(new PrevisaoDoTempo());
		List <PrevisaoDoTempo> previsoes = previsaoService.listarTodos();
		mv.addObject("previsoes", previsoes);
		return mv;
	}
	@PostMapping("/previsoes")
	public String salvar (PrevisaoDoTempo previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsoes";

	}
}
