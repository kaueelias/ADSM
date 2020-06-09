package usjt.adsm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usjt.adsm.model.Usuario;
import usjt.adsm.repository.UsuarioRepository;



@Service
public class LoginService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar(Usuario usuario) {
		
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}