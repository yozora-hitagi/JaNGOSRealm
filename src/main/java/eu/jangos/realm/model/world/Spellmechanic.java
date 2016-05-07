package eu.jangos.realm.model.world;
// Generated 06-mai-2016 21:17:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Spellmechanic generated by hbm2java
 */
@Entity
@Table(name="spellmechanic"
    ,catalog="jangosworld"
)
public class Spellmechanic  implements java.io.Serializable {


     private byte id;
     private String mechanic;
     private Set<Spells> spellses = new HashSet<Spells>(0);
     private Set<Spellspelleffects> spellspelleffectses = new HashSet<Spellspelleffects>(0);

    public Spellmechanic() {
    }

	
    public Spellmechanic(byte id, String mechanic) {
        this.id = id;
        this.mechanic = mechanic;
    }
    public Spellmechanic(byte id, String mechanic, Set<Spells> spellses, Set<Spellspelleffects> spellspelleffectses) {
       this.id = id;
       this.mechanic = mechanic;
       this.spellses = spellses;
       this.spellspelleffectses = spellspelleffectses;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public byte getId() {
        return this.id;
    }
    
    public void setId(byte id) {
        this.id = id;
    }

    
    @Column(name="mechanic", nullable=false, length=45)
    public String getMechanic() {
        return this.mechanic;
    }
    
    public void setMechanic(String mechanic) {
        this.mechanic = mechanic;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="spellmechanic")
    public Set<Spells> getSpellses() {
        return this.spellses;
    }
    
    public void setSpellses(Set<Spells> spellses) {
        this.spellses = spellses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="spellmechanic")
    public Set<Spellspelleffects> getSpellspelleffectses() {
        return this.spellspelleffectses;
    }
    
    public void setSpellspelleffectses(Set<Spellspelleffects> spellspelleffectses) {
        this.spellspelleffectses = spellspelleffectses;
    }




}

