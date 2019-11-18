package managers;

import com.applitools.eyes.selenium.Eyes;

public class ApplitoolManager {
    private Eyes eyes;

    public Eyes getEyes() {
        if (eyes == null)
            eyes = createEyes();
        return eyes;
    }

    private Eyes createEyes() {
        eyes = new Eyes();
        eyes.setApiKey("DIiknoan105aq0JdMeQsmws55uWAAm0DN6aOsbEeqTMJk110");
        return eyes;
    }
}
