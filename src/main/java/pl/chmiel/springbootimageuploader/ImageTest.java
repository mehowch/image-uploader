package pl.chmiel.springbootimageuploader;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ImageTest {

    public static void main(String[] args) throws IOException {

        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dthcqerpx",
                "api_key", "872499266544449",
                "api_secret", "lHM9mMZkNzP-34u-y-qGNFn714Q"));

        File file = new File("C:\\Users\\Lenovo\\Pictures\\Wallpapers\\00678_vancouverdusk_2560x1600.jpg");
        Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());

    }
}
