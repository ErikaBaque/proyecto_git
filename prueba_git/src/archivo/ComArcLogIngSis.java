/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import javax.swing.JTextArea;

/**
 *
 * @author prof_tes_a
 */
public class ComArcLogIngSis extends javax.swing.JInternalFrame
{

    /**
     * Creates new form ComArcLogIngSis
     */
    public ComArcLogIngSis()
    {
        initComponents();
        abrirArcTex("ComTESLog.txt", txaPag);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaPag = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Log de ingreso al Sistema");

        txaPag.setEditable(false);
        txaPag.setColumns(20);
        txaPag.setRows(5);
        jScrollPane1.setViewportView(txaPag);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 400, 300);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaPag;
    // End of variables declaration//GEN-END:variables

    private boolean abrirArcTex(String strNomArc, JTextArea txaTex)
    {
        boolean blnRes=true;
        try
        {
            String strCon=""; //Contenido del archivo.
            java.io.FileReader objFilRea=new java.io.FileReader(strNomArc);
            java.io.BufferedReader objBufRea=new java.io.BufferedReader(objFilRea);
            String strLin;
            while((strLin=objBufRea.readLine())!=null)
                strCon+=strLin + "\n";
            objBufRea.close();
            txaTex.setText(strCon);
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        catch(java.io.IOException e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }

}
