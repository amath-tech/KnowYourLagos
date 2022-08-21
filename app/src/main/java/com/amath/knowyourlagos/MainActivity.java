package com.amath.knowyourlagos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.amath.knowyourlagos.Adapter.MyLagosAdapter;
import com.amath.knowyourlagos.Modal.Lagos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyLagosAdapter.MyClickInterface {

    RecyclerView recyclerView;
    ArrayList<Lagos> lagosArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = findViewById(R.id.recycler_view);
        lagosArrayList = new ArrayList<>();

        lagosArrayList.add(new Lagos(R.drawable.agege,"Agege","  When the kolanut plantations in the Agege area started to flourish it attracted huge settlements. Agege experienced rapid development and became a powerful center of the kolanut trade. These settlements attracted different people of different backgrounds and interests such as laborers, and most of these were Hausa. Whenever the Yorubas needed labourers for jobs such as cutting of trees, they would engage the services of the Hausa people. Because of this work the immediate area where the Hausas lived was named ‘Ilu Awon Ageigi’ which translates as ‘Town (Ilu) of the tree cutters’. The name Agege was thus formed out of the word Ageigi.\n" +
                "\n" +
                "Geography\n" +
                "\n" +
                "  The boundary of Agege from the Northern part of Lagos stretches from Dopemu road through Anu-oluwapo street to olukosi down Fagbola through Osobu street to Orile road down to Old Agege Motor Road opposite Nitel. From the Southern part of Lagos it stretches from Ashade retail market to Akilo street.\n" +
                "\n" +
                "  From the Eastern part of Lagos it stretches from Oba ogunji road up to the by-pass to Agege Motor road by Nitel office. From the Western part of Lagos, the boundary of Agege stretches from Abeokuta express road from boundary with Ikeja Local government to Dopemu junction.\n"));
        lagosArrayList.add(new Lagos(R.drawable.ajeromi,"Ajeromi Ifelodun","   Ajeromi-Ifelodun is a Local Government Area in Badagry Division, Lagos State." +
                " It has some 57,276.3 inhabitants per square kilometer, among if not the world's densest.\n"));
        lagosArrayList.add(new Lagos(R.drawable.alimosho,"Alimosho","  Alimosho is a Local Government Area in the Ikeja Division, Lagos State, Nigeria. " +
                "It is the largest local government in Lagos, with 1,288,714 inhabitants, according to the official 2006 Census (however, the Lagos State Government disputes the official Census figures and claims a population within the LGA of more than 2 million residents).[1]\n" +
                "\n" +
                "  It has now been subdivided between several Local Community Development Areas (LCDA). The LCDA restructuring kicked off after the administration of Bola Ilori, who was the last chairman of the old single Alimosho Local Government. The six sub-divisions created out of the old Alimosho are: Agbado/Oke-odo LCDA, Ayobo/Ipaja LCDA, Alimosho LG, Egbe/Idimu LCDA, Ikotun/Igando LCDA and Mosan Okunola LCDA. The LGA contains the urban area of Egbeda/Akowonjo.\n" +
                "\n" +
                "  The Alimosho was established in 1945 and it was under the (then) western region. Alimosho's population is predominantly Egbados. " +
                "The area is rich in culture, prominent amongst which are the Oro, Igunnu and Egungun annual festivals. " +
                "The two main religions are Islam and Christianity. Yoruba language is widely spoken in the community.\n" +
                "\n" +
                "  The first secretariat of Alimosho is a two-storey building located on Council street, now in the Egbe/Idimu LCDA.\n"));

        lagosArrayList.add(new Lagos(R.drawable.amuwo,"Amuwo-Odofin","   Amuwo-Odofin is a local government area (LGA) in the Badagry Division, Lagos State, Nigeria.\n" +
                "\n" +
                "   Amuwo Odofin LGA is divided into Oriade and Amuwo Local Council Development Area (LCDA) with 7 wards each; Abule-osun, Agboju, Ibeshe, Ijegun, Irede, Kirikir and Kuje wards constitute Oriade LCDA and Ado-soba, Ekoakete, Ifelodun, Ilado Tamaro, Irepodun, Odofin and Orire wards comprising Amuwo LCDA.\n" +
                "\n" +
                "   Spread among the 14 wards are 67 communities, 12 of which are Urban, 8 semi-urban and 47 rural. Amuwo Odofin LGA has a population density of approximately 300,000 people per square kilometer.\n" +
                "\n" +
                "   The LGA, with a population of over 1,500,000 according to the 2006 Census shares its boundaries with Ajeromi and Ifelodun LCDA in the East, Oriade LCDA in the West, the Badagry Creek to the South and Isolo/Igando LCDA to the North.\n" +
                "\n" +
                "   The indigenous dwellers of Amuwo Odofin are mainly the Aworis. Some of the festivals embraced by the people are Elegba, Oro, Sangbeto and Igunuko festivals. The custodians of culture and tradition in the area are the traditional rulers." +
                " The Local Government is blessed with highly reputable Obas and Chiefs and Baales. This includes Oba Mobadenle Obalade Oyekan- the Onilado of Ilado/Inagbe Islands and Oba Lateef Olayinka Ado, Fabuwa 1, Alado of Ado Land.\n" +
                "\n" +
                "   Nonetheless, considering its location as a near border Local Government, International trade has found its root in the area with people of various extractions engaging in various forms of trading activities. It must also be stated that the hospitality of the people has also attracted people from other ethnic tribes in Nigeria mostly the Igbos who account for more than half of the area's total population.\n"));

        lagosArrayList.add(new Lagos(R.drawable.apapa,"Apapa","   The region of Apapa lies near the mouth of Lagos lagoon, and contains ports and terminals for various commodities such as containers and bulk cargo, houses, offices and a small old disused railway station (Apapa North). It is the site of a major container terminal which was owned and operated by the Federal Government of Nigeria until March 2005, and now is operated by the Danish firm A. P. Moller-Maersk Group.[3] Adjacent to the container port is the Tin Can Island Port, which has ro-ro facilities.\n" +
                "\n" +
                "   It also houses some refineries like the Bua Group. It also has commercial offices of many shipping, clearing and transportation companies. Other notable buildings include the Folawiyo Towers." +
                " Apapa houses the headquarters of the Nigerian newspaper.\n"));

        lagosArrayList.add(new Lagos(R.drawable.badagry,"Badagry","   Badagry (traditionally Gbagli) also spelled Badagri, is a coastal town and Local Government Area (LGA) in Lagos State, Nigeria. It is quite close to the city of Lagos, and located on the north bank of Porto Novo Creek, an inland waterway that connects Lagos (Nigeria\\'s largest city and economic capital to the Beninese capital of (Porto-Novo). The same route connects Lagos, Ilaro, and Porto-Novo, and shares a border with the Republic of Benin. As of the preliminary 2006 census results, the municipality had a population of 241,093.\n" +
                "\n" +
                "   Serving as a lagoon and an Atlantic port, Badagry emerged as a commercial center on the West African coast between 1736 and 1851.[3] Its connecting and navigable lakes, creeks and inland lagoons acted as a means to facilitate trade and as a security bar for residents. During the Trans-Atlantic slave trade, the town was a middleman between European traders on the coast and traders from the hinterland.\n"));

        lagosArrayList.add(new Lagos(R.drawable.epe,"Epe","   Epe is a town and Local Government Area (LGA) in Lagos State, Nigeria[1] located on the north side of the Lekki Lagoon and about 90 km from Ibadan. During the 2006 Census, the population of Epe was approximately 181,409.[1]\n" +
                "\n" +
                "   There is no paramount ruler in the area as there are two major communities with individual monarchs. These are the Eko Epe and Ijebu Epe communities within the same town.The notable festivals that are mostly celebrated in Epe land include Kayo-kayo Festival, Ebi day, Ojude-Oba, and Epe day.[2]\n" +
                "\n" +
                "Epe,Lagos\n" +
                "A road junction at the entrance into Epe from the Lekki-Epe Expressway features a sculpture of two giant fish, erected by the Lagos State Government.\n" +
                "\n" +
                "   Notable higher institutions like Lagos State University(LASU), Yaba College of Technology, Michael Otedola College of Primary Education(MOCOPED), Pan-Atlantic University(PAU) all have campuses in Epe area of Lagos, Nigeria.\n"));

        lagosArrayList.add(new Lagos(R.drawable.victoria_island,"Eti-Osa","   Eti-Osa is a Local Government Area of Lagos State in Nigeria. Lagos State Government administers the council area as Ikoyi-Obalande LCDA, Eti-Osa East, and Iru Victoria Island LCDA. Within Eti-Osa are several important areas of Lagos State, including Lagos Victoria Island. Before the Nigerian capital moved to Abuja, " +
                "Eti-Osa Local Government Area served alongside Lagos Island Local Government Area as the seat of the national capital.\n"));

        lagosArrayList.add(new Lagos(R.drawable.ibeju,"Ibeju Lekki","   Ibeju-Lekki is a local government area of Lekki, Lagos State, Nigeria. The administrative centre was formerly at Akodo and was later moved to Igando Oloja due to the creation of the Lekki Council Development Area. The name of the Local government was derived from two autonomous communities, Ibeju and Lekki.\n" +
                "\n" +
                "   The demographics of the area include people from different parts of the country living, working and doing business in the area. Ibeju Lekki has potential for tourism as it is endowed with beautiful ocean front and lagoon views.\n" +
                "\n" +
                "   The development in the area is rapid and ongoing, some even refer to the area as the new Lagos. The commercial centre of Lagos state seems to be shifting gradually towards the area with much effort being put into developing industries and infrastructure.\n" +
                "\n" +
                "   Ibeju-Lekki is one of the LGAs for the planned Lekki City. With the actualization of the blueprint, Ibeju Lekki is expected to become a central hub for business, manufacturing, warehousing, and logistics. Forecasts have been made about an increase in commercial activities in the area as a result of these developments which will create thousands of jobs and make the area a major business location in the country.\n"
                ));

        lagosArrayList.add(new Lagos(R.drawable.ifkj,"Ifako-Ijaye","   The Ifako-Ijaiye Local Government was created along with 183 other local governments on October 1, 1996 by General Sani Abacha, the then military head of state. It was carved out of Agege Local Government, with headquarters in Ifako. The 1991 census found the majority of inhabitants to be Yoruba. Ifako-Ijaiye Local Government is a border suburb town as it shares border with Ogun State. The major settlements are Ogba-Ijaiye, Ifako, Oke-Ira, Iju-Ishaga, Obawole, Iju-Ogundimu, Fagba, Agege Pen Cinema among others.\n" +
                "\n" +
                "   The past leaders of the Local Government are: Engr. Richard Akinpelu (late) Alh. Marufdeen Adeola Adefolabi (late) Hon. Demola Doherty Hon. (Apostle) Oloruntoba Oke 2011 - 2014 Hon Akinwunmi Nurudeen Olaitan 2014 - 2016 Hon Babatunde I.Q. Rajh-Label 2016 - 2017.\n" +
                "\n" +
                "   The Former Governor of Lagos State, Mr. Akinwunmi Ambode appointed Babatunde I.Q. Rajh-Label as Sole Administrator of the Local Government in June, 2016. Election was held on July 22, 2017 throughout the 20 Local Government Areas and 37 Local Council Development Areas of Lagos State. Hon (Apostle) Oloruntoba Oke was duly elected and sworn in as the Executive Chairman for a second term by the former State Governor, His Excellency, Gov. Akinwunmi Ambode.\n" +
                "\n" +
                "The Local Government is at present being led by Hon. (Prince) Usman Akanbi Hamzat as the Executive Chairman, after a successful Local Government Election held in July 2021.\n"));

        lagosArrayList.add(new Lagos(R.drawable.ikeja,"Ikeja","   Ikeja is the capital of Lagos State in southwestern Nigeria. Its population, as of the 2006 census, is 313,196. Prior to the emergence of military rule in the early 1980s, Ikeja was a well planned, clean and quiet residential and commercial town with shopping malls, pharmacies and government reservation areas. " +
                "It lies 10.5 miles (17 km) northwest of Lagos city. The Murtala Muhammed International Airport is located in the city. Ikeja is also home to Femi Kutis Africa Shrine and Lagbajas Motherland, both venues for live music. Its Ikeja City Mall is the largest mall on the Lagos State mainland. Ikeja also has its own radio station, broadcasting both in English (Eko FM) and in Yoruba (Radio Lagos).\n"));

        lagosArrayList.add(new Lagos(R.drawable.ikr,"Ikorodu",
                "   Ikorodu is a large city in Lagos State, Nigeria." +
                " It is located to the north-east of Lagos City, along the Lagos Lagoon and shares a boundary with Ogun State. At the 2006 census the population was 535,619. It is the largest local government in Lagos State. Indigenous settlers of Ikorodu emigrated from Sagamu in Ogun state.\n" +
                "\n"));

        lagosArrayList.add(new Lagos(R.drawable.kosofe,"Kosofe",
                "   Kosofe is a Local Government Area of Lagos State, Nigeria. Its headquarters are in the town of Kosofe.\n" +
                "\n" +
                "   It has an area of 81 km2 (31 sq mi) and a population of 665,393 at the 2006 census.\n" +
                "\n" +
                "   The postal code of the area is 100.\n" +
                "     One of the major settlements in Kosofe is Ikosi.\n"));

        lagosArrayList.add(new Lagos(R.drawable.cms,"Lagos Island","   Lying on Lagos Lagoon, a large protected harbour on the coast of Africa, the island is home to the Yoruba fishing village of Eko, which grew into the modern city of Lagos. The city has now spread out to cover the neighbouring islands as well as the adjoining mainland.\n" +
                "\n" +
                "   Lagos Island is connected to the mainland by three large bridges (the Carter Bridge, the Eko Bridge and the Third Mainland Bridge) which cross Lagos Lagoon to the district of Ebute Metta. It is also linked to the neighbouring island of Ikoyi and to Victoria Island. The Lagos harbour district of Apapa faces the western side of the island. Forming the main commercial district of Lagos, Lagos Island plays host to the main government buildings, shops and offices. The Catholic and Anglican Cathedrals, as well as the Central Mosque, are located here.\n" +
                "\n" +
                "   Historically, Lagos Island (Isale Eko) was home to the Brazilian Quarter of Lagos where the majority of the slave trade returnees from Brazil settled. Many families lived on Broad Street in the Marina.\n" +
                "\n" +
                "   Detailed map of Lagos Island\n" +
                "\n" +
                "   The poorer eastern side of the island contains the main markets and the poor housing. The island is extremely crowded and congested and attempts have been made to build new roads out over the lagoon in order to improve traffic flows. It is the part of Lagos where the Oba (or king) of Lagos resides. It is also believed that the Eyo festival can only be held in this part of Lagos.\n" ));

        lagosArrayList.add(new Lagos(R.drawable.lm,"Lagos Mainland","   Iddo Island is a district in Lagos Mainland LGA of Lagos.\n" +
                "Opposite Lagos Island, Iddo used to be an island, but due to land reclamation, is now part of the rest of Lagos Mainland.\n" +
                "\n" +
                "Iddo Island is connected to Lagos Island by the Eko Bridge and the Carter Bridge. Prior to the landfill, Iddo was connected to the Lagos Mainland by the Denton Bridge, named after Sir George Chardin Denton, former Lieutenant Governor of the Colony of Lagos.\n" +
                "Iddo is home to the Lagos Terminus and was the first and only place in Nigeria to host a tram service - linking Lagos Island through Carter Bridge.\n"));

        lagosArrayList.add(new Lagos(R.drawable.mushin,"Mushin","   Mushin is a Local Government Area in Lagos.It is located 10 km north of the city core, adjacent to the main road to Ikeja, and is largely a congested residential area with inadequate sanitation and low-quality housing. It had 633,009 inhabitants at the 2006 Census.\n" +
                "\n" +
                "   It is also where a lot of A list talents have risen from, artists such as Wande Coal."));

        lagosArrayList.add(new Lagos(R.drawable.ojo,"Ojo","   Ojo is a Local Government Area and town in Lagos State, Nigeria.\n" +
                "\n" +
                "Lagos State University is located there. Ojo is located on the eastern section of the Trans–West African Coastal Highway, about 37 km west of Lagos. It is part of the Lagos Metropolitan Area.\n" +
                "\n" +
                "Location of Ojo in Lagos Metropolitan Area\n" +
                "   Ojo is a primarily residential township although it contains some major markets including Alaba International Market, Alaba livestock market (Alaba Rago), the old Lagos International Trade Fair complex, and Iyana-Iba market. It also houses the divisional headquarters of 81 division Nigerian Army and Navy Town. South of the town (across Badagry creek), the rest of the local government is sparsely populated and consists of mangrove swamps and sandy beaches. Some of these beaches are holiday spots in the festive season.\n" +
                "\n" +
                "   Wildlife mostly consists of reptiles, rodents and birds including crocodiles, iguanas, monitor lizards and squirrels. Whales and dolphins have been known to visit the coastal areas.Some towns there are Iba, Igando, Okokomaiko, e.t.c.\n"));

        lagosArrayList.add(new Lagos(R.drawable.oshodi,"Oshodi/Isolo","   Oshodi is a town in Lagos State, and was popular for its market (Oshodi Market) which was one of the biggest market in Lagos until its demolition in 2016.\n" +
                "\n" +
                "   You can get in to this town from any part of Lagos by either by Luxurious buses, BRT buses or local buses. It is a popular area in Lagos and you won\\'t have difficulty in locating the town.\n" +
                "\n" +
                "   When in Oshodi there are various means of getting around either by a Commercial bus (Private Owned or Government Owned (BRT)), Tricycle (Keke), and a Motorcycle.\n" +
                "\n" +
                "   Oshodi is a hotspot, and you can have easy access to other parts of Lagos from Oshodi.\n"));

        lagosArrayList.add(new Lagos(R.drawable.somolu,"Somolu","   Somolu (or Shomolu) is a local government area (LGA) in Lagos. It is located in Southwest Nigeria, North of Lagos city and its administrative headquarters is located on Durosimi Street.\n" +
                "\n" +
                "   Somolu Local Government is part of the Lagos East Senatorial Zone and a lawmaker represents the district at the Federal House of Representatives.[1] Somolu is plagued by problems of poor sanity, high rent, overall poverty and youth criminal subculture.[2] It is also known for its printing industry, which is the largest in Lagos and one of the most diverse in the world.\n" +
                "    Most notably, offset and digital print shops can be found on the Bajulaiye Road.\n" +
                " It had a population of 403,569 in 2006, according to the Nigerian State Population Census.\n" +
                "\n" +
                "   Although, this number is likely not entirely accurate since it was calculated by finding the population of Lagos proper then using geospatial data to identify the populations the individual local government areas, and there are disputes as to the number for Lagos overall as well.[4] The governor of Lagos State, Bola Tinubu, claimed that a census conducted by the National Population Commission and Lagos at the same time placed the population of the state at upwards of 17.5 million.[5] The 2006 census found Lagos' population to be approximately 9 million.\n" +
                "   The most prominent ethnic group is the Yorubas, which are mostly made up of the Egbas, Aworis, Ijebus and Ilajes.\n" ));

        lagosArrayList.add(new Lagos(R.drawable.surulere,"Surulere","   During the rapid urbanization of Lagos, the city expanded to the west of its lagoon, which included present-day Surulere.\n" +
                "   Families from different regions of the country have historically settled in Surulere.\n" +
                "\n" +
                "   In addition to the local settlers of Lagos, during the nineteenth century, various emancipated African Brazilians and Cubans, who were referred to as Aguda or Saros, settled in Surulere.\n" +
                "   Nigerians from the Northern region initially ended at Idi-Araba, while many people from the eastern part were in various quarters but predominantly at Obele, Ikate, and Aguda areas.\n" +
                "   Residents of Lagos Island who bought or leased land from the government and Aworis settled in New Lagos. In contrast, others lived in the neighborhoods of Itire, Lawanson, Ojuelegba, Animashaun, and Shitta.\n" +
                "   The New Lagos neighborhood, also known as the Surulere Re-Housing Estate, is among the first public housing projects in Nigeria.\n" +
                "   Itire, one of the quarters in Surulere has a recognized traditional authority in the Onitire of Itire.\n"));

         MyLagosAdapter myLagosAdapter = new MyLagosAdapter(lagosArrayList,this,this);


       recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(myLagosAdapter);

    }

    @Override
    public void onItemClick(int positionOfTheAnimal) {
        Toast.makeText(this, "Clicked" + lagosArrayList.get(positionOfTheAnimal).getName(), Toast.LENGTH_SHORT).show();

        Intent intent  = new Intent(this,AnimalInfo.class);
        intent.putExtra("image",lagosArrayList.get(positionOfTheAnimal).getImage());
        intent.putExtra("name",lagosArrayList.get(positionOfTheAnimal).getName());
        intent.putExtra("description",lagosArrayList.get(positionOfTheAnimal).getDescription());
        startActivity(intent);

    }
}