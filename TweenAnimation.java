package mobiroad.com.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class TweenAnimation extends AppCompatActivity {
    Button tv_alpha, tv_scale, tv_rotate, tv_translate, frame;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_alpha = findViewById(R.id.tv_alpha);
        tv_scale = findViewById(R.id.tv_scale);
        tv_rotate = findViewById(R.id.tv_rotate);
        tv_translate = findViewById(R.id.tv_translate);

        image = findViewById(R.id.image);

        frame = findViewById(R.id.frame);


        tv_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(TweenAnimation.this, R.anim.alpha);
                animation.setDuration(1000);
                image.startAnimation(animation);
//                animation.start();
            }
        });

        tv_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(TweenAnimation.this, R.anim.scale);
                animation.setDuration(1000);
                image.startAnimation(animation);
            }
        });

        tv_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(TweenAnimation.this, R.anim.translate);
                animation.setDuration(1000);
                image.startAnimation(animation);
            }
        });

        tv_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(TweenAnimation.this, R.anim.rotate);
                animation.setDuration(1000);
                image.startAnimation(animation);

            }
        });

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                ImageView image = (ImageView) findViewById(R.id.image);
                image.setBackgroundResource(R.drawable.frame);

                AnimationDrawable frameAnimation = (AnimationDrawable) image.getBackground();

                frameAnimation.start();
            }
        });
    }
}
