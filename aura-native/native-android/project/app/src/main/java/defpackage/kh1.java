package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 {
    public final List a;

    public kh1(List list) {
        this.a = list;
        if (list.isEmpty()) {
            kf2.n("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                }
            }
            for (xf0 xf0Var : this.a) {
            }
        }
    }
}
