package br.fiap.assistencia_tecnica.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String senha;

}
