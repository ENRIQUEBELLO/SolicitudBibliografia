package Controlador;

import Modelo.ModeloLibro;

import include.Libro;

public class ControladorLibro {
    public boolean crear_libro (Libro a) {
        ModeloLibro modeloLibro = new ModeloLibro();
        return modeloLibro.crear_libro (a);
    }

    public String getViewLibros() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Nomre</th>\n" +
                "\t\t\t\t            <th>Nombre Autores</th>\n" +
                "\t\t\t\t            <th>Editorial</th>\n" +
                "\t\t\t\t            <th>Año</th>\n" +
                "\t\t\t\t            <th>ISBN</th>\n" +
                "\t\t\t\t            <th>Edicion</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloLibro modeloLibro = new ModeloLibro();
        int i =0;

        for (Libro a : modeloLibro.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "<td>" + a.getAutores() + "</td>" +
                    "<td>" + a.getEditorial() + "</td>" +
                    "<td>" + a.getAño() + "</td>" +
                    "<td>" + a.getISBN() + "</td>" +
                    "<td>" + a.getEdicion() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewLibrosCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloLibro modeloLibro = new ModeloLibro();
        int i =0;

        for (Libro a : modeloLibro.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   Nombre: " + a.getNombre() +
                    "                   <br>Autores: " + a.getAutores() +
                    "                   <br>Editorial: " + a.getEditorial() +
                    "                   <br>Año: " + a.getAño() +
                    "                   <br>ISBN " + a.getISBN() +
                    "                   <br>Edicion " + a.getEdicion() +
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


