package gianghx.lab.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "tb_mgmt_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "address")
    private String address;
    @Column(name = "information")
    private String info;
    @Column(name = "created_date", insertable = false , updatable = false)
    private Date createdDate;
    @Column(name = "updated_date", insertable = false)
    private Date updatedDate;
}
