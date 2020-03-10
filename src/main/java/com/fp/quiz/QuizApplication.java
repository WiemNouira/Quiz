package com.fp.quiz;
import com.fp.quiz.dao.QuestionRepository;
import com.fp.quiz.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class QuizApplication {
    @Autowired
    private QuestionRepository questionRepository;
    public static void main(String[] args) {
        SpringApplication.run(QuizApplication.class, args);
    }

    @Bean
    @Transactional
    public CommandLineRunner dataLoader() throws Exception{
        return args -> {
          List<Question> questions = new ArrayList<>();
          Question q1 = new Question(0L, "Quelle type est non primitive .", "char", "boolean", "String", "double", "String");
          Question q2 = new Question(1L, "Combien de modificateurs daccesiblite dans java?", "2", "3", "4", " 5", "4");
          Question q3 = new Question(2L, "Le type double est stocké sur quels nombre de bits?", "64", "8", "16", "  Aucun", "64");
          Question q4 = new Question(3L, "Le type char est stocké sur quels nombre de bits?", "64", "8", "16", "  Aucun", "8");
          Question q5 = new Question(4L, "Le type float est stocké sur quels nombre de bits?", "32", "8", "16", "  Aucun", "32");
          Question q6 = new Question(5L, "Le type long est stocké sur quels nombre de bits?", "64", "8", "16", "  Aucun", "64");
          Question q7 = new Question(6L, "Le type int est stocké sur quels nombre de bits?", "32", "8", "16", "  Aucun", "32");
          Question q8 = new Question(7L, "Le type short est stocké sur quels nombre de bits?", "16", "32", "64", "  Aucun", "32");
          Question q9 = new Question(8L, "Le type double est stocké sur quels nombre de bits?", "64", "8", "16", "  Aucun", "64");
          Question q10 = new Question(9L, "Le type byte est stocké sur quels nombre de bits?", "16", "8", "32", "  Aucun", "8");
        
          questions.add(q1);
          questions.add(q2);
          questions.add(q3);
          questions.add(q4);
          questions.add(q5);
          questions.add(q6);
          questions.add(q7);
          questions.add(q8);
          questions.add(q9);
          questions.add(q10);
          questionRepository.saveAll(questions);
      
        };
    }

}
