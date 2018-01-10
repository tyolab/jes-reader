package au.com.tyo.inventory;

import android.content.Context;

import au.com.tyo.app.CommonApp;
import au.com.tyo.app.PageAgent;
import au.com.tyo.inventory.ui.UI;
import au.com.tyo.inventory.ui.page.PageCommon;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 24/11/17.
 */

public class App extends CommonApp<UI, Controller> implements Controller {

    static {
        PageAgent.setPagesPackage(PageCommon.class.getPackage().getName());
    }

    public App(Context context) {
        super(context);
    }

    @Override
    public boolean hasUserLoggedIn() {
        return false;
    }
}
