package com.example.actuator.webflux.health;

import reactor.core.publisher.Mono;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.ReactiveHealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements ReactiveHealthIndicator {

	@Override
	public Mono<Health> health() {
		return Mono.just(Health.up().withDetail("hello", "world").build());
	}

}
