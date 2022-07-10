package tutorial.jokesapp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

//    public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
//        this.chuckNorrisQuotes = chuckNorrisQuotes;
//    }

    @Override
    public String getJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
