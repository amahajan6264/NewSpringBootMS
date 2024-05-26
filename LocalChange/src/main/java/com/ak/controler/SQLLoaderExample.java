package com.ak.controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class SQLLoaderExample {

    public static void main(String[] args) {
        String sqlLoaderPath = "sqlldr";  // Path to SQL*Loader executable, ensure it is in your system PATH
        String user = "system";           // Database username
        String password = "tiger";        // Database password
        String database = "localhost:1521/orcl";  // Database connection string
        String controlFile = "C:\\sqlldrexmaple\\load.ctl";  // Path to the control file
        String logFile = "D:\\Java All\\sqlldrexmaple\\load.log";
        File file = new File(controlFile);
        if (!file.exists()) {
            System.err.println("Control file does not exist: " + controlFile);
            return;
        }

        try {
            // Construct the command
            String command = String.format("%s %s/%s@%s control=%s log=%s", 
                    sqlLoaderPath, user, password, database, controlFile,logFile);
            
            System.out.println("Executing command: " + command);

            // Execute the command
            Process process = Runtime.getRuntime().exec(command);

            // Read the output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Read the error output (if any)
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errorReader.readLine()) != null) {
                System.err.println(line);
            }
            errorReader.close();

            // Wait for the process to complete
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Data loaded successfully.");
            } else {
                System.err.println("Error occurred during data load. Exit code: " + exitCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
