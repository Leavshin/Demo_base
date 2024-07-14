package org.example.demo_base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
    private String nom;
    private String prenom;
    private int age;
}
