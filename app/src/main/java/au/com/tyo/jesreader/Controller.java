package au.com.tyo.jesreader;

import au.com.tyo.jesreader.ui.UI;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 24/11/17.
 */

public interface Controller extends au.com.tyo.app.Controller<UI> {

    boolean hasUserLoggedIn();

}
