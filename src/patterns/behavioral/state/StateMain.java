package patterns.behavioral.state;

import patterns.behavioral.state.states.OffLightState;
import patterns.behavioral.state.states.OnLightState;

public class StateMain {
    public static void main(String[] args) {
        Light light = new Light();
        light.setLightState(new OnLightState());
        light.action();

        light.setLightState(new OffLightState());
        light.action();
    }
}
