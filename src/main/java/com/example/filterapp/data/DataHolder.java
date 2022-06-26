package com.example.filterapp.data;

import com.example.filterapp.models.Review;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class DataHolder {

    public static List<Review> review = new ArrayList<>();

    @PostConstruct
    public void init(){
        review.add(new Review(2097047L,"93f131be27dc1122bb7ef0048ad10e4f","5 star review",
                "5 star review",0,0,0,5,"2 months ago",
                "2021-01-25",1611579635L,null,null,
                "Reviewer #20",null,"custom",false,"custom",
                "1-20 Reviews","890cdd7974cdf8aabe6e9051f5a87303bdb933ae"));
        review.add(new Review(2097046L,"6e7bd4c71a56885ef583bd79186af689","4 star review",
                "4 star review",0,0,0,4,"2 months ago",
                "2021-01-25",1611579621L,null,null,
                "Reviewer #19",null,"custom",false,"custom",
                "1-20 Reviews","890cdd7974cdf8aabe6e9051f5a87303bdb933ae"));
        review.add(new Review(2097047L,"93f131be27dc1122bb7ef0048ad10e4f","5 star review",
                "5 star review",0,0,0,5,"2 months ago",
                "2021-01-25",1611579635L,null,null,
                "Reviewer #20",null,"custom",false,"custom",
                "1-20 Reviews","890cdd7974cdf8aabe6e9051f5a87303bdb933ae"));
        review.add(new Review(2097045L,"ced8bd056d0adec93c651f935c7dde80","3 star review",
                "3 star review",0,0,0,3,"2 months ago",
                "2021-01-25",1611579635L,null,null,
                "Reviewer #18",null,"custom",false,"custom",
                "1-20 Reviews","890cdd7974cdf8aabe6e9051f5a87303bdb933ae"));
    }
}
