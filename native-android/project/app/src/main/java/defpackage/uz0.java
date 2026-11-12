package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uz0 implements rl0 {
    public final /* synthetic */ ea2 n;

    public uz0(EmojiCompatInitializer r1, ea2 r2) {
        this.n = r2;
    }

    @Override // defpackage.rl0
    public final void j(ba2 r4) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Handler r5 = o90.a(Looper.getMainLooper());
    L6:
        r5.postDelayed(new wz0(0), 500);
        this.n.f(this);
        return;
    L5:
        r5 = new Handler(Looper.getMainLooper());
        goto L6
    }
}
