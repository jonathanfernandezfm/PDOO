/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import napakalaki.Monster;

/**
 *
 * @author Jonathan
 */
public class MonsterView extends javax.swing.JPanel {

    public Monster monster;
    
    public void setMonster(Monster m){
        monster = m;
        this.name.setText(monster.getName());
        this.combatlevel.setText(Integer.toString(monster.getCombatLevel()));
        this.prizeView1.setPrize(monster.getPrize());
        this.badConsequenceView1.setBadConsequence(monster.getBadConsequence());
        repaint();
    }
    
    /**
     * Creates new form MonsterView
     */
    public MonsterView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        nametitle = new javax.swing.JLabel();
        combatleveltitle = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        combatlevel = new javax.swing.JTextField();
        prizeView1 = new GUI.PrizeView();
        badConsequenceView1 = new GUI.BadConsequenceView();

        setBackground(new java.awt.Color(247, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));

        title.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        title.setText("Monstruo");

        nametitle.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        nametitle.setText("Nombre:");

        combatleveltitle.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        combatleveltitle.setText("Nivel de combate:");

        name.setEditable(false);
        name.setBackground(new java.awt.Color(240, 240, 240));
        name.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N

        combatlevel.setEditable(false);
        combatlevel.setBackground(new java.awt.Color(240, 240, 240));
        combatlevel.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(badConsequenceView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(combatleveltitle)
                                        .addGap(31, 31, 31)
                                        .addComponent(combatlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nametitle)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(prizeView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nametitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combatleveltitle)
                            .addComponent(combatlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(prizeView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(badConsequenceView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.BadConsequenceView badConsequenceView1;
    private javax.swing.JTextField combatlevel;
    private javax.swing.JLabel combatleveltitle;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nametitle;
    private GUI.PrizeView prizeView1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
