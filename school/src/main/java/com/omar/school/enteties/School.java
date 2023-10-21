package com.omar.school.enteties;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class School {

    @Id
    private Integer id;
    private String firstname;
    private String  lastname;
    private String email;
    private Integer schoolId;


}
