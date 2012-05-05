package cz.sweb.pichlik;


import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String email;

	/* (non-Javadoc)
	 * @see cz.sweb.pichlik.UserInterface#getId()
	 */
	public long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see cz.sweb.pichlik.UserInterface#setId(long)
	 */
	public void setId(long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see cz.sweb.pichlik.UserInterface#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see cz.sweb.pichlik.UserInterface#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see cz.sweb.pichlik.UserInterface#getEmail()
	 */
	public String getEmail() {
		return email;
	}

	/* (non-Javadoc)
	 * @see cz.sweb.pichlik.UserInterface#setEmail(java.lang.String)
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;		
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
