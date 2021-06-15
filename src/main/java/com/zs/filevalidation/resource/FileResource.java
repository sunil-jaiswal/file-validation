package com.zs.filevalidation.resource;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.zs.filevalidation.fileupload.service.FileuploadService;

@RestController
public class FileResource {

	@Autowired
	private FileuploadService fileuploadService;
	
	@GetMapping(value = "test", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getTest(){
		return "hello";
	}
	
	@PostMapping(value = "uploadTextFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void uploadTextFile(@RequestParam(value = "uploadedFile", required = false) MultipartFile file, HttpServletRequest request) throws IOException {
		this.fileuploadService.uploadFile(file);
	}
}
