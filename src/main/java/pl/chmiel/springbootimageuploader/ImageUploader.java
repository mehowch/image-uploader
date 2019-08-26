package pl.chmiel.springbootimageuploader;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class ImageUploader {

    private Cloudinary cloudinary;

    public ImageUploader() {

        cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dthcqerpx",
                "api_key", "872499266544449",
                "api_secret", "lHM9mMZkNzP-34u-y-qGNFn714Q"));
    }

    public String uploadFile(String path) {
        File file = new File(path);
        Map uploadResult = null;
        try {
            uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        } catch (IOException e) {
            // todo
        }

        return "";

    }

    public static void main(String[] args) throws IOException {


    }
}