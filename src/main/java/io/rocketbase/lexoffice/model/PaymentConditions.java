package io.rocketbase.lexoffice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentConditions {

    @JsonProperty("paymentTermLabel")
    private String paymentTermLabel;

    @JsonProperty("paymentTermDuration")
    private Long paymentTermDuration;

    @JsonProperty("paymentDiscountConditions")
    private PaymentDiscountConditions paymentDiscountConditions;

}
