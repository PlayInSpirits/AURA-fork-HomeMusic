package defpackage;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class da5 {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
