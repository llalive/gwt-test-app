package ru.llalive.gwttestapp.client;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.ibm.icu.text.SimpleDateFormat;

public class ContractsProviderImpl implements ContractsProvider {

	@Override
	public ArrayList<Contract> getContracts() {
		ArrayList<Contract> contracts = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Insurant insurant = new Insurant("Иванов Иван Иванович");
		Realty realty = new Realty();
		Contract c = new Contract(1, new Date(), insurant, realty);
		try {
			c.setDatePeriod(sdf.parse("2015-02-03"), sdf.parse("2015-08-02"));
		} catch (ParseException ex) {
		}

		contracts.add(c);

		return contracts;
	}

}
