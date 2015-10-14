import javax.swing.*;

public class MettingDialog {

	public static void main(String[] args) {
		
		String userName;
		int confirm = JOptionPane.NO_OPTION;
		
		while(confirm == JOptionPane.NO_OPTION){
			userName = JOptionPane.showInputDialog("Please enter your name.");
			
			if(userName == null){
				break;
			}
			
			confirm = JOptionPane.showConfirmDialog(null, "Is " + userName + " your name?", 
					"Please Confirm", JOptionPane.YES_NO_OPTION);
			
			if(confirm == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(null, "Nice to meet you " + userName + "!");
			}
		}
	}

}
