package com.nadafeteiha.monsterchallenge.data

import com.nadafeteiha.monsterchallenge.data.domain.Actor
import com.nadafeteiha.monsterchallenge.data.domain.Movie
import com.nadafeteiha.monsterchallenge.data.domain.TVShow

object DataSource {
    fun getTvShow(): List<TVShow> = listOf(
        TVShow(
            "Finding Ola",
            "8.5",
            1,
            "https://filmyhype.com/wp-content/uploads/2022/02/Finding-Ola.jpg"
        ),
        TVShow(
            "The Mentalist",
            "8.1",
            7,
            "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcT--FFlKNBvlaiPEUKLzx_Z64PK7jQ1agIIguj6NF1VfHcUMRhq"
        ),
        TVShow(
            "Servant",
            "7.5",
            2,
            "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQQ2kMGYNw86cdUz8TB0-v-e2ehF3smbwTd1mGpBo7kdRqP0Ikp"
        ),
        TVShow(
            "The Gift",
            "7",
            4,
            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSECmfzgKbfGWYH6OrYAvCnX-GBidbKWZ8r6EdtXew3f-itUgCd"
        ),
        TVShow(
            "Maid",
            "8.4",
            1,
            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ3jYQNq_vyMz7mxH1DWi5sjoIAeM7zTCkDCO2Gh80mlcnggiQ7"
        ),
        TVShow(
            "Paranormal",
            "8",
            1,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvInsMR69h2lxv0wP8g_rydnOK986M71K7kdNuMk6jVXwpDsyO"
        )
    )

    fun getActorsOfTheMonth(): List<Actor> = listOf(
        Actor(
            "Adel Imam",
            "https://i0.wp.com/www.middleeastmonitor.com/wp-content/uploads/2018/03/adel-imam.jpg?quality=85&strip=all&zoom=1&ssl=1"
        ),
        Actor(
            "Omar Sharif",
            "https://upload.wikimedia.org/wikipedia/commons/9/91/Omar_Sharif_1963.JPG"
        ),
        Actor(
            "Faten Hamama",
            "https://storage.googleapis.com/nrpassets/uploads/articles/1516189330-main_imageeeeee.jpg"
        ),
        Actor(
            "Abla Kamel",
            "https://www.albawaba.com/sites/default/files/styles/d08_standard/public/2020-06/Did%20Abla%20Kamel%20Retire_.jpg?h=8abcec71&itok=Gaprjduz"
        ),
        Actor("Nagat El-Sagheera", "https://i.ytimg.com/vi/4vgbdYiB9IU/hqdefault.jpg"),
        Actor(
            "Soad Hosny",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Soad_Hosny.jpg/440px-Soad_Hosny.jpg"
        ),
        Actor(
            "Shadia",
            "https://layalina.awicdn.com/site-images/sites/default/files/prod/celebrity-profile/34701/%D8%B4%D8%A7%D8%AF%D9%8A%D8%A9-244236.jpg?preset=article-main-img&save-png=1&rnd=0519151220214-OLD"
        ),
        Actor(
            "Mariem Fakhr Eldin",
            "https://media.elcinema.com/uploads/_315x420_44023b17392e964ae55053d4767191a5462a1225b9ffc543bc2199863af37daf.jpg"
        )
    )

    fun getRecommendedMovies(): List<Movie> = listOf(
        Movie(
            "Encanto",
            "7.2",
            "Musical/Family",
            "2022",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5t5u-NFz05_jk9e-P0hScZAVWTLtR4AoUw1969nFtFfye1sQ5"
        ),
        Movie(
            "Corpse Bride",
            "7.3",
            "2005",
            "Fantasy/Family",
            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRXHXO6GPGHn8g9IcA8hWuMv5YMTFkRtvBVIH8wGdjgmCemvBeE"
        ),
        Movie(
            "Minions",
            "6.4",
            "2015",
            "Family/Comedy",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0SCDoez_PjFy86YI4K1zi1rDdBZoEG1X7jei3GKwvOLHOkC92"
        ),
        Movie(
            "LEAP!",
            "6.7",
            "2016",
            "Family/Comedy",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSceFvs5-hK_VKO16ctARBADrJfTL3VFpXNN4FWKjYqcCyLr3mZ"
        ),
        Movie(
            "Tangled",
            "7.7",
            "2010",
            "Musical/Family",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4r0lBkvuOBiIJBQ1zRWnBoVYfDpLazf6ocVgd2EKDmLI6qJJ6"
        ),
        Movie(
            "Frozen II",
            "6.8",
            "2019",
            "Family/Adventure",
            "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQ_NPVKP2ZCNOl6Rye_h27KGVln1sUi4HQPAhAkHduTgBgUBXNI"
        ),
        Movie(
            "Home Alone",
            "7.7",
            "1990",
            "Comedy/Family",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRw_CoIia6nG5ElPseo8-PEZ0P3qXFdCqtxRdq7doTN_syKsxwo"
        )
    )

}