/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import org.hibernate.Session;
import zavrsnirad.model.Entitet;
import zavrsnirad.util.AppException;
import zavrsnirad.util.HibernateUtil;

/**
 *
 * @author lovre
 */
public abstract class Obrada<T extends Entitet> {

    protected T entitet;

    protected Session session;

    public abstract List<T> read();

    protected abstract void kontrolaUnos() throws AppException;

    protected abstract void kontrolaPromjena() throws AppException;

    protected abstract void kontrolaBrisanje() throws AppException;

    public Obrada() {
        this.session = HibernateUtil.getSession();

    }

    public void create() throws AppException {
        if (entitet == null) {
            throw new AppException("Entitet je null");
        }

        kontrolaUnos();
        persist();

    }

    public void update() throws AppException {
        kontrolaPromjena();
        persist();

    }

    public void delete() throws AppException {
        kontrolaBrisanje();
        session.beginTransaction();
        session.remove(entitet);
        session.getTransaction().commit();

    }

    private void persist() {
        session.beginTransaction();
        session.persist(entitet);
        session.getTransaction().commit();

    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

}
