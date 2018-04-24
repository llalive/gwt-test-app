package ru.llalive.gwttestapp.client;

import java.awt.Button;
import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class GwtTestApp implements EntryPoint {

	private HorizontalPanel controlPanel = new HorizontalPanel();
	private Button addContractBtn = new Button();
	private Button openContractBtn = new Button();
	private FlexTable contractsList = new FlexTable();
	private ArrayList<Contract> contracts = new ArrayList<>();

	public void onModuleLoad() {
		// TODO Get dummy contracts data from elsewhere
		ContractsProvider cp = new ContractsProviderImpl();
		contracts = cp.getContracts();
		// TODO Create table for contracts data
		// TODO Create control panel and set up the buttons
		// TODO Add all elements to root panel
	}
}
