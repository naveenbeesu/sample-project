import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carmarketplace.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}