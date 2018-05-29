package rc.springbootmongodbhoteldata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * dataBase class inserts the data into the database
 */

@Component
public class dataBase implements CommandLineRunner{
    private HotelRepository hotelRepository;

    public dataBase(HotelRepository hotelRepository) {

        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel Paramount = new Hotel(
                "1",
                "Paramount",
                79,
                new Address("235 W ", "46th St","New York", "New York", "United States" , "10036"),
                Arrays.asList(
                        new Review("Latha", 8, true),
                        new Review("Pratap", 9, true)
                )
        );


        Hotel NewYork_Hilton_Midtown = new Hotel(
                "2",
                "NewYork_Hilton_Midtown",
                156,
                new Address("1335", "6th Ave","New York", "New York","United States", "10019"),
                Arrays.asList(
                        new Review("Latha", 7, true),
                        new Review("Pratap", 8, true)
                )
        );


        Hotel Hotel_Edison = new Hotel(
                "3",
                "Hotel_Edison",
                116,
                new Address("228 W", "47th St","New York", "New York","United States", "10036"),
                Arrays.asList(
                        new Review("Latha", 6, true),
                        new Review("Pratap", 6, true)
                )
        );

        Hotel Willington = new Hotel(
                "4",
                "Willington",
                79,
                new Address("871 7th Avenue", "55th Street","New York", "New York", "United States" , "10019"),
                Arrays.asList(
                        new Review("Latha", 8, true),
                        new Review("Pratap", 9, true)
                )
        );
        //Drop all Hotels
        this.hotelRepository.deleteAll();

        //add hotels to database
        List<Hotel> hotels = Arrays.asList(Paramount, NewYork_Hilton_Midtown, Hotel_Edison, Willington);
        this.hotelRepository.saveAll(hotels);
    }
}
