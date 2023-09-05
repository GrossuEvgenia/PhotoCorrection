module com.example.lr6_kg {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.lr6_kg to javafx.fxml;
    exports com.example.lr6_kg;
}