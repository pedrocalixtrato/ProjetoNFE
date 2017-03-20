package com.t2tierp.controller.cadastros;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.t2tierp.controller.AbstractController;
import com.t2tierp.model.bean.cadastros.Empresa;


@ManagedBean
@ViewScoped
public class EmpresaController extends AbstractController<Empresa> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public Class<Empresa> getClazz() {		
		return Empresa.class;
	}

	@Override
	public String getFuncaoBase() {		
		return "EMPRESA";
	}
	
		
	@Override
	public void salvar(String mensagem) {
		super.salvar(mensagem);
	}
	
	
	
}
