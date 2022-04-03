package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime transactionDate;
    //	private Long fromAccount;
//	private Long toAccount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fronmAccount",referencedColumnName="id")
    private Account fromAccount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "toAccount",referencedColumnName="id")
    private Account toAccount;
    private Double amount;
    private Integer status;
    private String content;
    private String errorReason;
}
