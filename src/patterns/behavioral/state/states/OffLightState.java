package patterns.behavioral.state.states;

public class OffLightState implements LightState {
    @Override
    public void action() {
        System.out.println("Light is OFF");
    }
}
