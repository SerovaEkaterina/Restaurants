package com.example.lenovo.app.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.app.Adapter;
import com.example.lenovo.app.R;
import com.example.lenovo.app.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        List<Item> mlist = new ArrayList<>();
        mlist.add(new Item("Ресторан Panorama A.S.P.",R.drawable.cafe1,"ул. Малышева, д. 51, БЦ «Высоцкий», 50 этаж","Заведение радует гостей разнообразным меню, смелым дизайном интерьера, уютной обстановкой и незабываемым видом на город."));
        mlist.add(new Item("Maccheroni",R.drawable.cafe2," просп. Ленина, д.40","Оригинальный интерьер, большие панорамные окна, уютные столики с диванчиками, внимательный сервис, аппетитные блюда итальянской кухни."));
        mlist.add(new Item("FIVE",R.drawable.cafe3,"ул. Малышева, д. 53, 5-й эт","FIVE — это ресторан в самом центре города с панорамным видом и настоящим гастрономическим разнообразием."));
        mlist.add(new Item("ZEPPELIN",R.drawable.cafe4," ул. Академика Шварца, д. 17","В ресторане ZEPPELIN можно вкусно позавтракать, сытно пообедать и неспешно поужинать."));
        mlist.add(new Item("Паштет",R.drawable.cafe5,"ул. Толмачева, д. 23","Ресторан вдохновлен стилистикой 60-х – времени, когда формировалась особенная эстетика домашнего уюта, от которого жизнь казалась ярче и светлее."));
        mlist.add(new Item("Счастье",R.drawable.cafe6," ул. 8 Марта, д. 46","Пригласить в это необычное заведение любимую девушку стоит обязательно, ведь здесь не только вкусно кормят: тут по-настоящему уютно и очень необычно."));
        Adapter adapter = new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
