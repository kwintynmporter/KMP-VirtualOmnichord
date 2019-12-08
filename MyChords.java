import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout; 
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import java.io.*; 
import javax.sound.sampled.*; 
import javax.swing.JOptionPane;

import java.util.Scanner; 

import java.awt.AWTException; 
import java.awt.Rectangle; 
import java.awt.Toolkit; 
import java.awt.Robot; 
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import java.io.File; 
import javax.imageio.ImageIO; 

public class MyChords extends JFrame implements ActionListener {
    // C Major: Confirmed Working
    JButton dmbtn, g13btn, gsusbtn, cmajbtn;  

    //F Major CW
    JButton gmbtn, c13btn, csusbtn, fmajbtn;
    
    //Bb Major CW
    JButton cmbtn, f13btn, fsusbtn, bbmajbtn;

    //Eb Major CW 
    JButton fmbtn, bb13btn, bbsusbtn, ebmajbtn; 

    //Ab Major CW 
    JButton bbmbtn, eb13btn, ebsusbtn, abmajbtn; 

    //Db Major CW
    JButton ebmbtn, ab13btn, absusbtn, dbmajbtn; 

    //Gb Major CW
    JButton abmbtn, db13btn, dbsusbtn, gbmajbtn; 

    //B Major CW
    JButton dbmbtn, gb13btn, gbsusbtn, bmajbtn; 

    //E Major 
    JButton gbmbtn, b13btn, bsusbtn, emajbtn; 

    //A Major
    JButton bmbtn, e13btn, esusbtn, amajbtn; 

    //D Major
    JButton embtn, a13btn, asusbtn, dmajbtn;

    //G Major 
    JButton ambtn, d13btn, dsusbtn, gmajbtn;  

