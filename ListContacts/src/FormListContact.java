
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormListContact extends javax.swing.JFrame {

    /**
     * Creates new form FormListContact
     */
    public FormListContact() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblListContact = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblCopyright = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();
    
     
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List Contact");
        setResizable(false);
        setSize(new java.awt.Dimension(380, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumber.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        lblNumber.setText("Number");
        bg.add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, 30));

        txtNumber.setBackground(new java.awt.Color(247, 248, 249));
        txtNumber.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        txtNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 189, 193), 2, true));
        bg.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 290, 40));

        txtName.setBackground(new java.awt.Color(247, 248, 249));
        txtName.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 189, 193), 2, true));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        bg.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 40));

        lblListContact.setFont(new java.awt.Font("Product Sans", 1, 45)); // NOI18N
        lblListContact.setText("List Contact");
        bg.add(lblListContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 260, 50));

        lblName.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        lblName.setText("Name");
        bg.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 30));

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setFont(new java.awt.Font("Urbanist Medium", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        bg.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 85, 25));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Urbanist Medium", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        bg.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 350, 85, 25));

        btnRead.setBackground(new java.awt.Color(255, 255, 255));
        btnRead.setFont(new java.awt.Font("Urbanist Medium", 0, 14)); // NOI18N
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });
        bg.add(btnRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 350, 75, 25));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Urbanist Medium", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        bg.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 85, 25));

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setFont(new java.awt.Font("Urbanist Medium", 0, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        bg.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 85, 25));

        btnClear.setBackground(new java.awt.Color(204, 255, 255));
        btnClear.setFont(new java.awt.Font("Urbanist Medium", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        bg.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 85, 25));

        lblCopyright.setFont(new java.awt.Font("Urbanist", 0, 14)); // NOI18N
        lblCopyright.setForeground(new java.awt.Color(153, 153, 153));
        lblCopyright.setText("© 2023 Creado y diseñado por SierraJCode");
        bg.add(lblCopyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg.png"))); // NOI18N
        bg.add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 560));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 560));

        pack();
    
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
 
            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = txtName.getText();
 
            String nameNumberString;
            String name;
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Checking whether the name of contact exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // if condition to find existence of record.
                if (name.equals(newName)) {
                    found = true;
                    break;
                }
            }
 
            // Delete the contact if record exists.
            if (found == true) {
 
                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");
 
                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");
 
                // Set file pointer to start
                raf.seek(0);
 
                // Traversing the friendsContact.txt file
                while (raf.getFilePointer() < raf.length()) {
 
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);
 
                    // Check if the fetched contact
                    // is the one to be deleted
                    if (name.equals(newName)) {
 
                        // Skip inserting this contact
                        // into the temporary file
                        continue;
                    }
 
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);
 
                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(System.lineSeparator());
                }
 
                // The contact has been deleted now
                // So copy the updated content from
                // the temporary file to original file.
 
                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);
 
                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
 
                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());
 
                // Closing the resources.
                tmpraf.close();
                raf.close();
 
                // Deleting the temporary file
                tmpFile.delete();
 
                System.out.println(" Friend deleted. ");
                JOptionPane.showMessageDialog(null, "Friend " + newName + " has been deleted");
            }
 
            // The contact to be deleted
            // could not be found
            else {
 
                // Closing the resources.
                raf.close();
 
                // Print the message
                System.out.println(" Input name"
                                   + " does not exists. ");
            }
        }
 
        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        		try {

			String nameNumberString;
			String name;
			long number;
			String nameText = txtName.getText();

			// Using file pointer creating the file.
			File file = new File("friendsContact.txt");

			if (!file.exists()) {

				// Create a new file if not exists.
				file.createNewFile();
			}

			// Opening file in reading and write mode.

			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			boolean found = false;
                        
			// Traversing the file
			// getFilePointer() give the current offset
			// value from start of the file.
                        
			while (raf.getFilePointer() < raf.length()) {

				// reading line from the file.
				nameNumberString = raf.readLine();

				// splitting the string to get name and
				// number
				String[] lineSplit = nameNumberString.split("!");

				// separating name and number.
				name = lineSplit[0];
				number = Long.parseLong(lineSplit[1]);
                                
                                if(nameText.equals(name)){
                                    found = true;
                                    JOptionPane.showMessageDialog(null, "Friend Name: " + name + "\n" + "Contact Number: " + number + "\n");
                                    break;
                                }
                        }
                        if (!found){
                            JOptionPane.showMessageDialog(null, "Friend not found");
                        }
                        }

			catch (IOException ioe)
			{

				System.out.println(ioe);
			}
			catch (NumberFormatException nef)
			{

				System.out.println(nef);
			}
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
		try {

			// Get the name of the contact to be updated
			// from the Command line argument
			String newName = txtName.getText();

			// Get the number to be updated
			// from the Command line argument
			long newNumber = Long.parseLong(txtNumber.getText());

			String nameNumberString;
			String name;
			long number;
			int index;

			// Using file pointer creating the file.
			File file = new File("friendsContact.txt");

			if (!file.exists()) {

				// Create a new file if not exists.
				file.createNewFile();
			}

			// Opening file in reading and write mode.
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			boolean found = false;

			// Checking whether the name
			// of contact already exists.
			// getFilePointer() give the current offset
			// value from start of the file.
			while (raf.getFilePointer() < raf.length()) {

				// reading line from the file.
				nameNumberString = raf.readLine();

				// splitting the string to get name and
				// number
				String[] lineSplit = nameNumberString.split("!");

				// separating name and number.
				name = lineSplit[0];
				number = Long.parseLong(lineSplit[1]);

				// if condition to find existence of record.
				if (name.equals(newName)) {
					found = true;
					break;
                                        
				}
			}

			// Update the contact if record exists.
			if (found == true) {

				// Creating a temporary file
				// with file pointer as tmpFile.
				File tmpFile = new File("temp.txt");

				// Opening this temporary file
				// in ReadWrite Mode
				RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

				// Set file pointer to start
				raf.seek(0);

				// Traversing the friendsContact.txt file
				while (raf.getFilePointer() < raf.length()) {

					// Reading the contact from the file
					nameNumberString = raf.readLine();

					index = nameNumberString.indexOf('!');
					name = nameNumberString.substring(0, index);

					// Check if the fetched contact
                                        // is the one to be updated
					if (name.equals(newName)) {
                                            
						// Update the number of this contact
						nameNumberString = name + "!" + String.valueOf(newNumber);
					}

					// Add this contact in the temporary
					// file
					tmpraf.writeBytes(nameNumberString);

					// Add the line separator in the
					// temporary file
					tmpraf.writeBytes(System.lineSeparator());
				}

				// The contact has been updated now
				// So copy the updated content from
				// the temporary file to original file.

				// Set both files pointers to start
				raf.setLength(0);
				tmpraf.seek(0);

				// Copy the contents from
				// the temporary file to original file.
				while (tmpraf.getFilePointer() < tmpraf.length()) {
					raf.writeBytes(tmpraf.readLine());
					raf.writeBytes(System.lineSeparator());
				}

				// Set the length of the original file
				// to that of temporary.
				
                                // raf.setLength(tmpraf.length());

				// Closing the resources.
				tmpraf.close();
				raf.close();

				// Deleting the temporary file
				tmpFile.delete();
                                JOptionPane.showMessageDialog(null, "The friend's " + newName + " was update.");
				
			}

			// The contact to be updated
			// could not be found
			else {

				// Closing the resources.
				raf.close();

				// Print the message
                                JOptionPane.showMessageDialog(null, "The friend " + newName + " does not exist.");
				
			}
		}

		catch (IOException ioe) {
			System.out.println(ioe);
		}

		catch (NumberFormatException nef) {
			System.out.println(nef);
		}


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {

			// Get the name of the contact to be updated
			// from the Command line argument
			String newName = txtName.getText();

			// Get the number to be updated
			// from the Command line argument
			long newNumber = Integer.parseInt(txtNumber.getText());

			String nameNumberString;
			String name;
			long number;
			int index;

			// Using file pointer creating the file.
			File file = new File("friendsContact.txt");

			if (!file.exists()) {

				// Create a new file if not exists.
				file.createNewFile();
			}

			// Opening file in reading and write mode.

			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			boolean found = false;

			// Checking whether the name
			// of contact already exists.
			// getFilePointer() give the current offset
			// value from start of the file.
			while (raf.getFilePointer() < raf.length()) {

				// reading line from the file.
				nameNumberString = raf.readLine();

				// splitting the string to get name and
				// number
				String[] lineSplit = nameNumberString.split("!");

				// separating name and number.
				name = lineSplit[0];
				number = Long.parseLong(lineSplit[1]);

				// if condition to find existence of record.
				if (name.equals(newName) || number == newNumber) {
					found = true;
                                        
                                        JOptionPane.showMessageDialog(null, "The record exist.");
                                        break;
				}
			}

			if (found == false) {

				// Enter the if block when a record
				// is not already present in the file.
				nameNumberString = newName + "!" + String.valueOf(newNumber);

				// writeBytes function to write a string
				// as a sequence of bytes.
				raf.writeBytes(nameNumberString);

				// To insert the next record in new line.
				raf.writeBytes(System.lineSeparator());
				// Print the message
                                JOptionPane.showMessageDialog(null, "The Friend " + newName + " was added. ");

				// Closing the resources.
				raf.close();
			}
			// The contact to be updated
			// could not be found
			else {

				// Closing the resources.
				raf.close();

				// Print the message
				
			}
		}

		catch (IOException ioe) {
                        JOptionPane.showMessageDialog(null, "Nombre Incorrecto");
			System.out.println(ioe);
		}
		catch (NumberFormatException nef) {
                        JOptionPane.showMessageDialog(null, "Incorrect number");
			System.out.println(nef);
		}
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtNumber.setText("");
        
        txtName.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormListContact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblListContact;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
