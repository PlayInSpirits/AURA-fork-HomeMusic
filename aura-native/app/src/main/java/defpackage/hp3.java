package defpackage;

import android.view.Window;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class hp3 {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
