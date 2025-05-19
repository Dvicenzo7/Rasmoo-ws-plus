package com.client.ws.rasmooplus.dto;

import com.client.ws.rasmooplus.model.SubcriptionType;
import com.client.ws.rasmooplus.model.User;
import com.client.ws.rasmooplus.model.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class UserDto {

    private Long id;

    @NotBlank(message = "Não pode ser nulo ou vazio")
    @Size(min = 6, message = "Valor minimo igual a 6 caracters")
    private String name;

    @Email(message = "invalido")
    private String email;

    @Size(min = 11, message = "Valor miínimo igual a 11 dígitos")
    private String phone;

    @CPF(message = "invalido")
    private String cpf;
    private LocalDate dtSubscription = LocalDate.now();
    private LocalDate dtExpiration = LocalDate.now();

    @NotNull
    private Long userType;

    private Long subcriptionType;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.cpf = user.getCpf();
        this.dtSubscription = user.getDtSubscription();
        this.dtExpiration = user.getDtExpiration();
        this.userType = user.getUserType() != null ? user.getUserType().getId() : null;
        this.subcriptionType = user.getSubcriptionType() != null ? user.getSubcriptionType().getId() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtSubscription() {
        return dtSubscription;
    }

    public void setDtSubscription(LocalDate dtSubscription) {
        this.dtSubscription = dtSubscription;
    }

    public LocalDate getDtExpiration() {
        return dtExpiration;
    }

    public void setDtExpiration(LocalDate dtExpiration) {
        this.dtExpiration = dtExpiration;
    }

    public Long getUserType() {
        return userType;
    }

    public void setUserType(Long userType) {
        this.userType = userType;
    }

    public Long getSubcriptionType() {
        return subcriptionType;
    }

    public void setSubcriptionType(Long subcriptionType) {
        this.subcriptionType = subcriptionType;
    }
}
