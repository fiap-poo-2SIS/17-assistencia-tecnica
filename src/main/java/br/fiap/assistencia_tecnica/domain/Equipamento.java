package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "JAVA_EQUIPAMENTO")
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EQUIP")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE", nullable = false, foreignKey = @ForeignKey(name = "FK_EQUIP_CLIENTE"))
    private Cliente cliente;

    @Column(name = "TIPO", nullable = false, length = 50)
    private String tipo;

    @Column(name = "MARCA", nullable = false, length = 50)
    private String marca;

    @Column(name = "MODELO", nullable = false, length = 50)
    private String modelo;

    @Column(name = "NUMERO_SERIE", nullable = false, length = 80)
    private String numeroSerie;

    @Column(name = "DATA_CADASTRO", nullable = false)
    private LocalDate dataCadastro;

}
