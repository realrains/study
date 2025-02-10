package net.realrain;

public class TestsEnvironment {
    private JavaSpecification javaSpecification;
    private OperationSystem operationSystem;

    public TestsEnvironment(JavaSpecification javaSpecification, OperationSystem operationSystem) {
        this.javaSpecification = javaSpecification;
        this.operationSystem = operationSystem;
    }

    public boolean isWindows() {
        return this.operationSystem.getName().contains("Windows");
    }

    public boolean isAmd64Architecture() {
        return this.operationSystem.getArchitecture().contains("amd64");
    }

    public String getJavaVersion() {
        return this.javaSpecification.getVersion();
    }
}
