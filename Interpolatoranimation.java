package mobiroad.com.animation.interpolatore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import mobiroad.com.animation.R;

public class Interpolatoranimation extends AppCompatActivity {
    Button tv_alpha;
    ImageView image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_alpha = findViewById(R.id.tv_alpha);

        image = findViewById(R.id.image);

        tv_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(Interpolatoranimation.this, R.anim.antipanimation);
                image.startAnimation(animation);
            }
        });

    }
}
