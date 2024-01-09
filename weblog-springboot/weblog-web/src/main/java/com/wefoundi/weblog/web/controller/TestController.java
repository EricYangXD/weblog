package com.wefoundi.weblog.web.controller;

import com.wefoundi.weblog.common.utils.Response;
import com.wefoundi.weblog.web.model.User;
import com.wefoundi.weblog.common.aspect.ApiOperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
//    @RequestMapping("/test")
//    @ApiOperationLog(description = "测试接口")
//    public Response test(@RequestBody @Validated User user, BindingResult bindingResult) {
//        // 主动定义一个运行时异常，分母不能为零
//        int i = 1 / 0;
//        return Response.success();
//    }

    @RequestMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user) {
        return Response.success();
    }

//    @RequestMapping("/test")
//    @ApiOperationLog(description = "测试接口")
//    public ResponseEntity<String> test(@RequestBody @Validated User user, BindingResult bindingResult) {
//        // 手动抛异常，入参是前面定义好的异常码枚举，返参统一交给全局异常处理器搞定
////        throw new BizException(ResponseCodeEnum.PRODUCT_NOT_FOUND);
//        // 主动定义一个运行时异常，分母不能为零
//        int i = 1 / 0;
//        return Response.success();
//
//
//        if (bindingResult.hasErrors()) {
//            String errMsg = bindingResult.getFieldErrors().stream()
//                    .map(FieldError::getDefaultMessage)
//                    .collect(Collectors.joining(","));
//
//            return ResponseEntity.badRequest().body(errMsg);
//        }
//        return ResponseEntity.ok("参数没有任何问题");
//    }

//    public User test(@RequestBody User user){
//        return user;
//    }
}
