package com.nexamart.modal;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Coupen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String code;

	private Double discountPercentage;

	private LocalDate validEndDate;

	private double minimumOrderValue;

	private boolean isActive = true;

	@ManyToMany(mappedBy = "usedCoupons") // mapped by mean it don't create new double it mapped with in user variable
	private Set<User> usedByUsers = new HashSet<>();

}
