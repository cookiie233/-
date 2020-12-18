package qimozuoye;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.lenovo.R;

import java.util.Random;

    public class ccc extends AppCompatActivity {

        @Override
    protected  void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qimo);

        Button roll=(Button)findViewById(R.id.button);
        roll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int randNumber = rand.nextInt(6)+1;
//                String randNumber2 = rand.nextInt(6)+1;
                ImageView diceImage = (ImageView) findViewById(R.id.a5);

//                获取对ImageView对象的引用

                int drawableResource;
//                将随机数与对应的图片资源联系起来
                switch (randNumber){
                    case 1: drawableResource = R.drawable.laoying; break;
                    case 2: drawableResource = R.drawable.banya; break;
                    case 3: drawableResource = R.drawable.haibao; break;
                    case 4: drawableResource = R.drawable.girl; break;
                    case 5: drawableResource = R.drawable.shuai; break;
                    case 6: drawableResource = R.drawable.woniu; break;
                    case 0：drawableResource = R.drawable.woniu; 


                    default:
                        throw new IllegalStateException("Unexpected value: " + randNumber);
        }
                Drawable drawable = getBaseContext().getResources().getDrawable(drawableResource);
                diceImage.setImageDrawable(drawable);


            }


});
        }
    }
