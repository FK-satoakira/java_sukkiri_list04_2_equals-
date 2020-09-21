package practice;

public class Account {
	private String account;
	public boolean equals(Object o) {
		if(this==o)return true;
		if(o==null)return false;
		if(!(o instanceof Account))return false;
		Account r = (Account) o;
		if(!(r.account.trim().equals(this.account.trim()))) {
			return false;
		}
		return true;
	}

//	この書き方でも行けた
//	public boolean equals(Object o) {
//		if(this==o)return true;
//		if(this==null)return false;
//		if(o instanceof Account) {
//			Account r = (Account)o;
//			if(r.account.trim().equals(this.account.trim())) {
//				return true;
//			}
//		}
//		return false;
//	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
}
