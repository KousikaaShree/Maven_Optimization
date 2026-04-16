package com.devops.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main application class for the DevOps optimization demo.
 */
public final class App {
    /**
     * Logger instance.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    /**
     * Private constructor to hide the implicit public one.
     */
    private App() {
        // Utility class
    }



    /**
     * Main entry point of the app.
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        LOGGER.info("Starting DevOps Optimization Target App...");
        System.out.println("Hello DevOps!");
    }
}
