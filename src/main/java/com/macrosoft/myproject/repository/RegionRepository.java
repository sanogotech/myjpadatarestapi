package com.macrosoft.myproject.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.macrosoft.myproject.entity.Region;


@Repository
public interface RegionRepository extends PagingAndSortingRepository<Region, Long> {


}