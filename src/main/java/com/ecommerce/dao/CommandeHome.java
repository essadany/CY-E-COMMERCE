package com.ecommerce.dao;
// Generated Nov 1, 2022, 6:01:14 PM by Hibernate Tools 3.6.2.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.ecommerce.metier.Commande;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Commande.
 * @see com.ecommerce.metier.Commande
 * @author Hibernate Tools
 */
public class CommandeHome {

	private static final Log log = LogFactory.getLog(CommandeHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Commande transientInstance) {
		log.debug("persisting Commande instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Commande instance) {
		log.debug("attaching dirty Commande instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Commande instance) {
		log.debug("attaching clean Commande instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Commande persistentInstance) {
		log.debug("deleting Commande instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Commande merge(Commande detachedInstance) {
		log.debug("merging Commande instance");
		try {
			Commande result = (Commande) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Commande findById(int id) {
		log.debug("getting Commande instance with id: " + id);
		try {
			Commande instance = (Commande) sessionFactory.getCurrentSession().get("com.ecommerce.dao.Commande", id);
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

	public List<Commande> findByExample(Commande instance) {
		log.debug("finding Commande instance by example");
		try {
			List<Commande> results = (List<Commande>) sessionFactory.getCurrentSession()
					.createCriteria("com.ecommerce.dao.Commande").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
