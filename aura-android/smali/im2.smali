.class public Lim2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrk2;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lsk2;

.field public final c:Lcb4;

.field public final d:Ltc2;

.field public final e:Lgm2;

.field public final f:Lxs;

.field public final g:Landroid/os/Bundle;

.field public final h:J

.field public i:Lwo0;

.field public j:Ljj2;

.field public k:Z

.field public l:Z

.field public m:Lhm2;

.field public n:Lhm2;

.field public o:Z

.field public p:Lml3;

.field public q:J

.field public r:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsk2;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;Lxs;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lhm2;

    .line 5
    .line 6
    invoke-direct {v0}, Lhm2;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lim2;->m:Lhm2;

    .line 10
    .line 11
    new-instance v0, Lhm2;

    .line 12
    .line 13
    invoke-direct {v0}, Lhm2;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lim2;->n:Lhm2;

    .line 17
    .line 18
    new-instance v0, Lml3;

    .line 19
    .line 20
    const/16 v1, 0xc

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lml3;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lim2;->p:Lml3;

    .line 26
    .line 27
    new-instance v0, Ltc2;

    .line 28
    .line 29
    new-instance v1, Lem2;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lem2;-><init>(Lim2;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Lvp4;->a:Lvp4;

    .line 35
    .line 36
    invoke-direct {v0, p5, v2, v1}, Ltc2;-><init>(Landroid/os/Looper;Lvp4;Lrc2;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lim2;->d:Ltc2;

    .line 40
    .line 41
    iput-object p1, p0, Lim2;->a:Landroid/content/Context;

    .line 42
    .line 43
    iput-object p2, p0, Lim2;->b:Lsk2;

    .line 44
    .line 45
    new-instance p1, Lgm2;

    .line 46
    .line 47
    invoke-direct {p1, p0, p5}, Lgm2;-><init>(Lim2;Landroid/os/Looper;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lim2;->e:Lgm2;

    .line 51
    .line 52
    iput-object p3, p0, Lim2;->c:Lcb4;

    .line 53
    .line 54
    iput-object p4, p0, Lim2;->g:Landroid/os/Bundle;

    .line 55
    .line 56
    iput-object p6, p0, Lim2;->f:Lxs;

    .line 57
    .line 58
    const-wide/16 p1, 0x64

    .line 59
    .line 60
    iput-wide p1, p0, Lim2;->h:J

    .line 61
    .line 62
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    iput-wide p1, p0, Lim2;->q:J

    .line 68
    .line 69
    iput-wide p1, p0, Lim2;->r:J

    .line 70
    .line 71
    sget-object p0, Lgy3;->r:Lgy3;

    .line 72
    .line 73
    return-void
.end method

.method public static X0(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object v0, Lju2;->a:Lhd5;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :cond_1
    :goto_0
    if-ge v2, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-object v0
.end method

.method public static Y0(Lei3;)Lei3;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget v1, v0, Lei3;->q:F

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    cmpg-float v1, v1, v2

    .line 11
    .line 12
    if-gtz v1, :cond_2

    .line 13
    .line 14
    const-string v1, "MCImplLegacy"

    .line 15
    .line 16
    const-string v2, "Adjusting playback speed to 1.0f because negative playback speed isn\'t supported."

    .line 17
    .line 18
    invoke-static {v1, v2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-wide v7, v0, Lei3;->p:J

    .line 27
    .line 28
    iget-wide v10, v0, Lei3;->r:J

    .line 29
    .line 30
    iget v12, v0, Lei3;->s:I

    .line 31
    .line 32
    iget-object v13, v0, Lei3;->t:Ljava/lang/CharSequence;

    .line 33
    .line 34
    iget-object v2, v0, Lei3;->v:Ljava/util/List;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-wide v2, v0, Lei3;->w:J

    .line 42
    .line 43
    iget-object v4, v0, Lei3;->x:Landroid/os/Bundle;

    .line 44
    .line 45
    move-object/from16 v19, v4

    .line 46
    .line 47
    iget v4, v0, Lei3;->n:I

    .line 48
    .line 49
    iget-wide v5, v0, Lei3;->o:J

    .line 50
    .line 51
    iget-wide v14, v0, Lei3;->u:J

    .line 52
    .line 53
    move-wide/from16 v17, v2

    .line 54
    .line 55
    new-instance v3, Lei3;

    .line 56
    .line 57
    const/high16 v9, 0x3f800000    # 1.0f

    .line 58
    .line 59
    move-object/from16 v16, v1

    .line 60
    .line 61
    invoke-direct/range {v3 .. v19}, Lei3;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :cond_2
    return-object v0
.end method

.method public static Z0(ILgn2;JZ)Lpi3;
    .locals 12

    .line 1
    new-instance v0, Lpi3;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    move v10, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v10, v1

    .line 10
    :goto_0
    if-eqz p4, :cond_1

    .line 11
    .line 12
    move v11, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    move v11, v1

    .line 15
    :goto_1
    const/4 v1, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move v5, p0

    .line 18
    move-wide v8, p2

    .line 19
    move v2, p0

    .line 20
    move-object v3, p1

    .line 21
    move-wide v6, p2

    .line 22
    invoke-direct/range {v0 .. v11}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->skipToPrevious()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final A0()V
    .locals 1

    .line 1
    const-string p0, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support muting the player"

    .line 4
    .line 5
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final B()F
    .locals 0

    .line 1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    return p0
.end method

.method public final B0(Lgn2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lim2;->s0(Lgn2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final C()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lim2;->o0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2}, Lim2;->f1(IJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lim2;->J(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final D()Lil;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->q:Lil;

    .line 8
    .line 9
    return-object p0
.end method

.method public final D0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-boolean p0, p0, Llk3;->i:Z

    .line 8
    .line 9
    return p0
.end method

.method public final E(IZ)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lim2;->y0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq p2, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lim2;->j()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-instance v1, Lml3;

    .line 12
    .line 13
    iget-object v2, p0, Lim2;->p:Lml3;

    .line 14
    .line 15
    iget-object v2, v2, Lml3;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Llk3;

    .line 18
    .line 19
    invoke-virtual {v2, v0, p2}, Llk3;->c(IZ)Llk3;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 24
    .line 25
    iget-object v3, v0, Lml3;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lwa4;

    .line 28
    .line 29
    iget-object v4, v0, Lml3;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Lmi3;

    .line 32
    .line 33
    iget-object v5, v0, Lml3;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Lyw1;

    .line 36
    .line 37
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v6, v0

    .line 40
    check-cast v6, Landroid/os/Bundle;

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    invoke-direct/range {v1 .. v7}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p0, v1, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const/16 p2, -0x64

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/16 p2, 0x64

    .line 56
    .line 57
    :goto_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 58
    .line 59
    iget-object p0, p0, Lwo0;->n:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Lxk2;

    .line 62
    .line 63
    iget-object p0, p0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 64
    .line 65
    invoke-virtual {p0, p2, p1}, Landroid/media/session/MediaController;->adjustVolume(II)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final E0()Lcw4;
    .locals 0

    .line 1
    sget-object p0, Lcw4;->J:Lcw4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final F()Lhp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->s:Lhp0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final F0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lim2;->b0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final G()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lim2;->d0(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final G0(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lim2;->H(II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final H(II)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lim2;->F()Lhp0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lhp0;->b:I

    .line 6
    .line 7
    iget v0, v0, Lhp0;->c:I

    .line 8
    .line 9
    if-gt v1, p1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-gt p1, v0, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lim2;->y0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v1, Lml3;

    .line 20
    .line 21
    iget-object v2, p0, Lim2;->p:Lml3;

    .line 22
    .line 23
    iget-object v2, v2, Lml3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Llk3;

    .line 26
    .line 27
    invoke-virtual {v2, p1, v0}, Llk3;->c(IZ)Llk3;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 32
    .line 33
    iget-object v3, v0, Lml3;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lwa4;

    .line 36
    .line 37
    iget-object v4, v0, Lml3;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Lmi3;

    .line 40
    .line 41
    iget-object v5, v0, Lml3;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v5, Lyw1;

    .line 44
    .line 45
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v6, v0

    .line 48
    check-cast v6, Landroid/os/Bundle;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    invoke-direct/range {v1 .. v7}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p0, v1, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 59
    .line 60
    iget-object p0, p0, Lwo0;->n:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Lxk2;

    .line 63
    .line 64
    iget-object p0, p0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2}, Landroid/media/session/MediaController;->setVolumeTo(II)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final H0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->skipToNext()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final I()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lim2;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method public final I0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->fastForward()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final J(I)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lim2;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lim2;->F()Lhp0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lhp0;->c:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    add-int/lit8 v3, v0, 0x1

    .line 15
    .line 16
    if-gt v3, v1, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lim2;->y0()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v3, Lml3;

    .line 23
    .line 24
    iget-object v4, p0, Lim2;->p:Lml3;

    .line 25
    .line 26
    iget-object v4, v4, Lml3;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Llk3;

    .line 29
    .line 30
    add-int/2addr v0, v2

    .line 31
    invoke-virtual {v4, v0, v1}, Llk3;->c(IZ)Llk3;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 36
    .line 37
    iget-object v1, v0, Lml3;->b:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v5, v1

    .line 40
    check-cast v5, Lwa4;

    .line 41
    .line 42
    iget-object v1, v0, Lml3;->c:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v6, v1

    .line 45
    check-cast v6, Lmi3;

    .line 46
    .line 47
    iget-object v1, v0, Lml3;->d:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v7, v1

    .line 50
    check-cast v7, Lyw1;

    .line 51
    .line 52
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v8, v0

    .line 55
    check-cast v8, Landroid/os/Bundle;

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    invoke-direct/range {v3 .. v9}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0, v3, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 66
    .line 67
    iget-object p0, p0, Lwo0;->n:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lxk2;

    .line 70
    .line 71
    iget-object p0, p0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 72
    .line 73
    invoke-virtual {p0, v2, p1}, Landroid/media/session/MediaController;->adjustVolume(II)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final J0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->rewind()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final K()I
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    return p0
.end method

.method public final K0()Ldo2;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    invoke-virtual {p0}, Llk3;->s()Lgn2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Ldo2;->K:Ldo2;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 17
    .line 18
    return-object p0
.end method

.method public final L(IILjava/util/List;)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    if-gt p1, p2, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 12
    .line 13
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Llk3;

    .line 16
    .line 17
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 18
    .line 19
    check-cast v0, Lxs3;

    .line 20
    .line 21
    invoke-virtual {v0}, Lxs3;->o()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-le p1, v0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p0, p3, p2}, Lim2;->N0(Ljava/util/List;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lim2;->P(II)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final L0(Ljava/util/List;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, v0, v1, v2}, Lim2;->T(Ljava/util/List;IJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final M(Lcw4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final M0()J
    .locals 8

    .line 1
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Llk3;

    .line 7
    .line 8
    iget-wide v2, p0, Lim2;->q:J

    .line 9
    .line 10
    iget-wide v4, p0, Lim2;->r:J

    .line 11
    .line 12
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-wide v6, v0, Lsk2;->g:J

    .line 17
    .line 18
    invoke-static/range {v1 .. v7}, Lju2;->c(Llk3;JJJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iput-wide v0, p0, Lim2;->q:J

    .line 23
    .line 24
    return-wide v0
.end method

.method public final N(I)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lim2;->P(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final N0(Ljava/util/List;I)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p2, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-static {v1}, Lrr2;->l(Z)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    iget-object v1, p0, Lim2;->p:Lml3;

    .line 18
    .line 19
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Llk3;

    .line 22
    .line 23
    iget-object v1, v1, Llk3;->j:Lcu4;

    .line 24
    .line 25
    check-cast v1, Lxs3;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1, v0, v1, v2}, Lim2;->T(Ljava/util/List;IJ)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0}, Lim2;->x0()Lcu4;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lcu4;->o()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-virtual {v1, p1, p2}, Lxs3;->q(Ljava/util/List;I)Lxs3;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0}, Lim2;->o0()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ge v1, p2, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    add-int/2addr v1, v2

    .line 70
    :goto_1
    iget-object v2, p0, Lim2;->p:Lml3;

    .line 71
    .line 72
    iget-object v2, v2, Lml3;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Llk3;

    .line 75
    .line 76
    invoke-virtual {v2, v0, v1}, Llk3;->m(Lxs3;I)Llk3;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    new-instance v3, Lml3;

    .line 81
    .line 82
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 83
    .line 84
    iget-object v1, v0, Lml3;->b:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v5, v1

    .line 87
    check-cast v5, Lwa4;

    .line 88
    .line 89
    iget-object v1, v0, Lml3;->c:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v6, v1

    .line 92
    check-cast v6, Lmi3;

    .line 93
    .line 94
    iget-object v1, v0, Lml3;->d:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v7, v1

    .line 97
    check-cast v7, Lyw1;

    .line 98
    .line 99
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v8, v0

    .line 102
    check-cast v8, Landroid/os/Bundle;

    .line 103
    .line 104
    const/4 v9, 0x0

    .line 105
    invoke-direct/range {v3 .. v9}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 106
    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    invoke-virtual {p0, v3, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lim2;->d1()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    invoke-virtual {p0, p1, p2}, Lim2;->W0(Ljava/util/List;I)V

    .line 119
    .line 120
    .line 121
    :cond_4
    :goto_2
    return-void
.end method

.method public final O(J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lim2;->o0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0, p1, p2}, Lim2;->f1(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final O0()J
    .locals 2

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-wide v0, p0, Llk3;->C:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public final P(II)V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-lt p2, p1, :cond_0

    .line 6
    .line 7
    move v2, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v2, v1

    .line 10
    :goto_0
    invoke-static {v2}, Lrr2;->l(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lim2;->x0()Lcu4;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lcu4;->o()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, v2, :cond_5

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, Lim2;->p:Lml3;

    .line 32
    .line 33
    iget-object v2, v2, Lml3;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Llk3;

    .line 36
    .line 37
    iget-object v2, v2, Llk3;->j:Lcu4;

    .line 38
    .line 39
    check-cast v2, Lxs3;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v3, Luw1;

    .line 45
    .line 46
    const/4 v4, 0x4

    .line 47
    invoke-direct {v3, v4}, Lpw1;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v2, Lxs3;->e:Lyw1;

    .line 51
    .line 52
    invoke-virtual {v4, v1, p1}, Lyw1;->r(II)Lyw1;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v3, v5}, Lpw1;->d(Ljava/lang/Iterable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v4, p2, v5}, Lyw1;->r(II)Lyw1;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v3, v4}, Lpw1;->d(Ljava/lang/Iterable;)V

    .line 68
    .line 69
    .line 70
    new-instance v4, Lxs3;

    .line 71
    .line 72
    invoke-virtual {v3}, Luw1;->f()Lgy3;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iget-object v2, v2, Lxs3;->f:Lws3;

    .line 77
    .line 78
    invoke-direct {v4, v3, v2}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lim2;->o0()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    sub-int v3, p2, p1

    .line 86
    .line 87
    const/4 v5, -0x1

    .line 88
    if-ge v2, p1, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    if-ge v2, p2, :cond_3

    .line 92
    .line 93
    move v2, v5

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    sub-int/2addr v2, v3

    .line 96
    :goto_1
    if-ne v2, v5, :cond_4

    .line 97
    .line 98
    invoke-virtual {v4}, Lxs3;->o()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    sub-int/2addr v2, v0

    .line 103
    invoke-static {p1, v1, v2}, Lf35;->j(III)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v1, "Currently playing item is removed. Assumes item at "

    .line 110
    .line 111
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, " is the new current item"

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v1, "MCImplLegacy"

    .line 127
    .line 128
    invoke-static {v1, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 132
    .line 133
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Llk3;

    .line 136
    .line 137
    invoke-virtual {v0, v4, v2}, Llk3;->m(Lxs3;I)Llk3;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    new-instance v5, Lml3;

    .line 142
    .line 143
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 144
    .line 145
    iget-object v1, v0, Lml3;->b:Ljava/lang/Object;

    .line 146
    .line 147
    move-object v7, v1

    .line 148
    check-cast v7, Lwa4;

    .line 149
    .line 150
    iget-object v1, v0, Lml3;->c:Ljava/lang/Object;

    .line 151
    .line 152
    move-object v8, v1

    .line 153
    check-cast v8, Lmi3;

    .line 154
    .line 155
    iget-object v1, v0, Lml3;->d:Ljava/lang/Object;

    .line 156
    .line 157
    move-object v9, v1

    .line 158
    check-cast v9, Lyw1;

    .line 159
    .line 160
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 161
    .line 162
    move-object v10, v0

    .line 163
    check-cast v10, Landroid/os/Bundle;

    .line 164
    .line 165
    const/4 v11, 0x0

    .line 166
    invoke-direct/range {v5 .. v11}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 167
    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-virtual {p0, v5, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lim2;->d1()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_5

    .line 178
    .line 179
    :goto_2
    if-ge p1, p2, :cond_5

    .line 180
    .line 181
    iget-object v0, p0, Lim2;->m:Lhm2;

    .line 182
    .line 183
    iget-object v0, v0, Lhm2;->a:Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-ge p1, v0, :cond_5

    .line 190
    .line 191
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 192
    .line 193
    iget-object v1, p0, Lim2;->m:Lhm2;

    .line 194
    .line 195
    iget-object v1, v1, Lhm2;->a:Ljava/util/List;

    .line 196
    .line 197
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Lor2;

    .line 202
    .line 203
    iget-object v1, v1, Lor2;->n:Lpm2;

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Lwo0;->I(Lpm2;)V

    .line 206
    .line 207
    .line 208
    add-int/lit8 p1, p1, 0x1

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_5
    :goto_3
    return-void
.end method

.method public P0()Lwa4;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lwa4;

    .line 6
    .line 7
    return-object p0
.end method

.method public final Q(Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 1
    const-string p0, "MCImplLegacy"

    .line 2
    .line 3
    const-string p1, "Session doesn\'t support setting SurfaceHolder"

    .line 4
    .line 5
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final Q0()Lyw1;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyw1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final R(F)V
    .locals 0

    .line 1
    const-string p0, "MCImplLegacy"

    .line 2
    .line 3
    const-string p1, "Session doesn\'t support setting player volume"

    .line 4
    .line 5
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final R0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lim2;->c:Lcb4;

    .line 2
    .line 3
    iget-object v1, v0, Lcb4;->a:Lbb4;

    .line 4
    .line 5
    invoke-interface {v1}, Lbb4;->getType()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lcb4;->a:Lbb4;

    .line 12
    .line 13
    invoke-interface {v0}, Lbb4;->c()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, Lpr2;

    .line 21
    .line 22
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lws1;

    .line 27
    .line 28
    const/16 v3, 0xd

    .line 29
    .line 30
    invoke-direct {v2, v3, p0, v0}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lsk2;->a1(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, Lsk2;->f:Landroid/os/Handler;

    .line 41
    .line 42
    new-instance v1, Ldm2;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-direct {v1, p0, v2}, Ldm2;-><init>(Lim2;I)V

    .line 46
    .line 47
    .line 48
    const-wide/16 v2, 0x1f4

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v1, Ldm2;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-direct {v1, p0, v2}, Ldm2;-><init>(Lim2;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lsk2;->a1(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final S()V
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->skipToPrevious()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final S0()Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->g:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method

.method public final T(Ljava/util/List;IJ)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lim2;->r()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v1, Lxs3;->g:Lxs3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    invoke-virtual {v1, v3, v2}, Lxs3;->q(Ljava/util/List;I)Lxs3;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v4, p3, v4

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    const-wide/16 v4, 0x0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-wide/from16 v4, p3

    .line 35
    .line 36
    :goto_0
    iget-object v6, v0, Lim2;->p:Lml3;

    .line 37
    .line 38
    iget-object v6, v6, Lml3;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v6, Llk3;

    .line 41
    .line 42
    invoke-interface/range {p1 .. p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lgn2;

    .line 47
    .line 48
    move/from16 v7, p2

    .line 49
    .line 50
    invoke-static {v7, v3, v4, v5, v2}, Lim2;->Z0(ILgn2;JZ)Lpi3;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    new-instance v7, Lza4;

    .line 55
    .line 56
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v10

    .line 60
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    const-wide/16 v14, 0x0

    .line 72
    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    const-wide/16 v17, 0x0

    .line 76
    .line 77
    move-wide/from16 v21, v12

    .line 78
    .line 79
    move-wide/from16 v23, v14

    .line 80
    .line 81
    invoke-direct/range {v7 .. v24}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v1, v7, v2}, Llk3;->n(Lcu4;Lza4;I)Llk3;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    new-instance v8, Lml3;

    .line 89
    .line 90
    iget-object v1, v0, Lim2;->p:Lml3;

    .line 91
    .line 92
    iget-object v2, v1, Lml3;->b:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v10, v2

    .line 95
    check-cast v10, Lwa4;

    .line 96
    .line 97
    iget-object v2, v1, Lml3;->c:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v11, v2

    .line 100
    check-cast v11, Lmi3;

    .line 101
    .line 102
    iget-object v2, v1, Lml3;->d:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v12, v2

    .line 105
    check-cast v12, Lyw1;

    .line 106
    .line 107
    iget-object v1, v1, Lml3;->e:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v13, v1

    .line 110
    check-cast v13, Landroid/os/Bundle;

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    invoke-direct/range {v8 .. v14}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 114
    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    invoke-virtual {v0, v8, v1, v1}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lim2;->d1()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_2

    .line 125
    .line 126
    invoke-virtual {v0}, Lim2;->c1()V

    .line 127
    .line 128
    .line 129
    :cond_2
    return-void
.end method

.method public T0(Lva4;Landroid/os/Bundle;)Lic2;
    .locals 2

    .line 1
    iget-object v0, p1, Lva4;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object v1, p0, Lim2;->i:Lwo0;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object p2, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v1, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    move-object p2, v1

    .line 31
    :goto_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 32
    .line 33
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p1, p1, Lva4;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Lpz1;->I(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Lab4;

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-direct {p0, p1}, Lab4;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lmw1;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    new-instance p0, Lab4;

    .line 55
    .line 56
    const/16 p1, -0x64

    .line 57
    .line 58
    invoke-direct {p0, p1}, Lab4;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance p1, Lmw1;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object p1
.end method

.method public final U()Landroidx/media3/common/PlaybackException;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 8
    .line 9
    return-object p0
.end method

.method public final U0(Lgn2;)V
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1, v0}, Lim2;->N0(Ljava/util/List;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final V(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Llk3;

    .line 7
    .line 8
    iget-boolean v0, v1, Llk3;->v:Z

    .line 9
    .line 10
    if-ne v0, p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-wide v2, p0, Lim2;->q:J

    .line 14
    .line 15
    iget-wide v4, p0, Lim2;->r:J

    .line 16
    .line 17
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v6, v0, Lsk2;->g:J

    .line 22
    .line 23
    invoke-static/range {v1 .. v7}, Lju2;->c(Llk3;JJJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p0, Lim2;->q:J

    .line 28
    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iput-wide v0, p0, Lim2;->r:J

    .line 34
    .line 35
    new-instance v2, Lml3;

    .line 36
    .line 37
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 38
    .line 39
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Llk3;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {v0, v1, v3, p1}, Llk3;->d(IIZ)Llk3;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 50
    .line 51
    iget-object v1, v0, Lml3;->b:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v4, v1

    .line 54
    check-cast v4, Lwa4;

    .line 55
    .line 56
    iget-object v1, v0, Lml3;->c:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v5, v1

    .line 59
    check-cast v5, Lmi3;

    .line 60
    .line 61
    iget-object v1, v0, Lml3;->d:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v6, v1

    .line 64
    check-cast v6, Lyw1;

    .line 65
    .line 66
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v7, v0

    .line 69
    check-cast v7, Landroid/os/Bundle;

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-direct/range {v2 .. v8}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    invoke-virtual {p0, v2, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lim2;->d1()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 86
    .line 87
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Llk3;

    .line 90
    .line 91
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 92
    .line 93
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_2

    .line 98
    .line 99
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 100
    .line 101
    if-eqz p1, :cond_1

    .line 102
    .line 103
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->play()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_1
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->pause()V

    .line 124
    .line 125
    .line 126
    :cond_2
    :goto_0
    return-void
.end method

.method public final V0(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lim2;->L0(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final W(I)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, v1}, Lim2;->f1(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final W0(Ljava/util/List;I)V
    .locals 8

    .line 1
    new-instance v4, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    invoke-direct {v2, v7}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lfm2;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v3, p1

    .line 17
    move v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, Lfm2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-ge v7, p0, :cond_1

    .line 26
    .line 27
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lgn2;

    .line 32
    .line 33
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 34
    .line 35
    iget-object p0, p0, Ldo2;->k:[B

    .line 36
    .line 37
    if-nez p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lfm2;->run()V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    iget-object p1, v1, Lim2;->f:Lxs;

    .line 48
    .line 49
    invoke-interface {p1, p0}, Lxs;->j([B)Lic2;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lim2;->a1()Lsk2;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p1, p1, Lsk2;->f:Landroid/os/Handler;

    .line 61
    .line 62
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    new-instance p2, Lym;

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    invoke-direct {p2, p1, v2}, Lym;-><init>(Landroid/os/Handler;I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, v0, p2}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    return-void
.end method

.method public final X()J
    .locals 2

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-wide v0, p0, Llk3;->D:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public final Y()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lim2;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method public final Z()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lim2;->M0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public a()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lim2;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lim2;->k:Z

    .line 8
    .line 9
    iget-object v0, p0, Lim2;->j:Ljj2;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Ljj2;->a()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lim2;->j:Ljj2;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object v2, v0, Lwo0;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/util/Set;

    .line 26
    .line 27
    iget-object v3, p0, Lim2;->e:Lgm2;

    .line 28
    .line 29
    invoke-interface {v2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    const-string v0, "MediaControllerCompat"

    .line 36
    .line 37
    const-string v2, "the callback has never been registered"

    .line 38
    .line 39
    invoke-static {v0, v2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :try_start_0
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lxk2;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Lxk2;->b(Lgm2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v1}, Lgm2;->d(Landroid/os/Handler;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v0, v3, Lgm2;->d:Landroid/os/Handler;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lim2;->i:Lwo0;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    invoke-virtual {v3, v1}, Lgm2;->d(Landroid/os/Handler;)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 67
    iput-boolean v0, p0, Lim2;->l:Z

    .line 68
    .line 69
    iget-object p0, p0, Lim2;->d:Ltc2;

    .line 70
    .line 71
    invoke-virtual {p0}, Ltc2;->d()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final a0()V
    .locals 1

    .line 1
    const-string p0, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support unmuting the player"

    .line 4
    .line 5
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public a1()Lsk2;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->b:Lsk2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()V
    .locals 10

    .line 1
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Llk3;

    .line 6
    .line 7
    iget v1, v0, Llk3;->A:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    new-instance v3, Lml3;

    .line 14
    .line 15
    iget-object v1, v0, Llk3;->j:Lcu4;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x2

    .line 26
    :goto_0
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, v1, v2}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 32
    .line 33
    iget-object v1, v0, Lml3;->b:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v5, v1

    .line 36
    check-cast v5, Lwa4;

    .line 37
    .line 38
    iget-object v1, v0, Lml3;->c:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v6, v1

    .line 41
    check-cast v6, Lmi3;

    .line 42
    .line 43
    iget-object v1, v0, Lml3;->d:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v7, v1

    .line 46
    check-cast v7, Lyw1;

    .line 47
    .line 48
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v8, v0

    .line 51
    check-cast v8, Landroid/os/Bundle;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-direct/range {v3 .. v9}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v3, v2, v2}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 61
    .line 62
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Llk3;

    .line 65
    .line 66
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Lim2;->c1()V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_1
    return-void
.end method

.method public final b0()J
    .locals 2

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 8
    .line 9
    iget-wide v0, p0, Lza4;->e:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final b1(ZLhm2;)V
    .locals 78

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-boolean v1, v0, Lim2;->k:Z

    .line 6
    .line 7
    if-nez v1, :cond_7a

    .line 8
    .line 9
    iget-boolean v1, v0, Lim2;->l:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_51

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Lim2;->m:Lhm2;

    .line 16
    .line 17
    iget-object v3, v0, Lim2;->p:Lml3;

    .line 18
    .line 19
    iget-object v4, v0, Lim2;->i:Lwo0;

    .line 20
    .line 21
    iget-object v4, v4, Lwo0;->n:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Lxk2;

    .line 24
    .line 25
    iget-object v4, v4, Lxk2;->a:Landroid/media/session/MediaController;

    .line 26
    .line 27
    invoke-virtual {v4}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v5, v0, Lim2;->i:Lwo0;

    .line 32
    .line 33
    iget-object v5, v5, Lwo0;->n:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Lxk2;

    .line 36
    .line 37
    iget-object v5, v5, Lxk2;->a:Landroid/media/session/MediaController;

    .line 38
    .line 39
    invoke-virtual {v5}, Landroid/media/session/MediaController;->getFlags()J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    iget-object v7, v0, Lim2;->i:Lwo0;

    .line 44
    .line 45
    iget-object v7, v7, Lwo0;->n:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, Lxk2;

    .line 48
    .line 49
    iget-object v7, v7, Lxk2;->e:Lpr2;

    .line 50
    .line 51
    invoke-virtual {v7}, Lpr2;->a()Lqu1;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    const/4 v7, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v7, 0x0

    .line 60
    :goto_0
    iget-object v10, v0, Lim2;->i:Lwo0;

    .line 61
    .line 62
    iget-object v10, v10, Lwo0;->n:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v10, Lxk2;

    .line 65
    .line 66
    iget-object v10, v10, Lxk2;->a:Landroid/media/session/MediaController;

    .line 67
    .line 68
    invoke-virtual {v10}, Landroid/media/session/MediaController;->getRatingType()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    invoke-virtual {v0}, Lim2;->a1()Lsk2;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    iget-wide v11, v11, Lsk2;->g:J

    .line 77
    .line 78
    iget-boolean v13, v0, Lim2;->o:Z

    .line 79
    .line 80
    iget-object v14, v1, Lhm2;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v14, Leo2;

    .line 83
    .line 84
    iget-object v15, v1, Lhm2;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v15, Lei3;

    .line 87
    .line 88
    const/16 v16, 0x1

    .line 89
    .line 90
    iget-object v8, v1, Lhm2;->a:Ljava/util/List;

    .line 91
    .line 92
    if-eqz v14, :cond_5

    .line 93
    .line 94
    iget-object v9, v2, Lhm2;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v9, Leo2;

    .line 97
    .line 98
    if-eqz v9, :cond_5

    .line 99
    .line 100
    move-wide/from16 v18, v5

    .line 101
    .line 102
    iget-object v5, v14, Leo2;->p:[B

    .line 103
    .line 104
    if-nez v5, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-virtual {v9}, Leo2;->b()Landroid/graphics/Bitmap;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    if-nez v5, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    invoke-virtual {v14}, Leo2;->b()Landroid/graphics/Bitmap;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    if-eqz v6, :cond_6

    .line 119
    .line 120
    invoke-virtual {v5, v6}, Landroid/graphics/Bitmap;->sameAs(Landroid/graphics/Bitmap;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-nez v5, :cond_4

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    iget-object v5, v14, Leo2;->p:[B

    .line 128
    .line 129
    iput-object v5, v9, Leo2;->p:[B

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    move-wide/from16 v18, v5

    .line 133
    .line 134
    :cond_6
    :goto_1
    iget-object v5, v2, Lhm2;->a:Ljava/util/List;

    .line 135
    .line 136
    iget-object v6, v2, Lhm2;->h:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v6, Landroid/os/Bundle;

    .line 139
    .line 140
    iget-object v9, v2, Lhm2;->e:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v9, Lei3;

    .line 143
    .line 144
    iget-object v14, v2, Lhm2;->f:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v14, Leo2;

    .line 147
    .line 148
    move/from16 v20, v7

    .line 149
    .line 150
    iget-object v7, v2, Lhm2;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v7, Lfg4;

    .line 153
    .line 154
    if-eq v8, v5, :cond_e

    .line 155
    .line 156
    move/from16 v21, v13

    .line 157
    .line 158
    new-instance v13, Ljava/util/HashMap;

    .line 159
    .line 160
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 161
    .line 162
    .line 163
    move-object/from16 v22, v4

    .line 164
    .line 165
    move-wide/from16 v23, v11

    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    :goto_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    if-ge v4, v11, :cond_8

    .line 173
    .line 174
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    check-cast v11, Lor2;

    .line 179
    .line 180
    iget-object v12, v11, Lor2;->n:Lpm2;

    .line 181
    .line 182
    iget-object v12, v12, Lpm2;->r:Landroid/graphics/Bitmap;

    .line 183
    .line 184
    if-eqz v12, :cond_7

    .line 185
    .line 186
    move-object v12, v6

    .line 187
    move-object/from16 v25, v7

    .line 188
    .line 189
    iget-wide v6, v11, Lor2;->o:J

    .line 190
    .line 191
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {v13, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_7
    move-object v12, v6

    .line 200
    move-object/from16 v25, v7

    .line 201
    .line 202
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 203
    .line 204
    move-object v6, v12

    .line 205
    move-object/from16 v7, v25

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_8
    move-object v12, v6

    .line 209
    move-object/from16 v25, v7

    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    :goto_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-ge v4, v6, :cond_d

    .line 217
    .line 218
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    check-cast v6, Lor2;

    .line 223
    .line 224
    iget-object v7, v6, Lor2;->n:Lpm2;

    .line 225
    .line 226
    iget-object v7, v7, Lpm2;->r:Landroid/graphics/Bitmap;

    .line 227
    .line 228
    if-eqz v7, :cond_c

    .line 229
    .line 230
    move-object v7, v12

    .line 231
    iget-wide v11, v6, Lor2;->o:J

    .line 232
    .line 233
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-virtual {v13, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    check-cast v11, Lor2;

    .line 242
    .line 243
    if-eqz v11, :cond_b

    .line 244
    .line 245
    iget-object v6, v6, Lor2;->n:Lpm2;

    .line 246
    .line 247
    iget-object v11, v11, Lor2;->n:Lpm2;

    .line 248
    .line 249
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iget-object v12, v11, Lpm2;->s:[B

    .line 253
    .line 254
    if-eqz v12, :cond_b

    .line 255
    .line 256
    iget-object v12, v6, Lpm2;->r:Landroid/graphics/Bitmap;

    .line 257
    .line 258
    if-eqz v12, :cond_b

    .line 259
    .line 260
    move/from16 v26, v4

    .line 261
    .line 262
    iget-object v4, v11, Lpm2;->r:Landroid/graphics/Bitmap;

    .line 263
    .line 264
    if-nez v4, :cond_9

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_9
    invoke-virtual {v12, v4}, Landroid/graphics/Bitmap;->sameAs(Landroid/graphics/Bitmap;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-nez v4, :cond_a

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_a
    iget-object v4, v11, Lpm2;->s:[B

    .line 275
    .line 276
    iput-object v4, v6, Lpm2;->s:[B

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_b
    move/from16 v26, v4

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_c
    move/from16 v26, v4

    .line 283
    .line 284
    move-object v7, v12

    .line 285
    :goto_5
    add-int/lit8 v4, v26, 0x1

    .line 286
    .line 287
    move-object v12, v7

    .line 288
    goto :goto_4

    .line 289
    :cond_d
    move-object v7, v12

    .line 290
    goto :goto_6

    .line 291
    :cond_e
    move-object/from16 v22, v4

    .line 292
    .line 293
    move-object/from16 v25, v7

    .line 294
    .line 295
    move-wide/from16 v23, v11

    .line 296
    .line 297
    move/from16 v21, v13

    .line 298
    .line 299
    move-object v7, v6

    .line 300
    :goto_6
    if-eq v8, v5, :cond_f

    .line 301
    .line 302
    move/from16 v4, v16

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_f
    const/4 v4, 0x0

    .line 306
    :goto_7
    const/4 v8, 0x4

    .line 307
    const-string v11, "initialCapacity"

    .line 308
    .line 309
    if-eqz v4, :cond_12

    .line 310
    .line 311
    sget-object v12, Lxs3;->g:Lxs3;

    .line 312
    .line 313
    invoke-static {v8, v11}, Luc5;->f(ILjava/lang/String;)V

    .line 314
    .line 315
    .line 316
    new-array v12, v8, [Ljava/lang/Object;

    .line 317
    .line 318
    const/4 v8, 0x0

    .line 319
    const/4 v13, 0x0

    .line 320
    :goto_8
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-ge v13, v6, :cond_11

    .line 325
    .line 326
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    check-cast v6, Lor2;

    .line 331
    .line 332
    sget-object v28, Lf92;->a:Ljx1;

    .line 333
    .line 334
    move/from16 v28, v4

    .line 335
    .line 336
    iget-object v4, v6, Lor2;->n:Lpm2;

    .line 337
    .line 338
    invoke-static {v4}, Lf92;->j(Lpm2;)Lgn2;

    .line 339
    .line 340
    .line 341
    move-result-object v30

    .line 342
    new-instance v29, Lws3;

    .line 343
    .line 344
    move-object v4, v7

    .line 345
    iget-wide v6, v6, Lor2;->o:J

    .line 346
    .line 347
    const-wide v33, -0x7fffffffffffffffL    # -4.9E-324

    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    move-wide/from16 v31, v6

    .line 353
    .line 354
    invoke-direct/range {v29 .. v34}, Lws3;-><init>(Lgn2;JJ)V

    .line 355
    .line 356
    .line 357
    array-length v6, v12

    .line 358
    add-int/lit8 v7, v8, 0x1

    .line 359
    .line 360
    invoke-static {v6, v7}, Lqw1;->b(II)I

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    move-object/from16 v30, v4

    .line 365
    .line 366
    array-length v4, v12

    .line 367
    if-gt v6, v4, :cond_10

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_10
    invoke-static {v12, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    move-object v12, v4

    .line 375
    :goto_9
    aput-object v29, v12, v8

    .line 376
    .line 377
    add-int/lit8 v13, v13, 0x1

    .line 378
    .line 379
    move v8, v7

    .line 380
    move/from16 v4, v28

    .line 381
    .line 382
    move-object/from16 v7, v30

    .line 383
    .line 384
    goto :goto_8

    .line 385
    :cond_11
    move/from16 v28, v4

    .line 386
    .line 387
    move-object/from16 v30, v7

    .line 388
    .line 389
    new-instance v4, Lxs3;

    .line 390
    .line 391
    invoke-static {v8, v12}, Lyw1;->i(I[Ljava/lang/Object;)Lgy3;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    const/4 v7, 0x0

    .line 396
    invoke-direct {v4, v6, v7}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 397
    .line 398
    .line 399
    goto :goto_a

    .line 400
    :cond_12
    move/from16 v28, v4

    .line 401
    .line 402
    move-object/from16 v30, v7

    .line 403
    .line 404
    iget-object v4, v3, Lml3;->a:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v4, Llk3;

    .line 407
    .line 408
    iget-object v4, v4, Llk3;->j:Lcu4;

    .line 409
    .line 410
    check-cast v4, Lxs3;

    .line 411
    .line 412
    new-instance v6, Lxs3;

    .line 413
    .line 414
    iget-object v7, v4, Lxs3;->e:Lyw1;

    .line 415
    .line 416
    iget-object v4, v4, Lxs3;->f:Lws3;

    .line 417
    .line 418
    invoke-direct {v6, v7, v4}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 419
    .line 420
    .line 421
    move-object v4, v6

    .line 422
    :goto_a
    iget-object v6, v1, Lhm2;->f:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v6, Leo2;

    .line 425
    .line 426
    if-ne v6, v14, :cond_14

    .line 427
    .line 428
    if-eqz p1, :cond_13

    .line 429
    .line 430
    goto :goto_b

    .line 431
    :cond_13
    const/4 v6, 0x0

    .line 432
    goto :goto_c

    .line 433
    :cond_14
    :goto_b
    move/from16 v6, v16

    .line 434
    .line 435
    :goto_c
    if-nez v15, :cond_15

    .line 436
    .line 437
    const-wide/16 v12, -0x1

    .line 438
    .line 439
    goto :goto_d

    .line 440
    :cond_15
    iget-wide v12, v15, Lei3;->w:J

    .line 441
    .line 442
    :goto_d
    if-nez v9, :cond_16

    .line 443
    .line 444
    const-wide/16 v7, -0x1

    .line 445
    .line 446
    const-wide/16 v31, -0x1

    .line 447
    .line 448
    goto :goto_e

    .line 449
    :cond_16
    const-wide/16 v31, -0x1

    .line 450
    .line 451
    iget-wide v7, v9, Lei3;->w:J

    .line 452
    .line 453
    :goto_e
    cmp-long v12, v12, v7

    .line 454
    .line 455
    if-nez v12, :cond_18

    .line 456
    .line 457
    if-eqz p1, :cond_17

    .line 458
    .line 459
    goto :goto_f

    .line 460
    :cond_17
    const/4 v12, 0x0

    .line 461
    goto :goto_10

    .line 462
    :cond_18
    :goto_f
    move/from16 v12, v16

    .line 463
    .line 464
    :goto_10
    invoke-static {v14}, Lf92;->d(Leo2;)J

    .line 465
    .line 466
    .line 467
    move-result-wide v37

    .line 468
    const-string v13, "MCImplLegacy"

    .line 469
    .line 470
    if-nez v6, :cond_19

    .line 471
    .line 472
    if-nez v12, :cond_19

    .line 473
    .line 474
    if-eqz v28, :cond_1a

    .line 475
    .line 476
    :cond_19
    move/from16 v28, v6

    .line 477
    .line 478
    goto :goto_11

    .line 479
    :cond_1a
    iget-object v5, v3, Lml3;->a:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v5, Llk3;

    .line 482
    .line 483
    iget-object v6, v5, Llk3;->c:Lza4;

    .line 484
    .line 485
    iget-object v6, v6, Lza4;->a:Lpi3;

    .line 486
    .line 487
    iget v6, v6, Lpi3;->b:I

    .line 488
    .line 489
    iget-object v5, v5, Llk3;->B:Ldo2;

    .line 490
    .line 491
    move-object/from16 v67, v5

    .line 492
    .line 493
    move-object/from16 v29, v13

    .line 494
    .line 495
    goto/16 :goto_1d

    .line 496
    .line 497
    :goto_11
    if-eqz v5, :cond_1d

    .line 498
    .line 499
    cmp-long v29, v7, v31

    .line 500
    .line 501
    if-nez v29, :cond_1b

    .line 502
    .line 503
    goto :goto_13

    .line 504
    :cond_1b
    move-wide/from16 v31, v7

    .line 505
    .line 506
    const/4 v6, 0x0

    .line 507
    :goto_12
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 508
    .line 509
    .line 510
    move-result v7

    .line 511
    if-ge v6, v7, :cond_1d

    .line 512
    .line 513
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v7

    .line 517
    check-cast v7, Lor2;

    .line 518
    .line 519
    iget-wide v7, v7, Lor2;->o:J

    .line 520
    .line 521
    cmp-long v7, v7, v31

    .line 522
    .line 523
    if-nez v7, :cond_1c

    .line 524
    .line 525
    goto :goto_14

    .line 526
    :cond_1c
    add-int/lit8 v6, v6, 0x1

    .line 527
    .line 528
    goto :goto_12

    .line 529
    :cond_1d
    :goto_13
    const/4 v6, -0x1

    .line 530
    :goto_14
    if-eqz v14, :cond_1e

    .line 531
    .line 532
    move/from16 v7, v16

    .line 533
    .line 534
    goto :goto_15

    .line 535
    :cond_1e
    const/4 v7, 0x0

    .line 536
    :goto_15
    if-eqz v7, :cond_1f

    .line 537
    .line 538
    if-eqz v28, :cond_1f

    .line 539
    .line 540
    invoke-static {v14, v10}, Lf92;->m(Leo2;I)Ldo2;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    goto :goto_16

    .line 545
    :cond_1f
    if-nez v7, :cond_21

    .line 546
    .line 547
    if-eqz v12, :cond_21

    .line 548
    .line 549
    const/4 v8, -0x1

    .line 550
    if-ne v6, v8, :cond_20

    .line 551
    .line 552
    sget-object v5, Ldo2;->K:Ldo2;

    .line 553
    .line 554
    goto :goto_16

    .line 555
    :cond_20
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v5

    .line 559
    check-cast v5, Lor2;

    .line 560
    .line 561
    iget-object v5, v5, Lor2;->n:Lpm2;

    .line 562
    .line 563
    invoke-static {v5, v10}, Lf92;->l(Lpm2;I)Ldo2;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    goto :goto_16

    .line 568
    :cond_21
    iget-object v5, v3, Lml3;->a:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v5, Llk3;

    .line 571
    .line 572
    iget-object v5, v5, Llk3;->B:Ldo2;

    .line 573
    .line 574
    :goto_16
    iget-object v8, v4, Lxs3;->e:Lyw1;

    .line 575
    .line 576
    const/4 v12, -0x1

    .line 577
    if-ne v6, v12, :cond_27

    .line 578
    .line 579
    if-eqz v28, :cond_26

    .line 580
    .line 581
    if-eqz v7, :cond_24

    .line 582
    .line 583
    const-string v4, "Adding a fake MediaItem at the end of the list because there\'s no QueueItem with the active queue id and current Timeline should have currently playing MediaItem."

    .line 584
    .line 585
    invoke-static {v13, v4}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    const-string v4, "android.media.metadata.MEDIA_ID"

    .line 589
    .line 590
    iget-object v6, v14, Leo2;->n:Landroid/os/Bundle;

    .line 591
    .line 592
    invoke-virtual {v6, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    if-eqz v4, :cond_22

    .line 597
    .line 598
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    goto :goto_17

    .line 603
    :cond_22
    const/4 v7, 0x0

    .line 604
    :goto_17
    invoke-static {v7, v14, v10}, Lf92;->k(Ljava/lang/String;Leo2;I)Lgn2;

    .line 605
    .line 606
    .line 607
    move-result-object v34

    .line 608
    new-instance v4, Lxs3;

    .line 609
    .line 610
    new-instance v33, Lws3;

    .line 611
    .line 612
    const-wide/16 v35, -0x1

    .line 613
    .line 614
    invoke-direct/range {v33 .. v38}, Lws3;-><init>(Lgn2;JJ)V

    .line 615
    .line 616
    .line 617
    move-object/from16 v6, v33

    .line 618
    .line 619
    invoke-direct {v4, v8, v6}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v4}, Lxs3;->o()I

    .line 623
    .line 624
    .line 625
    move-result v6

    .line 626
    add-int/lit8 v6, v6, -0x1

    .line 627
    .line 628
    :cond_23
    :goto_18
    move-object/from16 v28, v5

    .line 629
    .line 630
    move-object/from16 v29, v13

    .line 631
    .line 632
    goto/16 :goto_1c

    .line 633
    .line 634
    :cond_24
    new-instance v4, Lxs3;

    .line 635
    .line 636
    const/4 v12, 0x0

    .line 637
    invoke-direct {v4, v8, v12}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 638
    .line 639
    .line 640
    :cond_25
    move-object/from16 v28, v5

    .line 641
    .line 642
    move-object/from16 v29, v13

    .line 643
    .line 644
    const/4 v6, 0x0

    .line 645
    goto/16 :goto_1c

    .line 646
    .line 647
    :cond_26
    const/4 v12, -0x1

    .line 648
    :cond_27
    if-eq v6, v12, :cond_25

    .line 649
    .line 650
    new-instance v4, Lxs3;

    .line 651
    .line 652
    const/4 v12, 0x0

    .line 653
    invoke-direct {v4, v8, v12}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 654
    .line 655
    .line 656
    if-eqz v7, :cond_23

    .line 657
    .line 658
    invoke-virtual {v4}, Lxs3;->o()I

    .line 659
    .line 660
    .line 661
    move-result v7

    .line 662
    if-lt v6, v7, :cond_28

    .line 663
    .line 664
    move-object v7, v12

    .line 665
    goto :goto_19

    .line 666
    :cond_28
    invoke-virtual {v4, v6}, Lxs3;->s(I)Lws3;

    .line 667
    .line 668
    .line 669
    move-result-object v7

    .line 670
    iget-object v7, v7, Lws3;->a:Lgn2;

    .line 671
    .line 672
    :goto_19
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    iget-object v7, v7, Lgn2;->a:Ljava/lang/String;

    .line 676
    .line 677
    invoke-static {v7, v14, v10}, Lf92;->k(Ljava/lang/String;Leo2;I)Lgn2;

    .line 678
    .line 679
    .line 680
    move-result-object v34

    .line 681
    iget-object v7, v4, Lxs3;->e:Lyw1;

    .line 682
    .line 683
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    .line 684
    .line 685
    .line 686
    move-result v8

    .line 687
    iget-object v4, v4, Lxs3;->f:Lws3;

    .line 688
    .line 689
    if-lt v6, v8, :cond_2a

    .line 690
    .line 691
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    .line 692
    .line 693
    .line 694
    move-result v8

    .line 695
    if-ne v6, v8, :cond_29

    .line 696
    .line 697
    if-eqz v4, :cond_29

    .line 698
    .line 699
    goto :goto_1a

    .line 700
    :cond_29
    const/4 v8, 0x0

    .line 701
    goto :goto_1b

    .line 702
    :cond_2a
    :goto_1a
    move/from16 v8, v16

    .line 703
    .line 704
    :goto_1b
    invoke-static {v8}, Lrr2;->l(Z)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    .line 708
    .line 709
    .line 710
    move-result v8

    .line 711
    if-ne v6, v8, :cond_2b

    .line 712
    .line 713
    new-instance v4, Lxs3;

    .line 714
    .line 715
    new-instance v33, Lws3;

    .line 716
    .line 717
    const-wide/16 v35, -0x1

    .line 718
    .line 719
    invoke-direct/range {v33 .. v38}, Lws3;-><init>(Lgn2;JJ)V

    .line 720
    .line 721
    .line 722
    move-object/from16 v8, v33

    .line 723
    .line 724
    invoke-direct {v4, v7, v8}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 725
    .line 726
    .line 727
    goto :goto_18

    .line 728
    :cond_2b
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    check-cast v8, Lws3;

    .line 733
    .line 734
    move-object v10, v13

    .line 735
    iget-wide v12, v8, Lws3;->b:J

    .line 736
    .line 737
    new-instance v8, Luw1;

    .line 738
    .line 739
    move-object/from16 v28, v5

    .line 740
    .line 741
    const/4 v5, 0x4

    .line 742
    invoke-direct {v8, v5}, Lpw1;-><init>(I)V

    .line 743
    .line 744
    .line 745
    move-object/from16 v29, v10

    .line 746
    .line 747
    const/4 v5, 0x0

    .line 748
    invoke-virtual {v7, v5, v6}, Lyw1;->r(II)Lyw1;

    .line 749
    .line 750
    .line 751
    move-result-object v10

    .line 752
    invoke-virtual {v8, v10}, Lpw1;->d(Ljava/lang/Iterable;)V

    .line 753
    .line 754
    .line 755
    new-instance v33, Lws3;

    .line 756
    .line 757
    move-wide/from16 v35, v12

    .line 758
    .line 759
    invoke-direct/range {v33 .. v38}, Lws3;-><init>(Lgn2;JJ)V

    .line 760
    .line 761
    .line 762
    move-object/from16 v5, v33

    .line 763
    .line 764
    invoke-virtual {v8, v5}, Lpw1;->c(Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    add-int/lit8 v5, v6, 0x1

    .line 768
    .line 769
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    .line 770
    .line 771
    .line 772
    move-result v10

    .line 773
    invoke-virtual {v7, v5, v10}, Lyw1;->r(II)Lyw1;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    invoke-virtual {v8, v5}, Lpw1;->d(Ljava/lang/Iterable;)V

    .line 778
    .line 779
    .line 780
    new-instance v5, Lxs3;

    .line 781
    .line 782
    invoke-virtual {v8}, Luw1;->f()Lgy3;

    .line 783
    .line 784
    .line 785
    move-result-object v7

    .line 786
    invoke-direct {v5, v7, v4}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 787
    .line 788
    .line 789
    move-object v4, v5

    .line 790
    :goto_1c
    move-object/from16 v67, v28

    .line 791
    .line 792
    :goto_1d
    if-eqz v25, :cond_2c

    .line 793
    .line 794
    move-object/from16 v7, v25

    .line 795
    .line 796
    iget v5, v7, Lfg4;->c:I

    .line 797
    .line 798
    goto :goto_1e

    .line 799
    :cond_2c
    move-object/from16 v7, v25

    .line 800
    .line 801
    const/4 v5, 0x0

    .line 802
    :goto_1e
    new-instance v8, Lxk0;

    .line 803
    .line 804
    const/4 v10, 0x2

    .line 805
    invoke-direct {v8, v10}, Lxk0;-><init>(I)V

    .line 806
    .line 807
    .line 808
    if-nez v9, :cond_2d

    .line 809
    .line 810
    const-wide/16 v12, 0x0

    .line 811
    .line 812
    const-wide/16 v31, 0x0

    .line 813
    .line 814
    goto :goto_1f

    .line 815
    :cond_2d
    const-wide/16 v31, 0x0

    .line 816
    .line 817
    iget-wide v12, v9, Lei3;->r:J

    .line 818
    .line 819
    :goto_1f
    if-nez v9, :cond_2e

    .line 820
    .line 821
    :goto_20
    move/from16 v28, v6

    .line 822
    .line 823
    move-object/from16 v33, v7

    .line 824
    .line 825
    const/4 v10, 0x0

    .line 826
    goto :goto_21

    .line 827
    :cond_2e
    iget v10, v9, Lei3;->n:I

    .line 828
    .line 829
    packed-switch v10, :pswitch_data_0

    .line 830
    .line 831
    .line 832
    :pswitch_0
    goto :goto_20

    .line 833
    :pswitch_1
    move/from16 v28, v6

    .line 834
    .line 835
    move-object/from16 v33, v7

    .line 836
    .line 837
    move/from16 v10, v16

    .line 838
    .line 839
    :goto_21
    const-wide/16 v6, 0x4

    .line 840
    .line 841
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 842
    .line 843
    .line 844
    move-result v34

    .line 845
    if-eqz v34, :cond_2f

    .line 846
    .line 847
    if-eqz v10, :cond_30

    .line 848
    .line 849
    :cond_2f
    move-wide/from16 v34, v6

    .line 850
    .line 851
    goto :goto_23

    .line 852
    :cond_30
    move-wide/from16 v34, v6

    .line 853
    .line 854
    :cond_31
    :goto_22
    move/from16 v6, v16

    .line 855
    .line 856
    goto :goto_24

    .line 857
    :goto_23
    const-wide/16 v6, 0x2

    .line 858
    .line 859
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 860
    .line 861
    .line 862
    move-result v6

    .line 863
    if-eqz v6, :cond_32

    .line 864
    .line 865
    if-nez v10, :cond_31

    .line 866
    .line 867
    :cond_32
    const-wide/16 v6, 0x200

    .line 868
    .line 869
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 870
    .line 871
    .line 872
    move-result v6

    .line 873
    if-eqz v6, :cond_33

    .line 874
    .line 875
    goto :goto_22

    .line 876
    :goto_24
    invoke-virtual {v8, v6}, Lxk0;->b(I)V

    .line 877
    .line 878
    .line 879
    :cond_33
    const-wide/16 v6, 0x4000

    .line 880
    .line 881
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 882
    .line 883
    .line 884
    move-result v6

    .line 885
    if-eqz v6, :cond_34

    .line 886
    .line 887
    const/4 v6, 0x2

    .line 888
    invoke-virtual {v8, v6}, Lxk0;->b(I)V

    .line 889
    .line 890
    .line 891
    :cond_34
    const-wide/32 v6, 0x8000

    .line 892
    .line 893
    .line 894
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 895
    .line 896
    .line 897
    move-result v6

    .line 898
    if-eqz v6, :cond_35

    .line 899
    .line 900
    const-wide/16 v6, 0x400

    .line 901
    .line 902
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 903
    .line 904
    .line 905
    move-result v6

    .line 906
    if-nez v6, :cond_37

    .line 907
    .line 908
    :cond_35
    const-wide/32 v6, 0x10000

    .line 909
    .line 910
    .line 911
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 912
    .line 913
    .line 914
    move-result v6

    .line 915
    if-eqz v6, :cond_36

    .line 916
    .line 917
    const-wide/16 v6, 0x800

    .line 918
    .line 919
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 920
    .line 921
    .line 922
    move-result v6

    .line 923
    if-nez v6, :cond_37

    .line 924
    .line 925
    :cond_36
    const-wide/32 v6, 0x20000

    .line 926
    .line 927
    .line 928
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 929
    .line 930
    .line 931
    move-result v6

    .line 932
    if-eqz v6, :cond_38

    .line 933
    .line 934
    const-wide/16 v6, 0x2000

    .line 935
    .line 936
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 937
    .line 938
    .line 939
    move-result v6

    .line 940
    if-eqz v6, :cond_38

    .line 941
    .line 942
    :cond_37
    const/16 v6, 0x1f

    .line 943
    .line 944
    const/4 v7, 0x2

    .line 945
    filled-new-array {v6, v7}, [I

    .line 946
    .line 947
    .line 948
    move-result-object v6

    .line 949
    invoke-virtual {v8, v6}, Lxk0;->d([I)V

    .line 950
    .line 951
    .line 952
    :cond_38
    const-wide/16 v6, 0x8

    .line 953
    .line 954
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 955
    .line 956
    .line 957
    move-result v6

    .line 958
    if-eqz v6, :cond_39

    .line 959
    .line 960
    const/16 v6, 0xb

    .line 961
    .line 962
    invoke-virtual {v8, v6}, Lxk0;->b(I)V

    .line 963
    .line 964
    .line 965
    :cond_39
    const-wide/16 v6, 0x40

    .line 966
    .line 967
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 968
    .line 969
    .line 970
    move-result v6

    .line 971
    if-eqz v6, :cond_3a

    .line 972
    .line 973
    const/16 v6, 0xc

    .line 974
    .line 975
    invoke-virtual {v8, v6}, Lxk0;->b(I)V

    .line 976
    .line 977
    .line 978
    :cond_3a
    const-wide/16 v6, 0x100

    .line 979
    .line 980
    invoke-static {v12, v13, v6, v7}, Lf92;->y(JJ)Z

    .line 981
    .line 982
    .line 983
    move-result v6

    .line 984
    const/4 v7, 0x5

    .line 985
    if-eqz v6, :cond_3b

    .line 986
    .line 987
    const/4 v6, 0x4

    .line 988
    filled-new-array {v7, v6}, [I

    .line 989
    .line 990
    .line 991
    move-result-object v10

    .line 992
    invoke-virtual {v8, v10}, Lxk0;->d([I)V

    .line 993
    .line 994
    .line 995
    :cond_3b
    move v10, v7

    .line 996
    move-object v6, v8

    .line 997
    const-wide/16 v7, 0x20

    .line 998
    .line 999
    invoke-static {v12, v13, v7, v8}, Lf92;->y(JJ)Z

    .line 1000
    .line 1001
    .line 1002
    move-result v7

    .line 1003
    if-eqz v7, :cond_3c

    .line 1004
    .line 1005
    const/16 v7, 0x9

    .line 1006
    .line 1007
    const/16 v8, 0x8

    .line 1008
    .line 1009
    filled-new-array {v7, v8}, [I

    .line 1010
    .line 1011
    .line 1012
    move-result-object v7

    .line 1013
    invoke-virtual {v6, v7}, Lxk0;->d([I)V

    .line 1014
    .line 1015
    .line 1016
    :cond_3c
    const-wide/16 v7, 0x10

    .line 1017
    .line 1018
    invoke-static {v12, v13, v7, v8}, Lf92;->y(JJ)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v7

    .line 1022
    const/4 v8, 0x6

    .line 1023
    move/from16 v76, v10

    .line 1024
    .line 1025
    const/4 v10, 0x7

    .line 1026
    if-eqz v7, :cond_3d

    .line 1027
    .line 1028
    filled-new-array {v10, v8}, [I

    .line 1029
    .line 1030
    .line 1031
    move-result-object v7

    .line 1032
    invoke-virtual {v6, v7}, Lxk0;->d([I)V

    .line 1033
    .line 1034
    .line 1035
    :cond_3d
    move-object v7, v11

    .line 1036
    const-wide/32 v10, 0x400000

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v12, v13, v10, v11}, Lf92;->y(JJ)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v10

    .line 1043
    if-eqz v10, :cond_3e

    .line 1044
    .line 1045
    const/16 v10, 0xd

    .line 1046
    .line 1047
    invoke-virtual {v6, v10}, Lxk0;->b(I)V

    .line 1048
    .line 1049
    .line 1050
    :cond_3e
    const-wide/16 v10, 0x1

    .line 1051
    .line 1052
    invoke-static {v12, v13, v10, v11}, Lf92;->y(JJ)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v10

    .line 1056
    const/4 v11, 0x3

    .line 1057
    if-eqz v10, :cond_3f

    .line 1058
    .line 1059
    invoke-virtual {v6, v11}, Lxk0;->b(I)V

    .line 1060
    .line 1061
    .line 1062
    :cond_3f
    const/16 v10, 0x22

    .line 1063
    .line 1064
    const/16 v11, 0x1a

    .line 1065
    .line 1066
    const/4 v8, 0x1

    .line 1067
    if-ne v5, v8, :cond_41

    .line 1068
    .line 1069
    filled-new-array {v11, v10}, [I

    .line 1070
    .line 1071
    .line 1072
    move-result-object v5

    .line 1073
    invoke-virtual {v6, v5}, Lxk0;->d([I)V

    .line 1074
    .line 1075
    .line 1076
    :cond_40
    :goto_25
    const/4 v5, 0x6

    .line 1077
    goto :goto_26

    .line 1078
    :cond_41
    const/4 v8, 0x2

    .line 1079
    if-ne v5, v8, :cond_40

    .line 1080
    .line 1081
    const/16 v5, 0x19

    .line 1082
    .line 1083
    const/16 v8, 0x21

    .line 1084
    .line 1085
    filled-new-array {v11, v10, v5, v8}, [I

    .line 1086
    .line 1087
    .line 1088
    move-result-object v5

    .line 1089
    invoke-virtual {v6, v5}, Lxk0;->d([I)V

    .line 1090
    .line 1091
    .line 1092
    goto :goto_25

    .line 1093
    :goto_26
    new-array v5, v5, [I

    .line 1094
    .line 1095
    fill-array-data v5, :array_0

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v6, v5}, Lxk0;->d([I)V

    .line 1099
    .line 1100
    .line 1101
    and-long v10, v18, v34

    .line 1102
    .line 1103
    cmp-long v5, v10, v31

    .line 1104
    .line 1105
    if-eqz v5, :cond_42

    .line 1106
    .line 1107
    const/16 v5, 0x14

    .line 1108
    .line 1109
    invoke-virtual {v6, v5}, Lxk0;->b(I)V

    .line 1110
    .line 1111
    .line 1112
    const-wide/16 v10, 0x1000

    .line 1113
    .line 1114
    invoke-static {v12, v13, v10, v11}, Lf92;->y(JJ)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v5

    .line 1118
    if-eqz v5, :cond_42

    .line 1119
    .line 1120
    const/16 v5, 0xa

    .line 1121
    .line 1122
    invoke-virtual {v6, v5}, Lxk0;->b(I)V

    .line 1123
    .line 1124
    .line 1125
    :cond_42
    if-eqz v20, :cond_44

    .line 1126
    .line 1127
    const-wide/32 v10, 0x40000

    .line 1128
    .line 1129
    .line 1130
    invoke-static {v12, v13, v10, v11}, Lf92;->y(JJ)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v5

    .line 1134
    if-eqz v5, :cond_43

    .line 1135
    .line 1136
    const/16 v5, 0xf

    .line 1137
    .line 1138
    invoke-virtual {v6, v5}, Lxk0;->b(I)V

    .line 1139
    .line 1140
    .line 1141
    :cond_43
    const-wide/32 v10, 0x200000

    .line 1142
    .line 1143
    .line 1144
    invoke-static {v12, v13, v10, v11}, Lf92;->y(JJ)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v5

    .line 1148
    if-eqz v5, :cond_44

    .line 1149
    .line 1150
    const/16 v5, 0xe

    .line 1151
    .line 1152
    invoke-virtual {v6, v5}, Lxk0;->b(I)V

    .line 1153
    .line 1154
    .line 1155
    :cond_44
    new-instance v5, Lmi3;

    .line 1156
    .line 1157
    invoke-virtual {v6}, Lxk0;->f()Lw71;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v6

    .line 1161
    invoke-direct {v5, v6}, Lmi3;-><init>(Lw71;)V

    .line 1162
    .line 1163
    .line 1164
    iget-object v1, v1, Lhm2;->g:Ljava/lang/Object;

    .line 1165
    .line 1166
    check-cast v1, Ljava/lang/CharSequence;

    .line 1167
    .line 1168
    iget-object v6, v2, Lhm2;->g:Ljava/lang/Object;

    .line 1169
    .line 1170
    check-cast v6, Ljava/lang/CharSequence;

    .line 1171
    .line 1172
    if-ne v1, v6, :cond_45

    .line 1173
    .line 1174
    iget-object v1, v3, Lml3;->a:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v1, Llk3;

    .line 1177
    .line 1178
    iget-object v1, v1, Llk3;->m:Ldo2;

    .line 1179
    .line 1180
    :goto_27
    move-object/from16 v52, v1

    .line 1181
    .line 1182
    goto :goto_28

    .line 1183
    :cond_45
    if-nez v6, :cond_46

    .line 1184
    .line 1185
    sget-object v1, Ldo2;->K:Ldo2;

    .line 1186
    .line 1187
    goto :goto_27

    .line 1188
    :cond_46
    new-instance v1, Lco2;

    .line 1189
    .line 1190
    invoke-direct {v1}, Lco2;-><init>()V

    .line 1191
    .line 1192
    .line 1193
    iput-object v6, v1, Lco2;->a:Ljava/lang/CharSequence;

    .line 1194
    .line 1195
    new-instance v6, Ldo2;

    .line 1196
    .line 1197
    invoke-direct {v6, v1}, Ldo2;-><init>(Lco2;)V

    .line 1198
    .line 1199
    .line 1200
    move-object v1, v6

    .line 1201
    goto :goto_27

    .line 1202
    :goto_28
    iget v1, v2, Lhm2;->b:I

    .line 1203
    .line 1204
    invoke-static {v1}, Lf92;->s(I)I

    .line 1205
    .line 1206
    .line 1207
    move-result v1

    .line 1208
    iget v6, v2, Lhm2;->c:I

    .line 1209
    .line 1210
    invoke-static {v6}, Lf92;->u(I)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v6

    .line 1214
    if-ne v15, v9, :cond_48

    .line 1215
    .line 1216
    if-eqz v21, :cond_47

    .line 1217
    .line 1218
    goto :goto_29

    .line 1219
    :cond_47
    iget-object v7, v3, Lml3;->b:Ljava/lang/Object;

    .line 1220
    .line 1221
    check-cast v7, Lwa4;

    .line 1222
    .line 1223
    iget-object v8, v3, Lml3;->d:Ljava/lang/Object;

    .line 1224
    .line 1225
    check-cast v8, Lyw1;

    .line 1226
    .line 1227
    move/from16 v18, v1

    .line 1228
    .line 1229
    move/from16 v19, v6

    .line 1230
    .line 1231
    goto/16 :goto_32

    .line 1232
    .line 1233
    :cond_48
    :goto_29
    new-instance v8, Ljava/util/HashSet;

    .line 1234
    .line 1235
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 1236
    .line 1237
    .line 1238
    sget-object v10, Lva4;->d:Lgy3;

    .line 1239
    .line 1240
    const/4 v11, 0x0

    .line 1241
    :goto_2a
    iget v12, v10, Lgy3;->q:I

    .line 1242
    .line 1243
    if-ge v11, v12, :cond_49

    .line 1244
    .line 1245
    new-instance v12, Lva4;

    .line 1246
    .line 1247
    invoke-virtual {v10, v11}, Lgy3;->get(I)Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v13

    .line 1251
    check-cast v13, Ljava/lang/Integer;

    .line 1252
    .line 1253
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 1254
    .line 1255
    .line 1256
    move-result v13

    .line 1257
    invoke-direct {v12, v13}, Lva4;-><init>(I)V

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v8, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    add-int/lit8 v11, v11, 0x1

    .line 1264
    .line 1265
    goto :goto_2a

    .line 1266
    :cond_49
    if-nez v20, :cond_4b

    .line 1267
    .line 1268
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v10

    .line 1272
    :cond_4a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v11

    .line 1276
    if-eqz v11, :cond_4b

    .line 1277
    .line 1278
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v11

    .line 1282
    check-cast v11, Lva4;

    .line 1283
    .line 1284
    iget v12, v11, Lva4;->a:I

    .line 1285
    .line 1286
    const v13, 0x9c4a

    .line 1287
    .line 1288
    .line 1289
    if-ne v12, v13, :cond_4a

    .line 1290
    .line 1291
    invoke-virtual {v8, v11}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1292
    .line 1293
    .line 1294
    :cond_4b
    if-eqz v9, :cond_4d

    .line 1295
    .line 1296
    iget-object v10, v9, Lei3;->v:Ljava/util/List;

    .line 1297
    .line 1298
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v10

    .line 1302
    :goto_2b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1303
    .line 1304
    .line 1305
    move-result v11

    .line 1306
    if-eqz v11, :cond_4d

    .line 1307
    .line 1308
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v11

    .line 1312
    check-cast v11, Ldi3;

    .line 1313
    .line 1314
    iget-object v12, v11, Ldi3;->n:Ljava/lang/String;

    .line 1315
    .line 1316
    iget-object v11, v11, Ldi3;->q:Landroid/os/Bundle;

    .line 1317
    .line 1318
    new-instance v13, Lva4;

    .line 1319
    .line 1320
    if-nez v11, :cond_4c

    .line 1321
    .line 1322
    sget-object v11, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 1323
    .line 1324
    :cond_4c
    invoke-direct {v13, v12, v11}, Lva4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v8, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1328
    .line 1329
    .line 1330
    goto :goto_2b

    .line 1331
    :cond_4d
    new-instance v10, Lwa4;

    .line 1332
    .line 1333
    invoke-direct {v10, v8}, Lwa4;-><init>(Ljava/util/HashSet;)V

    .line 1334
    .line 1335
    .line 1336
    if-nez v9, :cond_4e

    .line 1337
    .line 1338
    sget-object v7, Lyw1;->o:Lvw1;

    .line 1339
    .line 1340
    sget-object v7, Lgy3;->r:Lgy3;

    .line 1341
    .line 1342
    move/from16 v18, v1

    .line 1343
    .line 1344
    move/from16 v19, v6

    .line 1345
    .line 1346
    move-object v8, v7

    .line 1347
    goto/16 :goto_31

    .line 1348
    .line 1349
    :cond_4e
    iget-object v8, v9, Lei3;->v:Ljava/util/List;

    .line 1350
    .line 1351
    move-object v11, v7

    .line 1352
    const/4 v7, 0x4

    .line 1353
    invoke-static {v7, v11}, Luc5;->f(ILjava/lang/String;)V

    .line 1354
    .line 1355
    .line 1356
    new-array v11, v7, [Ljava/lang/Object;

    .line 1357
    .line 1358
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v7

    .line 1362
    const/4 v8, 0x0

    .line 1363
    :goto_2c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1364
    .line 1365
    .line 1366
    move-result v12

    .line 1367
    if-eqz v12, :cond_56

    .line 1368
    .line 1369
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v12

    .line 1373
    check-cast v12, Ldi3;

    .line 1374
    .line 1375
    iget-object v13, v12, Ldi3;->n:Ljava/lang/String;

    .line 1376
    .line 1377
    iget-object v15, v12, Ldi3;->q:Landroid/os/Bundle;

    .line 1378
    .line 1379
    if-eqz v15, :cond_4f

    .line 1380
    .line 1381
    move/from16 v18, v1

    .line 1382
    .line 1383
    const-string v1, "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT"

    .line 1384
    .line 1385
    move/from16 v19, v6

    .line 1386
    .line 1387
    const/4 v6, 0x0

    .line 1388
    invoke-virtual {v15, v1, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1389
    .line 1390
    .line 1391
    move-result v1

    .line 1392
    goto :goto_2d

    .line 1393
    :cond_4f
    move/from16 v18, v1

    .line 1394
    .line 1395
    move/from16 v19, v6

    .line 1396
    .line 1397
    const/4 v1, 0x0

    .line 1398
    :goto_2d
    new-instance v6, Li60;

    .line 1399
    .line 1400
    move-object/from16 v20, v7

    .line 1401
    .line 1402
    iget v7, v12, Ldi3;->p:I

    .line 1403
    .line 1404
    invoke-direct {v6, v1, v7}, Li60;-><init>(II)V

    .line 1405
    .line 1406
    .line 1407
    new-instance v1, Lva4;

    .line 1408
    .line 1409
    if-nez v15, :cond_50

    .line 1410
    .line 1411
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 1412
    .line 1413
    goto :goto_2e

    .line 1414
    :cond_50
    move-object v7, v15

    .line 1415
    :goto_2e
    invoke-direct {v1, v13, v7}, Lva4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v6, v1}, Li60;->d(Lva4;)V

    .line 1419
    .line 1420
    .line 1421
    iget-object v1, v12, Ldi3;->o:Ljava/lang/CharSequence;

    .line 1422
    .line 1423
    iput-object v1, v6, Li60;->f:Ljava/lang/CharSequence;

    .line 1424
    .line 1425
    const/4 v1, 0x1

    .line 1426
    iput-boolean v1, v6, Li60;->h:Z

    .line 1427
    .line 1428
    if-eqz v15, :cond_51

    .line 1429
    .line 1430
    new-instance v1, Landroid/os/Bundle;

    .line 1431
    .line 1432
    invoke-direct {v1, v15}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 1433
    .line 1434
    .line 1435
    iput-object v1, v6, Li60;->g:Landroid/os/Bundle;

    .line 1436
    .line 1437
    :cond_51
    if-eqz v15, :cond_52

    .line 1438
    .line 1439
    const-string v1, "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT"

    .line 1440
    .line 1441
    invoke-virtual {v15, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v7

    .line 1445
    goto :goto_2f

    .line 1446
    :cond_52
    const/4 v7, 0x0

    .line 1447
    :goto_2f
    if-eqz v7, :cond_54

    .line 1448
    .line 1449
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v7

    .line 1457
    const-string v12, "content"

    .line 1458
    .line 1459
    invoke-static {v7, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1460
    .line 1461
    .line 1462
    move-result v12

    .line 1463
    if-nez v12, :cond_53

    .line 1464
    .line 1465
    const-string v12, "android.resource"

    .line 1466
    .line 1467
    invoke-static {v7, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1468
    .line 1469
    .line 1470
    move-result v7

    .line 1471
    if-eqz v7, :cond_54

    .line 1472
    .line 1473
    :cond_53
    invoke-virtual {v6, v1}, Li60;->b(Landroid/net/Uri;)V

    .line 1474
    .line 1475
    .line 1476
    :cond_54
    invoke-virtual {v6}, Li60;->a()Lj60;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v1

    .line 1480
    array-length v6, v11

    .line 1481
    add-int/lit8 v7, v8, 0x1

    .line 1482
    .line 1483
    invoke-static {v6, v7}, Lqw1;->b(II)I

    .line 1484
    .line 1485
    .line 1486
    move-result v6

    .line 1487
    array-length v12, v11

    .line 1488
    if-gt v6, v12, :cond_55

    .line 1489
    .line 1490
    goto :goto_30

    .line 1491
    :cond_55
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v6

    .line 1495
    move-object v11, v6

    .line 1496
    :goto_30
    aput-object v1, v11, v8

    .line 1497
    .line 1498
    move v8, v7

    .line 1499
    move/from16 v1, v18

    .line 1500
    .line 1501
    move/from16 v6, v19

    .line 1502
    .line 1503
    move-object/from16 v7, v20

    .line 1504
    .line 1505
    goto/16 :goto_2c

    .line 1506
    .line 1507
    :cond_56
    move/from16 v18, v1

    .line 1508
    .line 1509
    move/from16 v19, v6

    .line 1510
    .line 1511
    invoke-static {v8, v11}, Lyw1;->i(I[Ljava/lang/Object;)Lgy3;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    move-object/from16 v7, v30

    .line 1516
    .line 1517
    invoke-static {v1, v5, v7}, Lj60;->k(Ljava/util/List;Lmi3;Landroid/os/Bundle;)Lgy3;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    move-object v8, v1

    .line 1522
    :goto_31
    move-object v7, v10

    .line 1523
    :goto_32
    iget-object v1, v0, Lim2;->a:Landroid/content/Context;

    .line 1524
    .line 1525
    invoke-static {v9, v1}, Lf92;->o(Lei3;Landroid/content/Context;)Landroidx/media3/common/PlaybackException;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v6

    .line 1529
    if-nez v9, :cond_58

    .line 1530
    .line 1531
    :cond_57
    :goto_33
    move-object v1, v5

    .line 1532
    move-object v10, v6

    .line 1533
    move-wide/from16 v12, v23

    .line 1534
    .line 1535
    const/4 v11, 0x0

    .line 1536
    goto :goto_36

    .line 1537
    :cond_58
    iget v10, v9, Lei3;->n:I

    .line 1538
    .line 1539
    iget v11, v9, Lei3;->s:I

    .line 1540
    .line 1541
    iget-object v12, v9, Lei3;->t:Ljava/lang/CharSequence;

    .line 1542
    .line 1543
    iget-object v13, v9, Lei3;->x:Landroid/os/Bundle;

    .line 1544
    .line 1545
    const/4 v15, 0x7

    .line 1546
    if-eq v10, v15, :cond_57

    .line 1547
    .line 1548
    if-nez v11, :cond_59

    .line 1549
    .line 1550
    goto :goto_33

    .line 1551
    :cond_59
    invoke-static {v11}, Lf92;->t(I)I

    .line 1552
    .line 1553
    .line 1554
    move-result v10

    .line 1555
    new-instance v11, Lxa4;

    .line 1556
    .line 1557
    if-eqz v12, :cond_5a

    .line 1558
    .line 1559
    invoke-interface {v12}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v1

    .line 1563
    goto :goto_34

    .line 1564
    :cond_5a
    invoke-static {v1, v10}, Lf92;->x(Landroid/content/Context;I)Ljava/lang/String;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v1

    .line 1568
    :goto_34
    if-eqz v13, :cond_5b

    .line 1569
    .line 1570
    goto :goto_35

    .line 1571
    :cond_5b
    sget-object v13, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 1572
    .line 1573
    :goto_35
    invoke-direct {v11, v1, v10, v13}, Lxa4;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 1574
    .line 1575
    .line 1576
    move-object v1, v5

    .line 1577
    move-object v10, v6

    .line 1578
    move-wide/from16 v12, v23

    .line 1579
    .line 1580
    :goto_36
    invoke-static {v9, v14, v12, v13}, Lf92;->c(Lei3;Leo2;J)J

    .line 1581
    .line 1582
    .line 1583
    move-result-wide v5

    .line 1584
    invoke-static {v9, v14, v12, v13}, Lf92;->b(Lei3;Leo2;J)J

    .line 1585
    .line 1586
    .line 1587
    move-result-wide v40

    .line 1588
    move-object v15, v7

    .line 1589
    move-object/from16 v20, v8

    .line 1590
    .line 1591
    invoke-static {v9, v14, v12, v13}, Lf92;->b(Lei3;Leo2;J)J

    .line 1592
    .line 1593
    .line 1594
    move-result-wide v7

    .line 1595
    move-object/from16 v23, v10

    .line 1596
    .line 1597
    move-object/from16 v21, v11

    .line 1598
    .line 1599
    invoke-static {v14}, Lf92;->d(Leo2;)J

    .line 1600
    .line 1601
    .line 1602
    move-result-wide v10

    .line 1603
    invoke-static {v7, v8, v10, v11}, Lju2;->b(JJ)I

    .line 1604
    .line 1605
    .line 1606
    move-result v42

    .line 1607
    invoke-static {v9, v14, v12, v13}, Lf92;->b(Lei3;Leo2;J)J

    .line 1608
    .line 1609
    .line 1610
    move-result-wide v7

    .line 1611
    invoke-static {v9, v14, v12, v13}, Lf92;->c(Lei3;Leo2;J)J

    .line 1612
    .line 1613
    .line 1614
    move-result-wide v10

    .line 1615
    sub-long v43, v7, v10

    .line 1616
    .line 1617
    if-nez v14, :cond_5d

    .line 1618
    .line 1619
    :cond_5c
    const/4 v7, 0x0

    .line 1620
    goto :goto_37

    .line 1621
    :cond_5d
    const-string v7, "android.media.metadata.ADVERTISEMENT"

    .line 1622
    .line 1623
    invoke-virtual {v14, v7}, Leo2;->a(Ljava/lang/String;)J

    .line 1624
    .line 1625
    .line 1626
    move-result-wide v7

    .line 1627
    cmp-long v7, v7, v31

    .line 1628
    .line 1629
    if-eqz v7, :cond_5c

    .line 1630
    .line 1631
    const/4 v7, 0x1

    .line 1632
    :goto_37
    if-nez v9, :cond_5e

    .line 1633
    .line 1634
    sget-object v8, Lqh3;->d:Lqh3;

    .line 1635
    .line 1636
    goto :goto_38

    .line 1637
    :cond_5e
    new-instance v8, Lqh3;

    .line 1638
    .line 1639
    iget v10, v9, Lei3;->q:F

    .line 1640
    .line 1641
    invoke-direct {v8, v10}, Lqh3;-><init>(F)V

    .line 1642
    .line 1643
    .line 1644
    :goto_38
    if-nez v33, :cond_5f

    .line 1645
    .line 1646
    sget-object v10, Lil;->i:Lil;

    .line 1647
    .line 1648
    move-object/from16 v55, v10

    .line 1649
    .line 1650
    move-object/from16 v10, v33

    .line 1651
    .line 1652
    goto :goto_39

    .line 1653
    :cond_5f
    move-object/from16 v10, v33

    .line 1654
    .line 1655
    iget-object v11, v10, Lfg4;->f:Ljava/lang/Object;

    .line 1656
    .line 1657
    check-cast v11, Lil;

    .line 1658
    .line 1659
    move-object/from16 v55, v11

    .line 1660
    .line 1661
    :goto_39
    if-nez v9, :cond_60

    .line 1662
    .line 1663
    :goto_3a
    const/16 v61, 0x0

    .line 1664
    .line 1665
    goto :goto_3b

    .line 1666
    :cond_60
    iget v11, v9, Lei3;->n:I

    .line 1667
    .line 1668
    packed-switch v11, :pswitch_data_1

    .line 1669
    .line 1670
    .line 1671
    :pswitch_2
    goto :goto_3a

    .line 1672
    :pswitch_3
    const/16 v61, 0x1

    .line 1673
    .line 1674
    :goto_3b
    if-nez v9, :cond_62

    .line 1675
    .line 1676
    :pswitch_4
    move-object/from16 v24, v1

    .line 1677
    .line 1678
    :cond_61
    const/4 v1, 0x1

    .line 1679
    goto :goto_3e

    .line 1680
    :cond_62
    :try_start_0
    iget v11, v9, Lei3;->n:I

    .line 1681
    .line 1682
    invoke-static {v14}, Lf92;->d(Leo2;)J

    .line 1683
    .line 1684
    .line 1685
    move-result-wide v33

    .line 1686
    const-wide v35, -0x7fffffffffffffffL    # -4.9E-324

    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    cmp-long v24, v33, v35

    .line 1692
    .line 1693
    if-nez v24, :cond_64

    .line 1694
    .line 1695
    :cond_63
    const/4 v12, 0x0

    .line 1696
    goto :goto_3c

    .line 1697
    :cond_64
    invoke-static {v9, v14, v12, v13}, Lf92;->c(Lei3;Leo2;J)J

    .line 1698
    .line 1699
    .line 1700
    move-result-wide v12

    .line 1701
    cmp-long v12, v12, v33

    .line 1702
    .line 1703
    if-ltz v12, :cond_63

    .line 1704
    .line 1705
    const/4 v12, 0x1

    .line 1706
    :goto_3c
    packed-switch v11, :pswitch_data_2

    .line 1707
    .line 1708
    .line 1709
    new-instance v12, Landroidx/media3/session/LegacyConversions$ConversionException;

    .line 1710
    .line 1711
    new-instance v13, Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroidx/media3/session/LegacyConversions$ConversionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1712
    .line 1713
    move-object/from16 v24, v1

    .line 1714
    .line 1715
    :try_start_1
    const-string v1, "Invalid state of PlaybackStateCompat: "

    .line 1716
    .line 1717
    invoke-direct {v13, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1718
    .line 1719
    .line 1720
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v1

    .line 1727
    invoke-direct {v12, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1728
    .line 1729
    .line 1730
    throw v12
    :try_end_1
    .catch Landroidx/media3/session/LegacyConversions$ConversionException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1731
    :pswitch_5
    move-object/from16 v24, v1

    .line 1732
    .line 1733
    const/4 v1, 0x2

    .line 1734
    goto :goto_3e

    .line 1735
    :pswitch_6
    move-object/from16 v24, v1

    .line 1736
    .line 1737
    :cond_65
    const/4 v1, 0x3

    .line 1738
    goto :goto_3e

    .line 1739
    :pswitch_7
    move-object/from16 v24, v1

    .line 1740
    .line 1741
    if-eqz v12, :cond_65

    .line 1742
    .line 1743
    :goto_3d
    const/4 v1, 0x4

    .line 1744
    goto :goto_3e

    .line 1745
    :pswitch_8
    move-object/from16 v24, v1

    .line 1746
    .line 1747
    if-eqz v12, :cond_61

    .line 1748
    .line 1749
    goto :goto_3d

    .line 1750
    :goto_3e
    move/from16 v64, v1

    .line 1751
    .line 1752
    goto :goto_3f

    .line 1753
    :catch_0
    move-object/from16 v24, v1

    .line 1754
    .line 1755
    :catch_1
    iget v1, v9, Lei3;->n:I

    .line 1756
    .line 1757
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1758
    .line 1759
    const-string v12, "Received invalid playback state "

    .line 1760
    .line 1761
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1765
    .line 1766
    .line 1767
    const-string v1, " from package "

    .line 1768
    .line 1769
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1770
    .line 1771
    .line 1772
    move-object/from16 v1, v22

    .line 1773
    .line 1774
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1775
    .line 1776
    .line 1777
    const-string v1, ". Keeping the previous state."

    .line 1778
    .line 1779
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1780
    .line 1781
    .line 1782
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v1

    .line 1786
    move-object/from16 v11, v29

    .line 1787
    .line 1788
    invoke-static {v11, v1}, Ll93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 1789
    .line 1790
    .line 1791
    iget-object v1, v3, Lml3;->a:Ljava/lang/Object;

    .line 1792
    .line 1793
    check-cast v1, Llk3;

    .line 1794
    .line 1795
    iget v1, v1, Llk3;->A:I

    .line 1796
    .line 1797
    goto :goto_3e

    .line 1798
    :goto_3f
    if-nez v9, :cond_67

    .line 1799
    .line 1800
    :cond_66
    const/16 v65, 0x0

    .line 1801
    .line 1802
    goto :goto_40

    .line 1803
    :cond_67
    iget v1, v9, Lei3;->n:I

    .line 1804
    .line 1805
    const/4 v11, 0x3

    .line 1806
    if-ne v1, v11, :cond_66

    .line 1807
    .line 1808
    const/16 v65, 0x1

    .line 1809
    .line 1810
    :goto_40
    if-nez v10, :cond_68

    .line 1811
    .line 1812
    sget-object v1, Lhp0;->e:Lhp0;

    .line 1813
    .line 1814
    :goto_41
    move-object/from16 v58, v1

    .line 1815
    .line 1816
    goto :goto_45

    .line 1817
    :cond_68
    new-instance v1, Lx20;

    .line 1818
    .line 1819
    iget v11, v10, Lfg4;->b:I

    .line 1820
    .line 1821
    const/4 v12, 0x2

    .line 1822
    if-ne v11, v12, :cond_69

    .line 1823
    .line 1824
    const/4 v11, 0x1

    .line 1825
    goto :goto_42

    .line 1826
    :cond_69
    const/4 v11, 0x0

    .line 1827
    :goto_42
    invoke-direct {v1, v11}, Lx20;-><init>(I)V

    .line 1828
    .line 1829
    .line 1830
    iget v12, v10, Lfg4;->d:I

    .line 1831
    .line 1832
    iput v12, v1, Lx20;->c:I

    .line 1833
    .line 1834
    iget-object v12, v10, Lfg4;->g:Ljava/lang/Object;

    .line 1835
    .line 1836
    check-cast v12, Ljava/lang/String;

    .line 1837
    .line 1838
    if-nez v11, :cond_6b

    .line 1839
    .line 1840
    if-nez v12, :cond_6a

    .line 1841
    .line 1842
    goto :goto_43

    .line 1843
    :cond_6a
    const/4 v11, 0x0

    .line 1844
    goto :goto_44

    .line 1845
    :cond_6b
    :goto_43
    const/4 v11, 0x1

    .line 1846
    :goto_44
    invoke-static {v11}, Lrr2;->l(Z)V

    .line 1847
    .line 1848
    .line 1849
    iput-object v12, v1, Lx20;->d:Ljava/lang/Object;

    .line 1850
    .line 1851
    invoke-virtual {v1}, Lx20;->b()Lhp0;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v1

    .line 1855
    goto :goto_41

    .line 1856
    :goto_45
    if-nez v10, :cond_6c

    .line 1857
    .line 1858
    const/16 v59, 0x0

    .line 1859
    .line 1860
    goto :goto_46

    .line 1861
    :cond_6c
    iget v1, v10, Lfg4;->e:I

    .line 1862
    .line 1863
    move/from16 v59, v1

    .line 1864
    .line 1865
    :goto_46
    if-nez v10, :cond_6e

    .line 1866
    .line 1867
    :cond_6d
    const/16 v60, 0x0

    .line 1868
    .line 1869
    goto :goto_47

    .line 1870
    :cond_6e
    iget v1, v10, Lfg4;->e:I

    .line 1871
    .line 1872
    if-nez v1, :cond_6d

    .line 1873
    .line 1874
    const/16 v60, 0x1

    .line 1875
    .line 1876
    :goto_47
    iget-object v1, v3, Lml3;->a:Ljava/lang/Object;

    .line 1877
    .line 1878
    check-cast v1, Llk3;

    .line 1879
    .line 1880
    iget-wide v10, v1, Llk3;->C:J

    .line 1881
    .line 1882
    iget-wide v12, v1, Llk3;->D:J

    .line 1883
    .line 1884
    move-wide/from16 v68, v10

    .line 1885
    .line 1886
    iget-wide v10, v1, Llk3;->E:J

    .line 1887
    .line 1888
    iget-object v1, v2, Lhm2;->h:Ljava/lang/Object;

    .line 1889
    .line 1890
    check-cast v1, Landroid/os/Bundle;

    .line 1891
    .line 1892
    invoke-virtual {v4}, Lxs3;->o()I

    .line 1893
    .line 1894
    .line 1895
    move-result v3

    .line 1896
    move-object/from16 v22, v1

    .line 1897
    .line 1898
    move/from16 v1, v28

    .line 1899
    .line 1900
    if-lt v1, v3, :cond_6f

    .line 1901
    .line 1902
    const/4 v3, 0x0

    .line 1903
    goto :goto_48

    .line 1904
    :cond_6f
    invoke-virtual {v4, v1}, Lxs3;->s(I)Lws3;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v3

    .line 1908
    iget-object v3, v3, Lws3;->a:Lgn2;

    .line 1909
    .line 1910
    :goto_48
    invoke-static {v1, v3, v5, v6, v7}, Lim2;->Z0(ILgn2;JZ)Lpi3;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v34

    .line 1914
    new-instance v33, Lza4;

    .line 1915
    .line 1916
    move-wide/from16 v38, v37

    .line 1917
    .line 1918
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1919
    .line 1920
    .line 1921
    move-result-wide v36

    .line 1922
    const-wide v45, -0x7fffffffffffffffL    # -4.9E-324

    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    move-wide/from16 v47, v38

    .line 1928
    .line 1929
    move-wide/from16 v49, v40

    .line 1930
    .line 1931
    move/from16 v35, v7

    .line 1932
    .line 1933
    invoke-direct/range {v33 .. v50}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 1934
    .line 1935
    .line 1936
    new-instance v39, Llk3;

    .line 1937
    .line 1938
    sget-object v43, Lza4;->k:Lpi3;

    .line 1939
    .line 1940
    sget-object v49, Ls55;->d:Ls55;

    .line 1941
    .line 1942
    sget-object v57, Ljg0;->d:Ljg0;

    .line 1943
    .line 1944
    sget-object v74, Ljw4;->b:Ljw4;

    .line 1945
    .line 1946
    sget-object v75, Lcw4;->J:Lcw4;

    .line 1947
    .line 1948
    const/16 v41, 0x0

    .line 1949
    .line 1950
    const/16 v45, 0x0

    .line 1951
    .line 1952
    const/16 v51, 0x0

    .line 1953
    .line 1954
    const/high16 v53, 0x3f800000    # 1.0f

    .line 1955
    .line 1956
    const/high16 v54, 0x3f800000    # 1.0f

    .line 1957
    .line 1958
    const/16 v56, 0x0

    .line 1959
    .line 1960
    const/16 v62, 0x1

    .line 1961
    .line 1962
    const/16 v63, 0x0

    .line 1963
    .line 1964
    const/16 v66, 0x0

    .line 1965
    .line 1966
    move-object/from16 v44, v43

    .line 1967
    .line 1968
    move-object/from16 v50, v4

    .line 1969
    .line 1970
    move-object/from16 v46, v8

    .line 1971
    .line 1972
    move-wide/from16 v72, v10

    .line 1973
    .line 1974
    move-wide/from16 v70, v12

    .line 1975
    .line 1976
    move/from16 v47, v18

    .line 1977
    .line 1978
    move/from16 v48, v19

    .line 1979
    .line 1980
    move-object/from16 v40, v23

    .line 1981
    .line 1982
    move-object/from16 v42, v33

    .line 1983
    .line 1984
    invoke-direct/range {v39 .. v75}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 1985
    .line 1986
    .line 1987
    move/from16 v1, v47

    .line 1988
    .line 1989
    new-instance v3, Lml3;

    .line 1990
    .line 1991
    move-object/from16 v41, v15

    .line 1992
    .line 1993
    move-object/from16 v43, v20

    .line 1994
    .line 1995
    move-object/from16 v45, v21

    .line 1996
    .line 1997
    move-object/from16 v44, v22

    .line 1998
    .line 1999
    move-object/from16 v42, v24

    .line 2000
    .line 2001
    move-object/from16 v40, v39

    .line 2002
    .line 2003
    move-object/from16 v39, v3

    .line 2004
    .line 2005
    invoke-direct/range {v39 .. v45}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 2006
    .line 2007
    .line 2008
    move-object/from16 v39, v40

    .line 2009
    .line 2010
    iget-object v5, v0, Lim2;->m:Lhm2;

    .line 2011
    .line 2012
    iget-object v6, v0, Lim2;->p:Lml3;

    .line 2013
    .line 2014
    invoke-virtual {v0}, Lim2;->a1()Lsk2;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v7

    .line 2018
    iget-wide v7, v7, Lsk2;->g:J

    .line 2019
    .line 2020
    const/16 v77, 0x3

    .line 2021
    .line 2022
    invoke-static/range {v77 .. v77}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v10

    .line 2026
    const/16 v17, 0x0

    .line 2027
    .line 2028
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v11

    .line 2032
    iget-object v12, v6, Lml3;->a:Ljava/lang/Object;

    .line 2033
    .line 2034
    check-cast v12, Llk3;

    .line 2035
    .line 2036
    iget-object v12, v12, Llk3;->j:Lcu4;

    .line 2037
    .line 2038
    invoke-virtual {v12}, Lcu4;->p()Z

    .line 2039
    .line 2040
    .line 2041
    move-result v12

    .line 2042
    invoke-virtual {v4}, Lcu4;->p()Z

    .line 2043
    .line 2044
    .line 2045
    move-result v13

    .line 2046
    if-eqz v12, :cond_70

    .line 2047
    .line 2048
    if-eqz v13, :cond_70

    .line 2049
    .line 2050
    const/4 v6, 0x0

    .line 2051
    const/4 v10, 0x0

    .line 2052
    :goto_49
    const/16 v16, 0x1

    .line 2053
    .line 2054
    goto/16 :goto_4f

    .line 2055
    .line 2056
    :cond_70
    if-eqz v12, :cond_71

    .line 2057
    .line 2058
    if-nez v13, :cond_71

    .line 2059
    .line 2060
    move-object v6, v11

    .line 2061
    goto :goto_49

    .line 2062
    :cond_71
    iget-object v6, v6, Lml3;->a:Ljava/lang/Object;

    .line 2063
    .line 2064
    check-cast v6, Llk3;

    .line 2065
    .line 2066
    invoke-virtual {v6}, Llk3;->s()Lgn2;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v6

    .line 2070
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2071
    .line 2072
    .line 2073
    iget-object v12, v4, Lxs3;->f:Lws3;

    .line 2074
    .line 2075
    if-eqz v12, :cond_72

    .line 2076
    .line 2077
    iget-object v12, v12, Lws3;->a:Lgn2;

    .line 2078
    .line 2079
    invoke-virtual {v6, v12}, Lgn2;->equals(Ljava/lang/Object;)Z

    .line 2080
    .line 2081
    .line 2082
    move-result v12

    .line 2083
    if-eqz v12, :cond_72

    .line 2084
    .line 2085
    goto :goto_4b

    .line 2086
    :cond_72
    const/4 v12, 0x0

    .line 2087
    :goto_4a
    iget-object v13, v4, Lxs3;->e:Lyw1;

    .line 2088
    .line 2089
    invoke-virtual {v13}, Ljava/util/AbstractCollection;->size()I

    .line 2090
    .line 2091
    .line 2092
    move-result v15

    .line 2093
    if-ge v12, v15, :cond_74

    .line 2094
    .line 2095
    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v13

    .line 2099
    check-cast v13, Lws3;

    .line 2100
    .line 2101
    iget-object v13, v13, Lws3;->a:Lgn2;

    .line 2102
    .line 2103
    invoke-virtual {v6, v13}, Lgn2;->equals(Ljava/lang/Object;)Z

    .line 2104
    .line 2105
    .line 2106
    move-result v13

    .line 2107
    if-eqz v13, :cond_73

    .line 2108
    .line 2109
    :goto_4b
    const/4 v4, 0x1

    .line 2110
    goto :goto_4c

    .line 2111
    :cond_73
    add-int/lit8 v12, v12, 0x1

    .line 2112
    .line 2113
    goto :goto_4a

    .line 2114
    :cond_74
    const/4 v4, 0x0

    .line 2115
    :goto_4c
    if-nez v4, :cond_75

    .line 2116
    .line 2117
    const/16 v26, 0x4

    .line 2118
    .line 2119
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v6

    .line 2123
    goto :goto_49

    .line 2124
    :cond_75
    invoke-virtual/range {v39 .. v39}, Llk3;->s()Lgn2;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v4

    .line 2128
    invoke-virtual {v6, v4}, Lgn2;->equals(Ljava/lang/Object;)Z

    .line 2129
    .line 2130
    .line 2131
    move-result v4

    .line 2132
    if-eqz v4, :cond_78

    .line 2133
    .line 2134
    iget-object v4, v5, Lhm2;->e:Ljava/lang/Object;

    .line 2135
    .line 2136
    check-cast v4, Lei3;

    .line 2137
    .line 2138
    iget-object v5, v5, Lhm2;->f:Ljava/lang/Object;

    .line 2139
    .line 2140
    check-cast v5, Leo2;

    .line 2141
    .line 2142
    invoke-static {v4, v5, v7, v8}, Lf92;->c(Lei3;Leo2;J)J

    .line 2143
    .line 2144
    .line 2145
    move-result-wide v4

    .line 2146
    invoke-static {v9, v14, v7, v8}, Lf92;->c(Lei3;Leo2;J)J

    .line 2147
    .line 2148
    .line 2149
    move-result-wide v6

    .line 2150
    cmp-long v8, v6, v31

    .line 2151
    .line 2152
    if-nez v8, :cond_76

    .line 2153
    .line 2154
    const/4 v8, 0x1

    .line 2155
    if-ne v1, v8, :cond_76

    .line 2156
    .line 2157
    move-object v6, v11

    .line 2158
    move-object/from16 v27, v6

    .line 2159
    .line 2160
    goto :goto_4e

    .line 2161
    :cond_76
    sub-long/2addr v4, v6

    .line 2162
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 2163
    .line 2164
    .line 2165
    move-result-wide v4

    .line 2166
    const-wide/16 v6, 0x64

    .line 2167
    .line 2168
    cmp-long v1, v4, v6

    .line 2169
    .line 2170
    if-lez v1, :cond_77

    .line 2171
    .line 2172
    invoke-static/range {v76 .. v76}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v1

    .line 2176
    move-object v6, v1

    .line 2177
    :goto_4d
    const/16 v27, 0x0

    .line 2178
    .line 2179
    goto :goto_4e

    .line 2180
    :cond_77
    const/4 v6, 0x0

    .line 2181
    goto :goto_4d

    .line 2182
    :goto_4e
    move-object/from16 v10, v27

    .line 2183
    .line 2184
    goto/16 :goto_49

    .line 2185
    .line 2186
    :cond_78
    const/16 v16, 0x1

    .line 2187
    .line 2188
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v6

    .line 2192
    move-object v10, v6

    .line 2193
    move-object v6, v11

    .line 2194
    :goto_4f
    invoke-static {v6, v10}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v1

    .line 2198
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2199
    .line 2200
    move-object v5, v4

    .line 2201
    check-cast v5, Ljava/lang/Integer;

    .line 2202
    .line 2203
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2204
    .line 2205
    move-object v6, v1

    .line 2206
    check-cast v6, Ljava/lang/Integer;

    .line 2207
    .line 2208
    move-object v4, v3

    .line 2209
    const/4 v3, 0x1

    .line 2210
    move/from16 v1, p1

    .line 2211
    .line 2212
    invoke-virtual/range {v0 .. v6}, Lim2;->g1(ZLhm2;ZLml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 2213
    .line 2214
    .line 2215
    iget-boolean v1, v0, Lim2;->o:Z

    .line 2216
    .line 2217
    if-eqz v1, :cond_7a

    .line 2218
    .line 2219
    const/4 v5, 0x0

    .line 2220
    iput-boolean v5, v0, Lim2;->o:Z

    .line 2221
    .line 2222
    invoke-virtual {v0}, Lim2;->a1()Lsk2;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v0

    .line 2226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2227
    .line 2228
    .line 2229
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v1

    .line 2233
    iget-object v2, v0, Lsk2;->f:Landroid/os/Handler;

    .line 2234
    .line 2235
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v2

    .line 2239
    if-ne v1, v2, :cond_79

    .line 2240
    .line 2241
    move/from16 v8, v16

    .line 2242
    .line 2243
    goto :goto_50

    .line 2244
    :cond_79
    move v8, v5

    .line 2245
    :goto_50
    invoke-static {v8}, Lrr2;->w(Z)V

    .line 2246
    .line 2247
    .line 2248
    iget-object v0, v0, Lsk2;->e:Lqk2;

    .line 2249
    .line 2250
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2251
    .line 2252
    .line 2253
    :cond_7a
    :goto_51
    return-void

    .line 2254
    nop

    .line 2255
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_4
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    :array_0
    .array-data 4
        0x17
        0x11
        0x12
        0x10
        0x15
        0x20
    .end array-data
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lim2;->V(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final c0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->skipToNext()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c1()V
    .locals 13

    .line 1
    new-instance v0, Lbu4;

    .line 2
    .line 3
    invoke-direct {v0}, Lbu4;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lim2;->d1()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lim2;->p:Lml3;

    .line 14
    .line 15
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Llk3;

    .line 18
    .line 19
    iget-object v1, v1, Llk3;->j:Lcu4;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v2

    .line 30
    :goto_0
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lim2;->p:Lml3;

    .line 34
    .line 35
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Llk3;

    .line 38
    .line 39
    iget-object v3, v1, Llk3;->j:Lcu4;

    .line 40
    .line 41
    check-cast v3, Lxs3;

    .line 42
    .line 43
    iget-object v1, v1, Llk3;->c:Lza4;

    .line 44
    .line 45
    iget-object v1, v1, Lza4;->a:Lpi3;

    .line 46
    .line 47
    iget v1, v1, Lpi3;->b:I

    .line 48
    .line 49
    const-wide/16 v4, 0x0

    .line 50
    .line 51
    invoke-virtual {v3, v1, v0, v4, v5}, Lxs3;->m(ILbu4;J)Lbu4;

    .line 52
    .line 53
    .line 54
    iget-object v6, v0, Lbu4;->b:Lgn2;

    .line 55
    .line 56
    invoke-virtual {v3, v1}, Lxs3;->r(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide v7

    .line 60
    const-wide/16 v9, -0x1

    .line 61
    .line 62
    cmp-long v7, v7, v9

    .line 63
    .line 64
    if-eqz v7, :cond_2

    .line 65
    .line 66
    iget-object v6, p0, Lim2;->p:Lml3;

    .line 67
    .line 68
    iget-object v6, v6, Lml3;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v6, Llk3;

    .line 71
    .line 72
    iget-boolean v6, v6, Llk3;->v:Z

    .line 73
    .line 74
    iget-object v7, p0, Lim2;->i:Lwo0;

    .line 75
    .line 76
    if-eqz v6, :cond_1

    .line 77
    .line 78
    invoke-virtual {v7}, Lwo0;->A()Lpz1;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    iget-object v6, v6, Lpz1;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v6, Landroid/media/session/MediaController$TransportControls;

    .line 85
    .line 86
    invoke-virtual {v6}, Landroid/media/session/MediaController$TransportControls;->play()V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :cond_1
    invoke-virtual {v7}, Lwo0;->A()Lpz1;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    iget-object v6, v6, Lpz1;->o:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v6, Landroid/media/session/MediaController$TransportControls;

    .line 98
    .line 99
    invoke-virtual {v6}, Landroid/media/session/MediaController$TransportControls;->prepare()V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_1

    .line 103
    .line 104
    :cond_2
    iget-object v7, v6, Lgn2;->f:Lcn2;

    .line 105
    .line 106
    iget-object v6, v6, Lgn2;->a:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v8, v7, Lcn2;->a:Landroid/net/Uri;

    .line 109
    .line 110
    if-eqz v8, :cond_6

    .line 111
    .line 112
    iget-object v6, p0, Lim2;->p:Lml3;

    .line 113
    .line 114
    iget-object v6, v6, Lml3;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v6, Llk3;

    .line 117
    .line 118
    iget-boolean v6, v6, Llk3;->v:Z

    .line 119
    .line 120
    iget-object v8, p0, Lim2;->i:Lwo0;

    .line 121
    .line 122
    if-eqz v6, :cond_4

    .line 123
    .line 124
    invoke-virtual {v8}, Lwo0;->A()Lpz1;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    iget-object v8, v7, Lcn2;->a:Landroid/net/Uri;

    .line 129
    .line 130
    iget-object v7, v7, Lcn2;->c:Landroid/os/Bundle;

    .line 131
    .line 132
    if-nez v7, :cond_3

    .line 133
    .line 134
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 135
    .line 136
    :cond_3
    iget-object v6, v6, Lpz1;->o:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v6, Landroid/media/session/MediaController$TransportControls;

    .line 139
    .line 140
    invoke-virtual {v6, v8, v7}, Landroid/media/session/MediaController$TransportControls;->playFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_1

    .line 144
    .line 145
    :cond_4
    invoke-virtual {v8}, Lwo0;->A()Lpz1;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    iget-object v8, v7, Lcn2;->a:Landroid/net/Uri;

    .line 150
    .line 151
    iget-object v7, v7, Lcn2;->c:Landroid/os/Bundle;

    .line 152
    .line 153
    if-nez v7, :cond_5

    .line 154
    .line 155
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 156
    .line 157
    :cond_5
    iget-object v6, v6, Lpz1;->o:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v6, Landroid/media/session/MediaController$TransportControls;

    .line 160
    .line 161
    invoke-virtual {v6, v8, v7}, Landroid/media/session/MediaController$TransportControls;->prepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_6
    iget-object v8, v7, Lcn2;->b:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v11, p0, Lim2;->p:Lml3;

    .line 168
    .line 169
    if-eqz v8, :cond_a

    .line 170
    .line 171
    iget-object v6, v11, Lml3;->a:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v6, Llk3;

    .line 174
    .line 175
    iget-boolean v6, v6, Llk3;->v:Z

    .line 176
    .line 177
    iget-object v8, p0, Lim2;->i:Lwo0;

    .line 178
    .line 179
    if-eqz v6, :cond_8

    .line 180
    .line 181
    invoke-virtual {v8}, Lwo0;->A()Lpz1;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    iget-object v8, v7, Lcn2;->b:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v7, v7, Lcn2;->c:Landroid/os/Bundle;

    .line 188
    .line 189
    if-nez v7, :cond_7

    .line 190
    .line 191
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 192
    .line 193
    :cond_7
    iget-object v6, v6, Lpz1;->o:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v6, Landroid/media/session/MediaController$TransportControls;

    .line 196
    .line 197
    invoke-virtual {v6, v8, v7}, Landroid/media/session/MediaController$TransportControls;->playFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_8
    invoke-virtual {v8}, Lwo0;->A()Lpz1;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    iget-object v8, v7, Lcn2;->b:Ljava/lang/String;

    .line 206
    .line 207
    iget-object v7, v7, Lcn2;->c:Landroid/os/Bundle;

    .line 208
    .line 209
    if-nez v7, :cond_9

    .line 210
    .line 211
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 212
    .line 213
    :cond_9
    iget-object v6, v6, Lpz1;->o:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v6, Landroid/media/session/MediaController$TransportControls;

    .line 216
    .line 217
    invoke-virtual {v6, v8, v7}, Landroid/media/session/MediaController$TransportControls;->prepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_a
    iget-object v8, v11, Lml3;->a:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v8, Llk3;

    .line 224
    .line 225
    iget-boolean v8, v8, Llk3;->v:Z

    .line 226
    .line 227
    iget-object v11, p0, Lim2;->i:Lwo0;

    .line 228
    .line 229
    if-eqz v8, :cond_c

    .line 230
    .line 231
    invoke-virtual {v11}, Lwo0;->A()Lpz1;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    iget-object v7, v7, Lcn2;->c:Landroid/os/Bundle;

    .line 236
    .line 237
    if-nez v7, :cond_b

    .line 238
    .line 239
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 240
    .line 241
    :cond_b
    iget-object v8, v8, Lpz1;->o:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v8, Landroid/media/session/MediaController$TransportControls;

    .line 244
    .line 245
    invoke-virtual {v8, v6, v7}, Landroid/media/session/MediaController$TransportControls;->playFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 246
    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_c
    invoke-virtual {v11}, Lwo0;->A()Lpz1;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    iget-object v7, v7, Lcn2;->c:Landroid/os/Bundle;

    .line 254
    .line 255
    if-nez v7, :cond_d

    .line 256
    .line 257
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 258
    .line 259
    :cond_d
    iget-object v8, v8, Lpz1;->o:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v8, Landroid/media/session/MediaController$TransportControls;

    .line 262
    .line 263
    invoke-virtual {v8, v6, v7}, Landroid/media/session/MediaController$TransportControls;->prepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 264
    .line 265
    .line 266
    :goto_1
    iget-object v6, p0, Lim2;->p:Lml3;

    .line 267
    .line 268
    iget-object v6, v6, Lml3;->a:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v6, Llk3;

    .line 271
    .line 272
    iget-object v6, v6, Llk3;->c:Lza4;

    .line 273
    .line 274
    iget-object v6, v6, Lza4;->a:Lpi3;

    .line 275
    .line 276
    iget-wide v6, v6, Lpi3;->f:J

    .line 277
    .line 278
    cmp-long v6, v6, v4

    .line 279
    .line 280
    if-eqz v6, :cond_e

    .line 281
    .line 282
    iget-object v6, p0, Lim2;->i:Lwo0;

    .line 283
    .line 284
    invoke-virtual {v6}, Lwo0;->A()Lpz1;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    iget-object v7, p0, Lim2;->p:Lml3;

    .line 289
    .line 290
    iget-object v7, v7, Lml3;->a:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v7, Llk3;

    .line 293
    .line 294
    iget-object v7, v7, Llk3;->c:Lza4;

    .line 295
    .line 296
    iget-object v7, v7, Lza4;->a:Lpi3;

    .line 297
    .line 298
    iget-wide v7, v7, Lpi3;->f:J

    .line 299
    .line 300
    iget-object v6, v6, Lpz1;->o:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v6, Landroid/media/session/MediaController$TransportControls;

    .line 303
    .line 304
    invoke-virtual {v6, v7, v8}, Landroid/media/session/MediaController$TransportControls;->seekTo(J)V

    .line 305
    .line 306
    .line 307
    :cond_e
    iget-object v6, p0, Lim2;->p:Lml3;

    .line 308
    .line 309
    iget-object v6, v6, Lml3;->c:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v6, Lmi3;

    .line 312
    .line 313
    const/16 v7, 0x14

    .line 314
    .line 315
    invoke-virtual {v6, v7}, Lmi3;->a(I)Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-eqz v6, :cond_12

    .line 320
    .line 321
    new-instance v6, Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 324
    .line 325
    .line 326
    move v7, v2

    .line 327
    :goto_2
    invoke-virtual {v3}, Lxs3;->o()I

    .line 328
    .line 329
    .line 330
    move-result v8

    .line 331
    if-ge v7, v8, :cond_11

    .line 332
    .line 333
    if-eq v7, v1, :cond_10

    .line 334
    .line 335
    invoke-virtual {v3, v7}, Lxs3;->r(I)J

    .line 336
    .line 337
    .line 338
    move-result-wide v11

    .line 339
    cmp-long v8, v11, v9

    .line 340
    .line 341
    if-eqz v8, :cond_f

    .line 342
    .line 343
    goto :goto_3

    .line 344
    :cond_f
    invoke-virtual {v3, v7, v0, v4, v5}, Lxs3;->m(ILbu4;J)Lbu4;

    .line 345
    .line 346
    .line 347
    iget-object v8, v0, Lbu4;->b:Lgn2;

    .line 348
    .line 349
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    :cond_10
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 353
    .line 354
    goto :goto_2

    .line 355
    :cond_11
    invoke-virtual {p0, v6, v2}, Lim2;->W0(Ljava/util/List;I)V

    .line 356
    .line 357
    .line 358
    :cond_12
    return-void
.end method

.method public final d(Lqh3;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lim2;->i()Lqh3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lqh3;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lml3;

    .line 12
    .line 13
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 14
    .line 15
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Llk3;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Llk3;->e(Lqh3;)Llk3;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 24
    .line 25
    iget-object v3, v0, Lml3;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lwa4;

    .line 28
    .line 29
    iget-object v4, v0, Lml3;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Lmi3;

    .line 32
    .line 33
    iget-object v5, v0, Lml3;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Lyw1;

    .line 36
    .line 37
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v6, v0

    .line 40
    check-cast v6, Landroid/os/Bundle;

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    invoke-direct/range {v1 .. v7}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p0, v1, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 51
    .line 52
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget p1, p1, Lqh3;->a:F

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lpz1;->J(F)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final d0(I)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lim2;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lim2;->F()Lhp0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lhp0;->b:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lim2;->y0()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    new-instance v2, Lml3;

    .line 20
    .line 21
    iget-object v3, p0, Lim2;->p:Lml3;

    .line 22
    .line 23
    iget-object v3, v3, Lml3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Llk3;

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Llk3;->c(IZ)Llk3;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 32
    .line 33
    iget-object v1, v0, Lml3;->b:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v4, v1

    .line 36
    check-cast v4, Lwa4;

    .line 37
    .line 38
    iget-object v1, v0, Lml3;->c:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v5, v1

    .line 41
    check-cast v5, Lmi3;

    .line 42
    .line 43
    iget-object v1, v0, Lml3;->d:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v6, v1

    .line 46
    check-cast v6, Lyw1;

    .line 47
    .line 48
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v7, v0

    .line 51
    check-cast v7, Landroid/os/Bundle;

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    invoke-direct/range {v2 .. v8}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p0, v2, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 62
    .line 63
    iget-object p0, p0, Lwo0;->n:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lxk2;

    .line 66
    .line 67
    iget-object p0, p0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 68
    .line 69
    const/4 v0, -0x1

    .line 70
    invoke-virtual {p0, v0, p1}, Landroid/media/session/MediaController;->adjustVolume(II)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final d1()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget p0, p0, Llk3;->A:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final e(F)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lim2;->i()Lqh3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lqh3;->a:F

    .line 6
    .line 7
    cmpl-float v0, p1, v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lml3;

    .line 12
    .line 13
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 14
    .line 15
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Llk3;

    .line 18
    .line 19
    new-instance v2, Lqh3;

    .line 20
    .line 21
    invoke-direct {v2, p1}, Lqh3;-><init>(F)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Llk3;->e(Lqh3;)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 29
    .line 30
    iget-object v3, v0, Lml3;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lwa4;

    .line 33
    .line 34
    iget-object v4, v0, Lml3;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Lmi3;

    .line 37
    .line 38
    iget-object v5, v0, Lml3;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v5, Lyw1;

    .line 41
    .line 42
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v6, v0

    .line 45
    check-cast v6, Landroid/os/Bundle;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    invoke-direct/range {v1 .. v7}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-virtual {p0, v1, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 56
    .line 57
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, p1}, Lpz1;->J(F)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final e0()Ljw4;
    .locals 0

    .line 1
    sget-object p0, Ljw4;->b:Ljw4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e1()V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lim2;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    iget-boolean v0, p0, Lim2;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lim2;->l:Z

    .line 13
    .line 14
    new-instance v2, Lhm2;

    .line 15
    .line 16
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lwo0;->y()Lfg4;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lwo0;->z()Lei3;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lim2;->Y0(Lei3;)Lei3;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 33
    .line 34
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lxk2;

    .line 37
    .line 38
    iget-object v0, v0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v5, 0x0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    sget-object v6, Leo2;->q:Loi;

    .line 48
    .line 49
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    const/4 v7, 0x0

    .line 54
    invoke-virtual {v0, v6, v7}, Landroid/media/MediaMetadata;->writeToParcel(Landroid/os/Parcel;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v7}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 58
    .line 59
    .line 60
    sget-object v7, Leo2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 61
    .line 62
    invoke-interface {v7, v6}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Leo2;

    .line 67
    .line 68
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 69
    .line 70
    .line 71
    iput-object v0, v7, Leo2;->o:Landroid/media/MediaMetadata;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    move-object v7, v5

    .line 75
    :goto_0
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 76
    .line 77
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lxk2;

    .line 80
    .line 81
    iget-object v0, v0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getQueue()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-static {v0}, Lor2;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    :cond_2
    invoke-static {v5}, Lim2;->X0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 98
    .line 99
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lxk2;

    .line 102
    .line 103
    iget-object v0, v0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getQueueTitle()Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 110
    .line 111
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lxk2;

    .line 114
    .line 115
    iget-object v0, v0, Lxk2;->e:Lpr2;

    .line 116
    .line 117
    invoke-virtual {v0}, Lpr2;->a()Lqu1;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const/4 v8, -0x1

    .line 122
    const-string v9, "MediaControllerCompat"

    .line 123
    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    :try_start_0
    invoke-interface {v0}, Lqu1;->h()I

    .line 127
    .line 128
    .line 129
    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    move v10, v8

    .line 131
    move v8, v0

    .line 132
    goto :goto_2

    .line 133
    :catch_0
    move-exception v0

    .line 134
    goto :goto_1

    .line 135
    :catch_1
    move-exception v0

    .line 136
    :goto_1
    const-string v10, "Dead object in getRepeatMode."

    .line 137
    .line 138
    invoke-static {v9, v10, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    move v10, v8

    .line 142
    :goto_2
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 143
    .line 144
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Lxk2;

    .line 147
    .line 148
    iget-object v0, v0, Lxk2;->e:Lpr2;

    .line 149
    .line 150
    invoke-virtual {v0}, Lpr2;->a()Lqu1;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    :try_start_1
    invoke-interface {v0}, Lqu1;->V()I

    .line 157
    .line 158
    .line 159
    move-result v0
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_2

    .line 160
    move v9, v0

    .line 161
    goto :goto_4

    .line 162
    :catch_2
    move-exception v0

    .line 163
    goto :goto_3

    .line 164
    :catch_3
    move-exception v0

    .line 165
    :goto_3
    const-string v11, "Dead object in getShuffleMode."

    .line 166
    .line 167
    invoke-static {v9, v11, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    move v9, v10

    .line 171
    :goto_4
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 172
    .line 173
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lxk2;

    .line 176
    .line 177
    iget-object v0, v0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getExtras()Landroid/os/Bundle;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, Lf35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    move-object v12, v7

    .line 188
    move-object v7, v5

    .line 189
    move-object v5, v12

    .line 190
    invoke-direct/range {v2 .. v10}, Lhm2;-><init>(Lfg4;Lei3;Leo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v1, v2}, Lim2;->b1(ZLhm2;)V

    .line 194
    .line 195
    .line 196
    :cond_5
    :goto_5
    return-void
.end method

.method public final f()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final f0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lim2;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method public final f1(IJ)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    if-ltz v1, :cond_0

    .line 10
    .line 11
    move v6, v4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v6, v5

    .line 14
    :goto_0
    invoke-static {v6}, Lrr2;->l(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lim2;->o0()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    iget-object v7, v0, Lim2;->p:Lml3;

    .line 22
    .line 23
    iget-object v7, v7, Lml3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v7, Llk3;

    .line 26
    .line 27
    iget-object v7, v7, Llk3;->j:Lcu4;

    .line 28
    .line 29
    invoke-virtual {v7}, Lcu4;->p()Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-nez v8, :cond_1

    .line 34
    .line 35
    invoke-virtual {v7}, Lcu4;->o()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-ge v1, v8, :cond_2

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, Lim2;->k()Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_3

    .line 46
    .line 47
    :cond_2
    return-void

    .line 48
    :cond_3
    const/4 v8, 0x2

    .line 49
    if-eq v1, v6, :cond_5

    .line 50
    .line 51
    iget-object v10, v0, Lim2;->p:Lml3;

    .line 52
    .line 53
    iget-object v10, v10, Lml3;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v10, Llk3;

    .line 56
    .line 57
    iget-object v10, v10, Llk3;->j:Lcu4;

    .line 58
    .line 59
    check-cast v10, Lxs3;

    .line 60
    .line 61
    invoke-virtual {v10, v1}, Lxs3;->r(I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v10

    .line 65
    const-wide/16 v12, -0x1

    .line 66
    .line 67
    cmp-long v12, v10, v12

    .line 68
    .line 69
    if-eqz v12, :cond_4

    .line 70
    .line 71
    iget-object v6, v0, Lim2;->i:Lwo0;

    .line 72
    .line 73
    invoke-virtual {v6}, Lwo0;->A()Lpz1;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    iget-object v6, v6, Lpz1;->o:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v6, Landroid/media/session/MediaController$TransportControls;

    .line 80
    .line 81
    invoke-virtual {v6, v10, v11}, Landroid/media/session/MediaController$TransportControls;->skipToQueueItem(J)V

    .line 82
    .line 83
    .line 84
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    const-string v10, "MCImplLegacy"

    .line 90
    .line 91
    const-string v11, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex="

    .line 92
    .line 93
    invoke-static {v1, v11, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    move v1, v6

    .line 97
    const/4 v6, 0x0

    .line 98
    :goto_1
    invoke-virtual {v0}, Lim2;->M0()J

    .line 99
    .line 100
    .line 101
    move-result-wide v10

    .line 102
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    cmp-long v14, v2, v12

    .line 108
    .line 109
    if-nez v14, :cond_6

    .line 110
    .line 111
    move-wide v2, v10

    .line 112
    const/4 v14, 0x0

    .line 113
    :goto_2
    move-wide v15, v12

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    iget-object v14, v0, Lim2;->i:Lwo0;

    .line 116
    .line 117
    invoke-virtual {v14}, Lwo0;->A()Lpz1;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    iget-object v14, v14, Lpz1;->o:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Landroid/media/session/MediaController$TransportControls;

    .line 124
    .line 125
    invoke-virtual {v14, v2, v3}, Landroid/media/session/MediaController$TransportControls;->seekTo(J)V

    .line 126
    .line 127
    .line 128
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    goto :goto_2

    .line 133
    :goto_3
    const-wide/16 v12, 0x0

    .line 134
    .line 135
    if-nez v6, :cond_9

    .line 136
    .line 137
    invoke-virtual {v0}, Lim2;->b0()J

    .line 138
    .line 139
    .line 140
    move-result-wide v8

    .line 141
    invoke-virtual {v0}, Lim2;->getDuration()J

    .line 142
    .line 143
    .line 144
    move-result-wide v17

    .line 145
    cmp-long v10, v2, v10

    .line 146
    .line 147
    if-gez v10, :cond_7

    .line 148
    .line 149
    move-wide v8, v2

    .line 150
    goto :goto_4

    .line 151
    :cond_7
    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    :goto_4
    cmp-long v10, v17, v15

    .line 156
    .line 157
    if-nez v10, :cond_8

    .line 158
    .line 159
    move v10, v5

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    const-wide/16 v10, 0x64

    .line 162
    .line 163
    mul-long/2addr v10, v8

    .line 164
    div-long v10, v10, v17

    .line 165
    .line 166
    long-to-int v10, v10

    .line 167
    :goto_5
    sub-long v15, v8, v2

    .line 168
    .line 169
    move-wide/from16 v26, v8

    .line 170
    .line 171
    move/from16 v28, v10

    .line 172
    .line 173
    move-wide/from16 v29, v15

    .line 174
    .line 175
    move-wide/from16 v24, v17

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_9
    move/from16 v28, v5

    .line 179
    .line 180
    move-wide/from16 v26, v12

    .line 181
    .line 182
    move-wide/from16 v29, v26

    .line 183
    .line 184
    move-wide/from16 v24, v15

    .line 185
    .line 186
    :goto_6
    invoke-virtual {v7}, Lcu4;->p()Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-nez v8, :cond_a

    .line 191
    .line 192
    new-instance v8, Lbu4;

    .line 193
    .line 194
    invoke-direct {v8}, Lbu4;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, v1, v8, v12, v13}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    iget-object v7, v7, Lbu4;->b:Lgn2;

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_a
    const/4 v7, 0x0

    .line 205
    :goto_7
    invoke-static {v1, v7, v2, v3, v5}, Lim2;->Z0(ILgn2;JZ)Lpi3;

    .line 206
    .line 207
    .line 208
    move-result-object v20

    .line 209
    iget-object v1, v0, Lim2;->p:Lml3;

    .line 210
    .line 211
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v1, Llk3;

    .line 214
    .line 215
    new-instance v19, Lza4;

    .line 216
    .line 217
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 218
    .line 219
    .line 220
    move-result-wide v22

    .line 221
    const-wide v31, -0x7fffffffffffffffL    # -4.9E-324

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    const/16 v21, 0x0

    .line 227
    .line 228
    move-wide/from16 v33, v24

    .line 229
    .line 230
    move-wide/from16 v35, v26

    .line 231
    .line 232
    invoke-direct/range {v19 .. v36}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 233
    .line 234
    .line 235
    move-object/from16 v2, v19

    .line 236
    .line 237
    invoke-virtual {v1, v2}, Llk3;->j(Lza4;)Llk3;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    iget v2, v1, Llk3;->A:I

    .line 242
    .line 243
    if-eq v2, v4, :cond_b

    .line 244
    .line 245
    const/4 v2, 0x2

    .line 246
    const/4 v3, 0x0

    .line 247
    invoke-virtual {v1, v2, v3}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    :cond_b
    move-object v8, v1

    .line 252
    new-instance v7, Lml3;

    .line 253
    .line 254
    iget-object v1, v0, Lim2;->p:Lml3;

    .line 255
    .line 256
    iget-object v2, v1, Lml3;->b:Ljava/lang/Object;

    .line 257
    .line 258
    move-object v9, v2

    .line 259
    check-cast v9, Lwa4;

    .line 260
    .line 261
    iget-object v2, v1, Lml3;->c:Ljava/lang/Object;

    .line 262
    .line 263
    move-object v10, v2

    .line 264
    check-cast v10, Lmi3;

    .line 265
    .line 266
    iget-object v2, v1, Lml3;->d:Ljava/lang/Object;

    .line 267
    .line 268
    move-object v11, v2

    .line 269
    check-cast v11, Lyw1;

    .line 270
    .line 271
    iget-object v1, v1, Lml3;->e:Ljava/lang/Object;

    .line 272
    .line 273
    move-object v12, v1

    .line 274
    check-cast v12, Landroid/os/Bundle;

    .line 275
    .line 276
    const/4 v13, 0x0

    .line 277
    invoke-direct/range {v7 .. v13}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v7, v14, v6}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 281
    .line 282
    .line 283
    return-void
.end method

.method public final g()I
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget p0, p0, Llk3;->A:I

    .line 8
    .line 9
    return p0
.end method

.method public final g0()Ldo2;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->m:Ldo2;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g1(ZLhm2;ZLml3;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    iget-object v5, v2, Lml3;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v5, Lyw1;

    .line 14
    .line 15
    iget-object v6, v0, Lim2;->m:Lhm2;

    .line 16
    .line 17
    iget-object v7, v0, Lim2;->p:Lml3;

    .line 18
    .line 19
    if-eq v6, v1, :cond_0

    .line 20
    .line 21
    new-instance v8, Lhm2;

    .line 22
    .line 23
    invoke-direct {v8, v1}, Lhm2;-><init>(Lhm2;)V

    .line 24
    .line 25
    .line 26
    iput-object v8, v0, Lim2;->m:Lhm2;

    .line 27
    .line 28
    :cond_0
    if-eqz p3, :cond_1

    .line 29
    .line 30
    iget-object v8, v0, Lim2;->m:Lhm2;

    .line 31
    .line 32
    iput-object v8, v0, Lim2;->n:Lhm2;

    .line 33
    .line 34
    :cond_1
    iput-object v2, v0, Lim2;->p:Lml3;

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, Lim2;->a1()Lsk2;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lsk2;->X0()V

    .line 43
    .line 44
    .line 45
    iget-object v1, v7, Lml3;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lyw1;

    .line 48
    .line 49
    invoke-virtual {v1, v5}, Lyw1;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Lim2;->a1()Lsk2;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v1, v1, Lsk2;->f:Landroid/os/Handler;

    .line 60
    .line 61
    new-instance v3, Ldm2;

    .line 62
    .line 63
    invoke-direct {v3, v0, v2}, Ldm2;-><init>(Lim2;Lml3;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void

    .line 70
    :cond_3
    iget-object v8, v7, Lml3;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v8, Llk3;

    .line 73
    .line 74
    iget-object v9, v8, Llk3;->j:Lcu4;

    .line 75
    .line 76
    iget-object v10, v2, Lml3;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v10, Llk3;

    .line 79
    .line 80
    iget-object v11, v2, Lml3;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v11, Lxa4;

    .line 83
    .line 84
    iget-object v12, v10, Llk3;->j:Lcu4;

    .line 85
    .line 86
    invoke-virtual {v9, v12}, Lcu4;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    const/4 v12, 0x4

    .line 91
    const/4 v13, 0x0

    .line 92
    iget-object v14, v0, Lim2;->d:Ltc2;

    .line 93
    .line 94
    if-nez v9, :cond_4

    .line 95
    .line 96
    new-instance v9, Lcm2;

    .line 97
    .line 98
    invoke-direct {v9, v2, v12}, Lcm2;-><init>(Lml3;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v14, v13, v9}, Ltc2;->c(ILqc2;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    iget-object v9, v6, Lhm2;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v9, Ljava/lang/CharSequence;

    .line 107
    .line 108
    iget-object v15, v1, Lhm2;->g:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v15, Ljava/lang/CharSequence;

    .line 111
    .line 112
    iget-object v13, v1, Lhm2;->e:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v13, Lei3;

    .line 115
    .line 116
    invoke-static {v9, v15}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    const/4 v15, 0x5

    .line 121
    if-nez v9, :cond_5

    .line 122
    .line 123
    new-instance v9, Lcm2;

    .line 124
    .line 125
    invoke-direct {v9, v2, v15}, Lcm2;-><init>(Lml3;I)V

    .line 126
    .line 127
    .line 128
    const/16 v12, 0xf

    .line 129
    .line 130
    invoke-virtual {v14, v12, v9}, Ltc2;->c(ILqc2;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    const/16 v9, 0xb

    .line 134
    .line 135
    if-eqz v3, :cond_6

    .line 136
    .line 137
    new-instance v12, Leg0;

    .line 138
    .line 139
    invoke-direct {v12, v7, v2, v3, v15}, Leg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v14, v9, v12}, Ltc2;->c(ILqc2;)V

    .line 143
    .line 144
    .line 145
    :cond_6
    const/4 v3, 0x1

    .line 146
    if-eqz v4, :cond_7

    .line 147
    .line 148
    new-instance v12, Lef0;

    .line 149
    .line 150
    const/16 v9, 0x11

    .line 151
    .line 152
    invoke-direct {v12, v9, v2, v4}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v14, v3, v12}, Ltc2;->c(ILqc2;)V

    .line 156
    .line 157
    .line 158
    :cond_7
    iget-object v4, v6, Lhm2;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v4, Lei3;

    .line 161
    .line 162
    sget-object v9, Lju2;->a:Lhd5;

    .line 163
    .line 164
    const/4 v9, 0x7

    .line 165
    if-eqz v4, :cond_8

    .line 166
    .line 167
    iget v12, v4, Lei3;->n:I

    .line 168
    .line 169
    if-ne v12, v9, :cond_8

    .line 170
    .line 171
    move v12, v3

    .line 172
    goto :goto_0

    .line 173
    :cond_8
    const/4 v12, 0x0

    .line 174
    :goto_0
    if-eqz v13, :cond_9

    .line 175
    .line 176
    iget v3, v13, Lei3;->n:I

    .line 177
    .line 178
    if-ne v3, v9, :cond_9

    .line 179
    .line 180
    const/4 v3, 0x1

    .line 181
    goto :goto_1

    .line 182
    :cond_9
    const/4 v3, 0x0

    .line 183
    :goto_1
    const/4 v15, 0x3

    .line 184
    const/16 v9, 0xa

    .line 185
    .line 186
    if-eqz v12, :cond_a

    .line 187
    .line 188
    if-eqz v3, :cond_a

    .line 189
    .line 190
    sget-object v3, Lf35;->a:Ljava/lang/String;

    .line 191
    .line 192
    iget v3, v4, Lei3;->s:I

    .line 193
    .line 194
    iget v12, v13, Lei3;->s:I

    .line 195
    .line 196
    if-ne v3, v12, :cond_b

    .line 197
    .line 198
    iget-object v3, v4, Lei3;->t:Ljava/lang/CharSequence;

    .line 199
    .line 200
    iget-object v4, v13, Lei3;->t:Ljava/lang/CharSequence;

    .line 201
    .line 202
    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_b

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_a
    if-ne v12, v3, :cond_b

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_b
    iget-object v3, v0, Lim2;->a:Landroid/content/Context;

    .line 213
    .line 214
    invoke-static {v13, v3}, Lf92;->o(Lei3;Landroid/content/Context;)Landroidx/media3/common/PlaybackException;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    new-instance v4, Lhj0;

    .line 219
    .line 220
    invoke-direct {v4, v15, v3}, Lhj0;-><init>(ILandroidx/media3/common/PlaybackException;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v14, v9, v4}, Ltc2;->c(ILqc2;)V

    .line 224
    .line 225
    .line 226
    if-eqz v3, :cond_c

    .line 227
    .line 228
    new-instance v4, Lhj0;

    .line 229
    .line 230
    const/4 v12, 0x4

    .line 231
    invoke-direct {v4, v12, v3}, Lhj0;-><init>(ILandroidx/media3/common/PlaybackException;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v14, v9, v4}, Ltc2;->c(ILqc2;)V

    .line 235
    .line 236
    .line 237
    :cond_c
    :goto_2
    iget-object v3, v6, Lhm2;->f:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v3, Leo2;

    .line 240
    .line 241
    iget-object v1, v1, Lhm2;->f:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v1, Leo2;

    .line 244
    .line 245
    if-eq v3, v1, :cond_d

    .line 246
    .line 247
    new-instance v1, Lem2;

    .line 248
    .line 249
    invoke-direct {v1, v0}, Lem2;-><init>(Lim2;)V

    .line 250
    .line 251
    .line 252
    const/16 v3, 0xe

    .line 253
    .line 254
    invoke-virtual {v14, v3, v1}, Ltc2;->c(ILqc2;)V

    .line 255
    .line 256
    .line 257
    :cond_d
    iget v1, v8, Llk3;->A:I

    .line 258
    .line 259
    iget v3, v10, Llk3;->A:I

    .line 260
    .line 261
    if-eq v1, v3, :cond_e

    .line 262
    .line 263
    new-instance v1, Lcm2;

    .line 264
    .line 265
    const/4 v3, 0x6

    .line 266
    invoke-direct {v1, v2, v3}, Lcm2;-><init>(Lml3;I)V

    .line 267
    .line 268
    .line 269
    const/4 v12, 0x4

    .line 270
    invoke-virtual {v14, v12, v1}, Ltc2;->c(ILqc2;)V

    .line 271
    .line 272
    .line 273
    :cond_e
    iget-boolean v1, v8, Llk3;->v:Z

    .line 274
    .line 275
    iget-boolean v3, v10, Llk3;->v:Z

    .line 276
    .line 277
    if-eq v1, v3, :cond_f

    .line 278
    .line 279
    new-instance v1, Lcm2;

    .line 280
    .line 281
    const/4 v3, 0x7

    .line 282
    invoke-direct {v1, v2, v3}, Lcm2;-><init>(Lml3;I)V

    .line 283
    .line 284
    .line 285
    const/4 v4, 0x5

    .line 286
    invoke-virtual {v14, v4, v1}, Ltc2;->c(ILqc2;)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_f
    const/4 v3, 0x7

    .line 291
    :goto_3
    iget-boolean v1, v8, Llk3;->x:Z

    .line 292
    .line 293
    iget-boolean v4, v10, Llk3;->x:Z

    .line 294
    .line 295
    const/16 v6, 0x8

    .line 296
    .line 297
    if-eq v1, v4, :cond_10

    .line 298
    .line 299
    new-instance v1, Lcm2;

    .line 300
    .line 301
    invoke-direct {v1, v2, v6}, Lcm2;-><init>(Lml3;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v14, v3, v1}, Ltc2;->c(ILqc2;)V

    .line 305
    .line 306
    .line 307
    :cond_10
    iget-object v1, v8, Llk3;->g:Lqh3;

    .line 308
    .line 309
    iget-object v3, v10, Llk3;->g:Lqh3;

    .line 310
    .line 311
    invoke-virtual {v1, v3}, Lqh3;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    const/16 v3, 0x9

    .line 316
    .line 317
    const/16 v4, 0xc

    .line 318
    .line 319
    if-nez v1, :cond_11

    .line 320
    .line 321
    new-instance v1, Lcm2;

    .line 322
    .line 323
    invoke-direct {v1, v2, v3}, Lcm2;-><init>(Lml3;I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v14, v4, v1}, Ltc2;->c(ILqc2;)V

    .line 327
    .line 328
    .line 329
    :cond_11
    iget v1, v8, Llk3;->h:I

    .line 330
    .line 331
    iget v12, v10, Llk3;->h:I

    .line 332
    .line 333
    if-eq v1, v12, :cond_12

    .line 334
    .line 335
    new-instance v1, Lcm2;

    .line 336
    .line 337
    invoke-direct {v1, v2, v9}, Lcm2;-><init>(Lml3;I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v14, v6, v1}, Ltc2;->c(ILqc2;)V

    .line 341
    .line 342
    .line 343
    :cond_12
    iget-boolean v1, v8, Llk3;->i:Z

    .line 344
    .line 345
    iget-boolean v6, v10, Llk3;->i:Z

    .line 346
    .line 347
    if-eq v1, v6, :cond_13

    .line 348
    .line 349
    new-instance v1, Lcm2;

    .line 350
    .line 351
    const/16 v6, 0xb

    .line 352
    .line 353
    invoke-direct {v1, v2, v6}, Lcm2;-><init>(Lml3;I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v14, v3, v1}, Ltc2;->c(ILqc2;)V

    .line 357
    .line 358
    .line 359
    :cond_13
    iget-object v1, v8, Llk3;->q:Lil;

    .line 360
    .line 361
    iget-object v3, v10, Llk3;->q:Lil;

    .line 362
    .line 363
    invoke-virtual {v1, v3}, Lil;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-nez v1, :cond_14

    .line 368
    .line 369
    new-instance v1, Lcm2;

    .line 370
    .line 371
    invoke-direct {v1, v2, v4}, Lcm2;-><init>(Lml3;I)V

    .line 372
    .line 373
    .line 374
    const/16 v3, 0x14

    .line 375
    .line 376
    invoke-virtual {v14, v3, v1}, Ltc2;->c(ILqc2;)V

    .line 377
    .line 378
    .line 379
    :cond_14
    iget v1, v8, Llk3;->p:I

    .line 380
    .line 381
    iget v3, v10, Llk3;->p:I

    .line 382
    .line 383
    if-eq v1, v3, :cond_15

    .line 384
    .line 385
    new-instance v1, Lcm2;

    .line 386
    .line 387
    const/4 v3, 0x0

    .line 388
    invoke-direct {v1, v2, v3}, Lcm2;-><init>(Lml3;I)V

    .line 389
    .line 390
    .line 391
    const/16 v4, 0x15

    .line 392
    .line 393
    invoke-virtual {v14, v4, v1}, Ltc2;->c(ILqc2;)V

    .line 394
    .line 395
    .line 396
    goto :goto_4

    .line 397
    :cond_15
    const/4 v3, 0x0

    .line 398
    :goto_4
    iget-object v1, v8, Llk3;->s:Lhp0;

    .line 399
    .line 400
    iget-object v4, v10, Llk3;->s:Lhp0;

    .line 401
    .line 402
    invoke-virtual {v1, v4}, Lhp0;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-nez v1, :cond_16

    .line 407
    .line 408
    new-instance v1, Lcm2;

    .line 409
    .line 410
    const/4 v4, 0x1

    .line 411
    invoke-direct {v1, v2, v4}, Lcm2;-><init>(Lml3;I)V

    .line 412
    .line 413
    .line 414
    const/16 v6, 0x1d

    .line 415
    .line 416
    invoke-virtual {v14, v6, v1}, Ltc2;->c(ILqc2;)V

    .line 417
    .line 418
    .line 419
    goto :goto_5

    .line 420
    :cond_16
    const/4 v4, 0x1

    .line 421
    :goto_5
    iget v1, v8, Llk3;->t:I

    .line 422
    .line 423
    iget v6, v10, Llk3;->t:I

    .line 424
    .line 425
    if-ne v1, v6, :cond_17

    .line 426
    .line 427
    iget-boolean v1, v8, Llk3;->u:Z

    .line 428
    .line 429
    iget-boolean v6, v10, Llk3;->u:Z

    .line 430
    .line 431
    if-eq v1, v6, :cond_18

    .line 432
    .line 433
    :cond_17
    new-instance v1, Lcm2;

    .line 434
    .line 435
    const/4 v6, 0x2

    .line 436
    invoke-direct {v1, v2, v6}, Lcm2;-><init>(Lml3;I)V

    .line 437
    .line 438
    .line 439
    const/16 v6, 0x1e

    .line 440
    .line 441
    invoke-virtual {v14, v6, v1}, Ltc2;->c(ILqc2;)V

    .line 442
    .line 443
    .line 444
    :cond_18
    iget-object v1, v7, Lml3;->c:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v1, Lmi3;

    .line 447
    .line 448
    iget-object v6, v2, Lml3;->c:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v6, Lmi3;

    .line 451
    .line 452
    invoke-virtual {v1, v6}, Lmi3;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-nez v1, :cond_19

    .line 457
    .line 458
    new-instance v1, Lcm2;

    .line 459
    .line 460
    invoke-direct {v1, v2, v15}, Lcm2;-><init>(Lml3;I)V

    .line 461
    .line 462
    .line 463
    const/16 v6, 0xd

    .line 464
    .line 465
    invoke-virtual {v14, v6, v1}, Ltc2;->c(ILqc2;)V

    .line 466
    .line 467
    .line 468
    :cond_19
    iget-object v1, v7, Lml3;->b:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v1, Lwa4;

    .line 471
    .line 472
    iget-object v2, v2, Lml3;->b:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v2, Lwa4;

    .line 475
    .line 476
    invoke-virtual {v1, v2}, Lwa4;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-nez v1, :cond_1b

    .line 481
    .line 482
    invoke-virtual {v0}, Lim2;->a1()Lsk2;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    iget-object v6, v1, Lsk2;->f:Landroid/os/Handler;

    .line 494
    .line 495
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    if-ne v2, v6, :cond_1a

    .line 500
    .line 501
    move v2, v4

    .line 502
    goto :goto_6

    .line 503
    :cond_1a
    move v2, v3

    .line 504
    :goto_6
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 505
    .line 506
    .line 507
    iget-object v1, v1, Lsk2;->e:Lqk2;

    .line 508
    .line 509
    invoke-interface {v1}, Lqk2;->l()V

    .line 510
    .line 511
    .line 512
    :cond_1b
    iget-object v1, v7, Lml3;->d:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v1, Lyw1;

    .line 515
    .line 516
    invoke-virtual {v1, v5}, Lyw1;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    if-nez v1, :cond_1d

    .line 521
    .line 522
    invoke-virtual {v0}, Lim2;->a1()Lsk2;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    iget-object v5, v1, Lsk2;->f:Landroid/os/Handler;

    .line 534
    .line 535
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    if-ne v2, v5, :cond_1c

    .line 540
    .line 541
    move v2, v4

    .line 542
    goto :goto_7

    .line 543
    :cond_1c
    move v2, v3

    .line 544
    :goto_7
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 545
    .line 546
    .line 547
    iget-object v1, v1, Lsk2;->e:Lqk2;

    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    new-instance v2, Lab4;

    .line 553
    .line 554
    const/4 v5, -0x6

    .line 555
    invoke-direct {v2, v5}, Lab4;-><init>(I)V

    .line 556
    .line 557
    .line 558
    new-instance v2, Lmw1;

    .line 559
    .line 560
    invoke-interface {v1}, Lqk2;->u()V

    .line 561
    .line 562
    .line 563
    :cond_1d
    if-eqz v11, :cond_1f

    .line 564
    .line 565
    invoke-virtual {v0}, Lim2;->a1()Lsk2;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    iget-object v2, v0, Lsk2;->f:Landroid/os/Handler;

    .line 577
    .line 578
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    if-ne v1, v2, :cond_1e

    .line 583
    .line 584
    move v13, v4

    .line 585
    goto :goto_8

    .line 586
    :cond_1e
    move v13, v3

    .line 587
    :goto_8
    invoke-static {v13}, Lrr2;->w(Z)V

    .line 588
    .line 589
    .line 590
    iget-object v0, v0, Lsk2;->e:Lqk2;

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    :cond_1f
    invoke-virtual {v14}, Ltc2;->b()V

    .line 596
    .line 597
    .line 598
    return-void
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 8
    .line 9
    iget-wide v0, p0, Lza4;->d:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final h()I
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget p0, p0, Llk3;->h:I

    .line 8
    .line 9
    return p0
.end method

.method public final h0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-boolean p0, p0, Llk3;->x:Z

    .line 8
    .line 9
    return p0
.end method

.method public final h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 7

    .line 1
    iget-object v2, p0, Lim2;->m:Lhm2;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v4, p1

    .line 7
    move-object v5, p2

    .line 8
    move-object v6, p3

    .line 9
    invoke-virtual/range {v0 .. v6}, Lim2;->g1(ZLhm2;ZLml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final i()Lqh3;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->g:Lqh3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i0()Ljg0;
    .locals 1

    .line 1
    const-string p0, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support getting Cue"

    .line 4
    .line 5
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ljg0;->d:Ljg0;

    .line 9
    .line 10
    return-object p0
.end method

.method public final j()I
    .locals 3

    .line 1
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Llk3;

    .line 6
    .line 7
    iget-object v1, v0, Llk3;->s:Lhp0;

    .line 8
    .line 9
    iget v1, v1, Lhp0;->a:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget p0, v0, Llk3;->t:I

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Lwo0;->y()Lfg4;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, Lf92;->a:Ljx1;

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    return v0

    .line 31
    :cond_1
    iget p0, p0, Lfg4;->e:I

    .line 32
    .line 33
    return p0

    .line 34
    :cond_2
    return v0
.end method

.method public final j0()I
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 8
    .line 9
    iget-boolean p0, p0, Lza4;->b:Z

    .line 10
    .line 11
    return p0
.end method

.method public final k0(Lil;Z)V
    .locals 0

    .line 1
    const-string p0, "MCImplLegacy"

    .line 2
    .line 3
    const-string p1, "Legacy session doesn\'t support setting audio attributes remotely"

    .line 4
    .line 5
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final l()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final l0(Ldo2;)V
    .locals 0

    .line 1
    const-string p0, "MCImplLegacy"

    .line 2
    .line 3
    const-string p1, "Session doesn\'t support setting playlist metadata"

    .line 4
    .line 5
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final m()J
    .locals 2

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 8
    .line 9
    iget-wide v0, p0, Lza4;->g:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final m0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lim2;->V(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final n(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lim2;->f1(IJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final n0()I
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    return p0
.end method

.method public final o()Lmi3;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lmi3;

    .line 6
    .line 7
    return-object p0
.end method

.method public final o0()I
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 8
    .line 9
    iget-object p0, p0, Lza4;->a:Lpi3;

    .line 10
    .line 11
    iget p0, p0, Lpi3;->b:I

    .line 12
    .line 13
    return p0
.end method

.method public final p(Lgn2;J)V
    .locals 1

    .line 1
    invoke-static {p1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0, p2, p3}, Lim2;->T(Ljava/util/List;IJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final p0(I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lim2;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lml3;

    .line 8
    .line 9
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 10
    .line 11
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Llk3;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Llk3;->i(I)Llk3;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 20
    .line 21
    iget-object v3, v0, Lml3;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lwa4;

    .line 24
    .line 25
    iget-object v4, v0, Lml3;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lmi3;

    .line 28
    .line 29
    iget-object v5, v0, Lml3;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, Lyw1;

    .line 32
    .line 33
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v6, v0

    .line 36
    check-cast v6, Landroid/os/Bundle;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-direct/range {v1 .. v7}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v1, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 47
    .line 48
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p1}, Lf92;->p(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    new-instance v0, Landroid/os/Bundle;

    .line 57
    .line 58
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v1, "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"

    .line 62
    .line 63
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    const-string p1, "android.support.v4.media.session.action.SET_REPEAT_MODE"

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0}, Lpz1;->I(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-boolean p0, p0, Llk3;->v:Z

    .line 8
    .line 9
    return p0
.end method

.method public final q0(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1}, Lim2;->E(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7fffffff

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lim2;->P(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r0(Loi3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->d:Ltc2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltc2;->e(Loi3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s(Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lim2;->D0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lml3;

    .line 8
    .line 9
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 10
    .line 11
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Llk3;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Llk3;->k(Z)Llk3;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 20
    .line 21
    iget-object v3, v0, Lml3;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lwa4;

    .line 24
    .line 25
    iget-object v4, v0, Lml3;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lmi3;

    .line 28
    .line 29
    iget-object v5, v0, Lml3;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, Lyw1;

    .line 32
    .line 33
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v6, v0

    .line 36
    check-cast v6, Landroid/os/Bundle;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-direct/range {v1 .. v7}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v1, v0, v0}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 47
    .line 48
    invoke-virtual {p0}, Lwo0;->A()Lpz1;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object v0, Lf92;->a:Ljx1;

    .line 53
    .line 54
    new-instance v0, Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v1, "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"

    .line 60
    .line 61
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    const-string p1, "android.support.v4.media.session.action.SET_SHUFFLE_MODE"

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Lpz1;->I(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final s0(Lgn2;)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, Lim2;->p(Lgn2;J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final stop()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lim2;->p:Lml3;

    .line 4
    .line 5
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Llk3;

    .line 8
    .line 9
    iget v2, v1, Llk3;->A:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v2, v1, Llk3;->c:Lza4;

    .line 16
    .line 17
    iget-object v5, v2, Lza4;->a:Lpi3;

    .line 18
    .line 19
    iget-boolean v6, v2, Lza4;->b:Z

    .line 20
    .line 21
    iget-wide v9, v2, Lza4;->d:J

    .line 22
    .line 23
    iget-wide v11, v5, Lpi3;->f:J

    .line 24
    .line 25
    invoke-static {v11, v12, v9, v10}, Lju2;->b(JJ)I

    .line 26
    .line 27
    .line 28
    move-result v13

    .line 29
    new-instance v4, Lza4;

    .line 30
    .line 31
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const-wide/16 v14, 0x0

    .line 41
    .line 42
    move-wide/from16 v18, v9

    .line 43
    .line 44
    move-wide/from16 v20, v11

    .line 45
    .line 46
    invoke-direct/range {v4 .. v21}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v4}, Llk3;->j(Lza4;)Llk3;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, v0, Lim2;->p:Lml3;

    .line 54
    .line 55
    iget-object v2, v2, Lml3;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Llk3;

    .line 58
    .line 59
    iget v4, v2, Llk3;->A:I

    .line 60
    .line 61
    if-eq v4, v3, :cond_1

    .line 62
    .line 63
    iget-object v2, v2, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 64
    .line 65
    invoke-virtual {v1, v3, v2}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_1
    move-object v3, v1

    .line 70
    new-instance v2, Lml3;

    .line 71
    .line 72
    iget-object v1, v0, Lim2;->p:Lml3;

    .line 73
    .line 74
    iget-object v4, v1, Lml3;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Lwa4;

    .line 77
    .line 78
    iget-object v5, v1, Lml3;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v5, Lmi3;

    .line 81
    .line 82
    iget-object v6, v1, Lml3;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v6, Lyw1;

    .line 85
    .line 86
    iget-object v1, v1, Lml3;->e:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v7, v1

    .line 89
    check-cast v7, Landroid/os/Bundle;

    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    invoke-direct/range {v2 .. v8}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 93
    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-virtual {v0, v2, v1, v1}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, v0, Lim2;->i:Lwo0;

    .line 100
    .line 101
    invoke-virtual {v0}, Lwo0;->A()Lpz1;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, Lpz1;->o:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Landroid/media/session/MediaController$TransportControls;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/media/session/MediaController$TransportControls;->stop()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final t()I
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 8
    .line 9
    iget p0, p0, Lza4;->f:I

    .line 10
    .line 11
    return p0
.end method

.method public final t0(II)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p2}, Lim2;->u0(III)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u()J
    .locals 2

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-wide v0, p0, Llk3;->E:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public final u0(III)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    if-gt p1, p2, :cond_0

    .line 5
    .line 6
    if-ltz p3, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v0

    .line 11
    :goto_0
    invoke-static {v1}, Lrr2;->l(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lim2;->p:Lml3;

    .line 15
    .line 16
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Llk3;

    .line 19
    .line 20
    iget-object v1, v1, Llk3;->j:Lcu4;

    .line 21
    .line 22
    check-cast v1, Lxs3;

    .line 23
    .line 24
    invoke-virtual {v1}, Lxs3;->o()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    sub-int v3, p2, p1

    .line 33
    .line 34
    sub-int v4, v2, v3

    .line 35
    .line 36
    add-int/lit8 v5, v4, -0x1

    .line 37
    .line 38
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-ge p1, v2, :cond_7

    .line 43
    .line 44
    if-eq p1, p2, :cond_7

    .line 45
    .line 46
    if-ne p1, p3, :cond_1

    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, Lim2;->o0()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v4, -0x1

    .line 55
    if-ge v2, p1, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    if-ge v2, p2, :cond_3

    .line 59
    .line 60
    move v2, v4

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    sub-int/2addr v2, v3

    .line 63
    :goto_1
    if-ne v2, v4, :cond_4

    .line 64
    .line 65
    invoke-static {p1, v0, v5}, Lf35;->j(III)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v5, "Currently playing item will be removed and added back to mimic move. Assumes item at "

    .line 72
    .line 73
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v5, " would be the new current item"

    .line 80
    .line 81
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const-string v5, "MCImplLegacy"

    .line 89
    .line 90
    invoke-static {v5, v4}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    if-ge v2, p3, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    add-int/2addr v2, v3

    .line 97
    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    .line 98
    .line 99
    iget-object v5, v1, Lxs3;->e:Lyw1;

    .line 100
    .line 101
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v4, p1, p2, p3}, Lf35;->P(Ljava/util/ArrayList;III)V

    .line 105
    .line 106
    .line 107
    new-instance p2, Lxs3;

    .line 108
    .line 109
    invoke-static {v4}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    iget-object v1, v1, Lxs3;->f:Lws3;

    .line 114
    .line 115
    invoke-direct {p2, v4, v1}, Lxs3;-><init>(Lyw1;Lws3;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lim2;->p:Lml3;

    .line 119
    .line 120
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Llk3;

    .line 123
    .line 124
    invoke-virtual {v1, p2, v2}, Llk3;->m(Lxs3;I)Llk3;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    new-instance v4, Lml3;

    .line 129
    .line 130
    iget-object p2, p0, Lim2;->p:Lml3;

    .line 131
    .line 132
    iget-object v1, p2, Lml3;->b:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v6, v1

    .line 135
    check-cast v6, Lwa4;

    .line 136
    .line 137
    iget-object v1, p2, Lml3;->c:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v7, v1

    .line 140
    check-cast v7, Lmi3;

    .line 141
    .line 142
    iget-object v1, p2, Lml3;->d:Ljava/lang/Object;

    .line 143
    .line 144
    move-object v8, v1

    .line 145
    check-cast v8, Lyw1;

    .line 146
    .line 147
    iget-object p2, p2, Lml3;->e:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v9, p2

    .line 150
    check-cast v9, Landroid/os/Bundle;

    .line 151
    .line 152
    const/4 v10, 0x0

    .line 153
    invoke-direct/range {v4 .. v10}, Lml3;-><init>(Llk3;Lwa4;Lmi3;Lyw1;Landroid/os/Bundle;Lxa4;)V

    .line 154
    .line 155
    .line 156
    const/4 p2, 0x0

    .line 157
    invoke-virtual {p0, v4, p2, p2}, Lim2;->h1(Lml3;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Lim2;->d1()Z

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    if-eqz p2, :cond_7

    .line 165
    .line 166
    new-instance p2, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    move v1, v0

    .line 172
    :goto_3
    if-ge v1, v3, :cond_6

    .line 173
    .line 174
    iget-object v2, p0, Lim2;->m:Lhm2;

    .line 175
    .line 176
    iget-object v2, v2, Lhm2;->a:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Lor2;

    .line 183
    .line 184
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    iget-object v2, p0, Lim2;->i:Lwo0;

    .line 188
    .line 189
    iget-object v4, p0, Lim2;->m:Lhm2;

    .line 190
    .line 191
    iget-object v4, v4, Lhm2;->a:Ljava/util/List;

    .line 192
    .line 193
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Lor2;

    .line 198
    .line 199
    iget-object v4, v4, Lor2;->n:Lpm2;

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Lwo0;->I(Lpm2;)V

    .line 202
    .line 203
    .line 204
    add-int/lit8 v1, v1, 0x1

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_6
    :goto_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-ge v0, p1, :cond_7

    .line 212
    .line 213
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Lor2;

    .line 218
    .line 219
    iget-object v1, p0, Lim2;->i:Lwo0;

    .line 220
    .line 221
    iget-object p1, p1, Lor2;->n:Lpm2;

    .line 222
    .line 223
    add-int v2, v0, p3

    .line 224
    .line 225
    invoke-virtual {v1, p1, v2}, Lwo0;->a(Lpm2;I)V

    .line 226
    .line 227
    .line 228
    add-int/lit8 v0, v0, 0x1

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_7
    :goto_5
    return-void
.end method

.method public final v(Loi3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->d:Ltc2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltc2;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v0()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final w()I
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    return p0
.end method

.method public final w0(Ljava/util/List;)V
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Lim2;->N0(Ljava/util/List;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final x()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lim2;->getDuration()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final x0()Lcu4;
    .locals 0

    .line 1
    iget-object p0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llk3;

    .line 6
    .line 7
    iget-object p0, p0, Llk3;->j:Lcu4;

    .line 8
    .line 9
    return-object p0
.end method

.method public final y()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lim2;->o0()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final y0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lim2;->p:Lml3;

    .line 2
    .line 3
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Llk3;

    .line 6
    .line 7
    iget-object v1, v0, Llk3;->s:Lhp0;

    .line 8
    .line 9
    iget v1, v1, Lhp0;->a:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-boolean p0, v0, Llk3;->u:Z

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    iget-object p0, p0, Lim2;->i:Lwo0;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lwo0;->y()Lfg4;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v0, Lf92;->a:Ljx1;

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget p0, p0, Lfg4;->e:I

    .line 31
    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    return v2

    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final z()Ls55;
    .locals 1

    .line 1
    const-string p0, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support getting VideoSize"

    .line 4
    .line 5
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ls55;->d:Ls55;

    .line 9
    .line 10
    return-object p0
.end method

.method public final z0(ILgn2;)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p0, p1, v0, p2}, Lim2;->L(IILjava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
