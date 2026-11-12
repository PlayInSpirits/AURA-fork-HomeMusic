package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bm3 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        Child child = (Child) obj;
        if (child.getDuration() != null) {
            return child.getDuration().intValue();
        }
        return 0L;
    }
}
