package umin.trapp;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classic")
public class ClassicMusic extends Music{
    private List<String> compositions=new ArrayList<>();

    public ClassicMusic(){
        setName("CLASSIC");
        setCompositions();
    }
    private void setCompositions(){
        compositions.add("Boulevard of Broken Dreams - Green Day");
        compositions.add("Holiday - Green Day");
        compositions.add("Wake Me up When September Ends - Green Day");
    }
    @Override
    public List getCompositions(){
        return compositions;
    }
}
