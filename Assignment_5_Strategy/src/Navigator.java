import java.util.Objects;
public class Navigator {
    private RouteStrategy strategy;
    public Navigator(RouteStrategy strategy) { setStrategy(strategy); }
    public void setStrategy(RouteStrategy strategy) { this.strategy = Objects.requireNonNull(strategy, "Strategy is required"); }
    public String planRoute(String start, String destination) {
        if (start == null || start.isBlank() || destination == null || destination.isBlank()) throw new IllegalArgumentException("Both locations are required");
        return strategy.buildRoute(start, destination);
    }
}
