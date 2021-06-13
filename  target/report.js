$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/datatable.feature");
formatter.feature({
  "name": "New Account creation and signin",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "As an user, I want to create new account sothat I can sign in",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the user is in homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Datatable_Stepdefinition.the_user_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks create new account",
  "keyword": "When "
});
formatter.match({
  "location": "Datatable_Stepdefinition.the_user_clicks_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enters the Customer name",
  "rows": [
    {
      "cells": [
        "Saradha",
        "",
        "Testname2"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Datatable_Stepdefinition.the_users_enters_the_Customer_name(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enters the Email",
  "keyword": "And "
});
formatter.match({
  "location": "Datatable_Stepdefinition.the_users_enters_the_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enters the Password",
  "keyword": "And "
});
formatter.match({
  "location": "Datatable_Stepdefinition.the_users_enters_the_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users reenters the password",
  "keyword": "And "
});
formatter.match({
  "location": "Datatable_Stepdefinition.the_users_reenters_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users clicks Continue",
  "keyword": "And "
});
formatter.match({
  "location": "Datatable_Stepdefinition.the_users_clicks_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the relevant message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatable_Stepdefinition.verify_the_relevant_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});