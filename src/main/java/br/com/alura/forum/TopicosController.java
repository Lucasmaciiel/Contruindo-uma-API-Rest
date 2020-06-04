package br.com.alura.forum;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Dúvida", "Dúvida com Spring",new Curso("SpringBoot", "Programação"));
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
}
