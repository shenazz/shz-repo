/**
 * 
 */
package com.shz.starter.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.shz.starter.model.MotorBike;

/**
 * @author shenaz
 *
 */
public interface IMotorBikeRepo extends MongoRepository<MotorBike, String> {

	/**
	 * @return
	 */
	@Query("{'manufacturer':'?0'}")
	public List<MotorBike> findByManufacturer(String manufacturer);

}
