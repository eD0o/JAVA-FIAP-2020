package br.com.projeto.bo;

import br.com.projeto.beans.Cargo;
import br.com.projeto.dao.CargoDAO;

public class CargoBO {
	
	public static String apagar(int id) throws Exception{
		if(id<1) {
			return "id não existe!";
		}
		
		CargoDAO dao = new CargoDAO();
		dao.delete(id);
		dao.fechar();
		return "Apagado";
	}
	
	public static Cargo pesquisarCargo(int id) throws Exception{
		if(id<1) {
			return new Cargo();
		}
		
		CargoDAO dao = new CargoDAO();
		
		Cargo resposta = dao.getCargo(id);
		
		dao.fechar();
		
		return resposta;
	}
	
	public String novo(Cargo objeto) throws Exception{
		
		//Regra de negócio
		if(objeto.getId()<1){
			return "ID Inválido";			
		}
		
		//Requisito Funcional

		
		if(objeto.getNivel()==null || objeto.getNivel().length()<4) {
			return "Nível inválido";
		}
		
		if(objeto.getSalario()<1000) {
			return "Salário inválido";
		}
		
		if(resposta.getId()!=0) {
			dao.fechar();
			return "Este ID já existe!!";
		}
		
		if(objeto.getNome().length()>30) {
			return "mui grande";
		}
		
		if(objeto.getNivel().length()>30) {
			return "mui grande";
		}
		
		//Padronização
		objeto.setNome(objeto.getNome().toUpperCase());
		objeto.setNivel(objeto.getNivel().toUpperCase());
		
		CargoDAO dao = new CargoDAO();
		Cargo resposta = dao.getCargo(objeto.getId());
		
		if(objeto.getNome()==null || objeto.getNome().length()<4) {
			return "Nome do cargo inválido!";
		}
		dao.add(objeto);
		dao.fechar();
		
		return "OK";
			
	}

}
