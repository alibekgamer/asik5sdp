public class CycleStrategy implements RouteStrategy { public String buildRoute(String start, String destination) { return "Cycle from " + start + " to " + destination + " using bike lanes."; } }
