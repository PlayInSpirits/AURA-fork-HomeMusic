package defpackage;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class da5 {
    public static boolean a(Window.Callback r0, SearchEvent r1) {
        return r0.onSearchRequested(r1);
    }

    public static ActionMode b(Window.Callback r0, ActionMode.Callback r1, int r2) {
        return r0.onWindowStartingActionMode(r1, r2);
    }
}
