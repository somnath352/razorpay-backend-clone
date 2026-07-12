package in.somuxdev.razorpay.merchant.dto.response;

import in.somuxdev.razorpay.common.enums.BusinessType;
import in.somuxdev.razorpay.common.enums.MerchantStatus;

import java.util.UUID;

public record MerchantResponse(
        UUID id,
        String name,
        String email,
        String businessName,
        BusinessType businessType,
        MerchantStatus merchantStatus
) {}
