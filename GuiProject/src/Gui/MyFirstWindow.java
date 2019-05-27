package Gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;

import data.Person;

import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shlAmWindow;
	private Text vornameTF;
	private Text nachnameTF;
	private Label lblPlz;
	private Label lblOrt;
	private Label lblStrasse;
	private Label lblHausnummer;
	private Text plzTF;
	private Text ortTF;
	private Label vornameOut;
	private Label nachnameOut;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstWindow window = new MyFirstWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlAmWindow.open();
		shlAmWindow.layout();
		while (!shlAmWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlAmWindow = new Shell();
		shlAmWindow.setSize(450, 300);
		shlAmWindow.setText("AM Window");

		Button button1 = new Button(shlAmWindow, SWT.NONE);
		button1.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				// System.out.println("Maus auf " + me.x + "/" + me.y);
			}
		});
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedrückt");
				//
				System.out.println(vornameTF.getText());
				System.out.println(nachnameTF.getText());
				//
				getVornameOut().setText(getVornameTF().getText());
				getNachnameOut().setText(getNachnameTF().getText());
			}
		});
		button1.setBounds(10, 10, 108, 180);
		button1.setText("Mein 1. Knopf");

		vornameTF = new Text(shlAmWindow, SWT.BORDER);
		vornameTF.setBounds(205, 10, 219, 25);

		Label lblVorname = new Label(shlAmWindow, SWT.NONE);
		lblVorname.setBounds(124, 10, 75, 15);
		lblVorname.setText("Vorname");

		Label lblNachname = new Label(shlAmWindow, SWT.NONE);
		lblNachname.setBounds(124, 44, 75, 15);
		lblNachname.setText("Nachname");

		nachnameTF = new Text(shlAmWindow, SWT.BORDER);
		nachnameTF.setBounds(205, 41, 219, 25);

		Label lblPlz = new Label(shlAmWindow, SWT.NONE);
		lblPlz.setBounds(124, 75, 75, 15);
		lblPlz.setText("PLZ");

		Label lblOrt = new Label(shlAmWindow, SWT.NONE);
		lblOrt.setBounds(124, 106, 75, 15);
		lblOrt.setText("Ort");

		Label lblStrasse = new Label(shlAmWindow, SWT.NONE);
		lblStrasse.setBounds(124, 137, 75, 15);
		lblStrasse.setText("Stra\u00DFe");

		Label lblHausnummer = new Label(shlAmWindow, SWT.NONE);
		lblHausnummer.setText("Hausnummer");
		lblHausnummer.setBounds(124, 168, 75, 15);
		
		plzTF = new Text(shlAmWindow, SWT.BORDER);
		plzTF.setBounds(205, 72, 219, 25);
		
		ortTF = new Text(shlAmWindow, SWT.BORDER);
		ortTF.setBounds(205, 103, 219, 25);
		
		vornameOut = new Label(shlAmWindow, SWT.NONE);
		vornameOut.setBounds(205, 137, 219, 15);
		
		nachnameOut = new Label(shlAmWindow, SWT.NONE);
		nachnameOut.setBounds(205, 168, 219, 15);
		
		Button btnSaveClean = new Button(shlAmWindow, SWT.NONE);
		btnSaveClean.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Person p; // Variablen-Definiton
				p = new Person(); // Variablen-Instanz
				//
				p.setVorname(getVornameTF().getText());
				p.setNachname(getNachnameTF().getText());
				//
				System.out.println(p);
				//
				Person.getPersonenListe().add(p);
				//
				System.out.println("-----");
				System.out.println("Liste: ");
				System.out.println(Person.getPersonenListe());
				//
				getVornameTF().setText("");
				getNachnameTF().setText("");
			}
		});
		btnSaveClean.setBounds(10, 196, 108, 55);
		btnSaveClean.setText("Save & Clean");

	}
	
	public Label getVornameOut() {
		return vornameOut;
	}
	public Label getNachnameOut() {
		return nachnameOut;
	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Text getPlzTF() {
		return plzTF;
	}
	public Text getOrtTF() {
		return ortTF;
	}
}
