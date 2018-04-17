package canvas.com.accordiandemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import canvas.com.accordiandemo.adapter.CategoryAdapter;
import canvas.com.accordiandemo.helper.RecyclerTouchListener;
import canvas.com.accordiandemo.model.Category;

public class MainActivity extends AppCompatActivity {
    private List<Category> Categories = new ArrayList<>();
    private RecyclerView recyclerView;
    private CategoryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        dummyData();
        mAdapter = new CategoryAdapter(this, Categories);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
    }


    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(MainActivity.this, recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, final int position) {

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


    }
private void dummyData()
{
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
    Categories.add(new Category());
}
}
