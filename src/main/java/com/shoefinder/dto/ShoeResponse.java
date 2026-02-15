package com.shoefinder.dto;

import java.time.LocalDate;

public record ShoeResponse(
                            int id,
                            String name,
                            String brade,
                            String color,
                            int price,
                            LocalDate releaseDate
                        ) {}
