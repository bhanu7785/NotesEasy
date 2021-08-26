package com.notes.easy.helper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	
	public boolean uploadFile(MultipartFile multipartfile) {
		boolean f=false;
		try {
		    String upload_Dir=new ClassPathResource("/static/files").getFile().getAbsolutePath();
             Path path = Paths.get(upload_Dir+File.separator+multipartfile.getOriginalFilename());
			
			Files.copy(multipartfile.getInputStream(),path,StandardCopyOption.REPLACE_EXISTING);
			f=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}

}
