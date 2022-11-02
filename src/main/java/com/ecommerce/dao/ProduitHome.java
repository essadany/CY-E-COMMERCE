package com.ecommerce.dao;
// Generated Nov 1, 2022, 6:01:14 PM by Hibernate Tools 3.6.2.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.ecommerce.metier.Produit;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Produit.
 * @see com.ecommerce.metier.Produit
 * @author Hibernate Tools
 */
public class ProduitHome {

	private static final Log log = LogFactory.getLog(ProduitHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Produit transientInstance) {
		log.debug("persisting Produit instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Produit instance) {
		log.debug("attaching dirty Produit instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Produit instance) {
		log.debug("attaching clean Produit instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Produit persistentInstance) {
		log.debug("deleting Produit instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Produit merge(Produit detachedInstance) {
		log.debug("merging Produit instance");
		try {
			Produit result = (Produit) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Produit findById(int id) {
		log.debug("getting Produit instance with id: " + id);
		try {
			Produit instance = (Produit) sessionFactory.getCurrentSession().get("com.ecommerce.dao.Produit", id);
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

	public List<Produit> findByExample(Produit instance) {
		log.debug("finding Produit instance by example");
		try {
			List<Produit> results = (List<Produit>) sessionFactory.getCurrentSession()
					.createCriteria("com.ecommerce.dao.Produit").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
