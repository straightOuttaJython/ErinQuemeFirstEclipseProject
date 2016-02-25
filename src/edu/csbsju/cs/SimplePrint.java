/**
 * 
 */
package edu.csbsju.cs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ejqueme
 *
 */
public class SimplePrint implements ActionListener {

	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		for(int i=0; i<args.length;i++)
		{
			System.out.println("args[ " + i + " ] = " + args[i] );	
		}

	}

}
