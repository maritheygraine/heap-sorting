
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Algorithm_Heap extends javax.swing.JFrame {

    static ArrayList<Integer> time = new ArrayList<>();
    static ArrayList<String> task = new ArrayList<>();
    static int n;

    public Algorithm_Heap() {
        initComponents();
        this.setVisible(true);

        PB.setValue(0);
        PB.setString("");
    }

    private static void printArray(ArrayList<Integer> time, String direct) {
        if (direct.equals("before")) {
            for (int i = 0; i < time.size(); i++) {
                areaSimulation.append(time.get(i) + " minutes for " + task.get(i) + "\n");
            }
        } else if (direct.equals("after")) {
            for (int i = 0; i < time.size(); i++) {
                areaList.append(time.get(i) + " minutes for " + task.get(i) + "\n");
            }
        }
    }

    static public void ascendingHeap(ArrayList<Integer> time, ArrayList<String> task, int n, int i) {

        int smallestRoot = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && time.get(leftChild) > time.get(smallestRoot)) {
            smallestRoot = leftChild;
        }

        if (rightChild < n && time.get(rightChild) > time.get(smallestRoot)) {
            smallestRoot = rightChild;
        }

        if (smallestRoot != i) {
            int temp = time.get(i);
            String temp2 = task.get(i);

            task.set(i, task.get(smallestRoot));
            time.set(i, time.get(smallestRoot));
            task.set(smallestRoot, temp2);
            time.set(smallestRoot, temp);
            ascendingHeap(time, task, n, smallestRoot);
        }

        //To Print Passes
        printArray(time, "before");
        areaSimulation.append("\n");
    }

    static public void ascendingHeapSort(ArrayList<Integer> time) {
        int n = time.size();

        for (int i = n / 2 - 1; i >= 0; i--) // Build heap 
        {
            ascendingHeap(time, task, n, i);
        }

        //Identify root and put in last
        for (int i = n - 1; i >= 0; i--) {
            int temp = time.get(0);
            String temp2 = task.get(0);
            time.set(0, time.get(i));
            time.set(i, temp);
            task.set(0, task.get(i));
            task.set(i, temp2);
            ascendingHeap(time, task, i, 0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start = new javax.swing.JPanel();
        Menu2 = new javax.swing.JLayeredPane();
        scroll_simulation = new javax.swing.JScrollPane();
        areaSimulation = new javax.swing.JTextArea();
        scroll_List = new javax.swing.JScrollPane();
        areaList = new javax.swing.JTextArea();
        btnNew = new javax.swing.JButton();
        bg2 = new javax.swing.JLabel();
        Menu1 = new javax.swing.JLayeredPane();
        taskTime = new javax.swing.JTextField();
        taskName = new javax.swing.JTextField();
        scroll_areaTIme = new javax.swing.JScrollPane();
        areaTime = new javax.swing.JTextArea();
        scroll_areaTask1 = new javax.swing.JScrollPane();
        areaTask1 = new javax.swing.JTextArea();
        btnSort = new javax.swing.JButton();
        btnAdd_Time = new javax.swing.JButton();
        btnAdd_Task = new javax.swing.JButton();
        bg1 = new javax.swing.JLabel();
        splash = new javax.swing.JLabel();
        PB = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Start.setBackground(new java.awt.Color(47, 45, 114));
        Start.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll_simulation.setBorder(null);
        scroll_simulation.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        areaSimulation.setColumns(18);
        areaSimulation.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        areaSimulation.setForeground(new java.awt.Color(236, 170, 41));
        areaSimulation.setRows(5);
        areaSimulation.setToolTipText("");
        areaSimulation.setBorder(null);
        areaSimulation.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                areaSimulationPropertyChange(evt);
            }
        });
        scroll_simulation.setViewportView(areaSimulation);
        areaSimulation.getAccessibleContext().setAccessibleName("");

        Menu2.add(scroll_simulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 300, 340));

        scroll_List.setBorder(null);
        scroll_List.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        areaList.setBackground(new java.awt.Color(210, 237, 248));
        areaList.setColumns(20);
        areaList.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        areaList.setForeground(new java.awt.Color(25, 184, 188));
        areaList.setRows(5);
        areaList.setToolTipText("");
        areaList.setBorder(null);
        scroll_List.setViewportView(areaList);

        Menu2.add(scroll_List, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 110, 280, 210));

        btnNew.setBorder(null);
        btnNew.setContentAreaFilled(false);
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        Menu2.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 450, 120, 25));

        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu0.png"))); // NOI18N
        Menu2.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 500));

        Start.add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 500));

        Menu1.setBackground(new java.awt.Color(210, 237, 248));
        Menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taskTime.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        taskTime.setForeground(new java.awt.Color(153, 153, 153));
        taskTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        taskTime.setBorder(null);
        taskTime.setOpaque(false);
        Menu1.add(taskTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 152, 100, 55));

        taskName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        taskName.setForeground(new java.awt.Color(255, 255, 255));
        taskName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        taskName.setBorder(null);
        taskName.setOpaque(false);
        taskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskNameActionPerformed(evt);
            }
        });
        Menu1.add(taskName, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 150, 120, 60));

        scroll_areaTIme.setBorder(null);
        scroll_areaTIme.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll_areaTIme.setOpaque(false);

        areaTime.setBackground(new java.awt.Color(245, 101, 33));
        areaTime.setColumns(20);
        areaTime.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        areaTime.setForeground(new java.awt.Color(255, 255, 255));
        areaTime.setLineWrap(true);
        areaTime.setTabSize(0);
        areaTime.setBorder(null);
        scroll_areaTIme.setViewportView(areaTime);

        Menu1.add(scroll_areaTIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 268, 130, 149));

        scroll_areaTask1.setBorder(null);
        scroll_areaTask1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll_areaTask1.setOpaque(false);

        areaTask1.setBackground(new java.awt.Color(235, 234, 233));
        areaTask1.setColumns(20);
        areaTask1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        areaTask1.setTabSize(0);
        areaTask1.setToolTipText("");
        areaTask1.setBorder(null);
        scroll_areaTask1.setViewportView(areaTask1);

        Menu1.add(scroll_areaTask1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 268, 120, 150));

        btnSort.setBorder(null);
        btnSort.setContentAreaFilled(false);
        btnSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        Menu1.add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 120, 25));

        btnAdd_Time.setBorder(null);
        btnAdd_Time.setContentAreaFilled(false);
        btnAdd_Time.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_TimeActionPerformed(evt);
            }
        });
        Menu1.add(btnAdd_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 168, 28, 25));

        btnAdd_Task.setBorder(null);
        btnAdd_Task.setContentAreaFilled(false);
        btnAdd_Task.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd_Task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_TaskActionPerformed(evt);
            }
        });
        Menu1.add(btnAdd_Task, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 168, 28, 25));

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu.png"))); // NOI18N
        Menu1.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 500));

        Start.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 500));

        splash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splash.gif"))); // NOI18N
        Start.add(splash, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 500, 500));

        PB.setBackground(new java.awt.Color(47, 45, 114));
        PB.setForeground(new java.awt.Color(47, 45, 114));
        PB.setBorderPainted(false);
        Start.add(PB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 10, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        try {
            if (time.size() == task.size()) {
                areaSimulation.append("\nBEFORE ASCENDING HEAP SORT: \n");
                printArray(time, "before"); //displays input

                areaSimulation.append("\n\nPASSES:\n");

                ascendingHeapSort(time);
                printArray(time, "after");

                this.Menu1.setVisible(false);
                this.Menu2.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,
                        "There is an empty textfield",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException ie) {
            JOptionPane.showMessageDialog(null,
                    "Input is invalid",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } catch (NullPointerException ie) {
            JOptionPane.showMessageDialog(null,
                    "Field is empty",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnAdd_TaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_TaskActionPerformed
        try {
            if (!taskName.getText().isEmpty()) { 
                task.add(taskName.getText());
                areaTask1.append(taskName.getText() + "\n");
                taskName.setText("");
            } else {
                JOptionPane.showMessageDialog(null,
                    "Field is empty",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException ie) {
            JOptionPane.showMessageDialog(null,
                    "Input is invalid",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } catch (NullPointerException ie) {
            JOptionPane.showMessageDialog(null,
                    "Field is empty",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAdd_TaskActionPerformed

    private void taskNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskNameActionPerformed

    private void btnAdd_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_TimeActionPerformed
        try {
            if (!taskTime.getText().isEmpty()) {
                time.add(Integer.valueOf(taskTime.getText()));
                areaTime.append(taskTime.getText() + "\n");
                taskTime.setText("");
            } else {
                JOptionPane.showMessageDialog(null,
                    "Field is empty",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }    
        } catch (NumberFormatException ie) {
            JOptionPane.showMessageDialog(null,
                    "Input is invalid",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } catch (NullPointerException ie) {
            JOptionPane.showMessageDialog(null,
                    "Field is empty",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAdd_TimeActionPerformed

    private void areaSimulationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_areaSimulationPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_areaSimulationPropertyChange

    public static void main(String args[]) {

        Algorithm_Heap screen = new Algorithm_Heap();
        screen.Start.setVisible(true);
        screen.Menu1.setVisible(false);
        screen.Menu2.setVisible(false);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                screen.PB.setValue(i);
                if (i == 100) {

                    screen.Menu1.setVisible(true);
                }
            }
        } catch (InterruptedException ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Menu1;
    private javax.swing.JLayeredPane Menu2;
    private javax.swing.JProgressBar PB;
    private javax.swing.JPanel Start;
    private static javax.swing.JTextArea areaList;
    private static javax.swing.JTextArea areaSimulation;
    private javax.swing.JTextArea areaTask1;
    private javax.swing.JTextArea areaTime;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JButton btnAdd_Task;
    private javax.swing.JButton btnAdd_Time;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSort;
    private javax.swing.JScrollPane scroll_List;
    private javax.swing.JScrollPane scroll_areaTIme;
    private javax.swing.JScrollPane scroll_areaTask1;
    private javax.swing.JScrollPane scroll_simulation;
    private javax.swing.JLabel splash;
    private javax.swing.JTextField taskName;
    private javax.swing.JTextField taskTime;
    // End of variables declaration//GEN-END:variables
}
