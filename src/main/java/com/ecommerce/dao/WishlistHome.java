package com.ecommerce.dao;
// Generated Nov 1, 2022, 6:01:14 PM by Hibernate Tools 3.6.2.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.ecommerce.metier.Wishlist;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Wishlist.
 * @see com.ecommerce.metier.Wishlist
 * @author Hibernate Tools
 */
public class WishlistHome {

	private static final Log log = LogFactory.getLog(WishlistHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Wishlist transientInstance) {
		log.debug("persisting Wishlist instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Wishlist instance) {
		log.debug("attaching dirty Wishlist instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Wishlist instance) {
		log.debug("attaching clean Wishlist instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Wishlist persistentInstance) {
		log.debug("deleting Wishlist instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Wishlist merge(Wishlist detachedInstance) {
		log.debug("merging Wishlist instance");
		try {
			Wishlist result = (Wishlist) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Wishlist findById(int id) {
		log.debug("getting Wishlist instance with id: " + id);
		try {
			Wishlist instance = (Wishlist) sessionFactory.getCurrentSession().get("com.ecommerce.dao.Wishlist", id);
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

	public List<Wishlist> findByExample(Wishlist instance) {
		log.debug("finding Wishlist instance by example");
		try {
			List<Wishlist> results = (List<Wishlist>) sessionFactory.getCurrentSession()
					.createCriteria("com.ecommerce.dao.Wishlist").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
