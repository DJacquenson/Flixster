📝 # Flix
Flix is an app that allows users to browse movie from the [The Movie Database](http://docs.themoviedb.apiary.io/#).

📝 `NOTE` Paste this template at the top of your existing `README.md` file from part 1 of this assignment. (🚫 Remove this paragraph after after checking off completed user stories)

## Flix Part 2

### User Stories

#### REQUIRED (10pts)

- [X] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [X] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [X] Trailers for popular movies are played automatically when the movie is selected (1 point).
- [X] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  - [ ] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- [X] Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
- [ ] Apply the popular ButterKnife annotation library to reduce view boilerplate. (1 point)
- [ ] Add a rounded corners for the images using the Glide transformations. (1 point)

### App Walkthough GIF

`TODO://` Add the URL to your animated app walkthough `gif` in the image tag below, `YOUR_GIF_URL_HERE`. Make sure the gif actually renders and animates when viewing this README. (🚫 Remove this paragraph after after adding gif)

<img src="Walkthrough..gif" width=250><br>

### Notes

Describe any challenges encountered while building the app.
My Challenges were, graddle synchronization and creating parcelable(@parcel) in movie class

## Open-source libraries used
- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android



Flix Part 1
User Stories

TODO:// In the User Stories section below, add an x in the -[ ] like this - [x] for any user story you complete. (no_entry_sign Remove this paragraph after after checking off completed user stories)
REQUIRED (10pts)

    (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

BONUS

   [X] (2pts) Views should be responsive for both landscape/portrait mode.
   [X] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   [X] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

   [X] (2pts) Display a nice default placeholder graphic for each image during loading

   [X] (2pts) Improved the user interface by experimenting with styling and coloring.

   [X] (2pts) For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.

App Walkthough GIF

TODO:// Add the URL to your animated app walkthough gif in the image tag below, YOUR_GIF_URL_HERE. Make sure the gif actually renders and animates when viewing this README. (no_entry_sign Remove this paragraph after after adding gif)


<img src="Walkthrough..gif" width=250><br>

Notes

Describe any challenges encountered while building the app.
My Challenges were, graddle synchronization and creating parcelable(@parcel) in movie class
Open-source libraries used

    Android Async HTTP - Simple asynchronous HTTP requests with JSON parsing
    Glide - Image loading and caching library for Androids

