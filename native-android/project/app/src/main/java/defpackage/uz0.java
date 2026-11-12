package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uz0 implements rl0 {
    public final /* synthetic */ ea2 n;

    public uz0(EmojiCompatInitializer emojiCompatInitializer, ea2 ea2Var) {
        this.n = ea2Var;
    }

    @Override // defpackage.rl0
    public final void j(ba2 ba2Var) {
        (Build.VERSION.SDK_INT >= 28 ? o90.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new wz0(0), 500L);
        this.n.f(this);
    }
}
