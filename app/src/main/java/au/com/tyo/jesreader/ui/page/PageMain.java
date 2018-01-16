package au.com.tyo.jesreader.ui.page;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;

import au.com.tyo.app.Controller;
import au.com.tyo.jesreader.R;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 27/11/17.
 */

public class PageMain extends PageCommon {

    /**
     * @param controller
     * @param activity
     */
    public PageMain(Controller controller, Activity activity) {
        super(controller, activity);
    }

    @Override
    public void onActivityStart() {
        super.onActivityStart();

        if (!controller.hasUserLoggedIn()) {
            controller.getUi().gotoLoginPage();

            finish();
        }
    }

    @Override
    protected void createMenu(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(R.menu.product, menu);
        super.createMenu(menuInflater, menu);
    }
}
