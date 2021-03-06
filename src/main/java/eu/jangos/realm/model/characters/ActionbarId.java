package eu.jangos.realm.model.characters;
// Generated 06-mai-2016 23:00:34 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ActionbarId generated by hbm2java
 */
@Embeddable
public class ActionbarId  implements java.io.Serializable {


     private long fkGuid;
     private byte button;

    public ActionbarId() {
    }

    public ActionbarId(long fkGuid, byte button) {
       this.fkGuid = fkGuid;
       this.button = button;
    }
   


    @Column(name="fk_guid", nullable=false)
    public long getFkGuid() {
        return this.fkGuid;
    }
    
    public void setFkGuid(long fkGuid) {
        this.fkGuid = fkGuid;
    }


    @Column(name="button", nullable=false)
    public byte getButton() {
        return this.button;
    }
    
    public void setButton(byte button) {
        this.button = button;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ActionbarId) ) return false;
		 ActionbarId castOther = ( ActionbarId ) other; 
         
		 return (this.getFkGuid()==castOther.getFkGuid())
 && (this.getButton()==castOther.getButton());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getFkGuid();
         result = 37 * result + this.getButton();
         return result;
   }   


}


