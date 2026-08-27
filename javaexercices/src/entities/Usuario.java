package entities;

import java.util.Objects;

public class Usuario {
	
	private String Name;

	
	
	public Usuario(String name) {
		
		this.Name = name;
	}
	

	public Usuario() {
		super();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(Name, other.Name);
	}

	@Override
	public String toString() {
	    return String.format(
	        Name
	    );
	}
	
}
