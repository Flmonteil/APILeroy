package com.leroy.boutique.entity;

import javax.persistence.*;

@Entity
public class Client {

    public Client(Long id_client, String lastname, String firstname, String mail, String number) {
        this.id_client = id_client;
        this.lastname = lastname;
        this.firstname = firstname;
        this.mail = mail;
        this.number = number;
    }

    public Client() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;

    private String lastname;

    private String firstname;

    private String mail;

    private String number;

    public Long getId_client() {
        return id_client;
    }

    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

   /* @OneToMany(mappedBy = "user")
    private List<Purchase> purchaseList;*/
