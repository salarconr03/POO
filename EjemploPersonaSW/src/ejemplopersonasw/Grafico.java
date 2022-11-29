/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopersonasw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class Grafico extends JFrame implements ActionListener {
    private JButton btnNuevo;
    private JButton btnBorrar;
    private JButton btnCambios;
    private JButton btnBuscar;
    private JButton btnBusqueda;
    private JButton btnSalir;
    private JLabel jblNombre;
    private JLabel jblNumCta;
    private JLabel jblSaldoInicial;
    private JTextField txtNombre;
    private JTextField txtNumCta;
    private JTextField txtSaldoInicial;
    private ListPersona olDatos;
    
    public Grafico(){
        olDatos = new ListPersona();
        configurarVentana();
        iniciarComponentes();
    }
    
    private void configurarVentana(){
        this.setLayout(null);
        this.setBounds(100, 100, 700, 600);
        this.setTitle("Registro de cuenta");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    private void iniciarComponentes(){
        btnNuevo = new JButton("Alta");
        btnNuevo.setBounds(480, 100, 130, 45);
        this.add(btnNuevo);
        btnNuevo.addActionListener(this);
        
        btnBorrar = new JButton("Bajas");
        btnBorrar.setBounds(480, 160, 130, 45);
        this.add(btnBorrar);
        btnBorrar.addActionListener(this);
        
        btnBuscar = new JButton("Consultas");
        btnBuscar.setBounds(480, 220, 130, 45);
        this.add(btnBuscar);
        btnBuscar.addActionListener(this);
        
        btnCambios = new JButton("Cambios");
        btnCambios.setBounds(480, 280, 130, 45);
        this.add(btnCambios);
        btnCambios.addActionListener(this);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(480, 340, 130, 45);
        this.add(btnSalir);
        btnSalir.addActionListener(this);
        
        btnBusqueda = new JButton("Buscar");
        btnBusqueda.setBounds(160, 300, 130, 30);
        this.add(btnBusqueda);
        btnBusqueda.addActionListener(this);
        //btnBusqueda.setVisible(false);
        
        jblNombre = new JLabel("Nombre:");
        jblNombre.setBounds(40, 100, 200, 30);
        this.add(jblNombre);
        //jblNombre.setVisible(false);
        
        jblNumCta = new JLabel("Numero de cuenta:");
        jblNumCta.setBounds(40, 150, 200, 30);
        this.add(jblNumCta);
        //jblNumCta.setVisible(false);
        
        jblSaldoInicial = new JLabel("Saldo inicial:");
        jblSaldoInicial.setBounds(40, 200, 200, 30);
        this.add(jblSaldoInicial);
        //jblSaldoInicial.setVisible(false);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(120, 100, 130, 30);
        this.add(txtNombre);
        //txtNombre.setVisible(false);
        
        txtNumCta = new JTextField();
        txtNumCta.setBounds(160, 150, 120, 30);
        this.add(txtNumCta);
        //txtNumCta.setVisible(false);
        
        txtSaldoInicial = new JTextField();
        txtSaldoInicial.setBounds(140, 200, 120, 30);
        this.add(txtSaldoInicial);
        //txtSaldoInicial.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //JOptionPane.showMessageDialog(this,"Hello World" + e.getActionCommand());
        String bntTipo = e.getActionCommand();
        if(bntTipo.equals("Alta")){
            btnNuevo.setText("Agregar");
            jblNombre.setVisible(true);
            jblNumCta.setVisible(true);
            jblSaldoInicial.setVisible(true);
            txtNombre.setVisible(true);
            txtNumCta.setVisible(true);
            txtSaldoInicial.setVisible(true);
            btnBuscar.setVisible(false);
            btnBorrar.setVisible(false);
            btnCambios.setVisible(false);
        }else if(bntTipo.equals("Agregar")){
            Persona objPersona = new Persona();
            objPersona.setNombre(txtNombre.getText());
            objPersona.setNumCta(Integer.parseInt(txtNumCta.getText()));
            objPersona.setSaldoInicial(Double.parseDouble(txtSaldoInicial.getText()));
            try{
                FileOutputStream fos = new FileOutputStream("persona.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(objPersona);
                oos.close();
                fos.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
