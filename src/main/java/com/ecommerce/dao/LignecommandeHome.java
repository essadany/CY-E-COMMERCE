package com.ecommerce.dao;
// Generated Nov 1, 2022, 6:01:14 PM by Hibernate Tools 3.6.2.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.ecommerce.metier.Lignecommande;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Lignecommande.
 * @see com.ecommerce.metier.Lignecommande
 * @author Hibernate Tools
 */
public class LignecommandeHome {

	private static final Log log = LogFactory.getLog(LignecommandeHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Lignecommande transientInstance) {
		log.debug("persisting Lignecommande instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Lignecommande instance) {
		log.debug("attaching dirty Lignecommande instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Lignecommande instance) {
		log.debug("attaching clean Lignecommande instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Lignecommande persistentInstance) {
		log.debug("deleting Lignecommande instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Lignecommande merge(Lignecommande detachedInstance) {
		log.debug("merging Lignecommande instance");
		try {
			Lignecommande result = (Lignecommande) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Lignecommande findById(int id) {
		log.debug("getting Lignecommande instance with id: " + id);
		try {
			Lignecommande instance = (Lignecommande) sessionFactory.getCurrentSession()
					.get("com.ecommerce.dao.Lignecommande", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Lignecommande> findByExample(Lignecommande instance) {
		log.debug("finding Lignecommande instance by example");
		try {
			List<Lignecommande> results = (List<Lignecommande>) sessionFactory.getCurrentSession()
					.createCriteria("com.ecommerce.dao.Lignecommande").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
