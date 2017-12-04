package com.victorsaico.widgeteventos;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by JARVIS on 4/12/2017.
 */

public class WidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new WidgetDataProvider(this, intent);
    }
}
