

/*
      * To change this license header, choose License Headers in
     Project Properties.
      * To change this template file, choose Tools | Templates
      * and open the template in the editor.
      */
     import java.applet.*;
     import java.awt.*;
     import java.awt.event.*;  
     import javax.swing.JPanel;

     public class create_candidate extends Applet implements ActionListener {
         StringBuffer strBuffer;
         Button register;
         Button Cancel;
         TextField name;        
         TextField address;
         TextField birthday;
         TextField Gender;
         Choice gender;
         TextField role;
         TextField salary;
        
         JPanel j;
        

           @Override
        public Insets getInsets()
          {
             return new Insets(40,20,40,20);
          }
             
        
      
        public create_candidate() {
        }
        
        
         public void init(){
           strBuffer = new StringBuffer();

            j= new JPanel();
            j.setLayout(new BorderLayout());
           
            name= new TextField(25);
         
            
            address= new TextField(30);
         

            birthday= new TextField(12);
           
            role= new TextField(32);
            salary= new TextField(20);
            
            
                 
            register=new Button("Submit");  
            Cancel=new Button("Clear");
            register.setBounds(80,150,60,50);  
            register.addActionListener(this);
            Cancel.addActionListener(this);  
            

            add(new Label("Name:              "));

            add(name);
            add(new Label("Address            "));
            add(address);
            
            add(new Label("Birthday            "));
            add(birthday);
            
            add(new Label("Role            "));
            add(role);
            add(new Label("Salary            "));
            add(salary);
             
            add(new Label("Gender            :"));
            gender = new Choice(); 
            gender.addItem("Female"); 
            gender.addItem("Male");
            gender.addItem("transgender");
            gender.addItem("two-spirit");
            gender.addItem("unknown"); 
            
     

            Component add = add(gender); 
            
            
            add(register);
            add(Cancel);
         }
         
      
        // Applet LifeCycle Hooks
          public void start() {
               System.out.println("Applet initiated");
            }

            public void stop() {
                System.out.println("Applet Stopped");
            }

            public void destroy() {
               System.out.println("Applet destroyed");
            }
   
   void addItem(String word) {
      
      System.out.println(word);
      
      
      strBuffer.append(word);
      
      repaint();
      
   }
   
   public void paint(Graphics g) {
      // Draw a Rectangle around the applet's display area.
      g.drawRect(0, 0, 
      getWidth() - 1,
      getHeight() - 1);

      g.drawString(strBuffer.toString(), 100, 200);
   }
   
  @Override 
    public void actionPerformed(ActionEvent e){  
        if (e.getActionCommand().equals("Submit")) {
            
           Person newone= new Person(name.getText(),address.getText(),birthday.getText(),gender.getName(),role.getText(),Integer.parseInt(salary.getText()));
           System.out.print("new Job Created:"+newone.name+" "+newone.getSalary()+" ");
           this.addItem("new Job Created:"+newone.name+" "+newone.getSalary()+" ");
        } else if (e.getActionCommand().equals("Clear")) {
            System.out.print("clear all values");
            name.setText(" ");
            address.setText(" ");
            birthday.setText(" ");
            role.setText(" ");
            salary.setText(" ");
        }
    }  
   

}