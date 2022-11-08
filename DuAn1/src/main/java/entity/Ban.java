package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Ban")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ban implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    
    @Column(name = "MaBan")
    private String maBan;
    
    @Column(name = "TenBan")
    private String tenBan;
    
    @Column(name = "TrangThai")
    private int trangThai;
    
    @Column(name = "ViTri")
    private int viTri;
    
}
