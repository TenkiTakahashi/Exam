package jp.ac.J.ohara.senatyan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column(length = 10, nullable = false)
	private String NO;
	
	@Column(length = 10, nullable = true)
	private String NAME;
	
	@Column(length = 3, nullable = true)
	private Integer ENT_YEAR;

	@Column(length = 3, nullable = true)
	private String CLASS_NUM;

	@Column(nullable = true)
	private Boolean IS_ATTEND;
	
	@Column(length = 3, nullable = true)
	private String SCHOOL_CD;

}
