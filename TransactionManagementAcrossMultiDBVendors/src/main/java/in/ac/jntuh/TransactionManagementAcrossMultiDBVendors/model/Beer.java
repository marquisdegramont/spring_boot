package in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "beer")
// causes Lombok to generate toString(), equals(), hashCode(), getter() & setter(), and Required arguments constructor in one go.

@Component
public class Beer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name = "beer_name", nullable = false)
	String name;
	@Column(name = "beer_style", nullable = false)
	String style;
	String malt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getMalt() {
		return malt;
	}

	public void setMalt(String malt) {
		this.malt = malt;
	}

	@Override
	public String toString() {
		return "Beer [id=" + id + ", name=" + name + ", style=" + style + ", malt=" + malt + "]";
	}

}
