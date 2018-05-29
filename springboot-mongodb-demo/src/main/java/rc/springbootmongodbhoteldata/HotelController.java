package rc.springbootmongodbhoteldata;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * HotelController class acts as a controller
 */

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    /**
     * Display all the hotels
     */
    @GetMapping("/all")
    public List<Hotel> getAll() {
        List<Hotel> hotels = this.hotelRepository.findAll();
        return hotels;
    }

    @PutMapping
    public void insert(@RequestBody Hotel hotel) {
        this.hotelRepository.insert(hotel);
    }

    @PostMapping
    public void update(@RequestBody Hotel hotel) {
        this.hotelRepository.save(hotel);
    }

   /**@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        this.delete(id);
       //this.hotelRepository.delete(Hotel this.delete(String id));
       this.hotelRepository.delete(Hotel );
   }**/

   /**@GetMapping("/{id}")
   public Hotel getById(@PathVariable("id") String id) {
       Hotel hotel = this.hotelRepository.findbyId(id);
       return hotel;
   }**/

   @GetMapping("/Price/{maxPrice}")
   public List<Hotel> getByPrice(@PathVariable("maxPrice") int maxPrice) {
       List<Hotel> hotels = this.hotelRepository.findByPriceLessThan(maxPrice);
       return hotels;
   }


   /*@GetMapping("/hotelName/")
   public Hotel getByHotelName(@PathVariable("hotelName") String hotelName) {
       Hotel hotel = this.hotelRepository.findByHotelName(hotelName);
       return hotel;
   }

   @GetMapping("/address/{city}")
   public List<Hotel> getByCity(@PathVariable("city") String city) {
       List<Hotel> hotels = this.hotelRepository.findByCity(city);
       return hotels;
   }*/
    }




