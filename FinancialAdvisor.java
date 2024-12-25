package com.example.project.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String name;
    private String email;
    private String phone;
    private String workingHours;

    @OneToMany(mappedBy = "financialAdvisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String name, String email, String phone, String workingHours) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.workingHours = workingHours;
    }

    // Getters and Setters
}