    AudioClip click; 
   


    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "KMP-OOP-2019-Final: " + titleBar, JOptionPane.INFORMATION_MESSAGE);

    }


    public MyChords(){
        setSize(800,800);
        setTitle("Omnichord v2.0"); 
        setLayout(new GridLayout(12,4)); // (12,4)

        // C Major: Confirmed Working
        dmbtn = new JButton("D Min 9");
        g13btn = new JButton("G Dom 13"); 
        gsusbtn = new JButton("G Sus 13"); 
        cmajbtn = new JButton("C Maj 9");  

        gmbtn = new JButton("G Min 9");
        c13btn = new JButton("C Dom 13"); 
        csusbtn = new JButton("C Sus 13"); 
        fmajbtn = new JButton("F Maj 9");
        
        cmbtn = new JButton("C Min 9");
        f13btn = new JButton("F Dom 13"); 
        fsusbtn = new JButton("F Sus 13"); 
        bbmajbtn = new JButton("Bb Maj 9");

        fmbtn = new JButton("F Min 9");
        bb13btn = new JButton("Bb Dom 13"); 
        bbsusbtn = new JButton("Bb Sus 13"); 
        ebmajbtn = new JButton("Eb Maj 9");

        bbmbtn = new JButton("Bb Min 9");
        eb13btn = new JButton("Eb Dom 13"); 
        ebsusbtn = new JButton("Eb Sus 13"); 
        abmajbtn = new JButton("Ab Maj 9");

        ebmbtn = new JButton("Eb Min 9");
        ab13btn = new JButton("Ab Dom 13"); 
        absusbtn = new JButton("Ab Sus 13"); 
        dbmajbtn = new JButton("Db Maj 9");

        abmbtn = new JButton("Ab Min 9");
        db13btn = new JButton("Db Dom 13"); 
        dbsusbtn = new JButton("Db Sus 13"); 
        gbmajbtn = new JButton("Gb Maj 9");

        dbmbtn = new JButton("Db Min 9");
        gb13btn = new JButton("Gb Dom 13"); 
        gbsusbtn = new JButton("Gb Sus 13"); 
        bmajbtn = new JButton("B Maj 9");

        gbmbtn = new JButton("Gb Min 9");
        b13btn = new JButton("B Dom 13"); 
        bsusbtn = new JButton("B Sus 13"); 
        emajbtn = new JButton("E Maj 9");

        bmbtn = new JButton("B Min 9");
        e13btn = new JButton("E Dom 13"); 
        esusbtn = new JButton("E Sus 13"); 
        amajbtn = new JButton("A Maj 9");

        embtn = new JButton("E Min 9");
        a13btn = new JButton("A Dom 13"); 
        asusbtn = new JButton("A Sus 13"); 
        dmajbtn = new JButton("D Maj 9");

        ambtn = new JButton("A Min 9");
        d13btn = new JButton("D Dom 13"); 
        dsusbtn = new JButton("D Sus 13"); 
        gmajbtn = new JButton("G Maj 9");


        // C Major: Confirmed Working
        getContentPane().add(dmbtn); 
        getContentPane().add(g13btn); 
        getContentPane().add(gsusbtn); 
        getContentPane().add(cmajbtn);

        getContentPane().add(gmbtn); 
        getContentPane().add(c13btn); 
        getContentPane().add(csusbtn); 
        getContentPane().add(fmajbtn);
        
        getContentPane().add(cmbtn); 
        getContentPane().add(f13btn); 
        getContentPane().add(fsusbtn); 
        getContentPane().add(bbmajbtn);

        getContentPane().add(fmbtn); 
        getContentPane().add(bb13btn); 
        getContentPane().add(bbsusbtn); 
        getContentPane().add(ebmajbtn);

        getContentPane().add(bbmbtn); 
        getContentPane().add(eb13btn); 
        getContentPane().add(ebsusbtn); 
        getContentPane().add(abmajbtn);

        getContentPane().add(ebmbtn); 
        getContentPane().add(ab13btn); 
        getContentPane().add(absusbtn); 
        getContentPane().add(dbmajbtn);

        getContentPane().add(abmbtn); 
        getContentPane().add(db13btn); 
        getContentPane().add(dbsusbtn); 
        getContentPane().add(gbmajbtn);

        getContentPane().add(dbmbtn); 
        getContentPane().add(gb13btn); 
        getContentPane().add(gbsusbtn); 
        getContentPane().add(bmajbtn);

        getContentPane().add(gbmbtn); 
        getContentPane().add(b13btn); 
        getContentPane().add(bsusbtn); 
        getContentPane().add(emajbtn);

        getContentPane().add(bmbtn); 
        getContentPane().add(e13btn); 
        getContentPane().add(esusbtn); 
        getContentPane().add(amajbtn);

        getContentPane().add(embtn); 
        getContentPane().add(a13btn); 
        getContentPane().add(asusbtn); 
        getContentPane().add(dmajbtn);

        getContentPane().add(ambtn); 
        getContentPane().add(d13btn); 
        getContentPane().add(dsusbtn); 
        getContentPane().add(gmajbtn);

        //getContentPane().add(drumlp1); 

        // C Major: Confirmed Working
        dmbtn.addActionListener(MyChords.this); 
        g13btn.addActionListener(MyChords.this);
        gsusbtn.addActionListener(MyChords.this);
        cmajbtn.addActionListener(MyChords.this);
        
        gmbtn.addActionListener(MyChords.this); 
        c13btn.addActionListener(MyChords.this);
        csusbtn.addActionListener(MyChords.this);
        fmajbtn.addActionListener(MyChords.this);

        cmbtn.addActionListener(MyChords.this); 
        f13btn.addActionListener(MyChords.this);
        fsusbtn.addActionListener(MyChords.this);
        bbmajbtn.addActionListener(MyChords.this);

        fmbtn.addActionListener(MyChords.this); 
        bb13btn.addActionListener(MyChords.this);
        bbsusbtn.addActionListener(MyChords.this);
        ebmajbtn.addActionListener(MyChords.this);

        bbmbtn.addActionListener(MyChords.this); 
        eb13btn.addActionListener(MyChords.this);
        ebsusbtn.addActionListener(MyChords.this);
        abmajbtn.addActionListener(MyChords.this);

        ebmbtn.addActionListener(MyChords.this); 
        ab13btn.addActionListener(MyChords.this);
        absusbtn.addActionListener(MyChords.this);
        dbmajbtn.addActionListener(MyChords.this); 

        abmbtn.addActionListener(MyChords.this); 
        db13btn.addActionListener(MyChords.this);
        dbsusbtn.addActionListener(MyChords.this);
        gbmajbtn.addActionListener(MyChords.this);

        dbmbtn.addActionListener(MyChords.this); 
        gb13btn.addActionListener(MyChords.this);
        gbsusbtn.addActionListener(MyChords.this);
        bmajbtn.addActionListener(MyChords.this);

        gbmbtn.addActionListener(MyChords.this); 
        b13btn.addActionListener(MyChords.this);
        bsusbtn.addActionListener(MyChords.this);
        emajbtn.addActionListener(MyChords.this);

        bmbtn.addActionListener(MyChords.this); 
        e13btn.addActionListener(MyChords.this);
        esusbtn.addActionListener(MyChords.this);
        amajbtn.addActionListener(MyChords.this);

        embtn.addActionListener(MyChords.this); 
        a13btn.addActionListener(MyChords.this);
        asusbtn.addActionListener(MyChords.this);
        dmajbtn.addActionListener(MyChords.this);

        ambtn.addActionListener(MyChords.this); 
        d13btn.addActionListener(MyChords.this);
        dsusbtn.addActionListener(MyChords.this);
        gmajbtn.addActionListener(MyChords.this);

        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    // C Major: Confirmed Working
    public void playDMinor9() {
        try {
            File soundFile = new File("DMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playGDom13() {
        try {
            URL url = this.getClass().getClassLoader().getResource("GDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playGSus13() {
        try {
            URL url = this.getClass().getClassLoader().getResource("GSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playCMaj9() {
        try {
            URL url = this.getClass().getClassLoader().getResource("CMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playGMinor9() {
        try {
            File soundFile = new File("GMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playCDom13() {
        try {
            File soundFile = new File("CDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playCSus13() {
        try {
            File soundFile = new File("CSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playFMaj9() {
        try {
            File soundFile = new File("FMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playCMinor9() {
        try {
            File soundFile = new File("CMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playFDom13() {
        try {
            File soundFile = new File("FDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playFSus13() {
        try {
            File soundFile = new File("FSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playBbMaj9() {
        try {
            File soundFile = new File("BbMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playFMinor9() {
        try {
            File soundFile = new File("FMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playBbDom13() {
        try {
            File soundFile = new File("BbDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playBbSus13() {
        try {
            File soundFile = new File("BbSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playEbMaj9() {
        try {
            File soundFile = new File("EbMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playBbMinor9() {
        try {
            File soundFile = new File("BbMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playEbDom13() {
        try {
            File soundFile = new File("EbDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playEbSus13() {
        try {
            File soundFile = new File("EbSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playAbMaj9() {
        try {
            File soundFile = new File("AbMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playEbMinor9() {
        try { 
            File soundFile = new File("EbMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playAbDom13() {
        try {
            File soundFile = new File("AbDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playAbSus13() {
        try { 
            File soundFile = new File("AbSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playDbMaj9() {
        try {
            File soundFile = new File("DbMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playAbMinor9() {
        try {
            File soundFile = new File("AbMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playDbDom13() {
        try {
            File soundFile = new File("DbDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playDbSus13() {
        try {
            File soundFile = new File("DbSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playGbMaj9() {
        try {
            File soundFile = new File("GbMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playDbMinor9() {
        try {
            File soundFile = new File("DbMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playGbDom13() {
        try {
            File soundFile = new File("GbDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playGbSus13() {
        try {
            File soundFile = new File("GbSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playBMaj9() {
        try {
            File soundFile = new File("BMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playGbMinor9() {
        try {
            File soundFile = new File("GbMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playBDom13() {
        try {
            File soundFile = new File("BDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playBSus13() {
        try {
            File soundFile = new File("BSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playEMaj9() {
        try {
            File soundFile = new File("EMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playBMinor9() {
        try {
            File soundFile = new File("BMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playEDom13() {
        try {
            File soundFile = new File("EDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playESus13() {
        try {
            File soundFile = new File("ESus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playAMaj9() {
        try {
            File soundFile = new File("AMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playEMinor9() {
        try {
            File soundFile = new File("EMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playADom13() {
        try {
            File soundFile = new File("ADom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playASus13() {
        try { 
            File soundFile = new File("ASus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playDMaj9() {
        try {
            File soundFile = new File("DMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playAMinor9() {
        try {
            File soundFile = new File("AMin9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    public void playDDom13() {
        try {
            File soundFile = new File("DDom13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playDSus13() {
        try {
            File soundFile = new File("DSus13.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void playGMaj9() {
        try {
            File soundFile = new File("GMaj9.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip(); 
            clip.open(audioIn); 
            clip.start(); 
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == dmbtn) {
            playDMinor9(); 
            System.out.println("Chord played: D Minor 9 \n"); 
        }
        if (e.getSource() == g13btn) {
            playGDom13();
            System.out.println("Chord played:  G Dom 13 \n"); 
        }
        if (e.getSource() == gsusbtn) {
            playGSus13(); 
            System.out.println("Chord played:  G Sus 13 \n");
        }
        if (e.getSource() == cmajbtn) {
            playCMaj9();
            System.out.println("Chord played:  C Major 9 \n"); 
        }
        if (e.getSource() == gmbtn) {
            playGMinor9();
            System.out.println("Chord played: G Minor 9 \n"); 
        }
        if (e.getSource() == c13btn) {
            playCDom13();
            System.out.println("Chord played:  C Dom 13 \n"); 
        }
        if (e.getSource() == csusbtn) {
            playCSus13(); 
            System.out.println("Chord played:  C Sus 13 \n");
        }
        if (e.getSource() == fmajbtn) {
            playFMaj9();
            System.out.println("Chord played:  F Major 9 \n"); 
        }
        if (e.getSource() == cmbtn) {
            playCMinor9();
            System.out.println("Chord played: C Minor 9 \n"); 
        }
        if (e.getSource() == f13btn) {
            playFDom13(); 
            System.out.println("Chord played:  F Dom 13 \n");
        }
        if (e.getSource() == fsusbtn) {
            playFSus13();
            System.out.println("Chord played: F Sus 13 \n"); 
        }
        if (e.getSource() == bbmajbtn) {
            playBbMaj9();
            System.out.println("Chord played:  Bb Major 9 \n"); 
        }
        if (e.getSource() == fmbtn) {
            playFMinor9(); 
            System.out.println("Chord played: F Minor 9 \n");
        }
        if (e.getSource() == bb13btn) {
            playBbDom13(); 
            System.out.println("Chord played:  Bb Dom 13 \n");
        }
        if (e.getSource() == bbsusbtn) {
            playBbSus13();
            System.out.println("Chord played:  Bb Sus 13 \n");
        }
        if (e.getSource() == ebmajbtn) {
            playEbMaj9();
            System.out.println("Chord played:  Eb Major 9 \n"); 
        }
        if (e.getSource() == bbmbtn) {
            playBbMinor9();
            System.out.println("Chord played: Bb Minor 9 \n"); 
        }
        if (e.getSource() == eb13btn) {
            playEbDom13(); 
            System.out.println("Chord played:  Eb Dom 13 \n");
        }
        if (e.getSource() == ebsusbtn) {
            playEbSus13(); 
            System.out.println("Chord played:  Eb Sus 13 \n");
        }
        if (e.getSource() == abmajbtn) {
            playAbMaj9();
            System.out.println("Chord played:  Ab Major 9 \n"); 
        }
        if (e.getSource() == ebmbtn) {
            playEbMinor9();
            System.out.println("Chord played: Eb Minor 9 \n"); 
        }
        if (e.getSource() == ab13btn) {
            playAbDom13();
            System.out.println("Chord played:  Ab Dom 13 \n"); 
        }
        if (e.getSource() == absusbtn) {
            playAbSus13(); 
            System.out.println("Chord played:  Ab Sus 13 \n");
        }
        if (e.getSource() == dbmajbtn) {
            playDbMaj9();
            System.out.println("Chord played:  Db Major 9 \n"); 
        }
        if (e.getSource() == abmbtn) {
            playAbMinor9();
            System.out.println("Chord played: Ab Minor 9 \n"); 
        }
        if (e.getSource() == db13btn) {
            playDbDom13(); 
            System.out.println("Chord played:  Db Dom 13 \n");
        }
        if (e.getSource() == dbsusbtn) {
            playDbSus13(); 
            System.out.println("Chord played:  Db Sus 13 \n");
        }
        if (e.getSource() == gbmajbtn) {
            playGbMaj9();
            System.out.println("Chord played:  Gb Major 9 \n"); 
        }
        if (e.getSource() == dbmbtn) {
            playDbMinor9();
            System.out.println("Chord played: Db Minor 9 \n"); 
        }
        if (e.getSource() == gb13btn) {
            playGbDom13();
            System.out.println("Chord played:  E Dom 13 \n"); 
        }
        if (e.getSource() == gbsusbtn) {
            playGbSus13();
            System.out.println("Chord played:  E Sus 13 \n"); 
        }
        if (e.getSource() == bmajbtn) {
            playBMaj9(); 
            System.out.println("Chord played:  B Major 9 \n");
        }
        if (e.getSource() == gbmbtn) {
            playGbMinor9();
            System.out.println("Chord played: Gb Minor 9 \n"); 
        }
        if (e.getSource() == b13btn) {
            playBDom13();
            System.out.println("Chord played:  B Dom 13 \n"); 
        }
        if (e.getSource() == bsusbtn) {
            playBSus13(); 
            System.out.println("Chord played:  B Sus 13 \n");
        }
        if (e.getSource() == emajbtn) {
            playEMaj9();
            System.out.println("Chord played:  E Major 9 \n"); 
        }
        if (e.getSource() == bmbtn) {
            playBMinor9();
            System.out.println("Chord played: B Minor 9 \n"); 
        }
        if (e.getSource() == e13btn) {
            playEDom13(); 
            System.out.println("Chord played:  E Dom 13 \n");
        }
        if (e.getSource() == esusbtn) {
            playESus13();
            System.out.println("Chord played:  E Sus 13 \n"); 
        }
        if (e.getSource() == amajbtn) {
            playAMaj9();
            System.out.println("Chord played:  A Major 9 \n"); 
        }
        if (e.getSource() == embtn) {
            playEMinor9();
            System.out.println("Chord played: E Minor 9 \n"); 
        }
        if (e.getSource() == a13btn) {
            playADom13();
            System.out.println("Chord played:  A Dom 13 \n"); 
        }
        if (e.getSource() == asusbtn) {
            playASus13(); 
            System.out.println("Chord played:  A Sus 13 \n");
        }
        if (e.getSource() == dmajbtn) {
            playDMaj9();
            System.out.println("Chord played:  D Major 9 \n"); 
        }
        if (e.getSource() == ambtn) {
            playAMinor9();
            System.out.println("Chord played: A Minor 9 \n"); 
        }
        if (e.getSource() == d13btn) {
            playDDom13();
            System.out.println("Chord played:  D Dom 13 \n"); 
        }
        if (e.getSource() == dsusbtn) {
            playDSus13(); 
            System.out.println("Chord played:  D Sus 13 \n ");
        }
        if (e.getSource() == gmajbtn) {
            playGMaj9(); 
            System.out.println("Chord played:  G Major 9 \n");
        }
    }

    public static void main(String[] args) {
        System.out.println("KMP Virtual *Local* Omnichord starting..."); 
        System.out.println("  _      _      _" + " " + "     _      _      _" + "\n" +
        ">(.)__ <(.)__ =(.)__" + " " + ">(.)__ <(.)__ =(.)__" + "\n" + 
        " (___/  (___/  (___/" + " " + " (___/  (___/  (___/" + "\n" +
        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" +
        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" +
        "this is the more local version, no internet connection required. Have fun!" + "\n");
        MyChords tst = new MyChords(); 
        MyChords.infoBox("For instructions on how to use certain chords, check the 'README.md' file. \n Click 'OK' to continue. ", "VIRTUAL OMNICHORD v2.0");
        tst.setVisible(true); 

        JMenuBar mb = new JMenuBar(); 
        JMenu file = new JMenu("File"); 
        mb.add(file); 

        JMenuItem reorg = new JMenuItem("ReOrg"); 
        file.add(reorg); 

        JMenuItem clear = new JMenuItem("Clear"); 
        file.add(clear); 

        JMenuItem screen = new JMenuItem("Screenshot"); 
        file.add(screen); 

        tst.setJMenuBar(mb); 

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                tst.getContentPane().removeAll(); 
                tst.repaint(); 
            }
        });

        reorg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            // run copy
            }

        }); 

        screen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try { 
                    Scanner sc = new Scanner(System.in); 
                    String filename, pathname;
                    String answer;  
                    System.out.println("Do you have your own path? Enter y, n, yes, or no \n" + 
                    "If you answered no, you will be defaulted to C:/chordCaps/. \n"); 
                    answer = sc.nextLine();  

                    if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                        System.out.println("\n No pathname declared. Screenshots will be defaulted to 'C:/chordCaps'\n"); 
                        System.out.println("Enter the desired file name. No extension required.\n");
                        filename = sc.nextLine(); 
                        Thread.sleep(120); 
                        Robot r = new Robot(); 

                        String path = "C:/chordCaps/" + filename + ".jpg"; 

                        Rectangle capture =  
                        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
                        BufferedImage Image = r.createScreenCapture(capture); 
                        ImageIO.write(Image, "jpg", new File(path)); 
                        System.out.println("---------------------------------------");
                        System.out.println("Screenshot saved successfully as " + filename + ".jpg \n"); 
                    }
                    else {
                        System.out.println("Enter desired pathname. Be sure to end with a forward slash."); 
                        pathname = sc.nextLine(); 
                        
                        System.out.println("\n---------------------------------------");
                        System.out.println("Enter the desired file name. No extension required.\n");
                        filename = sc.nextLine(); 
                        Thread.sleep(120); 
                        Robot r = new Robot(); 

                        String path = pathname + filename + ".jpg"; 

                        Rectangle capture =  
                        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
                        BufferedImage Image = r.createScreenCapture(capture); 
                        ImageIO.write(Image, "jpg", new File(path)); 
                        System.out.println("---------------------------------------");
                        System.out.println("\n Screenshot saved successfully as " + filename + ".jpg \n");
                    }
                } catch (Exception e) {
                    System.out.println("Error occurred while screencapturing."); 
                }
            }

        }); 

        if (args.length > 1) {
            System.out.println("This is a test"); 
        }
    }
}