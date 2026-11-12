package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 implements vw2 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ jq0(Context r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 r4) {
        int r0 = this.a;
        Context r2 = this.b;
        switch(r0) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            default: goto L5;
        };
    L5:
        return new lk(r2, r4.f(Integer.class, InputStream.class));
    L7:
        return new lk(r2, r4.f(Integer.class, AssetFileDescriptor.class));
    L9:
        return new du2(r2, 2);
    L11:
        return new du2(r2, 1);
    L13:
        return new du2(r2, 0);
    L15:
        return new lk(r2, this);
    L17:
        return new lk(r2, this);
    L19:
        return new lk(r2, this);
    }
}
