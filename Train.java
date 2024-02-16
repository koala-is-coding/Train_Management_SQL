import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Train implements ActionListener {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    JFrame F1;
    JPanel D_table;
    JPanel S_c_name_panel;
    JPanel S_c_mobile_panel;
    JPanel S_tic_info_panel;
    JPanel S_tr_info_panel;
    JPanel S_pay_panel;
    JPanel S_ad_panel;
    JPanel Dl_c_name_panel;
    JPanel Dl_c_mobile_panel;
    JPanel Dl_tic_info_panel;
    JPanel Dl_tr_info_panel;
    JPanel Dl_pay_panel;
    JPanel Dl_ad_panel;
    JPanel In_c_name_panel;
    JPanel In_c_mno_panel;
    JPanel In_tic_panel;
    JPanel In_tr_panel;
    JPanel In_pay_panel;
    JPanel In_ad_panel;
    JPanel Up_c_name_panel;
    JPanel Up_c_mno_panel;
    JPanel Up_tic_panel;
    JPanel Up_tr_panel;
    JPanel Up_pay_panel;
    JPanel Up_ad_panel;
    //EXTRA
    JPanel D_sq1_panel;
	  JPanel D_sq2_panel;
	  JPanel D_sq3_panel;
	  JPanel D_eq_panel;
	  JPanel D_o1_panel;
	  JPanel D_o2_panel;
	  JPanel D_sj_panel;




    JButton D_c_name_btn;
    JButton D_c_mobile_btn;
    JButton D_ticket_info_btn;
    JButton D_train_info_btn;
    JButton D_payment;
    JButton D_admin;
    JButton S_c_name;
    JButton S_c_mobile;
    JButton S_ticket_info;
    JButton S_train_info;
    JButton S_payment;
    JButton S_admin;
    JButton Dl_c_name;
    JButton Dl_c_mobile;
    JButton Dl_ticket_info;
    JButton Dl_tr_info;
    JButton Dl_pay;
    JButton Dl_ad;
    JButton In_c_name;
    JButton In_c_mno;
    JButton In_tic;
    JButton In_tr;
    JButton In_pay;
    JButton In_ad;
    JButton Up_c_name;
    JButton Up_c_mno;
    JButton Up_tic;
    JButton Up_tr;
    JButton Up_pay;
    JButton Up_ad;
    //extra
       JButton D_sq1_btn;
	  JButton D_sq2_btn;
	  JButton D_sq3_btn;
	  JButton D_eq_btn;
	  JButton D_o1_btn;
	  JButton D_o2_btn;
	  JButton D_sj_btn;

    JTextArea DisplayArea;
    JButton Enter_c_name;
    JButton c_mobile_Enter;
    JButton tic_info_Enter;
    JButton tr_info_enter;
    JButton pay_Enter;
    JButton ad_enter;
    JButton c_name_enter_dl;
    JButton c_mobile_enter_dl;
    JButton tic_info_enter_dl;
    JButton tr_info_enter_dl;
    JButton pay_enter_dl;
    JButton ad_enter_dl;
    JButton c_name_enter_in;
    JButton c_mno_enter_in;
    JButton tic_enter_in;
    JButton tr_enter_in;
    JButton pay_enter_in;
    JButton ad_enter_in;
    JButton c_name_enter_up;
    JButton c_mno_enter_up;
    JButton tic_enter_up;
    JButton tr_enter_up;
    JButton pay_enter_up;
    JButton ad_enter_up;

    JButton clr;
    JButton Exit;
    JButton rmv_panel;

    JLabel L_c_id;
    JTextField TF_c_id;
    JLabel L_c_id_mno;
    JTextField TF_c_id_mno;
    JLabel L_c_id_tic_info;
    JTextField TF_c_id_tic_info;
    JLabel L_t_id_tr_info;
    JTextField TF_t_id_tr_info;
     JLabel L_c_id_pay;
    JTextField TF_c_id_pay;
    JLabel L_ad_id_admin;
    JTextField TF_ad_id_admin;
    JLabel L_c_id_dl;
    JTextField TF_c_id_dl;
    JLabel L_c_mno_dl;
    JTextField TF_c_mno_dl;
    JLabel L_tic_dl;
    JTextField TF_tic_dl;
    JLabel L_tr_dl;
    JTextField TF_tr_dl;
    JLabel L_pay_dl;
    JTextField TF_pay_dl;
     JLabel L_ad_dl;
    JTextField TF_ad_dl;
    JLabel L_c_name_cus_id_in;
    JTextField TF_c_name_cus_id_in;
        JLabel L_c_name_cus_name_in;
    JTextField TF_c_name_cus_name_in;
    JLabel L_c_mno_cus_id_in;
    JTextField TF_c_mno_cus_id_in;
        JLabel L_c_mno_cus_mno_in;
    JTextField TF_c_mno_cus_mno_in;
    JLabel L_tic_c_id_in;
    JTextField TF_tic_c_id_in;
    JLabel  L_tic_t_id_in;
    JTextField TF_tic_t_id_in;
    JLabel L_tic_num_psngrs_in;
    JTextField TF_tic_num_psngrs_in;
    JLabel L_tic_issue_date_in;
    JTextField TF_tic_issue_date_in;
    JLabel L_tr_t_id_in;
    JTextField TF_tr_t_id_in;
     JLabel L_tr_t_name_in;
    JTextField TF_tr_t_name_in;
    JLabel L_tr_start_in;
    JTextField TF_tr_start_in;
    JLabel L_tr_reach_in;
    JTextField TF_tr_reach_in;
    JLabel L_tr_from_in;
    JTextField TF_tr_from_in;
    JLabel L_tr_to_in;
    JTextField TF_tr_to_in;
    JLabel L_pay_c_id_in;
    JTextField TF_pay_c_id_in;
     JLabel L_pay_method_in;
    JTextField TF_pay_method_in;
     JLabel L_pay_amount_in;
    JTextField TF_pay_amount_in;
    JLabel L_ad_id_in;
    JTextField TF_ad_id_in;
    JLabel L_ad_name_in;
    JTextField TF_ad_name_in;
    JLabel L_ad_role_in;
    JTextField TF_ad_role_in;
    JLabel L_ad_pass_in;
    JTextField TF_ad_pass_in;
    JLabel L_c_name_c_id_up;
    JTextField TF_c_name_c_id_up;
        JLabel L_c_name_c_name_up;
    JTextField TF_c_name_c_name_up;
    JLabel L_c_mno_c_id_up;
    JTextField TF_c_mno_c_id_up;
     JLabel L_c_mno_c_mno_up;
    JTextField TF_c_mno_c_mno_up;
    JLabel L_tic_c_id_up;
    JTextField TF_tic_c_id_up;
      JLabel L_tic_t_id_up;
    JTextField TF_tic_t_id_up;
      JLabel L_tic_psngrs_up;
    JTextField TF_tic_psngrs_up;
      JLabel L_tic_issue_up;
    JTextField TF_tic_issue_up;
    JLabel L_tr_t_id_up;
    JTextField TF_tr_id_up;
    JLabel L_tr_t_name_up;
    JTextField TF_tr_name_up;
    JLabel L_tr_start_up;
    JTextField TF_tr_start_up;
    JLabel L_tr_reach_up;
    JTextField TF_tr_reach_up;
    JLabel L_tr_from_up;
    JTextField TF_tr_from_up;
    JLabel L_tr_to_up;
    JTextField TF_tr_to_up;
    JLabel L_pay_id_up;
     JTextField TF_pay_id_up;
      JLabel L_pay_method_up;
     JTextField TF_pay_method_up;
        JLabel L_pay_amount_up;
     JTextField TF_pay_amount_up;
      JLabel L_ad_id_up;
    JTextField TF_ad_id_up;
    JLabel L_ad_name_up;
    JTextField TF_ad_name_up;
    JLabel L_ad_role_up;
    JTextField TF_ad_role_up;
    JLabel L_ad_pass_up;
    JTextField TF_ad_pass_up;
    
JLabel sq_01;
JLabel sq_02;
JLabel sq_03;
JLabel eq;
JLabel oj_01;
JLabel oj_02;
JLabel sj;




    Train()  throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:xe", "system", "Symphony@1159");
System.out.println("Connection successful");
//object creation
F1 = new JFrame("Main");

D_table = new JPanel();
S_c_name_panel = new JPanel();
S_c_mobile_panel = new JPanel();
S_tic_info_panel = new JPanel();
S_tr_info_panel = new JPanel();
S_pay_panel = new JPanel();
S_ad_panel = new JPanel();
Dl_c_name_panel = new JPanel();
Dl_c_mobile_panel = new JPanel();
Dl_tic_info_panel = new JPanel();
Dl_tr_info_panel = new JPanel();
Dl_pay_panel = new JPanel();
Dl_ad_panel = new JPanel();
In_c_name_panel = new JPanel();
In_c_mno_panel = new JPanel();
In_tic_panel = new JPanel();
In_tr_panel = new JPanel();
In_pay_panel = new JPanel();
In_ad_panel = new JPanel();
Up_c_name_panel = new JPanel();
Up_c_mno_panel= new JPanel();
Up_tic_panel = new JPanel();
Up_tr_panel = new JPanel();
Up_pay_panel = new JPanel();
Up_ad_panel = new JPanel();
//extra
    D_sq1_panel= new JPanel();
	   D_sq2_panel= new JPanel();
	   D_sq3_panel= new JPanel();
	   D_eq_panel= new JPanel();
	   D_o1_panel= new JPanel();
	   D_o2_panel= new JPanel();
	   D_sj_panel= new JPanel();

       sq_01 = new JLabel("Display customers who have paid more than 150 taka to purchase tickets.");
       sq_02 = new JLabel("Display customers who travelled the train with t_id=723.");
       sq_03 = new JLabel("Display customers who have made payment via Nagad and Bkash.");
       eq = new JLabel("Display the details of the customer and their payments.");
       oj_01 = new JLabel("Select ticket holder id, issue date, train id and train name for all trains.");
       oj_02 = new JLabel("Select customer name, customer id, ticket id and issue date for all customers.");
       sj = new JLabel("Display the names of admins and their respective assistants as 'Assistance'");

       Font sq_01_f = new Font("Arial", Font.BOLD,14);
       sq_01.setFont(sq_01_f);
       Font sq_02_f = new Font("Arial", Font.BOLD,14);
       sq_02.setFont(sq_02_f);
          Font sq_03_f = new Font("Arial", Font.BOLD,14);
       sq_03.setFont(sq_03_f);
       Font eq_f = new Font("Arial", Font.BOLD,14);
       eq.setFont(eq_f);
       Font oj1_f = new Font("Arial", Font.BOLD,14);
       oj_01.setFont(oj1_f);
       Font oj2_f = new Font("Arial", Font.BOLD,14);
       oj_02.setFont(oj2_f);
       Font sj_f = new Font("Arial", Font.BOLD,14);
       sj.setFont(sj_f);



D_c_name_btn = new JButton("Display c_name");
D_c_mobile_btn = new JButton("Display c_mobile");
D_ticket_info_btn = new JButton("Display ticket_info");
D_train_info_btn = new JButton("Display train_info");
D_payment = new JButton("Display Payment");
D_admin = new JButton("Display Admin");
S_c_name = new JButton("Search c_name");
S_c_mobile = new JButton("Search mobile no.");
S_ticket_info = new JButton("Search ticket_info");
S_train_info = new JButton("Search train_info");
S_payment = new JButton("Search Payment");
S_admin = new JButton("Search Admin");
Dl_c_name = new JButton("Delete c_name");
Dl_c_mobile = new JButton("Delete c_mobile");
Dl_ticket_info = new JButton("Delete ticket_info");
Dl_tr_info = new JButton("Delete train_info");
Dl_pay = new JButton("Delete Payment");
Dl_ad = new JButton("Delete admin ");
In_c_name = new JButton("Insert c_name");
In_c_mno = new JButton("Insert c_mobile");
In_tic = new JButton("Insert ticket_info");
In_tr = new JButton("Insert train_info");
In_pay = new JButton("Insert Payment");
In_ad = new JButton("Insert Admin");
Up_c_name = new JButton("Update c_name");
Up_c_mno = new JButton("Update c_mobile");
Up_tic = new JButton("Update ticket_info");
Up_tr = new JButton("Update train_info");
Up_pay = new JButton("Update payment");
Up_ad = new JButton("Update admin");
//extra
    D_sq1_btn= new JButton("Display subquery_1");
	   D_sq2_btn= new JButton("Display subquery_2");
	   D_sq3_btn= new JButton("Display subquery_3");
	   D_eq_btn= new JButton("Display equijoin");
	   D_o1_btn= new JButton("Display outerjoin_1");
	   D_o2_btn= new JButton("Display outerjoin_2");
	   D_sj_btn= new JButton("Display selfjoin");

Exit = new JButton("Exit");
DisplayArea = new JTextArea();
clr = new JButton("Clear Display");
rmv_panel = new JButton("Remove Entry Panel");
Enter_c_name = new JButton("Enter");
c_mobile_Enter = new JButton("Enter");
tic_info_Enter = new JButton("Enter");
tr_info_enter = new JButton("Enter");
pay_Enter = new JButton("Enter");
ad_enter = new JButton("Enter");
c_name_enter_dl = new JButton("Enter");
c_mobile_enter_dl = new JButton("Enter");
tic_info_enter_dl = new JButton("Enter");
tr_info_enter_dl = new JButton("Enter");
pay_enter_dl = new JButton("Enter");
ad_enter_dl = new JButton("Enter");
c_name_enter_in = new JButton("Enter");
c_mno_enter_in = new JButton("Enter");
tic_enter_in = new JButton("Enter");
tr_enter_in = new JButton("Enter");
pay_enter_in = new JButton("Enter");
ad_enter_in = new JButton("Enter");
c_name_enter_up = new JButton("Enter");
c_mno_enter_up = new JButton("Enter");
tic_enter_up = new JButton("Enter");
tr_enter_up = new JButton("Enter");
pay_enter_up = new JButton("Enter");
ad_enter_up = new JButton("Enter");


L_c_id = new JLabel("Enter Customer ID");
TF_c_id = new JTextField();
L_c_id_mno = new JLabel("Enter customer ID");
TF_c_id_mno = new JTextField();
L_c_id_tic_info = new JLabel("Enter customer ID");
TF_c_id_tic_info = new JTextField();
L_t_id_tr_info = new JLabel("Enter train ID");
TF_t_id_tr_info= new JTextField();
L_c_id_pay = new JLabel("Enter customer ID");
TF_c_id_pay = new JTextField();
L_ad_id_admin = new JLabel("Enter admin ID");
TF_ad_id_admin = new JTextField();
L_c_id_dl = new JLabel("Enter customer ID");
TF_c_id_dl = new JTextField();
L_c_mno_dl = new JLabel("Enter customer ID");
TF_c_mno_dl = new JTextField();
L_tic_dl = new JLabel("Enter customer ID");
TF_tic_dl= new JTextField();
L_tr_dl = new JLabel("Enter train ID");
TF_tr_dl= new JTextField();
L_pay_dl = new JLabel("Enter customer ID");
TF_pay_dl= new JTextField();
L_ad_dl = new JLabel("Enter admin ID");
TF_ad_dl= new JTextField();
//For data insertion
L_c_name_cus_id_in = new JLabel("Enter new customer ID");
TF_c_name_cus_id_in = new JTextField();
L_c_name_cus_name_in = new JLabel("Enter new customer name");
TF_c_name_cus_name_in = new JTextField();

L_c_mno_cus_id_in = new JLabel("Enter Customer ID");
TF_c_mno_cus_id_in = new JTextField();
L_c_mno_cus_mno_in = new JLabel("Enter mobile number");
TF_c_mno_cus_mno_in = new JTextField();

L_tic_c_id_in = new JLabel("Enter customer ID");
TF_tic_c_id_in = new JTextField();
L_tic_t_id_in = new JLabel("Enter train ID");
TF_tic_t_id_in = new JTextField();
L_tic_num_psngrs_in = new JLabel("Enter number of passengers");
TF_tic_num_psngrs_in = new JTextField();
L_tic_issue_date_in = new JLabel("Enter issue date");
TF_tic_issue_date_in = new JTextField();

L_tr_t_id_in = new JLabel("Enter train ID");
TF_tr_t_id_in = new JTextField();
L_tr_t_name_in = new JLabel("Enter train name");
TF_tr_t_name_in = new JTextField();
L_tr_start_in = new JLabel("Enter Starting time");
TF_tr_start_in = new JTextField();
L_tr_reach_in = new JLabel("Enter Reach time");
TF_tr_reach_in = new JTextField();
L_tr_from_in = new JLabel("Enter From location");
TF_tr_from_in= new JTextField();
L_tr_to_in = new JLabel("Enter to location");
TF_tr_to_in = new JTextField();

L_pay_c_id_in = new JLabel("Enter Customer ID");
TF_pay_c_id_in = new JTextField();
L_pay_method_in = new JLabel("Enter payment method");
TF_pay_method_in = new JTextField("Bkash/Nagad/Cash");
L_pay_amount_in = new JLabel("Enter amount");
TF_pay_amount_in = new JTextField();

L_ad_id_in = new JLabel("Enter admin ID");
TF_ad_id_in = new JTextField();
L_ad_name_in = new JLabel("Enter admin name");
TF_ad_name_in = new JTextField();
L_ad_role_in = new JLabel("Enter admin role");
TF_ad_role_in = new JTextField();
L_ad_pass_in = new JLabel("Enter admin assistant ID");
TF_ad_pass_in = new JTextField();
//for data updation
L_c_name_c_id_up = new JLabel("Enter customer ID");
TF_c_name_c_id_up = new JTextField();
L_c_name_c_name_up = new JLabel("Enter updated name");
TF_c_name_c_name_up = new JTextField();

L_c_mno_c_id_up = new JLabel("Enter customer ID");
TF_c_mno_c_id_up = new JTextField();
L_c_mno_c_mno_up = new JLabel("Enter updated mobile");
TF_c_mno_c_mno_up = new JTextField();

L_tic_c_id_up = new JLabel("Enter customer ID");
TF_tic_c_id_up = new JTextField();
L_tic_t_id_up = new JLabel("Enter updated train ID");
TF_tic_t_id_up = new JTextField();
L_tic_psngrs_up = new JLabel("Enter updated number of passengers ");
TF_tic_psngrs_up = new JTextField();
L_tic_issue_up = new JLabel("Enter updated issue date");
TF_tic_issue_up = new JTextField();

L_tr_t_id_up = new JLabel("Enter train ID");
TF_tr_id_up = new JTextField();
L_tr_t_name_up = new JLabel("Enter updated train name");
TF_tr_name_up = new JTextField();
L_tr_start_up = new JLabel("Enter updated start time");
TF_tr_start_up = new JTextField();
L_tr_reach_up = new JLabel("Enter updated reach time");
TF_tr_reach_up = new JTextField();
L_tr_from_up = new JLabel("Enter updated from location");
TF_tr_from_up = new JTextField();
L_tr_to_up = new JLabel("Enter updated to location");
TF_tr_to_up = new JTextField();
L_pay_id_up = new JLabel("Enter customer ID");
TF_pay_id_up = new JTextField();
L_pay_method_up = new JLabel("Enter updated payment method");
TF_pay_method_up = new JTextField("Bkash/Nagad/Cash");
L_pay_amount_up = new JLabel("Enter updated amount");
TF_pay_amount_up = new JTextField();
L_ad_id_up = new JLabel("Enter admin ID");
TF_ad_id_up = new JTextField();
L_ad_name_up = new JLabel("Enter  updated admin name");
TF_ad_name_up = new JTextField();
L_ad_role_up = new JLabel("Enter updated admin role");
TF_ad_role_up = new JTextField();
L_ad_pass_up = new JLabel("Enter updated  assistant ID");
TF_ad_pass_up = new JTextField();



//setbounds
D_table.setBounds(450, 520, 700, 400);
DisplayArea.setBounds(20, 20, 660, 360);
S_c_name_panel.setBounds(500,100,650,400);
S_tic_info_panel.setBounds(500, 100, 650,400);
S_c_mobile_panel.setBounds(500, 100, 650,400);
S_tr_info_panel.setBounds(500, 100, 650, 400);
S_pay_panel.setBounds(500, 100, 650, 400);
S_ad_panel.setBounds(500, 100, 650, 400);
Dl_c_name_panel.setBounds(500, 100, 650, 400);
Dl_c_mobile_panel.setBounds(500, 100, 650, 400);
Dl_tic_info_panel.setBounds(500, 100, 650, 400);
Dl_tr_info_panel.setBounds(500, 100, 650, 400);
Dl_pay_panel.setBounds(500, 100, 650, 400);
Dl_ad_panel.setBounds(500, 100, 650, 400);
In_c_name_panel.setBounds(500, 100, 650,400);
In_c_mno_panel.setBounds(500, 100, 650, 400);
In_tic_panel.setBounds(500, 100, 650, 400);
In_tr_panel.setBounds(500, 100, 650, 400);
In_pay_panel.setBounds(500, 100, 650, 400);
In_ad_panel.setBounds(500, 100, 650, 400);
Up_c_name_panel.setBounds(500, 100, 650, 400);
Up_c_mno_panel.setBounds(500, 100, 650, 400);
Up_tic_panel.setBounds(500, 100, 650, 400);
Up_tr_panel.setBounds(500, 100, 650, 400);
Up_pay_panel.setBounds(500, 100, 650, 400);
Up_ad_panel.setBounds(500, 100, 650, 400);
//extra
    D_sq1_panel.setBounds(500, 300, 650, 120);
	  D_sq2_panel.setBounds(500, 300, 650, 120);
	  D_sq3_panel.setBounds(500, 300, 650, 120);
	  D_eq_panel.setBounds(500, 300, 650, 120);
	  D_o1_panel.setBounds(500, 300, 650, 120);
	  D_o2_panel.setBounds(500, 300, 650, 120);
	  D_sj_panel.setBounds(500, 300, 650, 120);


D_c_name_btn.setBounds(30,30, 150, 40);
D_c_mobile_btn.setBounds(30, 80,150,40 );
D_ticket_info_btn.setBounds(30,130,150,40);
D_train_info_btn.setBounds(30,180,150,40);
D_payment.setBounds(30, 230, 150, 40);
D_admin.setBounds(30, 280, 150, 40);
S_c_name.setBounds(30, 330, 150, 40);
S_c_mobile.setBounds(30, 380, 150, 40);
S_ticket_info.setBounds(30, 430, 150, 40);
S_train_info.setBounds(30, 480, 150, 40);
S_payment.setBounds(30, 530, 150, 40);
S_admin.setBounds(30, 580, 150, 40);
Dl_c_name.setBounds(30, 630, 150, 40);
Dl_c_mobile.setBounds(30, 680, 150, 40);
Dl_ticket_info.setBounds(30, 730, 150, 40);
Dl_tr_info.setBounds(30, 780, 150, 40);
Dl_pay.setBounds(30, 830, 150, 40);
Dl_ad.setBounds(30, 880, 150, 40);
In_c_name.setBounds(200, 30, 150, 40);
In_c_mno.setBounds(200, 80, 150, 40);
In_tic.setBounds(200, 130, 150, 40);
In_tr.setBounds(200, 180, 150, 40);
In_pay.setBounds(200, 230, 150, 40);
In_ad.setBounds(200, 280, 150, 40);
Up_c_name.setBounds(200, 330, 150, 40);
Up_c_mno.setBounds(200, 380, 150, 40);
Up_tic.setBounds(200, 430, 150, 40);
Up_tr.setBounds(200, 480, 150, 40);
Up_pay.setBounds(200, 530, 150, 40);
Up_ad.setBounds(200, 580, 150, 40);
//extra
   D_sq1_btn.setBounds(200, 630, 150, 40);
	 D_sq2_btn.setBounds(200, 680, 150, 40);
	 D_sq3_btn.setBounds(200, 730, 150, 40);
	 D_eq_btn.setBounds(200, 780, 150, 40);
	 D_o1_btn.setBounds(200, 830, 150, 40);
	 D_o2_btn.setBounds(200, 880, 150, 40);
	 D_sj_btn.setBounds(370, 30, 150, 40);

L_c_id.setBounds(50, 60, 200, 40);
TF_c_id.setBounds(200, 60, 250, 40);
L_c_id_mno.setBounds(50, 60, 200, 40);
TF_c_id_mno.setBounds(200, 60, 250, 40);
L_c_id_tic_info.setBounds(50, 60, 200, 40);
TF_c_id_tic_info.setBounds(200, 60, 200, 40);
L_t_id_tr_info.setBounds(50, 60, 200, 40);
TF_t_id_tr_info.setBounds(200, 60, 250, 40);
L_c_id_pay.setBounds(50, 60, 200, 40);
TF_c_id_pay.setBounds(200, 60, 250, 40);
L_ad_id_admin.setBounds(50, 60, 200, 40);
TF_ad_id_admin.setBounds(200,60,200,40);
L_c_id_dl.setBounds(50, 60, 200, 40);
TF_c_id_dl.setBounds(200, 60, 200, 40);
L_c_mno_dl.setBounds(50, 60, 200, 40);
TF_c_mno_dl.setBounds(200, 60, 200, 40);
L_tic_dl.setBounds(50, 60, 200, 40);
TF_tic_dl.setBounds(200, 60, 200, 40);
L_tr_dl.setBounds(50, 60,200, 40);
TF_tr_dl.setBounds(200, 60, 200, 40);
L_pay_dl.setBounds(50, 60, 200, 40);
TF_pay_dl.setBounds(200, 60, 200, 40);
L_ad_dl.setBounds(50, 60, 200, 40);
TF_ad_dl.setBounds(200, 60, 200, 40);
//for c_name
L_c_name_cus_id_in.setBounds(40, 20, 150, 40);
TF_c_name_cus_id_in.setBounds(210, 20, 150, 40);
L_c_name_cus_name_in.setBounds(40, 70, 150, 40);
TF_c_name_cus_name_in.setBounds(210, 70, 150, 40);
//for c_mobile
L_c_mno_cus_id_in.setBounds(40, 20, 150, 40);
TF_c_mno_cus_id_in.setBounds(210, 20, 150, 40);
L_c_mno_cus_mno_in.setBounds(40, 70, 150, 40);
TF_c_mno_cus_mno_in.setBounds(210, 70, 150, 40);
//for ticket_info
L_tic_c_id_in.setBounds(40, 20, 150, 40);
TF_tic_c_id_in.setBounds(210, 20, 150, 40);
L_tic_t_id_in.setBounds(40, 70, 200, 40);
TF_tic_t_id_in.setBounds(210, 70, 150, 40);
L_tic_num_psngrs_in.setBounds(40, 120, 200, 40);
TF_tic_num_psngrs_in.setBounds(210, 120, 150, 40);
L_tic_issue_date_in.setBounds(40, 170, 150, 40);
TF_tic_issue_date_in.setBounds(210, 170, 150, 40);
//for train_info
L_tr_t_id_in.setBounds(40, 20, 150, 40);
TF_tr_t_id_in.setBounds(210, 20, 150, 40);
L_tr_t_name_in.setBounds(40, 70, 200, 40);
TF_tr_t_name_in.setBounds(210, 70, 150, 40);
L_tr_start_in.setBounds(40, 120, 200, 40);
TF_tr_start_in.setBounds(210, 120, 150, 40);
L_tr_reach_in.setBounds(40, 170, 150, 40);
TF_tr_reach_in.setBounds(210, 170, 150, 40);
L_tr_from_in.setBounds(40, 220, 200, 40);
TF_tr_from_in.setBounds(210, 220, 150, 40);
L_tr_to_in.setBounds(40, 270, 150, 40);
TF_tr_to_in.setBounds(210, 270, 150, 40);
//for payment
L_pay_c_id_in.setBounds(40, 20, 150, 40);
TF_pay_c_id_in.setBounds(210, 20, 150, 40);
L_pay_method_in.setBounds(40, 70, 200, 40);
TF_pay_method_in.setBounds(210, 70, 150, 40);
L_pay_amount_in.setBounds(40, 120, 200, 40);
TF_pay_amount_in.setBounds(210, 120, 150, 40);
//for admin
L_ad_id_in.setBounds(40, 20, 150, 40);
TF_ad_id_in.setBounds(210, 20, 150, 40);
L_ad_name_in.setBounds(40, 70, 200, 40);
TF_ad_name_in.setBounds(210, 70, 150, 40);
L_ad_role_in.setBounds(40, 120, 200, 40);
TF_ad_role_in.setBounds(210, 120, 150, 40);
L_ad_pass_in.setBounds(40, 170, 200, 40);
TF_ad_pass_in.setBounds(210, 170, 150, 40);
//for c_name
L_c_name_c_id_up.setBounds(40, 20, 150, 40);
TF_c_name_c_id_up.setBounds(210, 20, 150, 40);
L_c_name_c_name_up.setBounds(40, 70, 200, 40);
TF_c_name_c_name_up.setBounds(210, 70, 150, 40);
//for c_mobile
L_c_mno_c_id_up.setBounds(40, 20, 150, 40);
TF_c_mno_c_id_up.setBounds(210, 20, 150, 40);
L_c_mno_c_mno_up.setBounds(40, 70, 200, 40);
TF_c_mno_c_mno_up.setBounds(210, 70, 150, 40);
//for ticket_info
L_tic_c_id_up.setBounds(40, 20, 150, 40);
TF_tic_c_id_up.setBounds(280, 20, 150, 40);
L_tic_t_id_up.setBounds(40, 70, 200, 40);
TF_tic_t_id_up.setBounds(280, 70, 150, 40);
L_tic_psngrs_up.setBounds(40, 120, 250, 40);
TF_tic_psngrs_up.setBounds(280, 120, 150, 40);
L_tic_issue_up.setBounds(40, 170, 150, 40);
TF_tic_issue_up.setBounds(280, 170, 150, 40);
//for train_info
L_tr_t_id_up.setBounds(40, 20, 150, 40);
TF_tr_id_up.setBounds(210, 20, 150, 40);
L_tr_t_name_up.setBounds(40, 70, 200, 40);
TF_tr_name_up.setBounds(210, 70, 150, 40);
L_tr_start_up.setBounds(40, 120, 200, 40);
TF_tr_start_up.setBounds(210, 120, 150, 40);
L_tr_reach_up.setBounds(40, 170, 150, 40);
TF_tr_reach_up.setBounds(210, 170, 150, 40);
L_tr_from_up.setBounds(40, 220, 200, 40);
TF_tr_from_up.setBounds(210, 220, 150, 40);
L_tr_to_up.setBounds(40, 270, 150, 40);
TF_tr_to_up.setBounds(210, 270, 150, 40);
//for payment
L_pay_id_up.setBounds(40, 20, 150, 40);
TF_pay_id_up.setBounds(250, 20, 150, 40);
L_pay_method_up.setBounds(40, 70, 200, 40);
TF_pay_method_up.setBounds(250, 70, 150, 40);
L_pay_amount_up.setBounds(40, 120, 200, 40);
TF_pay_amount_up.setBounds(250, 120, 150, 40);
//for admin
L_ad_id_up.setBounds(40, 20, 150, 40);
TF_ad_id_up.setBounds(210, 20, 150, 40);
L_ad_name_up.setBounds(40, 70, 200, 40);
TF_ad_name_up.setBounds(210, 70, 150, 40);
L_ad_role_up.setBounds(40, 120, 200, 40);
TF_ad_role_up.setBounds(210, 120, 150, 40);
L_ad_pass_up.setBounds(40, 170, 200, 40);
TF_ad_pass_up.setBounds(210, 170, 150, 40);


c_mobile_Enter.setBounds(350, 130, 200, 40);
Enter_c_name.setBounds(350, 130, 200, 40);
tic_info_Enter.setBounds(350, 130, 100, 40);
tr_info_enter.setBounds(350, 130, 100, 40);
pay_Enter.setBounds(350, 130, 100, 40);
ad_enter.setBounds(350, 130, 100, 40);
c_name_enter_dl.setBounds(350, 130, 100, 40);
c_mobile_enter_dl.setBounds(350, 130, 100, 40);
tic_info_enter_dl.setBounds(350, 130, 100, 40);
tr_info_enter_dl.setBounds(350, 130, 100, 40);
pay_enter_dl.setBounds(350, 130, 100, 40);
ad_enter_dl.setBounds(350, 130, 100, 40);
c_name_enter_in.setBounds(300, 150, 100, 40);
c_mno_enter_in.setBounds(300, 150, 100, 40);
tic_enter_in.setBounds(300,220,100,40);
tr_enter_in.setBounds(350, 330, 100, 40);
pay_enter_in.setBounds(350, 180, 100, 40);
ad_enter_in.setBounds(350, 220, 100, 40);
c_name_enter_up.setBounds(350, 120, 100, 40);
c_mno_enter_up.setBounds(350, 120, 100, 40);
tic_enter_up.setBounds(350, 210, 100, 40);
tr_enter_up.setBounds(350, 320, 100, 40);
pay_enter_up.setBounds(350, 180, 100, 40);
ad_enter_up.setBounds(350, 225, 100, 40);

Exit.setBounds(1000,30,100,40);
clr.setBounds(820, 30, 150, 40);
rmv_panel.setBounds(640, 30, 150, 40);

//for joining and subqueries
sq_01.setBounds(30, 30, 550, 50);
sq_02.setBounds(30, 30, 550, 50);
sq_03.setBounds(30, 30, 550, 50);
eq.setBounds(30, 30, 550, 50);
oj_01.setBounds(30, 30, 550, 50);
oj_02.setBounds(30, 30, 550, 50);
sj.setBounds(30,30, 550, 50);



//add on container
F1.add(D_table);
F1.add(S_c_name_panel);
F1.add(S_c_mobile_panel);
F1.add(S_tic_info_panel);
F1.add(S_tr_info_panel);
F1.add(S_pay_panel);
F1.add(S_ad_panel);
F1.add(Dl_c_name_panel);
F1.add(Dl_c_mobile_panel);
F1.add(Dl_tic_info_panel);
F1.add(Dl_tr_info_panel);
F1.add(Dl_pay_panel);
F1.add(Dl_ad_panel);
F1.add(In_c_name_panel);
F1.add(In_c_mno_panel);
F1.add(In_tic_panel);
F1.add(In_tr_panel);
F1.add(In_pay_panel);
F1.add(In_ad_panel);
F1.add(Up_c_name_panel);
F1.add(Up_c_mno_panel);
F1.add(Up_tic_panel);
F1.add(Up_tr_panel);
F1.add(Up_pay_panel);
F1.add(Up_ad_panel);
//extra
    F1.add(D_sq1_panel);
	   F1.add(D_sq2_panel);
	   F1.add(D_sq3_panel);
	   F1.add(D_eq_panel);
	   F1.add(D_o1_panel);
	   F1.add(D_o2_panel);
	   F1.add(D_sj_panel);


F1.add(D_c_name_btn);
F1.add(D_c_mobile_btn);
F1.add(D_ticket_info_btn);
F1.add(D_train_info_btn);
F1.add(D_payment);
F1.add(D_admin);
F1.add(S_c_name);
F1.add(S_c_mobile);
F1.add(S_ticket_info);
F1.add(S_train_info);
F1.add(S_payment);
F1.add(S_admin);
F1.add(Dl_c_name);
F1.add(Dl_c_mobile);
F1.add(Dl_ticket_info);
F1.add(Dl_tr_info);
F1.add(Dl_pay);
F1.add(Dl_ad);
F1.add(In_c_name);
F1.add(In_c_mno);
F1.add(In_tic);
F1.add(In_tr);
F1.add(In_pay);
F1.add(In_ad);
F1.add(Up_c_name);
F1.add(Up_c_mno);
F1.add(Up_tic);
F1.add(Up_tr);
F1.add(Up_pay);
F1.add(Up_ad);
//extra
     F1.add(D_sq1_btn);
	   F1.add(D_sq2_btn);
	   F1.add(D_sq3_btn);
	   F1.add(D_eq_btn);
	   F1.add(D_o1_btn);
	   F1.add(D_o2_btn);
	   F1.add(D_sj_btn);


F1.add(Exit);
F1.add(clr);
F1.add(rmv_panel);
D_table.add(DisplayArea);


S_c_name_panel.add(L_c_id);
S_c_name_panel.add(TF_c_id);
S_c_name_panel.add(Enter_c_name);
S_c_mobile_panel.add(L_c_id_mno);
S_c_mobile_panel.add(TF_c_id_mno);
S_c_mobile_panel.add(c_mobile_Enter);
S_tic_info_panel.add(L_c_id_tic_info);
S_tic_info_panel.add(TF_c_id_tic_info);
S_tic_info_panel.add(tic_info_Enter);
S_tr_info_panel.add(L_t_id_tr_info);
S_tr_info_panel.add(TF_t_id_tr_info);
S_tr_info_panel.add(tr_info_enter);
S_pay_panel.add(L_c_id_pay);
S_pay_panel.add(TF_c_id_pay);
S_pay_panel.add(pay_Enter);
S_ad_panel.add(L_ad_id_admin);
S_ad_panel.add(TF_ad_id_admin);
S_ad_panel.add(ad_enter);
Dl_c_name_panel.add(L_c_id_dl);
Dl_c_name_panel.add(TF_c_id_dl);
Dl_c_name_panel.add(c_name_enter_dl);
Dl_c_mobile_panel.add(L_c_mno_dl);
Dl_c_mobile_panel.add(TF_c_mno_dl);
Dl_c_mobile_panel.add(c_mobile_enter_dl);
Dl_tic_info_panel.add(L_tic_dl);
Dl_tic_info_panel.add(TF_tic_dl);
Dl_tic_info_panel.add(tic_info_enter_dl);
Dl_tr_info_panel.add(L_tr_dl);
Dl_tr_info_panel.add(TF_tr_dl);
Dl_tr_info_panel.add(tr_info_enter_dl);
Dl_pay_panel.add(L_pay_dl);
Dl_pay_panel.add(TF_pay_dl);
Dl_pay_panel.add(pay_enter_dl);
Dl_ad_panel.add(L_ad_dl);
Dl_ad_panel.add(TF_ad_dl);
Dl_ad_panel.add(ad_enter_dl);
In_c_name_panel.add(L_c_name_cus_id_in);
In_c_name_panel.add(TF_c_name_cus_id_in);
In_c_name_panel.add(L_c_name_cus_name_in);
In_c_name_panel.add(TF_c_name_cus_name_in);
In_c_name_panel.add(c_name_enter_in);
In_c_mno_panel.add(L_c_mno_cus_id_in);
In_c_mno_panel.add(TF_c_mno_cus_id_in);
In_c_mno_panel.add(L_c_mno_cus_mno_in);
In_c_mno_panel.add(TF_c_mno_cus_mno_in);
In_c_mno_panel.add(c_mno_enter_in);
In_tic_panel.add(L_tic_c_id_in);
In_tic_panel.add(L_tic_t_id_in);
In_tic_panel.add(L_tic_num_psngrs_in);
In_tic_panel.add(L_tic_issue_date_in);
In_tic_panel.add(TF_tic_c_id_in);
In_tic_panel.add(TF_tic_t_id_in);
In_tic_panel.add(TF_tic_num_psngrs_in);
In_tic_panel.add(TF_tic_issue_date_in);
In_tic_panel.add(tic_enter_in);
In_tr_panel.add(L_tr_t_id_in);
In_tr_panel.add(TF_tr_t_id_in);
In_tr_panel.add(L_tr_t_name_in);
In_tr_panel.add(TF_tr_t_name_in);
In_tr_panel.add(L_tr_start_in);
In_tr_panel.add(TF_tr_start_in);
In_tr_panel.add(L_tr_reach_in);
In_tr_panel.add(TF_tr_reach_in);
In_tr_panel.add(L_tr_from_in);
In_tr_panel.add(TF_tr_from_in);
In_tr_panel.add(L_tr_to_in);
In_tr_panel.add(TF_tr_to_in);
In_tr_panel.add(tr_enter_in);
In_pay_panel.add(L_pay_c_id_in);
In_pay_panel.add(TF_pay_c_id_in);
In_pay_panel.add(L_pay_method_in);
In_pay_panel.add(TF_pay_method_in);
In_pay_panel.add(L_pay_amount_in);
In_pay_panel.add(TF_pay_amount_in);
In_pay_panel.add(pay_enter_in);
In_ad_panel.add(L_ad_id_in);
In_ad_panel.add(TF_ad_id_in);
In_ad_panel.add(L_ad_name_in);
In_ad_panel.add(TF_ad_name_in);
In_ad_panel.add(L_ad_role_in);
In_ad_panel.add(TF_ad_role_in);
In_ad_panel.add(L_ad_pass_in);
In_ad_panel.add(TF_ad_pass_in);
In_ad_panel.add(ad_enter_in);
Up_c_name_panel.add(L_c_name_c_id_up);
Up_c_name_panel.add(TF_c_name_c_id_up);
Up_c_name_panel.add(L_c_name_c_name_up);
Up_c_name_panel.add(TF_c_name_c_name_up);
Up_c_name_panel.add(c_name_enter_up);
Up_c_mno_panel.add(L_c_mno_c_id_up);
Up_c_mno_panel.add(TF_c_mno_c_id_up);
Up_c_mno_panel.add(L_c_mno_c_mno_up);
Up_c_mno_panel.add(TF_c_mno_c_mno_up);
Up_c_mno_panel.add(c_mno_enter_up);
Up_tic_panel.add(L_tic_c_id_up);
Up_tic_panel.add(TF_tic_c_id_up);
Up_tic_panel.add(L_tic_t_id_up);
Up_tic_panel.add(TF_tic_t_id_up);
Up_tic_panel.add(L_tic_psngrs_up);
Up_tic_panel.add(TF_tic_psngrs_up);
Up_tic_panel.add(L_tic_issue_up);
Up_tic_panel.add(TF_tic_issue_up);
Up_tic_panel.add(tic_enter_up);
Up_tr_panel.add(L_tr_t_id_up);
Up_tr_panel.add(TF_tr_id_up);
Up_tr_panel.add(L_tr_t_name_up);
Up_tr_panel.add(TF_tr_name_up);
Up_tr_panel.add(L_tr_start_up);
Up_tr_panel.add(TF_tr_start_up);
Up_tr_panel.add(L_tr_reach_up);
Up_tr_panel.add(TF_tr_reach_up);
Up_tr_panel.add(L_tr_from_up);
Up_tr_panel.add(TF_tr_from_up);
Up_tr_panel.add(L_tr_to_up);
Up_tr_panel.add(TF_tr_to_up);
Up_tr_panel.add(tr_enter_up);
Up_pay_panel.add(L_pay_id_up);
Up_pay_panel.add(TF_pay_id_up);
Up_pay_panel.add(L_pay_method_up);
Up_pay_panel.add(TF_pay_method_up);
Up_pay_panel.add(L_pay_amount_up);
Up_pay_panel.add(TF_pay_amount_up);
Up_pay_panel.add(pay_enter_up);
Up_ad_panel.add(L_ad_id_up);
Up_ad_panel.add(TF_ad_id_up);
Up_ad_panel.add(L_ad_name_up);
Up_ad_panel.add(TF_ad_name_up);
Up_ad_panel.add(L_ad_role_up);
Up_ad_panel.add(TF_ad_role_up);
Up_ad_panel.add(L_ad_pass_up);
Up_ad_panel.add(TF_ad_pass_up);
Up_ad_panel.add(ad_enter_up);

D_sq1_panel.add(sq_01);
D_sq2_panel.add(sq_02);
D_sq3_panel.add(sq_03);
D_eq_panel.add(eq);
D_o1_panel.add(oj_01);
D_o2_panel.add(oj_02);
D_sj_panel.add(sj);





//adding actionlistener
Exit.addActionListener(this);
D_c_name_btn.addActionListener(this);
clr.addActionListener(this);
rmv_panel.addActionListener(this);
D_c_mobile_btn.addActionListener(this);
D_ticket_info_btn.addActionListener(this);
D_train_info_btn.addActionListener(this);
D_payment.addActionListener(this);
D_admin.addActionListener(this);
S_c_name.addActionListener(this);
S_c_mobile.addActionListener(this);
S_ticket_info.addActionListener(this);
S_train_info.addActionListener(this);
S_payment.addActionListener(this);
S_admin.addActionListener(this);
Dl_c_name.addActionListener(this);
Dl_c_mobile.addActionListener(this);
Dl_ticket_info.addActionListener(this);
Dl_tr_info.addActionListener(this);
Dl_pay.addActionListener(this);
Dl_ad.addActionListener(this);
In_c_name.addActionListener(this);
In_c_mno.addActionListener(this);
In_tic.addActionListener(this);
In_tr.addActionListener(this);
In_pay.addActionListener(this);
In_ad.addActionListener(this);
Up_c_name.addActionListener(this);
Up_c_mno.addActionListener(this);
Up_tic.addActionListener(this);
Up_tr.addActionListener(this);
Up_pay.addActionListener(this);
Up_ad.addActionListener(this);
//extra
D_sq1_btn.addActionListener(this);
 D_sq2_btn.addActionListener(this);
 D_sq3_btn.addActionListener(this);
 D_eq_btn.addActionListener(this);
 D_o1_btn.addActionListener(this);
 D_o2_btn.addActionListener(this);
 D_sj_btn.addActionListener(this);
 



Enter_c_name.addActionListener(this);
c_mobile_Enter.addActionListener(this);
tic_info_Enter.addActionListener(this);
tr_info_enter.addActionListener(this);
pay_Enter.addActionListener(this);
ad_enter.addActionListener(this);
c_name_enter_dl.addActionListener(this);
c_mobile_enter_dl.addActionListener(this);
tic_info_enter_dl.addActionListener(this);
tr_info_enter_dl.addActionListener(this);
pay_enter_dl.addActionListener(this);
ad_enter_dl.addActionListener(this);
c_name_enter_in.addActionListener(this);
c_mno_enter_in.addActionListener(this);
tic_enter_in.addActionListener(this);
tr_enter_in.addActionListener(this);
pay_enter_in.addActionListener(this);
ad_enter_in.addActionListener(this);
c_name_enter_up.addActionListener(this);
c_mno_enter_up.addActionListener(this);
tic_enter_up.addActionListener(this);
tr_enter_up.addActionListener(this);
pay_enter_up.addActionListener(this);
ad_enter_up.addActionListener(this);


//for panel setup
S_c_name_panel.setVisible(false);
S_c_mobile_panel.setVisible(false);
S_tic_info_panel.setVisible(false);
S_tr_info_panel.setVisible(false);
S_pay_panel.setVisible(false);
S_ad_panel.setVisible(false);
Dl_c_name_panel.setVisible(false);
Dl_c_mobile_panel.setVisible(false);
Dl_tic_info_panel.setVisible(false);
Dl_tr_info_panel.setVisible(false);
Dl_pay_panel.setVisible(false);
Dl_ad_panel.setVisible(false);
In_c_name_panel.setVisible(false);
In_c_mno_panel.setVisible(false);
In_tic_panel.setVisible(false);
In_tr_panel.setVisible(false);
In_pay_panel.setVisible(false);
In_ad_panel.setVisible(false);
Up_c_name_panel.setVisible(false);
Up_c_mno_panel.setVisible(false);
Up_tic_panel.setVisible(false);
Up_tr_panel.setVisible(false);
Up_pay_panel.setVisible(false);
Up_ad_panel.setVisible(false);
//extra
 D_sq1_panel.setVisible(false);
	   D_sq2_panel.setVisible(false);
	   D_sq3_panel.setVisible(false);
	   D_eq_panel.setVisible(false);
	   D_o1_panel.setVisible(false);
	   D_o2_panel.setVisible(false);
	   D_sj_panel.setVisible(false);

DisplayArea.setEditable(false);
D_table.setBackground(Color.lightGray);
D_table.setLayout(null);
S_c_name_panel.setLayout(null);
S_c_name_panel.setBackground(Color.LIGHT_GRAY);
S_c_mobile_panel.setLayout(null);
S_c_mobile_panel.setBackground(Color.LIGHT_GRAY);
S_tic_info_panel.setLayout(null);
S_tic_info_panel.setBackground(Color.LIGHT_GRAY);
S_tr_info_panel.setLayout(null);
S_tr_info_panel.setBackground(Color.LIGHT_GRAY);
S_pay_panel.setLayout(null);
S_pay_panel.setBackground(Color.LIGHT_GRAY);
S_ad_panel.setLayout(null);
S_ad_panel.setBackground(Color.LIGHT_GRAY);
Dl_c_name_panel.setLayout(null);
Dl_c_name_panel.setBackground(Color.LIGHT_GRAY);
Dl_c_mobile_panel.setLayout(null);
Dl_c_mobile_panel.setBackground(Color.LIGHT_GRAY);
Dl_tic_info_panel.setLayout(null);
Dl_tic_info_panel.setBackground(Color.LIGHT_GRAY);
Dl_tr_info_panel.setLayout(null);
Dl_tr_info_panel.setBackground(Color.LIGHT_GRAY);
Dl_pay_panel.setLayout(null);
Dl_pay_panel.setBackground(Color.LIGHT_GRAY);
Dl_ad_panel.setLayout(null);
Dl_ad_panel.setBackground(Color.LIGHT_GRAY);
In_c_name_panel.setLayout(null);
In_c_name_panel.setBackground(Color.LIGHT_GRAY);
In_c_mno_panel.setLayout(null);
In_c_mno_panel.setBackground(Color.LIGHT_GRAY);
In_tic_panel.setLayout(null);
In_tic_panel.setBackground(Color.LIGHT_GRAY);
In_tr_panel.setLayout(null);
In_tr_panel.setBackground(Color.LIGHT_GRAY);
In_pay_panel.setLayout(null);
In_pay_panel.setBackground(Color.LIGHT_GRAY);
In_ad_panel.setLayout(null);
In_ad_panel.setBackground(Color.LIGHT_GRAY);
Up_c_name_panel.setLayout(null);
Up_c_name_panel.setBackground(Color.LIGHT_GRAY);
Up_c_mno_panel.setLayout(null);
Up_c_mno_panel.setBackground(Color.LIGHT_GRAY);
Up_tic_panel.setLayout(null);
Up_tic_panel.setBackground(Color.LIGHT_GRAY);
Up_tr_panel.setLayout(null);
Up_tr_panel.setBackground(Color.LIGHT_GRAY);
Up_pay_panel.setLayout(null);
Up_pay_panel.setBackground(Color.LIGHT_GRAY);
Up_ad_panel.setLayout(null);
Up_ad_panel.setBackground(Color.LIGHT_GRAY);
//extra
     D_sq1_panel.setLayout(null);
       D_sq1_panel.setBackground(Color.LIGHT_GRAY);
	   D_sq2_panel.setLayout(null);
	   D_sq2_panel.setBackground(Color.LIGHT_GRAY);
	   D_sq3_panel.setLayout(null);
	   D_sq3_panel.setBackground(Color.LIGHT_GRAY);
	   D_eq_panel.setLayout(null);
	   D_eq_panel.setBackground(Color.LIGHT_GRAY);
	   D_o1_panel.setLayout(null);
	   D_o1_panel.setBackground(Color.LIGHT_GRAY);
	   D_o2_panel.setLayout(null);
	   D_o2_panel.setBackground(Color.LIGHT_GRAY);
	   D_sj_panel.setLayout(null);
	   D_sj_panel.setBackground(Color.LIGHT_GRAY);

//for frame setup
F1.getContentPane().setBackground(new Color(200,150,100));
F1.setSize(1200, 1000);
F1.setLayout(null);
F1.setLocationRelativeTo(null);
F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
F1.setVisible(true);



    }


    public void actionPerformed(ActionEvent e){
if(e.getSource()==Exit){System.exit(0);}
else if(e.getSource()==rmv_panel){S_c_name_panel.setVisible(false);S_c_mobile_panel.setVisible(false);S_tic_info_panel.setVisible(false);S_tr_info_panel.setVisible(false);S_pay_panel.setVisible(false);S_ad_panel.setVisible(false);Dl_c_name_panel.setVisible(false);Dl_c_mobile_panel.setVisible(false);Dl_tic_info_panel.setVisible(false);Dl_tr_info_panel.setVisible(false);Dl_pay_panel.setVisible(false);Dl_ad_panel.setVisible(false);In_c_name_panel.setVisible(false);In_c_mno_panel.setVisible(false);In_tic_panel.setVisible(false);In_tr_panel.setVisible(false);In_pay_panel.setVisible(false);In_ad_panel.setVisible(false);Up_c_name_panel.setVisible(false);Up_c_mno_panel.setVisible(false);Up_tic_panel.setVisible(false);Up_tr_panel.setVisible(false);Up_pay_panel.setVisible(false);Up_ad_panel.setVisible(false);D_sq1_panel.setVisible(false);D_sq2_panel.setVisible(false);D_sq3_panel.setVisible(false);D_eq_panel.setVisible(false);D_o1_panel.setVisible(false);D_o2_panel.setVisible(false);D_sj_panel.setVisible(false);}
else if(e.getSource()==clr){DisplayArea.setText(null);}
else if(e.getSource()==D_c_name_btn){DisplayArea.setText("Cus_id"+"       "+"Cus_name"+"\n");
                                     DisplayArea.append("--------------------------------"+"\n");
try{
ps = con.prepareStatement("SELECT * FROM c_name");
rs = ps.executeQuery();
while(rs.next()){String Dis_c_name = rs.getString(1)+"                    "+rs.getString(2)+"\n";
DisplayArea.append(Dis_c_name);} }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_c_mobile_btn){DisplayArea.setText("Cus_id"+"       "+"Cus_mobile"+"\n");
                                     DisplayArea.append("--------------------------------"+"\n");
try{
ps = con.prepareStatement("SELECT * FROM c_mobile");
rs = ps.executeQuery();
while(rs.next()){String Dis_c_mobile = rs.getString(1)+"                "+rs.getString(2)+"\n";
DisplayArea.append(Dis_c_mobile);} }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_ticket_info_btn){DisplayArea.setText("Cus_id"+"       "+"train_id"+  "          "+"number_of_passengers"+ "      "+"issue_date"+"\n");
                                     DisplayArea.append("----------------------------------------------------------------------------------------"+"\n");
try{
ps = con.prepareStatement("SELECT * FROM ticket_info");
rs = ps.executeQuery();
while(rs.next()){String Dis_t_info = rs.getString(1)+"                       "+rs.getString(2)+"                                   "+rs.getString(3)+"                               "+rs.getString(4)+"\n";
DisplayArea.append(Dis_t_info);} }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_train_info_btn){DisplayArea.setText("train_id"+"       "+"train_name"+  "           "+"train_start_time"+ "           "+"train_reach_time"+"             "+"train_from_loc"+"         "+"train_to_loc "+"\n");
                                     DisplayArea.append("--------------------------------------------------------------------------------------------------------------------------------------------"+"\n");
try{
ps = con.prepareStatement("SELECT * FROM train_info");
rs = ps.executeQuery();  
while(rs.next()){String Dis_tr_info = rs.getString(1)+"           "+rs.getString(2)+"             "+rs.getString(3)+"                  "+rs.getString(4)+"                           "+rs.getString(5)+"             "+rs.getString(6)+"\n";
DisplayArea.append(Dis_tr_info);} }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_payment){DisplayArea.setText("Cus_id"+"       "+"payment_method"+  "          "+"payment_amount"+"\n");
                                     DisplayArea.append("----------------------------------------------------------------------"+"\n");
try{
ps = con.prepareStatement("SELECT * FROM payment");
rs = ps.executeQuery();
while(rs.next()){String Dis_pay = rs.getString(1)+"                  "+rs.getString(2)+"                                      "+rs.getString(3)+"\n";
DisplayArea.append(Dis_pay);} }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_admin){DisplayArea.setText("ad_id"+"       "+"ad_name"+  "          "+"role"+"              "+"assistant_id"+"\n");
                                     DisplayArea.append("----------------------------------------------------------------------"+"\n");
try{
ps = con.prepareStatement("SELECT * FROM admin");
rs = ps.executeQuery();
while(rs.next()){String Dis_ad = rs.getString(1)+"               "+rs.getString(2)+"                "+rs.getString(3)+"                 "+rs.getString(4)+"\n";
DisplayArea.append(Dis_ad);} }
catch(Exception a){System.out.println(a);}}
//extra part_begin
else if(e.getSource()==D_sq1_btn){DisplayArea.setText("Cus_id"+"       "+"Cus_name"+"\n");
                                     DisplayArea.append("--------------------------------"+"\n");
try{D_sq1_panel.setVisible(true);
ps = con.prepareStatement("SELECT* FROM c_name WHERE cus_id IN (SELECT cus_id FROM payment WHERE amount > 150)");
rs = ps.executeQuery();
while(rs.next()){String Dis_sq1= rs.getString(1)+ "                     "+ rs.getString(2)+"\n";
DisplayArea.append(Dis_sq1);}}
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_sq2_btn){DisplayArea.setText("Cus_id"+"       "+"Cus_mobile"+"\n");
                                     DisplayArea.append("--------------------------------"+"\n");
try{D_sq2_panel.setVisible(true);
ps = con.prepareStatement("SELECT* FROM c_name WHERE cus_id IN ( SELECT t_holder_id FROM ticket_info WHERE t_id = 723)");
rs = ps.executeQuery();
while(rs.next()){String Dis_sq2= rs.getString(1)+ "                    "+ rs.getString(2)+"\n";
DisplayArea.append(Dis_sq2);}}
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_sq3_btn){DisplayArea.setText("Cus_id"+"       "+"Cus_name"+"\n");
                                   DisplayArea.append("--------------------------------"+"\n");
try{D_sq3_panel.setVisible(true);
ps = con.prepareStatement("SELECT* FROM c_name WHERE cus_id IN (SELECT cus_id FROM payment WHERE method IN('nagad','bkash'))");
rs = ps.executeQuery();
while(rs.next()){String Dis_sq3= rs.getString(1)+ "                    "+ rs.getString(2)+"\n";
DisplayArea.append(Dis_sq3);}}
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_eq_btn){DisplayArea.setText("Cus_id"+"       "+"Cus_name"+"               "+"Cus_mno"+"                  "+"Method"      +"                   "+"Amount"+"\n");
                                   DisplayArea.append("-------------------------------------------------------------------------------------------------------------------------"+"\n");
try{D_eq_panel.setVisible(true);
ps = con.prepareStatement("SELECT c.cus_id, c.cus_name, m.cus_mno, p.method, p.amount from c_name c, c_mobile m, payment p where c.cus_id=m.cus_id and c.cus_id=p.cus_id");
rs = ps.executeQuery();
while(rs.next()){String Dis_eq= rs.getString(1)+ "                         "+ rs.getString(2)+"                  "+rs.getString(3)+"               "+rs.getString(4)+"                 "+rs.getString(5)+"\n";
DisplayArea.append(Dis_eq);}}
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_o1_btn){DisplayArea.setText("T_Holder_ID"+"      "+"Issue_Date"+"               "+"T_ID"+"                  "+"T_Name"      +"\n");
                                   DisplayArea.append("----------------------------------------------------------------------------------------------"+"\n");
try{D_o1_panel.setVisible(true);
ps = con.prepareStatement("SELECT t.t_holder_id, t.issue_date, tr.t_id, tr.t_name FROM train_info tr, ticket_info t WHERE t.t_id(+)= tr.t_id");
rs = ps.executeQuery();
while(rs.next()){String Dis_o1= rs.getString(1)+ "                       "+ rs.getString(2)+"                     "+rs.getString(3)+"               "+rs.getString(4)+"\n";
DisplayArea.append(Dis_o1);}}
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_o2_btn){DisplayArea.setText("Cus_ID"+"      "+"Cus_Name"+"                  "+"T_ID"+"                  "+"Issue_Date"      +"\n");
                                   DisplayArea.append("----------------------------------------------------------------------------------------------"+"\n");
try{D_o2_panel.setVisible(true);
ps = con.prepareStatement("SELECT c.cus_id, c.cus_name, t.t_id, t.issue_date FROM c_name c, ticket_info t WHERE c.cus_id= t.t_holder_id(+) ORDER BY cus_id");
rs = ps.executeQuery();
while(rs.next()){String Dis_o2= rs.getString(1)+ "         "+ rs.getString(2)+"                                     "+rs.getString(3)+"                              "+rs.getString(4)+"\n";
DisplayArea.append(Dis_o2);}}
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==D_sj_btn){DisplayArea.setText("             Assistance"+"\n");
                                 DisplayArea.append("------------------------------------------"+"\n");
try{D_sj_panel.setVisible(true);
ps = con.prepareStatement("SELECT b.ad_name||' is assisted by '||a.ad_name as Assistance FROM 	admin a, admin b WHERE 	a.asst_id= b.ad_id");
rs = ps.executeQuery();
while(rs.next()){String Dis_sj= rs.getString(1)+"\n";
DisplayArea.append(Dis_sj);}}
catch(Exception a){System.out.println(a);}}
//extra part_end

else if(e.getSource()==S_c_name){S_c_name_panel.setVisible(true);}
   else if(e.getSource()==Enter_c_name){DisplayArea.setText("Cus_ID"+"       "+"Cus_Name"+"\n");
                                     DisplayArea.append("--------------------------------"+"\n");
      //  System.out.println("Noice");
try{
   ps = con.prepareStatement("SELECT * FROM c_name");
rs = ps.executeQuery();
if(rs.next()){
ps = con.prepareStatement("SELECT * from c_name where cus_id=?");
ps.setInt(1,Integer.parseInt(TF_c_id.getText()));
rs = ps.executeQuery();
while(rs.next()){String Src_c_name = rs.getString(1)+"                     "+rs.getString(2)+"\n";
DisplayArea.append(Src_c_name);}}
else{JOptionPane.showMessageDialog(null,"Sorry, record not found :(");}}  
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==S_c_mobile){S_c_mobile_panel.setVisible(true);}
   else if(e.getSource()==c_mobile_Enter){DisplayArea.setText("Cus_id"+"            "+"Cus_mobile"+"\n");
                                     DisplayArea.append("--------------------------------"+"\n");
      //  System.out.println("Noice");
try{
ps = con.prepareStatement("SELECT * from c_mobile where cus_id=?");
ps.setInt(1,Integer.parseInt(TF_c_id_mno.getText()));
rs = ps.executeQuery();
while(rs.next()){String Src_c_mobile = rs.getString(1)+"                       "+rs.getString(2)+"\n";
DisplayArea.append(Src_c_mobile);}

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==S_ticket_info){S_tic_info_panel.setVisible(true);}
   else if(e.getSource()==tic_info_Enter){DisplayArea.setText("Cus_id"+"       "+"train_id"+  "          "+"number_of_passengers"+ "      "+"issue_date"+"\n");
                                     DisplayArea.append("----------------------------------------------------------------------------------------"+"\n");
       System.out.println("Noice");
try{
ps = con.prepareStatement("SELECT * from ticket_info where t_holder_id=?");
ps.setInt(1,Integer.parseInt(TF_c_id_tic_info.getText()));
rs = ps.executeQuery();
while(rs.next()){String Src_tic = rs.getString(1)+"                       "+rs.getString(2)+"                                   "+rs.getString(3)+"                               "+rs.getString(4)+"\n";;
DisplayArea.append(Src_tic);}

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==S_train_info){S_tr_info_panel.setVisible(true);}
   else if(e.getSource()==tr_info_enter){DisplayArea.setText("train_id"+"       "+"train_name"+  "           "+"train_start_time"+ "           "+"train_reach_time"+"             "+"train_from_loc"+"         "+"train_to_loc "+"\n");
                                     DisplayArea.append("--------------------------------------------------------------------------------------------------------------------------------------------"+"\n");
       System.out.println("Noice");
try{
ps = con.prepareStatement("SELECT * from train_info where t_id=?");
ps.setInt(1,Integer.parseInt(TF_t_id_tr_info.getText()));
rs = ps.executeQuery();
while(rs.next()){String Src_tr = rs.getString(1)+"           "+rs.getString(2)+"                    "+rs.getString(3)+"                     "+rs.getString(4)+"                                 "+rs.getString(5)+"                  "+rs.getString(6)+"\n";
DisplayArea.append(Src_tr);} 

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==S_payment){S_pay_panel.setVisible(true);}
   else if(e.getSource()==pay_Enter){
      //  System.out.println("Noice");
try{DisplayArea.setText("Cus_id"+"       "+"payment_method"+  "          "+"payment_amount"+"\n");
                                     DisplayArea.append("----------------------------------------------------------------------"+"\n");
ps = con.prepareStatement("SELECT * from payment where cus_id=?");
ps.setInt(1,Integer.parseInt(TF_c_id_pay.getText()));
rs = ps.executeQuery();
while(rs.next()){String Src_pay = rs.getString(1)+"    "+rs.getString(2)+"\n";
DisplayArea.append(Src_pay);}

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==S_admin){S_ad_panel.setVisible(true);}
   else if(e.getSource()==ad_enter){DisplayArea.setText("ad_id"+"       "+"ad_name"+  "          "+"role"+"              "+"assistant_id"+"\n");
                                     DisplayArea.append("----------------------------------------------------------------------"+"\n");
      //  System.out.println("Noice");
try{
ps = con.prepareStatement("SELECT * from admin where ad_id=?");
ps.setInt(1,Integer.parseInt(TF_ad_id_admin.getText()));
rs = ps.executeQuery();
while(rs.next()){String Src_ad = rs.getString(1)+"               "+rs.getString(2)+"                "+rs.getString(3)+"                 "+rs.getString(4)+"\n";
DisplayArea.append(Src_ad);}

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Dl_c_name){Dl_c_name_panel.setVisible(true);}
   else if(e.getSource()==c_name_enter_dl){
        System.out.println("Noice");
try{
ps = con.prepareStatement("delete  from c_name where cus_id=?");
ps.setInt(1,Integer.parseInt(TF_c_id_dl.getText()));
ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Deletion Successful :)");

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Dl_c_mobile){Dl_c_mobile_panel.setVisible(true);}
   else if(e.getSource()==c_mobile_enter_dl){
       System.out.println("Noice");
try{
ps = con.prepareStatement("delete  from c_mobile where cus_id=?");
ps.setInt(1,Integer.parseInt(TF_c_mno_dl.getText()));
ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Deletion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Dl_ticket_info){Dl_tic_info_panel.setVisible(true);}
   else if(e.getSource()==tic_info_enter_dl){
       System.out.println("Noice");
try{
ps = con.prepareStatement("delete  from ticket_info where t_holder_id=?");
ps.setInt(1,Integer.parseInt(TF_tic_dl.getText()));
ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Deletion Successful :)");

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Dl_tr_info){Dl_tr_info_panel.setVisible(true);}
   else if(e.getSource()==tr_info_enter_dl){
       System.out.println("Noice");
try{
ps = con.prepareStatement("delete  from train_info where t_id=?");
ps.setInt(1,Integer.parseInt(TF_tr_dl.getText()));
ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Deletion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Dl_pay){Dl_pay_panel.setVisible(true);}
   else if(e.getSource()==pay_enter_dl){
       System.out.println("Noice");
try{
ps = con.prepareStatement("delete  from payment where cus_id=?");
ps.setInt(1,Integer.parseInt(TF_pay_dl.getText()));
ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Deletion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Dl_ad){Dl_ad_panel.setVisible(true);}
   else if(e.getSource()==ad_enter_dl){
       System.out.println("Noice");
try{
ps = con.prepareStatement("delete  from admin where ad_id=?");
ps.setInt(1,Integer.parseInt(TF_ad_dl.getText()));
ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Deletion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==In_c_name){In_c_name_panel.setVisible(true);}
   else if(e.getSource()==c_name_enter_in){
       System.out.println("Noice");
try{
ps = con.prepareStatement("INSERT INTO c_name VALUES(?,?)");
ps.setInt(1,Integer.parseInt(TF_c_name_cus_id_in.getText()));
ps.setString(2,TF_c_name_cus_name_in.getText());
ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Insertion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==In_c_mno){In_c_mno_panel.setVisible(true);}
   else if(e.getSource()==c_mno_enter_in){
       System.out.println("Noice");
try{
ps = con.prepareStatement("INSERT INTO c_mobile VALUES(?,?)");
ps.setInt(1,Integer.parseInt(TF_c_mno_cus_id_in.getText()));
ps.setString(2,TF_c_mno_cus_mno_in.getText());
ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Insertion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==In_tic){In_tic_panel.setVisible(true);}
   else if(e.getSource()==tic_enter_in){
       System.out.println("Noice");
try{
ps = con.prepareStatement("INSERT INTO ticket_info VALUES(?,?,?,?)");
ps.setInt(1,Integer.parseInt(TF_tic_c_id_in.getText()));
ps.setString(2,TF_tic_t_id_in.getText());
ps.setInt(3,Integer.parseInt(TF_tic_num_psngrs_in.getText()));
ps.setString(4,TF_tic_issue_date_in.getText());
ps.executeUpdate();
System.out.println("Noice");
 JOptionPane.showMessageDialog(null,"Insertion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==In_tr){In_tr_panel.setVisible(true);}
   else if(e.getSource()==tr_enter_in){
       System.out.println("Noice");
try{
ps = con.prepareStatement("INSERT INTO train_info VALUES(?,?,?,?,?,?)");
ps.setInt(1,Integer.parseInt(TF_tr_t_id_in.getText()));
ps.setString(2,TF_tr_t_name_in.getText());
ps.setString(3,TF_tr_start_in.getText());
ps.setString(4,TF_tr_reach_in.getText());
ps.setString(5,TF_tr_from_in.getText());
ps.setString(6,TF_tr_to_in.getText());
ps.executeUpdate();
System.out.println("Noice");
 JOptionPane.showMessageDialog(null,"Insertion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==In_pay){In_pay_panel.setVisible(true);}
   else if(e.getSource()==pay_enter_in){
       System.out.println("Noice");
try{
ps = con.prepareStatement("INSERT INTO payment VALUES(?,?,?)");
ps.setInt(1,Integer.parseInt(TF_pay_c_id_in.getText()));
ps.setString(2,TF_pay_method_in.getText());
ps.setInt(3,Integer.parseInt(TF_pay_amount_in.getText()));
ps.executeUpdate();
System.out.println("Noice");
 JOptionPane.showMessageDialog(null,"Insertion Successful :)");
 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==In_ad){In_ad_panel.setVisible(true);}
   else if(e.getSource()==ad_enter_in){
       System.out.println("Noice");
try{
ps = con.prepareStatement("INSERT INTO admin VALUES(?,?,?,?)");
ps.setInt(1,Integer.parseInt(TF_ad_id_in.getText()));
ps.setString(2,TF_ad_name_in.getText());
ps.setString(3,TF_ad_role_in.getText());
ps.setInt(4,Integer.parseInt(TF_ad_pass_in.getText()));

ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Insertion Successful :)");
System.out.println("Noice");

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Up_c_name){Up_c_name_panel.setVisible(true);}
   else if(e.getSource()==c_name_enter_up){
       System.out.println("Noice");
try{
ps = con.prepareStatement("UPDATE c_name SET cus_name =? WHERE cus_id=?");
ps.setInt(2,Integer.parseInt(TF_c_name_c_id_up.getText()));
ps.setString(1,TF_c_name_c_name_up.getText());


ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Updation Successful :)");
System.out.println("Noice");

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Up_c_mno){Up_c_mno_panel.setVisible(true);}
   else if(e.getSource()==c_mno_enter_up){
       System.out.println("Noice");
try{
ps = con.prepareStatement("UPDATE c_mobile SET cus_mno =? WHERE cus_id=?");
ps.setInt(2,Integer.parseInt(TF_c_mno_c_id_up.getText()));
ps.setString(1,TF_c_mno_c_mno_up.getText());


ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Updation Successful :)");
System.out.println("Noice");}catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Up_tic){Up_tic_panel.setVisible(true);}
   else if(e.getSource()==tic_enter_up){
       System.out.println("Noice");
try{
ps = con.prepareStatement("UPDATE ticket_info SET t_id =?,num_of_passengers=?,issue_date=? WHERE t_holder_id=?");
ps.setInt(1,Integer.parseInt(TF_tic_t_id_up.getText()));
ps.setInt(2,Integer.parseInt(TF_tic_psngrs_up.getText()));
ps.setString(3,TF_tic_issue_up.getText());
ps.setInt(4,Integer.parseInt(TF_tic_c_id_up.getText()));

ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Updation Successful :)");
System.out.println("Noice");

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Up_tr){Up_tr_panel.setVisible(true);}
   else if(e.getSource()==tr_enter_up){
       System.out.println("Noice");
try{
ps = con.prepareStatement("UPDATE train_info SET t_name=?,t_start_time= ?,t_reach_time=?,t_from_loc=?,t_to_loc=? WHERE t_id=?");
ps.setString(1,TF_tr_name_up.getText());
ps.setString(2,TF_tr_start_up.getText());
ps.setString(3,TF_tr_reach_up.getText());
ps.setString(4,TF_tr_from_up.getText());
ps.setString(5,TF_tr_to_up.getText());
ps.setInt(6,Integer.parseInt(TF_tr_id_up.getText()));



ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Updation Successful :)");
System.out.println("Noice");

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Up_pay){Up_pay_panel.setVisible(true);}
   else if(e.getSource()==pay_enter_up){
       System.out.println("Noice");
try{
ps = con.prepareStatement("UPDATE payment SET method=?,amount=? where cus_id=?");

ps.setString(1,TF_pay_method_up.getText());
ps.setString(2,TF_pay_amount_up.getText());
ps.setInt(3,Integer.parseInt(TF_pay_id_up.getText()));



ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Updation Successful :)");
System.out.println("Noice");

 }
catch(Exception a){System.out.println(a);}}

else if(e.getSource()==Up_ad){Up_ad_panel.setVisible(true);}
   else if(e.getSource()==ad_enter_up){
       System.out.println("Noice");
try{
ps = con.prepareStatement("UPDATE admin SET ad_name =?,role=?,asst_id=? WHERE ad_id=?");
ps.setString(1,TF_ad_name_up.getText());
ps.setString(2,TF_ad_role_up.getText());
ps.setInt(3,Integer.parseInt(TF_ad_pass_up.getText()));
ps.setInt(4,Integer.parseInt(TF_ad_id_up.getText()));

ps.executeUpdate();
 JOptionPane.showMessageDialog(null,"Updation Successful :)");
System.out.println("Noice");

 }
catch(Exception a){System.out.println(a);}}

}

    
    public static void main(String[] args) throws Exception{
         new Train();
    }
}
