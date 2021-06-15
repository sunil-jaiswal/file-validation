package com.zs.filevalidation.fileupload.service.impl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.zs.filevalidation.fileupload.service.FileuploadService;

@Service
public class FileuploadServiceImpl implements FileuploadService {

	@Override
	public void uploadFile(MultipartFile file) throws IOException {
		String content = new String(file.getBytes(), StandardCharsets.UTF_8);
		//System.out.println(content);
		InputStream inputStream = file.getInputStream();
		new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
		                    .lines()
		                    .forEach(System.out::println);
	}

}
