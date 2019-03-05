public class Question {

    public String[] question = new String[10];
    public int[] response = new int[10];
    public String[] result = new String[7];
    public String name;

    public Question(String name) {
        this.name = name;
        makeQuestions();
        produceResult();
        addUpResponses();

    }


    public void makeQuestions(){
        question[0] = "Do you smoke?";
        question[1] = "Do you drink alcohol?";
        question[2] = "Do you consume sugary snacks and drinks?";
        question[3] = "Do you sleep less than your recommended hours?";
        question[4] = "Do you avoid exercise?";
        question[5] = "Do you consume illegal drugs?";
        question[6] = "Do you experience stress?";
        question[7] = "Do you get sick?";
        question[8] = "Do you participate in life threatening activities?";
        question[9] = "Do you perform sexual activities without protection?";

    }

    public void produceResult(){
        result[0] = "You will live to be 100 years old";
        result[1] = "You will live to be 80 years old";
        result[2] = "You will live to be 70 years old";
        result[3] = "Please consider your life decisions. You will live to be 50";
        result[4] = "How are you not dead!!";
        result[5] = "Sorry, you entered a value greater than 4";
        result[6] = "Sorry, you entered a value lower than 1";
    }

    public String addUpResponses() {
        int boi = 0;

        for( int i = 0; i < response.length; i++){
            boi += response[i];
        }

        if(boi < 10){
            return result[6];
        }

        if(boi == 10){
            return result[0];
        }
        if( boi > 10 && boi <= 20){
           return result[1];
        }
        if( boi > 20 && boi <= 30){
            return result[2];
        }
        if( boi> 30 && boi < 40){
            return result[3];
        }
        if( boi == 40){
            return result[4];
        }
        if( boi > 40){
            return result[5];
        }
        return "";
    }






}

