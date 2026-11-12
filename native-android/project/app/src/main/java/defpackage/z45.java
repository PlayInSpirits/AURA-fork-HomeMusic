package defpackage;

import android.app.Application;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z45 implements y45, me0 {
    public final /* synthetic */ int n;

    public /* synthetic */ z45(int r1) {
        this.n = r1;
    }

    public static final CharSequence a(Object r1) {
        Objects.requireNonNull(r1);
        if ((r1 instanceof CharSequence) == false) goto L7;
        return (CharSequence) r1;
    L7:
        return r1.toString();
    }

    @Override // defpackage.y45
    public void c(MediaExtractor r1, Object r2) {
        r1.setDataSource(((ParcelFileDescriptor) r2).getFileDescriptor());
    }

    @Override // defpackage.y45
    public void f(MediaMetadataRetriever r1, Object r2) {
        r1.setDataSource(((ParcelFileDescriptor) r2).getFileDescriptor());
    }

    public String toString() {
        switch(this.n) {
            case 2: goto L8;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        int r5 = hashCode();
        ya4.g(16);
        String r6 = Integer.toString(r5, 16);
        r6.getClass();
        return f34.h("CreationExtras.Key@", r6, "<", kx3.a(String.class).c(), ">");
    L8:
        int r7 = hashCode();
        ya4.g(16);
        String r8 = Integer.toString(r7, 16);
        r8.getClass();
        return f34.h("CreationExtras.Key@", r8, "<", kx3.a(Application.class).c(), ">");
    L5:
        return super.toString();
    }
}
