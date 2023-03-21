/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import mvc.controlador.CtrlProducto;
import mvc.modelo.ConsultasProducto;
import mvc.modelo.Producto;
import mvc.vista.frmProducto;
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        frmProducto frm = new frmProducto();

        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}