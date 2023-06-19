package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Automovel;
import entities.Marca;
import entities.Modelo;


public class Program {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
System.out.println("\n*** Vers�o 1 - Inicial ***");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ativAula");
		EntityManager em = emf.createEntityManager();
		
		//Inicia o controle de transa��o com o banco atrav�s do EntityManager
		em.getTransaction().begin();
		
		Marca marca = new Marca(null, "Toyota");
		Modelo modelo = new Modelo(null, "Corolla", marca);
		Automovel automovel = new Automovel(null, 2019, 2020, 80000, modelo);
		
		//Grava os objetos no banco - cada objeto vira uma linha da respectiva tabela
		em.persist(marca);
		em.persist(modelo);
		em.persist(automovel);
		
		//Finaliza a transa��o dando commit no banco
		em.getTransaction().commit();
		
		Query query1 = em.createQuery("SELECT a FROM Automovel a");
		
		List<Automovel> auto = query1.getResultList();
		for (Automovel a : auto) {
			System.out.println(a.toString());
			
		}

		em.close();
		emf.close();
	}

}
