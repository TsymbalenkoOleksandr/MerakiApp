package com.meraki.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "blackBook")
public class BlackBook {

    private static final long serialVersionUID = -7988799579036225137L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "clientMac")
    private String clientMac;

}
