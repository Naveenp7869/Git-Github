import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class FDemo extends JFrame implements ActionListener
{
		Font f;
	JButton [] b = new JButton[9];
	int x =150;
	int y =100;
	FDemo(){
		f = new Font("",Font.BOLD,55);
		setLayout(null);
		int k =0;
		for(int i=0;i<3; i++)
		{
			for(int j =0;j<3;j++)
			{
				b[k]= new JButton();
				b[k].setBounds(x,y,100,100);
				b[k].addActionListener(this);
				b[k].setFont(f);
				add(b[k]);
				k++;
				x+=100;
			}
			x=150;
			y+=100;	
		}
	}
	int i =0;
	public void actionPerformed(ActionEvent e)
	{
		JButton b=(JButton) e.getSource();
		if( i%2==0)
		{
			b.setText("X");
		}
		else
		{
			b.setText("O");
		}
		
		b.removeActionListener(this);
		i++;
		if(i>=5)
		checkWinner();
	}
	public void checkWinner()
	{
		if(b[0].getText() =="X" &&b[1].getText()=="X"&&b[2].getText()=="X"){
			b[0].setBackground(Color.RED);
			b[1].setBackground(Color.RED);
			b[2].setBackground(Color.RED);
			stopGame();
		}
		else if(b[3].getText() =="X" &&b[4].getText()=="X"&&b[5].getText()=="X"){
			b[3].setBackground(Color.RED);
			b[4].setBackground(Color.RED);
			b[5].setBackground(Color.RED);

			stopGame();
		}
		else if(b[6].getText() =="X" &&b[7].getText()=="X"&&b[8].getText()=="X"){
			b[6].setBackground(Color.RED);
			b[7].setBackground(Color.RED);
			b[8].setBackground(Color.RED);

			stopGame();
		}
		else if(b[0].getText() =="X" &&b[4].getText()=="X"&&b[8].getText()=="X"){
			b[0].setBackground(Color.RED);
			b[4].setBackground(Color.RED);
			b[8].setBackground(Color.RED);

			stopGame();
		}
		
		else if(b[2].getText() =="X" &&b[4].getText()=="X"&&b[6].getText()=="X"){
			b[2].setBackground(Color.RED);
			b[4].setBackground(Color.RED);
			b[6].setBackground(Color.RED);

			stopGame();
		}
		else if(b[0].getText() =="X" &&b[3].getText()=="X"&&b[6].getText()=="X"){
			b[0].setBackground(Color.RED);
			b[3].setBackground(Color.RED);
			b[6].setBackground(Color.RED);

			stopGame();
		}
		else if(b[1].getText() =="X" &&b[4].getText()=="X"&&b[7].getText()=="X"){
			b[1].setBackground(Color.RED);
			b[4].setBackground(Color.RED);
			b[7].setBackground(Color.RED);

			stopGame();
		}
		else if(b[2].getText() =="X" &&b[5].getText()=="X"&&b[8].getText()=="X"){
			b[2].setBackground(Color.RED);
			b[5].setBackground(Color.RED);
			b[8].setBackground(Color.RED);

			stopGame();
		}
		else if(b[0].getText() =="O" &&b[1].getText()=="O"&&b[2].getText()=="O"){
			b[0].setBackground(Color.GREEN);
			b[1].setBackground(Color.GREEN);
			b[2].setBackground(Color.GREEN);
		
			stopGame();
			}
		else if(b[3].getText() =="O" &&b[4].getText()=="O"&&b[5].getText()=="O"){
			b[3].setBackground(Color.GREEN);
			b[4].setBackground(Color.GREEN);
			b[5].setBackground(Color.GREEN);
			
			stopGame();
		}
		else if(b[6].getText() =="O" &&b[7].getText()=="O"&&b[8].getText()=="O"){
			b[6].setBackground(Color.GREEN);
			b[7].setBackground(Color.GREEN);
			b[8].setBackground(Color.GREEN);
			
			stopGame();
		}
		else if(b[0].getText() =="O" &&b[4].getText()=="O"&&b[8].getText()=="O"){
			b[0].setBackground(Color.GREEN);
			b[4].setBackground(Color.GREEN);
			b[8].setBackground(Color.GREEN);
			
			stopGame();
		}
		else if(b[2].getText() =="O" &&b[4].getText()=="O"&&b[6].getText()=="O"){
			b[2].setBackground(Color.GREEN);
			b[4].setBackground(Color.GREEN);
			b[6].setBackground(Color.GREEN);
			
			stopGame();
		}
		else if(b[0].getText() =="O" &&b[3].getText()=="O"&&b[6].getText()=="O"){
			b[0].setBackground(Color.GREEN);
			b[3].setBackground(Color.GREEN);
			b[6].setBackground(Color.GREEN);
			
			stopGame();
		}
		else if(b[1].getText() =="O" &&b[4].getText()=="O"&&b[7].getText()=="O"){
			b[1].setBackground(Color.GREEN);
			b[4].setBackground(Color.GREEN);
			b[7].setBackground(Color.GREEN);
			
			stopGame();
		}
		else if(b[2].getText() =="O" &&b[5].getText()=="O"&&b[8].getText()=="O"){
			b[2].setBackground(Color.GREEN);
			b[5].setBackground(Color.GREEN);
			b[8].setBackground(Color.GREEN);
			
			stopGame();

		}
		else if(!checkDraw())
		{
			for(int i =0;i<9;i++)
			{
				b[i].setText("");
				b[i].addActionListener(this);
			}
			
		}

	}
	public boolean checkDraw()
	{
		if(b[0].getText() !="X" &&b[1].getText()!="X"&&b[2].getText()!="X"){
			return true;
		}
		else if(b[3].getText() !="X" &&b[4].getText()!="X"&&b[5].getText()!="X"){
			return true;
		}
		else if(b[6].getText() !="X" &&b[7].getText()!="X"&&b[8].getText()!="X"){
			return true;

		}
		else if(b[0].getText() !="X" &&b[4].getText()!="X"&&b[8].getText()!="X"){
			return true;
		}
		
		else if(b[2].getText() !="X" &&b[4].getText()!="X"&&b[6].getText()!="X"){
			return true;
		}
		else if(b[0].getText() !="X" &&b[3].getText()!="X"&&b[6].getText()!="X"){
			return true;
		}
		else if(b[1].getText() !="X" &&b[4].getText()!="X"&&b[7].getText()!="X"){
			return true;
		}			
		else if(b[2].getText() !="X" &&b[5].getText()!="X"&&b[8].getText()!="X"){
			return true;
		}
		else if(b[0].getText() !="O" &&b[1].getText()!="O"&&b[2].getText()!="O"){
			return true;
		}
		else if(b[3].getText() !="O" &&b[4].getText()!="O"&&b[5].getText()!="O"){
			return true;
		}
		else if(b[6].getText() !="O" &&b[7].getText()!="O"&&b[8].getText()!="O"){
		return true;
		}
		else if(b[0].getText() !="O" &&b[4].getText()!="O"&&b[8].getText()!="O"){
			return true;
		}
		else if(b[2].getText() !="O" &&b[4].getText()!="O"&&b[6].getText()!="O"){
			return true;
		}
		else if(b[0].getText() !="O" &&b[3].getText()!="O"&&b[6].getText()!="O"){
		return true;
		}
		else if(b[1].getText() !="O" &&b[4].getText()!="O"&&b[7].getText()!="O"){
		return true;
		}
		else if(b[2].getText() !="O" &&b[5].getText()!="O"&&b[8].getText()!="O"){
return true;		
}
return false;
	}
	public void stopGame()
	{
		for(int i =0;i<9;i++)
			{
				b[i].removeActionListener(this);
			}
			

		
	}
}
class TicTacToe
{
public static void main(String []ar)
{
	FDemo f = new FDemo();
	f.setVisible(true);
	f.setBounds(100,100,600,600);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}