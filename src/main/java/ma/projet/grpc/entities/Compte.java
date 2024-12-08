package ma.projet.grpc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Compte {
    @Id
    private String id;
    private float solde;
    private String dateCreation;
    private String type;

}