package defpackage;

import com.eddyizm.tempus.subsonic.models.Bookmark;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lt implements g32 {
    @Override // defpackage.g32
    public final Object a(h32 h32Var, Type type, si1 si1Var) {
        List<Bookmark> listO;
        vx4 vx4Var = (vx4) si1Var.o;
        h32Var.getClass();
        type.getClass();
        Bookmarks bookmarks = new Bookmarks();
        h32 h32Var2 = (h32) h32Var.a().n.get("bookmark");
        if (h32Var2 == null) {
            return bookmarks;
        }
        if (h32Var2 instanceof f32) {
            listO = (List) vx4Var.b.b(h32Var2, TypeToken.get(new TypeToken<List<? extends Bookmark>>() { // from class: com.eddyizm.tempus.subsonic.models.BookmarksDeserializer$deserialize$1
            }.getType()));
        } else {
            listO = h32Var2 instanceof j32 ? gb.O(vx4Var.b.b(h32Var2, TypeToken.get((Type) Bookmark.class))) : null;
        }
        bookmarks.setBookmarks(listO);
        return bookmarks;
    }
}
