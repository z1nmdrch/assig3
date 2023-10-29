class Component implements Observer {
    private String componentName;

    public Component(String componentName) {
        this.componentName = componentName;
    }

    @Override
    public void update(String message) {
        System.out.println(componentName + " received an update: " + message);
    }
}
