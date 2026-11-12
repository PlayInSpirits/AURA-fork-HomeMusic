package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class il3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ml3 o;
    public final /* synthetic */ String p;

    public /* synthetic */ il3(ml3 ml3Var, String str, int i) {
        this.n = i;
        this.o = ml3Var;
        this.p = str;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i = this.n;
        String str = this.p;
        ml3 ml3Var = this.o;
        switch (i) {
            case 0:
                Object obj2 = ml3Var.c;
                z34 z34VarU = ((x34) obj).U("SELECT p.*, (pp.playlistId IS NOT NULL) AS isPinned FROM playlist p LEFT JOIN pinned_playlist pp ON p.id = pp.playlistId ORDER BY CASE WHEN ? = 'ORDER_BY_RANDOM' THEN RANDOM() END ASC, CASE WHEN ? = 'ORDER_BY_PINNED' THEN pp.playlistId IS NOT NULL END DESC, CASE WHEN ? = 'ORDER_BY_NAME' THEN p.name END ASC, CASE WHEN ? = 'ORDER_BY_DATE' THEN p.created END DESC, CASE WHEN ? = 'ORDER_BY_SONGS' THEN p.songCount END DESC, CASE WHEN ? = 'ORDER_BY_LAST_PLAYED' THEN p.lastPlayed END DESC, CASE WHEN ? = 'ORDER_BY_LAST_UPDATED' THEN p.changed END DESC, CASE WHEN ? = 'ORDER_BY_BOTH' THEN MAX(p.lastPlayed, IFNULL(p.changed, 0)) END DESC LIMIT ?");
                try {
                    if (str == null) {
                        z34VarU.e(1);
                    } else {
                        z34VarU.r(1, str);
                    }
                    if (str == null) {
                        z34VarU.e(2);
                    } else {
                        z34VarU.r(2, str);
                    }
                    if (str == null) {
                        z34VarU.e(3);
                    } else {
                        z34VarU.r(3, str);
                    }
                    if (str == null) {
                        z34VarU.e(4);
                    } else {
                        z34VarU.r(4, str);
                    }
                    if (str == null) {
                        z34VarU.e(5);
                    } else {
                        z34VarU.r(5, str);
                    }
                    if (str == null) {
                        z34VarU.e(6);
                    } else {
                        z34VarU.r(6, str);
                    }
                    if (str == null) {
                        z34VarU.e(7);
                    } else {
                        z34VarU.r(7, str);
                    }
                    if (str == null) {
                        z34VarU.e(8);
                    } else {
                        z34VarU.r(8, str);
                    }
                    z34VarU.c(9, 20L);
                    int iE = rr2.E(z34VarU, "id");
                    int iE2 = rr2.E(z34VarU, "name");
                    int iE3 = rr2.E(z34VarU, "duration");
                    int iE4 = rr2.E(z34VarU, "coverArt");
                    int iE5 = rr2.E(z34VarU, "comment");
                    int iE6 = rr2.E(z34VarU, "owner");
                    int iE7 = rr2.E(z34VarU, "isUniversal");
                    int iE8 = rr2.E(z34VarU, "songCount");
                    int iE9 = rr2.E(z34VarU, "created");
                    int iE10 = rr2.E(z34VarU, "changed");
                    int iE11 = rr2.E(z34VarU, "lastPlayed");
                    int iE12 = rr2.E(z34VarU, "allowedUsers");
                    ArrayList arrayList = new ArrayList();
                    while (z34VarU.O()) {
                        Playlist playlist = new Playlist(z34VarU.isNull(iE) ? null : z34VarU.D(iE), z34VarU.isNull(iE2) ? null : z34VarU.D(iE2), z34VarU.getLong(iE3), z34VarU.isNull(iE4) ? null : z34VarU.D(iE4));
                        playlist.setComment(z34VarU.isNull(iE5) ? null : z34VarU.D(iE5));
                        playlist.setOwner(z34VarU.isNull(iE6) ? null : z34VarU.D(iE6));
                        Integer numValueOf = z34VarU.isNull(iE7) ? null : Integer.valueOf((int) z34VarU.getLong(iE7));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        playlist.setUniversal(boolValueOf);
                        playlist.setSongCount((int) z34VarU.getLong(iE8));
                        playlist.setCreated(i80.B(z34VarU.isNull(iE9) ? null : Long.valueOf(z34VarU.getLong(iE9))));
                        playlist.setChanged(i80.B(z34VarU.isNull(iE10) ? null : Long.valueOf(z34VarU.getLong(iE10))));
                        playlist.setLastPlayed(z34VarU.getLong(iE11));
                        playlist.setAllowedUsers(((si1) ml3Var.d).E(z34VarU.isNull(iE12) ? null : z34VarU.D(iE12)));
                        arrayList.add(playlist);
                        iE = iE;
                        iE2 = iE2;
                        break;
                    }
                    z34VarU.close();
                    return arrayList;
                } catch (Throwable th) {
                    z34VarU.close();
                    throw th;
                }
            default:
                Object obj3 = ml3Var.c;
                z34 z34VarU2 = ((x34) obj).U("SELECT p.*, (pp.playlistId IS NOT NULL) AS isPinned FROM playlist p LEFT JOIN pinned_playlist pp ON p.id = pp.playlistId ORDER BY CASE WHEN ? = 'ORDER_BY_RANDOM' THEN RANDOM() END ASC, CASE WHEN ? = 'ORDER_BY_PINNED' THEN pp.playlistId IS NOT NULL END DESC, CASE WHEN ? = 'ORDER_BY_NAME' THEN p.name END ASC, CASE WHEN ? = 'ORDER_BY_DATE' THEN p.created END DESC, CASE WHEN ? = 'ORDER_BY_SONGS' THEN p.songCount END DESC, CASE WHEN ? = 'ORDER_BY_LAST_PLAYED' THEN p.lastPlayed END DESC, CASE WHEN ? = 'ORDER_BY_LAST_UPDATED' THEN p.changed END DESC, CASE WHEN ? = 'ORDER_BY_BOTH' THEN MAX(p.lastPlayed, IFNULL(p.changed, 0)) END DESC");
                try {
                    if (str == null) {
                        z34VarU2.e(1);
                    } else {
                        z34VarU2.r(1, str);
                    }
                    if (str == null) {
                        z34VarU2.e(2);
                    } else {
                        z34VarU2.r(2, str);
                    }
                    if (str == null) {
                        z34VarU2.e(3);
                    } else {
                        z34VarU2.r(3, str);
                    }
                    if (str == null) {
                        z34VarU2.e(4);
                    } else {
                        z34VarU2.r(4, str);
                    }
                    if (str == null) {
                        z34VarU2.e(5);
                    } else {
                        z34VarU2.r(5, str);
                    }
                    if (str == null) {
                        z34VarU2.e(6);
                    } else {
                        z34VarU2.r(6, str);
                    }
                    if (str == null) {
                        z34VarU2.e(7);
                    } else {
                        z34VarU2.r(7, str);
                    }
                    if (str == null) {
                        z34VarU2.e(8);
                    } else {
                        z34VarU2.r(8, str);
                    }
                    int iE13 = rr2.E(z34VarU2, "id");
                    int iE14 = rr2.E(z34VarU2, "name");
                    int iE15 = rr2.E(z34VarU2, "duration");
                    int iE16 = rr2.E(z34VarU2, "coverArt");
                    int iE17 = rr2.E(z34VarU2, "comment");
                    int iE18 = rr2.E(z34VarU2, "owner");
                    int iE19 = rr2.E(z34VarU2, "isUniversal");
                    int iE20 = rr2.E(z34VarU2, "songCount");
                    int iE21 = rr2.E(z34VarU2, "created");
                    int iE22 = rr2.E(z34VarU2, "changed");
                    int iE23 = rr2.E(z34VarU2, "lastPlayed");
                    int iE24 = rr2.E(z34VarU2, "allowedUsers");
                    ArrayList arrayList2 = new ArrayList();
                    while (z34VarU2.O()) {
                        Playlist playlist2 = new Playlist(z34VarU2.isNull(iE13) ? null : z34VarU2.D(iE13), z34VarU2.isNull(iE14) ? null : z34VarU2.D(iE14), z34VarU2.getLong(iE15), z34VarU2.isNull(iE16) ? null : z34VarU2.D(iE16));
                        playlist2.setComment(z34VarU2.isNull(iE17) ? null : z34VarU2.D(iE17));
                        playlist2.setOwner(z34VarU2.isNull(iE18) ? null : z34VarU2.D(iE18));
                        Integer numValueOf2 = z34VarU2.isNull(iE19) ? null : Integer.valueOf((int) z34VarU2.getLong(iE19));
                        if (numValueOf2 == null) {
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        playlist2.setUniversal(boolValueOf2);
                        playlist2.setSongCount((int) z34VarU2.getLong(iE20));
                        playlist2.setCreated(i80.B(z34VarU2.isNull(iE21) ? null : Long.valueOf(z34VarU2.getLong(iE21))));
                        playlist2.setChanged(i80.B(z34VarU2.isNull(iE22) ? null : Long.valueOf(z34VarU2.getLong(iE22))));
                        playlist2.setLastPlayed(z34VarU2.getLong(iE23));
                        playlist2.setAllowedUsers(((si1) ml3Var.d).E(z34VarU2.isNull(iE24) ? null : z34VarU2.D(iE24)));
                        arrayList2.add(playlist2);
                        iE17 = iE17;
                        iE18 = iE18;
                        break;
                    }
                    z34VarU2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    z34VarU2.close();
                    throw th2;
                }
        }
    }
}
