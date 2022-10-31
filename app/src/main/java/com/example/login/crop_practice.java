package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class crop_practice extends AppCompatActivity {
    Button dateBtn,cocoBtn,rubberBtn,chokiBtn,arecanutBtn,teaBtn,cashewBtn,oil_btn,coffe_btn,cardamon_btn,tumeric_btn,belevine_btn,gererim_btn,cinamon_btn;
    Button garlic_btn,ginger_btn,clove_btn,black_btn,Fennel_btn, allspice_btn,nutmeg_btn;
    Button rose_btn,chrysanthemum_btn,Lilium_btn,goldenrod_btn,aster_btn,gerbera_btn,gladiolus_btn,dendrobiumorchi_btn,carnation_btn,tuberose_btn;
    Button apple_btn,orange_btn,papaya_btn,guava_btn,lemon_btn,greeps_btn,pineapple_btn,banana_btn,sapota_btn,mango_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crop_practice);

        dateBtn=findViewById(R.id.date_btn);
        cocoBtn=findViewById(R.id.coco_btn);
        rubberBtn=findViewById(R.id.rubber_btn);
        chokiBtn=findViewById(R.id.choki_btn);
        arecanutBtn=findViewById(R.id.arecanut_btn);
        teaBtn=findViewById(R.id.tea_btn);
        cashewBtn=findViewById(R.id.cashew_btn);
        garlic_btn=findViewById(R.id.garlic_btn);
        ginger_btn=findViewById(R.id.ginger_btn);
        clove_btn=findViewById(R.id.clove_btn);
        black_btn=findViewById(R.id.pepper_btn);
        nutmeg_btn=findViewById(R.id.nutmeg_btn);
        allspice_btn=findViewById(R.id.allspice_btn);
        Fennel_btn=findViewById(R.id.fennel_btn);
        rose_btn=findViewById(R.id.rose_btn);
        chrysanthemum_btn=findViewById(R.id.chrysanthemum_btn);
        Lilium_btn=findViewById(R.id.lilium_btn);
        goldenrod_btn=findViewById(R.id.golden_btn);
        aster_btn=findViewById(R.id.aster_btn);
        gerbera_btn=findViewById(R.id.gerbera_btn);
        gladiolus_btn=findViewById(R.id.gladiolus_btn);
        dendrobiumorchi_btn=findViewById(R.id.dendrobium_btn);
        carnation_btn=findViewById(R.id.carnation_btn);
        tuberose_btn=findViewById(R.id.tuberose_btn);
        apple_btn=findViewById(R.id.apple_btn);
        orange_btn=findViewById(R.id.orange_btn);
        banana_btn=findViewById(R.id.banana_btn);
        mango_btn=findViewById(R.id.mango_btn);
        guava_btn=findViewById(R.id.guava_btn);
        pineapple_btn=findViewById(R.id.pineapple_btn);
        lemon_btn=findViewById(R.id.lemon_btn);
        papaya_btn=findViewById(R.id.papaya_btn);
        greeps_btn=findViewById(R.id.grapes_btn);
        sapota_btn=findViewById(R.id.sapota_btn);
        oil_btn=findViewById(R.id.oil_btn);
        coffe_btn=findViewById(R.id.coffee_btn);
        cardamon_btn=findViewById(R.id.cardamom_btn);
        tumeric_btn=findViewById(R.id.turmeric_btn);
        belevine_btn=findViewById(R.id.betelvine_btn);
        gererim_btn=findViewById(R.id.geranium_btn);
        cinamon_btn=findViewById(R.id.cinnamon_btn);





        garlic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Garlic_info.class));
            }
        });


        ginger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Ginger_info.class));
            }
        });

        clove_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Clove_info.class));
            }
        });

        black_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Black_info.class));
            }
        });


        dateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Date_Info.class));
            }
        });

        cocoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Coco_Nut.class));
            }
        });

        rubberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Rubber_info.class));
            }
        });

        chokiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Choki_info.class));
            }
        });

        arecanutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,arecanut_info.class));
            }
        });

        teaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Tea_info.class));
            }
        });

        cashewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Cashew_info.class));
            }
        });
        nutmeg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Nutmeg_info.class));
            }
        });
        allspice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Allspice_info.class));
            }
        });

        Fennel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Fennel_info.class));
            }
        });
        rose_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActivity(new Intent(crop_practice.this,Rose_info.class));
    }
});

         chrysanthemum_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(crop_practice.this,Chrysanthemum_info.class));
             }
         });

Lilium_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(crop_practice.this,Lilium_info.class));
    }
});

        aster_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Aster_info.class));
            }
        });

        gladiolus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Gladiolus_info.class));
            }
        });

        dendrobiumorchi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Dendrobiumorchi_info.class));
            }
        });

        carnation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Carnation_info.class));
            }
        });

        tuberose_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Tuberose_info.class));
            }
        });


        apple_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Apple_info.class));
            }
        });


        banana_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Banana_info.class));
            }
        });


        orange_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Orange_info.class));
            }
        });


        mango_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Mango_Info.class));
            }
        });


        greeps_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Greeps_info.class));
            }
        });



        sapota_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Sapota_info.class));
            }
        });


        pineapple_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Pineapple_info.class));
            }
        });



        guava_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Guava_info.class));
            }
        });


        pineapple_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Pineapple_info.class));
            }
        });


        lemon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Lemon_info.class));
            }
        });

        papaya_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Papaya_info.class));
            }
        });


       gerbera_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Gerbera_info.class));
            }
        });



        oil_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Oil_info.class));
            }
        });




        tumeric_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Turmeric_info.class));
            }
        });



        belevine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Belevin_info.class));
            }
        });


       cardamon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Cardamon_info.class));
            }
        });


        belevine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Belevin_info.class));
            }
        });

        cinamon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Cinaman_info.class));
            }
        });

        gererim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Gerenim_info.class));
            }
        });

        coffe_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crop_practice.this,Coffee_info.class));
            }
        });












    }
}