$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FirstcucumberTest.feature");
formatter.feature({
  "line": 4,
  "name": "verify google.in site is accessible",
  "description": "",
  "id": "verify-google.in-site-is-accessible",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "open google.in",
  "description": "",
  "id": "verify-google.in-site-is-accessible;open-google.in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "chrome driver is open",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "url is entered",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "title contains google",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.chrome_driver_is_open()"
});
formatter.result({
  "duration": 4386590176,
  "status": "passed"
});
formatter.match({
  "location": "Steps.url_is_entered()"
});
formatter.result({
  "duration": 5052564780,
  "status": "passed"
});
formatter.match({
  "location": "Steps.title_contains_google()"
});
formatter.result({
  "duration": 3042707876,
  "status": "passed"
});
});