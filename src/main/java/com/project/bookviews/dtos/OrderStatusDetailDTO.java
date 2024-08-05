// src/main/java/com/project/bookviews/dtos/OrderStatusDetailDTO.java
package com.project.bookviews.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderStatusDetailDTO {
    @JsonProperty("order_id")
    private Long orderId; // Thêm thuộc tính orderId
    @JsonProperty("status")
    private String status;
    @JsonProperty("ebook_id")
    private Long ebookId;

    public OrderStatusDetailDTO(Long orderId, String status, Long ebookId) {

        this.orderId = orderId;
        this.status = status;
        this.ebookId = ebookId;
    }
}
