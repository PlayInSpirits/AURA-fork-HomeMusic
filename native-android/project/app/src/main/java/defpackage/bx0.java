package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bx0 {
    public static final Field a = null;

    static {
        Field r0 = null;
        r0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");     // Catch: NoSuchFieldException -> L5
        r0.setAccessible(true);     // Catch: NoSuchFieldException -> L5
    L7:
        a = r0;
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }
}
