public class PokemonAlreadyExistsException extends Exception
{
    private Pokemon copy;

    public PokemonAlreadyExistsException()
    {
        super("ERROR: You already own this pokemon!");
    }

    public PokemonAlreadyExistsException(String message, Pokemon copy)
    {
        super(message + " " + copy);
        this.copy = copy;
    }

    public Pokemon getCopy()
    {
        return this.copy;
    }

    


    
}
