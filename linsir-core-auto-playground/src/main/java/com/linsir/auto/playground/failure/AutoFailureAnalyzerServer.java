package com.linsir.auto.playground.failure;


import com.linsir.core.auto.annotation.AutoFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * description：
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/1/20 14:53
 */
@AutoFailureAnalyzer
public class AutoFailureAnalyzerServer implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable failure) {
        System.out.println(failure.getMessage());
        return new FailureAnalysis("系统失败","启动",failure);
    }
}
