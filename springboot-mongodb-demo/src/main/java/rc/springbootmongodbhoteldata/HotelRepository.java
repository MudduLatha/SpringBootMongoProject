package rc.springbootmongodbhoteldata;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String>{
    //Hotel findById(String id);
    Hotel findByHotelName(String hotelName);
    List<Hotel> findByPriceLessThan(int maxPrice);

    @Query(value = "{address.city:?0}")
    List<Hotel> findByCity(String city);

}
