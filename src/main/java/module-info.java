module co.edu.poli.JuanaDanielaNaranjoAlipio {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.poli.JuanaDanielaNaranjoAlipio to javafx.fxml;
    opens co.edu.poli.JuanaDanielaNaranjoAlipio.Controlador to javafx.fxml ;
    exports co.edu.poli.JuanaDanielaNaranjoAlipio.vista;
    exports co.edu.poli.JuanaDanielaNaranjoAlipio.Controlador;
}
