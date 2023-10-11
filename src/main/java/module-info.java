module bcs.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens bcs.tipcalculator to javafx.fxml;
    exports bcs.tipcalculator;
}
