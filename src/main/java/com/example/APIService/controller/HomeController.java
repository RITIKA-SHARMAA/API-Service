package com.example.APIService.controller;

import com.example.APIService.models.*;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class HomeController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getTitle")
    public Response getTitle(){
        return new Response("Hello to my website");
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getSubTitle")
    public MasterResponse getSubTitle(){
        return  new MasterResponse("This is my sub title");
    }


    @CrossOrigin(origins = "http://localhost:3000" )
    @GetMapping("/getCategories")
    public CategoriesResponse getCategories (){

       ArrayList<CatModel> catModelArrayList = new ArrayList<>();
       catModelArrayList.add(new CatModel("Water Color","https://img.freepik.com/premium-vector/beautiful-watercolor-painting-against-this-background-bright-radiance-sun-cherry-blossoms-penetrating-darkness-bright-saturated-colors-generative-aicreativityvector-illustration_579956-3462.jpg?w=2000", 1));
        catModelArrayList.add(new CatModel("Sketch","https://5.imimg.com/data5/SELLER/Default/2022/4/NC/WR/PC/130288946/whatsapp-image-2022-01-24-at-7-32-40-am-2--500x500.jpeg", 2));
        catModelArrayList.add(new CatModel("Anime","https://i2.wp.com/i.imgur.com/C4EKjFB.jpg", 3));
        catModelArrayList.add(new CatModel("Water Color","https://img.freepik.com/premium-vector/beautiful-watercolor-painting-against-this-background-bright-radiance-sun-cherry-blossoms-penetrating-darkness-bright-saturated-colors-generative-aicreativityvector-illustration_579956-3462.jpg?w=2000", 1));
        catModelArrayList.add(new CatModel("Sketch","https://5.imimg.com/data5/SELLER/Default/2022/4/NC/WR/PC/130288946/whatsapp-image-2022-01-24-at-7-32-40-am-2--500x500.jpeg", 2));
        catModelArrayList.add(new CatModel("Anime","https://i2.wp.com/i.imgur.com/C4EKjFB.jpg", 3));
        catModelArrayList.add(new CatModel("Water Color","https://img.freepik.com/premium-vector/beautiful-watercolor-painting-against-this-background-bright-radiance-sun-cherry-blossoms-penetrating-darkness-bright-saturated-colors-generative-aicreativityvector-illustration_579956-3462.jpg?w=2000", 1));
        catModelArrayList.add(new CatModel("Sketch","https://5.imimg.com/data5/SELLER/Default/2022/4/NC/WR/PC/130288946/whatsapp-image-2022-01-24-at-7-32-40-am-2--500x500.jpeg", 2));
        catModelArrayList.add(new CatModel("Anime","https://i2.wp.com/i.imgur.com/C4EKjFB.jpg", 3));
        catModelArrayList.add(new CatModel("Water Color","https://img.freepik.com/premium-vector/beautiful-watercolor-painting-against-this-background-bright-radiance-sun-cherry-blossoms-penetrating-darkness-bright-saturated-colors-generative-aicreativityvector-illustration_579956-3462.jpg?w=2000", 1));
        catModelArrayList.add(new CatModel("Sketch","https://5.imimg.com/data5/SELLER/Default/2022/4/NC/WR/PC/130288946/whatsapp-image-2022-01-24-at-7-32-40-am-2--500x500.jpeg", 2));
        catModelArrayList.add(new CatModel("Anime","https://i2.wp.com/i.imgur.com/C4EKjFB.jpg", 3));
        return new CategoriesResponse(catModelArrayList);

    }


    @CrossOrigin(origins = "http://localhost:3000" )
    @GetMapping("/getImagesOfCategoryId")
    public ImagesOfCategoryIdResponse getImagesOfCategoryId (@RequestParam(value = "catId",defaultValue = "1") int catId) {

        ArrayList<CatModel1> cat1ModelArrayList = new ArrayList<>();
        cat1ModelArrayList.add(new CatModel1("Water Color", "https://img.freepik.com/premium-vector/beautiful-watercolor-painting-against-this-background-bright-radiance-sun-cherry-blossoms-penetrating-darkness-bright-saturated-colors-generative-aicreativityvector-illustration_579956-3462.jpg?w=2000","Ritika ",1));
        cat1ModelArrayList.add(new CatModel1("Water Color", "https://img.freepik.com/premium-vector/beautiful-watercolor-painting-against-this-background-bright-radiance-sun-cherry-blossoms-penetrating-darkness-bright-saturated-colors-generative-aicreativityvector-illustration_579956-3462.jpg?w=2000","Ritika ",2));
        cat1ModelArrayList.add(new CatModel1("Water Color", "https://img.freepik.com/premium-vector/beautiful-watercolor-painting-against-this-background-bright-radiance-sun-cherry-blossoms-penetrating-darkness-bright-saturated-colors-generative-aicreativityvector-illustration_579956-3462.jpg?w=2000","Ritika ",3));

        ArrayList<CatModel1> cat2ModelArrayList = new ArrayList<>();
        cat2ModelArrayList.add(new CatModel1("Sketch", "https://5.imimg.com/data5/SELLER/Default/2022/4/NC/WR/PC/130288946/whatsapp-image-2022-01-24-at-7-32-40-am-2--500x500.jpeg","Ritika ",4));
        cat2ModelArrayList.add(new CatModel1("Sketch", "https://5.imimg.com/data5/SELLER/Default/2022/4/NC/WR/PC/130288946/whatsapp-image-2022-01-24-at-7-32-40-am-2--500x500.jpeg","Ritika ",4));
        cat2ModelArrayList.add(new CatModel1("Sketch", "https://5.imimg.com/data5/SELLER/Default/2022/4/NC/WR/PC/130288946/whatsapp-image-2022-01-24-at-7-32-40-am-2--500x500.jpeg","Ritika ",4));

        ArrayList<CatModel1> cat3ModelArrayList = new ArrayList<>();
        cat3ModelArrayList.add(new CatModel1("Anime","https://i2.wp.com/i.imgur.com/C4EKjFB.jpg", "Ritika",7));
        cat3ModelArrayList.add(new CatModel1("Anime","https://i2.wp.com/i.imgur.com/C4EKjFB.jpg", "Ritika",8));
        cat3ModelArrayList.add(new CatModel1("Anime","https://i2.wp.com/i.imgur.com/C4EKjFB.jpg", "Ritika",9));

        HashMap<Integer,ArrayList<CatModel1>> map = new HashMap<>();
        map.put(1,cat1ModelArrayList);
        map.put(2,cat2ModelArrayList);
        map.put(3,cat3ModelArrayList);
        ArrayList<CatModel1> responseAL = map.get(catId);

        return  new ImagesOfCategoryIdResponse(responseAL);

    }


    static class Response{
        String title;

        Response(String titleInpt){
            this.title = titleInpt;
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
