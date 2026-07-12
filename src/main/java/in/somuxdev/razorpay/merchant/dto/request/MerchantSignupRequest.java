package in.somuxdev.razorpay.merchant.dto.request;

import in.somuxdev.razorpay.common.enums.BusinessType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record MerchantSignupRequest(

        @NotNull(message = "Name is required")
        @Size(max = 50)
        String name,

        @NotNull(message = "Email is required")
        @Email
        String email,

        @NotNull(message = "Password is required")
        @Size(min = 8, message = "Password should be at least 8 characters long")
        String password,

        @Size(max = 50)
        String businessName,

        BusinessType businessType
) {}
