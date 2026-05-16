package br.com.serratec.trabalho.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Medico extends Pessoa{

    @NotNull(message = "CRM obrigatório!")
    private Long crm;

    @NotBlank(message = "Especialidade obrigatória!")
    private String especialidade;

    public Long getCrm() {
        return crm;
    }

    public void setCrm(Long crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
