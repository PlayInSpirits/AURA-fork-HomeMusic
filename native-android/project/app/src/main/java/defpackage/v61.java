package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 extends jk {
    public final /* synthetic */ int r;

    public /* synthetic */ v61(AssetManager r1, String r2, int r3) {
        this.r = r3;
        super(0, r2, r1);
    }

    @Override // defpackage.sh0
    public final Class a() {
        switch(this.r) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L6:
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.jk
    public final void g(Object r1) {
        switch(this.r) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((InputStream) r1).close();
        return;
    L6:
        ((AssetFileDescriptor) r1).close();
    }

    @Override // defpackage.jk
    public final Object i(AssetManager r1, String r2) {
        switch(this.r) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.open(r2);
    L7:
        return r1.openFd(r2);
    }
}
