package comp1110.homework.J08;

public class Sentence {
    public Word[] words;

    public Sentence(int size) {
        words = new Word[size];
    }
    public boolean isValid(){
        if(words==null){
            return false;
        }else if(words.length<1){
            return false;
        }
        if(!words[words.length-1].type.name().equals("NOUN")&&!words[words.length-1].type.name().equals("VERB")){
            return false;
        }
        int verbnum = 0;

        for (int i =0;i<words.length;i++) {
            if(words[i].type.equals(Word.Type.VERB))
                verbnum++;
            if(i<words.length-1){
                if(words[i].type.name().equals("ADJECTIVE")&&(!words[i+1].type.name().equals("NOUN")&&!words[i+1].type.name().equals("ADJECTIVE")))
                    return false;
                if(words[i].type.name().equals("NOUN")&&(!words[i+1].type.name().equals("VERB")))
                    return false;
            }
        }
        if(verbnum!=1)
            return false;

        return true;
    }
    static class Word {
        public String value;
        public Type type;
        Word(String value, Type type){
            this.value = value;
            this.type = type;
        }
        enum Type {
            NOUN, ADJECTIVE, VERB
        }
    }
}

