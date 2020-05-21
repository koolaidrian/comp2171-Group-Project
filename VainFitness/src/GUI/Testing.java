package GUI;
import control.VainFitnessUserControl;
import model.VFDatabaseConnect;
import view.VainFitnessUIUser;

public class Testing {

	public static void main(String[] args) {
		VainFitnessUIUser aview = new VainFitnessUIUser();
		VFDatabaseConnect database = new VFDatabaseConnect();
		VainFitnessUserControl control = new VainFitnessUserControl(aview, database);
	}

}
