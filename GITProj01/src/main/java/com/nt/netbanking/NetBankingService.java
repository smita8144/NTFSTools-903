package com.nt.netbanking;

import java.util.Random;

public class NetBankingService {

	public String openAccount(String addhar,double initialamount,String type) {
		return "account is opened with acc number::"+new Random().nextLong(50000000000L);
	}


	public String closeAccount() {
		return"Account is closed";

	}
	public String withdraw(long accno,double amount) {
		return amount+"is withdrawn from the account number::"+accno;
	}
	
	public String deposite(long accno,double amount) {
		return amount+"is deposited in to the account number::"+accno;

	}
	
	public String transferMoney(long srcAcno,long destAcno,double amount) {
		
		return "transfering"+amount+"from"+srcAcno+" to "+destAcno;

	}
	public void xyz(){
		
	}
}
