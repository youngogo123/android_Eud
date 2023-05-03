package ko.co.company.a23_05_03_calinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    TextView textview1, textview2,textview3;
    Calendar calendar;
    Button button;
    String format = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        timePicker = findViewById(R.id.timepicker);
        textview1 = findViewById(R.id.textview1);
        textview2 = findViewById(R.id.textview2);
        textview3 = findViewById(R.id.textview3);
        calendar=Calendar.getInstance(); // 카렌더는 new 연산자 안씀. 추상클래스로 존재하기에 메소드로 호출함
//        이 카렌더 객체가 있어야 데이터를 가져오기 가능   // get인스턴스로 생성해야함

        int hour = calendar.get(Calendar.HOUR_OF_DAY); //카렌더의 시간을 가져오겠다.(24시간/0~23까지의 데이터 가져옴)
        int min = calendar.get(Calendar.MINUTE);  // 카렌더의 분을 가져오겠다.

        showTime(hour,min);



    }
    public void onClikeButton(View view){
        int hour= timePicker.getHour();
        int min = timePicker.getMinute();
        showTime(hour,min);
    }


    private void showTime(int hour, int min) {


        if (hour ==0 ){
            hour+=12;
            format ="AM";
        } else if (hour==12) {
            format="PM";

        } else if (hour>12) {
            hour-=12;
            format="PM";

        }else {
            format="AM";
        }

        textview3.setText(new StringBuilder().append(hour).append(":").append(min)
                .append(" ").append(format));

    }
}