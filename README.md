# heroku-rest-test
How to deploy a Spring Boot Application to Heroku. 

Don't forget to,
```
heroku login
```
Go on and create and push to heroku.

```
heroku create
git push heroku master
```

Ensure that at least one instance of the app is running and open the site,
```
heroku ps:scale web=1
heroku open
```

## Links to check out
- <url_to_heroku_app>/api/players
- <url_to_heroku_app>/api/players/search/findAllByFirstNameContains?name=some_search_name
- <url_to_heroku_app>/api/players/search/findAllByFirstNameContains?name=some_search_name

## Use Postman to add players

Make a post request to,

<url_to_heroku_app>/api/players

Attach 'raw' JSON in the body,
```
{
	"firstName": "Stefan",
	"lastName": "Edberg"
}
```
