# CustomViewPager
在LinearLayout里面添加一个viewpager与一个RadioGroup，构成一个自定义的CustomViewPager，可设置RadioGroup的位置，RadioButton的风格。
##使用方法

```
        int count=2;
        CustomViewPager pager = new CustomViewPager(this);
//      这表示布局的方式与RadioGroup的位置，布局有线性布局还是帧布局两种，位置有上下左右
        pager.setType(PagerType.LINEAR_TOP);
//      设置RadioButton的风格，设置为一个小圆点
//      pager.setRadioButtonPonit(count, 20 ,Color.WHITE, Color.RED);

        pager.setRadioButtonTexts(new String[] { "hello", "world" }, 0, 0, 20);
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


```


##效果图
![Example Image][1]
----------

[1]: https://raw.github.com/canyinghao2/CustomViewPager/master/record.gif
