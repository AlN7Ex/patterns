package patterns.behavioral.state.states;

public class OnLightState implements LightState {
    @Override
    public void action() {
        System.out.println("Light is ON");
    }
}
