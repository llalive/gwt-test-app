package ru.llalive.gwttestapp.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import ru.llalive.gwttestapp.client.Contract;

public class GwtTestApp implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();
	private HorizontalPanel controlPanel = new HorizontalPanel();
	private Button addContractBtn = new Button("Создать договор");
	private Button openContractBtn = new Button("Открыть договор");
	private FlexTable contractsList = new FlexTable();
	private ArrayList<Contract> contracts = new ArrayList<>();

	public void onModuleLoad() {
		// Get dummy contracts data from elsewhere
		ContractsProvider cp = new ContractsProviderImpl();
		contracts = cp.getContracts();
		// Create table for contracts data
		contractsList.setText(0, 0, "Серия-Номер");
		contractsList.setText(0, 1, "Дата заключения");
		contractsList.setText(0, 2, "Страхователь");
		contractsList.setText(0, 3, "Премия");
		contractsList.setText(0, 4, "Срок действия");
		for (Contract c : contracts) {
			int row = contractsList.getRowCount();
			contractsList.setText(row, 0, c.getId() + "");
			contractsList.setText(row, 1, c.getCreatedAt().toString());
			contractsList.setText(row, 2, c.getInsurant().toString());
			contractsList.setText(row, 3, Double.toString(c.getBounty()));
			contractsList.setText(row, 4, c.getDatePeriod());
		}
		// Create control panel and set up the buttons
		controlPanel.add(addContractBtn);
		controlPanel.add(openContractBtn);
		// Add all elements to root panel
		mainPanel.add(controlPanel);
		mainPanel.add(contractsList);
		RootPanel.get().add(mainPanel);
	}
}
