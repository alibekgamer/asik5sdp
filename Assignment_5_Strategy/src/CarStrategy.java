public class CarStrategy implements RouteStrategy { public String buildRoute(String start, String destination) { return "Drive from " + start + " to " + destination + " using main roads."; } }
