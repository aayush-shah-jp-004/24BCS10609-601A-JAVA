import java.util.ArrayList;
import java.util.List;

interface Monitoring {
    void execute();
}

interface IdentityVerification extends Monitoring {}
interface EnvironmentCheck extends Monitoring {}
interface BehaviourMonitoring extends Monitoring {}

class HumanIdentity implements IdentityVerification {
    public void execute() {
        System.out.println("Human Identity Verification");
    }
}

class AIIdentity implements IdentityVerification {
    public void execute() {
        System.out.println("AI Identity Verification");
    }
}

class BiometricIdentity implements IdentityVerification {
    public void execute() {
        System.out.println("Biometric Identity Verification");
    }
}

class AIEnvironmentCheck implements EnvironmentCheck {
    public void execute() {
        System.out.println("AI Environment Check");
    }
}

class HumanBehaviourMonitoring implements BehaviourMonitoring {
    public void execute() {
        System.out.println("Human Behaviour Monitoring");
    }
}

class AIBehaviourMonitoring implements BehaviourMonitoring {
    public void execute() {
        System.out.println("AI Behaviour Monitoring");
    }
}

class ProctoringController {
    private List<Monitoring> pipeline = new ArrayList<>();

    public void addStep(Monitoring m) {
        pipeline.add(m);
    }

    public void startExam() {
        for (Monitoring m : pipeline) {
            m.execute();
        }
    }
}

public class Experiment1 {
    public static void main(String[] args) {
        ProctoringController controller = new ProctoringController();

        controller.addStep(new BiometricIdentity());
        controller.addStep(new AIEnvironmentCheck());
        controller.addStep(new AIBehaviourMonitoring());

        controller.startExam();
    }
}
