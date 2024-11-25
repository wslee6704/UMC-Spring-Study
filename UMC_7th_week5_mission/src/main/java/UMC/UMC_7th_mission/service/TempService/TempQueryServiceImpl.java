package UMC.UMC_7th_mission.service.TempService;

import UMC.UMC_7th_mission.apiPayload.code.status.ErrorStatus;
import UMC.UMC_7th_mission.apiPayload.exception.handler.TempHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}
