/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualbelihp;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Abdurrahman
 */
@Entity
public class hanphone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nama;
    private String alamat;
    private String NoTelpon;
    private String MerkHanphone;
    private String Iduser;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != 1 ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof hanphone)) {
            return false;
        }
        hanphone other = (hanphone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jualbelihp.hanphone[ id=" + id + " ]";
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String b) {
        this.nama = b;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String c) {
        this.alamat = c;
    }
    public String getNoTelpon() {
        return NoTelpon;
    }
    public void setNoTelpon(String d) {
        this.NoTelpon = d;
    }
    public String getMerkHanphone() {
        return MerkHanphone;
    }
    public void setMerkHanphone(String e) {
        this.MerkHanphone = e;
    }
    public String getIduser() {
        return Iduser;
    }
    public void setIduser(String a) {
        this.Iduser = a;
    }
}
