package com.canyinghao.customviewpager;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int count=2;
        CustomViewPager pager = new CustomViewPager(this);
//		这表示布局的方式与RadioGroup的位置，布局有线性布局还是帧布局两种，位置有上下左右
        pager.setType(CustomViewPager.PagerType.FRAME_TOP_RIGHT);
//		设置RadioButton的风格，设置为一个小圆点
        pager.setRadioButtonPonit(count, 20 , Color.WHITE, Color.RED);

//		pager.setRadioButtonTexts(new String[] { "hello", "world" }, 0, 0, 20);
        pager.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT));
        List<View> pageViews = new ArrayList<View>();
        for (int i = 0; i < count; i++) {
            TextView view = new TextView(this);
            view.setText( "这是第"+(i+1) +"页");
            view.setTextSize(50);
            view.setTextColor(Color.RED);
            pageViews.add(view);
        }
        ViewPagerAdapter adapter = new ViewPagerAdapter(pageViews);
        pager.setAdapter(adapter);
        setContentView(pager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
