package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId",referencedColumnName="id")
    private Account customerId;
    //	private Long customerId;
    private Double balance;
    private Integer status;
    private	LocalDateTime create_datetime;
    private LocalDateTime update_datetime;


}
