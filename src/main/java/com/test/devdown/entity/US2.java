/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.devdown.entity;

import java.io.Serializable;
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
@Table(name = "US2")
public class US2 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "STASH_US2")
    private String stashUs2;
    
    @Column(name = "STASH_US2_2")
    private String stashUs22;
    
    @Column(name = "STASH_US2_3")
    private String stashUs23;
}
