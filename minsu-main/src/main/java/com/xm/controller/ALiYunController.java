package com.xm.controller;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.xm.utils.Result;
import com.xm.utils.XmException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@RestController
@RequestMapping("/xm/aly")
@CrossOrigin
public class ALiYunController {

    @Value("https://oss-cn-shanghai.aliyuncs.com")
    private String endpoint;
    @Value("LTAI5tAiWxwvc1WtWPMRYtXv")
    private String accessKeyId;
    @Value("V0VsTjeqNKtFSPnEyErfVdVDnvtM9Z")
    private String accessKeySecret;
    @Value("minsu-01")
    private String bucketName;

    @PostMapping("loadImage")
    public Result loadImage(@RequestBody MultipartFile file) {

        // 创建OSSClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        String fileName = "";
        try {
            InputStream inputStream = file.getInputStream();
            //生成文件名
            fileName = file.getOriginalFilename();
            fileName = UUID.randomUUID().toString().replaceAll("-", "") + fileName;
            // 创建PutObjectRequest对象
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, fileName, inputStream);
            // 设置该属性可以返回response。如果不设置，则返回的response为空
            putObjectRequest.setProcess("true");
            // 创建PutObject请求
            ossClient.putObject(putObjectRequest);
        } catch (OSSException oe) {
            throw new XmException("文件上传出错");
        } catch (ClientException ce) {
            throw new XmException("文件上传出错");
        } catch (IOException e) {
            throw new XmException("文件上传出错");
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
        return Result.success("https:" + bucketName + "." + endpoint + "/" + fileName);
    }

}
