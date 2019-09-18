
package Clases;

import java.util.ArrayList;

public class Cuentas {
 
    public int CtaCodigo;
    public String CtaNombre;
    public String CtaId;
    public int Cuenta1;
    public int Cuenta2;

    public Cuentas() {
        this.CtaCodigo = -1;
        this.CtaNombre = "<Vacio>";
        this.CtaId = "<Vacio>";
        this.Cuenta1 = -1;
        this.Cuenta2 = -1;
    }
    
    public void setCuentas(int CtaCodigo, String CtaNombre, String CtaId, int Cuenta1, int Cuenta2) {
        this.CtaCodigo = CtaCodigo;
        this.CtaNombre = CtaNombre;
        this.CtaId = CtaId;
        this.Cuenta1 = Cuenta1;
        this.Cuenta2 = Cuenta2;
    }
    
    public Cuentas(int CtaCodigo, String CtaNombre, String CtaId, int Cuenta1, int Cuenta2) {
        this.CtaCodigo = CtaCodigo;
        this.CtaNombre = CtaNombre;
        this.CtaId = CtaId;
        this.Cuenta1 = Cuenta1;
        this.Cuenta2 = Cuenta2;
    }

    
    
    public int Buscar(ArrayList LCc) {
        int Resp = -1;
        Cuentas CC1 = new Cuentas();
        for (int i = 0; i < LCc.size(); i++) {
            CC1 = (Cuentas) LCc.get(i);
            if (CC1.CtaCodigo==(this.CtaCodigo)) {
                Resp = i;
            }
        }
        return Resp;
    }
   
    
    
}
