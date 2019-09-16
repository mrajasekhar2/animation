package mobiroad.com.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ObjectAnimationActivity extends AppCompatActivity {
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

                Animator animator = AnimatorInflater.loadAnimator(ObjectAnimationActivity.this, R.animator.alpha);
                animator.setTarget(image);
                animator.start();
            }
        });

    }
}
