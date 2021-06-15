package com.zs.filevalidation.fileupload.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileuploadService {

	void uploadFile(MultipartFile file) throws IOException;
}
