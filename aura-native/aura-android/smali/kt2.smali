.class public final Lkt2;
.super Landroid/os/Binder;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lpu1;


# static fields
.field public static final synthetic k:I


# instance fields
.field public final e:Ljava/lang/ref/WeakReference;

.field public final f:Lna4;

.field public final g:Ljava/util/Set;

.field public h:Lfy3;

.field public i:I

.field public j:Ljt2;


# direct methods
.method public constructor <init>(Ltn2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.media3.session.IMediaSession"

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    new-instance v0, Lna4;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lna4;-><init>(Ltn2;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lkt2;->f:Lna4;

    .line 22
    .line 23
    new-instance p1, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lkt2;->g:Ljava/util/Set;

    .line 33
    .line 34
    sget-object p1, Lfy3;->v:Lfy3;

    .line 35
    .line 36
    iput-object p1, p0, Lkt2;->h:Lfy3;

    .line 37
    .line 38
    return-void
.end method

.method public static K0(Ltn2;Lfr2;ILit2;Lwc0;)Lic2;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ltn2;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lmw1;->o:Lmw1;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lit2;->h(Ltn2;Lfr2;I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, Lic2;

    .line 16
    .line 17
    new-instance v2, Llb4;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lt6;

    .line 23
    .line 24
    const/16 v5, 0x18

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    move-object v3, p4

    .line 28
    invoke-direct/range {v0 .. v5}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lgq0;->n:Lgq0;

    .line 32
    .line 33
    invoke-interface {v4, v0, p0}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 34
    .line 35
    .line 36
    return-object v2
.end method

.method public static P0(Ltn2;Lfr2;ILab4;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p1, Lfr2;->d:Ler2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p2, p3}, Ler2;->v(ILab4;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ltn2;->c:Lwr2;

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    invoke-virtual {p0, p2, p2}, Lwr2;->a(ZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception p0

    .line 17
    new-instance p2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string p3, "Failed to send result to controller "

    .line 20
    .line 21
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string p2, "MediaSessionStub"

    .line 32
    .line 33
    invoke-static {p2, p1, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static Q0(Lwc0;)Lss2;
    .locals 2

    .line 1
    new-instance v0, Lss2;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1, p0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lss2;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {p0, v1, v0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public final A(Lju1;ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lcw4;->b(Landroid/os/Bundle;)Lcw4;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, Lef0;

    .line 11
    .line 12
    const/16 v1, 0x17

    .line 13
    .line 14
    invoke-direct {v0, v1, p0, p3}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    const/16 v0, 0x1d

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p0

    .line 28
    const-string p1, "MediaSessionStub"

    .line 29
    .line 30
    const-string p2, "Ignoring malformed Bundle for TrackSelectionParameters"

    .line 31
    .line 32
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public final A0(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lzr2;

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x7

    .line 27
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public final B(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lzr2;

    .line 17
    .line 18
    const/16 v1, 0x9

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/16 v1, 0xc

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public final B0(Lju1;IZ)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt31;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1, p3}, Lt31;-><init>(IZ)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    const/16 v0, 0x1a

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final C0(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lzr2;

    .line 17
    .line 18
    const/16 v1, 0xe

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
.end method

.method public final D(Lju1;IILandroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_1

    .line 4
    .line 5
    if-gez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p4}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 9
    .line 10
    .line 11
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    new-instance v0, Lvs2;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1, p4}, Lvs2;-><init>(ILgn2;)V

    .line 16
    .line 17
    .line 18
    new-instance p4, Lus2;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {p4, p0, p3, v1}, Lus2;-><init>(Lkt2;II)V

    .line 22
    .line 23
    .line 24
    new-instance p3, Lbt2;

    .line 25
    .line 26
    invoke-direct {p3, v0, p4}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p4, Lat2;

    .line 30
    .line 31
    invoke-direct {p4, p3, v1}, Lat2;-><init>(Lit2;I)V

    .line 32
    .line 33
    .line 34
    const/16 p3, 0x14

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2, p3, p4}, Lkt2;->N0(Lju1;IILit2;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p0

    .line 41
    const-string p1, "MediaSessionStub"

    .line 42
    .line 43
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 44
    .line 45
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final D0(Lju1;II)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x2

    .line 5
    if-eq p3, v0, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p3, v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    new-instance v0, Lij0;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-direct {v0, p3, v1}, Lij0;-><init>(II)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    const/16 v0, 0xf

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final E0(Lju1;IIII)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-ltz p3, :cond_1

    .line 4
    .line 5
    if-lt p4, p3, :cond_1

    .line 6
    .line 7
    if-gez p5, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lws2;

    .line 11
    .line 12
    invoke-direct {v0, p3, p4, p5}, Lws2;-><init>(III)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/16 p4, 0x14

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public final F(Lju1;II)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lij0;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, p3, v1}, Lij0;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    const/16 v0, 0x22

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final F0(Lju1;III)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-ltz p3, :cond_1

    .line 4
    .line 5
    if-gez p4, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lv31;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p3, p4, v1}, Lv31;-><init>(III)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    const/16 p4, 0x14

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public final G(Lju1;ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, Lvs2;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, v1, p3}, Lvs2;-><init>(ILgn2;)V

    .line 14
    .line 15
    .line 16
    new-instance p3, Lzr2;

    .line 17
    .line 18
    const/16 v1, 0xd

    .line 19
    .line 20
    invoke-direct {p3, v1}, Lzr2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lbt2;

    .line 24
    .line 25
    invoke-direct {v1, v0, p3}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance p3, Lat2;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p3, v1, v0}, Lat2;-><init>(Lit2;I)V

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x14

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p0

    .line 41
    const-string p1, "MediaSessionStub"

    .line 42
    .line 43
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 44
    .line 45
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final G0(Lju1;IILandroid/os/Bundle;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_1

    .line 4
    .line 5
    if-gez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p4}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 9
    .line 10
    .line 11
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    new-instance v0, Lvs2;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p4}, Lvs2;-><init>(ILgn2;)V

    .line 16
    .line 17
    .line 18
    new-instance p4, Lus2;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {p4, p0, p3, v2}, Lus2;-><init>(Lkt2;II)V

    .line 22
    .line 23
    .line 24
    new-instance p3, Lbt2;

    .line 25
    .line 26
    invoke-direct {p3, v0, p4}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p4, Lat2;

    .line 30
    .line 31
    invoke-direct {p4, p3, v1}, Lat2;-><init>(Lit2;I)V

    .line 32
    .line 33
    .line 34
    const/16 p3, 0x14

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2, p3, p4}, Lkt2;->N0(Lju1;IILit2;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p0

    .line 41
    const-string p1, "MediaSessionStub"

    .line 42
    .line 43
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 44
    .line 45
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final H(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lzr2;

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/16 v1, 0xb

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
.end method

.method public final H0(Lju1;IZ)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt31;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1, p3}, Lt31;-><init>(IZ)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    const/16 v0, 0xe

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final J(Lju1;ILiw;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lkt2;->L(Lju1;ILandroid/os/IBinder;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final K(Lju1;II)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lij0;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, p3, v1}, Lij0;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    const/16 v0, 0x22

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final L(Lju1;ILandroid/os/IBinder;Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Liw;->a(Landroid/os/IBinder;)Lyw1;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-static {}, Lyw1;->j()Luw1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Lpw1;->c(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 41
    .line 42
    .line 43
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    new-instance v0, Lts2;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p3, p4, v1}, Lts2;-><init>(Ljava/lang/Object;ZI)V

    .line 48
    .line 49
    .line 50
    new-instance p3, Lzr2;

    .line 51
    .line 52
    const/16 p4, 0x14

    .line 53
    .line 54
    invoke-direct {p3, p4}, Lzr2;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Lef0;

    .line 58
    .line 59
    const/16 v2, 0x1d

    .line 60
    .line 61
    invoke-direct {v1, v2, v0, p3}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p3, Lat2;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-direct {p3, v1, v0}, Lat2;-><init>(Lit2;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catch_0
    move-exception p0

    .line 75
    const-string p1, "MediaSessionStub"

    .line 76
    .line 77
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 78
    .line 79
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_1
    return-void
.end method

.method public final L0(Lfr2;Lal3;I)I
    .locals 2

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lal3;->S0(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lkt2;->f:Lna4;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lna4;->H(Lfr2;I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lna4;->H(Lfr2;I)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2}, Lal3;->o0()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    add-int/2addr p0, p3

    .line 30
    return p0

    .line 31
    :cond_0
    return p3
.end method

.method public final M(Lju1;III)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-ltz p3, :cond_1

    .line 4
    .line 5
    if-ge p4, p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lrs2;

    .line 9
    .line 10
    invoke-direct {v0, p0, p3, p4}, Lrs2;-><init>(Lkt2;II)V

    .line 11
    .line 12
    .line 13
    new-instance p3, Lss2;

    .line 14
    .line 15
    const/4 p4, 0x2

    .line 16
    invoke-direct {p3, p4, v0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/16 p4, 0x14

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public final M0(Lfr2;I)V
    .locals 2

    .line 1
    new-instance v0, Lef0;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final N(Lju1;II)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lus2;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    invoke-direct {v0, p0, p3, v1}, Lus2;-><init>(Lkt2;II)V

    .line 10
    .line 11
    .line 12
    new-instance p3, Lss2;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {p3, v1, v0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0x14

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public final N0(Lju1;IILit2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3, p4}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final O0(Lfr2;IILit2;)V
    .locals 10

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    :try_start_0
    iget-object v0, p0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v7, v0

    .line 12
    check-cast v7, Ltn2;

    .line 13
    .line 14
    if-eqz v7, :cond_1

    .line 15
    .line 16
    invoke-virtual {v7}, Ltn2;->l()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, v7, Ltn2;->l:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v3, Lzs2;

    .line 26
    .line 27
    move-object v4, p0

    .line 28
    move-object v5, p1

    .line 29
    move v8, p2

    .line 30
    move v6, p3

    .line 31
    move-object v9, p4

    .line 32
    invoke-direct/range {v3 .. v9}, Lzs2;-><init>(Lkt2;Lfr2;ILtn2;ILit2;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v3}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p0, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_1
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 50
    .line 51
    .line 52
    throw p0
.end method

.method public final P(Lju1;IIILandroid/os/IBinder;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-eqz p5, :cond_2

    .line 4
    .line 5
    if-ltz p3, :cond_2

    .line 6
    .line 7
    if-ge p4, p3, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    :try_start_0
    invoke-static {p5}, Liw;->a(Landroid/os/IBinder;)Lyw1;

    .line 11
    .line 12
    .line 13
    move-result-object p5

    .line 14
    invoke-static {}, Lyw1;->j()Luw1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-interface {p5}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v1, v2, :cond_1

    .line 24
    .line 25
    invoke-interface {p5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Landroid/os/Bundle;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Lpw1;->c(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 45
    .line 46
    .line 47
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    new-instance v0, Lvr2;

    .line 49
    .line 50
    invoke-direct {v0, p5}, Lvr2;-><init>(Lyw1;)V

    .line 51
    .line 52
    .line 53
    new-instance p5, Lrs2;

    .line 54
    .line 55
    invoke-direct {p5, p0, p3, p4}, Lrs2;-><init>(Lkt2;II)V

    .line 56
    .line 57
    .line 58
    new-instance p3, Lbt2;

    .line 59
    .line 60
    invoke-direct {p3, v0, p5}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance p4, Lat2;

    .line 64
    .line 65
    const/4 p5, 0x1

    .line 66
    invoke-direct {p4, p3, p5}, Lat2;-><init>(Lit2;I)V

    .line 67
    .line 68
    .line 69
    const/16 p3, 0x14

    .line 70
    .line 71
    invoke-virtual {p0, p1, p2, p3, p4}, Lkt2;->N0(Lju1;IILit2;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catch_0
    move-exception p0

    .line 76
    const-string p1, "MediaSessionStub"

    .line 77
    .line 78
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 79
    .line 80
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    :goto_1
    return-void
.end method

.method public final Q(Lju1;III)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lrs2;

    .line 5
    .line 6
    invoke-direct {v0, p0, p3, p4}, Lrs2;-><init>(Lkt2;II)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/16 p4, 0x1b

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final R(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lzr2;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/16 v1, 0x9

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public final S(Lju1;IIJ)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Llj0;

    .line 7
    .line 8
    invoke-direct {v0, p4, p5, p0, p3}, Llj0;-><init>(JLjava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    new-instance p3, Lss2;

    .line 12
    .line 13
    const/4 p4, 0x2

    .line 14
    invoke-direct {p3, p4, v0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/16 p4, 0xa

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public final T(Lju1;ILandroid/os/IBinder;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Liw;->a(Landroid/os/IBinder;)Lyw1;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-static {}, Lyw1;->j()Luw1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Lpw1;->c(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 41
    .line 42
    .line 43
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    new-instance v0, Lc41;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p3, v1}, Lc41;-><init>(Ljava/util/List;I)V

    .line 48
    .line 49
    .line 50
    new-instance p3, Lzr2;

    .line 51
    .line 52
    const/16 v1, 0xc

    .line 53
    .line 54
    invoke-direct {p3, v1}, Lzr2;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Lbt2;

    .line 58
    .line 59
    invoke-direct {v1, v0, p3}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p3, Lat2;

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    invoke-direct {p3, v1, v0}, Lat2;-><init>(Lit2;I)V

    .line 66
    .line 67
    .line 68
    const/16 v0, 0x14

    .line 69
    .line 70
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catch_0
    move-exception p0

    .line 75
    const-string p1, "MediaSessionStub"

    .line 76
    .line 77
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 78
    .line 79
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_1
    return-void
.end method

.method public final U(Lju1;ILva4;ILit2;)V
    .locals 11

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    :try_start_0
    iget-object v0, p0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v7, v0

    .line 12
    check-cast v7, Ltn2;

    .line 13
    .line 14
    if-eqz v7, :cond_2

    .line 15
    .line 16
    invoke-virtual {v7}, Ltn2;->l()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 30
    .line 31
    .line 32
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    :try_start_1
    iget-object p1, v7, Ltn2;->l:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance v3, Lys2;

    .line 42
    .line 43
    move-object v4, p0

    .line 44
    move v8, p2

    .line 45
    move-object v6, p3

    .line 46
    move v9, p4

    .line 47
    move-object/from16 v10, p5

    .line 48
    .line 49
    invoke-direct/range {v3 .. v10}, Lys2;-><init>(Lkt2;Lfr2;Lva4;Ltn2;IILit2;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v3}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p0, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :goto_1
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 67
    .line 68
    .line 69
    throw p0
.end method

.method public final W(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final X(Llk3;)Llk3;
    .locals 9

    .line 1
    iget-object v0, p1, Llk3;->F:Ljw4;

    .line 2
    .line 3
    iget-object v0, v0, Ljw4;->a:Lyw1;

    .line 4
    .line 5
    invoke-static {}, Lyw1;->j()Luw1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lnw1;

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    invoke-direct {v2, v3}, Lue1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Liw4;

    .line 27
    .line 28
    iget-object v5, v4, Liw4;->b:Lsv4;

    .line 29
    .line 30
    iget-object v6, p0, Lkt2;->h:Lfy3;

    .line 31
    .line 32
    invoke-virtual {v6, v5}, Lfy3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Ljava/lang/String;

    .line 37
    .line 38
    if-nez v6, :cond_0

    .line 39
    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget v7, p0, Lkt2;->i:I

    .line 46
    .line 47
    add-int/lit8 v8, v7, 0x1

    .line 48
    .line 49
    iput v8, p0, Lkt2;->i:I

    .line 50
    .line 51
    sget-object v8, Lf35;->a:Ljava/lang/String;

    .line 52
    .line 53
    const/16 v8, 0x24

    .line 54
    .line 55
    invoke-static {v7, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v7, "-"

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v7, v5, Lsv4;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    :cond_0
    invoke-virtual {v2, v5, v6}, Lnw1;->F(Lsv4;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Liw4;

    .line 80
    .line 81
    iget-object v7, v4, Liw4;->b:Lsv4;

    .line 82
    .line 83
    new-instance v8, Lsv4;

    .line 84
    .line 85
    iget-object v7, v7, Lsv4;->d:[Ltb1;

    .line 86
    .line 87
    invoke-direct {v8, v6, v7}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v6, v4, Liw4;->c:Z

    .line 91
    .line 92
    iget-object v7, v4, Liw4;->d:[I

    .line 93
    .line 94
    iget-object v4, v4, Liw4;->e:[Z

    .line 95
    .line 96
    invoke-direct {v5, v8, v6, v7, v4}, Liw4;-><init>(Lsv4;Z[I[Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v5}, Lpw1;->c(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    iget v0, v2, Lue1;->o:I

    .line 106
    .line 107
    if-nez v0, :cond_2

    .line 108
    .line 109
    sget-object v0, Lfy3;->v:Lfy3;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    new-instance v0, Lfy3;

    .line 113
    .line 114
    iget-object v3, v2, Lue1;->p:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v3, [Ljava/lang/Object;

    .line 117
    .line 118
    iget v2, v2, Lue1;->o:I

    .line 119
    .line 120
    invoke-direct {v0, v2, v3}, Lfy3;-><init>(I[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :goto_1
    iput-object v0, p0, Lkt2;->h:Lfy3;

    .line 124
    .line 125
    new-instance v0, Ljw4;

    .line 126
    .line 127
    invoke-virtual {v1}, Luw1;->f()Lgy3;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v0, v1}, Ljw4;-><init>(Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0}, Llk3;->b(Ljw4;)Llk3;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iget-object v0, p1, Llk3;->G:Lcw4;

    .line 139
    .line 140
    iget-object v1, v0, Lcw4;->H:Lbx1;

    .line 141
    .line 142
    invoke-virtual {v1}, Lbx1;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_3

    .line 147
    .line 148
    return-object p1

    .line 149
    :cond_3
    invoke-virtual {v0}, Lcw4;->a()Lbw4;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Lbw4;->c()Lbw4;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-object v0, v0, Lcw4;->H:Lbx1;

    .line 158
    .line 159
    invoke-virtual {v0}, Lbx1;->f()Lrw1;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lrw1;->h()Lo15;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_5

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Lyv4;

    .line 178
    .line 179
    iget-object v3, v2, Lyv4;->a:Lsv4;

    .line 180
    .line 181
    iget-object v4, p0, Lkt2;->h:Lfy3;

    .line 182
    .line 183
    invoke-virtual {v4, v3}, Lfy3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    check-cast v4, Ljava/lang/String;

    .line 188
    .line 189
    if-eqz v4, :cond_4

    .line 190
    .line 191
    new-instance v5, Lyv4;

    .line 192
    .line 193
    new-instance v6, Lsv4;

    .line 194
    .line 195
    iget-object v3, v3, Lsv4;->d:[Ltb1;

    .line 196
    .line 197
    invoke-direct {v6, v4, v3}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 198
    .line 199
    .line 200
    iget-object v2, v2, Lyv4;->b:Lyw1;

    .line 201
    .line 202
    invoke-direct {v5, v6, v2}, Lyv4;-><init>(Lsv4;Ljava/util/List;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v5}, Lbw4;->a(Lyv4;)V

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_4
    invoke-virtual {v1, v2}, Lbw4;->a(Lyv4;)V

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_5
    invoke-virtual {v1}, Lbw4;->b()Lcw4;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p1, p0}, Llk3;->o(Lcw4;)Llk3;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    return-object p0
.end method

.method public final Z(Lju1;IILandroid/os/IBinder;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-eqz p4, :cond_2

    .line 4
    .line 5
    if-gez p3, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p4}, Liw;->a(Landroid/os/IBinder;)Lyw1;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    invoke-static {}, Lyw1;->j()Luw1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v1, v2, :cond_1

    .line 22
    .line 23
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Lpw1;->c(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 43
    .line 44
    .line 45
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    new-instance v0, Lc41;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-direct {v0, p4, v1}, Lc41;-><init>(Ljava/util/List;I)V

    .line 50
    .line 51
    .line 52
    new-instance p4, Lus2;

    .line 53
    .line 54
    const/4 v2, 0x3

    .line 55
    invoke-direct {p4, p0, p3, v2}, Lus2;-><init>(Lkt2;II)V

    .line 56
    .line 57
    .line 58
    new-instance p3, Lbt2;

    .line 59
    .line 60
    invoke-direct {p3, v0, p4}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance p4, Lat2;

    .line 64
    .line 65
    invoke-direct {p4, p3, v1}, Lat2;-><init>(Lit2;I)V

    .line 66
    .line 67
    .line 68
    const/16 p3, 0x14

    .line 69
    .line 70
    invoke-virtual {p0, p1, p2, p3, p4}, Lkt2;->N0(Lju1;IILit2;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catch_0
    move-exception p0

    .line 75
    const-string p1, "MediaSessionStub"

    .line 76
    .line 77
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 78
    .line 79
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_1
    return-void
.end method

.method public final a(Lju1;ILandroid/os/Bundle;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lab4;->a(Landroid/os/Bundle;)Lab4;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    :try_start_1
    iget-object p0, p0, Lkt2;->f:Lna4;

    .line 15
    .line 16
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v2, p0, Lna4;->n:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    :try_start_2
    invoke-virtual {p0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Lna4;->p:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Loi;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lba0;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object p0, v3

    .line 44
    :goto_0
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    :try_start_3
    iget-object v3, p0, Lba0;->b:Lyk;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 48
    .line 49
    :cond_2
    if-nez v3, :cond_3

    .line 50
    .line 51
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    :try_start_4
    invoke-virtual {v3, p2, p3}, Lyk;->y(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    goto :goto_2

    .line 64
    :goto_1
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 65
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 66
    :goto_2
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :catch_0
    move-exception p0

    .line 71
    const-string p1, "MediaSessionStub"

    .line 72
    .line 73
    const-string p2, "Ignoring malformed Bundle for SessionResult"

    .line 74
    .line 75
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_3
    return-void
.end method

.method public final a0(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x6

    .line 15
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final b(Lju1;ILandroid/os/Bundle;Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lil;->a(Landroid/os/Bundle;)Lil;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, Lts2;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p3, p4, v1}, Lts2;-><init>(Ljava/lang/Object;ZI)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    const/16 p4, 0x23

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p0

    .line 27
    const-string p1, "MediaSessionStub"

    .line 28
    .line 29
    const-string p2, "Ignoring malformed Bundle for AudioAttributes"

    .line 30
    .line 31
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method public final d(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lzr2;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public final d0(Lju1;IJ)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lxm;

    .line 5
    .line 6
    invoke-direct {v0, p3, p4}, Lxm;-><init>(J)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/4 p4, 0x5

    .line 14
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final e0(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/16 v1, 0x11

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final f0(Lju1;II)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lus2;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p3, v1}, Lus2;-><init>(Lkt2;II)V

    .line 10
    .line 11
    .line 12
    new-instance p3, Lss2;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {p3, v1, v0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0xa

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public final g0(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/16 v1, 0xb

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x1a

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final h0(Lju1;IZ)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt31;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1, p3}, Lt31;-><init>(IZ)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final i0(Lju1;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lkt2;->o0(Lju1;ILandroid/os/Bundle;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final j0(Lju1;I)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    :try_start_0
    iget-object p2, p0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Ltn2;

    .line 15
    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2}, Ltn2;->l()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p2, p2, Ltn2;->l:Landroid/os/Handler;

    .line 26
    .line 27
    new-instance v2, Lur2;

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    invoke-direct {v2, v3, p0, p1}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2, v2}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_1
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 47
    .line 48
    .line 49
    throw p0
.end method

.method public final k(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/16 v1, 0x18

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final l(Lju1;ILandroid/os/Bundle;J)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, Lll2;

    .line 11
    .line 12
    invoke-direct {v0, p4, p5, p3}, Lll2;-><init>(JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p3, Lzr2;

    .line 16
    .line 17
    const/16 p4, 0x14

    .line 18
    .line 19
    invoke-direct {p3, p4}, Lzr2;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance p4, Lef0;

    .line 23
    .line 24
    const/16 p5, 0x1d

    .line 25
    .line 26
    invoke-direct {p4, p5, v0, p3}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p3, Lat2;

    .line 30
    .line 31
    const/4 p5, 0x1

    .line 32
    invoke-direct {p3, p4, p5}, Lat2;-><init>(Lit2;I)V

    .line 33
    .line 34
    .line 35
    const/16 p4, 0x1f

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p0

    .line 42
    const-string p1, "MediaSessionStub"

    .line 43
    .line 44
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 45
    .line 46
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void
.end method

.method public final m(Lju1;Lfr2;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v4, v0

    .line 10
    check-cast v4, Ltn2;

    .line 11
    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v4}, Ltn2;->l()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :cond_0
    move-object v5, p1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, Lkt2;->g:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v0, v4, Ltn2;->l:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance v1, Lt6;

    .line 30
    .line 31
    const/16 v6, 0x17

    .line 32
    .line 33
    move-object v2, p0

    .line 34
    move-object v5, p1

    .line 35
    move-object v3, p2

    .line 36
    invoke-direct/range {v1 .. v6}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_0
    invoke-static {v5}, Lau0;->k(Lju1;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    move-object v5, p1

    .line 48
    invoke-static {v5}, Lau0;->k(Lju1;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final m0(Lju1;ILandroid/view/Surface;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lef0;

    .line 5
    .line 6
    const/16 v1, 0x1b

    .line 7
    .line 8
    invoke-direct {v0, v1, p0, p3}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p0, p1, p2, v1, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final n0(Lju1;ILandroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "MediaSessionStub"

    .line 6
    .line 7
    iget-object v3, v0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Ltn2;

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eqz p3, :cond_3

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :try_start_0
    iget-object v3, v3, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 23
    .line 24
    invoke-static/range {p3 .. p3}, Lja0;->a(Landroid/os/Bundle;)Lja0;

    .line 25
    .line 26
    .line 27
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iget-object v7, v4, Lja0;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v5, v3, v7}, Lau0;->f(ILandroid/content/Context;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    const/4 v9, 0x1

    .line 43
    if-ne v8, v9, :cond_1

    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "Ignoring connection from invalid package name "

    .line 48
    .line 49
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v3, " (uid="

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v3, ")"

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v2, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, Lau0;->k(Lju1;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 80
    .line 81
    .line 82
    move-result-wide v8

    .line 83
    if-eqz v6, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    iget v6, v4, Lja0;->d:I

    .line 87
    .line 88
    :goto_0
    :try_start_1
    new-instance v11, Lms2;

    .line 89
    .line 90
    invoke-direct {v11, v7, v6, v5}, Lms2;-><init>(Ljava/lang/String;II)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Lhg3;->E(Landroid/content/Context;)Lhg3;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2, v11}, Lhg3;->G(Lms2;)Z

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    new-instance v10, Lfr2;

    .line 102
    .line 103
    iget v12, v4, Lja0;->a:I

    .line 104
    .line 105
    iget v13, v4, Lja0;->b:I

    .line 106
    .line 107
    new-instance v15, Lft2;

    .line 108
    .line 109
    invoke-direct {v15, v1, v13}, Lft2;-><init>(Lju1;I)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v4, Lja0;->e:Landroid/os/Bundle;

    .line 113
    .line 114
    move-object/from16 v16, v2

    .line 115
    .line 116
    invoke-direct/range {v10 .. v16}, Lfr2;-><init>(Lms2;IIZLer2;Landroid/os/Bundle;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1, v10}, Lkt2;->m(Lju1;Lfr2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    .line 122
    invoke-static {v8, v9}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    invoke-static {v8, v9}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :catch_0
    move-exception v0

    .line 132
    const-string v1, "Ignoring malformed Bundle for ConnectionRequest"

    .line 133
    .line 134
    invoke-static {v2, v1, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    :goto_1
    invoke-static {v1}, Lau0;->k(Lju1;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final o0(Lju1;ILandroid/os/Bundle;Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 11
    .line 12
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    new-instance v0, Lts2;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p3, p4, v1}, Lts2;-><init>(Ljava/lang/Object;ZI)V

    .line 26
    .line 27
    .line 28
    new-instance p3, Lzr2;

    .line 29
    .line 30
    const/16 p4, 0x14

    .line 31
    .line 32
    invoke-direct {p3, p4}, Lzr2;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance p4, Lef0;

    .line 36
    .line 37
    const/16 v1, 0x1d

    .line 38
    .line 39
    invoke-direct {p4, v1, v0, p3}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance p3, Lat2;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    invoke-direct {p3, p4, v0}, Lat2;-><init>(Lit2;I)V

    .line 46
    .line 47
    .line 48
    const/16 p4, 0x1f

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception p0

    .line 55
    const-string p1, "MediaSessionStub"

    .line 56
    .line 57
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 58
    .line 59
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    return-void
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 12

    .line 1
    const-string v2, "androidx.media3.session.IMediaSession"

    .line 2
    .line 3
    const/4 v7, 0x1

    .line 4
    if-lt p1, v7, :cond_0

    .line 5
    .line 6
    const v3, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v3, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v3, :cond_1

    .line 18
    .line 19
    move-object v3, p3

    .line 20
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v7

    .line 24
    :cond_1
    move-object v3, p3

    .line 25
    const-string v2, "Ignoring malformed Bundle for Rating"

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const-string v5, "MediaSessionStub"

    .line 29
    .line 30
    packed-switch p1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    const-string v2, "Ignoring malformed Bundle for LibraryParams"

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    packed-switch p1, :pswitch_data_1

    .line 37
    .line 38
    .line 39
    invoke-super/range {p0 .. p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    return v0

    .line 44
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    const-string v0, "unsubscribe(): Ignoring empty parentId"

    .line 71
    .line 72
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v7

    .line 76
    :cond_3
    new-instance v3, Lss2;

    .line 77
    .line 78
    invoke-direct {v3, v4, v1}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v5, Lat2;

    .line 82
    .line 83
    invoke-direct {v5, v3, v4}, Lat2;-><init>(Lit2;I)V

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    const v4, 0xc352

    .line 88
    .line 89
    .line 90
    move-object v1, v0

    .line 91
    move-object v0, p0

    .line 92
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 93
    .line 94
    .line 95
    return v7

    .line 96
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move-object v3, v2

    .line 105
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    sget-object v9, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 114
    .line 115
    invoke-static {p2, v9}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Landroid/os/Bundle;

    .line 120
    .line 121
    if-nez v0, :cond_4

    .line 122
    .line 123
    goto/16 :goto_7

    .line 124
    .line 125
    :cond_4
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_5

    .line 130
    .line 131
    const-string v0, "subscribe(): Ignoring empty parentId"

    .line 132
    .line 133
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto/16 :goto_7

    .line 137
    .line 138
    :cond_5
    if-nez v1, :cond_6

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_6
    :try_start_0
    invoke-static {v1}, Ljn2;->a(Landroid/os/Bundle;)Ljn2;

    .line 142
    .line 143
    .line 144
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :goto_0
    new-instance v1, Lef0;

    .line 146
    .line 147
    const/16 v3, 0x1c

    .line 148
    .line 149
    invoke-direct {v1, v3, v8, v6}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    new-instance v5, Lat2;

    .line 153
    .line 154
    invoke-direct {v5, v1, v4}, Lat2;-><init>(Lit2;I)V

    .line 155
    .line 156
    .line 157
    const/4 v3, 0x0

    .line 158
    const v4, 0xc351

    .line 159
    .line 160
    .line 161
    move-object v1, v0

    .line 162
    move-object v0, p0

    .line 163
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_7

    .line 167
    .line 168
    :catch_0
    move-exception v0

    .line 169
    invoke-static {v5, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_7

    .line 173
    .line 174
    :pswitch_2
    move-object v3, v2

    .line 175
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    sget-object v11, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 200
    .line 201
    invoke-static {p2, v11}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Landroid/os/Bundle;

    .line 206
    .line 207
    if-nez v0, :cond_7

    .line 208
    .line 209
    goto/16 :goto_7

    .line 210
    .line 211
    :cond_7
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-eqz v11, :cond_8

    .line 216
    .line 217
    const-string v0, "getSearchResult(): Ignoring empty query"

    .line 218
    .line 219
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_7

    .line 223
    .line 224
    :cond_8
    if-gez v9, :cond_9

    .line 225
    .line 226
    const-string v0, "getSearchResult(): Ignoring negative page"

    .line 227
    .line 228
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_7

    .line 232
    .line 233
    :cond_9
    if-ge v10, v7, :cond_a

    .line 234
    .line 235
    const-string v0, "getSearchResult(): Ignoring pageSize less than 1"

    .line 236
    .line 237
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_7

    .line 241
    .line 242
    :cond_a
    if-nez v1, :cond_b

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_b
    :try_start_1
    invoke-static {v1}, Ljn2;->a(Landroid/os/Bundle;)Ljn2;

    .line 246
    .line 247
    .line 248
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 249
    :goto_1
    new-instance v1, Lij0;

    .line 250
    .line 251
    invoke-direct {v1, v8, v9, v10, v6}, Lij0;-><init>(Ljava/lang/String;IILjn2;)V

    .line 252
    .line 253
    .line 254
    new-instance v5, Lat2;

    .line 255
    .line 256
    invoke-direct {v5, v1, v4}, Lat2;-><init>(Lit2;I)V

    .line 257
    .line 258
    .line 259
    const/4 v3, 0x0

    .line 260
    const v4, 0xc356

    .line 261
    .line 262
    .line 263
    move-object v1, v0

    .line 264
    move-object v0, p0

    .line 265
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_7

    .line 269
    .line 270
    :catch_1
    move-exception v0

    .line 271
    invoke-static {v5, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_7

    .line 275
    .line 276
    :pswitch_3
    move-object v3, v2

    .line 277
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    sget-object v9, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 294
    .line 295
    invoke-static {p2, v9}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    check-cast v1, Landroid/os/Bundle;

    .line 300
    .line 301
    if-nez v0, :cond_c

    .line 302
    .line 303
    goto/16 :goto_7

    .line 304
    .line 305
    :cond_c
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_d

    .line 310
    .line 311
    const-string v0, "search(): Ignoring empty query"

    .line 312
    .line 313
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_7

    .line 317
    .line 318
    :cond_d
    if-nez v1, :cond_e

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_e
    :try_start_2
    invoke-static {v1}, Ljn2;->a(Landroid/os/Bundle;)Ljn2;

    .line 322
    .line 323
    .line 324
    move-result-object v6
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 325
    :goto_2
    new-instance v1, Lzr2;

    .line 326
    .line 327
    invoke-direct {v1, v8, v6}, Lzr2;-><init>(Ljava/lang/String;Ljn2;)V

    .line 328
    .line 329
    .line 330
    new-instance v5, Lat2;

    .line 331
    .line 332
    invoke-direct {v5, v1, v4}, Lat2;-><init>(Lit2;I)V

    .line 333
    .line 334
    .line 335
    const/4 v3, 0x0

    .line 336
    const v4, 0xc355

    .line 337
    .line 338
    .line 339
    move-object v1, v0

    .line 340
    move-object v0, p0

    .line 341
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_7

    .line 345
    .line 346
    :catch_2
    move-exception v0

    .line 347
    invoke-static {v5, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_7

    .line 351
    .line 352
    :pswitch_4
    move-object v3, v2

    .line 353
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 374
    .line 375
    .line 376
    move-result v10

    .line 377
    sget-object v11, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 378
    .line 379
    invoke-static {p2, v11}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    check-cast v1, Landroid/os/Bundle;

    .line 384
    .line 385
    if-nez v0, :cond_f

    .line 386
    .line 387
    goto/16 :goto_7

    .line 388
    .line 389
    :cond_f
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    if-eqz v11, :cond_10

    .line 394
    .line 395
    const-string v0, "getChildren(): Ignoring empty parentId"

    .line 396
    .line 397
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_7

    .line 401
    .line 402
    :cond_10
    if-gez v9, :cond_11

    .line 403
    .line 404
    const-string v0, "getChildren(): Ignoring negative page"

    .line 405
    .line 406
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    goto/16 :goto_7

    .line 410
    .line 411
    :cond_11
    if-ge v10, v7, :cond_12

    .line 412
    .line 413
    const-string v0, "getChildren(): Ignoring pageSize less than 1"

    .line 414
    .line 415
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    goto/16 :goto_7

    .line 419
    .line 420
    :cond_12
    if-nez v1, :cond_13

    .line 421
    .line 422
    goto :goto_3

    .line 423
    :cond_13
    :try_start_3
    invoke-static {v1}, Ljn2;->a(Landroid/os/Bundle;)Ljn2;

    .line 424
    .line 425
    .line 426
    move-result-object v6
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3

    .line 427
    :goto_3
    new-instance v1, Ljm2;

    .line 428
    .line 429
    invoke-direct {v1, v8, v9, v10, v6}, Ljm2;-><init>(Ljava/lang/String;IILjn2;)V

    .line 430
    .line 431
    .line 432
    new-instance v5, Lat2;

    .line 433
    .line 434
    invoke-direct {v5, v1, v4}, Lat2;-><init>(Lit2;I)V

    .line 435
    .line 436
    .line 437
    const/4 v3, 0x0

    .line 438
    const v4, 0xc353

    .line 439
    .line 440
    .line 441
    move-object v1, v0

    .line 442
    move-object v0, p0

    .line 443
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 444
    .line 445
    .line 446
    goto/16 :goto_7

    .line 447
    .line 448
    :catch_3
    move-exception v0

    .line 449
    invoke-static {v5, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_7

    .line 453
    .line 454
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    if-nez v0, :cond_14

    .line 471
    .line 472
    goto/16 :goto_7

    .line 473
    .line 474
    :cond_14
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-eqz v3, :cond_15

    .line 479
    .line 480
    const-string v0, "getItem(): Ignoring empty mediaId"

    .line 481
    .line 482
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    return v7

    .line 486
    :cond_15
    new-instance v3, Lzr2;

    .line 487
    .line 488
    invoke-direct {v3, v1}, Lzr2;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    new-instance v5, Lat2;

    .line 492
    .line 493
    invoke-direct {v5, v3, v4}, Lat2;-><init>(Lit2;I)V

    .line 494
    .line 495
    .line 496
    const/4 v3, 0x0

    .line 497
    const v4, 0xc354

    .line 498
    .line 499
    .line 500
    move-object v1, v0

    .line 501
    move-object v0, p0

    .line 502
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 503
    .line 504
    .line 505
    return v7

    .line 506
    :pswitch_6
    move-object v3, v2

    .line 507
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    sget-object v8, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 520
    .line 521
    invoke-static {p2, v8}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, Landroid/os/Bundle;

    .line 526
    .line 527
    if-nez v0, :cond_16

    .line 528
    .line 529
    goto/16 :goto_7

    .line 530
    .line 531
    :cond_16
    if-nez v1, :cond_17

    .line 532
    .line 533
    goto :goto_4

    .line 534
    :cond_17
    :try_start_4
    invoke-static {v1}, Ljn2;->a(Landroid/os/Bundle;)Ljn2;

    .line 535
    .line 536
    .line 537
    move-result-object v6
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    .line 538
    :goto_4
    new-instance v1, Lss2;

    .line 539
    .line 540
    invoke-direct {v1, v7, v6}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    new-instance v5, Lat2;

    .line 544
    .line 545
    invoke-direct {v5, v1, v4}, Lat2;-><init>(Lit2;I)V

    .line 546
    .line 547
    .line 548
    const/4 v3, 0x0

    .line 549
    const v4, 0xc350

    .line 550
    .line 551
    .line 552
    move-object v1, v0

    .line 553
    move-object v0, p0

    .line 554
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 555
    .line 556
    .line 557
    goto/16 :goto_7

    .line 558
    .line 559
    :catch_4
    move-exception v0

    .line 560
    invoke-static {v5, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 561
    .line 562
    .line 563
    goto/16 :goto_7

    .line 564
    .line 565
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-static {v2}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 578
    .line 579
    .line 580
    move-result v4

    .line 581
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    invoke-virtual {p0, v2, v3, v4, v1}, Lkt2;->Q(Lju1;III)V

    .line 586
    .line 587
    .line 588
    return v7

    .line 589
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-static {v2}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    move-object v3, v2

    .line 598
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    sget-object v4, Landroid/view/Surface;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 603
    .line 604
    invoke-static {p2, v4}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v4

    .line 608
    check-cast v4, Landroid/view/Surface;

    .line 609
    .line 610
    move-object v1, v3

    .line 611
    move-object v3, v4

    .line 612
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 613
    .line 614
    .line 615
    move-result v4

    .line 616
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 617
    .line 618
    .line 619
    move-result v5

    .line 620
    move-object v0, p0

    .line 621
    invoke-virtual/range {v0 .. v5}, Lkt2;->z0(Lju1;ILandroid/view/Surface;II)V

    .line 622
    .line 623
    .line 624
    return v7

    .line 625
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 634
    .line 635
    .line 636
    move-result v2

    .line 637
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 638
    .line 639
    invoke-static {p2, v0}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v3

    .line 643
    check-cast v3, Landroid/os/Bundle;

    .line 644
    .line 645
    invoke-static {p2, v0}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    check-cast v0, Landroid/os/Bundle;

    .line 650
    .line 651
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 652
    .line 653
    .line 654
    move-result v5

    .line 655
    if-eqz v5, :cond_18

    .line 656
    .line 657
    move v5, v7

    .line 658
    :goto_5
    move-object v4, v0

    .line 659
    move-object v0, p0

    .line 660
    goto :goto_6

    .line 661
    :cond_18
    move v5, v4

    .line 662
    goto :goto_5

    .line 663
    :goto_6
    invoke-virtual/range {v0 .. v5}, Lkt2;->s(Lju1;ILandroid/os/Bundle;Landroid/os/Bundle;Z)V

    .line 664
    .line 665
    .line 666
    return v7

    .line 667
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    invoke-virtual {p0, v1, v2}, Lkt2;->p(Lju1;I)V

    .line 680
    .line 681
    .line 682
    return v7

    .line 683
    :pswitch_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    invoke-virtual {p0, v1, v2}, Lkt2;->k(Lju1;I)V

    .line 696
    .line 697
    .line 698
    return v7

    .line 699
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 712
    .line 713
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v3

    .line 717
    check-cast v3, Landroid/os/Bundle;

    .line 718
    .line 719
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 720
    .line 721
    .line 722
    move-result v5

    .line 723
    if-eqz v5, :cond_19

    .line 724
    .line 725
    move v4, v7

    .line 726
    :cond_19
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->b(Lju1;ILandroid/os/Bundle;Z)V

    .line 727
    .line 728
    .line 729
    return v7

    .line 730
    :pswitch_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 747
    .line 748
    .line 749
    move-result v4

    .line 750
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 751
    .line 752
    .line 753
    move-result-object v5

    .line 754
    move-object v0, p0

    .line 755
    invoke-virtual/range {v0 .. v5}, Lkt2;->P(Lju1;IIILandroid/os/IBinder;)V

    .line 756
    .line 757
    .line 758
    return v7

    .line 759
    :pswitch_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 776
    .line 777
    invoke-static {p2, v4}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    check-cast v4, Landroid/os/Bundle;

    .line 782
    .line 783
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->G0(Lju1;IILandroid/os/Bundle;)V

    .line 784
    .line 785
    .line 786
    return v7

    .line 787
    :pswitch_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 796
    .line 797
    .line 798
    move-result v2

    .line 799
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 800
    .line 801
    .line 802
    move-result v3

    .line 803
    if-eqz v3, :cond_1a

    .line 804
    .line 805
    move v4, v7

    .line 806
    :cond_1a
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 807
    .line 808
    .line 809
    move-result v3

    .line 810
    invoke-virtual {p0, v1, v2, v4, v3}, Lkt2;->x0(Lju1;IZI)V

    .line 811
    .line 812
    .line 813
    return v7

    .line 814
    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 827
    .line 828
    .line 829
    move-result v3

    .line 830
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->K(Lju1;II)V

    .line 831
    .line 832
    .line 833
    return v7

    .line 834
    :pswitch_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 847
    .line 848
    .line 849
    move-result v3

    .line 850
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->F(Lju1;II)V

    .line 851
    .line 852
    .line 853
    return v7

    .line 854
    :pswitch_12
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 867
    .line 868
    .line 869
    move-result v3

    .line 870
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 871
    .line 872
    .line 873
    move-result v4

    .line 874
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->t(Lju1;III)V

    .line 875
    .line 876
    .line 877
    return v7

    .line 878
    :pswitch_13
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    move-object v3, v2

    .line 887
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 888
    .line 889
    .line 890
    move-result v2

    .line 891
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 892
    .line 893
    invoke-static {p2, v4}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v4

    .line 897
    check-cast v4, Landroid/os/Bundle;

    .line 898
    .line 899
    if-eqz v1, :cond_1e

    .line 900
    .line 901
    if-nez v4, :cond_1b

    .line 902
    .line 903
    goto :goto_7

    .line 904
    :cond_1b
    :try_start_5
    invoke-static {v4}, Llu3;->a(Landroid/os/Bundle;)Llu3;

    .line 905
    .line 906
    .line 907
    move-result-object v3
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_5

    .line 908
    new-instance v4, Lss2;

    .line 909
    .line 910
    const/4 v5, 0x4

    .line 911
    invoke-direct {v4, v5, v3}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 912
    .line 913
    .line 914
    new-instance v5, Lat2;

    .line 915
    .line 916
    invoke-direct {v5, v4, v7}, Lat2;-><init>(Lit2;I)V

    .line 917
    .line 918
    .line 919
    const/4 v3, 0x0

    .line 920
    const v4, 0x9c4a

    .line 921
    .line 922
    .line 923
    move-object v0, p0

    .line 924
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 925
    .line 926
    .line 927
    goto :goto_7

    .line 928
    :catch_5
    move-exception v0

    .line 929
    invoke-static {v5, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 930
    .line 931
    .line 932
    goto :goto_7

    .line 933
    :pswitch_14
    move-object v3, v2

    .line 934
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    invoke-static {v0}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 943
    .line 944
    .line 945
    move-result v2

    .line 946
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 951
    .line 952
    invoke-static {p2, v4}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v4

    .line 956
    check-cast v4, Landroid/os/Bundle;

    .line 957
    .line 958
    if-eqz v1, :cond_1e

    .line 959
    .line 960
    if-eqz v0, :cond_1e

    .line 961
    .line 962
    if-nez v4, :cond_1c

    .line 963
    .line 964
    goto :goto_7

    .line 965
    :cond_1c
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 966
    .line 967
    .line 968
    move-result v6

    .line 969
    if-eqz v6, :cond_1d

    .line 970
    .line 971
    const-string v0, "setRatingWithMediaId(): Ignoring empty mediaId"

    .line 972
    .line 973
    invoke-static {v5, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    goto :goto_7

    .line 977
    :cond_1d
    :try_start_6
    invoke-static {v4}, Llu3;->a(Landroid/os/Bundle;)Llu3;

    .line 978
    .line 979
    .line 980
    move-result-object v3
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_6

    .line 981
    new-instance v4, Lef0;

    .line 982
    .line 983
    const/16 v5, 0x1a

    .line 984
    .line 985
    invoke-direct {v4, v5, v0, v3}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 986
    .line 987
    .line 988
    new-instance v5, Lat2;

    .line 989
    .line 990
    invoke-direct {v5, v4, v7}, Lat2;-><init>(Lit2;I)V

    .line 991
    .line 992
    .line 993
    const/4 v3, 0x0

    .line 994
    const v4, 0x9c4a

    .line 995
    .line 996
    .line 997
    move-object v0, p0

    .line 998
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_7

    .line 1002
    :catch_6
    move-exception v0

    .line 1003
    invoke-static {v5, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1004
    .line 1005
    .line 1006
    :cond_1e
    :goto_7
    return v7

    .line 1007
    :pswitch_15
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v1

    .line 1011
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v1

    .line 1015
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1016
    .line 1017
    .line 1018
    move-result v2

    .line 1019
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1020
    .line 1021
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v3

    .line 1025
    check-cast v3, Landroid/os/Bundle;

    .line 1026
    .line 1027
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->A(Lju1;ILandroid/os/Bundle;)V

    .line 1028
    .line 1029
    .line 1030
    return v7

    .line 1031
    :pswitch_16
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1040
    .line 1041
    .line 1042
    move-result v2

    .line 1043
    invoke-virtual {p0, v1, v2}, Lkt2;->R(Lju1;I)V

    .line 1044
    .line 1045
    .line 1046
    return v7

    .line 1047
    :pswitch_17
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v1

    .line 1051
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v1

    .line 1055
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1056
    .line 1057
    .line 1058
    move-result v2

    .line 1059
    invoke-virtual {p0, v1, v2}, Lkt2;->A0(Lju1;I)V

    .line 1060
    .line 1061
    .line 1062
    return v7

    .line 1063
    :pswitch_18
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    invoke-virtual {p0, v1}, Lkt2;->p0(Lju1;)V

    .line 1072
    .line 1073
    .line 1074
    return v7

    .line 1075
    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1084
    .line 1085
    .line 1086
    move-result v2

    .line 1087
    sget-object v3, Landroid/view/Surface;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1088
    .line 1089
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    check-cast v3, Landroid/view/Surface;

    .line 1094
    .line 1095
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->m0(Lju1;ILandroid/view/Surface;)V

    .line 1096
    .line 1097
    .line 1098
    return v7

    .line 1099
    :pswitch_1a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v1

    .line 1107
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1108
    .line 1109
    .line 1110
    move-result v2

    .line 1111
    invoke-virtual {p0, v1, v2}, Lkt2;->v(Lju1;I)V

    .line 1112
    .line 1113
    .line 1114
    return v7

    .line 1115
    :pswitch_1b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v1

    .line 1119
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v1

    .line 1123
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1124
    .line 1125
    .line 1126
    move-result v2

    .line 1127
    invoke-virtual {p0, v1, v2}, Lkt2;->a0(Lju1;I)V

    .line 1128
    .line 1129
    .line 1130
    return v7

    .line 1131
    :pswitch_1c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v1

    .line 1135
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v1

    .line 1139
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1140
    .line 1141
    .line 1142
    move-result v2

    .line 1143
    invoke-virtual {p0, v1, v2}, Lkt2;->B(Lju1;I)V

    .line 1144
    .line 1145
    .line 1146
    return v7

    .line 1147
    :pswitch_1d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v1

    .line 1155
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1156
    .line 1157
    .line 1158
    move-result v2

    .line 1159
    invoke-virtual {p0, v1, v2}, Lkt2;->H(Lju1;I)V

    .line 1160
    .line 1161
    .line 1162
    return v7

    .line 1163
    :pswitch_1e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1172
    .line 1173
    .line 1174
    move-result v2

    .line 1175
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1176
    .line 1177
    .line 1178
    move-result v3

    .line 1179
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1180
    .line 1181
    .line 1182
    move-result-wide v4

    .line 1183
    move-object v0, p0

    .line 1184
    invoke-virtual/range {v0 .. v5}, Lkt2;->S(Lju1;IIJ)V

    .line 1185
    .line 1186
    .line 1187
    return v7

    .line 1188
    :pswitch_1f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v1

    .line 1192
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v1

    .line 1196
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1201
    .line 1202
    .line 1203
    move-result-wide v3

    .line 1204
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->d0(Lju1;IJ)V

    .line 1205
    .line 1206
    .line 1207
    return v7

    .line 1208
    :pswitch_20
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v1

    .line 1212
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v1

    .line 1216
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1217
    .line 1218
    .line 1219
    move-result v2

    .line 1220
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1221
    .line 1222
    .line 1223
    move-result v3

    .line 1224
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->f0(Lju1;II)V

    .line 1225
    .line 1226
    .line 1227
    return v7

    .line 1228
    :pswitch_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v1

    .line 1236
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1237
    .line 1238
    .line 1239
    move-result v2

    .line 1240
    invoke-virtual {p0, v1, v2}, Lkt2;->W(Lju1;I)V

    .line 1241
    .line 1242
    .line 1243
    return v7

    .line 1244
    :pswitch_22
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v1

    .line 1248
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v1

    .line 1252
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1253
    .line 1254
    .line 1255
    move-result v2

    .line 1256
    invoke-virtual {p0, v1, v2}, Lkt2;->j0(Lju1;I)V

    .line 1257
    .line 1258
    .line 1259
    return v7

    .line 1260
    :pswitch_23
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v1

    .line 1264
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v1

    .line 1268
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1269
    .line 1270
    .line 1271
    move-result v2

    .line 1272
    invoke-virtual {p0, v1, v2}, Lkt2;->C0(Lju1;I)V

    .line 1273
    .line 1274
    .line 1275
    return v7

    .line 1276
    :pswitch_24
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v1

    .line 1280
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v1

    .line 1284
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1285
    .line 1286
    .line 1287
    move-result v2

    .line 1288
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1289
    .line 1290
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v3

    .line 1294
    check-cast v3, Landroid/os/Bundle;

    .line 1295
    .line 1296
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->y0(Lju1;ILandroid/os/Bundle;)V

    .line 1297
    .line 1298
    .line 1299
    return v7

    .line 1300
    :pswitch_25
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v1

    .line 1304
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v1

    .line 1308
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1309
    .line 1310
    .line 1311
    move-result v2

    .line 1312
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1313
    .line 1314
    .line 1315
    move-result v3

    .line 1316
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v4

    .line 1320
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->Z(Lju1;IILandroid/os/IBinder;)V

    .line 1321
    .line 1322
    .line 1323
    return v7

    .line 1324
    :pswitch_26
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v1

    .line 1332
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1333
    .line 1334
    .line 1335
    move-result v2

    .line 1336
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v3

    .line 1340
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->T(Lju1;ILandroid/os/IBinder;)V

    .line 1341
    .line 1342
    .line 1343
    return v7

    .line 1344
    :pswitch_27
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v1

    .line 1348
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1353
    .line 1354
    .line 1355
    move-result v2

    .line 1356
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1357
    .line 1358
    .line 1359
    move-result v3

    .line 1360
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1361
    .line 1362
    invoke-static {p2, v4}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v4

    .line 1366
    check-cast v4, Landroid/os/Bundle;

    .line 1367
    .line 1368
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->D(Lju1;IILandroid/os/Bundle;)V

    .line 1369
    .line 1370
    .line 1371
    return v7

    .line 1372
    :pswitch_28
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v1

    .line 1376
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v1

    .line 1380
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1381
    .line 1382
    .line 1383
    move-result v2

    .line 1384
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1385
    .line 1386
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v3

    .line 1390
    check-cast v3, Landroid/os/Bundle;

    .line 1391
    .line 1392
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->G(Lju1;ILandroid/os/Bundle;)V

    .line 1393
    .line 1394
    .line 1395
    return v7

    .line 1396
    :pswitch_29
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v1

    .line 1400
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v1

    .line 1404
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1405
    .line 1406
    .line 1407
    move-result v2

    .line 1408
    invoke-virtual {p2}, Landroid/os/Parcel;->readFloat()F

    .line 1409
    .line 1410
    .line 1411
    move-result v3

    .line 1412
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->w(Lju1;IF)V

    .line 1413
    .line 1414
    .line 1415
    return v7

    .line 1416
    :pswitch_2a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v1

    .line 1424
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1425
    .line 1426
    .line 1427
    move-result v2

    .line 1428
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1429
    .line 1430
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v3

    .line 1434
    check-cast v3, Landroid/os/Bundle;

    .line 1435
    .line 1436
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->r0(Lju1;ILandroid/os/Bundle;)V

    .line 1437
    .line 1438
    .line 1439
    return v7

    .line 1440
    :pswitch_2b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v1

    .line 1444
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1449
    .line 1450
    .line 1451
    move-result v2

    .line 1452
    invoke-virtual {p0, v1, v2}, Lkt2;->e0(Lju1;I)V

    .line 1453
    .line 1454
    .line 1455
    return v7

    .line 1456
    :pswitch_2c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v1

    .line 1460
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v1

    .line 1464
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1465
    .line 1466
    .line 1467
    move-result v2

    .line 1468
    invoke-virtual {p0, v1, v2}, Lkt2;->d(Lju1;I)V

    .line 1469
    .line 1470
    .line 1471
    return v7

    .line 1472
    :pswitch_2d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v1

    .line 1476
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v1

    .line 1480
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1481
    .line 1482
    .line 1483
    move-result v2

    .line 1484
    invoke-virtual {p0, v1, v2}, Lkt2;->q(Lju1;I)V

    .line 1485
    .line 1486
    .line 1487
    return v7

    .line 1488
    :pswitch_2e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v1

    .line 1492
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v1

    .line 1496
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1497
    .line 1498
    .line 1499
    move-result v2

    .line 1500
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1501
    .line 1502
    .line 1503
    move-result v3

    .line 1504
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1505
    .line 1506
    .line 1507
    move-result v4

    .line 1508
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1509
    .line 1510
    .line 1511
    move-result v5

    .line 1512
    move-object v0, p0

    .line 1513
    invoke-virtual/range {v0 .. v5}, Lkt2;->E0(Lju1;IIII)V

    .line 1514
    .line 1515
    .line 1516
    return v7

    .line 1517
    :pswitch_2f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v1

    .line 1525
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1526
    .line 1527
    .line 1528
    move-result v2

    .line 1529
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1530
    .line 1531
    .line 1532
    move-result v3

    .line 1533
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1534
    .line 1535
    .line 1536
    move-result v4

    .line 1537
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->F0(Lju1;III)V

    .line 1538
    .line 1539
    .line 1540
    return v7

    .line 1541
    :pswitch_30
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v1

    .line 1545
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v1

    .line 1549
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1550
    .line 1551
    .line 1552
    move-result v2

    .line 1553
    invoke-virtual {p0, v1, v2}, Lkt2;->v0(Lju1;I)V

    .line 1554
    .line 1555
    .line 1556
    return v7

    .line 1557
    :pswitch_31
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v1

    .line 1561
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v1

    .line 1565
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1566
    .line 1567
    .line 1568
    move-result v2

    .line 1569
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1570
    .line 1571
    .line 1572
    move-result v3

    .line 1573
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1574
    .line 1575
    .line 1576
    move-result v4

    .line 1577
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->M(Lju1;III)V

    .line 1578
    .line 1579
    .line 1580
    return v7

    .line 1581
    :pswitch_32
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v1

    .line 1585
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v1

    .line 1589
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1590
    .line 1591
    .line 1592
    move-result v2

    .line 1593
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1594
    .line 1595
    .line 1596
    move-result v3

    .line 1597
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->N(Lju1;II)V

    .line 1598
    .line 1599
    .line 1600
    return v7

    .line 1601
    :pswitch_33
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v1

    .line 1605
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v1

    .line 1609
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1610
    .line 1611
    .line 1612
    move-result v2

    .line 1613
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1614
    .line 1615
    .line 1616
    move-result v3

    .line 1617
    if-eqz v3, :cond_1f

    .line 1618
    .line 1619
    move v4, v7

    .line 1620
    :cond_1f
    invoke-virtual {p0, v1, v2, v4}, Lkt2;->H0(Lju1;IZ)V

    .line 1621
    .line 1622
    .line 1623
    return v7

    .line 1624
    :pswitch_34
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v1

    .line 1628
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v1

    .line 1632
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1633
    .line 1634
    .line 1635
    move-result v2

    .line 1636
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1637
    .line 1638
    .line 1639
    move-result v3

    .line 1640
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->D0(Lju1;II)V

    .line 1641
    .line 1642
    .line 1643
    return v7

    .line 1644
    :pswitch_35
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v1

    .line 1648
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v1

    .line 1652
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1653
    .line 1654
    .line 1655
    move-result v2

    .line 1656
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1657
    .line 1658
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v4

    .line 1662
    check-cast v4, Landroid/os/Bundle;

    .line 1663
    .line 1664
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v3

    .line 1668
    check-cast v3, Landroid/os/Bundle;

    .line 1669
    .line 1670
    const/4 v5, 0x0

    .line 1671
    move-object v0, v4

    .line 1672
    move-object v4, v3

    .line 1673
    move-object v3, v0

    .line 1674
    move-object v0, p0

    .line 1675
    invoke-virtual/range {v0 .. v5}, Lkt2;->s(Lju1;ILandroid/os/Bundle;Landroid/os/Bundle;Z)V

    .line 1676
    .line 1677
    .line 1678
    return v7

    .line 1679
    :pswitch_36
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v1

    .line 1683
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v1

    .line 1687
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1688
    .line 1689
    .line 1690
    move-result v2

    .line 1691
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1692
    .line 1693
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v3

    .line 1697
    check-cast v3, Landroid/os/Bundle;

    .line 1698
    .line 1699
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->n0(Lju1;ILandroid/os/Bundle;)V

    .line 1700
    .line 1701
    .line 1702
    return v7

    .line 1703
    :pswitch_37
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v1

    .line 1707
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v1

    .line 1711
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1712
    .line 1713
    .line 1714
    move-result v2

    .line 1715
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1716
    .line 1717
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v3

    .line 1721
    check-cast v3, Landroid/os/Bundle;

    .line 1722
    .line 1723
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->a(Lju1;ILandroid/os/Bundle;)V

    .line 1724
    .line 1725
    .line 1726
    return v7

    .line 1727
    :pswitch_38
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v1

    .line 1731
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v1

    .line 1735
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1736
    .line 1737
    .line 1738
    move-result v2

    .line 1739
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1740
    .line 1741
    .line 1742
    move-result v3

    .line 1743
    if-eqz v3, :cond_20

    .line 1744
    .line 1745
    move v4, v7

    .line 1746
    :cond_20
    invoke-virtual {p0, v1, v2, v4}, Lkt2;->h0(Lju1;IZ)V

    .line 1747
    .line 1748
    .line 1749
    return v7

    .line 1750
    :pswitch_39
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v1

    .line 1754
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v1

    .line 1758
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1759
    .line 1760
    .line 1761
    move-result v2

    .line 1762
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v3

    .line 1766
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1767
    .line 1768
    .line 1769
    move-result v4

    .line 1770
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1771
    .line 1772
    .line 1773
    move-result-wide v5

    .line 1774
    move-object v0, p0

    .line 1775
    invoke-virtual/range {v0 .. v6}, Lkt2;->u(Lju1;ILandroid/os/IBinder;IJ)V

    .line 1776
    .line 1777
    .line 1778
    return v7

    .line 1779
    :pswitch_3a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v1

    .line 1783
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v1

    .line 1787
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1788
    .line 1789
    .line 1790
    move-result v2

    .line 1791
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v3

    .line 1795
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1796
    .line 1797
    .line 1798
    move-result v5

    .line 1799
    if-eqz v5, :cond_21

    .line 1800
    .line 1801
    move v4, v7

    .line 1802
    :cond_21
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->L(Lju1;ILandroid/os/IBinder;Z)V

    .line 1803
    .line 1804
    .line 1805
    return v7

    .line 1806
    :pswitch_3b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v1

    .line 1810
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v1

    .line 1814
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1815
    .line 1816
    .line 1817
    move-result v2

    .line 1818
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v3

    .line 1822
    invoke-virtual {p0, v1, v2, v3, v7}, Lkt2;->L(Lju1;ILandroid/os/IBinder;Z)V

    .line 1823
    .line 1824
    .line 1825
    return v7

    .line 1826
    :pswitch_3c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v1

    .line 1830
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v1

    .line 1834
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1835
    .line 1836
    .line 1837
    move-result v2

    .line 1838
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1839
    .line 1840
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v3

    .line 1844
    check-cast v3, Landroid/os/Bundle;

    .line 1845
    .line 1846
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1847
    .line 1848
    .line 1849
    move-result v5

    .line 1850
    if-eqz v5, :cond_22

    .line 1851
    .line 1852
    move v4, v7

    .line 1853
    :cond_22
    invoke-virtual {p0, v1, v2, v3, v4}, Lkt2;->o0(Lju1;ILandroid/os/Bundle;Z)V

    .line 1854
    .line 1855
    .line 1856
    return v7

    .line 1857
    :pswitch_3d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v1

    .line 1861
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v1

    .line 1865
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1866
    .line 1867
    .line 1868
    move-result v2

    .line 1869
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1870
    .line 1871
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v3

    .line 1875
    check-cast v3, Landroid/os/Bundle;

    .line 1876
    .line 1877
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1878
    .line 1879
    .line 1880
    move-result-wide v4

    .line 1881
    move-object v0, p0

    .line 1882
    invoke-virtual/range {v0 .. v5}, Lkt2;->l(Lju1;ILandroid/os/Bundle;J)V

    .line 1883
    .line 1884
    .line 1885
    return v7

    .line 1886
    :pswitch_3e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v1

    .line 1890
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v1

    .line 1894
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1895
    .line 1896
    .line 1897
    move-result v2

    .line 1898
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1899
    .line 1900
    invoke-static {p2, v3}, Lsi0;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v3

    .line 1904
    check-cast v3, Landroid/os/Bundle;

    .line 1905
    .line 1906
    invoke-virtual {p0, v1, v2, v3, v7}, Lkt2;->o0(Lju1;ILandroid/os/Bundle;Z)V

    .line 1907
    .line 1908
    .line 1909
    return v7

    .line 1910
    :pswitch_3f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v1

    .line 1914
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v1

    .line 1918
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1919
    .line 1920
    .line 1921
    move-result v2

    .line 1922
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1923
    .line 1924
    .line 1925
    move-result v3

    .line 1926
    if-eqz v3, :cond_23

    .line 1927
    .line 1928
    move v4, v7

    .line 1929
    :cond_23
    invoke-virtual {p0, v1, v2, v4}, Lkt2;->B0(Lju1;IZ)V

    .line 1930
    .line 1931
    .line 1932
    return v7

    .line 1933
    :pswitch_40
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v1

    .line 1937
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v1

    .line 1941
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1942
    .line 1943
    .line 1944
    move-result v2

    .line 1945
    invoke-virtual {p0, v1, v2}, Lkt2;->g0(Lju1;I)V

    .line 1946
    .line 1947
    .line 1948
    return v7

    .line 1949
    :pswitch_41
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v1

    .line 1953
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v1

    .line 1957
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1958
    .line 1959
    .line 1960
    move-result v2

    .line 1961
    invoke-virtual {p0, v1, v2}, Lkt2;->y(Lju1;I)V

    .line 1962
    .line 1963
    .line 1964
    return v7

    .line 1965
    :pswitch_42
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v1

    .line 1969
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v1

    .line 1973
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1974
    .line 1975
    .line 1976
    move-result v2

    .line 1977
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1978
    .line 1979
    .line 1980
    move-result v3

    .line 1981
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->q0(Lju1;II)V

    .line 1982
    .line 1983
    .line 1984
    return v7

    .line 1985
    :pswitch_43
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v1

    .line 1989
    invoke-static {v1}, Lmm2;->m(Landroid/os/IBinder;)Lju1;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v1

    .line 1993
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1994
    .line 1995
    .line 1996
    move-result v2

    .line 1997
    invoke-virtual {p2}, Landroid/os/Parcel;->readFloat()F

    .line 1998
    .line 1999
    .line 2000
    move-result v3

    .line 2001
    invoke-virtual {p0, v1, v2, v3}, Lkt2;->x(Lju1;IF)V

    .line 2002
    .line 2003
    .line 2004
    return v7

    :pswitch_data_0
    .packed-switch 0xbba
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xfa1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x18

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final p0(Lju1;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    :try_start_0
    iget-object v2, p0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ltn2;

    .line 15
    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    invoke-virtual {v2}, Ltn2;->l()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v3, p0, Lkt2;->f:Lna4;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v3, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object v2, v2, Ltn2;->l:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v3, Lur2;

    .line 40
    .line 41
    const/4 v4, 0x4

    .line 42
    invoke-direct {v3, v4, p0, p1}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    :goto_0
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    :goto_1
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :goto_2
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 60
    .line 61
    .line 62
    throw p0
.end method

.method public final q(Lju1;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lkt2;->f:Lna4;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, Lkt2;->M0(Lfr2;I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public final q0(Lju1;II)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lij0;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-direct {v0, p3, v1}, Lij0;-><init>(II)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    const/16 v0, 0x19

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public final r0(Lju1;ILandroid/os/Bundle;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    sget-object v0, Lqh3;->e:Ljava/lang/String;

    .line 7
    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sget-object v2, Lqh3;->f:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p3, v2, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    new-instance v1, Lqh3;

    .line 21
    .line 22
    invoke-direct {v1, v0, p3}, Lqh3;-><init>(FF)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    new-instance p3, Lql2;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    invoke-direct {p3, v1, v0}, Lql2;-><init>(Lqh3;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {p3}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    const/16 v0, 0xd

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p0

    .line 42
    const-string p1, "MediaSessionStub"

    .line 43
    .line 44
    const-string p2, "Ignoring malformed Bundle for PlaybackParameters"

    .line 45
    .line 46
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void
.end method

.method public final s(Lju1;ILandroid/os/Bundle;Landroid/os/Bundle;Z)V
    .locals 7

    .line 1
    invoke-static {p4}, Lf35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    if-eqz p3, :cond_5

    .line 8
    .line 9
    if-nez p4, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    :try_start_0
    invoke-static {p3}, Lva4;->a(Landroid/os/Bundle;)Lva4;

    .line 14
    .line 15
    .line 16
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    iget-object p3, v3, Lva4;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p3}, Lj60;->n(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_4

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 26
    .line 27
    .line 28
    move-result-wide p3

    .line 29
    :try_start_1
    iget-object p5, p0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-virtual {p5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p5

    .line 35
    move-object v4, p5

    .line 36
    check-cast v4, Ltn2;

    .line 37
    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    invoke-virtual {v4}, Ltn2;->l()Z

    .line 41
    .line 42
    .line 43
    move-result p5

    .line 44
    if-eqz p5, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object p5, p0, Lkt2;->f:Lna4;

    .line 48
    .line 49
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p5, v0}, Lna4;->w(Ljava/lang/Object;)Lfr2;

    .line 54
    .line 55
    .line 56
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    :try_start_2
    iget-object p5, v4, Ltn2;->l:Landroid/os/Handler;

    .line 64
    .line 65
    new-instance v0, Lls1;

    .line 66
    .line 67
    move-object v1, p0

    .line 68
    move-object v6, p1

    .line 69
    move v5, p2

    .line 70
    invoke-direct/range {v0 .. v6}, Lls1;-><init>(Lkt2;Lfr2;Lva4;Ltn2;ILju1;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p5, v0}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    .line 76
    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    :goto_0
    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :goto_1
    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 88
    .line 89
    .line 90
    throw p0

    .line 91
    :cond_4
    move-object v0, p0

    .line 92
    move-object v1, p1

    .line 93
    move v2, p2

    .line 94
    new-instance p0, Lef0;

    .line 95
    .line 96
    invoke-direct {p0, p5, v3, p4}, Lef0;-><init>(ZLva4;Landroid/os/Bundle;)V

    .line 97
    .line 98
    .line 99
    new-instance v5, Lat2;

    .line 100
    .line 101
    const/4 p1, 0x1

    .line 102
    invoke-direct {v5, p0, p1}, Lat2;-><init>(Lit2;I)V

    .line 103
    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    invoke-virtual/range {v0 .. v5}, Lkt2;->U(Lju1;ILva4;ILit2;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catch_0
    move-exception v0

    .line 111
    move-object p0, v0

    .line 112
    const-string p1, "MediaSessionStub"

    .line 113
    .line 114
    const-string p2, "Ignoring malformed Bundle for SessionCommand"

    .line 115
    .line 116
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    :goto_2
    return-void
.end method

.method public final t(Lju1;III)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lv31;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    invoke-direct {v0, p3, p4, v1}, Lv31;-><init>(III)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    const/16 p4, 0x21

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public final t0(Lju1;ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    invoke-virtual/range {v0 .. v5}, Lkt2;->s(Lju1;ILandroid/os/Bundle;Landroid/os/Bundle;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final u(Lju1;ILandroid/os/IBinder;IJ)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-eqz p3, :cond_2

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p4, v0, :cond_0

    .line 7
    .line 8
    if-gez p4, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :try_start_0
    invoke-static {p3}, Liw;->a(Landroid/os/IBinder;)Lyw1;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {}, Lyw1;->j()Luw1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ge v1, v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Lpw1;->c(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 46
    .line 47
    .line 48
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    new-instance v0, Llj0;

    .line 50
    .line 51
    invoke-direct {v0, p5, p6, p3, p4}, Llj0;-><init>(JLjava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    new-instance p3, Lzr2;

    .line 55
    .line 56
    const/16 p4, 0x14

    .line 57
    .line 58
    invoke-direct {p3, p4}, Lzr2;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance p5, Lef0;

    .line 62
    .line 63
    const/16 p6, 0x1d

    .line 64
    .line 65
    invoke-direct {p5, p6, v0, p3}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance p3, Lat2;

    .line 69
    .line 70
    const/4 p6, 0x1

    .line 71
    invoke-direct {p3, p5, p6}, Lat2;-><init>(Lit2;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catch_0
    move-exception p0

    .line 79
    const-string p1, "MediaSessionStub"

    .line 80
    .line 81
    const-string p2, "Ignoring malformed Bundle for MediaItem"

    .line 82
    .line 83
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_1
    return-void
.end method

.method public final v(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final v0(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x14

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final w(Lju1;IF)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpl-float v0, p3, v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lw31;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, v1, p3}, Lw31;-><init>(IF)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/16 v0, 0xd

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public final x(Lju1;IF)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpl-float v0, p3, v0

    .line 5
    .line 6
    if-ltz v0, :cond_1

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    cmpg-float v0, p3, v0

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Lw31;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {v0, v1, p3}, Lw31;-><init>(IF)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    const/16 v0, 0x18

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public final x0(Lju1;IZI)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lxs2;

    .line 5
    .line 6
    invoke-direct {v0, p4, p3}, Lxs2;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/16 p4, 0x22

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p4, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final y(Lju1;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lzr2;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/16 v1, 0x1a

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v1, v0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final y0(Lju1;ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Ldo2;->b(Landroid/os/Bundle;)Ldo2;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, Lr31;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p3, v1}, Lr31;-><init>(Ldo2;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    const/16 v0, 0x13

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2, v0, p3}, Lkt2;->N0(Lju1;IILit2;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p0

    .line 27
    const-string p1, "MediaSessionStub"

    .line 28
    .line 29
    const-string p2, "Ignoring malformed Bundle for MediaMetadata"

    .line 30
    .line 31
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method public final z0(Lju1;ILandroid/view/Surface;II)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lhl2;

    .line 5
    .line 6
    const/4 v5, 0x2

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p3

    .line 9
    move v3, p4

    .line 10
    move v4, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lhl2;-><init>(Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/16 p3, 0x1b

    .line 19
    .line 20
    invoke-virtual {v1, p1, p2, p3, p0}, Lkt2;->N0(Lju1;IILit2;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
