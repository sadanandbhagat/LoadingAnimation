package sadanand.yash.com.loadinganimation;
//Made By sadanand_Bhagat on 14Dec2017

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.SpriteImage);
        if(imageView==null) throw new AssertionError();
        imageView.setBackgroundResource(R.drawable.animation_loading);
        animationDrawable=(AnimationDrawable)imageView.getBackground();
        animationDrawable.start();
    }
}
