$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Virgin Game HomePage",
  "description": "",
  "id": "virgin-game-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4360712800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should navigated to Slingo  with vergin games page successfully",
  "description": "",
  "id": "virgin-game-homepage;user-should-navigated-to-slingo--with-vergin-games-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on Slingo tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be navigated to slingo with vergin games page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 82229000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userAcceptCookies()"
});
formatter.result({
  "duration": 2146365700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userClickOnSlingoTab()"
});
formatter.result({
  "duration": 1107566700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userShouldBeNavigatedToSlingoWithVerginGamesPageSuccessfully()"
});
formatter.result({
  "duration": 1031873900,
  "status": "passed"
});
formatter.after({
  "duration": 1162023900,
  "status": "passed"
});
});