public class WalkStrategy implements RouteStrategy { public String buildRoute(String start, String destination) { return "Walk from " + start + " to " + destination + " using pedestrian paths."; } }
