package com.LucasH.introducao_spring;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;

public class Beans {
    @Bean
    public Gson gson() {
        return new Gson();
    }
}
