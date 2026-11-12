package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h65 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ld0 b(View view, ld0 ld0Var) {
        ContentInfo contentInfoT = ld0Var.a.t();
        Objects.requireNonNull(contentInfoT);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoT);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoT ? ld0Var : new ld0(new zh0(contentInfoPerformReceiveContent));
    }
}
