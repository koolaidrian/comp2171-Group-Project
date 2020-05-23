package GUI;

import model.Report;

public class GenerateReportController {

	private Report report;
	
	private GenerateReportController(Client client, int day, int month, int year) {
		this.report = new Report(client, day, month, year);
	}
	
	public String seeReport() {
		return report.tostring();
	}
}
