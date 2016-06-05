/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.devdown.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Peter
 */

@Entity
@Table(name = "US1")
public class US1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "TEST1")
    private String test1;

    @Column(name = "TEST2")
    private String test2;
    
    @Column(name = "STACH")
    private String stach;
    
    @Column(name = "STACH2")
    private String stach2;
    
    @Column(name = "STACH3")
    private String stach3;
}
