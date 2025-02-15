package org.example.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void connect() {
        assertTrue(dbConnection.isConnected(),"The database is connected before each test");
    }

    @Test
    void testConnectionIsClosedAfterDisconnect() {
        // First, disconnect explicitly.
        dbConnection.disconnect();
        // Then verify the connection state.
        assertFalse(dbConnection.isConnected(), "The database should be disconnected after calling disconnect().");
    }
}