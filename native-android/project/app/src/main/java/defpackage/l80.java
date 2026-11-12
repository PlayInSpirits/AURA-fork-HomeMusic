package defpackage;

import androidx.compose.runtime.ComposeRuntimeError;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l80 {
    public static final k93 a = null;
    public static final k93 b = null;
    public static final k93 c = null;
    public static final k93 d = null;
    public static final k93 e = null;

    static {
        a = new k93("provider");
        b = new k93("provider");
        c = new k93("compositionLocalMap");
        d = new k93("providers");
        e = new k93("reference");
    }

    public static final void a(String r3) {
        throw new ComposeRuntimeError(xa3.h("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", r3, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String r3) {
        throw new ComposeRuntimeError(xa3.h("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", r3, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
}
