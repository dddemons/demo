package com.junc.demo.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.junc.demo.DemoApplication;
import com.junc.demo.entity.Copy;
import com.junc.demo.pojo.CopyVo;
import com.junc.demo.service.CopyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

import java.net.URLDecoder;


@RestController
@RequestMapping("/junc")
public class CopyController {
    @Autowired
    private CopyService copyService;

    private Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    //ResponseEntity
    @RequestMapping(value = "/listCopy.do",method = RequestMethod.POST)
    public ResponseEntity<CopyVo> ListCopy(@RequestBody String body, HttpServletRequest request){
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        CopyVo thisPojo = new CopyVo();

        try {
            String decodeStr = URLDecoder.decode(body, "UTF-8");
            thisPojo = mapper.readValue(decodeStr, CopyVo.class);
            copyService.list(thisPojo);
        }catch (Exception e){
            thisPojo.operationFail();
            thisPojo.setPrompt("controller错误");
        }
        return new ResponseEntity<CopyVo>(thisPojo,HttpStatus.OK);
    }


    @RequestMapping(value = "/getCopyById.do",method = RequestMethod.POST)
    public ResponseEntity<CopyVo> getCopyById(@RequestBody String body,HttpServletRequest request){

        ObjectMapper mapper = new ObjectMapper();
        CopyVo thisPojo = new CopyVo();
        try {
            String decodeStr = URLDecoder.decode(body, "UTF-8");
            thisPojo = mapper.readValue(decodeStr,CopyVo.class);
            thisPojo = copyService.getById(thisPojo);
        }catch (Exception e){
            thisPojo.operationFail();
            thisPojo.setPrompt("controller错误");
        }

        return new ResponseEntity<CopyVo>(thisPojo,HttpStatus.OK);

    }

    @RequestMapping(value = "/saveCopy.do",method = RequestMethod.POST)
    public ResponseEntity<CopyVo> saveCopy(@RequestBody String body,HttpServletRequest request){
        ObjectMapper mapper = new ObjectMapper();
        CopyVo thisPojo = new CopyVo();
        try {
            String decodeStr = URLDecoder.decode(body, "UTF-8");
            thisPojo = mapper.readValue(decodeStr,CopyVo.class);
            thisPojo = copyService.save(thisPojo);
        }catch (Exception e){
            thisPojo.operationFail();
            thisPojo.setPrompt("controller错误");
        }
        return new ResponseEntity<CopyVo>(thisPojo,HttpStatus.OK);
    }


}
