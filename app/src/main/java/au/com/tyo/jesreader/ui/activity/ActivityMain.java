package au.com.tyo.jesreader.ui.activity;

import au.com.tyo.app.CommonActivity;
import au.com.tyo.jesreader.ui.page.PageMain;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 27/11/17.
 */

public class ActivityMain extends CommonActivity {

    static {
        setPageClass(PageMain.class);
    }

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setupToolbar();
//    }
//
//    public void setupToolbar() {
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.product, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
}
