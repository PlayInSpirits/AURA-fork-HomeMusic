.class public Llr2;
.super Lkr2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final b()Lms2;
    .locals 1

    .line 1
    iget-object p0, p0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 2
    .line 3
    invoke-static {p0}, Lsr0;->i(Landroid/media/session/MediaSession;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lms2;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lms2;-><init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final c(Lms2;)V
    .locals 0

    .line 1
    return-void
.end method
