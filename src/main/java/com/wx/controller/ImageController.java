package com.wx.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ImageController {


    /**
     * 图片上传
     */
    @PostMapping("/uploadImage")
    public String uploadImage(HttpServletRequest request){



        //获取文件名字
        //String filename = file.getOriginalFilename();
        //文件大小
        //long size = file.getSize();
        //设置存储路径
        String path = request.getServletContext().getRealPath("/upload");

        System.out.println(path);


        return null;
    }


}
