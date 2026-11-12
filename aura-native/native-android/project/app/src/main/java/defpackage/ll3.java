package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ll3 extends au0 {
    public final /* synthetic */ int G;
    public final /* synthetic */ ml3 H;

    public /* synthetic */ ll3(ml3 ml3Var, int i) {
        this.G = i;
        this.H = ml3Var;
    }

    @Override // defpackage.au0
    public final void c(z34 z34Var, Object obj) {
        int i = this.G;
        ml3 ml3Var = this.H;
        switch (i) {
            case 0:
                Playlist playlist = (Playlist) obj;
                if (playlist.getId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, playlist.getId());
                }
                if (playlist.getName() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, playlist.getName());
                }
                z34Var.c(3, playlist.getDuration());
                if (playlist.getCoverArtId() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, playlist.getCoverArtId());
                }
                if (playlist.getComment() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, playlist.getComment());
                }
                if (playlist.getOwner() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.r(6, playlist.getOwner());
                }
                Integer numValueOf = playlist.isUniversal() == null ? null : Integer.valueOf(playlist.isUniversal().booleanValue() ? 1 : 0);
                if (numValueOf == null) {
                    z34Var.e(7);
                } else {
                    z34Var.c(7, numValueOf.intValue());
                }
                z34Var.c(8, playlist.getSongCount());
                Long lJ = i80.j(playlist.getCreated());
                if (lJ == null) {
                    z34Var.e(9);
                } else {
                    z34Var.c(9, lJ.longValue());
                }
                Long lJ2 = i80.j(playlist.getChanged());
                if (lJ2 == null) {
                    z34Var.e(10);
                } else {
                    z34Var.c(10, lJ2.longValue());
                }
                z34Var.c(11, playlist.getLastPlayed());
                String strJ = ((nk1) ((si1) ml3Var.d).o).j(playlist.getAllowedUsers());
                if (strJ != null) {
                    z34Var.r(12, strJ);
                } else {
                    z34Var.e(12);
                }
                break;
            default:
                Playlist playlist2 = (Playlist) obj;
                if (playlist2.getId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, playlist2.getId());
                }
                if (playlist2.getName() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, playlist2.getName());
                }
                z34Var.c(3, playlist2.getDuration());
                if (playlist2.getCoverArtId() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, playlist2.getCoverArtId());
                }
                if (playlist2.getComment() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, playlist2.getComment());
                }
                if (playlist2.getOwner() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.r(6, playlist2.getOwner());
                }
                Integer numValueOf2 = playlist2.isUniversal() == null ? null : Integer.valueOf(playlist2.isUniversal().booleanValue() ? 1 : 0);
                if (numValueOf2 == null) {
                    z34Var.e(7);
                } else {
                    z34Var.c(7, numValueOf2.intValue());
                }
                z34Var.c(8, playlist2.getSongCount());
                Long lJ3 = i80.j(playlist2.getCreated());
                if (lJ3 == null) {
                    z34Var.e(9);
                } else {
                    z34Var.c(9, lJ3.longValue());
                }
                Long lJ4 = i80.j(playlist2.getChanged());
                if (lJ4 == null) {
                    z34Var.e(10);
                } else {
                    z34Var.c(10, lJ4.longValue());
                }
                z34Var.c(11, playlist2.getLastPlayed());
                String strJ2 = ((nk1) ((si1) ml3Var.d).o).j(playlist2.getAllowedUsers());
                if (strJ2 != null) {
                    z34Var.r(12, strJ2);
                } else {
                    z34Var.e(12);
                }
                break;
        }
    }

    @Override // defpackage.au0
    public final String i() {
        switch (this.G) {
            case 0:
                return "INSERT OR REPLACE INTO `playlist` (`id`,`name`,`duration`,`coverArt`,`comment`,`owner`,`isUniversal`,`songCount`,`created`,`changed`,`lastPlayed`,`allowedUsers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `playlist` (`id`,`name`,`duration`,`coverArt`,`comment`,`owner`,`isUniversal`,`songCount`,`created`,`changed`,`lastPlayed`,`allowedUsers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
