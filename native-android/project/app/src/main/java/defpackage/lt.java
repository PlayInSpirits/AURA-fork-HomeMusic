package defpackage;

import com.eddyizm.tempus.subsonic.models.Bookmark;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.subsonic.models.BookmarksDeserializer$deserialize$1;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lt implements g32 {
    @Override // defpackage.g32
    public final Object a(h32 r1, Type r2, si1 r3) {
        vx4 r0 = (vx4) r3.o;
        r1.getClass();
        r2.getClass();
        Bookmarks r4 = new Bookmarks();
        h32 r5 = (h32) r1.a().n.get("bookmark");
        if (r5 != null) goto L6;
        return r4;
    L6:
        if ((r5 instanceof f32) == false) goto L9;
        Type r6 = new BookmarksDeserializer$deserialize$1().getType();
        List<Bookmark> r7 = (List) r0.b.b(r5, TypeToken.get(r6));
    L12:
        r4.setBookmarks(r7);
        return r4;
    L9:
        if ((r5 instanceof j32) == false) goto L11;
        r7 = gb.O(r0.b.b(r5, TypeToken.get(Bookmark.class)));
        goto L12
    L11:
        r7 = null;
        goto L12
    }
}
