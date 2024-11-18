package umc.spring.service.TempService;

import lombok.RequiredArgsConstructor;
import org.hibernate.tool.schema.spi.ExceptionHandler;
import org.springframework.stereotype.Service;
import org.xml.sax.ErrorHandler;
import umc.spring.apiPayLoad.code.status.ErrorStatus;
import umc.spring.apiPayLoad.exception.handler.TempHandler;

@Service
@RequiredArgsConstructor
public class TempQueryImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if(flag==1){
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
        }
    }
}