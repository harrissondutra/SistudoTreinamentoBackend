package br.com.sistudo.treinamento.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "TRAINNING")
public class Trainning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "DURATION", nullable = false)
    private String duration;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "SUBCATEGORY_ID")
    private Subcategory subcategory;

    @Column(name = "REGISTRATION_DATE", nullable = false)
    private String registrationDate;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Trainning trainning = (Trainning) o;
        return id != null && Objects.equals(id, trainning.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}