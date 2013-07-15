package com.fearlessdev.app.model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * The base structure of all JPA entities
 *
 * @author jaycverg <jaycverg@gmail.com>
 */
@MappedSuperclass
public class BaseEntity implements Cloneable, Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;

    @Override
    protected Object clone()
    {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof BaseEntity
                && obj.hashCode() == hashCode();
    }

    @Override
    public int hashCode()
    {
        return (getClass().getName() + id).hashCode();
    }

    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * @return the version
     */
    public Long getVersion()
    {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Long version)
    {
        this.version = version;
    }

}
