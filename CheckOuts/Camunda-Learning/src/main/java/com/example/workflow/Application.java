package com.example.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

}
/*Microsoft Windows [Version 10.0.22000.2176]
(c) Microsoft Corporation. All rights reserved.

C:\WINDOWS\system32>netstart -ano | findstr :8080
'netstart' is not recognized as an internal or external command,
operable program or batch file.

C:\WINDOWS\system32>netstat -ano | findstr :8080
  TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       9164
  TCP    [::]:8080              [::]:0                 LISTENING       9164

C:\WINDOWS\system32>taskkill /F /PID 9164
SUCCESS: The process with PID 9164 has been terminated.

C:\WINDOWS\system32>
*/