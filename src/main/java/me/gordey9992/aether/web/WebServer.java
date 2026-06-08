package me.gordey9992.aether.web;

import static spark.Spark.*;

public class WebServer {
    private final int port;
    private final String password;
    
    public WebServer(int port, String password) {
        this.port = port;
        this.password = password;
    }
    
    public void start() {
        port(port);
        before("/menus/*", (req, res) -> {
            String pwd = req.queryParams("password");
            if (pwd == null || !pwd.equals(password)) {
                halt(401, "Unauthorized");
            }
        });
        get("/menus", (req, res) -> "<h1>Aether Menu Editor</h1><p>Working!</p>");
        init();
    }
    
    public void stop() {
        stop();
    }
}
