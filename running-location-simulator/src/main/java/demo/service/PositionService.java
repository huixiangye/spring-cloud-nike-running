package demo.service;

/**
 * Created by yehuixiang on 6/29/18.
 */

import demo.model.CurrentPosition;

public interface PositionService {

    void processPositionInfo(long id, CurrentPosition currentPosition, boolean sendPositionsToDistributionService);
}