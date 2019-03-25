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
import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shlAmWindow;
	private Text vorname;
	private Text nachname;
	private Text plz;
	private Text ort;
	private Text strasse;
	private Text hausnummer;

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
				System.out.println("Vorname: " + vorname.getText());
				System.out.println("Nachname: " + nachname.getText());
				System.out.println("PLZ: " + plz.getText());
				System.out.println("Ort: " + ort.getText());
				System.out.println("Straﬂe: " + strasse.getText());
				System.out.println("Hausnummer: " + hausnummer.getText());
			}
		});
		button1.setBounds(10, 10, 108, 180);
		button1.setText("Mein 1. Knopf");

		vorname = new Text(shlAmWindow, SWT.BORDER);
		vorname.setBounds(205, 10, 219, 25);

		Label lblVorname = new Label(shlAmWindow, SWT.NONE);
		lblVorname.setBounds(124, 13, 75, 15);
		lblVorname.setText("Vorname");

		Label lblNachname = new Label(shlAmWindow, SWT.NONE);
		lblNachname.setBounds(124, 44, 75, 15);
		lblNachname.setText("Nachname");

		nachname = new Text(shlAmWindow, SWT.BORDER);
		nachname.setBounds(205, 41, 219, 25);

		plz = new Text(shlAmWindow, SWT.BORDER);
		plz.setBounds(205, 72, 219, 25);

		ort = new Text(shlAmWindow, SWT.BORDER);
		ort.setBounds(205, 103, 219, 25);

		strasse = new Text(shlAmWindow, SWT.BORDER);
		strasse.setBounds(205, 134, 219, 25);

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

		hausnummer = new Text(shlAmWindow, SWT.BORDER);
		hausnummer.setBounds(205, 165, 219, 25);

	}
}
