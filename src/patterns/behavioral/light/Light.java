package patterns.behavioral.light;

import patterns.behavioral.state.states.LightState;

public class Light {
    private LightState lightState;

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }

    public void action() {
        lightState.action();
    }
}
