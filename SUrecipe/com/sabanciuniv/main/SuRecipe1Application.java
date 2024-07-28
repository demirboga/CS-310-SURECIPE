package com.sabanciuniv.main;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.sabanciuniv.model.Comment;
import com.sabanciuniv.model.Recipe;
import com.sabanciuniv.model.User;
import com.sabanciuniv.repo.CommentRepo;
import com.sabanciuniv.repo.RecipeRepo;
import com.sabanciuniv.repo.UserRepo;
import com.sabanciuniv.service.RecipeService;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.sabanciuniv.repo")
@ComponentScan(basePackages= "com.sabanciuniv.service")
public class SuRecipe1Application implements CommandLineRunner{

@Autowired com.sabanciuniv.repo.CommentRepo commentRep;
@Autowired com.sabanciuniv.repo.RecipeRepo recipeRep;
@Autowired com.sabanciuniv.repo.UserRepo userRep;

private static final Logger logger=(Logger) LoggerFactory.getLogger(SuRecipe1Application.class);


	public static void main(String[] args) {
		SpringApplication.run(SuRecipe1Application.class, args);

	}
	

	@Override
	public void run(String... args) throws Exception {
			User Default=new User("Default");
			userRep.save(Default);
			

			List<Comment> comments=new ArrayList<>();
			comments.add(new Comment("Nice",Default.getId()));
			
			commentRep.saveAll(comments);
			
			
			ArrayList<String> Ingredients = new ArrayList<>();
			Ingredients.add("1 pack of boneless chicken");
			Ingredients.add("2 whole green bell peper");
			Ingredients.add("2 onions");
			Ingredients.add("yogurt");
			Ingredients.add("spices");
			Ingredients.add("salt");
			Ingredients.add("oil");
			
			ArrayList<String> Instructions = new ArrayList<>();
			Instructions.add("Step 1 -> Marinate the chicken in all the spices.");
			Instructions.add("Step 2 -> Heat up oil fry the chicken on medium high till brown.");
			Instructions.add("Step 3 -> Stir fry Onions long chopped and green bell peppers long chopped.");
			Instructions.add("Step 4 -> Add it to the chicken mix and wrap it in roll parata or tortilla.");
			
			
			Recipe recipe1=new Recipe("Chicken with mix vegetables",Ingredients,Instructions,"Chicken","350",comments,Default.getId());
			recipeRep.save(recipe1);
			
			Ingredients.clear();
			Instructions.clear();
			
			Ingredients.add("2 chicken breast");
			Ingredients.add("2 lemon");
			Ingredients.add("1 tablespoon honey");
			Ingredients.add("3 tablespoon flour");
			Ingredients.add("spices");
			Ingredients.add("salt");
			Ingredients.add("1 bowl cooking oil");
			Ingredients.add("Just white of 1 egg");
			Ingredients.add("Half cup of water");
			
			
			Instructions.add("Step 1 -> Mix pepper salt, chicken, flour and egg white. Mix it well.");
			Instructions.add("Step 2 -> Heat wok and pour oil. Deep fry the chicken until golden brown. Set aside.");
			Instructions.add("Step 3 -> In another wok pour water, honey, lemon juice, black pepper.");
			Instructions.add("Step 4 -> Mix it well until sticky. Ther put back the chicken. Let it coat with sauce. Then transfer into plate.");
			
			
			Recipe recipe2=new Recipe("Lemon chicken breast",Ingredients,Instructions,"Chicken","400",comments,Default.getId());
			recipeRep.save(recipe2);
			
			Ingredients.clear();
			Instructions.clear();
			
			Ingredients.add("2 chicken breast");
			Ingredients.add("spices");
			Ingredients.add("3 tablespoon cornflour");
			Ingredients.add("Half cup cooking oil");
			Ingredients.add("Just the white of 1 egg");
			
			
			Instructions.add("Step 1 -> Cut the chicken breast into bite size.");
			Instructions.add("Step 2 -> Marinate with the ings.");
			Instructions.add("Step 3 -> Heat oil in high heat then deep fry.");
			
			
			Recipe recipe3=new Recipe("Fried chicken breast",Ingredients,Instructions,"Chicken","450",comments,Default.getId());
			recipeRep.save(recipe3);
			
			
	
			
			
			
		
	
	}
	

}
