package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements u75 {
    public int a;
    public boolean b;
    public Object c;

    public i(MessageDigest messageDigest, int i) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.a = i;
    }

    @Override // defpackage.u75
    public void a() {
        this.b = true;
    }

    @Override // defpackage.u75
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    @Override // defpackage.u75
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.s = null;
        super/*android.view.View*/.setVisibility(this.a);
    }
}
