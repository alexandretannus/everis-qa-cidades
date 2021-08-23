package com.dio.everis.bootcamp.domain.point;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;
import org.postgresql.geometric.PGpoint;
import org.springframework.data.geo.Point;

public class PointType implements UserType {

    @Override
    public Object assemble(Serializable arg0, Object arg1) throws HibernateException {
        return null;
    }

    @Override
    public Object deepCopy(Object arg0) throws HibernateException {
        return null;
    }

    @Override
    public Serializable disassemble(Object arg0) throws HibernateException {
        return null;
    }

    @Override
    public boolean equals(Object arg0, Object arg1) throws HibernateException {
        return false;
    }

    @Override
    public int hashCode(Object arg0) throws HibernateException {
        return 0;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner)
            throws HibernateException, SQLException {
        PGpoint value = (PGpoint) rs.getObject(names[0]);
        return new Point(value.x, value.y);
    }

    @Override
    public void nullSafeSet(PreparedStatement arg0, Object arg1, int arg2, SharedSessionContractImplementor arg3)
            throws HibernateException, SQLException {       
    }

    @Override
    public Object replace(Object arg0, Object arg1, Object arg2) throws HibernateException {
        return null;
    }

    @Override
    public Class returnedClass() {
        return Point.class;
    }

    @Override
    public int[] sqlTypes() {        
        return new int[] {java.sql.Types.OTHER};
    }
    
}
