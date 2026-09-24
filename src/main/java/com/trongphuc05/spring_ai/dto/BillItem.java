package com.trongphuc05.spring_ai.dto;

public record BillItem(String itemName,
                       String unit,
                       Integer quantity,
                       Double price,
                       Double subTotal
) {
}
