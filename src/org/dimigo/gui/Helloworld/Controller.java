package org.dimigo.gui.Helloworld;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert.AlertType;
import java.io.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Controller implements Initializable {

    @FXML
    private Button goToViewTools;
    @FXML
    private Button goToPlanner;
    @FXML
    private WebView webView;
    @FXML
    private Button naverView;
    @FXML
    private Button googleTranslateView;
    @FXML
    private TextField inputPlan;
    @FXML
    private CheckBox button_NonChecked1;
    @FXML
    private CheckBox button_NonChecked2;
    @FXML
    private CheckBox button_NonChecked3;
    @FXML
    private CheckBox button_NonChecked4;
    @FXML
    private CheckBox button_NonChecked5;
    @FXML
    private CheckBox button_NonChecked6;
    @FXML
    private CheckBox button_NonChecked7;
    @FXML
    private CheckBox button_NonChecked8;
    @FXML
    private CheckBox button_NonChecked9;
    @FXML
    private CheckBox button_NonChecked10;
    @FXML
    private Button planSubmit;
    @FXML
    private ProgressBar percentageBar;
    @FXML
    private Button deleteAll;
    @FXML
    private TextField planBox1;
    @FXML
    private TextField planBox2;
    @FXML
    private TextField planBox3;
    @FXML
    private TextField planBox4;
    @FXML
    private TextField planBox5;
    @FXML
    private TextField planBox6;
    @FXML
    private TextField planBox7;
    @FXML
    private TextField planBox8;
    @FXML
    private TextField planBox9;
    @FXML
    private TextField planBox10;
    @FXML
    private Button delete1;
    @FXML
    private Button delete2;
    @FXML
    private Button delete3;
    @FXML
    private Button delete4;
    @FXML
    private Button delete5;
    @FXML
    private Button delete6;
    @FXML
    private Button delete7;
    @FXML
    private Button delete8;
    @FXML
    private Button delete9;
    @FXML
    private Button delete10;
    @FXML
    private Button saveFile;
    @FXML
    private ProgressBar progressBar;

    @FXML
    public void submit_Plan(Event event) {
        if (!inputPlan.getText().equals("") && !(' ' == inputPlan.getText().charAt(0))) {
            if (!planBox1.isVisible()) {
                planBox1.setVisible(true);
                button_NonChecked1.setVisible(true);
                delete1.setVisible(true);
            } else if (!planBox2.isVisible()) {
                planBox2.setVisible(true);
                button_NonChecked2.setVisible(true);
                delete2.setVisible(true);
            } else if (!planBox3.isVisible()) {
                planBox3.setVisible(true);
                button_NonChecked3.setVisible(true);
                delete3.setVisible(true);
            } else if (!planBox4.isVisible()) {
                planBox4.setVisible(true);
                button_NonChecked4.setVisible(true);
                delete4.setVisible(true);
            } else if (!planBox5.isVisible()) {
                planBox5.setVisible(true);
                button_NonChecked5.setVisible(true);
                delete5.setVisible(true);
            } else if (!planBox6.isVisible()) {
                planBox6.setVisible(true);
                button_NonChecked6.setVisible(true);
                delete6.setVisible(true);
            } else if (!planBox7.isVisible()) {
                planBox7.setVisible(true);
                button_NonChecked7.setVisible(true);
                delete7.setVisible(true);
            } else if (!planBox8.isVisible()) {
                planBox8.setVisible(true);
                button_NonChecked8.setVisible(true);
                delete8.setVisible(true);
            } else if (!planBox9.isVisible()) {
                planBox9.setVisible(true);
                button_NonChecked9.setVisible(true);
                delete9.setVisible(true);
            } else if (!planBox10.isVisible()) {
                planBox10.setVisible(true);
                button_NonChecked10.setVisible(true);
                delete10.setVisible(true);
            }

            if (planBox1.getText().equals("")) {
                planBox1.setText(inputPlan.getText());
                System.out.println(inputPlan.getText());
            } else if (planBox2.getText().equals("")) {
                planBox2.setText(inputPlan.getText());
                System.out.println(inputPlan.getText());
            } else if (planBox3.getText().equals("")) {
                planBox3.setText(inputPlan.getText());
                System.out.println(inputPlan.getText());
            } else if (planBox4.getText().equals("")) {
                planBox4.setText(inputPlan.getText());
                System.out.println(planBox4.getText());
            } else if (planBox5.getText().equals("")) {
                planBox5.setText(inputPlan.getText());
                System.out.println(planBox5.getText());
            } else if (planBox6.getText().equals("")) {
                planBox6.setText(inputPlan.getText());
                System.out.println(planBox6.getText());
            } else if (planBox7.getText().equals("")) {
                planBox7.setText(inputPlan.getText());
                System.out.println(planBox7.getText());
            } else if (planBox8.getText().equals("")) {
                planBox8.setText(inputPlan.getText());
                System.out.println(planBox8.getText());
            } else if (planBox9.getText().equals("")) {
                planBox9.setText(inputPlan.getText());
                System.out.println(planBox9.getText());
            } else if (planBox10.getText().equals("")) {
                planBox10.setText(inputPlan.getText());
                System.out.println(planBox10.getText());
            }
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("공백!");
            alert.setHeaderText("비어있군요.");
            alert.setContentText("텍스트를 적으십시오.");

            alert.showAndWait();
        }
        inputPlan.setText("");
    }


    @FXML
    public void viewTools(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("tools.fxml"));
            Stage stage = new Stage();
            stage.setTitle("TOOLS");
            stage.setScene(new Scene(root, 630, 400));
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void goBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Your Life Must Be happy");
            stage.setScene(new Scene(root, 600, 400));
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void deletePlan1(Event event) {
        if (planBox2.isVisible()) {
            planBox1.setText(planBox2.getText());
            button_NonChecked1.setSelected(button_NonChecked2.isSelected());
            if (planBox3.isVisible()) {
                planBox2.setText(planBox3.getText());
                button_NonChecked2.setSelected(button_NonChecked3.isSelected());
                if (planBox4.isVisible()) {
                    planBox3.setText(planBox4.getText());
                    button_NonChecked3.setSelected(button_NonChecked4.isSelected());
                    if (planBox5.isVisible()) {
                        planBox4.setText(planBox5.getText());
                        button_NonChecked4.setSelected(button_NonChecked5.isSelected());
                        if (planBox6.isVisible()) {
                            planBox5.setText(planBox6.getText());
                            button_NonChecked5.setSelected(button_NonChecked6.isSelected());
                            if (planBox7.isVisible()) {
                                planBox6.setText(planBox7.getText());
                                button_NonChecked6.setSelected(button_NonChecked7.isSelected());
                                if (planBox8.isVisible()) {
                                    planBox7.setText(planBox8.getText());
                                    button_NonChecked7.setSelected(button_NonChecked8.isSelected());
                                    if (planBox9.isVisible()) {
                                        planBox8.setText(planBox9.getText());
                                        button_NonChecked8.setSelected(button_NonChecked9.isSelected());
                                        if (planBox10.isVisible()) {
                                            planBox9.setText(planBox10.getText());
                                            button_NonChecked9.setSelected(button_NonChecked10.isSelected());
                                            planBox10.setVisible(false);
                                            planBox10.setText("");
                                            delete10.setVisible(false);
                                            button_NonChecked10.setVisible(false);
                                            button_NonChecked10.setSelected(false);
                                        } else {
                                            planBox9.setVisible(false);
                                            planBox9.setText("");
                                            delete9.setVisible(false);
                                            button_NonChecked9.setVisible(false);
                                            button_NonChecked9.setSelected(false);
                                        }
                                    } else {
                                        planBox8.setVisible(false);
                                        planBox8.setText("");
                                        delete8.setVisible(false);
                                        button_NonChecked8.setVisible(false);
                                        button_NonChecked8.setSelected(false);
                                    }
                                } else {
                                    planBox7.setVisible(false);
                                    planBox7.setText("");
                                    delete7.setVisible(false);
                                    button_NonChecked7.setVisible(false);
                                    button_NonChecked7.setSelected(false);
                                }
                            } else {
                                planBox6.setVisible(false);
                                planBox6.setText("");
                                delete6.setVisible(false);
                                button_NonChecked6.setVisible(false);
                                button_NonChecked6.setSelected(false);
                            }
                        } else {
                            planBox5.setVisible(false);
                            planBox5.setText("");
                            delete5.setVisible(false);
                            button_NonChecked5.setVisible(false);
                            button_NonChecked5.setSelected(false);
                        }
                    } else {
                        planBox4.setVisible(false);
                        planBox4.setText("");
                        delete4.setVisible(false);
                        button_NonChecked4.setVisible(false);
                        button_NonChecked4.setSelected(false);
                    }
                } else {
                    planBox3.setVisible(false);
                    planBox3.setText("");
                    delete3.setVisible(false);
                    button_NonChecked3.setVisible(false);
                    button_NonChecked3.setSelected(false);
                }
            } else {
                planBox2.setVisible(false);
                planBox2.setText("");
                delete2.setVisible(false);
                button_NonChecked2.setVisible(false);
                button_NonChecked2.setSelected(false);
            }
        } else {
            planBox1.setVisible(false);
            planBox1.setText("");
            delete1.setVisible(false);
            button_NonChecked1.setVisible(false);
            button_NonChecked1.setSelected(false);
        }
    }

    public void deletePlan2(Event event) {
        if (planBox3.isVisible()) {
            planBox2.setText(planBox3.getText());
            button_NonChecked2.setSelected(button_NonChecked3.isSelected());
            if (planBox4.isVisible()) {
                planBox3.setText(planBox4.getText());
                button_NonChecked3.setSelected(button_NonChecked4.isSelected());
                if (planBox5.isVisible()) {
                    planBox4.setText(planBox5.getText());
                    button_NonChecked4.setSelected(button_NonChecked5.isSelected());
                    if (planBox6.isVisible()) {
                        planBox5.setText(planBox6.getText());
                        button_NonChecked5.setSelected(button_NonChecked6.isSelected());
                        if (planBox7.isVisible()) {
                            planBox6.setText(planBox7.getText());
                            button_NonChecked6.setSelected(button_NonChecked7.isSelected());
                            if (planBox8.isVisible()) {
                                planBox7.setText(planBox8.getText());
                                button_NonChecked7.setSelected(button_NonChecked8.isSelected());
                                if (planBox9.isVisible()) {
                                    planBox8.setText(planBox9.getText());
                                    button_NonChecked8.setSelected(button_NonChecked9.isSelected());
                                    if (planBox10.isVisible()) {
                                        planBox9.setText(planBox10.getText());
                                        button_NonChecked9.setSelected(button_NonChecked10.isSelected());
                                        planBox10.setVisible(false);
                                        planBox10.setText("");
                                        delete10.setVisible(false);
                                        button_NonChecked10.setVisible(false);
                                        button_NonChecked10.setSelected(false);
                                    } else {
                                        planBox9.setVisible(false);
                                        planBox9.setText("");
                                        delete9.setVisible(false);
                                        button_NonChecked9.setVisible(false);
                                        button_NonChecked9.setSelected(false);
                                    }
                                } else {
                                    planBox8.setVisible(false);
                                    planBox8.setText("");
                                    delete8.setVisible(false);
                                    button_NonChecked8.setVisible(false);
                                    button_NonChecked8.setSelected(false);
                                }
                            } else {
                                planBox7.setVisible(false);
                                planBox7.setText("");
                                delete7.setVisible(false);
                                button_NonChecked7.setVisible(false);
                                button_NonChecked7.setSelected(false);
                            }
                        } else {
                            planBox6.setVisible(false);
                            planBox6.setText("");
                            delete6.setVisible(false);
                            button_NonChecked6.setVisible(false);
                            button_NonChecked6.setSelected(false);
                        }
                    } else {
                        planBox5.setVisible(false);
                        planBox5.setText("");
                        delete5.setVisible(false);
                        button_NonChecked5.setVisible(false);
                        button_NonChecked5.setSelected(false);
                    }
                } else {
                    planBox4.setVisible(false);
                    planBox4.setText("");
                    delete4.setVisible(false);
                    button_NonChecked4.setVisible(false);
                    button_NonChecked4.setSelected(false);
                }
            } else {
                planBox3.setVisible(false);
                planBox3.setText("");
                delete3.setVisible(false);
                button_NonChecked3.setVisible(false);
                button_NonChecked3.setSelected(false);
            }
        } else {
            planBox2.setVisible(false);
            planBox2.setText("");
            delete2.setVisible(false);
            button_NonChecked2.setVisible(false);
            button_NonChecked2.setSelected(false);
        }
    }

    @FXML
    public void deletePlan3(Event event) {
        if (planBox4.isVisible()) {
            planBox3.setText(planBox4.getText());
            button_NonChecked3.setSelected(button_NonChecked4.isSelected());
            if (planBox5.isVisible()) {
                planBox4.setText(planBox5.getText());
                button_NonChecked4.setSelected(button_NonChecked5.isSelected());
                if (planBox6.isVisible()) {
                    planBox5.setText(planBox6.getText());
                    button_NonChecked5.setSelected(button_NonChecked6.isSelected());
                    if (planBox7.isVisible()) {
                        planBox6.setText(planBox7.getText());
                        button_NonChecked6.setSelected(button_NonChecked7.isSelected());
                        if (planBox8.isVisible()) {
                            planBox7.setText(planBox8.getText());
                            button_NonChecked7.setSelected(button_NonChecked8.isSelected());
                            if (planBox9.isVisible()) {
                                planBox8.setText(planBox9.getText());
                                button_NonChecked8.setSelected(button_NonChecked9.isSelected());
                                if (planBox10.isVisible()) {
                                    planBox9.setText(planBox10.getText());
                                    button_NonChecked9.setSelected(button_NonChecked10.isSelected());
                                    planBox10.setVisible(false);
                                    planBox10.setText("");
                                    delete10.setVisible(false);
                                    button_NonChecked10.setVisible(false);
                                    button_NonChecked10.setSelected(false);
                                } else {
                                    planBox9.setVisible(false);
                                    planBox9.setText("");
                                    delete9.setVisible(false);
                                    button_NonChecked9.setVisible(false);
                                    button_NonChecked9.setSelected(false);
                                }
                            } else {
                                planBox8.setVisible(false);
                                planBox8.setText("");
                                delete8.setVisible(false);
                                button_NonChecked8.setVisible(false);
                                button_NonChecked8.setSelected(false);
                            }
                        } else {
                            planBox7.setVisible(false);
                            planBox7.setText("");
                            delete7.setVisible(false);
                            button_NonChecked7.setVisible(false);
                            button_NonChecked7.setSelected(false);
                        }
                    } else {
                        planBox6.setVisible(false);
                        planBox6.setText("");
                        delete6.setVisible(false);
                        button_NonChecked6.setVisible(false);
                        button_NonChecked6.setSelected(false);
                    }
                } else {
                    planBox5.setVisible(false);
                    planBox5.setText("");
                    delete5.setVisible(false);
                    button_NonChecked5.setVisible(false);
                    button_NonChecked5.setSelected(false);
                }
            } else {
                planBox4.setVisible(false);
                planBox4.setText("");
                delete4.setVisible(false);
                button_NonChecked4.setVisible(false);
                button_NonChecked4.setSelected(false);
            }
        } else {
            planBox3.setVisible(false);
            planBox3.setText("");
            delete3.setVisible(false);
            button_NonChecked3.setVisible(false);
            button_NonChecked3.setSelected(false);
        }
    }

    @FXML
    public void deletePlan4(Event event) {
        if (planBox5.isVisible()) {
            planBox4.setText(planBox5.getText());
            button_NonChecked4.setSelected(button_NonChecked5.isSelected());
            if (planBox6.isVisible()) {
                planBox5.setText(planBox6.getText());
                button_NonChecked5.setSelected(button_NonChecked6.isSelected());
                if (planBox7.isVisible()) {
                    planBox6.setText(planBox7.getText());
                    button_NonChecked6.setSelected(button_NonChecked7.isSelected());
                    if (planBox8.isVisible()) {
                        planBox7.setText(planBox8.getText());
                        button_NonChecked7.setSelected(button_NonChecked8.isSelected());
                        if (planBox9.isVisible()) {
                            planBox8.setText(planBox9.getText());
                            button_NonChecked8.setSelected(button_NonChecked9.isSelected());
                            if (planBox10.isVisible()) {
                                planBox9.setText(planBox10.getText());
                                button_NonChecked9.setSelected(button_NonChecked10.isSelected());
                                planBox10.setVisible(false);
                                planBox10.setText("");
                                delete10.setVisible(false);
                                button_NonChecked10.setVisible(false);
                                button_NonChecked10.setSelected(false);
                            } else {
                                planBox9.setVisible(false);
                                planBox9.setText("");
                                delete9.setVisible(false);
                                button_NonChecked9.setVisible(false);
                                button_NonChecked9.setSelected(false);
                            }
                        } else {
                            planBox8.setVisible(false);
                            planBox8.setText("");
                            delete8.setVisible(false);
                            button_NonChecked8.setVisible(false);
                            button_NonChecked8.setSelected(false);
                        }
                    } else {
                        planBox7.setVisible(false);
                        planBox7.setText("");
                        delete7.setVisible(false);
                        button_NonChecked7.setVisible(false);
                        button_NonChecked7.setSelected(false);
                    }
                } else {
                    planBox6.setVisible(false);
                    planBox6.setText("");
                    delete6.setVisible(false);
                    button_NonChecked6.setVisible(false);
                    button_NonChecked6.setSelected(false);
                }
            } else {
                planBox5.setVisible(false);
                planBox5.setText("");
                delete5.setVisible(false);
                button_NonChecked5.setVisible(false);
                button_NonChecked5.setSelected(false);
            }
        } else {
            planBox4.setVisible(false);
            planBox4.setText("");
            delete4.setVisible(false);
            button_NonChecked4.setVisible(false);
            button_NonChecked4.setSelected(false);
        }
    }

    @FXML
    public void deletePlan5(Event event) {
        if (planBox6.isVisible()) {
            planBox5.setText(planBox6.getText());
            button_NonChecked5.setSelected(button_NonChecked6.isSelected());
            if (planBox7.isVisible()) {
                planBox6.setText(planBox7.getText());
                button_NonChecked6.setSelected(button_NonChecked7.isSelected());
                if (planBox8.isVisible()) {
                    planBox7.setText(planBox8.getText());
                    button_NonChecked7.setSelected(button_NonChecked8.isSelected());
                    if (planBox9.isVisible()) {
                        planBox8.setText(planBox9.getText());
                        button_NonChecked8.setSelected(button_NonChecked9.isSelected());
                        if (planBox10.isVisible()) {
                            planBox9.setText(planBox10.getText());
                            button_NonChecked9.setSelected(button_NonChecked10.isSelected());
                            planBox10.setVisible(false);
                            planBox10.setText("");
                            delete10.setVisible(false);
                            button_NonChecked10.setVisible(false);
                            button_NonChecked10.setSelected(false);
                        } else {
                            planBox9.setVisible(false);
                            planBox9.setText("");
                            delete9.setVisible(false);
                            button_NonChecked9.setVisible(false);
                            button_NonChecked9.setSelected(false);
                        }
                    } else {
                        planBox8.setVisible(false);
                        planBox8.setText("");
                        delete8.setVisible(false);
                        button_NonChecked8.setVisible(false);
                        button_NonChecked8.setSelected(false);
                    }
                } else {
                    planBox7.setVisible(false);
                    planBox7.setText("");
                    delete7.setVisible(false);
                    button_NonChecked7.setVisible(false);
                    button_NonChecked7.setSelected(false);
                }
            } else {
                planBox6.setVisible(false);
                planBox6.setText("");
                delete6.setVisible(false);
                button_NonChecked6.setVisible(false);
                button_NonChecked6.setSelected(false);
            }
        } else {
            planBox5.setVisible(false);
            planBox5.setText("");
            delete5.setVisible(false);
            button_NonChecked5.setVisible(false);
            button_NonChecked5.setSelected(false);
        }
    }

    @FXML
    public void deletePlan6(Event event) {
        if (planBox7.isVisible()) {
            planBox6.setText(planBox7.getText());
            button_NonChecked6.setSelected(button_NonChecked7.isSelected());
            if (planBox8.isVisible()) {
                planBox7.setText(planBox8.getText());
                button_NonChecked7.setSelected(button_NonChecked8.isSelected());
                if (planBox9.isVisible()) {
                    planBox8.setText(planBox9.getText());
                    button_NonChecked8.setSelected(button_NonChecked9.isSelected());
                    if (planBox10.isVisible()) {
                        planBox9.setText(planBox10.getText());
                        button_NonChecked9.setSelected(button_NonChecked10.isSelected());
                        planBox10.setVisible(false);
                        planBox10.setText("");
                        delete10.setVisible(false);
                        button_NonChecked10.setVisible(false);
                        button_NonChecked10.setSelected(false);
                    } else {
                        planBox9.setVisible(false);
                        planBox9.setText("");
                        delete9.setVisible(false);
                        button_NonChecked9.setVisible(false);
                        button_NonChecked9.setSelected(false);
                    }
                } else {
                    planBox8.setVisible(false);
                    planBox8.setText("");
                    delete8.setVisible(false);
                    button_NonChecked8.setVisible(false);
                    button_NonChecked8.setSelected(false);
                }
            } else {
                planBox7.setVisible(false);
                planBox7.setText("");
                delete7.setVisible(false);
                button_NonChecked7.setVisible(false);
                button_NonChecked7.setSelected(false);
            }
        } else {
            planBox6.setVisible(false);
            planBox6.setText("");
            delete6.setVisible(false);
            button_NonChecked6.setVisible(false);
            button_NonChecked6.setSelected(false);
        }
    }

    @FXML
    public void deletePlan7(Event event) {
        if (planBox8.isVisible()) {
            planBox7.setText(planBox8.getText());
            button_NonChecked7.setSelected(button_NonChecked8.isSelected());
            if (planBox9.isVisible()) {
                planBox8.setText(planBox9.getText());
                button_NonChecked8.setSelected(button_NonChecked9.isSelected());
                if (planBox10.isVisible()) {
                    planBox9.setText(planBox10.getText());
                    button_NonChecked9.setSelected(button_NonChecked10.isSelected());
                    planBox10.setVisible(false);
                    planBox10.setText("");
                    delete10.setVisible(false);
                    button_NonChecked10.setVisible(false);
                    button_NonChecked10.setSelected(false);
                } else {
                    planBox9.setVisible(false);
                    planBox9.setText("");
                    delete9.setVisible(false);
                    button_NonChecked9.setVisible(false);
                    button_NonChecked9.setSelected(false);
                }
            } else {
                planBox8.setVisible(false);
                planBox8.setText("");
                delete8.setVisible(false);
                button_NonChecked8.setVisible(false);
                button_NonChecked8.setSelected(false);
            }
        } else {
            planBox7.setVisible(false);
            planBox7.setText("");
            delete7.setVisible(false);
            button_NonChecked7.setVisible(false);
            button_NonChecked7.setSelected(false);
        }
    }

    @FXML
    public void deletePlan8(Event event) {
        if (planBox9.isVisible()) {
            planBox8.setText(planBox9.getText());
            button_NonChecked8.setSelected(button_NonChecked9.isSelected());
            if (planBox10.isVisible()) {
                planBox9.setText(planBox10.getText());
                button_NonChecked9.setSelected(button_NonChecked10.isSelected());
                planBox10.setVisible(false);
                planBox10.setText("");
                delete10.setVisible(false);
                button_NonChecked10.setVisible(false);
                button_NonChecked10.setSelected(false);
            } else {
                planBox9.setVisible(false);
                planBox9.setText("");
                delete9.setVisible(false);
                button_NonChecked9.setVisible(false);
                button_NonChecked9.setSelected(false);
            }
        } else {
            planBox8.setVisible(false);
            planBox8.setText("");
            delete8.setVisible(false);
            button_NonChecked8.setVisible(false);
            button_NonChecked8.setSelected(false);
        }
    }


    @FXML
    public void deletePlan9(Event event) {
        if (planBox10.isVisible()) {
            planBox9.setText(planBox10.getText());
            button_NonChecked9.setSelected(button_NonChecked10.isSelected());
            planBox10.setVisible(false);
            planBox10.setText("");
            delete10.setVisible(false);
            button_NonChecked10.setVisible(false);
            button_NonChecked10.setSelected(false);
        } else {
            planBox9.setVisible(false);
            planBox9.setText("");
            delete9.setVisible(false);
            button_NonChecked9.setVisible(false);
            button_NonChecked9.setSelected(false);
        }
    }

    @FXML
    public void deletePlan10(Event event) {
        if (planBox10.isVisible()) {
            planBox10.setVisible(false);
            planBox10.setText("");
            delete10.setVisible(false);
            button_NonChecked10.setVisible(false);
            button_NonChecked10.setSelected(false);
        }
    }

    @FXML
    public void allDelete(Event event) {
        planBox1.setVisible(false);
        planBox1.setText("");
        delete1.setVisible(false);
        button_NonChecked1.setVisible(false);
        button_NonChecked1.setSelected(false);
        planBox2.setVisible(false);
        planBox2.setText("");
        delete2.setVisible(false);
        button_NonChecked2.setVisible(false);
        button_NonChecked2.setSelected(false);
        planBox3.setVisible(false);
        planBox3.setText("");
        delete3.setVisible(false);
        button_NonChecked3.setVisible(false);
        button_NonChecked3.setSelected(false);
        planBox4.setVisible(false);
        planBox4.setText("");
        delete4.setVisible(false);
        button_NonChecked4.setVisible(false);
        button_NonChecked4.setSelected(false);
        planBox5.setVisible(false);
        planBox5.setText("");
        delete5.setVisible(false);
        button_NonChecked5.setVisible(false);
        button_NonChecked5.setSelected(false);
        planBox6.setVisible(false);
        planBox6.setText("");
        delete6.setVisible(false);
        button_NonChecked6.setVisible(false);
        button_NonChecked6.setSelected(false);
        planBox7.setVisible(false);
        planBox7.setText("");
        delete7.setVisible(false);
        button_NonChecked7.setVisible(false);
        button_NonChecked7.setSelected(false);
        planBox8.setVisible(false);
        planBox8.setText("");
        delete8.setVisible(false);
        button_NonChecked8.setVisible(false);
        button_NonChecked8.setSelected(false);
        planBox9.setVisible(false);
        planBox9.setText("");
        delete9.setVisible(false);
        button_NonChecked9.setVisible(false);
        button_NonChecked9.setSelected(false);
        planBox10.setVisible(false);
        planBox10.setText("");
        delete10.setVisible(false);
        button_NonChecked10.setVisible(false);
        button_NonChecked10.setSelected(false);
    }

    @FXML
    public void viewTranslater() {
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://translate.google.com/?rlz=1C1OKWM_koKR784KR784&um=1&ie=UTF-8&hl=ko&client=tw-ob#en/ko/");
    }

    @FXML
    public void viewNaverTimer() {
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://ssl.pstatic.net/sstatic/keypage/outside/timer/timer_160627_2.html");
    }

    @FXML
    public void cbChecked() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
