package com.example.letterboxdwatchlistplus.api

/*

{"Title":"Dog Day Afternoon","Year":"1975","Rated":"R","Released":"25 Dec 1975","Runtime":"125 min","Genre":"Biography, Crime, Drama, Thriller","Director":"Sidney Lumet","Writer":"Frank Pierson (screenplay), P.F. Kluge (based upon a magazine article by), Thomas Moore (based upon a magazine article by)","Actors":"Penelope Allen, Sully Boyar, John Cazale, Beulah Garrick","Plot":"A man robs a bank to pay for his lover's operation, which turns into a hostage situation and a media circus.","Language":"English","Country":"USA","Awards":"Won 1 Oscar. Another 13 wins & 19 nominations.","Poster":"https://m.media-amazon.com/images/M/MV5BODExZmE2ZWItYTIzOC00MzI1LTgyNTktMDBhNmFhY2Y4OTQ3XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg","Ratings":[{"Source":"Internet Movie Database","Value":"8.0/10"},{"Source":"Rotten Tomatoes","Value":"95%"},{"Source":"Metacritic","Value":"86/100"}],"Metascore":"86","imdbRating":"8.0","imdbVotes":"230,310","imdbID":"tt0072890","Type":"movie","DVD":"16 Dec 1997","BoxOffice":"N/A","Production":"WARNER BROTHERS PICTURES","Website":"N/A","Response":"True"}
 */

data class OmdbMovie (
    val Title: String,
    val Year: String,
    val Rated: String,
    val Released: String,
    val Runtime: String,
    val Genre: String,
    val Director: String,
    val Writer: String,
    val Actors: String,
    val Plot: String,
    val Language: String,
    val Country: String,
    val Awards: String,
    val Poster: String
    // TODO: there's more

)