package com.cibertec.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.demo.model.Producto;
import com.cibertec.demo.repository.IProductoRepository;

@Controller
public class ProductoController {
	@Autowired
	private IProductoRepository repo;
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("producto", new Producto());
		return "crudProductos";
	}
	
	@PostMapping("/guardar")
	public String grabarPag(@ModelAttribute Producto producto) {
		repo.save(producto);
		return "registrado";
	}
}
