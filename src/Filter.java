import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for(Integer s : source) {
            if(s >= treshold) {
                logger.log ("Элемент \"" + s +"\" проходит");
                result.add(s);
            } else {
                logger.log ("Элемент \"" + s +"\" не проходит");
            }
        }

        return result;
    }
}
