package com.eddyizm.tempus.util;

import com.eddyizm.tempus.subsonic.models.OpenSubsonicExtension;
import defpackage.at0;
import defpackage.b11;
import defpackage.nk1;
import defpackage.xa3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static OpenSubsonicExtension a(String r4) {
        if (b() != null) goto L6;
        return null;
    L6:
        return (OpenSubsonicExtension) b().stream().filter(new at0(13, r4)).findAny().orElse(null);
    }

    public static List b() {
        if (xa3.u("open_subsonic", false) == true) goto L5;
    L8:
        return null;
    L5:
        if (b11.m("open_subsonic_extensions", null) == null) goto L8;
        return (List) new nk1().f(b11.m("open_subsonic_extensions", null), new OpenSubsonicExtensionsUtil$1().getType());
    }
}
