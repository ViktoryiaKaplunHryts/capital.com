## capital.com UI tests (junior-friendly)

### Tech stack
- Java 17
- Selenium
- TestNG
- Maven Surefire
- Allure

### How to run

1. Make sure you have **JDK 17** installed and `JAVA_HOME` configured.
2. Run tests:

```bash
mvn test
```

### Notes
- Tests open `https://capital.com/en-int` and navigate to **Markets**.
- Cookie/geo popups can appear in different languages; `BaseTest` closes them softly (won’t fail if not shown).

