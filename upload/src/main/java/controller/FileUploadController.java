package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

@Controller
@RequestMapping("/file")
public class FileUploadController {
    @RequestMapping("/upload1")
    public void upload1(@RequestParam("file") CommonsMultipartFile file){
        long start = System.currentTimeMillis();
        String parent = "E://a";
        String fileName = new Date().getTime()+"";
        String type = file.getOriginalFilename();
        File desc = new File(parent,fileName+type);
        try{
            InputStream in = file.getInputStream();
            OutputStream out = new FileOutputStream(desc);
            int len;
            while((len=in.read())!=-1){
                out.write(len);
            }
            out.flush();out.close();in.close();
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
        System.out.println("上传完毕！");
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000+"秒");
    }
    @RequestMapping("/upload2")
    public void upload2(@RequestParam("file") CommonsMultipartFile file){
        long start = System.currentTimeMillis();
        String parent = "E://a";
        String fileName = new Date().getTime()+"";
        String type = file.getOriginalFilename();
        File desc = new File(parent,fileName+type);
        try{
            file.transferTo(desc);
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000+"秒");
    }

}
