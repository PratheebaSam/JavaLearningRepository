package com.tyss.upordowncasting;

public class UpOrDowncasting {
	public static void main(String[] args) {
		User user = new Admin("prathi",9344045340l);
		user.chat();
		
		Admin admin=(Admin) user;
		admin.chat();
		admin.add("isrin");
	}
}
