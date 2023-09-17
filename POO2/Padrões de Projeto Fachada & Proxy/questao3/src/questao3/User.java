package questao3;

public class User {
    private String username;
    private String role;

    public User(String username, String role) {
        this.setUsername(username);
        this.role = role;
    }


    public boolean hasPermission(theDocument document) {
        return this.role.equals("admin");
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
