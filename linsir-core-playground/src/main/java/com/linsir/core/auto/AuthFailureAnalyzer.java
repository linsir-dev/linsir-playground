package com.linsir.core.auto;

import com.linsir.core.auto.annotation.AutoFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * @ClassName : AuthFailureAnalyzer
 * @Description :
 * @Author : Linsir
 * @Date: 2023-12-26 09:08
 */
@AutoFailureAnalyzer
public class AuthFailureAnalyzer implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable failure) {
        return new FailureAnalysis("啓動錯誤，請查找...", failure.getMessage(), failure);
    }
}
