package com.example.letterboxdwatchlistplus.api

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/*

{"Title":"Dog Day Afternoon","Year":"1975","Rated":"R","Released":"25 Dec 1975","Runtime":"125 min","Genre":"Biography, Crime, Drama, Thriller","Director":"Sidney Lumet","Writer":"Frank Pierson (screenplay), P.F. Kluge (based upon a magazine article by), Thomas Moore (based upon a magazine article by)","Actors":"Penelope Allen, Sully Boyar, John Cazale, Beulah Garrick","Plot":"A man robs a bank to pay for his lover's operation, which turns into a hostage situation and a media circus.","Language":"English","Country":"USA","Awards":"Won 1 Oscar. Another 13 wins & 19 nominations.","Poster":"https://m.media-amazon.com/images/M/MV5BODExZmE2ZWItYTIzOC00MzI1LTgyNTktMDBhNmFhY2Y4OTQ3XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg","Ratings":[{"Source":"Internet Movie Database","Value":"8.0/10"},{"Source":"Rotten Tomatoes","Value":"95%"},{"Source":"Metacritic","Value":"86/100"}],"Metascore":"86","imdbRating":"8.0","imdbVotes":"230,310","imdbID":"tt0072890","Type":"movie","DVD":"16 Dec 1997","BoxOffice":"N/A","Production":"WARNER BROTHERS PICTURES","Website":"N/A","Response":"True"}
 */

// http://www.omdbapi.com/?i=tt3896198&apikey=3574a1f7


interface OmdbApi {
    @GET("")
    fun getMovie(@Query("apikey") key: String): Observable<OmdbMovie>
}