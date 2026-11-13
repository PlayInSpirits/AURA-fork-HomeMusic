package com.eddyizm.tempus.util;

import com.eddyizm.tempus.subsonic.models.OpenSubsonicExtension;
import com.google.common.reflect.TypeToken;
import defpackage.at0;
import defpackage.b11;
import defpackage.nk1;
import defpackage.xa3;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class a {
    public static OpenSubsonicExtension a(String str) {
        if (b() == null) {
            return null;
        }
        return (OpenSubsonicExtension) b().stream().filter(new at0(13, str)).findAny().orElse(null);
    }

    public static List b() {
        if (!xa3.u("open_subsonic", false) || b11.m("open_subsonic_extensions", null) == null) {
            return null;
        }
        return (List) new nk1().f(b11.m("open_subsonic_extensions", null), new TypeToken<List<OpenSubsonicExtension>>() { // from class: com.eddyizm.tempus.util.OpenSubsonicExtensionsUtil$1
        }.getType());
    }
}
