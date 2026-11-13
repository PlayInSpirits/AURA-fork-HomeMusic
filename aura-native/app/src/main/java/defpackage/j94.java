/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.e02;
import defpackage.e94;
import defpackage.i94;
import defpackage.j03;
import java.util.List;

public final class j94 {
    public final e94 a;
    public final j03 b;

    public j94(i94 i942, e02 e022) {
        this.a = i942.d;
        List list = i94.j(4, i942);
        this.b = new j03(list.size());
        int n16 = list.size();
        for (int i16 = 0; i16 < n16; ++i16) {
            i942 = (i94)list.get(i16);
            if (!e022.a(i942.f)) continue;
            this.b.a(i942.f);
        }
    }
}

