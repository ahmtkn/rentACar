package kodlama.io.rentACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "brands")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor // parametlereli constructor oluşturuyor
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id yi auotoincrement yapar
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
