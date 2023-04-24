package com.cibertec.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.demo.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, String> {

}
