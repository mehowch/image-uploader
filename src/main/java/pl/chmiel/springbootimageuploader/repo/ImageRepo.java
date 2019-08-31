package pl.chmiel.springbootimageuploader.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.chmiel.springbootimageuploader.model.Image;

public interface ImageRepo extends JpaRepository<Image, Long> {



}
