package defpackage;

import android.app.Application;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z45 implements y45, me0 {
    public final /* synthetic */ int n;

    public /* synthetic */ z45(int i) {
        this.n = i;
    }

    public static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // defpackage.y45
    public void c(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.y45
    public void f(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    public String toString() {
        switch (this.n) {
            case 2:
                int iHashCode = hashCode();
                ya4.g(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return f34.h("CreationExtras.Key@", string, "<", kx3.a(Application.class).c(), ">");
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int iHashCode2 = hashCode();
                ya4.g(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return f34.h("CreationExtras.Key@", string2, "<", kx3.a(String.class).c(), ">");
            default:
                return super.toString();
        }
    }
}
