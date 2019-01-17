package com.wx.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@RestController
public class ImageController {


    /**
     * 图片上传
     */
    @PostMapping("/uploadImage")
    public String uploadImage(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {

        if (file.isEmpty()){
            return "";
        }
        //获取文件名字
        String filename = file.getOriginalFilename();
        //获取文件后缀名
        String suffixName = filename.substring(filename.lastIndexOf("."));
        //重新生成文件名
        filename = UUID.randomUUID()+suffixName;
        //设置存储路径
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        //判断路径是否存在如果不存在创建路径
        File file1 = new File(path);
        if(!file1.exists()){
            file1.mkdirs();
        }
        //文件保存
        file.transferTo(new File(path+"/"+filename));

        //将图片路径保存到数据库中
        String imgUrl = "http://localhost:8080/upload/"+filename;

        return imgUrl;
    }


}
