package com.fearlessdev.app.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author jaycverg <jaycverg@gmail.com>
 */
@Entity
@Table(name = "employee")
@NamedQuery(name = "Employee.findAll", query = "from Employee")
public class Employee extends BaseEntity
{

    @Column(name = "first_name", length = 50)
    @NotEmpty(message = "First name is requried")
    private String firstName;

    @Column(name = "last_name", length = 50)
    @NotEmpty(message = "Last name is requried")
    private String lastName;

    @Column(name = "middle_name", length = 50)
    private String middleName;
    
    @Column(name = "address", length = 255)
    @NotEmpty(message = "Address name is requried")
    private String address;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date birthDate;

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName()
    {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate()
    {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }
}
