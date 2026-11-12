package defpackage;

import com.eddyizm.tempus.subsonic.models.AlbumID3;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object r1) {
        return ((AlbumID3) r1).getSongCount().intValue();
    }
}
