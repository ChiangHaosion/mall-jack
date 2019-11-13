package com.example.malljack.service;

import com.example.malljack.dto.OssCallbackResult;
import com.example.malljack.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Haosion
 */
public interface OssService {
    /**
     * oss上传策略生成
     * @return
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     * @param request
     * @return
     */
    OssCallbackResult callback(HttpServletRequest request);
}
