package chornarin.com.kh.Phone_Shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import chornarin.com.kh.Phone_Shop.models.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

    List<Brand> findByNameLike(String name);

}
