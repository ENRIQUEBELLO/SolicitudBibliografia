package Controlador;

import Modelo.ModeloInstituto;
import include.Instituto;

public class ControladorInstituto {
    public boolean crear_instituto(Instituto a) {
        ModeloInstituto modeloInstituto = new ModeloInstituto();
        return modeloInstituto.crear_instituto(a);
    }

    public String getViewInstitutos() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>ClaveInst</th>\n" +
                "\t\t\t\t            <th>NombreInst</th>\n" +
                "\t\t\t\t            <th>DireccionInst</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloInstituto modeloInstituto = new ModeloInstituto();
        int i =0;

        for (Instituto a : modeloInstituto.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getClaveInst() + "</td>" +
                    "<td>" + a.getNombreInst() + "</td>" +
                    "<td>" + a.getDireccionInst() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }
    public String getViewInstitutosCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloInstituto modeloInstituto = new ModeloInstituto();
        int i =0;

        for (Instituto a : modeloInstituto.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombreInst()+
                    "               </span> " +
                    "               <p>" +
                    "                   Clave Instituto " + a.getClaveInst() +
                    "                   <br>Nombre: " + a.getNombreInst() +
                    "                   <br>Dirección: " + a.getDireccionInst() +
                    "               </p>"+
                    "           </div>\n" +
                    "       <div class=\"card-action\">\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "       </div>\n" +
                    "       </div>\n" +
                    "   </div>\n";
        }
        htmlcode += "" +
                "      </div>";
        return htmlcode;
    }
}



