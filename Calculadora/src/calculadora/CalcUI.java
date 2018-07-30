package calculadora;

public class CalcUI extends javax.swing.JFrame {

    boolean flagPunto = false;
    float ans = 0;
    public CalcUI() {
        initComponents();
        this.pnlConv.setVisible(false);
        this.pnlCalcDisc.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConversionGroup = new javax.swing.ButtonGroup();
        txtOp = new javax.swing.JTextField();
        btn6 = new javax.swing.JButton();
        btnAns = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        pnlCalcDisc = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnPermutacion = new javax.swing.JButton();
        btnCombinacion = new javax.swing.JButton();
        pnlAritm = new javax.swing.JPanel();
        btnRaiz = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnResiduo = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        pnlConv = new javax.swing.JPanel();
        rbtnBinario = new javax.swing.JRadioButton();
        rbtnHexadecimal = new javax.swing.JRadioButton();
        rbtnOctal = new javax.swing.JRadioButton();
        btnConversion = new javax.swing.JButton();
        pnlEx = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnDEL = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpciones = new javax.swing.JMenu();
        itemEstandar = new javax.swing.JMenuItem();
        itemCalcDisc = new javax.swing.JMenuItem();
        itemConv = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(448, 338));
        getContentPane().setLayout(null);

        txtOp.setEditable(false);
        getContentPane().add(txtOp);
        txtOp.setBounds(13, 12, 420, 42);

        btn6.setText("6");
        btn6.setToolTipText("");
        btn6.setPreferredSize(new java.awt.Dimension(40, 50));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(148, 132, 50, 50);

