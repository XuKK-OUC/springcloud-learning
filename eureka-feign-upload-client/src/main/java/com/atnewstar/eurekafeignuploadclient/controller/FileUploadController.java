package com.atnewstar.eurekafeignuploadclient.controller;

import com.atnewstar.eurekafeignuploadclient.service.UploadService;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Xukaikai
 * @date 2019/9/16 14:36
 */
@RestController
public class FileUploadController {
    @Autowired
    private UploadService uploadService;

    @RequestMapping("/upload")
    public void testHandleFileUpload() {
        Logger log = LoggerFactory.getLogger(FileUploadController.class);

        File file = new File("D:\\upload.txt");
        DiskFileItem fileItem = (DiskFileItem) new DiskFileItemFactory().createItem("file",
                MediaType.TEXT_PLAIN_VALUE, true, file.getName());

        try (InputStream input = new FileInputStream(file); OutputStream os = fileItem.getOutputStream()) {
            IOUtils.copy(input, os);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid file: " + e, e);
        }

        MultipartFile multi = new CommonsMultipartFile(fileItem);

        log.info(uploadService.handleFileUpload(multi));
        System.out.println("信息"+uploadService.handleFileUpload(multi));
    }

}
