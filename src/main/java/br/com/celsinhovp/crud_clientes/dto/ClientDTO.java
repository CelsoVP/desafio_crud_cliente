package br.com.celsinhovp.crud_clientes.dto;

import br.com.celsinhovp.crud_clientes.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @Size(min = 3, max = 100, message = "Nome precisar ter de 3 a 100 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;

    private String cpf;

    @PositiveOrZero(message = "O rendimento deverá ser maior ou igual à 0")
    private Double income;

    @PastOrPresent(message = "A data de nascimento não poderá ser maior que a data atual")
    private LocalDate birthDate;
    @PositiveOrZero(message = "A quantidade de filho(s) deverá ser maior ou igual à 0")
    private Integer children;

    public ClientDTO() {

    }
    /*
    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }
    */


    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
