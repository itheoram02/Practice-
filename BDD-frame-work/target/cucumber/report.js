$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/lenovo/Desktop/git_hub/BDD-frame-work/src/test/java/features/TF_login_ScenarioOutline.feature");
formatter.feature({
  "line": 2,
  "name": "validate Techfios login functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@loginPage"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "1 user should be able to login with the valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@positiveTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on the techfios login page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user click signin button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user will land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "browser will closed automatically",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123"
      ],
      "line": 21,
      "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is opening browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_lounching_browser()"
});
formatter.result({
  "duration": 6893199000,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "1 user should be able to login with the valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@positiveTest"
    },
    {
      "line": 1,
      "name": "@loginPage"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on the techfios login page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user click signin button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user will land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "browser will closed automatically",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 324826200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 13
    },
    {
      "val": "abc123",
      "offset": 37
    }
  ],
  "location": "LoginSteps.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 397616200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_signin_button()"
});
formatter.result({
  "duration": 980110500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_will_land_on_dashboard_page()"
});
formatter.result({
  "duration": 23800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.browser_will_closed_automatically()"
});
formatter.result({
  "duration": 26600,
  "status": "passed"
});
});