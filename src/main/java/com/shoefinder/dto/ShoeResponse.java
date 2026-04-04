package com.shoefinder.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ShoeResponse(
                            Long id,
                            String name,
                            String brand,
                            String color,
                            BigDecimal price,
                            LocalDate releaseDate
                        ) {}
