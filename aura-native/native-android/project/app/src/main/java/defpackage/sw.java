package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sw implements xh0 {
    public final /* synthetic */ int a;

    public /* synthetic */ sw(int i) {
        this.a = i;
    }

    @Override // defpackage.xh0
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // defpackage.xh0
    public final yh0 b(Object obj) {
        switch (this.a) {
            case 0:
                return new tw(0, (ByteBuffer) obj);
            case 1:
                return new zh0(18, obj);
            default:
                return new a((ParcelFileDescriptor) obj);
        }
    }
}
