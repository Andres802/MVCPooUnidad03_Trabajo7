/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.AsignaturaControlador;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author ochoa
 */
public class VentanaAsignatura extends JFrame implements ActionListener{

    private AsignaturaControlador asignautraControl;
    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JButton> jButtonList;
    public List<JTextField> jTextFieldList;
    public List<JCheckBox> jCheckBox;
    public List<JRadioButton> jRadioButtonList;
    public ButtonGroup ButtonGroup1;
    public List<JComboBox> jComboBoxList;

    public VentanaAsignatura() {
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponente();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarComponente() {

        var font = new Font("Verdana", Font.BOLD, 20);
        var font1 = new Font("Verdana", Font.ITALIC, 12);
        this.asignautraControl = new AsignaturaControlador();
        this.jButtonList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jRadioButtonList = new ArrayList<>();
        this.jComboBoxList = new ArrayList<>();

        //-----------------------JPANEL-------------------------------//
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setLayout(new GridLayout(7, 1));

        this.jPanelList.get(1).setBackground(Color.DARK_GRAY);
        this.jPanelList.get(1).setBorder(new LineBorder(Color.WHITE));

        this.jPanelList.get(2).setBackground(Color.white);
        this.jPanelList.get(2).setOpaque(true);

        this.jPanelList.get(3).setBackground(Color.white);
        this.jPanelList.get(4).setBackground(Color.white);
        this.jPanelList.get(5).setBackground(Color.white);
        this.jPanelList.get(6).setBackground(Color.white);
        

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
       

        //---------------------JLABEL -------------------------------------//
        this.jLabelList.add(new JLabel("DATOS DE LA ASIGNATURA"));
        this.jLabelList.add(new JLabel("Codigo Asignatura:"));
        this.jLabelList.add(new JLabel("Materia:"));
        this.jLabelList.add(new JLabel("Clase:"));
        this.jLabelList.add(new JLabel("Plan de Estudio:"));
        this.jLabelList.add(new JLabel("Carrera de la Asiganutra:"));


        this.jLabelList.get(0).setForeground(Color.WHITE);

        this.jLabelList.get(0).setFont(font);

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(6).add(this.jLabelList.get(5));
       

        //--------------------JTEXTFIELD -----------------------------------//
        this.jTextFieldList.add(new JTextField(2));
        this.jTextFieldList.add(new JTextField(12));
        this.jTextFieldList.add(new JTextField(12));
        
        

        this.jTextFieldList.get(0).setFont(font1);
        this.jTextFieldList.get(1).setFont(font1);
        this.jTextFieldList.get(2).setFont(font1);

        this.jPanelList.get(2).add(this.jTextFieldList.get(0));
        this.jPanelList.get(5).add(this.jTextFieldList.get(1));
        this.jPanelList.get(6).add(this.jTextFieldList.get(2));
        
        //--------------------JRADIOBUTTON------------------------------------//
        
        this.jRadioButtonList.add(new JRadioButton());
        this.jRadioButtonList.add(new JRadioButton());
        
        this.jRadioButtonList.get(0).setFont(font1);
        this.jRadioButtonList.get(1).setFont(font1);

        this.jRadioButtonList.get(0).setText("Diurno");
        this.jRadioButtonList.get(1).setText("Nocturno");

        this.jRadioButtonList.get(0).setBackground(Color.white);
        this.jRadioButtonList.get(1).setBackground(Color.white);
        
        this.ButtonGroup1 = new ButtonGroup();
        this.ButtonGroup1.add(this.jRadioButtonList.get(0));
        this.ButtonGroup1.add(this.jRadioButtonList.get(1));
        
        this.jRadioButtonList.get(0).addActionListener(this);
        this.jRadioButtonList.get(1).addActionListener(this);
        
        this.jPanelList.get(4).add(this.jRadioButtonList.get(0));
        this.jPanelList.get(4).add(this.jRadioButtonList.get(1));
        
        //--------------------JCOMBOBOX ------------------------------------//
        
        this.jComboBoxList.add(new JComboBox());
        
        
        this.jComboBoxList.get(0).setFont(font1);
        this.jComboBoxList.get(0).setBackground(Color.WHITE);
        
        this.jComboBoxList.get(0).addItem("Calculo Diferencial");
        this.jComboBoxList.get(0).addItem("Programacion");
        this.jComboBoxList.get(0).addItem("Quimica");
        this.jComboBoxList.get(0).addItem("Electronica Digital");
        this.jComboBoxList.get(0).addItem("Circuitos");
        this.jComboBoxList.get(0).addItem("Metodos Numericos");
        this.jComboBoxList.get(0).addActionListener(this);
        this.jPanelList.get(3).add(this.jComboBoxList.get(0));
        
        //-------------- JBUTTON ---------------------------------------//
        
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        
        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this);
        
        this.jPanelList.get(7).add(this.jButtonList.get(0));
        this.jPanelList.get(7).add(this.jButtonList.get(1));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource().equals(this.jButtonList.get(0))) {
            

            this.asignautraControl.crear(this.recuperDatosIngresados());
            this.limpiarDatosIngresados();
        }

        if (e.getSource().equals(this.jButtonList.get(1))) {
            for (var asignatura : this.asignautraControl.Listar()) {
                System.out.println("Informacion de la Asignatura = " + asignatura.toString());
            }
        }
    }
    
    private void  limpiarDatosIngresados(){
      for (var i = 0; i<3 ; i++){
            this.jTextFieldList.get(i).setText("");
        } 
      
            this.jComboBoxList.get(0).setSelectedItem("");
            
                
    }
    private String[] recuperDatosIngresados(){
        
        String[] retorno = new String[5];
            retorno[0] = this.jTextFieldList.get(0).getText();
            retorno[1] = this.jComboBoxList.get(0).getSelectedItem().toString();
            
            if(this.jRadioButtonList.get(0).isSelected()){
                retorno[2] = this.jRadioButtonList.get(0).getText();
            }else if(this.jRadioButtonList.get(1).isSelected()){
                retorno[2] = this.jRadioButtonList.get(1).getText();
            }
            
            retorno[3] = this.jTextFieldList.get(1).getText();
            retorno[4] = this.jTextFieldList.get(2).getText();
            
            
            
            
    
            
            
            return retorno;
    }
}
