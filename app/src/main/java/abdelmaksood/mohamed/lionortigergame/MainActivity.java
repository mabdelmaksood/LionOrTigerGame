package abdelmaksood.mohamed.lionortigergame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;
    private ImageView img7;
    private ImageView img8;
    private ImageView img9;
    enum Player{
        ONE,TWO
    }
    Player myPlayer=Player.ONE;
    Player[] choices=new Player[9];
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
        Toast.makeText(getApplicationContext(),"Player One's Turn",Toast.LENGTH_LONG).show();
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
        int tag = Integer.parseInt(myImg.getTag().toString());
        choices[tag]=myPlayer;
         int[][] winCases= new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

        if (myPlayer==Player.ONE) {
            ImageView image = (ImageView) myImg;
            image.setTranslationX(2000);
            image.setImageResource(R.drawable.tiger);
            image.animate().translationX(0).alpha(1).rotation(360).setDuration(1000);
            myPlayer=Player.TWO;
            Toast.makeText(getApplicationContext(),"Player Two's Turn",Toast.LENGTH_SHORT).show();

        }else{
            ImageView image = (ImageView) myImg;
            image.setTranslationX(-2000);
            image.setImageResource(R.drawable.lion);
            image.animate().translationX(0).alpha(1).rotation(360).setDuration(1000);
            myPlayer=Player.ONE;
            Toast.makeText(getApplicationContext(),"Player One's Turn",Toast.LENGTH_SHORT).show();

        }
        for(int[] a :winCases){
            if((choices[a[0]]==Player.ONE&&choices[a[1]]==Player.ONE&&choices[a[2]]==Player.ONE)||(choices[a[0]]==Player.TWO&&choices[a[1]]==Player.TWO&&choices[a[2]]==Player.TWO)){
                Toast.makeText(getApplicationContext(),"Player "+choices[a[0]]+" wins",Toast.LENGTH_LONG).show();
                img1.animate().alpha(0).setDuration(500);
                img2.animate().alpha(0).setDuration(500);
                img3.animate().alpha(0).setDuration(500);
                img4.animate().alpha(0).setDuration(500);
                img5.animate().alpha(0).setDuration(500);
                img6.animate().alpha(0).setDuration(500);
                img7.animate().alpha(0).setDuration(500);
                img8.animate().alpha(0).setDuration(500);
                img9.animate().alpha(0).setDuration(500);
                //w AlertDialog.Builder(getApplicationContext()).setTitle("Player "+choices[a[0]]+" wins").setMessage("Player "+choices[a[0]]+" wins").show();
            }
        }

    }
}
