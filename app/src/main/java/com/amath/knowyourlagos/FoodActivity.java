package com.amath.knowyourlagos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amath.knowyourlagos.Adapter.FoodAdapter;
import com.amath.knowyourlagos.Modal.Food;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity{

    RecyclerView recyclerView;
    ArrayList<Food> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        recyclerView = findViewById(R.id.recyclerViewFood);
        foods = new ArrayList<>();

        foods.add(new Food("Shiro Restaurant & Bar",
                "PRICE RANGE\n" +
                "NGN 35 - NGN 100\n" +
                        "\n"+
                "CUISINES\n" +
                "Japanese, Sushi, Asian, Contemporary\n" +
                        "\n"+
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Vegan Options, Gluten Free Options.\n " +
                        "\n"+
                " Facebook page serves as website \n https://web.facebook.com/ShiroLagos/",
                "3/4 Water Cooperation Road, Landmark Village Victoria Island, Near Landmark Centre, Water Corporation Road, Lagos Nigeria","+2348186298888\n" +
                "Email at shirolagos@sjmnigeria.com",R.drawable.shiroh1,R.drawable.shiroh2));

        foods.add(new Food("Hard Rock Cafe",

                "CUISINES\n" +
                "American, Bar, Cafe\n" +
                        "\n"+
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Vegan Options.\n " +
                        "\n"+
                " WEBSITE \n  https://www.hardrockcafe.com/location/lagos/",
                " Water Cooperation Road, Landmark Village Victoria Island, Near Landmark Centre, Water Corporation Road, Lagos Nigeria"," +2349081988888\n",R.drawable.hardrock1,R.drawable.hardrock2));

        foods.add(new Food("Ocean Basket",
               " PRICE RANGE\n" +
               " NGN 2,939 - NGN 41,982\n"+
                       "\n"+
                "CUISINES\n" +
                " Seafood, Mediterranean\n" +
                       "\n"+
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Vegan Options.\n " +
                       "\n"+
                " WEBSITE \n  https://nigeria.oceanbasket.com/",
                        "35, Akin Adesola Street Victoria Island, Lagos Nigeria"," +2348160591821\n",R.drawable.oceanbas1,R.drawable.oceanbas2));

        foods.add(new Food("RSVP Lagos",
                " CUISINES\n" +
                " American,European,International\n"+
                        "\n"+
                "MEALS\n" +
                " Brunch, Drinks,Lunch,Dinner\n" +
                        "\n"+
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Vegan Options.\n " +
                        "\n"+
                " WEBSITE \n https://www.rsvplagos.com/",
                        "Eletu Ogabi St. Victoria Island, Lagos Nigeria"," ++2348186166666\n",R.drawable.rsvp1,R.drawable.rsvp2));

        foods.add(new Food("The Observatory Lagos","This beautiful Asian fusion restaurant is located  \n " +
                "in Lekki phase 1.\n" +
                " You can’t miss this place – the building is completely \n covered with glass windows. \n" +
                "You’ll enjoy this green open space with excellent \n ambiance  and great food by the famous Chef Obi. " +
                "\n"+
                "\n"+
                " WEBSITE \n https://the-observatory-lagos.business.site/",
                        "15 Admiralty Way\n" +
                                "Lekki Phase 1,Lagos\n" +
                                "Nigeria"," +2349044507213",R.drawable.observatory1,R.drawable.observatory2));

        foods.add(new Food("MaMa Cass","CUISINES\n" +
                "African, Fast Food, International, Soups\n" +
                "\n"+
                "MEALS\n" +
                "Lunch, Dinner\n" +
                "\n"+
                "FEATURES\n" +
                "Delivery, Seating " +
                "\n"+
                "Serving home-cooked meals in a traditional manner.\n"+
                "They have branches on the Island, Egbeda and Abuja.\nRumour have it that their is one in the UK."+
                "\n"+
                "\n"+
                " WEBSITE \n https://www.mamacassng.com/",
                "4A, Oyeleke Street, Oregun/Alausa, Ikeja, Lagos."," +2348074490009",R.drawable.mamacass1,R.drawable.mamacass2));

        foods.add(new Food("Cubana Hut and Grill","CUISINES\n" +
                    "African, Food,, Grill\n" +
                "\n"+
                "FEATURES\n" +
                "Accepts Credit Cards, Table Service, Reservations " +
                "\n"+
                "\n"+
                " WEBSITE \n https://www.cubana-group.com/",
                "17 Adeola Odeku Street,Victoria Island, Lagos 101241 Nigeria"," +2349060005472",R.drawable.cubana1,R.drawable.cubana2));

        foods.add(new Food("Yakoyo Abula Joint","Yakoyo abula joint is located along ogunlana drive \n surulere. " +
                "Their interior decoration is beautiful. \n Nice and swift customer service." +
                "\n"+
                " Their prices are very budget friendly.\n They have variety of food i.e amala, semo, eba, jollof rice, \n fried rice, spaghetti, egusi, fish, ewedu, gbegiri, beans etc.\n" +
                " You can dine-in or do take-out.\n All in all it's a good place." +
                "\n"+
                "\n"+
       "Head Office in Surulere, other branches in Lekki, \n Sangotedo." +
                "\n"+
                "\n"+
                " WEBSITE \n https://yakoyoabulajoint.com.ng/","107 Ogunlana Drive Surulere\n" +
                "Lagos, Nigeria","+2349083418979", R.drawable.yakoyo1,R.drawable.yakoyo2));

        foods.add(new Food("Gypsy’s Restaurant & Bar","Another Chinese/Indian restaurant in Ilupeju. \n" +
                "The decor here is more understated, but they \n make up for this with their generous portion sizes." +
                "\n"+
                " One serving is often enough for two people to enjoy \n and still have leftovers (aka ‘takeaway’)." +
                "\n"+
                " However, the staff at Gypsy’s could do better by \n hovering a lot less." +
                "\n"+
                "\n"+
                "Opening: 11.30am-10.30pm\n" +
                "\n"+
                "Monday-Sunday\n" +
                "Their is Reservation & Delivery.","34a, Gbolade Adebanjo,\n" +
                " Ilupeju Lagos, Nigeria","+2348187774449", R.drawable.gypsy1,R.drawable.gypsy2));

        foods.add(new Food("Orchid House","This Thai restaurant is arguably one of the better \n  Asian restaurants in Lagos. " +
                " \n The ambience is homey, and the food is, of course,\n worth every Naira. " +
                "\n"+
                "\n"+
                "PRICE RANGE\n" +
                "NGN 10,509 - NGN 16,814"+
                "\n"+
                "\n"+
                "The prawn tempura at Orchid House is a favourite, and \n" +
                " if you can’t survive the long journey to their Apapa \n branch," +
                " they now have an outlet in Ikeja GRA \n and Victoria Island." +
                "\n"+
                "Come and relax in stylish comfort among beautiful \n  orchid flowers."+
                "\n"+
                "WEBSITE \n http://orchidhouselagos.com/",
                "15a Marin Road, Apapa\n" +
                "Lagos, Nigeria","+2349091706888", R.drawable.orchid,R.drawable.orchid1));

        foods.add(new Food("Yellow Chilli","One treasure the mainland has in abundance in comparison \n to the island is buka food. " +
                "It’s a known fact that street food is \n oftentimes best served with a side of dingy decor and rude \n servers." +
                "\n"+
                " If that’s not your style, then the abula at Nok in VI and the \n menu at Yellow Chilli on the mainland are your best bet. " +
                "\n The seafood okra at Yellow Chilli is easily the best thing on \n their menu." +
                "\n"+
                " they now have an outlet in Victoria Island." +
                "\n"+
                "\n"+
                "Dine-in | Takeout | Delivery\n" +
                "Open from 11am daily\n" +
                "️Last eat-in orders accepted at 9pm."+
                "\n"+
                "\n"+
                "WEBSITE \n http://www.yellowchilling.com/",
                "35, Joel Ogunnaike St, Ikeja\n" +
                        "Lagos, Nigeria","+2348089948999", R.drawable.yellowchillin1,R.drawable.yellowchillin2));

        FoodAdapter foodAdapter = new FoodAdapter(foods,this);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(foodAdapter);

    }
    /**
    @Override
    public void onItemClicked(int positionOfTheFood) {
        Toast.makeText(this, "Clicked" + foods.get(positionOfTheFood).getNameFood(), Toast.LENGTH_SHORT).show();



    }
     **/

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();

    }
}