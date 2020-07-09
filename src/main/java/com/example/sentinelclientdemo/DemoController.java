package com.example.sentinelclientdemo;

import com.module.users.generate.TUser;
import com.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: wei.shen
 * @date: 2020/3/4
 */
@RestController
public class DemoController {

    @Autowired
    private UserDemoService userDemoService;

    @GetMapping(value = "/web")
    public ResponseEntity<String> submit() {
        return ResponseEntity.ok("200");
    }

    @GetMapping(value="/insertUser")
    public ResponseEntity<TUser> insertUser(@RequestParam(value="name") String name,@RequestParam(value="tenantId") Long tenantId) {
        //userDemoService.demoInsert(name);
        return ResponseEntity.ok(userDemoService.demoInsert(name,tenantId));
    }

    @GetMapping(value="/list")
    public ResponseEntity<List<TUser>> listusers(@RequestParam(value="tenantId",required = false) Long tenantId) {
        //userDemoService.demoInsert(name);
        return ResponseEntity.ok(userDemoService.queryList(tenantId));
    }
}
