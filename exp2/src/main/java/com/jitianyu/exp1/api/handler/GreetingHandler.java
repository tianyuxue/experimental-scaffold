package com.jitianyu.exp1.api.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

/**
 * @author jitianyu
 * @date 2019-12-18
 */
@Component
public class GreetingHandler {
    public Mono<ServerResponse> hello(ServerRequest ServerRequest) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromValue("Hello, Spring"));
    }

}