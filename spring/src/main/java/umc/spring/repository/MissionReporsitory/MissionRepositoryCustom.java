package umc.spring.repository.MissionReporsitory;

import umc.spring.domain.Mission;

import java.util.List;

public interface MissionRepositoryCustom {
    List<Mission> dynamicQueryUserMission(Long userId);

    List<Mission> enableMission(Long userId, String regionName);
}
