// --- Christopher Johnson | chrispy1002@gmail.com OR christopher.johnson13@ontariotechu.net | <2022-March-02> | BuilderApplication.java --- //

// * Main components and their variations:
// *    - Build Type:
// *        - Full Tower
// *        - Mid Tower
// *        - Small Form-Factor
// *    - Motherboard:
// *        - E-ATX (Full Tower)
// *        - ATX (Mid Tower)
// *        - Mini-ITX (Small Form-Factor)
// *    - CPU:
// *        - Intel
// *        - AMD
// *    - Memory Type:
// *        - DDR4
// *        - DDR5
// *    - Memory:
// *        - 8GB
// *        - 16GB
// *        - 32GB
// *    - GPU:
// *        - NVIDIA
// *        - Radeon
// *    - Storage Type:
// *        - Solid State
// *        - Hard Disk
// *    - Storage:
// *        - 256GB
// *        - 512GB
// *        - 1024GB
// *    - Cooling Type:
// *        - Air Cooling
// *        - Water Cooling

package com.builder.assignment_01;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;

import java.io.IOException;
import java.util.Objects;

public class BuilderApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // configuring the basic gridpane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(25,25,25,25));
        pane.setPrefSize(500,800);

        // base content to display
        Text title = new Text("PC Builder:"); // creating the title
        title.setFont(Font.font("Helvetica", FontWeight.BOLD, 40)); // changing the font
        GridPane.setHalignment(title, HPos.CENTER); // centering the title
        pane.add(title, 0, 0); // adding the title to the gridpane

        // build type selector Label
        Text buildSelector_Label = new Text("\nBuild Type (Case Size):");
        buildSelector_Label.setFont(Font.font("Verdana", 12));
        GridPane.setHalignment(buildSelector_Label, HPos.CENTER);
        pane.add(buildSelector_Label, 0, 1);
        // build type selector
        ComboBox<String> buildSelector = new ComboBox<>(FXCollections.observableArrayList("Select a Build Type...", "Full Tower", "Mid Tower", "Small Form-Factor"));
        buildSelector.setPromptText("Select a Build Type...");
        GridPane.setHalignment(buildSelector, HPos.CENTER);
        pane.add(buildSelector, 0, 2);

        // when an item is picked, display the possible build options
        buildSelector.setOnAction(event -> {
            String selectedItem = buildSelector.getSelectionModel().getSelectedItem();

            // Full Tower (All build options) [ BUILDER CLASS (Basis for Concrete Builders) ]
            if (Objects.equals(selectedItem, "Full Tower")) {

                // CPU Selector Label
                Text CPUSelector_Label = new Text("\nCPU Vendor:");
                CPUSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(CPUSelector_Label, HPos.CENTER);
                pane.add(CPUSelector_Label, 0, 3);
                // CPU Selector
                ComboBox<String> CPUSelector = new ComboBox<>(FXCollections.observableArrayList("Intel", "AMD"));
                CPUSelector.setPromptText("Select a CPU Vendor...");
                GridPane.setHalignment(CPUSelector, HPos.CENTER);
                pane.add(CPUSelector, 0, 4);

                // Motherboard Form Factor Selector Label
                Text MBFFSelector_Label = new Text("\nMotherboard Type:");
                MBFFSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MBFFSelector_Label, HPos.CENTER);
                pane.add(MBFFSelector_Label, 0, 5);
                // Motherboard Form Factor Selector
                ComboBox<String> MBFFSelector = new ComboBox<>(FXCollections.observableArrayList("E-ATX", "ATX", "Mini-ITX"));
                MBFFSelector.setPromptText("Select a Motherboard Type...");
                GridPane.setHalignment(MBFFSelector, HPos.CENTER);
                pane.add(MBFFSelector, 0, 6);

                // Memory Type Selector Label
                Text MemTypeSelector_Label = new Text("\nMemory Type:");
                MemTypeSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MemTypeSelector_Label, HPos.CENTER);
                pane.add(MemTypeSelector_Label, 0, 7);
                // Memory Type Selector
                ComboBox<String> MemTypeSelector = new ComboBox<>(FXCollections.observableArrayList("DDR4", "DDR5"));
                MemTypeSelector.setPromptText("Select a Memory Type...");
                GridPane.setHalignment(MemTypeSelector, HPos.CENTER);
                pane.add(MemTypeSelector, 0, 8);

                // Memory Type Selector Label
                Text MemSelector_Label = new Text("\nMemory Amount:");
                MemSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MemSelector_Label, HPos.CENTER);
                pane.add(MemSelector_Label, 0, 9);
                // Memory Type Selector
                ComboBox<String> MemSelector = new ComboBox<>(FXCollections.observableArrayList("4GB", "8GB", "12GB", "16GB", "32GB", "64GB", "128GB"));
                MemSelector.setPromptText("Select a Memory Amount...");
                GridPane.setHalignment(MemSelector, HPos.CENTER);
                pane.add(MemSelector, 0, 10);

                // GPU Vendor Selector Label
                Text GPUVendor_Label = new Text("\nGPU Vendor:");
                GPUVendor_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(GPUVendor_Label, HPos.CENTER);
                pane.add(GPUVendor_Label, 0, 11);
                // GPU Vendor Selector
                ComboBox<String> GPUVendor = new ComboBox<>(FXCollections.observableArrayList("NVIDIA", "Radeon"));
                GPUVendor.setPromptText("Select a GPU Vendor...");
                GridPane.setHalignment(GPUVendor, HPos.CENTER);
                pane.add(GPUVendor, 0, 12);

                // Storage Type Selector Label
                Text StorageType_Label = new Text("\nStorage Type:");
                StorageType_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(StorageType_Label, HPos.CENTER);
                pane.add(StorageType_Label, 0, 13);
                // Storage Type Selector
                ComboBox<String> StorageType = new ComboBox<>(FXCollections.observableArrayList("Solid State", "Hard Disk"));
                StorageType.setPromptText("Select a Storage Type...");
                GridPane.setHalignment(StorageType, HPos.CENTER);
                pane.add(StorageType, 0, 14);

                // Storage Amount Selector Label
                Text StorageAmount_Label = new Text("\nStorage Amount:");
                StorageAmount_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(StorageAmount_Label, HPos.CENTER);
                pane.add(StorageAmount_Label, 0, 15);
                // Storage Amount Selector
                ComboBox<String> StorageAmount = new ComboBox<>(FXCollections.observableArrayList("64GB", "128GB", "256GB", "512GB", "1024GB", "2048GB"));
                StorageAmount.setPromptText("Select a Storage Amount...");
                GridPane.setHalignment(StorageAmount, HPos.CENTER);
                pane.add(StorageAmount, 0, 16);

                // Cooling Solution Selector Label
                Text CoolingSolution_Label = new Text("\nCooling Solution:");
                CoolingSolution_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(CoolingSolution_Label, HPos.CENTER);
                pane.add(CoolingSolution_Label, 0, 17);
                // Storage Type Selector
                ComboBox<String> CoolingSolution = new ComboBox<>(FXCollections.observableArrayList("Air Cooled", "Water Cooled"));
                CoolingSolution.setPromptText("Select a Cooling Solution...");
                GridPane.setHalignment(CoolingSolution, HPos.CENTER);
                pane.add(CoolingSolution, 0, 18);

                // Reset Button
                Button resetButton = new Button("Reset");
                resetButton.setMinWidth(pane.getPrefWidth()*0.20);
                GridPane.setHalignment(resetButton, HPos.RIGHT);
                pane.add(resetButton, 0, 21);

                // Submit Button
                Button submitButton = new Button("Submit");
                submitButton.setMinWidth(pane.getPrefWidth()*0.20);
                GridPane.setHalignment(submitButton, HPos.LEFT);
                pane.add(submitButton, 0, 21);

                // on reset button press
                resetButton.setOnAction(event1 -> {
                    buildSelector.getSelectionModel().select(0);

                    pane.getChildren().removeAll(CPUSelector_Label);
                    pane.getChildren().removeAll(CPUSelector);
                    pane.getChildren().removeAll(MBFFSelector_Label);
                    pane.getChildren().removeAll(MBFFSelector);
                    pane.getChildren().removeAll(MemTypeSelector_Label);
                    pane.getChildren().removeAll(MemTypeSelector);
                    pane.getChildren().removeAll(MemSelector_Label);
                    pane.getChildren().removeAll(MemSelector);
                    pane.getChildren().removeAll(GPUVendor_Label);
                    pane.getChildren().removeAll(GPUVendor);
                    pane.getChildren().removeAll(StorageType_Label);
                    pane.getChildren().removeAll(StorageType);
                    pane.getChildren().removeAll(StorageAmount_Label);
                    pane.getChildren().removeAll(StorageAmount);
                    pane.getChildren().removeAll(CoolingSolution_Label);
                    pane.getChildren().removeAll(CoolingSolution);
                    pane.getChildren().removeAll(resetButton);
                    pane.getChildren().removeAll(submitButton);
                });

                // on submit button press
                submitButton.setOnAction(event1 -> {
                    pane.getChildren().removeAll(buildSelector_Label);
                    pane.getChildren().removeAll(buildSelector);
                    pane.getChildren().removeAll(CPUSelector_Label);
                    pane.getChildren().removeAll(CPUSelector);
                    pane.getChildren().removeAll(MBFFSelector_Label);
                    pane.getChildren().removeAll(MBFFSelector);
                    pane.getChildren().removeAll(MemTypeSelector_Label);
                    pane.getChildren().removeAll(MemTypeSelector);
                    pane.getChildren().removeAll(MemSelector_Label);
                    pane.getChildren().removeAll(MemSelector);
                    pane.getChildren().removeAll(GPUVendor_Label);
                    pane.getChildren().removeAll(GPUVendor);
                    pane.getChildren().removeAll(StorageType_Label);
                    pane.getChildren().removeAll(StorageType);
                    pane.getChildren().removeAll(StorageAmount_Label);
                    pane.getChildren().removeAll(StorageAmount);
                    pane.getChildren().removeAll(CoolingSolution_Label);
                    pane.getChildren().removeAll(CoolingSolution);
                    pane.getChildren().removeAll(resetButton);
                    pane.getChildren().removeAll(submitButton);

                    Text submissionTitle = new Text("Your Submission Details:");
                    submissionTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
                    GridPane.setHalignment(submissionTitle, HPos.CENTER);
                    pane.add(submissionTitle, 0, 4);

                    String submissionText = " - CPU VENDOR: " + CPUSelector.getValue() + "\n" +
                                            " - MOTHERBOARD: " + MBFFSelector.getValue() + "\n" +
                                            " - MEMORY: " + MemSelector.getValue() + " " + MemTypeSelector.getValue() + "\n" +
                                            " - GPU VENDOR: " + GPUVendor.getValue() + "\n" +
                                            " - STORAGE: " + StorageAmount.getValue() + " " + StorageType.getValue() + " Drive" + "\n" +
                                            " - COOLING SOLUTION: " + CoolingSolution.getValue() + "\n";
                    Text submissionDetails = new Text(submissionText);
                    submissionDetails.setFont(Font.font("Verdana", 12));
                    GridPane.setHalignment(submissionDetails, HPos.LEFT);
                    pane.add(submissionDetails, 0, 5);
                });
            }

            // Mid Tower (Limited build options) [ CONCRETE BUILDER #1 (Variation of the First Class) ]
            else if (Objects.equals(selectedItem, "Mid Tower")) {

                // CPU Selector Label
                Text CPUSelector_Label = new Text("\nCPU Vendor:");
                CPUSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(CPUSelector_Label, HPos.CENTER);
                pane.add(CPUSelector_Label, 0, 3);
                // CPU Selector
                ComboBox<String> CPUSelector = new ComboBox<>(FXCollections.observableArrayList("Intel", "AMD"));
                CPUSelector.setPromptText("Select a CPU Vendor...");
                GridPane.setHalignment(CPUSelector, HPos.CENTER);
                pane.add(CPUSelector, 0, 4);

                // Motherboard Form Factor Selector Label
                Text MBFFSelector_Label = new Text("\nMotherboard Type:");
                MBFFSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MBFFSelector_Label, HPos.CENTER);
                pane.add(MBFFSelector_Label, 0, 5);
                // Motherboard Form Factor Selector
                ComboBox<String> MBFFSelector = new ComboBox<>(FXCollections.observableArrayList("ATX", "Mini-ITX"));
                MBFFSelector.setPromptText("Select a Motherboard Type...");
                GridPane.setHalignment(MBFFSelector, HPos.CENTER);
                pane.add(MBFFSelector, 0, 6);

                // Memory Type Selector Label
                Text MemTypeSelector_Label = new Text("\nMemory Type:");
                MemTypeSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MemTypeSelector_Label, HPos.CENTER);
                pane.add(MemTypeSelector_Label, 0, 7);
                // Memory Type Selector
                ComboBox<String> MemTypeSelector = new ComboBox<>(FXCollections.observableArrayList("DDR4", "DDR5"));
                MemTypeSelector.setPromptText("Select a Memory Type...");
                GridPane.setHalignment(MemTypeSelector, HPos.CENTER);
                pane.add(MemTypeSelector, 0, 8);

                // Memory Type Selector Label
                Text MemSelector_Label = new Text("\nMemory Amount:");
                MemSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MemSelector_Label, HPos.CENTER);
                pane.add(MemSelector_Label, 0, 9);
                // Memory Type Selector
                ComboBox<String> MemSelector = new ComboBox<>(FXCollections.observableArrayList("4GB", "8GB", "12GB", "16GB", "32GB", "64GB", "128GB"));
                MemSelector.setPromptText("Select a Memory Amount...");
                GridPane.setHalignment(MemSelector, HPos.CENTER);
                pane.add(MemSelector, 0, 10);

                // GPU Vendor Selector Label
                Text GPUVendor_Label = new Text("\nGPU Vendor:");
                GPUVendor_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(GPUVendor_Label, HPos.CENTER);
                pane.add(GPUVendor_Label, 0, 11);
                // GPU Vendor Selector
                ComboBox<String> GPUVendor = new ComboBox<>(FXCollections.observableArrayList("NVIDIA", "Radeon"));
                GPUVendor.setPromptText("Select a GPU Vendor...");
                GridPane.setHalignment(GPUVendor, HPos.CENTER);
                pane.add(GPUVendor, 0, 12);

                // Storage Type Selector Label
                Text StorageType_Label = new Text("\nStorage Type:");
                StorageType_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(StorageType_Label, HPos.CENTER);
                pane.add(StorageType_Label, 0, 13);
                // Storage Type Selector
                ComboBox<String> StorageType = new ComboBox<>(FXCollections.observableArrayList("Solid State", "Hard Disk"));
                StorageType.setPromptText("Select a Storage Type...");
                GridPane.setHalignment(StorageType, HPos.CENTER);
                pane.add(StorageType, 0, 14);

                // Storage Amount Selector Label
                Text StorageAmount_Label = new Text("\nStorage Amount:");
                StorageAmount_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(StorageAmount_Label, HPos.CENTER);
                pane.add(StorageAmount_Label, 0, 15);
                // Storage Amount Selector
                ComboBox<String> StorageAmount = new ComboBox<>(FXCollections.observableArrayList("64GB", "128GB", "256GB", "512GB", "1024GB", "2048GB"));
                StorageAmount.setPromptText("Select a Storage Amount...");
                GridPane.setHalignment(StorageAmount, HPos.CENTER);
                pane.add(StorageAmount, 0, 16);

                // Cooling Solution Selector Label
                Text CoolingSolution_Label = new Text("\nCooling Solution:");
                CoolingSolution_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(CoolingSolution_Label, HPos.CENTER);
                pane.add(CoolingSolution_Label, 0, 17);
                // Storage Type Selector
                ComboBox<String> CoolingSolution = new ComboBox<>(FXCollections.observableArrayList("Air Cooled", "Water Cooled"));
                CoolingSolution.setPromptText("Select a Cooling Solution...");
                GridPane.setHalignment(CoolingSolution, HPos.CENTER);
                pane.add(CoolingSolution, 0, 18);

                // Reset Button
                Button resetButton = new Button("Reset");
                resetButton.setMinWidth(pane.getPrefWidth()*0.20);
                GridPane.setHalignment(resetButton, HPos.RIGHT);
                pane.add(resetButton, 0, 21);

                // Submit Button
                Button submitButton = new Button("Submit");
                submitButton.setMinWidth(pane.getPrefWidth()*0.20);
                GridPane.setHalignment(submitButton, HPos.LEFT);
                pane.add(submitButton, 0, 21);

                // on reset button press
                resetButton.setOnAction(event1 -> {
                    buildSelector.getSelectionModel().select(0);

                    pane.getChildren().removeAll(CPUSelector_Label);
                    pane.getChildren().removeAll(CPUSelector);
                    pane.getChildren().removeAll(MBFFSelector_Label);
                    pane.getChildren().removeAll(MBFFSelector);
                    pane.getChildren().removeAll(MemTypeSelector_Label);
                    pane.getChildren().removeAll(MemTypeSelector);
                    pane.getChildren().removeAll(MemSelector_Label);
                    pane.getChildren().removeAll(MemSelector);
                    pane.getChildren().removeAll(GPUVendor_Label);
                    pane.getChildren().removeAll(GPUVendor);
                    pane.getChildren().removeAll(StorageType_Label);
                    pane.getChildren().removeAll(StorageType);
                    pane.getChildren().removeAll(StorageAmount_Label);
                    pane.getChildren().removeAll(StorageAmount);
                    pane.getChildren().removeAll(CoolingSolution_Label);
                    pane.getChildren().removeAll(CoolingSolution);
                    pane.getChildren().removeAll(resetButton);
                    pane.getChildren().removeAll(submitButton);
                });

                // on submit button press
                submitButton.setOnAction(event1 -> {
                    pane.getChildren().removeAll(buildSelector_Label);
                    pane.getChildren().removeAll(buildSelector);
                    pane.getChildren().removeAll(CPUSelector_Label);
                    pane.getChildren().removeAll(CPUSelector);
                    pane.getChildren().removeAll(MBFFSelector_Label);
                    pane.getChildren().removeAll(MBFFSelector);
                    pane.getChildren().removeAll(MemTypeSelector_Label);
                    pane.getChildren().removeAll(MemTypeSelector);
                    pane.getChildren().removeAll(MemSelector_Label);
                    pane.getChildren().removeAll(MemSelector);
                    pane.getChildren().removeAll(GPUVendor_Label);
                    pane.getChildren().removeAll(GPUVendor);
                    pane.getChildren().removeAll(StorageType_Label);
                    pane.getChildren().removeAll(StorageType);
                    pane.getChildren().removeAll(StorageAmount_Label);
                    pane.getChildren().removeAll(StorageAmount);
                    pane.getChildren().removeAll(CoolingSolution_Label);
                    pane.getChildren().removeAll(CoolingSolution);
                    pane.getChildren().removeAll(resetButton);
                    pane.getChildren().removeAll(submitButton);

                    Text submissionTitle = new Text("Your Submission Details:");
                    submissionTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
                    GridPane.setHalignment(submissionTitle, HPos.CENTER);
                    pane.add(submissionTitle, 0, 4);

                    String submissionText = " - CPU VENDOR: " + CPUSelector.getValue() + "\n" +
                            " - MOTHERBOARD: " + MBFFSelector.getValue() + "\n" +
                            " - MEMORY: " + MemSelector.getValue() + " " + MemTypeSelector.getValue() + "\n" +
                            " - GPU VENDOR: " + GPUVendor.getValue() + "\n" +
                            " - STORAGE: " + StorageAmount.getValue() + " " + StorageType.getValue() + " Drive" + "\n" +
                            " - COOLING SOLUTION: " + CoolingSolution.getValue() + "\n";
                    Text submissionDetails = new Text(submissionText);
                    submissionDetails.setFont(Font.font("Verdana", 12));
                    GridPane.setHalignment(submissionDetails, HPos.LEFT);
                    pane.add(submissionDetails, 0, 5);
                });
            }

            // Small Form-Factor (The Fewest build options) [ CONCRETE BUILDER #2 (Variation of the First Class) ]
            else if (Objects.equals(selectedItem, "Small Form-Factor")) {

                // CPU Selector Label
                Text CPUSelector_Label = new Text("\nCPU Vendor:");
                CPUSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(CPUSelector_Label, HPos.CENTER);
                pane.add(CPUSelector_Label, 0, 3);
                // CPU Selector
                ComboBox<String> CPUSelector = new ComboBox<>(FXCollections.observableArrayList("Intel", "AMD"));
                CPUSelector.setPromptText("Select a CPU Vendor...");
                GridPane.setHalignment(CPUSelector, HPos.CENTER);
                pane.add(CPUSelector, 0, 4);

                // Motherboard Form Factor Selector Label
                Text MBFFSelector_Label = new Text("\nMotherboard Type:");
                MBFFSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MBFFSelector_Label, HPos.CENTER);
                pane.add(MBFFSelector_Label, 0, 5);
                // Motherboard Form Factor Selector
                ComboBox<String> MBFFSelector = new ComboBox<>(FXCollections.observableArrayList("Mini-ITX"));
                MBFFSelector.setPromptText("Select a Motherboard Type...");
                GridPane.setHalignment(MBFFSelector, HPos.CENTER);
                pane.add(MBFFSelector, 0, 6);

                // Memory Type Selector Label
                Text MemTypeSelector_Label = new Text("\nMemory Type:");
                MemTypeSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MemTypeSelector_Label, HPos.CENTER);
                pane.add(MemTypeSelector_Label, 0, 7);
                // Memory Type Selector
                ComboBox<String> MemTypeSelector = new ComboBox<>(FXCollections.observableArrayList("DDR4", "DDR5"));
                MemTypeSelector.setPromptText("Select a Memory Type...");
                GridPane.setHalignment(MemTypeSelector, HPos.CENTER);
                pane.add(MemTypeSelector, 0, 8);

                // Memory Type Selector Label
                Text MemSelector_Label = new Text("\nMemory Amount:");
                MemSelector_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(MemSelector_Label, HPos.CENTER);
                pane.add(MemSelector_Label, 0, 9);
                // Memory Type Selector
                ComboBox<String> MemSelector = new ComboBox<>(FXCollections.observableArrayList("4GB", "8GB", "12GB", "16GB", "32GB", "64GB"));
                MemSelector.setPromptText("Select a Memory Amount...");
                GridPane.setHalignment(MemSelector, HPos.CENTER);
                pane.add(MemSelector, 0, 10);

                // GPU Vendor Selector Label
                Text GPUVendor_Label = new Text("\nGPU Vendor:");
                GPUVendor_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(GPUVendor_Label, HPos.CENTER);
                pane.add(GPUVendor_Label, 0, 11);
                // GPU Vendor Selector
                ComboBox<String> GPUVendor = new ComboBox<>(FXCollections.observableArrayList("NVIDIA", "Radeon"));
                GPUVendor.setPromptText("Select a GPU Vendor...");
                GridPane.setHalignment(GPUVendor, HPos.CENTER);
                pane.add(GPUVendor, 0, 12);

                // Storage Type Selector Label
                Text StorageType_Label = new Text("\nStorage Type:");
                StorageType_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(StorageType_Label, HPos.CENTER);
                pane.add(StorageType_Label, 0, 13);
                // Storage Type Selector
                ComboBox<String> StorageType = new ComboBox<>(FXCollections.observableArrayList("Solid State", "Hard Disk"));
                StorageType.setPromptText("Select a Storage Type...");
                GridPane.setHalignment(StorageType, HPos.CENTER);
                pane.add(StorageType, 0, 14);

                // Storage Amount Selector Label
                Text StorageAmount_Label = new Text("\nStorage Amount:");
                StorageAmount_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(StorageAmount_Label, HPos.CENTER);
                pane.add(StorageAmount_Label, 0, 15);
                // Storage Amount Selector
                ComboBox<String> StorageAmount = new ComboBox<>(FXCollections.observableArrayList("64GB", "128GB", "256GB", "512GB", "1024GB"));
                StorageAmount.setPromptText("Select a Storage Amount...");
                GridPane.setHalignment(StorageAmount, HPos.CENTER);
                pane.add(StorageAmount, 0, 16);

                // Cooling Solution Selector Label
                Text CoolingSolution_Label = new Text("\nCooling Solution:");
                CoolingSolution_Label.setFont(Font.font("Verdana", 12));
                GridPane.setHalignment(CoolingSolution_Label, HPos.CENTER);
                pane.add(CoolingSolution_Label, 0, 17);
                // Storage Type Selector
                ComboBox<String> CoolingSolution = new ComboBox<>(FXCollections.observableArrayList("Air Cooled", "Water Cooled"));
                CoolingSolution.setPromptText("Select a Cooling Solution...");
                GridPane.setHalignment(CoolingSolution, HPos.CENTER);
                pane.add(CoolingSolution, 0, 18);

                // Reset Button
                Button resetButton = new Button("Reset");
                resetButton.setMinWidth(pane.getPrefWidth()*0.20);
                GridPane.setHalignment(resetButton, HPos.RIGHT);
                pane.add(resetButton, 0, 21);

                // Submit Button
                Button submitButton = new Button("Submit");
                submitButton.setMinWidth(pane.getPrefWidth()*0.20);
                GridPane.setHalignment(submitButton, HPos.LEFT);
                pane.add(submitButton, 0, 21);

                // on reset button press
                resetButton.setOnAction(event1 -> {
                    buildSelector.getSelectionModel().select(0);

                    pane.getChildren().removeAll(CPUSelector_Label);
                    pane.getChildren().removeAll(CPUSelector);
                    pane.getChildren().removeAll(MBFFSelector_Label);
                    pane.getChildren().removeAll(MBFFSelector);
                    pane.getChildren().removeAll(MemTypeSelector_Label);
                    pane.getChildren().removeAll(MemTypeSelector);
                    pane.getChildren().removeAll(MemSelector_Label);
                    pane.getChildren().removeAll(MemSelector);
                    pane.getChildren().removeAll(GPUVendor_Label);
                    pane.getChildren().removeAll(GPUVendor);
                    pane.getChildren().removeAll(StorageType_Label);
                    pane.getChildren().removeAll(StorageType);
                    pane.getChildren().removeAll(StorageAmount_Label);
                    pane.getChildren().removeAll(StorageAmount);
                    pane.getChildren().removeAll(CoolingSolution_Label);
                    pane.getChildren().removeAll(CoolingSolution);
                    pane.getChildren().removeAll(resetButton);
                    pane.getChildren().removeAll(submitButton);
                });

                // on submit button press
                submitButton.setOnAction(event1 -> {
                    pane.getChildren().removeAll(buildSelector_Label);
                    pane.getChildren().removeAll(buildSelector);
                    pane.getChildren().removeAll(CPUSelector_Label);
                    pane.getChildren().removeAll(CPUSelector);
                    pane.getChildren().removeAll(MBFFSelector_Label);
                    pane.getChildren().removeAll(MBFFSelector);
                    pane.getChildren().removeAll(MemTypeSelector_Label);
                    pane.getChildren().removeAll(MemTypeSelector);
                    pane.getChildren().removeAll(MemSelector_Label);
                    pane.getChildren().removeAll(MemSelector);
                    pane.getChildren().removeAll(GPUVendor_Label);
                    pane.getChildren().removeAll(GPUVendor);
                    pane.getChildren().removeAll(StorageType_Label);
                    pane.getChildren().removeAll(StorageType);
                    pane.getChildren().removeAll(StorageAmount_Label);
                    pane.getChildren().removeAll(StorageAmount);
                    pane.getChildren().removeAll(CoolingSolution_Label);
                    pane.getChildren().removeAll(CoolingSolution);
                    pane.getChildren().removeAll(resetButton);
                    pane.getChildren().removeAll(submitButton);

                    Text submissionTitle = new Text("Your Submission Details:");
                    submissionTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
                    GridPane.setHalignment(submissionTitle, HPos.CENTER);
                    pane.add(submissionTitle, 0, 4);

                    String submissionText = " - CPU VENDOR: " + CPUSelector.getValue() + "\n" +
                            " - MOTHERBOARD: " + MBFFSelector.getValue() + "\n" +
                            " - MEMORY: " + MemSelector.getValue() + " " + MemTypeSelector.getValue() + "\n" +
                            " - GPU VENDOR: " + GPUVendor.getValue() + "\n" +
                            " - STORAGE: " + StorageAmount.getValue() + " " + StorageType.getValue() + " Drive" + "\n" +
                            " - COOLING SOLUTION: " + CoolingSolution.getValue() + "\n";
                    Text submissionDetails = new Text(submissionText);
                    submissionDetails.setFont(Font.font("Verdana", 12));
                    GridPane.setHalignment(submissionDetails, HPos.LEFT);
                    pane.add(submissionDetails, 0, 5);
                });
            }
        });

        // final configuration, then display
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        Scene scene = new Scene(borderPane, 500, 800);
        stage.setTitle("PC Builder");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}