package br.usjt.SpringBoot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Table(name="previsaodotempo")
public class PrevisaoDoTempo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY ) //Tipo de chave primaria (1,2,3,4,5,6...)
	private Long id;
	private String diadasemana;
	private double temperaturamin;
	private double temperaturamax;
	private double umidaderelativadoar;
	private String data;
	private String hora;
	private String latitude;
	private String longitude;
	private String descricao;
}
