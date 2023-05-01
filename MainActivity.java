package ko.co.company.a8_my_visible;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//8장 숨기처리
public class MainActivity extends AppCompatActivity {

    Button back1,back2;
    ImageView back1_img,back2_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        back1 = (Button)findViewById(R.id.back1);
        back2 = (Button)findViewById(R.id.back2);
        back1_img = (ImageView) findViewById(R.id.back1_img);
        back2_img = (ImageView) findViewById(R.id.back2_img);

//    ()안에 new를 입력하지 않고 click을 공통적으로 준 후 아래에 OnClickListener생성
        back1.setOnClickListener(click);
        back2.setOnClickListener(click);


    }//onCreat()

//    위의 back1,back2의 click을 참조하고 있음 ->어떤 버튼을 클릭해도 OnClickListener click으로 모인다.
//    back1,back2 어느것을 클릭하든 OnClickListener click의 안의 메소드를 실행함
//    back1을 클릭한건지 back2를 클릭한건지 구분하는게 ()안의 view임
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.back1:
                back1_img.setVisibility(View.VISIBLE);  //1이 보일때 2안보임
                back2_img.setVisibility(View.INVISIBLE);
                break;
                case R.id.back2:
                back2_img.setVisibility(View.VISIBLE);// 2 보일때 1 안보임
                back1_img.setVisibility(View.INVISIBLE);
                break;
            }
        }
    };


}