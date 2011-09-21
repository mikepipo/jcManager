package com.braicu.jcm;
import com.braicu.jcm.card.CardWorker;
import com.braicu.jcm.card.cap.utils.CapFilter;
import com.braicu.jcm.layout.JTextAreaOutputStream;
import com.braicu.jcm.layout.MySwingWorker;
import com.braicu.jcm.utils.ByteUtils;
import com.braicu.jcm.utils.Settings;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.PrintStream;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class JCManager extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	private JMenuItem aboutMenuItem;
	private JMenu jMenu5;
	private JFormattedTextField tfOldKey3;
	private JLabel lbOldKey2;
	private JFormattedTextField tfOldKey2;
	private JLabel lbOldKey1;
	private JFormattedTextField tfOldKey1;
	private JPanel pTwo;
	private JPanel pOne;
	private JTabbedPane tpMain;
	private JMenu jMenu4;
	private JMenuItem exitMenuItem;
	private JLabel lbCMAID;
	private ButtonGroup bgKeys;
	private JCheckBoxMenuItem debugMenuItem;
	private JLabel lbNotYet;
	private JButton btResetCard;
	private JButton btGetInfo;
	private JButton btAuthenticate;
	private JButton btUpload;
	private JTextField tfInstallParameters;
	private JLabel labelParamInstall;
	private JTextField tfFile;
	private JButton btFile;
	private JPanel panelCAP;
	private JButton btAddKeys;
	private JRadioButton bgModifyKeys;
	private JRadioButton rbAddKeys;
	private JLabel lbKeyset;
	private JTextField tfKeyset;
	private JPanel panelOPKeys;
	private JFormattedTextField tfCMAID;
	private JButton btRefresh;
	private JComboBox cbReader;
	private JLabel lbReader;
	private JLabel lbNewKey1;
	private JFormattedTextField tfNewKey1;
	private JLabel lbNewKey2;
	private JFormattedTextField tfNewKey2;
	private JLabel lbNewKey3;
	private JFormattedTextField tfNewKey3;
	private JPanel panelNewKeys;
	private JPanel panelAuthKeys;
	private JLabel lbOldKey3;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;

	
	//bb
    private CardWorker cw;
    private JTextAreaOutputStream jtaos;
    private JTextArea textArea;
    private JScrollPane jsp;
    private JFileChooser fc;
    private File f;

	
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		Settings.initContext();
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JCManager inst = new JCManager();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setPreferredSize(new java.awt.Dimension(0, 0));
				inst.setSize(681, 432);
			}
		});
	}
	
	public JCManager() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				this.setTitle("jcManager");
				{
					tpMain = new JTabbedPane();
					getContentPane().add(tpMain, BorderLayout.NORTH);

					//bb

					tpMain.setPreferredSize(new java.awt.Dimension(665, 258));
					{
						pOne = new JPanel();
						tpMain.addTab("Manage Card", null, pOne, null);
						pOne.setLayout(null);
						pOne.setPreferredSize(new java.awt.Dimension(666, 196));
						{
							panelAuthKeys = new JPanel();
							pOne.add(panelAuthKeys);
							panelAuthKeys.setBounds(3, 10, 327, 88);
							panelAuthKeys.setBorder(BorderFactory.createTitledBorder("Authentication Keys"));
							panelAuthKeys.setOpaque(false);
							panelAuthKeys.setLayout(null);
							{
								tfOldKey1 = new JFormattedTextField();
								panelAuthKeys.add(tfOldKey1);
								tfOldKey1.setBounds(82, 16, 238, 19);
								tfOldKey1.addFocusListener(new FocusAdapter() {
									public void focusLost(FocusEvent evt) {
										tfOldKey1FocusLost(evt);
									}
								});
							}
							{
								lbOldKey1 = new JLabel();
								panelAuthKeys.add(lbOldKey1);
								lbOldKey1.setText("Key 1 (S_ENC)");
								lbOldKey1.setBounds(7, 17, 73, 16);
							}
							{
								tfOldKey2 = new JFormattedTextField();
								panelAuthKeys.add(tfOldKey2);
								tfOldKey2.setBounds(82, 38, 238, 19);
								tfOldKey2.addFocusListener(new FocusAdapter() {
									public void focusLost(FocusEvent evt) {
										tfOldKey2FocusLost(evt);
									}
								});
							}
							{
								lbOldKey2 = new JLabel();
								panelAuthKeys.add(lbOldKey2);
								lbOldKey2.setText("Key 2 (S_MAC)");
								lbOldKey2.setBounds(7, 39, 73, 16);
							}
							{
								tfOldKey3 = new JFormattedTextField();
								panelAuthKeys.add(tfOldKey3);
								tfOldKey3.setBounds(82, 60, 238, 19);
								tfOldKey3.addFocusListener(new FocusAdapter() {
									public void focusLost(FocusEvent evt) {
										tfOldKey3FocusLost(evt);
									}
								});
							}
							{
								lbOldKey3 = new JLabel();
								panelAuthKeys.add(lbOldKey3);
								lbOldKey3.setText("Key 3 (DEK)");
								lbOldKey3.setBounds(7, 61, 73, 16);
							}
						}
						{
							panelNewKeys = new JPanel();
							pOne.add(panelNewKeys);
							panelNewKeys.setOpaque(false);
							panelNewKeys.setBorder(BorderFactory.createTitledBorder("New Keys"));
							panelNewKeys.setBounds(331, 10, 327, 88);
							panelNewKeys.setLayout(null);
							{
								tfNewKey3 = new JFormattedTextField();
								panelNewKeys.add(tfNewKey3);
								tfNewKey3.setBounds(82, 58, 238, 19);
								tfNewKey3.addFocusListener(new FocusAdapter() {
									public void focusLost(FocusEvent evt) {
										tfNewKey3FocusLost(evt);
									}
								});
							}
							{
								lbNewKey3 = new JLabel();
								panelNewKeys.add(lbNewKey3);
								lbNewKey3.setText("Key 3 (DEK)");
								lbNewKey3.setBounds(7, 60, 73, 16);
							}
							{
								tfNewKey2 = new JFormattedTextField();
								panelNewKeys.add(tfNewKey2);
								tfNewKey2.setBounds(82, 37, 238, 19);
								tfNewKey2.addFocusListener(new FocusAdapter() {
									public void focusLost(FocusEvent evt) {
										tfNewKey2FocusLost(evt);
									}
								});
							}
							{
								lbNewKey2 = new JLabel();
								panelNewKeys.add(lbNewKey2);
								lbNewKey2.setText("Key 2 (S_MAC)");
								lbNewKey2.setBounds(7, 38, 73, 16);
							}
							{
								tfNewKey1 = new JFormattedTextField();
								panelNewKeys.add(tfNewKey1);
								tfNewKey1.setBounds(82, 15, 238, 19);
								tfNewKey1.addFocusListener(new FocusAdapter() {
									public void focusLost(FocusEvent evt) {
										tfNewKey1FocusLost(evt);
									}
								});
							}
							{
								lbNewKey1 = new JLabel();
								panelNewKeys.add(lbNewKey1);
								lbNewKey1.setText("Key 1 (S_ENC)");
								lbNewKey1.setBounds(7, 16, 73, 16);
							}
						}
						{
							lbReader = new JLabel();
							pOne.add(lbReader);
							lbReader.setText("Select Card Reader");
							lbReader.setBounds(10, 109, 93, 14);
						}
						{
							ComboBoxModel cbReaderModel = 
								new DefaultComboBoxModel(
										new String[] { "Item One", "Item Two" });
							cbReader = new JComboBox();
							pOne.add(getCbReader());
							cbReader.setModel(cbReaderModel);
							cbReader.setBounds(109, 105, 156, 20);
							cbReader.addItemListener(new ItemListener() {
								public void itemStateChanged(ItemEvent evt) {
									cbReaderItemStateChanged(evt);
								}
							});
						}
						{
							btRefresh = new JButton();
							pOne.add(btRefresh);
							btRefresh.setBounds(268, 104, 29, 21);
							btRefresh.setBorderPainted(false);
							btRefresh.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/Refresh16.gif")));
							btRefresh.setSize(29, 22);
							btRefresh.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									btRefreshActionPerformed(evt);
								}
							});
						}
						{
							lbCMAID = new JLabel();
							pOne.add(lbCMAID);
							lbCMAID.setText("CardManager AID");
							lbCMAID.setBounds(343, 108, 86, 14);
						}
						{
							tfCMAID = new JFormattedTextField();
							pOne.add(getTfCMAID());
							tfCMAID.setBounds(439, 105, 180, 20);
							tfCMAID.addFocusListener(new FocusAdapter() {
								public void focusLost(FocusEvent evt) {
									tfCMAIDFocusLost(evt);
								}
							});
						}
						{
							panelOPKeys = new JPanel();
							pOne.add(panelOPKeys);
							pOne.add(getPanelCAP());
							pOne.add(getBtAuthenticate());
							pOne.add(getBtGetInfo());
							pOne.add(getBtResetCard());
							panelOPKeys.setBounds(4, 136, 321, 58);
							panelOPKeys.setBorder(BorderFactory.createTitledBorder("Manage keys"));
							panelOPKeys.setLayout(null);
							{
								tfKeyset = new JTextField();
								panelOPKeys.add(tfKeyset);
								tfKeyset.setBounds(55, 22, 40, 20);
								tfKeyset.addFocusListener(new FocusAdapter() {
									public void focusLost(FocusEvent evt) {
										tfKeysetFocusLost(evt);
									}
								});
							}
							{
								lbKeyset = new JLabel();
								panelOPKeys.add(lbKeyset);
								lbKeyset.setText("Keyset");
								lbKeyset.setBounds(16, 25, 33, 14);
							}
							{
								rbAddKeys = new JRadioButton();
								panelOPKeys.add(rbAddKeys);
								rbAddKeys.setText("Add");
								rbAddKeys.setBounds(105, 11, 45, 23);
								getBgKeys().add(rbAddKeys);
							}
							{
								bgModifyKeys = new JRadioButton();
								panelOPKeys.add(bgModifyKeys);
								panelOPKeys.add(getBtAddKeys());
								bgModifyKeys.setText("Modify");
								bgModifyKeys.setBounds(105, 30, 57, 23);
								getBgKeys().add(bgModifyKeys);
								bgModifyKeys.setSelected(true);
							}
						}
					}
					{
						pTwo = new JPanel();
						BorderLayout pTwoLayout = new BorderLayout();
						pTwo.setLayout(pTwoLayout);
						tpMain.addTab("Test APDU", null, pTwo, null);
						pTwo.setEnabled(false);
						pTwo.add(getLbNotYet(), BorderLayout.CENTER);
					}
				}
				this.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent evt) {
						thisWindowClosing(evt);
					}
					public void windowClosed(WindowEvent evt) {
						thisWindowClosed(evt);
					}
				});
			}
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("File");
					{
						exitMenuItem = new JMenuItem();
						jMenu3.add(exitMenuItem);
						exitMenuItem.setText("Exit");
						exitMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								exitMenuItemActionPerformed(evt);
							}
						});
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("Display");
					jMenu4.add(getDebugMenuItem());
				}
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("Help");
					{
						aboutMenuItem = new JMenuItem();
						jMenu5.add(aboutMenuItem);
						aboutMenuItem.setText("About");
						aboutMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								aboutMenuItemActionPerformed(evt);
							}
						});
					}
				}
			}

			textArea = new JTextArea();
			jtaos = new JTextAreaOutputStream(textArea);
	     	PrintStream ps = new PrintStream(jtaos);
	    	System.setOut(ps);
	    	System.setErr(ps);
			
			jsp = new JScrollPane(textArea);
			getContentPane().add(jsp, BorderLayout.CENTER);

			
			
			pack();
			pack();
			this.setSize(681, 432);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//bb
		
		tfOldKey1.setText(Settings.props.getProperty("AuthKey1"));
		tfOldKey2.setText(Settings.props.getProperty("AuthKey2"));
		tfOldKey3.setText(Settings.props.getProperty("AuthKey3"));
		tfNewKey1.setText(Settings.props.getProperty("NewKey1"));
		tfNewKey2.setText(Settings.props.getProperty("NewKey2"));
		tfNewKey3.setText(Settings.props.getProperty("NewKey3"));
		
		tfKeyset.setText(Settings.props.getProperty("KeySet"));
		tfCMAID.setText(Settings.props.getProperty("CMAID"));
		tfInstallParameters.setText(Settings.props.getProperty("InstallParameters"));

		debugMenuItem.setSelected(Settings.isDebugMode());
    	
    	fc=new JFileChooser(); 
    	
        cw = new CardWorker();
        cw.setTextArea(jtaos);

        rereadReaders();
		
		
		
	}
	
	public JFormattedTextField getTfOldKey1() {
		return tfOldKey1;
	}
	
	public JComboBox getCbReader() {
		return cbReader;
	}
	
	public JFormattedTextField getTfCMAID() {
		return tfCMAID;
	}
	
	private ButtonGroup getBgKeys() {
		if(bgKeys == null) {
			bgKeys = new ButtonGroup();
		}
		return bgKeys;
	}
	
	private JButton getBtAddKeys() {
		if(btAddKeys == null) {
			btAddKeys = new JButton();
			btAddKeys.setText("Add/Modify Keys");
			btAddKeys.setBounds(189, 21, 113, 23);
			btAddKeys.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btAddKeysActionPerformed(evt);
				}
			});
		}
		return btAddKeys;
	}
	
	private JPanel getPanelCAP() {
		if(panelCAP == null) {
			panelCAP = new JPanel();
			panelCAP.setLayout(null);
			panelCAP.setBounds(331, 136, 319, 86);
			panelCAP.setBorder(BorderFactory.createTitledBorder(null, "Upload & Install CAP", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION));
			panelCAP.add(getBtFile(), new AnchorConstraint(439, 597, 836, 405, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			panelCAP.add(getTfFile());
			panelCAP.add(getLabelParamInstall());
			panelCAP.add(getTfInstallParameters());
			panelCAP.add(getBtUpload());
		}
		return panelCAP;
	}
	
	private JButton getBtFile() {
		if(btFile == null) {
			btFile = new JButton();
			btFile.setText("File...");
			btFile.setBounds(12, 20, 61, 23);
			btFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btFileActionPerformed(evt);
				}
			});
		}
		return btFile;
	}
	
	public JTextField getTfFile() {
		if(tfFile == null) {
			tfFile = new JTextField();
			tfFile.setBounds(83, 21, 213, 20);
		}
		return tfFile;
	}
	
	private JLabel getLabelParamInstall() {
		if(labelParamInstall == null) {
			labelParamInstall = new JLabel();
			labelParamInstall.setText("Install parameters");
			labelParamInstall.setBounds(16, 54, 87, 14);
		}
		return labelParamInstall;
	}
	
	private JTextField getTfInstallParameters() {
		if(tfInstallParameters == null) {
			tfInstallParameters = new JTextField();
			tfInstallParameters.setBounds(107, 51, 105, 20);
			tfInstallParameters.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent evt) {
					tfInstallParametersFocusLost(evt);
				}
			});
		}
		return tfInstallParameters;
	}
	
	private JButton getBtUpload() {
		if(btUpload == null) {
			btUpload = new JButton();
			btUpload.setText("Upload");
			btUpload.setBounds(224, 49, 65, 23);
			btUpload.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btUploadActionPerformed(evt);
				}
			});
		}
		return btUpload;
	}
	
	private JButton getBtAuthenticate() {
		if(btAuthenticate == null) {
			btAuthenticate = new JButton();
			btAuthenticate.setText("Authenticate");
			btAuthenticate.setBounds(10, 200, 95, 23);
			btAuthenticate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btAuthenticateActionPerformed(evt);
				}
			});
		}
		return btAuthenticate;
	}
	
	private JButton getBtGetInfo() {
		if(btGetInfo == null) {
			btGetInfo = new JButton();
			btGetInfo.setText("Get Card Info");
			btGetInfo.setBounds(114, 200, 98, 23);
			btGetInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btGetInfoActionPerformed(evt);
				}
			});
		}
		return btGetInfo;
	}
	
	private JButton getBtResetCard() {
		if(btResetCard == null) {
			btResetCard = new JButton();
			btResetCard.setText("Reset Card");
			btResetCard.setBounds(220, 199, 90, 23);
			btResetCard.setToolTipText("Delete all applets & packages from card");
			btResetCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btResetCardActionPerformed(evt);
				}
			});
		}
		return btResetCard;
	}
	
	private void btRefreshActionPerformed(ActionEvent evt) {
		rereadReaders();
	}
	
	private void btAuthenticateActionPerformed(ActionEvent evt) {
    	  textArea.setText("");
            authenticate();	}

	
    private void rereadReaders(){
        final MySwingWorker worker = new MySwingWorker() {
          public Object construct() {
          	try{
          	cbReader.removeAllItems();
            String[] sa = cw.getReaders();
            for (int i=0 ; i < sa.length ; i++) {
            	cbReader.insertItemAt(sa[i], i);
            }
            if (cbReader.getItemCount()>0)
            	cbReader.setSelectedIndex(0);
          	}catch(Exception e){
        	    System.err.println("EX: msg " + e.getMessage() + ", class " + e.getClass());
        	    e.printStackTrace(System.err);
        	}
          	finally{
          		cw.disconnectCard();
          	}
            return "1";
          }
          

          public void finished() {
          }
        };
        worker.start();    	  
//  	System.exit(0);
    }

    private void authenticate(){
        final MySwingWorker worker = new MySwingWorker() {
          public Object construct() {
          	try{
            cw.authenticate(getAuthKeysArray(), false);
          	}catch(Exception e){
        	    System.err.println("EX: msg " + e.getMessage() + ", class " + e.getClass());
        	    e.printStackTrace(System.err);
        	}
          	finally{
          		cw.disconnectCard();
          	}
            return "1";
          }


          public void finished() {
          }
        };
        worker.start();    	  
//  	System.exit(0);
    }

    
    private String[] getAuthKeysArray(){
        String[] tmpArray = new String[3];
        tmpArray[0]=tfOldKey1.getText();
        tmpArray[1]=tfOldKey2.getText();
        tmpArray[2]=tfOldKey3.getText();
        return tmpArray;
      }
      private String[] getNewKeysArray(){
          String[] tmpArray = new String[3];
          tmpArray[0]=tfNewKey1.getText();
          tmpArray[1]=tfNewKey2.getText();
          tmpArray[2]=tfNewKey3.getText();
          return tmpArray;
        }
      
      private void thisWindowClosed(WindowEvent evt) {
    	  System.exit(1);
      }
      
      private void tfInstallParametersFocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("InstallParameters", tfInstallParameters.getText());
      }
      
      private void tfCMAIDFocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("CMAID", tfCMAID.getText());    	  
      }
      
      private void tfKeysetFocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("KeySet", tfKeyset.getText());
      }
      
      private void tfOldKey1FocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("AuthKey1", tfOldKey1.getText());
      }
      
      private void tfOldKey2FocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("AuthKey2", tfOldKey2.getText());
      }
      
      private void tfOldKey3FocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("AuthKey3", tfOldKey3.getText());
      }
      
      private void tfNewKey1FocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("NewKey1", tfNewKey1.getText());
      }
      
      private void tfNewKey2FocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("NewKey2", tfNewKey3.getText());
      }
      
      private void tfNewKey3FocusLost(FocusEvent evt) {
    	  Settings.props.setProperty("NewKey3", tfNewKey3.getText());
      }
      
      private void exitMenuItemActionPerformed(ActionEvent evt) {
    	  Settings.saveContext();
    	  System.exit(0);
      }
      
      private void thisWindowClosing(WindowEvent evt) {
    	 Settings.saveContext();
    	  System.exit(0);
      }
      
      private void cbReaderItemStateChanged(ItemEvent evt) {
    	  if (cbReader.getItemCount()>0)
    	  Settings.setSelectedReader(cbReader.getSelectedIndex());
    	  else {
        	  Settings.setSelectedReader(-1);    		  
    	  }
      }
      
      private void btAddKeysActionPerformed(ActionEvent evt) {
    	  textArea.setText("");
      	  replaceKeys();
      }

      private void replaceKeys(){
          final MySwingWorker worker = new MySwingWorker() {
            public Object construct() {
            	try{
              cw.changekeys(getAuthKeysArray(), getNewKeysArray(), Integer.parseInt(tfKeyset.getText()),false, rbAddKeys.isSelected());
            	}catch(Exception e){
          	    System.err.println("EX: msg " + e.getMessage() + ", class " + e.getClass());
          	    e.printStackTrace(System.err);
          	}
              	finally{
              		cw.disconnectCard();
              	}
            	
              return "1";
            }


            public void finished() {
            }
          };
          worker.start();    	  
      }
      
      private void btGetInfoActionPerformed(ActionEvent evt) {
    	  textArea.setText("");
    	  getInfo();
      }

      private void getInfo(){
          final MySwingWorker worker = new MySwingWorker() {
            public Object construct() {
              try{
              cw.getInfo(getAuthKeysArray(), false);
              }catch(Exception e){
                  System.err.println("EX: msg " + e.getMessage() + ", class " + e.getClass());
                  e.printStackTrace(System.err);
              }
            	finally{
            		cw.disconnectCard();
            	}
              return "1";
            }
            public void finished() {
            }
          };
          worker.start();       
//        System.exit(0);
      }
      
      private void btResetCardActionPerformed(ActionEvent evt) {
    	  textArea.setText("");
    	  resetCard();
      }

      private void resetCard(){
          final MySwingWorker worker = new MySwingWorker() {
            public Object construct() {
              try{
              cw.resetCard(getAuthKeysArray(), false);
              }catch(Exception e){
                  System.err.println("EX: msg " + e.getMessage() + ", class " + e.getClass());
                  e.printStackTrace(System.err);
              }
            	finally{
            		cw.disconnectCard();
            	}
              return "1";
            }
            public void finished() {
            }
          };
          worker.start();       
//        System.exit(0);
      }     
      
      private void btUploadActionPerformed(ActionEvent evt) {
    	  textArea.setText("");
    	  f = new File(tfFile.getText());
    	  if (f.exists())
    		  uploadCAP();
      }
      
      private void uploadCAP(){
          final MySwingWorker worker = new MySwingWorker() {
            public Object construct() {
            	try{
            	  cw.uploadCAP(f, getAuthKeysArray(), false, ByteUtils.stoh(tfInstallParameters.getText()));
            	}catch(Exception e){
          	    System.err.println("EX: msg " + e.getMessage() + ", class " + e.getClass());
          	    e.printStackTrace(System.err);
          	}
              	finally{
              		cw.disconnectCard();
              	}

            	return "1";
            }
            public void finished() {
            }
          };
          worker.start();    	  
      }
      
      private void btFileActionPerformed(ActionEvent evt) {
          try{
              fc.addChoosableFileFilter(new CapFilter());
              fc.setCurrentDirectory(new File(System.getProperties().getProperty("user.dir")));
              int returnVal = fc.showOpenDialog(JCManager.this);
              if (returnVal == JFileChooser.APPROVE_OPTION) {
                tfFile.setText(fc.getSelectedFile().getAbsolutePath());
              } else {
              }
            }
            catch (Exception ex) {
              ex.printStackTrace();
            }
      }
      
      private JLabel getLbNotYet() {
    	  if(lbNotYet == null) {
    		  lbNotYet = new JLabel();
    		  BorderLayout lbNotYetLayout = new BorderLayout();
    		  lbNotYet.setLayout(lbNotYetLayout);
    		  lbNotYet.setText("Feature not released yet");
    		  lbNotYet.setBounds(306, 114, 120, 14);
    		  lbNotYet.setHorizontalAlignment(SwingConstants.CENTER);
    	  }
    	  return lbNotYet;
      }
      
      private JCheckBoxMenuItem getDebugMenuItem() {
    	  if(debugMenuItem == null) {
    		  debugMenuItem = new JCheckBoxMenuItem();
    		  debugMenuItem.setText("Debug mode");
    		  debugMenuItem.addChangeListener(new ChangeListener() {
    			  public void stateChanged(ChangeEvent evt) {
    				  debugMenuItemStateChanged(evt);
    			  }
    		  });
    	  }
    	  return debugMenuItem;
      }
      
      private void debugMenuItemStateChanged(ChangeEvent evt) {
    	  if (debugMenuItem.isSelected())
    		  Settings.props.setProperty("DebugMode", "1");
    	  else
    		  Settings.props.setProperty("DebugMode", "0");
    		  
      }
      
      private void aboutMenuItemActionPerformed(ActionEvent evt) {
    	  JOptionPane.showMessageDialog(this, "Java Card Manager v. 1.2\n (c) 2010 Stefan Braicu",
                  "About jcManager", JOptionPane.INFORMATION_MESSAGE);
      }

 }
