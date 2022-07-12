package br.com.luizMaestri.service;

import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciService {
    @CacheResult(cacheName = "alticci")
    public int calculate(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        return calculate(n - 3) + calculate(n -2);
    }
}
