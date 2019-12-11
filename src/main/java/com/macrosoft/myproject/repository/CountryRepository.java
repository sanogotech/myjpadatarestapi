package com.macrosoft.myproject.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.macrosoft.myproject.entity.Country;

//@PreAuthorize("hasRole('ROLE_USER')") 
//@Secured("ROLE_USER") 
@RepositoryRestResource
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

	/*
	public List<Country> findByCountryName(@Param("countryName") String countryName);
	
	@Override
	@RestResource(exported = false)
	public void deleteById(Long aLong);
	*/

}
