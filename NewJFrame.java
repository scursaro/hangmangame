/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hangman;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

/**
 *
 * @author sebas
 */
public class NewJFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form NewJFrame
     */
    int guesses = 6;
    public NewJFrame() {
        
        initComponents();
        
        //showDate();
        clock(); //creates date and time in jpanel
        paint(base);//paints the gallows
        
        
        
        displayWord(t);//displays randomly generated word
        while(guesses!=6){
        paintBody(body);
        }
        
        
        
    }
    String t;
    int length;
    char characters[];
    
    int points =100;
    public void displayWord(String t){
        String[] wordList = new String[]{"abstract", "cemetary", "nurse", "pharmacy", "climbing"}; 
        Random randomNumbers = new Random ();
        int wordNumber = randomNumbers.nextInt (5);
     
        //System.out.println(wordList[wordNumber]);
        String l = wordList[wordNumber];
        length = l.length();
        word.setText(wordList[wordNumber]);//to be commented out later
        characters = new char[length];
        for(int i =0; i<characters.length;i++){
            characters[i] = l.charAt(i);
            System.out.println(characters[i]);
        }
    }
    
    public void charactersOf(String t){
        
        
    }
    Graphics base,body;

    /**
     *
     * @param base
     */
    @Override
   public final void paint(Graphics base){
       
       base = game.getGraphics();
       game.paintComponents(base);//set graphic Object
       base.setColor(Color.BLACK);
       base.fillRect(100,200,300,05);
       
       base.fillRect(150, 50, 05, 150);
       base.fillRect(150, 50, 100, 05);
       base.fillRect(250, 50, 05, 25);
       
       if(length == 5){
           System.out.println("5");
           
           base.fillRect(75,275,50,05);
           base.fillRect(150,275,50,05);
           base.fillRect(225,275,50,05);
           base.fillRect(300,275,50,05);
           base.fillRect(375,275,50,05);
           
       }
       else{
           System.out.println("8");
           base.fillRect(50,275,25,05);
           base.fillRect(100,275,25,05);
           base.fillRect(150,275,25,05);
           base.fillRect(200,275,25,05);
           base.fillRect(250,275,25,05);
           base.fillRect(300,275,25,05);
           base.fillRect(350,275,25,05);
           base.fillRect(400,275,25,05);
           base.fillRect(450,275,25,05);
       }
       
           
       
       
       /*post = game.getGraphics();
       game.paintComponents(post);//set graphic Object
       post.setColor(Color.BLACK);
       post.fillRect(100,225,05,100);*/
        
       
        }
   public void paintBody(Graphics body){
       body = game.getGraphics();
       game.paintComponents(body);//set graphic Object
       body.setColor(Color.BLACK);
       
       if(guesses ==5){
           body.drawOval(230,75,50,50);
           }
           if(guesses ==4){
           body.fillRect(250, 125, 05,40);
           }
           if(guesses ==3){
           body.fillRect(225, 125, 30, 05);
           }
           if(guesses ==2){
       body.fillRect(250, 125, 30, 05);
           }
           if(guesses ==1){
       body.fillRect(225, 165, 30, 05);
           }
           if(guesses ==0){
       body.fillRect(250, 165, 30, 05);
           }
   
       
   }
   
   
   
    
    
    
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
        void clock(){
        
        Thread watch = new Thread()
        {
            public void run()
                {
                try {
                    for(;;){
                    Calendar cal = new GregorianCalendar();
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
        
                    int second=cal.get(Calendar.SECOND);
                    int minute =cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    clock.setText("Date: " + month + "/" + day + "/"+year+" Time "+hour+":"+minute+";"+second+" ");
                    
                    sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            
            
        };
        watch.start();
            
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        game = new javax.swing.JPanel();
        aButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        vButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        word = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frame");

        game.setBackground(new java.awt.Color(204, 204, 204));

        aButton.setText("A");
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });

        bButton.setText("B");
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });

        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        dButton.setText("D");
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });

        eButton.setText("E");
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });

        fButton.setText("F");
        fButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonActionPerformed(evt);
            }
        });

        gButton.setText("G");
        gButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButtonActionPerformed(evt);
            }
        });

        hButton.setText("H");
        hButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hButtonActionPerformed(evt);
            }
        });

        iButton.setText("I");
        iButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iButtonActionPerformed(evt);
            }
        });

        jButton.setText("J");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        kButton.setText("K");
        kButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonActionPerformed(evt);
            }
        });

        lButton.setText("L");
        lButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButtonActionPerformed(evt);
            }
        });

        mButton.setText("M");
        mButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonActionPerformed(evt);
            }
        });

        nButton.setText("N");
        nButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nButtonActionPerformed(evt);
            }
        });

        oButton.setText("O");
        oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });

        pButton.setText("P");
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });

        qButton.setText("Q");
        qButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qButtonActionPerformed(evt);
            }
        });

        rButton.setText("R");
        rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonActionPerformed(evt);
            }
        });

        sButton.setText("S");
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });

        tButton.setText("T");
        tButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtonActionPerformed(evt);
            }
        });

        uButton.setText("U");
        uButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uButtonActionPerformed(evt);
            }
        });

        vButton.setText("V");
        vButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vButtonActionPerformed(evt);
            }
        });

        wButton.setText("W");
        wButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wButtonActionPerformed(evt);
            }
        });

        xButton.setText("X");
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });

        yButton.setText("Y");
        yButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yButtonActionPerformed(evt);
            }
        });

        zButton.setText("Z");
        zButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Hangman");

        clock.setText("Time");

        word.setText("jLabel2");

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(qButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(rButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(sButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(tButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(uButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(vButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createSequentialGroup()
                                .addComponent(wButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createSequentialGroup()
                                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(word)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(yButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(zButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(gameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gameLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(gameLayout.createSequentialGroup()
                                .addComponent(aButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gameLayout.createSequentialGroup()
                                .addComponent(nButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(cButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clock)
                .addGap(113, 113, 113))
        );
        gameLayout.setVerticalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(word)
                .addGap(32, 32, 32)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aButton)
                    .addComponent(bButton)
                    .addComponent(cButton)
                    .addComponent(dButton)
                    .addComponent(eButton)
                    .addComponent(fButton)
                    .addComponent(gButton)
                    .addComponent(hButton)
                    .addComponent(iButton)
                    .addComponent(jButton)
                    .addComponent(kButton)
                    .addComponent(lButton)
                    .addComponent(mButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nButton)
                    .addComponent(oButton)
                    .addComponent(pButton)
                    .addComponent(qButton)
                    .addComponent(rButton)
                    .addComponent(sButton)
                    .addComponent(tButton)
                    .addComponent(uButton)
                    .addComponent(vButton)
                    .addComponent(wButton)
                    .addComponent(xButton)
                    .addComponent(yButton)
                    .addComponent(zButton))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(game, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'g') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_gButtonActionPerformed

    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'd') {

        contains = true;
        dButton.setEnabled(false);
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_dButtonActionPerformed

    private void nButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'n') {

        contains = true;
        dButton.setEnabled(false);
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_nButtonActionPerformed

    private void kButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'k') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_kButtonActionPerformed

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aButtonActionPerformed
        // TODO add your handling code here:
    boolean contains = false;

for (char c : characters) {

    if (c == 'a') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_aButtonActionPerformed

    private void vButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'v') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_vButtonActionPerformed

    private void uButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'u') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_uButtonActionPerformed

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'b') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_bButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'c') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_cButtonActionPerformed

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'e') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_eButtonActionPerformed

    private void fButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'f') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_fButtonActionPerformed

    private void hButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'h') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_hButtonActionPerformed

    private void iButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'i') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_iButtonActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'j') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_jButtonActionPerformed

    private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'l') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_lButtonActionPerformed

    private void mButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'm') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_mButtonActionPerformed

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'o') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_oButtonActionPerformed

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'p') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_pButtonActionPerformed

    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'q') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_qButtonActionPerformed

    private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'r') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_rButtonActionPerformed

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 's') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_sButtonActionPerformed

    private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 't') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_tButtonActionPerformed

    private void wButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'w') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_wButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'x') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    // do something
    paintBody(body);
}
    }//GEN-LAST:event_xButtonActionPerformed

    private void yButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'y') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_yButtonActionPerformed

    private void zButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'z') {

        contains = true;
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
    
    paintBody(body);
    // do something
}
    }//GEN-LAST:event_zButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aButton;
    private javax.swing.JButton bButton;
    private javax.swing.JButton cButton;
    private javax.swing.JLabel clock;
    private javax.swing.JButton dButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton fButton;
    private javax.swing.JButton gButton;
    private javax.swing.JPanel game;
    private javax.swing.JButton hButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kButton;
    private javax.swing.JButton lButton;
    private javax.swing.JButton mButton;
    private javax.swing.JButton nButton;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pButton;
    private javax.swing.JButton qButton;
    private javax.swing.JButton rButton;
    private javax.swing.JButton sButton;
    private javax.swing.JButton tButton;
    private javax.swing.JButton uButton;
    private javax.swing.JButton vButton;
    private javax.swing.JButton wButton;
    private javax.swing.JLabel word;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
    // End of variables declaration//GEN-END:variables
}
