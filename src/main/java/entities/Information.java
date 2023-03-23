package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the information database table.
 * 
 */
@Entity
@NamedQuery(name="Information.findAll", query="SELECT i FROM Information i")
public class Information implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String email;

	//bi-directional one-to-one association to Client
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="email", referencedColumnName="fk_email",insertable=false, updatable=false)
	private Client client;

	public Information() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}