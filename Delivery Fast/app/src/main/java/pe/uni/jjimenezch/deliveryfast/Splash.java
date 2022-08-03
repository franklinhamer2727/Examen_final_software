package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    ImageView imageView_1;
    TextView textView_1;
    TextView textView_2;
    Animation animationImage, animationText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        imageView_1 = findViewById(R.id.imageView_1);
        textView_1 = findViewById(R.id.textView_1);
        textView_2 = findViewById(R.id.textView_2);

        /* Para vincular, se importa el animatio utils*/

        animationImage = AnimationUtils.loadAnimation(this, R.anim.image_animation);
        animationText = AnimationUtils.loadAnimation(this, R.anim.text_animation);

        imageView_1.setAnimation(animationImage);
        textView_1.setAnimation(animationText);
        textView_2.setAnimation(animationText);

        /* aca en el count va intervalos de tiempo*/
        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        }.start();


    }
}