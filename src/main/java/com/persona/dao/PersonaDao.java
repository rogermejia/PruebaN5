package com.persona.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.persona.config.HibernateUtil;

import Entidades.Datos;
import Entidades.Genero;

public class PersonaDao {

	List<Datos> listDatos;
	List<Genero> listGenero;

	public List<Datos> getAllDatos() {
		listDatos = new ArrayList<Datos>();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			listDatos = session.createQuery("from Datos", Datos.class).list(); // from [Entity] va siempre inicial
																				// mayuscula
			System.out.println("************ All datos llena " + listDatos.size());
//			for (Datos d : listDatos) {
//				System.out.println("************ Datos Dao " + d.getIdPersona());
//				System.out.println("************ Datos Dao " + d.getNombre());
//				System.out.println("************ Datos Dao " + d.getApellido());
//				System.out.println("************ Datos Dao " + d.getNacimiento());
//				System.out.println("************ Datos Dao " + d.getCorreo());
//				System.out.println("************ Datos Dao Id Genero " + d.getIdGenero());
//				System.out.println("************ Datos Dao Genero.class " + d.getId_genero());
//				System.out.println("************ Datos Dao " + d.getId_genero().getGenero());
//			}
			return listDatos;
		}
	}

	public List<Genero> getAllGeneros() {
		listGenero = new ArrayList<Genero>();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			listGenero = session.createQuery("from Genero", Genero.class).list(); // from [Entity] va siempre inicial mayuscula
			System.out.println("************ All generos llena " + listGenero.size());
//				for (Genero g : listGenero) {
//					System.out.println("************ Genero Dao " + g.getIdGenero());
//					System.out.println("************ Genero Dao " + g.getGenero());
//				}
			return listGenero;
		}
	}
	
	
	public void guardarDato (Datos d) {
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.save(d);
	      session.getTransaction().commit();
	      //HibernateUtil.shutdown();
	      System.out.println("Tutto è andato bene");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("C'è qualcosa che non va");
		}
	}
	
	

	
}
