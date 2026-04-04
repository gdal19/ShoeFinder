package com.shoefinder.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public record ShoeEditRequest(
        Optional<String> name,
        Optional<String> brand,
        Optional<String> color,
        Optional<BigDecimal> price,
        Optional<LocalDate> releaseDate
) {}
