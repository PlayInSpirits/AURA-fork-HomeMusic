.class public final synthetic Leg0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Le93;
.implements Lmn0;
.implements Lzd1;
.implements Lcp3;
.implements Lpy;
.implements Lqc2;
.implements Lyr2;
.implements Lks2;
.implements Lmk;
.implements Lwc0;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Leg0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Leg0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Leg0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/CancellationSignal;

    .line 4
    .line 5
    iget-object v1, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lvf0;

    .line 12
    .line 13
    invoke-static {v0, v1, p0, p1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController;->$r8$lambda$Jh-AAZy1dMYZ2AM86jeMkBv3itw(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lvf0;Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lue1;

    .line 4
    .line 5
    iget-object v1, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lmt2;

    .line 8
    .line 9
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lun2;

    .line 12
    .line 13
    check-cast p1, Lst2;

    .line 14
    .line 15
    iget v0, v0, Lue1;->o:I

    .line 16
    .line 17
    invoke-interface {p1, v0, v1, p0}, Lst2;->m(ILmt2;Lun2;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public apply(Ljava/lang/Object;)Lic2;
    .locals 11

    .line 1
    iget v0, p0, Leg0;->n:I

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Leg0;->q:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Leg0;->p:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Leg0;->o:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v6, p0

    .line 16
    check-cast v6, Ltn2;

    .line 17
    .line 18
    move-object v8, v4

    .line 19
    check-cast v8, Lfr2;

    .line 20
    .line 21
    move-object v7, v3

    .line 22
    check-cast v7, Lht2;

    .line 23
    .line 24
    move-object v9, p1

    .line 25
    check-cast v9, Ljava/util/List;

    .line 26
    .line 27
    iget-object p0, v6, Ltn2;->l:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance v5, Lt6;

    .line 30
    .line 31
    const/16 v10, 0x19

    .line 32
    .line 33
    invoke-direct/range {v5 .. v10}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lur2;

    .line 37
    .line 38
    invoke-direct {p1, v6, v8, v5}, Lur2;-><init>(Ltn2;Lfr2;Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lab4;

    .line 42
    .line 43
    invoke-direct {v0, v2}, Lab4;-><init>(I)V

    .line 44
    .line 45
    .line 46
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v2, Llb4;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v3, Lqo2;

    .line 54
    .line 55
    invoke-direct {v3, v2, p1, v0, v1}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v3}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :pswitch_0
    check-cast p0, Ltn2;

    .line 63
    .line 64
    check-cast v4, Lfr2;

    .line 65
    .line 66
    check-cast v3, Lzr2;

    .line 67
    .line 68
    check-cast p1, Lgr2;

    .line 69
    .line 70
    iget-object v0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 71
    .line 72
    new-instance v5, Lqo2;

    .line 73
    .line 74
    const/4 v6, 0x2

    .line 75
    invoke-direct {v5, p0, v3, p1, v6}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Lur2;

    .line 79
    .line 80
    invoke-direct {p1, p0, v4, v5}, Lur2;-><init>(Ltn2;Lfr2;Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    new-instance p0, Lab4;

    .line 84
    .line 85
    invoke-direct {p0, v2}, Lab4;-><init>(I)V

    .line 86
    .line 87
    .line 88
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 89
    .line 90
    new-instance v2, Llb4;

    .line 91
    .line 92
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v3, Lqo2;

    .line 96
    .line 97
    invoke-direct {v3, v2, p1, p0, v1}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v3}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lfr2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lls2;

    .line 4
    .line 5
    iget-object v1, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lva4;

    .line 8
    .line 9
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object v0, v0, Lls2;->g:Ltn2;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1, p0}, Ltn2;->q(Lfr2;Lva4;Landroid/os/Bundle;)Lic2;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public d(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lni4;

    .line 4
    .line 5
    iget-object v0, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 8
    .line 9
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lsi4;

    .line 12
    .line 13
    const-string v1, "TRACK_OBJECT"

    .line 14
    .line 15
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v1, p1, Lni4;->u:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object v3, v2

    .line 44
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v3, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v2, 0x0

    .line 62
    :goto_0
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 63
    .line 64
    if-nez v2, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move-object p2, v2

    .line 68
    :goto_1
    invoke-static {p2}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    const/4 v1, 0x1

    .line 73
    invoke-static {v0, p1, p2, v1, p0}, Ljz4;->P(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Lni4;Ljava/util/List;ZLsi4;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public f(Ler2;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltn2;

    .line 4
    .line 5
    iget-object v1, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljn2;

    .line 12
    .line 13
    iget-object v0, v0, Ltn2;->F:Lnl1;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lu1;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-interface {p1, p2, v1, p0}, Ler2;->z(ILjava/lang/String;Ljn2;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public g(ILsv4;[I)Lgy3;
    .locals 9

    .line 1
    iget-object v0, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v5, v0

    .line 4
    check-cast v5, Ljn0;

    .line 5
    .line 6
    iget-object v0, p0, Leg0;->p:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v7, v0

    .line 9
    check-cast v7, Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v8, p0

    .line 14
    check-cast v8, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {}, Lyw1;->j()Luw1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    move v4, v0

    .line 22
    :goto_0
    iget v0, p2, Lsv4;->a:I

    .line 23
    .line 24
    if-ge v4, v0, :cond_0

    .line 25
    .line 26
    new-instance v1, Lln0;

    .line 27
    .line 28
    aget v6, p3, v4

    .line 29
    .line 30
    move v2, p1

    .line 31
    move-object v3, p2

    .line 32
    invoke-direct/range {v1 .. v8}, Lln0;-><init>(ILsv4;ILjn0;ILjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lpw1;->c(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Luw1;->f()Lgy3;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lml3;

    .line 4
    .line 5
    iget-object v1, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lml3;

    .line 8
    .line 9
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    check-cast p1, Loi3;

    .line 14
    .line 15
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Llk3;

    .line 18
    .line 19
    iget-object v0, v0, Llk3;->c:Lza4;

    .line 20
    .line 21
    iget-object v0, v0, Lza4;->a:Lpi3;

    .line 22
    .line 23
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Llk3;

    .line 26
    .line 27
    iget-object v1, v1, Llk3;->c:Lza4;

    .line 28
    .line 29
    iget-object v1, v1, Lza4;->a:Lpi3;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-interface {p1, v0, v1, p0}, Loi3;->k(Lpi3;Lpi3;I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public j(Landroidx/preference/Preference;)V
    .locals 4

    .line 1
    iget-object p1, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lvb4;

    .line 4
    .line 5
    iget-object v0, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    new-instance v1, Lvg2;

    .line 14
    .line 15
    invoke-virtual {p1}, Lkc1;->Z()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v1, v2, v3}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 21
    .line 22
    .line 23
    const v2, 0x7f1301ba

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lvg2;->p(I)V

    .line 27
    .line 28
    .line 29
    const v2, 0x7f1301b8

    .line 30
    .line 31
    .line 32
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, v2, p0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object v0, v1, Le9;->a:La9;

    .line 41
    .line 42
    iput-object p0, v0, La9;->f:Ljava/lang/CharSequence;

    .line 43
    .line 44
    new-instance p0, Lvr;

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    invoke-direct {p0, v0, p1}, Lvr;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const p1, 0x7f1301b9

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1, p0}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/high16 p1, 0x1040000

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-virtual {p0, p1, v0}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Le9;->h()Lf9;

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public k(Loy;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Leg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lne0;

    .line 4
    .line 5
    iget-object v1, p0, Leg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lze0;

    .line 8
    .line 9
    iget-object p0, p0, Leg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lwf1;

    .line 12
    .line 13
    sget-object v2, Lfz0;->h0:Lfz0;

    .line 14
    .line 15
    invoke-interface {v0, v2}, Lne0;->K(Lme0;)Lle0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ls22;

    .line 20
    .line 21
    new-instance v3, Lqa1;

    .line 22
    .line 23
    const/16 v4, 0x11

    .line 24
    .line 25
    invoke-direct {v3, v4, v2}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p1, Loy;->c:Ln04;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    sget-object v4, Lfq0;->n:Lfq0;

    .line 33
    .line 34
    invoke-virtual {v2, v3, v4}, Lg2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-static {v0}, Lte5;->a(Lne0;)Ltd0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v2, Lr;

    .line 42
    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-direct {v2, p0, p1, v4, v3}, Lr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    invoke-static {v0, v4, v1, v2, p0}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method
