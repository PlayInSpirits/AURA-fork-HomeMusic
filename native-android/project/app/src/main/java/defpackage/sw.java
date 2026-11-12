package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sw implements xh0 {
    public final /* synthetic */ int a;

    public /* synthetic */ sw(int r1) {
        this.a = r1;
    }

    @Override // defpackage.xh0
    public final Class a() {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        return ParcelFileDescriptor.class;
    L8:
        return ByteBuffer.class;
    L7:
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // defpackage.xh0
    public final yh0 b(Object r2) {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new a((ParcelFileDescriptor) r2);
    L7:
        return new zh0(18, r2);
    L9:
        return new tw(0, (ByteBuffer) r2);
    }
}
