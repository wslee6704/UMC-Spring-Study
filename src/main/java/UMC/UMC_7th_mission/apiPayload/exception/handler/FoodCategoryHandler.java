package UMC.UMC_7th_mission.apiPayload.exception.handler;

import UMC.UMC_7th_mission.apiPayload.code.BaseErrorCode;
import UMC.UMC_7th_mission.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