        btnAns.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        btnAns.setText("Ans");
        btnAns.setPreferredSize(new java.awt.Dimension(40, 50));
        btnAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAns);
        btnAns.setBounds(148, 255, 50, 50);

        btn4.setText("4");
        btn4.setPreferredSize(new java.awt.Dimension(40, 50));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(12, 132, 50, 50);

        btn5.setText("5");
        btn5.setPreferredSize(new java.awt.Dimension(40, 50));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(80, 132, 50, 50);

        btn3.setText("3");
        btn3.setPreferredSize(new java.awt.Dimension(40, 50));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(148, 193, 50, 50);

        btn1.setText("1");
        btn1.setPreferredSize(new java.awt.Dimension(40, 50));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(12, 193, 50, 50);

        btn2.setText("2");
        btn2.setPreferredSize(new java.awt.Dimension(40, 50));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(80, 193, 50, 50);

        btn7.setText("7");
        btn7.setPreferredSize(new java.awt.Dimension(40, 50));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(12, 71, 50, 50);

        btn8.setText("8");
        btn8.setPreferredSize(new java.awt.Dimension(40, 50));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(80, 71, 50, 50);

        btnPunto.setText(".");
        btnPunto.setPreferredSize(new java.awt.Dimension(40, 50));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPunto);
        btnPunto.setBounds(80, 254, 50, 50);

        btn9.setText("9");
        btn9.setPreferredSize(new java.awt.Dimension(40, 50));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(148, 71, 50, 50);

        btn0.setText("0");
        btn0.setPreferredSize(new java.awt.Dimension(40, 50));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(12, 254, 50, 50);

        btnCalcular.setText("=");
        btnCalcular.setPreferredSize(new java.awt.Dimension(40, 50));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnFactorial.setText("!");
        btnFactorial.setPreferredSize(new java.awt.Dimension(40, 50));
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnPermutacion.setText("P");
        btnPermutacion.setPreferredSize(new java.awt.Dimension(40, 50));
        btnPermutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermutacionActionPerformed(evt);
            }
        });

        btnCombinacion.setText("C");
        btnCombinacion.setPreferredSize(new java.awt.Dimension(40, 50));
        btnCombinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombinacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCalcDiscLayout = new javax.swing.GroupLayout(pnlCalcDisc);
        pnlCalcDisc.setLayout(pnlCalcDiscLayout);
        pnlCalcDiscLayout.setHorizontalGroup(
            pnlCalcDiscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcDiscLayout.createSequentialGroup()
                .addGroup(pnlCalcDiscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPermutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCombinacion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCalcDiscLayout.setVerticalGroup(
            pnlCalcDiscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalcDiscLayout.createSequentialGroup()
                .addComponent(btnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPermutacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCombinacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlCalcDisc);
        pnlCalcDisc.setBounds(453, 71, 61, 240);

        btnRaiz.setText("Raiz");
        btnRaiz.setPreferredSize(new java.awt.Dimension(40, 50));
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnMultiplicacion.setText("*");
        btnMultiplicacion.setToolTipText("");
        btnMultiplicacion.setPreferredSize(new java.awt.Dimension(40, 50));
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnSuma.setText("+");
        btnSuma.setPreferredSize(new java.awt.Dimension(40, 50));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnPotencia.setText("Pot");
        btnPotencia.setPreferredSize(new java.awt.Dimension(40, 50));
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnResiduo.setText("Res");
        btnResiduo.setPreferredSize(new java.awt.Dimension(40, 50));
        btnResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResiduoActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.setToolTipText("");
        btnDivision.setPreferredSize(new java.awt.Dimension(40, 50));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnResta.setText("-");
        btnResta.setPreferredSize(new java.awt.Dimension(40, 50));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.setPreferredSize(new java.awt.Dimension(40, 50));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAritmLayout = new javax.swing.GroupLayout(pnlAritm);
        pnlAritm.setLayout(pnlAritmLayout);
        pnlAritmLayout.setHorizontalGroup(
            pnlAritmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAritmLayout.createSequentialGroup()
                .addGroup(pnlAritmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResiduo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAritmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRaiz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlAritmLayout.setVerticalGroup(
            pnlAritmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAritmLayout.createSequentialGroup()
                .addGroup(pnlAritmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAritmLayout.createSequentialGroup()
                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAritmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAritmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAritmLayout.createSequentialGroup()
                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );

        getContentPane().add(pnlAritm);
        pnlAritm.setBounds(216, 71, 150, 240);

        ConversionGroup.add(rbtnBinario);
        rbtnBinario.setText("Binario");

        ConversionGroup.add(rbtnHexadecimal);
        rbtnHexadecimal.setText("Hexadecimal");

        ConversionGroup.add(rbtnOctal);
        rbtnOctal.setText("Octal");

        btnConversion.setText("Convertir");
        btnConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConvLayout = new javax.swing.GroupLayout(pnlConv);
        pnlConv.setLayout(pnlConvLayout);
        pnlConvLayout.setHorizontalGroup(
            pnlConvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbtnHexadecimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(pnlConvLayout.createSequentialGroup()
                .addComponent(btnConversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlConvLayout.createSequentialGroup()
                .addGroup(pnlConvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnBinario)
                    .addComponent(rbtnOctal))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlConvLayout.setVerticalGroup(
            pnlConvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(rbtnBinario)
                .addGap(18, 18, 18)
                .addComponent(rbtnOctal)
                .addGap(18, 18, 18)
                .addComponent(rbtnHexadecimal)
                .addGap(18, 18, 18)
                .addComponent(btnConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlConv);
        pnlConv.setBounds(532, 71, 110, 233);

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSalir.setText("S");
        btnSalir.setPreferredSize(new java.awt.Dimension(40, 50));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAC.setText("AC");
        btnAC.setToolTipText("");
        btnAC.setPreferredSize(new java.awt.Dimension(40, 50));
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        btnDEL.setText("DEL");
        btnDEL.setPreferredSize(new java.awt.Dimension(40, 50));
        btnDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExLayout = new javax.swing.GroupLayout(pnlEx);
        pnlEx.setLayout(pnlExLayout);
        pnlExLayout.setHorizontalGroup(
            pnlExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlExLayout.setVerticalGroup(
            pnlExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExLayout.createSequentialGroup()
                .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlEx);
        pnlEx.setBounds(374, 71, 61, 240);

        mnOpciones.setText("Mas Opciones");

        itemEstandar.setText("Estandar");
        itemEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEstandarActionPerformed(evt);
            }
        });
        mnOpciones.add(itemEstandar);

        itemCalcDisc.setText("Calculos Discretos");
        itemCalcDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCalcDiscActionPerformed(evt);
            }
        });
        mnOpciones.add(itemCalcDisc);

        itemConv.setText("Conversion Numerica");
        itemConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConvActionPerformed(evt);
            }
        });
        mnOpciones.add(itemConv);

        jMenuBar1.add(mnOpciones);

        jMenu2.setText("Acerca de");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtOp.setText(txtOp.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtOp.setText(txtOp.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtOp.setText(txtOp.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtOp.setText(txtOp.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtOp.setText(txtOp.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtOp.setText(txtOp.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtOp.setText(txtOp.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtOp.setText(txtOp.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtOp.setText(txtOp.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtOp.setText(txtOp.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (!flagPunto && !txtOp.getText().contains("%")) {
            txtOp.setText(txtOp.getText() + ".");
            flagPunto = true;
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if (Validaciones.validarSuma(txtOp.getText())) {
        txtOp.setText(txtOp.getText() + "+");
        flagPunto = false;
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if (Validaciones.validarOperaciones(txtOp.getText())) {
        txtOp.setText(txtOp.getText() + "-");
        flagPunto = false;
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        if (Validaciones.validarMultiplicaion(txtOp.getText())) {
        txtOp.setText(txtOp.getText() + "*");
        flagPunto = false;
        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        if (Validaciones.validarOperaciones(txtOp.getText())) {
        txtOp.setText(txtOp.getText() + "/");
        flagPunto = false;
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELActionPerformed
        String operacion = txtOp.getText();
        if (!operacion.isEmpty()) {
            int index = operacion.length();
            if (operacion.lastIndexOf(".") == (index-1)) {
                flagPunto = false;
            }
            String nuevaOperacion = operacion.substring(0, index-1);
            txtOp.setText(nuevaOperacion);
        }
    }//GEN-LAST:event_btnDELActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        txtOp.setText("");
        flagPunto = false;
    }//GEN-LAST:event_btnACActionPerformed

    private void btnResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResiduoActionPerformed
        if (Validaciones.validarResiduo(txtOp.getText())) {
            txtOp.setText(txtOp.getText() + "%");
        }
    }//GEN-LAST:event_btnResiduoActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        if (Validaciones.validarOperaciones(txtOp.getText())) {
            txtOp.setText(txtOp.getText() + "R");
            flagPunto = false;
        }
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        if (Validaciones.validarOperaciones(txtOp.getText())) {
            txtOp.setText(txtOp.getText() + "^");
            flagPunto = false;
        }
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnsActionPerformed
        if (ans != 0) {
            txtOp.setText(txtOp.getText() + ans);
        }
    }//GEN-LAST:event_btnAnsActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        String operacion = txtOp.getText();
        float resultado = 0;
        
        if (operacion.contains("+")) {
            float[] sumandos = datos(operacion, "\\+");
            resultado = Funciones.suma(sumandos);
        }else if (operacion.contains("-")) {
            float[] resta = datos(operacion, "\\-");
            resultado = Funciones.resta(resta[0], resta[1]);
        }else if (operacion.contains("*")) {
            float[] factores = datos(operacion, "\\*");
            resultado = Funciones.multiplicacion(factores);
        }else if (operacion.contains("/")) {
            float[] division = datos(operacion, "\\/");
            resultado = Funciones.division(division[1], division[0]);
        }else if (operacion.contains("%")) {
            float[] residuo = datos(operacion, "%");
            resultado = Funciones.residuo(residuo[1], residuo[0]);
        }else if (operacion.contains("R")) {
            float[] raiz = datos(operacion, "R");
            resultado = Funciones.raiz(raiz[0], raiz[1]);
        }else if (operacion.contains("^")) {
            float[] potencia = datos(operacion, "\\^");
            resultado = Funciones.potencia(potencia[1], potencia[0]);
        }
        
        txtOp.setText(String.valueOf(resultado));
        if (resultado != 0) ans = resultado;
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        if (Validaciones.validarCalcDiscretos(txtOp.getText())) {
            txtOp.setText(txtOp.getText() + "!");
        }
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnPermutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermutacionActionPerformed
        if (Validaciones.validarCalcDiscretos(txtOp.getText())) {
            txtOp.setText(txtOp.getText() + "P");
        }
    }//GEN-LAST:event_btnPermutacionActionPerformed

    private void btnCombinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombinacionActionPerformed
        if (Validaciones.validarCalcDiscretos(txtOp.getText())) {
            txtOp.setText(txtOp.getText() + "C");
        }
    }//GEN-LAST:event_btnCombinacionActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String operacion = txtOp.getText();
        String resultado = "";
        
        if (operacion.contains("!")) {
            int factorial = Integer.parseInt(txtOp.getText().substring(0, operacion.indexOf("!")));
            resultado = Funciones.factorial(factorial);
        }else if (operacion.contains("P")) {
            int[] permutacion = datos2(operacion, "P");
            resultado = Funciones.permutacion(permutacion[0], permutacion[1]);
        }else if (operacion.contains("C")) {
            int[] combinacion = datos2(operacion, "C");
            resultado = Funciones.combinacion(combinacion[0], combinacion[1]);
        }
        
        txtOp.setText(resultado);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversionActionPerformed
        String operacion = txtOp.getText();
        String resultado = "";
        
        if (rbtnBinario.isSelected()) {
            resultado = Funciones.decToBin(Integer.parseInt(operacion));
        }else if (rbtnOctal.isSelected()) {
            resultado = Funciones.decToOct(Integer.parseInt(operacion));
        }else if (rbtnHexadecimal.isSelected()) {
            resultado = Funciones.decToHex(Integer.parseInt(operacion));
        }
        txtOp.setText(resultado);
    }//GEN-LAST:event_btnConversionActionPerformed

    private void itemEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEstandarActionPerformed
        this.pnlCalcDisc.setVisible(false);
        this.pnlConv.setVisible(false);
        this.pnlAritm.setVisible(true);
        this.txtOp.setSize(420, 42);
        this.pnlEx.setLocation(374, 71);
        this.setSize(455, 370);
        this.btnPunto.setEnabled(true);
        this.btnAns.setEnabled(true);
    }//GEN-LAST:event_itemEstandarActionPerformed

    private void itemCalcDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCalcDiscActionPerformed
        this.pnlAritm.setVisible(false);
        this.pnlConv.setVisible(false);
        this.txtOp.setSize(342, 42);
        this.pnlEx.setLocation(293, 71);
        this.pnlCalcDisc.setLocation(216, 71);
        this.pnlCalcDisc.setVisible(true);
        this.setSize(372, 370);
        this.btnPunto.setEnabled(false);
        this.btnAns.setEnabled(false);
    }//GEN-LAST:event_itemCalcDiscActionPerformed

    private void itemConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConvActionPerformed
        this.pnlAritm.setVisible(false);
        this.pnlCalcDisc.setVisible(false);
        this.txtOp.setSize(389, 42);
        this.pnlEx.setLocation(340, 71);
        this.pnlConv.setLocation(216, 71);
        this.pnlConv.setVisible(true);
        this.setSize(419, 370);
        this.btnPunto.setEnabled(false);
        this.btnAns.setEnabled(false);
    }//GEN-LAST:event_itemConvActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ConversionGroup;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnAns;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCombinacion;
    private javax.swing.JButton btnConversion;
    private javax.swing.JButton btnDEL;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPermutacion;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnResiduo;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSuma;
    private javax.swing.JMenuItem itemCalcDisc;
    private javax.swing.JMenuItem itemConv;
    private javax.swing.JMenuItem itemEstandar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnOpciones;
    private javax.swing.JPanel pnlAritm;
    private javax.swing.JPanel pnlCalcDisc;
    private javax.swing.JPanel pnlConv;
    private javax.swing.JPanel pnlEx;
    private javax.swing.JRadioButton rbtnBinario;
    private javax.swing.JRadioButton rbtnHexadecimal;
    private javax.swing.JRadioButton rbtnOctal;
    private javax.swing.JTextField txtOp;
    // End of variables declaration//GEN-END:variables

    private float[] datos(String operacion, String splitter){
        String[] split = operacion.split(splitter);
            float[] numeros = new float[split.length];
            for (int i = 0; i < split.length; i++) {
                numeros[i] = Float.parseFloat(split[i]);
            }
            return numeros;
    }
    
    private int[] datos2(String operacion, String splitter){
        String[] split = operacion.split(splitter);
            int[] numeros = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                numeros[i] = Integer.parseInt(split[i]);
            }
            return numeros;
    }
}
