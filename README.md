## SonarQube Setup & Code Analysis

Set up SonarQube Community on AWS EC2 (Docker), ran the Maven unit
tests, and scanned the project, including VulnerableCode.java, which
contains intentional issues.

### Results
- Unit tests: 3 run, 0 failures (BUILD SUCCESS)
- Reliability: 5 issues (bugs)
- Maintainability: 18 issues (code smells)
- Total: 23 issues, 107 lines of code

### Fix applied
Updated the Maven compiler target from Java 1.6 to 17 so the
project builds on a modern JDK.
