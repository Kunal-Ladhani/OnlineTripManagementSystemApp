package app.trip.models.travelpackages;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity @Table(name = "Packages")
public class Packages {
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer packageId;
	@Column(length = 45) @NotNull @NotBlank @NotEmpty
	private String packageName;
	
	@Column(length = 45) @NotNull @NotBlank @NotEmpty
	private String packageDescription;
	
	@Enumerated(EnumType.STRING)
	private PackageType packageType;
	@NotNull @Min(0)
	private Integer packageCost;
	
	@NotNull @NotBlank @NotEmpty @Column(length = 45)
	private String paymentDetails;
	
	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Ticket> ticketDetails;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Hotel> hotelDetails;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Booking bookingDetails;
}