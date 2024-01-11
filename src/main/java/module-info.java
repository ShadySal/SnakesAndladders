module com.example.snakesandladders {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.snakesandladders to javafx.fxml;
    exports com.example.snakesandladders;
    exports com.example.snakesandladders.Controller;
    opens com.example.snakesandladders.Controller to javafx.fxml;
}