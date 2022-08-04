$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/actine.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking application",
  "description": "",
  "id": "hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "login page in adactin application",
  "description": "",
  "id": "hotel-booking-application;login-page-in-adactin-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-application;login-page-in-adactin-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-application;login-page-in-adactin-application;;1"
    },
    {
      "cells": [
        "prabu",
        "123"
      ],
      "line": 12,
      "id": "hotel-booking-application;login-page-in-adactin-application;;2"
    },
    {
      "cells": [
        "mech",
        "123"
      ],
      "line": 13,
      "id": "hotel-booking-application;login-page-in-adactin-application;;3"
    },
    {
      "cells": [
        "prabumech",
        "Prabu123"
      ],
      "line": 14,
      "id": "hotel-booking-application;login-page-in-adactin-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "login page in adactin application",
  "description": "",
  "id": "hotel-booking-application;login-page-in-adactin-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"prabu\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"123\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition_file.user_launch_adactin_application()"
});
formatter.result({
  "duration": 4501310500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prabu",
      "offset": 12
    }
  ],
  "location": "Step_definition_file.user_enter_in_username_field(String)"
});
formatter.result({
  "duration": 89433300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 12
    }
  ],
  "location": "Step_definition_file.user_enter_in_password_field(String)"
});
formatter.result({
  "duration": 68154000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition_file.user_clicks_login_button()"
});
formatter.result({
  "duration": 502064900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "login page in adactin application",
  "description": "",
  "id": "hotel-booking-application;login-page-in-adactin-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"mech\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"123\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition_file.user_launch_adactin_application()"
});
formatter.result({
  "duration": 702506000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mech",
      "offset": 12
    }
  ],
  "location": "Step_definition_file.user_enter_in_username_field(String)"
});
formatter.result({
  "duration": 70518700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 12
    }
  ],
  "location": "Step_definition_file.user_enter_in_password_field(String)"
});
formatter.result({
  "duration": 64148600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition_file.user_clicks_login_button()"
});
formatter.result({
  "duration": 505804300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "login page in adactin application",
  "description": "",
  "id": "hotel-booking-application;login-page-in-adactin-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"prabumech\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"Prabu123\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition_file.user_launch_adactin_application()"
});
formatter.result({
  "duration": 421823800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prabumech",
      "offset": 12
    }
  ],
  "location": "Step_definition_file.user_enter_in_username_field(String)"
});
formatter.result({
  "duration": 75298700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prabu123",
      "offset": 12
    }
  ],
  "location": "Step_definition_file.user_enter_in_password_field(String)"
});
formatter.result({
  "duration": 71300600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition_file.user_clicks_login_button()"
});
formatter.result({
  "duration": 1681585200,
  "status": "passed"
});
});