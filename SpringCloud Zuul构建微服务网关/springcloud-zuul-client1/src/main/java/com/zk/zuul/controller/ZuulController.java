package com.zk.zuul.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class ZuulController {
    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id){
        return "the request2 id is:"+id;

    }
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String handleFileUpload(@RequestParam(value = "file",required = true) MultipartFile file) throws IOException {
        byte[] bytes=file.getBytes();
        File fileToSave=new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes,fileToSave);
        return fileToSave.getAbsolutePath();
    }
}
