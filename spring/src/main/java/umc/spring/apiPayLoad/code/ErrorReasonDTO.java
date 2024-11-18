package umc.spring.apiPayLoad.code;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class ErrorReasonDTO {

    private HttpStatus httpStatus;

    private final boolean isSuccess;
    private final String message;
    private final String code;

    public boolean getIsSuccess() {
        return isSuccess;
    }
}
