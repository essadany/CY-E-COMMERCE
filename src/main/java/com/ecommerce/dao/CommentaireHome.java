package com.ecommerce.dao;
// Generated Nov 1, 2022, 6:01:14 PM by Hibernate Tools 3.6.2.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.ecommerce.metier.Commentaire;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Commentaire.
 * @see com.ecommerce.metier.Commentaire
 * @author Hibernate Tools
 */
public class CommentaireHome {

	private static final Log log = LogFactory.getLog(CommentaireHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Commentaire transientInstance) {
		log.debug("persisting Commentaire instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Commentaire instance) {
		log.debug("attaching dirty Commentaire instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Commentaire instance) {
		log.debug("attaching clean Commentaire instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Commentaire persistentInstance) {
		log.debug("deleting Commentaire instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Commentaire merge(Commentaire detachedInstance) {
		log.debug("merging Commentaire instance");
		try {
			Commentaire result = (Commentaire) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Commentaire findById(int id) {
		log.debug("getting Commentaire instance with id: " + id);
		try {
			Commentaire instance = (Commentaire) sessionFactory.getCurrentSession().get("com.ecommerce.dao.Commentaire",
					id);
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

	public List<Commentaire> findByExample(Commentaire instance) {
		log.debug("finding Commentaire instance by example");
		try {
			List<Commentaire> results = (List<Commentaire>) sessionFactory.getCurrentSession()
					.createCriteria("com.ecommerce.dao.Commentaire").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
