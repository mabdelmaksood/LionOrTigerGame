package abdelmaksood.mohamed.lionortigergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int random;
    private Random rand=new Random();
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;
    private ImageView img7;
    private ImageView img8;
    private ImageView img9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=  findViewById(R.id.img1);
        img2=  findViewById(R.id.img2);
        img3=  findViewById(R.id.img3);
        img4=  findViewById(R.id.img4);
        img5=  findViewById(R.id.img5);
        img6=  findViewById(R.id.img6);
        img7=  findViewById(R.id.img7);
        img8=  findViewById(R.id.img8);
        img9=  findViewById(R.id.img9);
    }
    public void onTextClick(View myTextView){
        TextView txt=(TextView) myTextView;
        img1.animate().alpha(0).setDuration(500);
        img2.animate().alpha(0).setDuration(500);
        img3.animate().alpha(0).setDuration(500);
        img4.animate().alpha(0).setDuration(500);
        img5.animate().alpha(0).setDuration(500);
        img6.animate().alpha(0).setDuration(500);
        img7.animate().alpha(0).setDuration(500);
        img8.animate().alpha(0).setDuration(500);
        img9.animate().alpha(0).setDuration(500);



    }
    public void onImageClick(View myImg) {
        random = rand.nextInt(100) % 2;
        if (random==1) {
            ImageView image = (ImageView) myImg;
            image.setTranslationX(2000);
            image.setImageResource(R.drawable.tiger);
            image.animate().translationX(0).alpha(1).rotation(360).setDuration(2000);
        }else{
            ImageView image = (ImageView) myImg;
            image.setTranslationX(-2000);
            image.setImageResource(R.drawable.lion);
            image.animate().translationX(0).alpha(1).rotation(360).setDuration(2000);
            }
    }
}
