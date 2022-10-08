public class Anime<VariableType> {

    private String Character;
    private String Genre;
    private VariableType Title;

    public void setTitle(VariableType Title){
        this.Title=Title;
    }
    public VariableType getTitle(){
        return Title;
    }

    public void setCharacter(String Character){
        this.Character=Character;
    }
    public String getCharacter(){
        return Character;
    }
    public void setGenre(String Genre){
        this.Genre=Genre;
    }
    public String getGenre(){
        return Genre;
    }
}
