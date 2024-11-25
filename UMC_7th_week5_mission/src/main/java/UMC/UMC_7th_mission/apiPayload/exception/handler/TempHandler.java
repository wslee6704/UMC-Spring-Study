package UMC.UMC_7th_mission.apiPayload.exception.handler;

import UMC.UMC_7th_mission.apiPayload.code.BaseErrorCode;
import UMC.UMC_7th_mission.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
