
 /***
  * ################################################################################################
  * #                                                                                              #
  * #   Copyright (C)  [2019]  [RideNext Software Solutions Pvt Ltd]. All rights  reserved         #
  * #                                                                                              #
  * ################################################################################################
 ****/

package com.nbi.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.nbi.entity.ESDU;

@Repository
public interface DURepository extends ElasticsearchRepository<ESDU, String> {
	


}
