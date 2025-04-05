package com.eventostec.api.domain.address;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "address")
@Entity
public class Address {

  @Id
  @GeneratedValue
  private UUID id;

  private String city;

  private String uf;

  @ManyToOne
  @JoinColumn(name = "event_id")
  private Event event;
}
