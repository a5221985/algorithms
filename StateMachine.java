import java.util.Map;
import java.util.HashMap;

public class StateMachine {
    State state = State.S0;
    Map<State, Map<Input, Function>> functionMapping;

    public StateMachine() {
        this.functionMapping = new HashMap<>();
    }

    public StateMachine(Map<State, Map<Input, Function>> functionMapping) {
        if (functionMapping == null)
            this.functionMapping = new HashMap<>();
        this.functionMapping = functionMapping;
    }

    public synchronized State transition(Input input) {
        this.state = functionMapping.get(state).get(input).deriveNextState(this.state);
        return this.state; 
    }

    public static void main(String[] args) {
        Map<State, Map<Input, Function>> functionMap = new HashMap<>();
        Map<Input, Function> s0Map = new HashMap<>();
        s0Map.put(Input.A, new FAS0());
        s0Map.put(Input.B, new FBS0());
        Map<Input, Function> s1Map = new HashMap<>();
        s1Map.put(Input.A, new FAS1());
        s1Map.put(Input.B, new FBS1());
        Map<Input, Function> s2Map = new HashMap<>();
        s2Map.put(Input.A, new FAS2());
        s2Map.put(Input.B, new FBS2());
        functionMap.put(State.S0, s0Map);
        functionMap.put(State.S1, s1Map);
        functionMap.put(State.S2, s2Map);
        StateMachine sm = new StateMachine(functionMap);

        System.out.println(sm.transition(Input.A));
        System.out.println(sm.transition(Input.B));
    }

    public synchronized State getState() {
        return state;
    }

    public synchronized void setState(State state) {
        this.state = state;
    }
}

enum State {
    S0,
    S1,
    S2
}

enum Input {
    A,
    B
}

interface Function {
    State deriveNextState(State state);
}

class FAS0 implements Function {
    public State deriveNextState(State state) {
       if (state == state.S0)
           return state.S0;
       return state; 
    }
}

class FAS1 implements Function {
    public State deriveNextState(State state) {
       if (state == state.S1)
           return state.S2;
       return state; 
    }
}

class FAS2 implements Function {
    public State deriveNextState(State state) {
       if (state == state.S2)
           return state.S1;
       return state; 
    }
}

class FBS0 implements Function {
    public State deriveNextState(State state) {
       if (state == state.S0)
           return state.S1;
       return state; 
    }
}

class FBS1 implements Function {
    public State deriveNextState(State state) {
       if (state == state.S1)
           return state.S0;
       return state; 
    }
}

class FBS2 implements Function {
    public State deriveNextState(State state) {
       if (state == state.S2)
           return state.S2;
       return state; 
    }
}
