.class public final Lq41;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lmo2;
.implements Ldw4;
.implements Lc55;


# static fields
.field public static final u0:J


# instance fields
.field public final A:Z

.field public final B:Lxl0;

.field public final C:Ljava/util/ArrayList;

.field public final D:Lvp4;

.field public final E:Lu31;

.field public final F:Lro2;

.field public final G:Lfo1;

.field public final H:Lul0;

.field public final I:J

.field public final J:Lik3;

.field public final K:Lnj0;

.field public final L:Lyp4;

.field public final M:Z

.field public final N:Ltl;

.field public final O:Z

.field public P:Ln84;

.field public Q:Li74;

.field public R:Z

.field public S:Z

.field public T:Lp41;

.field public U:I

.field public V:Lph3;

.field public W:Ln41;

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public b0:J

.field public c0:Z

.field public d0:I

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:I

.field public j0:Lp41;

.field public k0:J

.field public l0:J

.field public m0:I

.field public final n:[Lez3;

.field public n0:Z

.field public final o:[Lkq;

.field public o0:Landroidx/media3/exoplayer/ExoPlaybackException;

.field public final p:[Z

.field public p0:J

.field public final q:Lpn0;

.field public q0:Lp31;

.field public final r:Lew4;

.field public r0:J

.field public final s:Lcd2;

.field public s0:Z

.field public final t:Lcp;

.field public t0:F

.field public final u:Lyp4;

.field public final v:Lgc;

.field public final w:Landroid/os/Looper;

.field public final x:Lbu4;

.field public final y:Lzt4;

.field public final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lq41;->u0:J

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Lkq;[Lkq;Lpn0;Lew4;Lcd2;Lcp;IZLnj0;Ln84;Lul0;JLandroid/os/Looper;Lvp4;Lu31;Lik3;Lc55;Z)V
    .locals 13

    move-object/from16 v1, p4

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p10

    move-object/from16 v5, p16

    move-object/from16 v6, p18

    sget-object v7, Lp31;->a:Lp31;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    iput-wide v8, p0, Lq41;->r0:J

    move-object/from16 v10, p17

    .line 3
    iput-object v10, p0, Lq41;->E:Lu31;

    .line 4
    iput-object v1, p0, Lq41;->q:Lpn0;

    move-object/from16 v10, p5

    .line 5
    iput-object v10, p0, Lq41;->r:Lew4;

    .line 6
    iput-object v2, p0, Lq41;->s:Lcd2;

    .line 7
    iput-object v3, p0, Lq41;->t:Lcp;

    move/from16 v11, p8

    .line 8
    iput v11, p0, Lq41;->d0:I

    move/from16 v11, p9

    .line 9
    iput-boolean v11, p0, Lq41;->e0:Z

    move-object/from16 v11, p11

    .line 10
    iput-object v11, p0, Lq41;->P:Ln84;

    move-object/from16 v11, p12

    .line 11
    iput-object v11, p0, Lq41;->H:Lul0;

    move-wide/from16 v11, p13

    .line 12
    iput-wide v11, p0, Lq41;->I:J

    const/4 v11, 0x0

    .line 13
    iput-boolean v11, p0, Lq41;->Y:Z

    .line 14
    iput-object v5, p0, Lq41;->D:Lvp4;

    .line 15
    iput-object v6, p0, Lq41;->J:Lik3;

    .line 16
    iput-object v7, p0, Lq41;->q0:Lp31;

    .line 17
    iput-object v4, p0, Lq41;->K:Lnj0;

    const/high16 v7, 0x3f800000    # 1.0f

    .line 18
    iput v7, p0, Lq41;->t0:F

    .line 19
    sget-object v7, Li74;->b:Li74;

    iput-object v7, p0, Lq41;->Q:Li74;

    move/from16 v7, p20

    .line 20
    iput-boolean v7, p0, Lq41;->O:Z

    .line 21
    iput-wide v8, p0, Lq41;->p0:J

    .line 22
    iput-wide v8, p0, Lq41;->b0:J

    .line 23
    invoke-interface {v2, v6}, Lcd2;->i(Lik3;)J

    move-result-wide v7

    iput-wide v7, p0, Lq41;->z:J

    .line 24
    invoke-interface {v2, v6}, Lcd2;->d(Lik3;)Z

    move-result v2

    iput-boolean v2, p0, Lq41;->A:Z

    .line 25
    sget-object v2, Lcu4;->a:Lyt4;

    .line 26
    invoke-static {v10}, Lph3;->k(Lew4;)Lph3;

    move-result-object v2

    iput-object v2, p0, Lq41;->V:Lph3;

    .line 27
    new-instance v7, Ln41;

    invoke-direct {v7, v2}, Ln41;-><init>(Lph3;)V

    iput-object v7, p0, Lq41;->W:Ln41;

    .line 28
    array-length v2, p2

    new-array v2, v2, [Lkq;

    iput-object v2, p0, Lq41;->o:[Lkq;

    .line 29
    array-length v2, p2

    new-array v2, v2, [Z

    iput-object v2, p0, Lq41;->p:[Z

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    array-length v2, p2

    new-array v2, v2, [Lez3;

    iput-object v2, p0, Lq41;->n:[Lez3;

    move v2, v11

    move v7, v2

    .line 32
    :goto_0
    array-length v8, p2

    const/4 v9, 0x1

    if-ge v2, v8, :cond_1

    .line 33
    aget-object v8, p2, v2

    .line 34
    iput v2, v8, Lkq;->r:I

    .line 35
    iput-object v6, v8, Lkq;->s:Lik3;

    .line 36
    iput-object v5, v8, Lkq;->t:Lvp4;

    .line 37
    iget-object v10, p0, Lq41;->o:[Lkq;

    aput-object v8, v10, v2

    .line 38
    iget-object v8, p0, Lq41;->o:[Lkq;

    aget-object v8, v8, v2

    .line 39
    iget-object v10, v8, Lkq;->n:Ljava/lang/Object;

    monitor-enter v10

    .line 40
    :try_start_0
    iput-object v1, v8, Lkq;->E:Lpn0;

    .line 41
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    aget-object v8, p3, v2

    if-eqz v8, :cond_0

    .line 43
    iput v2, v8, Lkq;->r:I

    .line 44
    iput-object v6, v8, Lkq;->s:Lik3;

    .line 45
    iput-object v5, v8, Lkq;->t:Lvp4;

    move v7, v9

    .line 46
    :cond_0
    iget-object v9, p0, Lq41;->n:[Lez3;

    new-instance v10, Lez3;

    aget-object v12, p2, v2

    .line 47
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object v12, v10, Lez3;->e:Ljava/lang/Object;

    .line 49
    iput v2, v10, Lez3;->c:I

    .line 50
    iput-object v8, v10, Lez3;->f:Ljava/lang/Object;

    .line 51
    iput v11, v10, Lez3;->d:I

    .line 52
    iput-boolean v11, v10, Lez3;->a:Z

    .line 53
    iput-boolean v11, v10, Lez3;->b:Z

    .line 54
    aput-object v10, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 55
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 56
    :cond_1
    iput-boolean v7, p0, Lq41;->M:Z

    .line 57
    new-instance v0, Lxl0;

    invoke-direct {v0, p0, v5}, Lxl0;-><init>(Lq41;Lvp4;)V

    iput-object v0, p0, Lq41;->B:Lxl0;

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq41;->C:Ljava/util/ArrayList;

    .line 59
    new-instance v0, Lbu4;

    invoke-direct {v0}, Lbu4;-><init>()V

    iput-object v0, p0, Lq41;->x:Lbu4;

    .line 60
    new-instance v0, Lzt4;

    invoke-direct {v0}, Lzt4;-><init>()V

    iput-object v0, p0, Lq41;->y:Lzt4;

    .line 61
    iget-object v0, v1, Lpn0;->a:Ldw4;

    if-nez v0, :cond_2

    move v0, v9

    goto :goto_1

    :cond_2
    move v0, v11

    :goto_1
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 62
    iput-object p0, v1, Lpn0;->a:Ldw4;

    .line 63
    iput-object v3, v1, Lpn0;->b:Lcp;

    .line 64
    iput-boolean v9, p0, Lq41;->n0:Z

    const/4 v0, 0x0

    move-object/from16 v1, p15

    .line 65
    invoke-virtual {v5, v1, v0}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    move-result-object v0

    iput-object v0, p0, Lq41;->L:Lyp4;

    .line 66
    new-instance v1, Lro2;

    new-instance v2, Lcn;

    const/16 v3, 0xc

    invoke-direct {v2, v3, p0}, Lcn;-><init>(ILjava/lang/Object;)V

    invoke-direct {v1, v4, v0, v2}, Lro2;-><init>(Lnj0;Lyp4;Lcn;)V

    iput-object v1, p0, Lq41;->F:Lro2;

    .line 67
    new-instance v1, Lfo1;

    invoke-direct {v1, p0, v4, v0, v6}, Lfo1;-><init>(Lq41;Lnj0;Lyp4;Lik3;)V

    iput-object v1, p0, Lq41;->G:Lfo1;

    .line 68
    new-instance v0, Lgc;

    invoke-direct {v0}, Lgc;-><init>()V

    iput-object v0, p0, Lq41;->v:Lgc;

    .line 69
    iget-object v1, v0, Lgc;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 70
    :try_start_2
    iget-object v2, v0, Lgc;->c:Ljava/lang/Object;

    check-cast v2, Landroid/os/Looper;

    if-nez v2, :cond_4

    .line 71
    iget v2, v0, Lgc;->a:I

    if-nez v2, :cond_3

    iget-object v2, v0, Lgc;->d:Ljava/lang/Object;

    check-cast v2, Landroid/os/HandlerThread;

    if-nez v2, :cond_3

    move v11, v9

    :cond_3
    invoke-static {v11}, Lrr2;->w(Z)V

    .line 72
    new-instance v2, Landroid/os/HandlerThread;

    const-string v3, "ExoPlayer:Playback"

    const/16 v4, -0x10

    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v2, v0, Lgc;->d:Ljava/lang/Object;

    .line 73
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 74
    iget-object v2, v0, Lgc;->d:Ljava/lang/Object;

    check-cast v2, Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    iput-object v2, v0, Lgc;->c:Ljava/lang/Object;

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 75
    :cond_4
    :goto_2
    iget v2, v0, Lgc;->a:I

    add-int/2addr v2, v9

    iput v2, v0, Lgc;->a:I

    .line 76
    iget-object v0, v0, Lgc;->c:Ljava/lang/Object;

    check-cast v0, Landroid/os/Looper;

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 77
    iput-object v0, p0, Lq41;->w:Landroid/os/Looper;

    .line 78
    invoke-virtual {v5, v0, p0}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    move-result-object v1

    iput-object v1, p0, Lq41;->u:Lyp4;

    .line 79
    new-instance v2, Ltl;

    invoke-direct {v2, p1, v0, p0}, Ltl;-><init>(Landroid/content/Context;Landroid/os/Looper;Lq41;)V

    iput-object v2, p0, Lq41;->N:Ltl;

    .line 80
    new-instance p1, Lj41;

    move-object/from16 v0, p19

    invoke-direct {p1, p0, v0}, Lj41;-><init>(Lq41;Lc55;)V

    const/16 p0, 0x23

    .line 81
    invoke-virtual {v1, p0, p1}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    move-result-object p0

    .line 82
    invoke-virtual {p0}, Lxp4;->b()V

    return-void

    .line 83
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0
.end method

.method public static A(Loo2;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, Loo2;->a:Lno2;

    .line 5
    .line 6
    iget-boolean v2, p0, Loo2;->e:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Lno2;->h()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p0, Loo2;->c:[Lq44;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    move v4, v0

    .line 18
    :goto_0
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    invoke-interface {v5}, Lq44;->s()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    iget-boolean p0, p0, Loo2;->e:Z

    .line 31
    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    invoke-interface {v1}, Lda4;->d()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :goto_2
    const-wide/high16 v3, -0x8000000000000000L

    .line 42
    .line 43
    cmp-long p0, v1, v3

    .line 44
    .line 45
    if-eqz p0, :cond_4

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :catch_0
    :cond_4
    return v0
.end method

.method public static T(Lcu4;Lp41;ZIZLbu4;Lzt4;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v0, p1, Lp41;->a:Lcu4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcu4;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v2, v0

    .line 20
    :goto_0
    :try_start_0
    iget v5, p1, Lp41;->b:I

    .line 21
    .line 22
    iget-wide v6, p1, Lp41;->c:J

    .line 23
    .line 24
    move-object v3, p5

    .line 25
    move-object v4, p6

    .line 26
    invoke-virtual/range {v2 .. v7}, Lcu4;->i(Lbu4;Lzt4;IJ)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    move-object v5, v4

    .line 31
    move-object v4, v3

    .line 32
    invoke-virtual {p0, v2}, Lcu4;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p6

    .line 36
    if-eqz p6, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object p6, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p0, p6}, Lcu4;->b(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result p6

    .line 45
    const/4 v0, -0x1

    .line 46
    if-eq p6, v0, :cond_4

    .line 47
    .line 48
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v2, p2, v5}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-boolean p2, p2, Lzt4;->f:Z

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget p2, v5, Lzt4;->c:I

    .line 59
    .line 60
    const-wide/16 p3, 0x0

    .line 61
    .line 62
    invoke-virtual {v2, p2, v4, p3, p4}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget p2, p2, Lbu4;->m:I

    .line 67
    .line 68
    iget-object p3, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2, p3}, Lcu4;->b(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-ne p2, p3, :cond_3

    .line 75
    .line 76
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {p0, p2, v5}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget v6, p2, Lzt4;->c:I

    .line 83
    .line 84
    iget-wide v7, p1, Lp41;->c:J

    .line 85
    .line 86
    move-object v3, p0

    .line 87
    invoke-virtual/range {v3 .. v8}, Lcu4;->i(Lbu4;Lzt4;IJ)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_3
    :goto_1
    return-object p5

    .line 93
    :cond_4
    move-object v3, p0

    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    iget-object p0, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 97
    .line 98
    move p2, p3

    .line 99
    move p3, p4

    .line 100
    move-object p5, v2

    .line 101
    move-object p6, v3

    .line 102
    move-object p1, v5

    .line 103
    move-object p4, p0

    .line 104
    move-object p0, v4

    .line 105
    invoke-static/range {p0 .. p6}, Lq41;->U(Lbu4;Lzt4;IZLjava/lang/Object;Lcu4;Lcu4;)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eq v6, v0, :cond_5

    .line 110
    .line 111
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v3 .. v8}, Lcu4;->i(Lbu4;Lzt4;IJ)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 122
    return-object p0
.end method

.method public static U(Lbu4;Lzt4;IZLjava/lang/Object;Lcu4;Lcu4;)I
    .locals 12

    .line 1
    move-object v3, p0

    .line 2
    move-object v2, p1

    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    invoke-virtual {v1, v0, p1}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget v4, v4, Lzt4;->c:I

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    invoke-virtual {v1, v4, p0, v7, v8}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v4, v4, Lbu4;->a:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    move v5, v9

    .line 25
    :goto_0
    invoke-virtual {v6}, Lcu4;->o()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    if-ge v5, v10, :cond_1

    .line 30
    .line 31
    invoke-virtual {v6, v5, p0, v7, v8}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    iget-object v10, v10, Lbu4;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    return v5

    .line 44
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1, v0}, Lcu4;->b(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {v1}, Lcu4;->h()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    const/4 v8, -0x1

    .line 56
    move v11, v8

    .line 57
    move v10, v9

    .line 58
    :goto_1
    if-ge v10, v7, :cond_3

    .line 59
    .line 60
    if-ne v11, v8, :cond_3

    .line 61
    .line 62
    move-object v4, v1

    .line 63
    move v1, v0

    .line 64
    move-object v0, v4

    .line 65
    move v4, p2

    .line 66
    move v5, p3

    .line 67
    invoke-virtual/range {v0 .. v5}, Lcu4;->d(ILzt4;Lbu4;IZ)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v8, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v0, v1}, Lcu4;->l(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v6, v3}, Lcu4;->b(Ljava/lang/Object;)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    add-int/lit8 v10, v10, 0x1

    .line 83
    .line 84
    move v3, v1

    .line 85
    move-object v1, v0

    .line 86
    move v0, v3

    .line 87
    move-object v3, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_2
    if-ne v11, v8, :cond_4

    .line 90
    .line 91
    return v8

    .line 92
    :cond_4
    invoke-virtual {v6, v11, p1, v9}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget v0, v0, Lzt4;->c:I

    .line 97
    .line 98
    return v0
.end method


# virtual methods
.method public final A0(IIIZ)V
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    move p4, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p4, v2

    .line 11
    :goto_0
    const/4 v3, 0x2

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    move p3, v3

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    if-ne p3, v3, :cond_2

    .line 17
    .line 18
    move p3, v1

    .line 19
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lq41;->R:Z

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    move p2, v1

    .line 24
    goto :goto_2

    .line 25
    :cond_3
    if-ne p2, v1, :cond_5

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    const/4 p2, 0x4

    .line 30
    goto :goto_2

    .line 31
    :cond_4
    move p2, v2

    .line 32
    :cond_5
    :goto_2
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 33
    .line 34
    iget-boolean v0, p1, Lph3;->l:Z

    .line 35
    .line 36
    if-ne v0, p4, :cond_6

    .line 37
    .line 38
    iget v0, p1, Lph3;->n:I

    .line 39
    .line 40
    if-ne v0, p2, :cond_6

    .line 41
    .line 42
    iget v0, p1, Lph3;->m:I

    .line 43
    .line 44
    if-ne v0, p3, :cond_6

    .line 45
    .line 46
    goto :goto_5

    .line 47
    :cond_6
    invoke-virtual {p1, p3, p2, p4}, Lph3;->e(IIZ)Lph3;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lq41;->V:Lph3;

    .line 52
    .line 53
    invoke-virtual {p0, v2, v2}, Lq41;->D0(ZZ)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lq41;->F:Lro2;

    .line 57
    .line 58
    iget-object p2, p1, Lro2;->i:Loo2;

    .line 59
    .line 60
    :goto_3
    if-eqz p2, :cond_9

    .line 61
    .line 62
    iget-object p3, p2, Loo2;->o:Lew4;

    .line 63
    .line 64
    iget-object p3, p3, Lew4;->q:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p3, [Lt41;

    .line 67
    .line 68
    array-length v0, p3

    .line 69
    move v4, v2

    .line 70
    :goto_4
    if-ge v4, v0, :cond_8

    .line 71
    .line 72
    aget-object v5, p3, v4

    .line 73
    .line 74
    if-eqz v5, :cond_7

    .line 75
    .line 76
    invoke-interface {v5, p4}, Lt41;->f(Z)V

    .line 77
    .line 78
    .line 79
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_8
    iget-object p2, p2, Loo2;->m:Loo2;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_9
    invoke-virtual {p0}, Lq41;->r0()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_b

    .line 90
    .line 91
    invoke-virtual {p0}, Lq41;->v0()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lq41;->B0()V

    .line 95
    .line 96
    .line 97
    iget-object p2, p0, Lq41;->V:Lph3;

    .line 98
    .line 99
    iget-boolean p3, p2, Lph3;->p:Z

    .line 100
    .line 101
    if-eqz p3, :cond_a

    .line 102
    .line 103
    invoke-virtual {p2, v2}, Lph3;->i(Z)Lph3;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iput-object p2, p0, Lq41;->V:Lph3;

    .line 108
    .line 109
    :cond_a
    iget-wide p2, p0, Lq41;->k0:J

    .line 110
    .line 111
    invoke-virtual {p1, p2, p3}, Lro2;->n(J)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_b
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 116
    .line 117
    iget p1, p1, Lph3;->e:I

    .line 118
    .line 119
    const/4 p2, 0x3

    .line 120
    iget-object p3, p0, Lq41;->u:Lyp4;

    .line 121
    .line 122
    if-ne p1, p2, :cond_c

    .line 123
    .line 124
    iget-object p1, p0, Lq41;->B:Lxl0;

    .line 125
    .line 126
    iput-boolean v1, p1, Lxl0;->s:Z

    .line 127
    .line 128
    iget-object p1, p1, Lxl0;->n:Lzq2;

    .line 129
    .line 130
    invoke-virtual {p1}, Lzq2;->g()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lq41;->t0()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, v3}, Lyp4;->g(I)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_c
    if-ne p1, v3, :cond_d

    .line 141
    .line 142
    invoke-virtual {p3, v3}, Lyp4;->g(I)V

    .line 143
    .line 144
    .line 145
    :cond_d
    :goto_5
    return-void
.end method

.method public final B(ILmt2;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v1, v0, Lro2;->k:Loo2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_5

    .line 7
    .line 8
    iget-object v1, v1, Loo2;->g:Lpo2;

    .line 9
    .line 10
    iget-object v1, v1, Lpo2;->a:Lmt2;

    .line 11
    .line 12
    invoke-virtual {v1, p2}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    iget-object p0, p0, Lq41;->n:[Lez3;

    .line 20
    .line 21
    aget-object p0, p0, p1

    .line 22
    .line 23
    iget-object p1, v0, Lro2;->k:Loo2;

    .line 24
    .line 25
    iget p2, p0, Lez3;->d:I

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    const/4 v1, 0x1

    .line 29
    if-eq p2, v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    if-ne p2, v0, :cond_2

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Lez3;->d(Loo2;)Lkq;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iget-object v0, p0, Lez3;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lkq;

    .line 41
    .line 42
    if-ne p2, v0, :cond_2

    .line 43
    .line 44
    move p2, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move p2, v2

    .line 47
    :goto_0
    iget v0, p0, Lez3;->d:I

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    if-ne v0, v3, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lez3;->d(Loo2;)Lkq;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p0, p0, Lez3;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lkq;

    .line 59
    .line 60
    if-ne p1, p0, :cond_3

    .line 61
    .line 62
    move p0, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move p0, v2

    .line 65
    :goto_1
    if-nez p2, :cond_4

    .line 66
    .line 67
    if-eqz p0, :cond_5

    .line 68
    .line 69
    :cond_4
    return v1

    .line 70
    :cond_5
    :goto_2
    return v2
.end method

.method public final B0()V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 4
    .line 5
    iget-object v1, v1, Lro2;->i:Loo2;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_d

    .line 10
    .line 11
    :cond_0
    iget-boolean v2, v1, Loo2;->e:Z

    .line 12
    .line 13
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, Loo2;->a:Lno2;

    .line 21
    .line 22
    invoke-interface {v2}, Lno2;->l()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-wide v2, v10

    .line 28
    :goto_0
    cmp-long v4, v2, v10

    .line 29
    .line 30
    const/4 v12, 0x2

    .line 31
    const/16 v13, 0x10

    .line 32
    .line 33
    const/4 v14, 0x1

    .line 34
    const/4 v15, 0x0

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Loo2;->g()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    iget-object v4, v0, Lq41;->F:Lro2;

    .line 44
    .line 45
    invoke-virtual {v4, v1}, Lro2;->o(Loo2;)I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v15}, Lq41;->v(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lq41;->D()V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {v0, v14, v2, v3}, Lq41;->R(ZJ)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 58
    .line 59
    iget-wide v4, v1, Lph3;->s:J

    .line 60
    .line 61
    cmp-long v1, v2, v4

    .line 62
    .line 63
    if-eqz v1, :cond_13

    .line 64
    .line 65
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 66
    .line 67
    iget-object v4, v1, Lph3;->b:Lmt2;

    .line 68
    .line 69
    iget-wide v5, v1, Lph3;->c:J

    .line 70
    .line 71
    const/4 v8, 0x1

    .line 72
    const/4 v9, 0x5

    .line 73
    move-object v1, v4

    .line 74
    move-wide v4, v5

    .line 75
    move-wide v6, v2

    .line 76
    invoke-virtual/range {v0 .. v9}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v0, Lq41;->V:Lph3;

    .line 81
    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_3
    iget-object v2, v0, Lq41;->B:Lxl0;

    .line 85
    .line 86
    iget-object v3, v0, Lq41;->F:Lro2;

    .line 87
    .line 88
    iget-object v3, v3, Lro2;->j:Loo2;

    .line 89
    .line 90
    if-eq v1, v3, :cond_4

    .line 91
    .line 92
    move v3, v14

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    move v3, v15

    .line 95
    :goto_1
    iget-object v4, v2, Lxl0;->n:Lzq2;

    .line 96
    .line 97
    iget-object v5, v2, Lxl0;->p:Lkq;

    .line 98
    .line 99
    if-eqz v5, :cond_9

    .line 100
    .line 101
    invoke-virtual {v5}, Lkq;->m()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_9

    .line 106
    .line 107
    if-eqz v3, :cond_5

    .line 108
    .line 109
    iget-object v5, v2, Lxl0;->p:Lkq;

    .line 110
    .line 111
    iget v5, v5, Lkq;->u:I

    .line 112
    .line 113
    if-ne v5, v12, :cond_9

    .line 114
    .line 115
    :cond_5
    iget-object v5, v2, Lxl0;->p:Lkq;

    .line 116
    .line 117
    invoke-virtual {v5}, Lkq;->o()Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_6

    .line 122
    .line 123
    if-nez v3, :cond_9

    .line 124
    .line 125
    iget-object v3, v2, Lxl0;->p:Lkq;

    .line 126
    .line 127
    invoke-virtual {v3}, Lkq;->l()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_6

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    iget-object v3, v2, Lxl0;->q:Lyj2;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-interface {v3}, Lyj2;->j()J

    .line 140
    .line 141
    .line 142
    move-result-wide v5

    .line 143
    iget-boolean v7, v2, Lxl0;->r:Z

    .line 144
    .line 145
    if-eqz v7, :cond_8

    .line 146
    .line 147
    invoke-virtual {v4}, Lzq2;->j()J

    .line 148
    .line 149
    .line 150
    move-result-wide v7

    .line 151
    cmp-long v7, v5, v7

    .line 152
    .line 153
    if-gez v7, :cond_7

    .line 154
    .line 155
    iget-boolean v3, v4, Lzq2;->p:Z

    .line 156
    .line 157
    if-eqz v3, :cond_a

    .line 158
    .line 159
    invoke-virtual {v4}, Lzq2;->j()J

    .line 160
    .line 161
    .line 162
    move-result-wide v5

    .line 163
    invoke-virtual {v4, v5, v6}, Lzq2;->f(J)V

    .line 164
    .line 165
    .line 166
    iput-boolean v15, v4, Lzq2;->p:Z

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_7
    iput-boolean v15, v2, Lxl0;->r:Z

    .line 170
    .line 171
    iget-boolean v7, v2, Lxl0;->s:Z

    .line 172
    .line 173
    if-eqz v7, :cond_8

    .line 174
    .line 175
    invoke-virtual {v4}, Lzq2;->g()V

    .line 176
    .line 177
    .line 178
    :cond_8
    invoke-virtual {v4, v5, v6}, Lzq2;->f(J)V

    .line 179
    .line 180
    .line 181
    invoke-interface {v3}, Lyj2;->i()Lqh3;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    iget-object v5, v4, Lzq2;->r:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v5, Lqh3;

    .line 188
    .line 189
    invoke-virtual {v3, v5}, Lqh3;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-nez v5, :cond_a

    .line 194
    .line 195
    invoke-virtual {v4, v3}, Lzq2;->d(Lqh3;)V

    .line 196
    .line 197
    .line 198
    iget-object v4, v2, Lxl0;->o:Lq41;

    .line 199
    .line 200
    iget-object v4, v4, Lq41;->u:Lyp4;

    .line 201
    .line 202
    invoke-virtual {v4, v13, v3}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v3}, Lxp4;->b()V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_9
    :goto_2
    iput-boolean v14, v2, Lxl0;->r:Z

    .line 211
    .line 212
    iget-boolean v3, v2, Lxl0;->s:Z

    .line 213
    .line 214
    if-eqz v3, :cond_a

    .line 215
    .line 216
    invoke-virtual {v4}, Lzq2;->g()V

    .line 217
    .line 218
    .line 219
    :cond_a
    :goto_3
    invoke-virtual {v2}, Lxl0;->j()J

    .line 220
    .line 221
    .line 222
    move-result-wide v2

    .line 223
    iput-wide v2, v0, Lq41;->k0:J

    .line 224
    .line 225
    iget-wide v4, v1, Loo2;->p:J

    .line 226
    .line 227
    sub-long/2addr v2, v4

    .line 228
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 229
    .line 230
    iget-wide v4, v1, Lph3;->s:J

    .line 231
    .line 232
    iget-object v1, v0, Lq41;->C:Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-nez v1, :cond_11

    .line 239
    .line 240
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 241
    .line 242
    iget-object v1, v1, Lph3;->b:Lmt2;

    .line 243
    .line 244
    invoke-virtual {v1}, Lmt2;->b()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_b

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_b
    iget-boolean v1, v0, Lq41;->n0:Z

    .line 252
    .line 253
    if-eqz v1, :cond_c

    .line 254
    .line 255
    iput-boolean v15, v0, Lq41;->n0:Z

    .line 256
    .line 257
    :cond_c
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 258
    .line 259
    iget-object v4, v1, Lph3;->a:Lcu4;

    .line 260
    .line 261
    iget-object v1, v1, Lph3;->b:Lmt2;

    .line 262
    .line 263
    iget-object v1, v1, Lmt2;->a:Ljava/lang/Object;

    .line 264
    .line 265
    invoke-virtual {v4, v1}, Lcu4;->b(Ljava/lang/Object;)I

    .line 266
    .line 267
    .line 268
    iget v1, v0, Lq41;->m0:I

    .line 269
    .line 270
    iget-object v4, v0, Lq41;->C:Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-lez v1, :cond_e

    .line 281
    .line 282
    iget-object v4, v0, Lq41;->C:Ljava/util/ArrayList;

    .line 283
    .line 284
    add-int/lit8 v5, v1, -0x1

    .line 285
    .line 286
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    if-nez v4, :cond_d

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_d
    invoke-static {}, Lkf2;->k()V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :cond_e
    :goto_4
    iget-object v4, v0, Lq41;->C:Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-ge v1, v4, :cond_10

    .line 304
    .line 305
    iget-object v4, v0, Lq41;->C:Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    if-nez v4, :cond_f

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_f
    invoke-static {}, Lkf2;->k()V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_10
    :goto_5
    iput v1, v0, Lq41;->m0:I

    .line 319
    .line 320
    :cond_11
    :goto_6
    iget-object v1, v0, Lq41;->B:Lxl0;

    .line 321
    .line 322
    invoke-virtual {v1}, Lxl0;->k()Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_12

    .line 327
    .line 328
    iget-object v1, v0, Lq41;->W:Ln41;

    .line 329
    .line 330
    iget-boolean v1, v1, Ln41;->e:Z

    .line 331
    .line 332
    xor-int/lit8 v8, v1, 0x1

    .line 333
    .line 334
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 335
    .line 336
    iget-object v4, v1, Lph3;->b:Lmt2;

    .line 337
    .line 338
    iget-wide v5, v1, Lph3;->c:J

    .line 339
    .line 340
    const/4 v9, 0x6

    .line 341
    move-object v1, v4

    .line 342
    move-wide v4, v5

    .line 343
    move-wide v6, v2

    .line 344
    invoke-virtual/range {v0 .. v9}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    iput-object v1, v0, Lq41;->V:Lph3;

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_12
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 352
    .line 353
    iput-wide v2, v1, Lph3;->s:J

    .line 354
    .line 355
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 356
    .line 357
    .line 358
    move-result-wide v2

    .line 359
    iput-wide v2, v1, Lph3;->t:J

    .line 360
    .line 361
    :cond_13
    :goto_7
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 362
    .line 363
    iget-object v1, v1, Lro2;->l:Loo2;

    .line 364
    .line 365
    iget-object v2, v0, Lq41;->V:Lph3;

    .line 366
    .line 367
    invoke-virtual {v1}, Loo2;->d()J

    .line 368
    .line 369
    .line 370
    move-result-wide v3

    .line 371
    iput-wide v3, v2, Lph3;->q:J

    .line 372
    .line 373
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 374
    .line 375
    iget-wide v2, v1, Lph3;->q:J

    .line 376
    .line 377
    invoke-virtual {v0, v2, v3}, Lq41;->q(J)J

    .line 378
    .line 379
    .line 380
    move-result-wide v2

    .line 381
    iput-wide v2, v1, Lph3;->r:J

    .line 382
    .line 383
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 384
    .line 385
    iget-boolean v2, v1, Lph3;->l:Z

    .line 386
    .line 387
    if-eqz v2, :cond_1d

    .line 388
    .line 389
    iget v2, v1, Lph3;->e:I

    .line 390
    .line 391
    const/4 v3, 0x3

    .line 392
    if-ne v2, v3, :cond_1d

    .line 393
    .line 394
    iget-object v2, v1, Lph3;->a:Lcu4;

    .line 395
    .line 396
    iget-object v1, v1, Lph3;->b:Lmt2;

    .line 397
    .line 398
    invoke-virtual {v0, v2, v1}, Lq41;->s0(Lcu4;Lmt2;)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_1d

    .line 403
    .line 404
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 405
    .line 406
    iget-object v2, v1, Lph3;->o:Lqh3;

    .line 407
    .line 408
    iget v2, v2, Lqh3;->a:F

    .line 409
    .line 410
    const/high16 v4, 0x3f800000    # 1.0f

    .line 411
    .line 412
    cmpl-float v2, v2, v4

    .line 413
    .line 414
    if-nez v2, :cond_1d

    .line 415
    .line 416
    iget-object v2, v0, Lq41;->H:Lul0;

    .line 417
    .line 418
    iget-object v5, v1, Lph3;->a:Lcu4;

    .line 419
    .line 420
    iget-object v6, v1, Lph3;->b:Lmt2;

    .line 421
    .line 422
    iget-object v6, v6, Lmt2;->a:Ljava/lang/Object;

    .line 423
    .line 424
    iget-wide v7, v1, Lph3;->s:J

    .line 425
    .line 426
    invoke-virtual {v0, v5, v6, v7, v8}, Lq41;->n(Lcu4;Ljava/lang/Object;J)J

    .line 427
    .line 428
    .line 429
    move-result-wide v5

    .line 430
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 431
    .line 432
    iget-wide v7, v1, Lph3;->r:J

    .line 433
    .line 434
    move-wide/from16 v16, v10

    .line 435
    .line 436
    iget-wide v10, v2, Lul0;->c:J

    .line 437
    .line 438
    cmp-long v1, v10, v16

    .line 439
    .line 440
    if-nez v1, :cond_14

    .line 441
    .line 442
    goto/16 :goto_c

    .line 443
    .line 444
    :cond_14
    sub-long v7, v5, v7

    .line 445
    .line 446
    iget-wide v9, v2, Lul0;->m:J

    .line 447
    .line 448
    cmp-long v1, v9, v16

    .line 449
    .line 450
    if-nez v1, :cond_15

    .line 451
    .line 452
    iput-wide v7, v2, Lul0;->m:J

    .line 453
    .line 454
    const-wide/16 v7, 0x0

    .line 455
    .line 456
    iput-wide v7, v2, Lul0;->n:J

    .line 457
    .line 458
    goto :goto_8

    .line 459
    :cond_15
    long-to-float v1, v9

    .line 460
    const v9, 0x3f7fbe77    # 0.999f

    .line 461
    .line 462
    .line 463
    mul-float/2addr v1, v9

    .line 464
    long-to-float v10, v7

    .line 465
    const v11, 0x3a831200    # 9.999871E-4f

    .line 466
    .line 467
    .line 468
    mul-float/2addr v10, v11

    .line 469
    add-float/2addr v10, v1

    .line 470
    move v1, v9

    .line 471
    float-to-long v9, v10

    .line 472
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 473
    .line 474
    .line 475
    move-result-wide v9

    .line 476
    iput-wide v9, v2, Lul0;->m:J

    .line 477
    .line 478
    sub-long/2addr v7, v9

    .line 479
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 480
    .line 481
    .line 482
    move-result-wide v7

    .line 483
    iget-wide v9, v2, Lul0;->n:J

    .line 484
    .line 485
    long-to-float v9, v9

    .line 486
    mul-float/2addr v9, v1

    .line 487
    long-to-float v1, v7

    .line 488
    mul-float/2addr v11, v1

    .line 489
    add-float/2addr v11, v9

    .line 490
    float-to-long v7, v11

    .line 491
    iput-wide v7, v2, Lul0;->n:J

    .line 492
    .line 493
    :goto_8
    iget-wide v7, v2, Lul0;->l:J

    .line 494
    .line 495
    cmp-long v1, v7, v16

    .line 496
    .line 497
    if-eqz v1, :cond_16

    .line 498
    .line 499
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 500
    .line 501
    .line 502
    move-result-wide v9

    .line 503
    const-wide/16 v18, 0x3e8

    .line 504
    .line 505
    iget-wide v7, v2, Lul0;->l:J

    .line 506
    .line 507
    sub-long/2addr v9, v7

    .line 508
    cmp-long v1, v9, v18

    .line 509
    .line 510
    if-gez v1, :cond_17

    .line 511
    .line 512
    iget v4, v2, Lul0;->k:F

    .line 513
    .line 514
    goto/16 :goto_c

    .line 515
    .line 516
    :cond_16
    const-wide/16 v18, 0x3e8

    .line 517
    .line 518
    :cond_17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 519
    .line 520
    .line 521
    move-result-wide v7

    .line 522
    iput-wide v7, v2, Lul0;->l:J

    .line 523
    .line 524
    iget-wide v7, v2, Lul0;->m:J

    .line 525
    .line 526
    const-wide/16 v20, 0x3

    .line 527
    .line 528
    iget-wide v9, v2, Lul0;->n:J

    .line 529
    .line 530
    mul-long v9, v9, v20

    .line 531
    .line 532
    add-long v24, v9, v7

    .line 533
    .line 534
    iget-wide v7, v2, Lul0;->h:J

    .line 535
    .line 536
    cmp-long v1, v7, v24

    .line 537
    .line 538
    if-lez v1, :cond_1a

    .line 539
    .line 540
    invoke-static/range {v18 .. v19}, Lf35;->Q(J)J

    .line 541
    .line 542
    .line 543
    move-result-wide v8

    .line 544
    iget v1, v2, Lul0;->k:F

    .line 545
    .line 546
    sub-float/2addr v1, v4

    .line 547
    long-to-float v8, v8

    .line 548
    mul-float/2addr v1, v8

    .line 549
    float-to-long v9, v1

    .line 550
    iget v1, v2, Lul0;->i:F

    .line 551
    .line 552
    sub-float/2addr v1, v4

    .line 553
    mul-float/2addr v1, v8

    .line 554
    const v11, 0x33d6bf95    # 1.0E-7f

    .line 555
    .line 556
    .line 557
    float-to-long v7, v1

    .line 558
    add-long/2addr v9, v7

    .line 559
    iget-wide v7, v2, Lul0;->e:J

    .line 560
    .line 561
    move/from16 v18, v11

    .line 562
    .line 563
    move v1, v12

    .line 564
    iget-wide v11, v2, Lul0;->h:J

    .line 565
    .line 566
    sub-long/2addr v11, v9

    .line 567
    new-array v9, v3, [J

    .line 568
    .line 569
    aput-wide v24, v9, v15

    .line 570
    .line 571
    aput-wide v7, v9, v14

    .line 572
    .line 573
    aput-wide v11, v9, v1

    .line 574
    .line 575
    aget-wide v7, v9, v15

    .line 576
    .line 577
    :goto_9
    if-ge v14, v3, :cond_19

    .line 578
    .line 579
    aget-wide v10, v9, v14

    .line 580
    .line 581
    cmp-long v1, v10, v7

    .line 582
    .line 583
    if-lez v1, :cond_18

    .line 584
    .line 585
    move-wide v7, v10

    .line 586
    :cond_18
    add-int/lit8 v14, v14, 0x1

    .line 587
    .line 588
    goto :goto_9

    .line 589
    :cond_19
    iput-wide v7, v2, Lul0;->h:J

    .line 590
    .line 591
    goto :goto_a

    .line 592
    :cond_1a
    const v18, 0x33d6bf95    # 1.0E-7f

    .line 593
    .line 594
    .line 595
    iget v1, v2, Lul0;->k:F

    .line 596
    .line 597
    sub-float/2addr v1, v4

    .line 598
    const/4 v3, 0x0

    .line 599
    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    div-float v1, v1, v18

    .line 604
    .line 605
    float-to-long v7, v1

    .line 606
    sub-long v20, v5, v7

    .line 607
    .line 608
    iget-wide v7, v2, Lul0;->h:J

    .line 609
    .line 610
    move-wide/from16 v22, v7

    .line 611
    .line 612
    invoke-static/range {v20 .. v25}, Lf35;->k(JJJ)J

    .line 613
    .line 614
    .line 615
    move-result-wide v7

    .line 616
    iput-wide v7, v2, Lul0;->h:J

    .line 617
    .line 618
    iget-wide v9, v2, Lul0;->g:J

    .line 619
    .line 620
    cmp-long v1, v9, v16

    .line 621
    .line 622
    if-eqz v1, :cond_1b

    .line 623
    .line 624
    cmp-long v1, v7, v9

    .line 625
    .line 626
    if-lez v1, :cond_1b

    .line 627
    .line 628
    iput-wide v9, v2, Lul0;->h:J

    .line 629
    .line 630
    :cond_1b
    :goto_a
    iget-wide v7, v2, Lul0;->h:J

    .line 631
    .line 632
    sub-long/2addr v5, v7

    .line 633
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 634
    .line 635
    .line 636
    move-result-wide v7

    .line 637
    iget-wide v9, v2, Lul0;->a:J

    .line 638
    .line 639
    cmp-long v1, v7, v9

    .line 640
    .line 641
    if-gez v1, :cond_1c

    .line 642
    .line 643
    iput v4, v2, Lul0;->k:F

    .line 644
    .line 645
    goto :goto_b

    .line 646
    :cond_1c
    long-to-float v1, v5

    .line 647
    mul-float v7, v18, v1

    .line 648
    .line 649
    add-float/2addr v7, v4

    .line 650
    iget v1, v2, Lul0;->j:F

    .line 651
    .line 652
    iget v3, v2, Lul0;->i:F

    .line 653
    .line 654
    invoke-static {v7, v1, v3}, Lf35;->i(FFF)F

    .line 655
    .line 656
    .line 657
    move-result v1

    .line 658
    iput v1, v2, Lul0;->k:F

    .line 659
    .line 660
    :goto_b
    iget v4, v2, Lul0;->k:F

    .line 661
    .line 662
    :goto_c
    iget-object v1, v0, Lq41;->B:Lxl0;

    .line 663
    .line 664
    invoke-virtual {v1}, Lxl0;->i()Lqh3;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    iget v1, v1, Lqh3;->a:F

    .line 669
    .line 670
    cmpl-float v1, v1, v4

    .line 671
    .line 672
    if-eqz v1, :cond_1d

    .line 673
    .line 674
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 675
    .line 676
    iget-object v1, v1, Lph3;->o:Lqh3;

    .line 677
    .line 678
    new-instance v2, Lqh3;

    .line 679
    .line 680
    iget v1, v1, Lqh3;->b:F

    .line 681
    .line 682
    invoke-direct {v2, v4, v1}, Lqh3;-><init>(FF)V

    .line 683
    .line 684
    .line 685
    iget-object v1, v0, Lq41;->u:Lyp4;

    .line 686
    .line 687
    invoke-virtual {v1, v13}, Lyp4;->f(I)V

    .line 688
    .line 689
    .line 690
    iget-object v1, v0, Lq41;->B:Lxl0;

    .line 691
    .line 692
    invoke-virtual {v1, v2}, Lxl0;->d(Lqh3;)V

    .line 693
    .line 694
    .line 695
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 696
    .line 697
    iget-object v1, v1, Lph3;->o:Lqh3;

    .line 698
    .line 699
    iget-object v2, v0, Lq41;->B:Lxl0;

    .line 700
    .line 701
    invoke-virtual {v2}, Lxl0;->i()Lqh3;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    iget v2, v2, Lqh3;->a:F

    .line 706
    .line 707
    invoke-virtual {v0, v1, v2, v15, v15}, Lq41;->y(Lqh3;FZZ)V

    .line 708
    .line 709
    .line 710
    :cond_1d
    :goto_d
    return-void
.end method

.method public final C()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v0, v0, Lro2;->i:Loo2;

    .line 4
    .line 5
    iget-object v1, v0, Loo2;->g:Lpo2;

    .line 6
    .line 7
    iget-wide v1, v1, Lpo2;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, Loo2;->e:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lq41;->V:Lph3;

    .line 23
    .line 24
    iget-wide v3, v0, Lph3;->s:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lq41;->r0()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    :cond_0
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public final C0(Lcu4;Lmt2;Lcu4;Lmt2;JZ)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lq41;->s0(Lcu4;Lmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p2, Lmt2;->a:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2}, Lmt2;->b()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    sget-object p1, Lqh3;->d:Lqh3;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 19
    .line 20
    iget-object p1, p1, Lph3;->o:Lqh3;

    .line 21
    .line 22
    :goto_0
    iget-object p2, p0, Lq41;->B:Lxl0;

    .line 23
    .line 24
    invoke-virtual {p2}, Lxl0;->i()Lqh3;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p3, p1}, Lqh3;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-nez p3, :cond_7

    .line 33
    .line 34
    iget-object p3, p0, Lq41;->u:Lyp4;

    .line 35
    .line 36
    const/16 p4, 0x10

    .line 37
    .line 38
    invoke-virtual {p3, p4}, Lyp4;->f(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Lxl0;->d(Lqh3;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lq41;->V:Lph3;

    .line 45
    .line 46
    iget-object p2, p2, Lph3;->o:Lqh3;

    .line 47
    .line 48
    iget p1, p1, Lqh3;->a:F

    .line 49
    .line 50
    const/4 p3, 0x0

    .line 51
    invoke-virtual {p0, p2, p1, p3, p3}, Lq41;->y(Lqh3;FZZ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget-object p2, p0, Lq41;->y:Lzt4;

    .line 56
    .line 57
    invoke-virtual {p1, v1, p2}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v0, v0, Lzt4;->c:I

    .line 62
    .line 63
    iget-object v2, p0, Lq41;->x:Lbu4;

    .line 64
    .line 65
    invoke-virtual {p1, v0, v2}, Lcu4;->n(ILbu4;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v2, Lbu4;->i:Lan2;

    .line 69
    .line 70
    iget-object v3, p0, Lq41;->H:Lul0;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-wide v4, v0, Lan2;->a:J

    .line 76
    .line 77
    invoke-static {v4, v5}, Lf35;->Q(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    iput-wide v4, v3, Lul0;->c:J

    .line 82
    .line 83
    iget-wide v4, v0, Lan2;->b:J

    .line 84
    .line 85
    invoke-static {v4, v5}, Lf35;->Q(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    iput-wide v4, v3, Lul0;->f:J

    .line 90
    .line 91
    iget-wide v4, v0, Lan2;->c:J

    .line 92
    .line 93
    invoke-static {v4, v5}, Lf35;->Q(J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    iput-wide v4, v3, Lul0;->g:J

    .line 98
    .line 99
    iget v4, v0, Lan2;->d:F

    .line 100
    .line 101
    const v5, -0x800001

    .line 102
    .line 103
    .line 104
    cmpl-float v6, v4, v5

    .line 105
    .line 106
    if-eqz v6, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    const v4, 0x3f7851ec    # 0.97f

    .line 110
    .line 111
    .line 112
    :goto_1
    iput v4, v3, Lul0;->j:F

    .line 113
    .line 114
    iget v0, v0, Lan2;->e:F

    .line 115
    .line 116
    cmpl-float v5, v0, v5

    .line 117
    .line 118
    if-eqz v5, :cond_3

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    const v0, 0x3f83d70a    # 1.03f

    .line 122
    .line 123
    .line 124
    :goto_2
    iput v0, v3, Lul0;->i:F

    .line 125
    .line 126
    const/high16 v5, 0x3f800000    # 1.0f

    .line 127
    .line 128
    cmpl-float v4, v4, v5

    .line 129
    .line 130
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    if-nez v4, :cond_4

    .line 136
    .line 137
    cmpl-float v0, v0, v5

    .line 138
    .line 139
    if-nez v0, :cond_4

    .line 140
    .line 141
    iput-wide v6, v3, Lul0;->c:J

    .line 142
    .line 143
    :cond_4
    invoke-virtual {v3}, Lul0;->a()V

    .line 144
    .line 145
    .line 146
    cmp-long v0, p5, v6

    .line 147
    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    invoke-virtual {p0, p1, v1, p5, p6}, Lq41;->n(Lcu4;Ljava/lang/Object;J)J

    .line 151
    .line 152
    .line 153
    move-result-wide p0

    .line 154
    iput-wide p0, v3, Lul0;->d:J

    .line 155
    .line 156
    invoke-virtual {v3}, Lul0;->a()V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_5
    iget-object p0, v2, Lbu4;->a:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {p3}, Lcu4;->p()Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-nez p1, :cond_6

    .line 167
    .line 168
    iget-object p1, p4, Lmt2;->a:Ljava/lang/Object;

    .line 169
    .line 170
    invoke-virtual {p3, p1, p2}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iget p1, p1, Lzt4;->c:I

    .line 175
    .line 176
    const-wide/16 p4, 0x0

    .line 177
    .line 178
    invoke-virtual {p3, p1, v2, p4, p5}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iget-object p1, p1, Lbu4;->a:Ljava/lang/Object;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_6
    const/4 p1, 0x0

    .line 186
    :goto_3
    invoke-static {p1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_8

    .line 191
    .line 192
    if-eqz p7, :cond_7

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_7
    return-void

    .line 196
    :cond_8
    :goto_4
    iput-wide v6, v3, Lul0;->d:J

    .line 197
    .line 198
    invoke-virtual {v3}, Lul0;->a()V

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method public final D()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 4
    .line 5
    iget-object v1, v1, Lro2;->l:Loo2;

    .line 6
    .line 7
    invoke-static {v1}, Lq41;->A(Loo2;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v6

    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 25
    .line 26
    iget-object v1, v1, Lro2;->l:Loo2;

    .line 27
    .line 28
    iget-boolean v7, v1, Loo2;->e:Z

    .line 29
    .line 30
    if-nez v7, :cond_1

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v7, v1, Loo2;->a:Lno2;

    .line 35
    .line 36
    invoke-interface {v7}, Lda4;->d()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    :goto_0
    invoke-virtual {v0, v7, v8}, Lq41;->q(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v15

    .line 44
    iget-object v7, v0, Lq41;->F:Lro2;

    .line 45
    .line 46
    iget-object v7, v7, Lro2;->i:Loo2;

    .line 47
    .line 48
    iget-wide v8, v0, Lq41;->k0:J

    .line 49
    .line 50
    iget-wide v10, v1, Loo2;->p:J

    .line 51
    .line 52
    if-ne v1, v7, :cond_2

    .line 53
    .line 54
    :goto_1
    sub-long/2addr v8, v10

    .line 55
    move-wide v13, v8

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    sub-long/2addr v8, v10

    .line 58
    iget-object v7, v1, Loo2;->g:Lpo2;

    .line 59
    .line 60
    iget-wide v10, v7, Lpo2;->b:J

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :goto_2
    iget-object v7, v0, Lq41;->V:Lph3;

    .line 64
    .line 65
    iget-object v7, v7, Lph3;->a:Lcu4;

    .line 66
    .line 67
    iget-object v8, v1, Loo2;->g:Lpo2;

    .line 68
    .line 69
    iget-object v8, v8, Lpo2;->a:Lmt2;

    .line 70
    .line 71
    invoke-virtual {v0, v7, v8}, Lq41;->s0(Lcu4;Lmt2;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    iget-object v7, v0, Lq41;->H:Lul0;

    .line 78
    .line 79
    iget-wide v7, v7, Lul0;->h:J

    .line 80
    .line 81
    move-wide/from16 v19, v7

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    move-wide/from16 v19, v2

    .line 85
    .line 86
    :goto_3
    new-instance v9, Lbd2;

    .line 87
    .line 88
    iget-object v10, v0, Lq41;->J:Lik3;

    .line 89
    .line 90
    iget-object v7, v0, Lq41;->V:Lph3;

    .line 91
    .line 92
    iget-object v11, v7, Lph3;->a:Lcu4;

    .line 93
    .line 94
    iget-object v1, v1, Loo2;->g:Lpo2;

    .line 95
    .line 96
    iget-object v12, v1, Lpo2;->a:Lmt2;

    .line 97
    .line 98
    iget-object v1, v0, Lq41;->B:Lxl0;

    .line 99
    .line 100
    invoke-virtual {v1}, Lxl0;->i()Lqh3;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget v1, v1, Lqh3;->a:F

    .line 105
    .line 106
    iget-object v7, v0, Lq41;->V:Lph3;

    .line 107
    .line 108
    iget-boolean v7, v7, Lph3;->l:Z

    .line 109
    .line 110
    iget-boolean v7, v0, Lq41;->a0:Z

    .line 111
    .line 112
    move/from16 v17, v1

    .line 113
    .line 114
    move/from16 v18, v7

    .line 115
    .line 116
    invoke-direct/range {v9 .. v20}, Lbd2;-><init>(Lik3;Lcu4;Lmt2;JJFZJ)V

    .line 117
    .line 118
    .line 119
    iget-object v1, v0, Lq41;->s:Lcd2;

    .line 120
    .line 121
    invoke-interface {v1, v9}, Lcd2;->h(Lbd2;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    iget-object v7, v0, Lq41;->F:Lro2;

    .line 126
    .line 127
    iget-object v7, v7, Lro2;->i:Loo2;

    .line 128
    .line 129
    if-nez v1, :cond_5

    .line 130
    .line 131
    iget-boolean v8, v7, Loo2;->e:Z

    .line 132
    .line 133
    if-eqz v8, :cond_5

    .line 134
    .line 135
    const-wide/32 v10, 0x7a120

    .line 136
    .line 137
    .line 138
    cmp-long v8, v15, v10

    .line 139
    .line 140
    if-gez v8, :cond_5

    .line 141
    .line 142
    iget-wide v10, v0, Lq41;->z:J

    .line 143
    .line 144
    cmp-long v8, v10, v4

    .line 145
    .line 146
    if-gtz v8, :cond_4

    .line 147
    .line 148
    iget-boolean v8, v0, Lq41;->A:Z

    .line 149
    .line 150
    if-eqz v8, :cond_5

    .line 151
    .line 152
    :cond_4
    iget-object v1, v7, Loo2;->a:Lno2;

    .line 153
    .line 154
    iget-object v7, v0, Lq41;->V:Lph3;

    .line 155
    .line 156
    iget-wide v7, v7, Lph3;->s:J

    .line 157
    .line 158
    invoke-interface {v1, v6, v7, v8}, Lno2;->k(ZJ)V

    .line 159
    .line 160
    .line 161
    iget-object v1, v0, Lq41;->s:Lcd2;

    .line 162
    .line 163
    invoke-interface {v1, v9}, Lcd2;->h(Lbd2;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    :cond_5
    :goto_4
    iput-boolean v1, v0, Lq41;->c0:Z

    .line 168
    .line 169
    if-eqz v1, :cond_b

    .line 170
    .line 171
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 172
    .line 173
    iget-object v1, v1, Lro2;->l:Loo2;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v7, Lod2;

    .line 179
    .line 180
    invoke-direct {v7}, Lod2;-><init>()V

    .line 181
    .line 182
    .line 183
    iget-wide v8, v0, Lq41;->k0:J

    .line 184
    .line 185
    iget-wide v10, v1, Loo2;->p:J

    .line 186
    .line 187
    sub-long/2addr v8, v10

    .line 188
    iput-wide v8, v7, Lod2;->a:J

    .line 189
    .line 190
    iget-object v8, v0, Lq41;->B:Lxl0;

    .line 191
    .line 192
    invoke-virtual {v8}, Lxl0;->i()Lqh3;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    iget v8, v8, Lqh3;->a:F

    .line 197
    .line 198
    const/4 v9, 0x0

    .line 199
    cmpl-float v9, v8, v9

    .line 200
    .line 201
    const/4 v10, 0x1

    .line 202
    if-gtz v9, :cond_7

    .line 203
    .line 204
    const v9, -0x800001

    .line 205
    .line 206
    .line 207
    cmpl-float v9, v8, v9

    .line 208
    .line 209
    if-nez v9, :cond_6

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_6
    move v9, v6

    .line 213
    goto :goto_6

    .line 214
    :cond_7
    :goto_5
    move v9, v10

    .line 215
    :goto_6
    invoke-static {v9}, Lrr2;->l(Z)V

    .line 216
    .line 217
    .line 218
    iput v8, v7, Lod2;->b:F

    .line 219
    .line 220
    iget-wide v8, v0, Lq41;->b0:J

    .line 221
    .line 222
    cmp-long v4, v8, v4

    .line 223
    .line 224
    if-gez v4, :cond_9

    .line 225
    .line 226
    cmp-long v2, v8, v2

    .line 227
    .line 228
    if-nez v2, :cond_8

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_8
    move v2, v6

    .line 232
    goto :goto_8

    .line 233
    :cond_9
    :goto_7
    move v2, v10

    .line 234
    :goto_8
    invoke-static {v2}, Lrr2;->l(Z)V

    .line 235
    .line 236
    .line 237
    iput-wide v8, v7, Lod2;->c:J

    .line 238
    .line 239
    new-instance v2, Lpd2;

    .line 240
    .line 241
    invoke-direct {v2, v7}, Lpd2;-><init>(Lod2;)V

    .line 242
    .line 243
    .line 244
    iget-object v3, v1, Loo2;->m:Loo2;

    .line 245
    .line 246
    if-nez v3, :cond_a

    .line 247
    .line 248
    move v6, v10

    .line 249
    :cond_a
    invoke-static {v6}, Lrr2;->w(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v1, v1, Loo2;->a:Lno2;

    .line 253
    .line 254
    invoke-interface {v1, v2}, Lda4;->o(Lpd2;)Z

    .line 255
    .line 256
    .line 257
    :cond_b
    invoke-virtual {v0}, Lq41;->w0()V

    .line 258
    .line 259
    .line 260
    return-void
.end method

.method public final D0(ZZ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq41;->a0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lq41;->D:Lvp4;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :goto_0
    iput-wide p1, p0, Lq41;->b0:J

    .line 23
    .line 24
    return-void
.end method

.method public final E()V
    .locals 11

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lro2;->l()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lro2;->m:Loo2;

    .line 7
    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    iget-object v1, v0, Loo2;->a:Lno2;

    .line 11
    .line 12
    iget-boolean v2, v0, Loo2;->d:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-boolean v2, v0, Loo2;->e:Z

    .line 17
    .line 18
    if-eqz v2, :cond_9

    .line 19
    .line 20
    :cond_0
    invoke-interface {v1}, Lda4;->f()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_9

    .line 25
    .line 26
    iget-object v2, p0, Lq41;->V:Lph3;

    .line 27
    .line 28
    iget-object v5, v2, Lph3;->a:Lcu4;

    .line 29
    .line 30
    iget-object v2, v0, Loo2;->g:Lpo2;

    .line 31
    .line 32
    iget-object v6, v2, Lpo2;->a:Lmt2;

    .line 33
    .line 34
    iget-boolean v2, v0, Loo2;->e:Z

    .line 35
    .line 36
    const-wide/16 v9, 0x0

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-interface {v1}, Lda4;->q()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    move-wide v7, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-wide v7, v9

    .line 47
    :goto_0
    iget-object v3, p0, Lq41;->s:Lcd2;

    .line 48
    .line 49
    iget-object v4, p0, Lq41;->J:Lik3;

    .line 50
    .line 51
    invoke-interface/range {v3 .. v8}, Lcd2;->a(Lik3;Lcu4;Lmt2;J)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    goto :goto_6

    .line 58
    :cond_2
    iget-boolean v2, v0, Loo2;->d:Z

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    iget-object v2, v0, Loo2;->g:Lpo2;

    .line 64
    .line 65
    iget-wide v4, v2, Lpo2;->b:J

    .line 66
    .line 67
    iput-boolean v3, v0, Loo2;->d:Z

    .line 68
    .line 69
    invoke-interface {v1, p0, v4, v5}, Lno2;->m(Lmo2;J)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    new-instance v2, Lod2;

    .line 74
    .line 75
    invoke-direct {v2}, Lod2;-><init>()V

    .line 76
    .line 77
    .line 78
    iget-wide v4, p0, Lq41;->k0:J

    .line 79
    .line 80
    iget-wide v6, v0, Loo2;->p:J

    .line 81
    .line 82
    sub-long/2addr v4, v6

    .line 83
    iput-wide v4, v2, Lod2;->a:J

    .line 84
    .line 85
    iget-object v4, p0, Lq41;->B:Lxl0;

    .line 86
    .line 87
    invoke-virtual {v4}, Lxl0;->i()Lqh3;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget v4, v4, Lqh3;->a:F

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    cmpl-float v5, v4, v5

    .line 95
    .line 96
    const/4 v6, 0x0

    .line 97
    if-gtz v5, :cond_5

    .line 98
    .line 99
    const v5, -0x800001

    .line 100
    .line 101
    .line 102
    cmpl-float v5, v4, v5

    .line 103
    .line 104
    if-nez v5, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    move v5, v6

    .line 108
    goto :goto_2

    .line 109
    :cond_5
    :goto_1
    move v5, v3

    .line 110
    :goto_2
    invoke-static {v5}, Lrr2;->l(Z)V

    .line 111
    .line 112
    .line 113
    iput v4, v2, Lod2;->b:F

    .line 114
    .line 115
    iget-wide v4, p0, Lq41;->b0:J

    .line 116
    .line 117
    cmp-long p0, v4, v9

    .line 118
    .line 119
    if-gez p0, :cond_7

    .line 120
    .line 121
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    cmp-long p0, v4, v7

    .line 127
    .line 128
    if-nez p0, :cond_6

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move p0, v6

    .line 132
    goto :goto_4

    .line 133
    :cond_7
    :goto_3
    move p0, v3

    .line 134
    :goto_4
    invoke-static {p0}, Lrr2;->l(Z)V

    .line 135
    .line 136
    .line 137
    iput-wide v4, v2, Lod2;->c:J

    .line 138
    .line 139
    new-instance p0, Lpd2;

    .line 140
    .line 141
    invoke-direct {p0, v2}, Lpd2;-><init>(Lod2;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, Loo2;->m:Loo2;

    .line 145
    .line 146
    if-nez v0, :cond_8

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_8
    move v3, v6

    .line 150
    :goto_5
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v1, p0}, Lda4;->o(Lpd2;)Z

    .line 154
    .line 155
    .line 156
    :cond_9
    :goto_6
    return-void
.end method

.method public final F()V
    .locals 5

    .line 1
    iget-object v0, p0, Lq41;->W:Ln41;

    .line 2
    .line 3
    iget-object v1, p0, Lq41;->V:Lph3;

    .line 4
    .line 5
    iget-boolean v2, v0, Ln41;->d:Z

    .line 6
    .line 7
    iget-object v3, v0, Ln41;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lph3;

    .line 10
    .line 11
    if-eq v3, v1, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    or-int/2addr v2, v3

    .line 17
    iput-boolean v2, v0, Ln41;->d:Z

    .line 18
    .line 19
    iput-object v1, v0, Ln41;->f:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lq41;->E:Lu31;

    .line 24
    .line 25
    iget-object v1, v1, Lu31;->o:Li41;

    .line 26
    .line 27
    iget-object v2, v1, Li41;->k:Lyp4;

    .line 28
    .line 29
    new-instance v3, Lk6;

    .line 30
    .line 31
    const/16 v4, 0x18

    .line 32
    .line 33
    invoke-direct {v3, v4, v1, v0}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Ln41;

    .line 40
    .line 41
    iget-object v1, p0, Lq41;->V:Lph3;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ln41;-><init>(Lph3;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lq41;->W:Ln41;

    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final G(I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lq41;->n:[Lez3;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 6
    .line 7
    iget-object v0, v0, Lro2;->i:Loo2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lez3;->d(Loo2;)Lkq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lkq;->v:Lq44;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lq44;->s()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto :goto_0

    .line 30
    :catch_1
    move-exception v0

    .line 31
    :goto_0
    iget-object v1, v1, Lez3;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lkq;

    .line 34
    .line 35
    iget v1, v1, Lkq;->o:I

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    if-eq v1, v2, :cond_1

    .line 39
    .line 40
    const/4 v2, 0x5

    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    throw v0

    .line 45
    :cond_1
    :goto_1
    iget-object v1, p0, Lq41;->F:Lro2;

    .line 46
    .line 47
    iget-object v1, v1, Lro2;->i:Loo2;

    .line 48
    .line 49
    iget-object v1, v1, Loo2;->o:Lew4;

    .line 50
    .line 51
    iget-object v2, v1, Lew4;->q:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, [Lt41;

    .line 54
    .line 55
    aget-object v2, v2, p1

    .line 56
    .line 57
    invoke-interface {v2}, Lt41;->m()Ltb1;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, Ltb1;->c(Ltb1;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v3, "Disabling track due to error: "

    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "ExoPlayerImplInternal"

    .line 72
    .line 73
    invoke-static {v3, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    new-instance v5, Lew4;

    .line 77
    .line 78
    iget-object v0, v1, Lew4;->p:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, [Ldz3;

    .line 81
    .line 82
    invoke-virtual {v0}, [Ldz3;->clone()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, [Ldz3;

    .line 87
    .line 88
    iget-object v2, v1, Lew4;->q:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, [Lt41;

    .line 91
    .line 92
    invoke-virtual {v2}, [Lt41;->clone()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, [Lt41;

    .line 97
    .line 98
    iget-object v3, v1, Lew4;->r:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Ljw4;

    .line 101
    .line 102
    iget-object v1, v1, Lew4;->s:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-direct {v5, v0, v2, v3, v1}, Lew4;-><init>([Ldz3;[Lt41;Ljw4;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, v5, Lew4;->p:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, [Ldz3;

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    aput-object v1, v0, p1

    .line 113
    .line 114
    iget-object v0, v5, Lew4;->q:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, [Lt41;

    .line 117
    .line 118
    aput-object v1, v0, p1

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Lq41;->i(I)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lq41;->F:Lro2;

    .line 124
    .line 125
    iget-object v4, p1, Lro2;->i:Loo2;

    .line 126
    .line 127
    iget-object p0, p0, Lq41;->V:Lph3;

    .line 128
    .line 129
    iget-wide v6, p0, Lph3;->s:J

    .line 130
    .line 131
    iget-object p0, v4, Loo2;->j:[Lkq;

    .line 132
    .line 133
    array-length p0, p0

    .line 134
    new-array v9, p0, [Z

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-virtual/range {v4 .. v9}, Loo2;->a(Lew4;JZ[Z)J

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final H(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq41;->p:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_0

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    new-instance v0, Lul;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lul;-><init>(Lq41;IZ)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lq41;->L:Lyp4;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq41;->G:Lfo1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfo1;->f()Lcu4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lq41;->w(Lcu4;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final J(Lm41;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lq41;->W:Ln41;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ln41;->e(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lm41;->a:I

    .line 8
    .line 9
    iget v2, p1, Lm41;->b:I

    .line 10
    .line 11
    iget v3, p1, Lm41;->c:I

    .line 12
    .line 13
    iget-object p1, p1, Lm41;->d:Lpd4;

    .line 14
    .line 15
    iget-object v4, p0, Lq41;->G:Lfo1;

    .line 16
    .line 17
    iget-object v5, v4, Lfo1;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    if-ltz v0, :cond_0

    .line 23
    .line 24
    if-gt v0, v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-gt v2, v7, :cond_0

    .line 31
    .line 32
    if-ltz v3, :cond_0

    .line 33
    .line 34
    move v7, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v7, v6

    .line 37
    :goto_0
    invoke-static {v7}, Lrr2;->l(Z)V

    .line 38
    .line 39
    .line 40
    iput-object p1, v4, Lfo1;->k:Ljava/lang/Object;

    .line 41
    .line 42
    if-eq v0, v2, :cond_3

    .line 43
    .line 44
    if-ne v0, v3, :cond_1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    sub-int v7, v2, v0

    .line 52
    .line 53
    add-int/2addr v7, v3

    .line 54
    sub-int/2addr v7, v1

    .line 55
    add-int/lit8 v1, v2, -0x1

    .line 56
    .line 57
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Lbu2;

    .line 66
    .line 67
    iget v7, v7, Lbu2;->d:I

    .line 68
    .line 69
    invoke-static {v5, v0, v2, v3}, Lf35;->P(Ljava/util/ArrayList;III)V

    .line 70
    .line 71
    .line 72
    :goto_1
    if-gt p1, v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lbu2;

    .line 79
    .line 80
    iput v7, v0, Lbu2;->d:I

    .line 81
    .line 82
    iget-object v0, v0, Lbu2;->a:Lrg2;

    .line 83
    .line 84
    iget-object v0, v0, Lrg2;->o:Lpg2;

    .line 85
    .line 86
    iget-object v0, v0, Lbc1;->e:Lcu4;

    .line 87
    .line 88
    invoke-virtual {v0}, Lcu4;->o()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-int/2addr v7, v0

    .line 93
    add-int/lit8 p1, p1, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {v4}, Lfo1;->f()Lcu4;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    :goto_2
    invoke-virtual {v4}, Lfo1;->f()Lcu4;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_3
    invoke-virtual {p0, p1, v6}, Lq41;->w(Lcu4;Z)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final K()V
    .locals 8

    .line 1
    iget-object v0, p0, Lq41;->W:Ln41;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ln41;->e(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, Lq41;->P(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lq41;->s:Lcd2;

    .line 12
    .line 13
    iget-object v3, p0, Lq41;->J:Lik3;

    .line 14
    .line 15
    invoke-interface {v2, v3}, Lcd2;->e(Lik3;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lq41;->V:Lph3;

    .line 19
    .line 20
    iget-object v2, v2, Lph3;->a:Lcu4;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcu4;->p()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v3

    .line 32
    :goto_0
    invoke-virtual {p0, v2}, Lq41;->n0(I)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lq41;->V:Lph3;

    .line 36
    .line 37
    iget-boolean v4, v2, Lph3;->l:Z

    .line 38
    .line 39
    iget v5, v2, Lph3;->n:I

    .line 40
    .line 41
    iget v6, v2, Lph3;->m:I

    .line 42
    .line 43
    iget-object v7, p0, Lq41;->N:Ltl;

    .line 44
    .line 45
    iget v2, v2, Lph3;->e:I

    .line 46
    .line 47
    invoke-virtual {v7, v2, v4}, Ltl;->c(IZ)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {p0, v2, v5, v6, v4}, Lq41;->A0(IIIZ)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lq41;->t:Lcp;

    .line 55
    .line 56
    invoke-interface {v2}, Lcp;->z()Lrw4;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v4, p0, Lq41;->G:Lfo1;

    .line 61
    .line 62
    iget-object v5, v4, Lfo1;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, Ljava/util/ArrayList;

    .line 65
    .line 66
    iget-boolean v6, v4, Lfo1;->a:Z

    .line 67
    .line 68
    xor-int/2addr v6, v1

    .line 69
    invoke-static {v6}, Lrr2;->w(Z)V

    .line 70
    .line 71
    .line 72
    iput-object v2, v4, Lfo1;->l:Ljava/lang/Object;

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-ge v0, v2, :cond_1

    .line 79
    .line 80
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lbu2;

    .line 85
    .line 86
    invoke-virtual {v4, v2}, Lfo1;->l(Lbu2;)V

    .line 87
    .line 88
    .line 89
    iget-object v6, v4, Lfo1;->h:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v6, Ljava/util/HashSet;

    .line 92
    .line 93
    invoke-virtual {v6, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    iput-boolean v1, v4, Lfo1;->a:Z

    .line 100
    .line 101
    iget-object p0, p0, Lq41;->u:Lyp4;

    .line 102
    .line 103
    invoke-virtual {p0, v3}, Lyp4;->g(I)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final L(Lq90;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lq41;->v:Lgc;

    .line 2
    .line 3
    iget-object v1, p0, Lq41;->u:Lyp4;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    :try_start_0
    invoke-virtual {p0, v3, v2, v3, v2}, Lq41;->P(ZZZZ)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lq41;->M()V

    .line 11
    .line 12
    .line 13
    iget-object v4, p0, Lq41;->s:Lcd2;

    .line 14
    .line 15
    iget-object v5, p0, Lq41;->J:Lik3;

    .line 16
    .line 17
    invoke-interface {v4, v5}, Lcd2;->b(Lik3;)V

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, Lq41;->N:Ltl;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    iput-object v5, v4, Ltl;->c:Lq41;

    .line 24
    .line 25
    invoke-virtual {v4}, Ltl;->a()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v2}, Ltl;->b(I)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lq41;->q:Lpn0;

    .line 32
    .line 33
    invoke-virtual {v2}, Lpn0;->g()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v3}, Lq41;->n0(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lyp4;->e()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lgc;->c()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lq90;->d()Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    invoke-virtual {v1}, Lyp4;->e()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lgc;->c()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lq90;->d()Z

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public final M()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lq41;->n:[Lez3;

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge v1, v2, :cond_3

    .line 7
    .line 8
    iget-object v2, p0, Lq41;->o:[Lkq;

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    iget-object v3, v2, Lkq;->n:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v3

    .line 15
    const/4 v4, 0x0

    .line 16
    :try_start_0
    iput-object v4, v2, Lkq;->E:Lpn0;

    .line 17
    .line 18
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iget-object v2, p0, Lq41;->n:[Lez3;

    .line 20
    .line 21
    aget-object v2, v2, v1

    .line 22
    .line 23
    iget-object v3, v2, Lez3;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lkq;

    .line 26
    .line 27
    iget v4, v3, Lkq;->u:I

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    move v4, v5

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v4, v0

    .line 35
    :goto_1
    invoke-static {v4}, Lrr2;->w(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Lkq;->s()V

    .line 39
    .line 40
    .line 41
    iput-boolean v0, v2, Lez3;->a:Z

    .line 42
    .line 43
    iget-object v3, v2, Lez3;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Lkq;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    iget v4, v3, Lkq;->u:I

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    move v5, v0

    .line 55
    :goto_2
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Lkq;->s()V

    .line 59
    .line 60
    .line 61
    iput-boolean v0, v2, Lez3;->b:Z

    .line 62
    .line 63
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw p0

    .line 69
    :cond_3
    return-void
.end method

.method public final N(IILpd4;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lq41;->W:Ln41;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ln41;->e(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lq41;->G:Lfo1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    if-gt p1, p2, :cond_0

    .line 16
    .line 17
    iget-object v3, v0, Lfo1;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-gt p2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, v2

    .line 29
    :goto_0
    invoke-static {v1}, Lrr2;->l(Z)V

    .line 30
    .line 31
    .line 32
    iput-object p3, v0, Lfo1;->k:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lfo1;->o(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lfo1;->f()Lcu4;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1, v2}, Lq41;->w(Lcu4;Z)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final O()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq41;->B:Lxl0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lxl0;->i()Lqh3;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lqh3;->a:F

    .line 10
    .line 11
    iget-object v2, v0, Lq41;->F:Lro2;

    .line 12
    .line 13
    iget-object v3, v2, Lro2;->i:Loo2;

    .line 14
    .line 15
    iget-object v2, v2, Lro2;->j:Loo2;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v11, v3

    .line 20
    move v3, v10

    .line 21
    :goto_0
    if-eqz v11, :cond_13

    .line 22
    .line 23
    iget-boolean v5, v11, Loo2;->e:Z

    .line 24
    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto/16 :goto_a

    .line 28
    .line 29
    :cond_0
    iget-object v5, v0, Lq41;->V:Lph3;

    .line 30
    .line 31
    iget-object v6, v5, Lph3;->a:Lcu4;

    .line 32
    .line 33
    iget-boolean v5, v5, Lph3;->l:Z

    .line 34
    .line 35
    invoke-virtual {v11, v1, v6, v5}, Loo2;->j(FLcu4;Z)Lew4;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    iget-object v5, v0, Lq41;->F:Lro2;

    .line 40
    .line 41
    iget-object v5, v5, Lro2;->i:Loo2;

    .line 42
    .line 43
    if-ne v11, v5, :cond_1

    .line 44
    .line 45
    move-object v14, v12

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v14, v4

    .line 48
    :goto_1
    iget-object v4, v11, Loo2;->o:Lew4;

    .line 49
    .line 50
    iget-object v5, v12, Lew4;->q:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, [Lt41;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    if-eqz v4, :cond_6

    .line 56
    .line 57
    iget-object v7, v4, Lew4;->q:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v7, [Lt41;

    .line 60
    .line 61
    array-length v7, v7

    .line 62
    array-length v8, v5

    .line 63
    if-eq v7, v8, :cond_2

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_2
    move v7, v6

    .line 67
    :goto_2
    array-length v8, v5

    .line 68
    if-ge v7, v8, :cond_4

    .line 69
    .line 70
    invoke-virtual {v12, v4, v7}, Lew4;->m(Lew4;I)Z

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-nez v8, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    if-ne v11, v2, :cond_5

    .line 81
    .line 82
    move v3, v6

    .line 83
    :cond_5
    iget-object v11, v11, Loo2;->m:Loo2;

    .line 84
    .line 85
    move-object v4, v14

    .line 86
    goto :goto_0

    .line 87
    :cond_6
    :goto_3
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 88
    .line 89
    const/4 v2, 0x4

    .line 90
    if-eqz v3, :cond_11

    .line 91
    .line 92
    iget-object v13, v1, Lro2;->i:Loo2;

    .line 93
    .line 94
    invoke-virtual {v1, v13}, Lro2;->o(Loo2;)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    and-int/2addr v1, v10

    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    move/from16 v17, v10

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_7
    move/from16 v17, v6

    .line 105
    .line 106
    :goto_4
    iget-object v1, v0, Lq41;->n:[Lez3;

    .line 107
    .line 108
    array-length v1, v1

    .line 109
    new-array v1, v1, [Z

    .line 110
    .line 111
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 115
    .line 116
    iget-wide v3, v3, Lph3;->s:J

    .line 117
    .line 118
    move-object/from16 v18, v1

    .line 119
    .line 120
    move-wide v15, v3

    .line 121
    invoke-virtual/range {v13 .. v18}, Loo2;->a(Lew4;JZ[Z)J

    .line 122
    .line 123
    .line 124
    move-result-wide v3

    .line 125
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 126
    .line 127
    iget v5, v1, Lph3;->e:I

    .line 128
    .line 129
    if-eq v5, v2, :cond_8

    .line 130
    .line 131
    iget-wide v7, v1, Lph3;->s:J

    .line 132
    .line 133
    cmp-long v1, v3, v7

    .line 134
    .line 135
    if-eqz v1, :cond_8

    .line 136
    .line 137
    move v8, v10

    .line 138
    goto :goto_5

    .line 139
    :cond_8
    move v8, v6

    .line 140
    :goto_5
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 141
    .line 142
    iget-object v5, v1, Lph3;->b:Lmt2;

    .line 143
    .line 144
    move v9, v2

    .line 145
    move-wide v2, v3

    .line 146
    move-object v7, v5

    .line 147
    iget-wide v4, v1, Lph3;->c:J

    .line 148
    .line 149
    iget-wide v11, v1, Lph3;->d:J

    .line 150
    .line 151
    move v1, v9

    .line 152
    const/4 v9, 0x5

    .line 153
    move v14, v1

    .line 154
    move-object v1, v7

    .line 155
    move-wide/from16 v19, v11

    .line 156
    .line 157
    move v11, v6

    .line 158
    move-wide/from16 v6, v19

    .line 159
    .line 160
    invoke-virtual/range {v0 .. v9}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iput-object v1, v0, Lq41;->V:Lph3;

    .line 165
    .line 166
    if-eqz v8, :cond_9

    .line 167
    .line 168
    invoke-virtual {v0, v10, v2, v3}, Lq41;->R(ZJ)V

    .line 169
    .line 170
    .line 171
    :cond_9
    invoke-virtual {v0}, Lq41;->h()V

    .line 172
    .line 173
    .line 174
    iget-object v1, v0, Lq41;->n:[Lez3;

    .line 175
    .line 176
    array-length v1, v1

    .line 177
    new-array v1, v1, [Z

    .line 178
    .line 179
    move v6, v11

    .line 180
    :goto_6
    iget-object v2, v0, Lq41;->n:[Lez3;

    .line 181
    .line 182
    array-length v3, v2

    .line 183
    if-ge v6, v3, :cond_f

    .line 184
    .line 185
    aget-object v2, v2, v6

    .line 186
    .line 187
    invoke-virtual {v2}, Lez3;->c()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    iget-object v3, v0, Lq41;->n:[Lez3;

    .line 192
    .line 193
    aget-object v3, v3, v6

    .line 194
    .line 195
    invoke-virtual {v3}, Lez3;->g()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    aput-boolean v3, v1, v6

    .line 200
    .line 201
    iget-object v3, v0, Lq41;->n:[Lez3;

    .line 202
    .line 203
    aget-object v3, v3, v6

    .line 204
    .line 205
    iget-object v4, v13, Loo2;->c:[Lq44;

    .line 206
    .line 207
    aget-object v4, v4, v6

    .line 208
    .line 209
    iget-object v5, v0, Lq41;->B:Lxl0;

    .line 210
    .line 211
    iget-wide v7, v0, Lq41;->k0:J

    .line 212
    .line 213
    aget-boolean v9, v18, v6

    .line 214
    .line 215
    iget-object v12, v3, Lez3;->e:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v12, Lkq;

    .line 218
    .line 219
    invoke-static {v12}, Lez3;->h(Lkq;)Z

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    if-eqz v15, :cond_b

    .line 224
    .line 225
    iget-object v15, v12, Lkq;->v:Lq44;

    .line 226
    .line 227
    if-eq v4, v15, :cond_a

    .line 228
    .line 229
    invoke-virtual {v3, v12, v5}, Lez3;->a(Lkq;Lxl0;)V

    .line 230
    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_a
    if-eqz v9, :cond_b

    .line 234
    .line 235
    invoke-virtual {v12, v7, v8, v11, v10}, Lkq;->C(JZZ)V

    .line 236
    .line 237
    .line 238
    :cond_b
    :goto_7
    iget-object v12, v3, Lez3;->f:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v12, Lkq;

    .line 241
    .line 242
    if-eqz v12, :cond_d

    .line 243
    .line 244
    invoke-static {v12}, Lez3;->h(Lkq;)Z

    .line 245
    .line 246
    .line 247
    move-result v15

    .line 248
    if-eqz v15, :cond_d

    .line 249
    .line 250
    iget-object v15, v12, Lkq;->v:Lq44;

    .line 251
    .line 252
    if-eq v4, v15, :cond_c

    .line 253
    .line 254
    invoke-virtual {v3, v12, v5}, Lez3;->a(Lkq;Lxl0;)V

    .line 255
    .line 256
    .line 257
    goto :goto_8

    .line 258
    :cond_c
    if-eqz v9, :cond_d

    .line 259
    .line 260
    invoke-virtual {v12, v7, v8, v11, v10}, Lkq;->C(JZZ)V

    .line 261
    .line 262
    .line 263
    :cond_d
    :goto_8
    iget-object v3, v0, Lq41;->n:[Lez3;

    .line 264
    .line 265
    aget-object v3, v3, v6

    .line 266
    .line 267
    invoke-virtual {v3}, Lez3;->c()I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    sub-int v3, v2, v3

    .line 272
    .line 273
    if-lez v3, :cond_e

    .line 274
    .line 275
    invoke-virtual {v0, v6, v11}, Lq41;->H(IZ)V

    .line 276
    .line 277
    .line 278
    :cond_e
    iget v3, v0, Lq41;->i0:I

    .line 279
    .line 280
    iget-object v4, v0, Lq41;->n:[Lez3;

    .line 281
    .line 282
    aget-object v4, v4, v6

    .line 283
    .line 284
    invoke-virtual {v4}, Lez3;->c()I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    sub-int/2addr v2, v4

    .line 289
    sub-int/2addr v3, v2

    .line 290
    iput v3, v0, Lq41;->i0:I

    .line 291
    .line 292
    add-int/lit8 v6, v6, 0x1

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_f
    iget-wide v2, v0, Lq41;->k0:J

    .line 296
    .line 297
    invoke-virtual {v0, v1, v2, v3}, Lq41;->m([ZJ)V

    .line 298
    .line 299
    .line 300
    iput-boolean v10, v13, Loo2;->h:Z

    .line 301
    .line 302
    :cond_10
    move v1, v14

    .line 303
    goto :goto_9

    .line 304
    :cond_11
    move v14, v2

    .line 305
    invoke-virtual {v1, v11}, Lro2;->o(Loo2;)I

    .line 306
    .line 307
    .line 308
    iget-boolean v1, v11, Loo2;->e:Z

    .line 309
    .line 310
    if-eqz v1, :cond_10

    .line 311
    .line 312
    iget-object v1, v11, Loo2;->g:Lpo2;

    .line 313
    .line 314
    iget-wide v1, v1, Lpo2;->b:J

    .line 315
    .line 316
    iget-wide v3, v0, Lq41;->k0:J

    .line 317
    .line 318
    iget-wide v5, v11, Loo2;->p:J

    .line 319
    .line 320
    sub-long/2addr v3, v5

    .line 321
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 322
    .line 323
    .line 324
    move-result-wide v1

    .line 325
    iget-boolean v3, v0, Lq41;->M:Z

    .line 326
    .line 327
    if-eqz v3, :cond_12

    .line 328
    .line 329
    invoke-virtual {v0}, Lq41;->f()Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_12

    .line 334
    .line 335
    iget-object v3, v0, Lq41;->F:Lro2;

    .line 336
    .line 337
    iget-object v3, v3, Lro2;->k:Loo2;

    .line 338
    .line 339
    if-ne v3, v11, :cond_12

    .line 340
    .line 341
    invoke-virtual {v0}, Lq41;->h()V

    .line 342
    .line 343
    .line 344
    :cond_12
    iget-object v3, v11, Loo2;->j:[Lkq;

    .line 345
    .line 346
    array-length v3, v3

    .line 347
    new-array v3, v3, [Z

    .line 348
    .line 349
    const/4 v15, 0x0

    .line 350
    move-wide/from16 v19, v1

    .line 351
    .line 352
    move v1, v14

    .line 353
    move-wide/from16 v13, v19

    .line 354
    .line 355
    move-object/from16 v16, v3

    .line 356
    .line 357
    invoke-virtual/range {v11 .. v16}, Loo2;->a(Lew4;JZ[Z)J

    .line 358
    .line 359
    .line 360
    :goto_9
    invoke-virtual {v0, v10}, Lq41;->v(Z)V

    .line 361
    .line 362
    .line 363
    iget-object v2, v0, Lq41;->V:Lph3;

    .line 364
    .line 365
    iget v2, v2, Lph3;->e:I

    .line 366
    .line 367
    if-eq v2, v1, :cond_13

    .line 368
    .line 369
    invoke-virtual {v0}, Lq41;->D()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0}, Lq41;->B0()V

    .line 373
    .line 374
    .line 375
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 376
    .line 377
    const/4 v1, 0x2

    .line 378
    invoke-virtual {v0, v1}, Lyp4;->g(I)V

    .line 379
    .line 380
    .line 381
    :cond_13
    :goto_a
    return-void
.end method

.method public final P(ZZZZ)V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "ExoPlayerImplInternal"

    .line 4
    .line 5
    iget-object v0, v1, Lq41;->u:Lyp4;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-virtual {v0, v3}, Lyp4;->f(I)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput-boolean v3, v1, Lq41;->S:Z

    .line 13
    .line 14
    iget-object v0, v1, Lq41;->T:Lp41;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v1, Lq41;->W:Ln41;

    .line 21
    .line 22
    invoke-virtual {v0, v5}, Ln41;->e(I)V

    .line 23
    .line 24
    .line 25
    iput-object v4, v1, Lq41;->T:Lp41;

    .line 26
    .line 27
    :cond_0
    iput-object v4, v1, Lq41;->o0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 28
    .line 29
    invoke-virtual {v1, v3, v5}, Lq41;->D0(ZZ)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, Lq41;->B:Lxl0;

    .line 33
    .line 34
    iput-boolean v3, v0, Lxl0;->s:Z

    .line 35
    .line 36
    iget-object v0, v0, Lxl0;->n:Lzq2;

    .line 37
    .line 38
    iget-boolean v6, v0, Lzq2;->p:Z

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Lzq2;->j()J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    invoke-virtual {v0, v6, v7}, Lzq2;->f(J)V

    .line 47
    .line 48
    .line 49
    iput-boolean v3, v0, Lzq2;->p:Z

    .line 50
    .line 51
    :cond_1
    const-wide v6, 0xe8d4a51000L

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    iput-wide v6, v1, Lq41;->k0:J

    .line 57
    .line 58
    move v0, v3

    .line 59
    :goto_0
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    :try_start_0
    iget-object v8, v1, Lq41;->n:[Lez3;

    .line 65
    .line 66
    array-length v8, v8

    .line 67
    if-ge v0, v8, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lq41;->i(I)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catch_0
    move-exception v0

    .line 76
    goto :goto_1

    .line 77
    :catch_1
    move-exception v0

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    iput-wide v6, v1, Lq41;->r0:J
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :goto_1
    const-string v8, "Disable failed."

    .line 83
    .line 84
    invoke-static {v2, v8, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    if-eqz p1, :cond_3

    .line 88
    .line 89
    iget-object v8, v1, Lq41;->n:[Lez3;

    .line 90
    .line 91
    array-length v9, v8

    .line 92
    move v10, v3

    .line 93
    :goto_3
    if-ge v10, v9, :cond_3

    .line 94
    .line 95
    aget-object v0, v8, v10

    .line 96
    .line 97
    :try_start_1
    invoke-virtual {v0}, Lez3;->k()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :catch_2
    move-exception v0

    .line 102
    const-string v11, "Reset failed."

    .line 103
    .line 104
    invoke-static {v2, v11, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    iput v3, v1, Lq41;->i0:I

    .line 111
    .line 112
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 113
    .line 114
    iget-object v2, v0, Lph3;->b:Lmt2;

    .line 115
    .line 116
    iget-wide v8, v0, Lph3;->s:J

    .line 117
    .line 118
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 119
    .line 120
    iget-object v0, v0, Lph3;->b:Lmt2;

    .line 121
    .line 122
    invoke-virtual {v0}, Lmt2;->b()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_5

    .line 127
    .line 128
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 129
    .line 130
    iget-object v10, v1, Lq41;->y:Lzt4;

    .line 131
    .line 132
    iget-object v11, v0, Lph3;->b:Lmt2;

    .line 133
    .line 134
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 135
    .line 136
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-nez v12, :cond_5

    .line 141
    .line 142
    iget-object v11, v11, Lmt2;->a:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-virtual {v0, v11, v10}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-boolean v0, v0, Lzt4;->f:Z

    .line 149
    .line 150
    if-eqz v0, :cond_4

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_4
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 154
    .line 155
    iget-wide v10, v0, Lph3;->s:J

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_5
    :goto_5
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 159
    .line 160
    iget-wide v10, v0, Lph3;->c:J

    .line 161
    .line 162
    :goto_6
    if-eqz p2, :cond_7

    .line 163
    .line 164
    iput-object v4, v1, Lq41;->j0:Lp41;

    .line 165
    .line 166
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 167
    .line 168
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 169
    .line 170
    invoke-virtual {v1, v0}, Lq41;->p(Lcu4;)Landroid/util/Pair;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, Lmt2;

    .line 177
    .line 178
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Ljava/lang/Long;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 183
    .line 184
    .line 185
    move-result-wide v8

    .line 186
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 187
    .line 188
    iget-object v0, v0, Lph3;->b:Lmt2;

    .line 189
    .line 190
    invoke-virtual {v2, v0}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-nez v0, :cond_6

    .line 195
    .line 196
    :goto_7
    move-wide v11, v8

    .line 197
    move-wide v9, v6

    .line 198
    goto :goto_8

    .line 199
    :cond_6
    move v5, v3

    .line 200
    goto :goto_7

    .line 201
    :cond_7
    move-wide/from16 v33, v10

    .line 202
    .line 203
    move-wide v11, v8

    .line 204
    move-wide/from16 v9, v33

    .line 205
    .line 206
    move v5, v3

    .line 207
    :goto_8
    iget-object v0, v1, Lq41;->F:Lro2;

    .line 208
    .line 209
    invoke-virtual {v0}, Lro2;->b()V

    .line 210
    .line 211
    .line 212
    iput-boolean v3, v1, Lq41;->c0:Z

    .line 213
    .line 214
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 215
    .line 216
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 217
    .line 218
    if-eqz p3, :cond_a

    .line 219
    .line 220
    instance-of v6, v0, Ltm3;

    .line 221
    .line 222
    if-eqz v6, :cond_a

    .line 223
    .line 224
    check-cast v0, Ltm3;

    .line 225
    .line 226
    iget-object v6, v1, Lq41;->G:Lfo1;

    .line 227
    .line 228
    iget-object v6, v6, Lfo1;->k:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Lpd4;

    .line 231
    .line 232
    iget-object v7, v0, Ltm3;->k:[Lcu4;

    .line 233
    .line 234
    array-length v8, v7

    .line 235
    new-array v8, v8, [Lcu4;

    .line 236
    .line 237
    move v13, v3

    .line 238
    :goto_9
    array-length v14, v7

    .line 239
    if-ge v13, v14, :cond_8

    .line 240
    .line 241
    new-instance v14, Lsm3;

    .line 242
    .line 243
    aget-object v15, v7, v13

    .line 244
    .line 245
    invoke-direct {v14, v15}, Lsm3;-><init>(Lcu4;)V

    .line 246
    .line 247
    .line 248
    aput-object v14, v8, v13

    .line 249
    .line 250
    add-int/lit8 v13, v13, 0x1

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_8
    new-instance v7, Ltm3;

    .line 254
    .line 255
    iget-object v0, v0, Ltm3;->l:[Ljava/lang/Object;

    .line 256
    .line 257
    invoke-direct {v7, v8, v0, v6}, Ltm3;-><init>([Lcu4;[Ljava/lang/Object;Lpd4;)V

    .line 258
    .line 259
    .line 260
    iget v0, v2, Lmt2;->b:I

    .line 261
    .line 262
    const/4 v6, -0x1

    .line 263
    if-eq v0, v6, :cond_9

    .line 264
    .line 265
    iget-object v0, v2, Lmt2;->a:Ljava/lang/Object;

    .line 266
    .line 267
    iget-object v6, v1, Lq41;->y:Lzt4;

    .line 268
    .line 269
    invoke-virtual {v7, v0, v6}, Ltm3;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 270
    .line 271
    .line 272
    iget-object v0, v1, Lq41;->y:Lzt4;

    .line 273
    .line 274
    iget v0, v0, Lzt4;->c:I

    .line 275
    .line 276
    iget-object v6, v1, Lq41;->x:Lbu4;

    .line 277
    .line 278
    const-wide/16 v13, 0x0

    .line 279
    .line 280
    invoke-virtual {v7, v0, v6, v13, v14}, Ltm3;->m(ILbu4;J)Lbu4;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6}, Lbu4;->a()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_9

    .line 288
    .line 289
    new-instance v0, Lmt2;

    .line 290
    .line 291
    iget-object v6, v2, Lmt2;->a:Ljava/lang/Object;

    .line 292
    .line 293
    iget-wide v13, v2, Lmt2;->d:J

    .line 294
    .line 295
    invoke-direct {v0, v13, v14, v6}, Lmt2;-><init>(JLjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    move-object v8, v0

    .line 299
    goto :goto_b

    .line 300
    :cond_9
    :goto_a
    move-object v8, v2

    .line 301
    goto :goto_b

    .line 302
    :cond_a
    move-object v7, v0

    .line 303
    goto :goto_a

    .line 304
    :goto_b
    new-instance v6, Lph3;

    .line 305
    .line 306
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 307
    .line 308
    iget v13, v0, Lph3;->e:I

    .line 309
    .line 310
    if-eqz p4, :cond_b

    .line 311
    .line 312
    move-object v14, v4

    .line 313
    goto :goto_c

    .line 314
    :cond_b
    iget-object v2, v0, Lph3;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 315
    .line 316
    move-object v14, v2

    .line 317
    :goto_c
    if-eqz v5, :cond_c

    .line 318
    .line 319
    sget-object v2, Ltv4;->d:Ltv4;

    .line 320
    .line 321
    :goto_d
    move-object/from16 v16, v2

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_c
    iget-object v2, v0, Lph3;->h:Ltv4;

    .line 325
    .line 326
    goto :goto_d

    .line 327
    :goto_e
    if-eqz v5, :cond_d

    .line 328
    .line 329
    iget-object v2, v1, Lq41;->r:Lew4;

    .line 330
    .line 331
    :goto_f
    move-object/from16 v17, v2

    .line 332
    .line 333
    goto :goto_10

    .line 334
    :cond_d
    iget-object v2, v0, Lph3;->i:Lew4;

    .line 335
    .line 336
    goto :goto_f

    .line 337
    :goto_10
    if-eqz v5, :cond_e

    .line 338
    .line 339
    sget-object v2, Lyw1;->o:Lvw1;

    .line 340
    .line 341
    sget-object v2, Lgy3;->r:Lgy3;

    .line 342
    .line 343
    :goto_11
    move-object/from16 v18, v2

    .line 344
    .line 345
    goto :goto_12

    .line 346
    :cond_e
    iget-object v2, v0, Lph3;->j:Ljava/util/List;

    .line 347
    .line 348
    goto :goto_11

    .line 349
    :goto_12
    iget-boolean v2, v0, Lph3;->l:Z

    .line 350
    .line 351
    iget v5, v0, Lph3;->m:I

    .line 352
    .line 353
    iget v15, v0, Lph3;->n:I

    .line 354
    .line 355
    iget-object v0, v0, Lph3;->o:Lqh3;

    .line 356
    .line 357
    const-wide/16 v30, 0x0

    .line 358
    .line 359
    const/16 v32, 0x0

    .line 360
    .line 361
    move/from16 v22, v15

    .line 362
    .line 363
    const/4 v15, 0x0

    .line 364
    const-wide/16 v26, 0x0

    .line 365
    .line 366
    move-object/from16 v19, v8

    .line 367
    .line 368
    move-wide/from16 v24, v11

    .line 369
    .line 370
    move-wide/from16 v28, v11

    .line 371
    .line 372
    move-object/from16 v23, v0

    .line 373
    .line 374
    move/from16 v20, v2

    .line 375
    .line 376
    move/from16 v21, v5

    .line 377
    .line 378
    invoke-direct/range {v6 .. v32}, Lph3;-><init>(Lcu4;Lmt2;JJILandroidx/media3/exoplayer/ExoPlaybackException;ZLtv4;Lew4;Ljava/util/List;Lmt2;ZIILqh3;JJJJZ)V

    .line 379
    .line 380
    .line 381
    iput-object v6, v1, Lq41;->V:Lph3;

    .line 382
    .line 383
    if-eqz p3, :cond_12

    .line 384
    .line 385
    iget-object v0, v1, Lq41;->F:Lro2;

    .line 386
    .line 387
    iget-object v2, v0, Lro2;->q:Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-nez v2, :cond_10

    .line 394
    .line 395
    new-instance v2, Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 398
    .line 399
    .line 400
    move v5, v3

    .line 401
    :goto_13
    iget-object v6, v0, Lro2;->q:Ljava/util/ArrayList;

    .line 402
    .line 403
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-ge v5, v6, :cond_f

    .line 408
    .line 409
    iget-object v6, v0, Lro2;->q:Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    check-cast v6, Loo2;

    .line 416
    .line 417
    invoke-virtual {v6}, Loo2;->i()V

    .line 418
    .line 419
    .line 420
    add-int/lit8 v5, v5, 0x1

    .line 421
    .line 422
    goto :goto_13

    .line 423
    :cond_f
    iput-object v2, v0, Lro2;->q:Ljava/util/ArrayList;

    .line 424
    .line 425
    iput-object v4, v0, Lro2;->m:Loo2;

    .line 426
    .line 427
    invoke-virtual {v0}, Lro2;->l()V

    .line 428
    .line 429
    .line 430
    :cond_10
    iget-object v1, v1, Lq41;->G:Lfo1;

    .line 431
    .line 432
    iget-object v0, v1, Lfo1;->g:Ljava/lang/Object;

    .line 433
    .line 434
    move-object v2, v0

    .line 435
    check-cast v2, Ljava/util/HashMap;

    .line 436
    .line 437
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-eqz v0, :cond_11

    .line 450
    .line 451
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    move-object v5, v0

    .line 456
    check-cast v5, Lau2;

    .line 457
    .line 458
    :try_start_2
    iget-object v0, v5, Lau2;->a:Lbq;

    .line 459
    .line 460
    iget-object v6, v5, Lau2;->b:Lut2;

    .line 461
    .line 462
    invoke-virtual {v0, v6}, Lbq;->o(Lnt2;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 463
    .line 464
    .line 465
    goto :goto_15

    .line 466
    :catch_3
    move-exception v0

    .line 467
    const-string v6, "MediaSourceList"

    .line 468
    .line 469
    const-string v7, "Failed to release child source."

    .line 470
    .line 471
    invoke-static {v6, v7, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 472
    .line 473
    .line 474
    :goto_15
    iget-object v0, v5, Lau2;->a:Lbq;

    .line 475
    .line 476
    iget-object v6, v5, Lau2;->c:Lzt2;

    .line 477
    .line 478
    invoke-virtual {v0, v6}, Lbq;->r(Lst2;)V

    .line 479
    .line 480
    .line 481
    iget-object v0, v5, Lau2;->a:Lbq;

    .line 482
    .line 483
    invoke-virtual {v0, v6}, Lbq;->q(Ltw0;)V

    .line 484
    .line 485
    .line 486
    goto :goto_14

    .line 487
    :cond_11
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 488
    .line 489
    .line 490
    iget-object v0, v1, Lfo1;->h:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v0, Ljava/util/HashSet;

    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 495
    .line 496
    .line 497
    iput-boolean v3, v1, Lfo1;->a:Z

    .line 498
    .line 499
    :cond_12
    return-void
.end method

.method public final Q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v0, v0, Lro2;->i:Loo2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Loo2;->g:Lpo2;

    .line 8
    .line 9
    iget-boolean v0, v0, Lpo2;->i:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lq41;->Y:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-boolean v0, p0, Lq41;->Z:Z

    .line 21
    .line 22
    return-void
.end method

.method public final R(ZJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v1, v0, Lro2;->i:Loo2;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-wide v2, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    add-long/2addr p2, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v2, v1, Loo2;->p:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p2, p0, Lq41;->k0:J

    .line 18
    .line 19
    iget-object v2, p0, Lq41;->B:Lxl0;

    .line 20
    .line 21
    iget-object v2, v2, Lxl0;->n:Lzq2;

    .line 22
    .line 23
    invoke-virtual {v2, p2, p3}, Lzq2;->f(J)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lq41;->n:[Lez3;

    .line 27
    .line 28
    array-length p3, p2

    .line 29
    const/4 v2, 0x0

    .line 30
    move v3, v2

    .line 31
    :goto_2
    if-ge v3, p3, :cond_2

    .line 32
    .line 33
    aget-object v4, p2, v3

    .line 34
    .line 35
    iget-wide v5, p0, Lq41;->k0:J

    .line 36
    .line 37
    invoke-virtual {v4, v1}, Lez3;->d(Loo2;)Lkq;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {v4, v5, v6, v2, p1}, Lkq;->C(JZZ)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    iget-object p0, v0, Lro2;->i:Loo2;

    .line 50
    .line 51
    :goto_3
    if-eqz p0, :cond_5

    .line 52
    .line 53
    iget-object p1, p0, Loo2;->o:Lew4;

    .line 54
    .line 55
    iget-object p1, p1, Lew4;->q:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, [Lt41;

    .line 58
    .line 59
    array-length p2, p1

    .line 60
    move p3, v2

    .line 61
    :goto_4
    if-ge p3, p2, :cond_4

    .line 62
    .line 63
    aget-object v0, p1, p3

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {v0}, Lt41;->r()V

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    iget-object p0, p0, Loo2;->m:Loo2;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    return-void
.end method

.method public final S(Lcu4;Lcu4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcu4;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lcu4;->p()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, Lq41;->C:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    if-gez p1, :cond_1

    .line 23
    .line 24
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lxa3;->r(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0
.end method

.method public final V(J)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lq41;->R:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lq41;->Q:Li74;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v2

    .line 16
    :goto_0
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 17
    .line 18
    const-wide/16 v4, 0x3e8

    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    sget-wide v7, Lq41;->u0:J

    .line 22
    .line 23
    if-eqz v1, :cond_6

    .line 24
    .line 25
    iget v1, v3, Lph3;->e:I

    .line 26
    .line 27
    if-ne v1, v6, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-wide v4, v7

    .line 31
    :goto_1
    iget-object v1, v0, Lq41;->n:[Lez3;

    .line 32
    .line 33
    array-length v3, v1

    .line 34
    :goto_2
    if-ge v2, v3, :cond_4

    .line 35
    .line 36
    aget-object v6, v1, v2

    .line 37
    .line 38
    iget-wide v9, v0, Lq41;->k0:J

    .line 39
    .line 40
    iget-wide v11, v0, Lq41;->l0:J

    .line 41
    .line 42
    iget-object v13, v6, Lez3;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v13, Lkq;

    .line 45
    .line 46
    iget-object v6, v6, Lez3;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Lkq;

    .line 49
    .line 50
    invoke-static {v6}, Lez3;->h(Lkq;)Z

    .line 51
    .line 52
    .line 53
    move-result v14

    .line 54
    if-eqz v14, :cond_2

    .line 55
    .line 56
    invoke-virtual {v6, v9, v10, v11, v12}, Lkq;->f(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v14

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    const-wide v14, 0x7fffffffffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    :goto_3
    if-eqz v13, :cond_3

    .line 67
    .line 68
    iget v6, v13, Lkq;->u:I

    .line 69
    .line 70
    if-eqz v6, :cond_3

    .line 71
    .line 72
    invoke-virtual {v13, v9, v10, v11, v12}, Lkq;->f(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    invoke-static {v14, v15, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v14

    .line 80
    :cond_3
    invoke-static {v14, v15}, Lf35;->i0(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v9

    .line 84
    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 92
    .line 93
    invoke-virtual {v1}, Lph3;->m()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_8

    .line 98
    .line 99
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 100
    .line 101
    iget-object v1, v1, Lro2;->i:Loo2;

    .line 102
    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    iget-object v1, v1, Loo2;->m:Loo2;

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_5
    const/4 v1, 0x0

    .line 109
    :goto_4
    if-eqz v1, :cond_8

    .line 110
    .line 111
    iget-wide v2, v0, Lq41;->k0:J

    .line 112
    .line 113
    long-to-float v2, v2

    .line 114
    invoke-static {v4, v5}, Lf35;->Q(J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v9

    .line 118
    long-to-float v3, v9

    .line 119
    iget-object v6, v0, Lq41;->V:Lph3;

    .line 120
    .line 121
    iget-object v6, v6, Lph3;->o:Lqh3;

    .line 122
    .line 123
    iget v6, v6, Lqh3;->a:F

    .line 124
    .line 125
    mul-float/2addr v3, v6

    .line 126
    add-float/2addr v3, v2

    .line 127
    invoke-virtual {v1}, Loo2;->e()J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    long-to-float v1, v1

    .line 132
    cmpl-float v1, v3, v1

    .line 133
    .line 134
    if-ltz v1, :cond_8

    .line 135
    .line 136
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 137
    .line 138
    .line 139
    move-result-wide v4

    .line 140
    goto :goto_5

    .line 141
    :cond_6
    iget v1, v3, Lph3;->e:I

    .line 142
    .line 143
    if-ne v1, v6, :cond_7

    .line 144
    .line 145
    invoke-virtual {v0}, Lq41;->r0()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_7

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_7
    move-wide v4, v7

    .line 153
    :cond_8
    :goto_5
    add-long v1, p1, v4

    .line 154
    .line 155
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 156
    .line 157
    iget-object v0, v0, Lyp4;->a:Landroid/os/Handler;

    .line 158
    .line 159
    const/4 v3, 0x2

    .line 160
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final W(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v0, v0, Lro2;->i:Loo2;

    .line 4
    .line 5
    iget-object v0, v0, Loo2;->g:Lpo2;

    .line 6
    .line 7
    iget-object v2, v0, Lpo2;->a:Lmt2;

    .line 8
    .line 9
    iget-object v0, p0, Lq41;->V:Lph3;

    .line 10
    .line 11
    iget-wide v3, v0, Lph3;->s:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-virtual/range {v1 .. v6}, Lq41;->Y(Lmt2;JZZ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-object p0, v1, Lq41;->V:Lph3;

    .line 21
    .line 22
    iget-wide v5, p0, Lph3;->s:J

    .line 23
    .line 24
    cmp-long p0, v3, v5

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    iget-object p0, v1, Lq41;->V:Lph3;

    .line 29
    .line 30
    iget-wide v5, p0, Lph3;->c:J

    .line 31
    .line 32
    iget-wide v7, p0, Lph3;->d:J

    .line 33
    .line 34
    const/4 v10, 0x5

    .line 35
    move v9, p1

    .line 36
    invoke-virtual/range {v1 .. v10}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iput-object p0, v1, Lq41;->V:Lph3;

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final X(Lp41;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-boolean v0, v1, Lq41;->S:Z

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v1, Lq41;->T:Lp41;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v0, v1, Lq41;->U:I

    .line 15
    .line 16
    add-int/2addr v0, v9

    .line 17
    iput v0, v1, Lq41;->U:I

    .line 18
    .line 19
    iget-object v0, v1, Lq41;->W:Ln41;

    .line 20
    .line 21
    invoke-virtual {v0, v9}, Ln41;->e(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iput-object v3, v1, Lq41;->T:Lp41;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v0, v1, Lq41;->W:Ln41;

    .line 28
    .line 29
    invoke-virtual {v0, v9}, Ln41;->e(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 33
    .line 34
    iget-object v2, v0, Lph3;->a:Lcu4;

    .line 35
    .line 36
    iget v5, v1, Lq41;->d0:I

    .line 37
    .line 38
    iget-boolean v6, v1, Lq41;->e0:Z

    .line 39
    .line 40
    iget-object v7, v1, Lq41;->x:Lbu4;

    .line 41
    .line 42
    iget-object v8, v1, Lq41;->y:Lzt4;

    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-static/range {v2 .. v8}, Lq41;->T(Lcu4;Lp41;ZIZLbu4;Lzt4;)Landroid/util/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    iget-object v2, v1, Lq41;->V:Lph3;

    .line 58
    .line 59
    iget-object v2, v2, Lph3;->a:Lcu4;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lq41;->p(Lcu4;)Landroid/util/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v10, Lmt2;

    .line 68
    .line 69
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljava/lang/Long;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v11

    .line 77
    iget-object v2, v1, Lq41;->V:Lph3;

    .line 78
    .line 79
    iget-object v2, v2, Lph3;->a:Lcu4;

    .line 80
    .line 81
    invoke-virtual {v2}, Lcu4;->p()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    xor-int/2addr v2, v9

    .line 86
    move-wide/from16 v17, v6

    .line 87
    .line 88
    const-wide/16 v15, 0x0

    .line 89
    .line 90
    move-wide/from16 v5, v17

    .line 91
    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :cond_2
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 95
    .line 96
    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v10, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v11

    .line 104
    iget-wide v13, v3, Lp41;->c:J

    .line 105
    .line 106
    cmp-long v10, v13, v6

    .line 107
    .line 108
    if-nez v10, :cond_3

    .line 109
    .line 110
    move-wide v13, v6

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    move-wide v13, v11

    .line 113
    :goto_0
    iget-object v10, v1, Lq41;->F:Lro2;

    .line 114
    .line 115
    iget-object v15, v1, Lq41;->V:Lph3;

    .line 116
    .line 117
    iget-object v15, v15, Lph3;->a:Lcu4;

    .line 118
    .line 119
    invoke-virtual {v10, v15, v2, v11, v12}, Lro2;->q(Lcu4;Ljava/lang/Object;J)Lmt2;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    invoke-virtual {v10}, Lmt2;->b()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_5

    .line 128
    .line 129
    iget-object v2, v1, Lq41;->V:Lph3;

    .line 130
    .line 131
    iget-object v2, v2, Lph3;->a:Lcu4;

    .line 132
    .line 133
    iget-object v11, v10, Lmt2;->a:Ljava/lang/Object;

    .line 134
    .line 135
    iget-object v12, v1, Lq41;->y:Lzt4;

    .line 136
    .line 137
    invoke-virtual {v2, v11, v12}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 138
    .line 139
    .line 140
    iget-object v2, v1, Lq41;->y:Lzt4;

    .line 141
    .line 142
    iget v11, v10, Lmt2;->b:I

    .line 143
    .line 144
    invoke-virtual {v2, v11}, Lzt4;->f(I)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    iget v11, v10, Lmt2;->c:I

    .line 149
    .line 150
    if-ne v2, v11, :cond_4

    .line 151
    .line 152
    iget-object v2, v1, Lq41;->y:Lzt4;

    .line 153
    .line 154
    iget-object v2, v2, Lzt4;->g:Lz5;

    .line 155
    .line 156
    iget-wide v11, v2, Lz5;->b:J

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_4
    const-wide/16 v11, 0x0

    .line 160
    .line 161
    :goto_1
    iget-object v2, v1, Lq41;->y:Lzt4;

    .line 162
    .line 163
    iget-object v2, v2, Lzt4;->g:Lz5;

    .line 164
    .line 165
    iget v15, v10, Lmt2;->b:I

    .line 166
    .line 167
    invoke-virtual {v2, v15}, Lz5;->a(I)Lx5;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const-wide/16 v15, 0x0

    .line 172
    .line 173
    iget-wide v4, v2, Lx5;->a:J

    .line 174
    .line 175
    move-wide/from16 v17, v6

    .line 176
    .line 177
    iget-wide v6, v2, Lx5;->j:J

    .line 178
    .line 179
    add-long/2addr v4, v6

    .line 180
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 181
    .line 182
    .line 183
    move-result-wide v13

    .line 184
    :goto_2
    move v2, v9

    .line 185
    :goto_3
    move-wide v5, v13

    .line 186
    goto :goto_4

    .line 187
    :cond_5
    move-wide/from16 v17, v6

    .line 188
    .line 189
    const-wide/16 v15, 0x0

    .line 190
    .line 191
    iget-wide v4, v3, Lp41;->c:J

    .line 192
    .line 193
    cmp-long v2, v4, v17

    .line 194
    .line 195
    if-nez v2, :cond_6

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_6
    move v2, v8

    .line 199
    goto :goto_3

    .line 200
    :goto_4
    :try_start_0
    iget-object v4, v1, Lq41;->V:Lph3;

    .line 201
    .line 202
    iget-object v4, v4, Lph3;->a:Lcu4;

    .line 203
    .line 204
    invoke-virtual {v4}, Lcu4;->p()Z

    .line 205
    .line 206
    .line 207
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 208
    if-eqz v4, :cond_7

    .line 209
    .line 210
    :try_start_1
    iput-object v3, v1, Lq41;->j0:Lp41;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :catchall_0
    move-exception v0

    .line 214
    move v9, v2

    .line 215
    move-object v2, v10

    .line 216
    :goto_5
    move-wide v3, v11

    .line 217
    goto/16 :goto_17

    .line 218
    .line 219
    :cond_7
    iget-object v3, v1, Lq41;->V:Lph3;

    .line 220
    .line 221
    const/4 v4, 0x4

    .line 222
    if-nez v0, :cond_9

    .line 223
    .line 224
    :try_start_2
    iget v0, v3, Lph3;->e:I

    .line 225
    .line 226
    if-eq v0, v9, :cond_8

    .line 227
    .line 228
    invoke-virtual {v1, v4}, Lq41;->n0(I)V

    .line 229
    .line 230
    .line 231
    :cond_8
    invoke-virtual {v1, v8, v9, v8, v9}, Lq41;->P(ZZZZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 232
    .line 233
    .line 234
    :goto_6
    move v9, v2

    .line 235
    move-object v2, v10

    .line 236
    move-wide v3, v11

    .line 237
    goto/16 :goto_14

    .line 238
    .line 239
    :cond_9
    :try_start_3
    iget-object v0, v3, Lph3;->b:Lmt2;

    .line 240
    .line 241
    invoke-virtual {v10, v0}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    .line 245
    const/4 v3, 0x2

    .line 246
    if-eqz v0, :cond_e

    .line 247
    .line 248
    :try_start_4
    iget-object v0, v1, Lq41;->F:Lro2;

    .line 249
    .line 250
    iget-object v0, v0, Lro2;->i:Loo2;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 251
    .line 252
    if-eqz v0, :cond_b

    .line 253
    .line 254
    :try_start_5
    iget-boolean v7, v0, Loo2;->e:Z

    .line 255
    .line 256
    if-eqz v7, :cond_b

    .line 257
    .line 258
    cmp-long v7, v11, v15

    .line 259
    .line 260
    if-eqz v7, :cond_b

    .line 261
    .line 262
    iget-object v0, v0, Loo2;->a:Lno2;

    .line 263
    .line 264
    iget-object v7, v1, Lq41;->x:Lbu4;

    .line 265
    .line 266
    iget-wide v13, v7, Lbu4;->l:J

    .line 267
    .line 268
    iget-boolean v7, v1, Lq41;->R:Z

    .line 269
    .line 270
    if-eqz v7, :cond_a

    .line 271
    .line 272
    cmp-long v7, v13, v17

    .line 273
    .line 274
    if-eqz v7, :cond_a

    .line 275
    .line 276
    iget-object v7, v1, Lq41;->Q:Li74;

    .line 277
    .line 278
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    :cond_a
    iget-object v7, v1, Lq41;->P:Ln84;

    .line 282
    .line 283
    invoke-interface {v0, v11, v12, v7}, Lno2;->e(JLn84;)J

    .line 284
    .line 285
    .line 286
    move-result-wide v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 287
    goto :goto_7

    .line 288
    :cond_b
    move-wide v13, v11

    .line 289
    :goto_7
    :try_start_6
    invoke-static {v13, v14}, Lf35;->i0(J)J

    .line 290
    .line 291
    .line 292
    move-result-wide v15

    .line 293
    iget-object v0, v1, Lq41;->V:Lph3;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 294
    .line 295
    move-wide/from16 v17, v5

    .line 296
    .line 297
    :try_start_7
    iget-wide v4, v0, Lph3;->s:J

    .line 298
    .line 299
    invoke-static {v4, v5}, Lf35;->i0(J)J

    .line 300
    .line 301
    .line 302
    move-result-wide v4

    .line 303
    cmp-long v0, v15, v4

    .line 304
    .line 305
    if-nez v0, :cond_c

    .line 306
    .line 307
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 308
    .line 309
    iget v4, v0, Lph3;->e:I

    .line 310
    .line 311
    if-eq v4, v3, :cond_d

    .line 312
    .line 313
    const/4 v5, 0x3

    .line 314
    if-ne v4, v5, :cond_c

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_c
    move v7, v2

    .line 318
    move-object v2, v10

    .line 319
    goto :goto_d

    .line 320
    :cond_d
    :goto_8
    iget-wide v3, v0, Lph3;->s:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 321
    .line 322
    move v9, v2

    .line 323
    move-object v2, v10

    .line 324
    const/4 v10, 0x2

    .line 325
    move-wide v7, v3

    .line 326
    move-wide/from16 v5, v17

    .line 327
    .line 328
    :goto_9
    invoke-virtual/range {v1 .. v10}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    iput-object v0, v1, Lq41;->V:Lph3;

    .line 333
    .line 334
    return-void

    .line 335
    :catchall_1
    move-exception v0

    .line 336
    move v7, v2

    .line 337
    move-object v2, v10

    .line 338
    :goto_a
    move v9, v7

    .line 339
    move-wide v3, v11

    .line 340
    move-wide/from16 v5, v17

    .line 341
    .line 342
    goto/16 :goto_17

    .line 343
    .line 344
    :catchall_2
    move-exception v0

    .line 345
    move v7, v2

    .line 346
    move-wide/from16 v17, v5

    .line 347
    .line 348
    :goto_b
    move-object v2, v10

    .line 349
    :goto_c
    move v9, v7

    .line 350
    goto/16 :goto_5

    .line 351
    .line 352
    :cond_e
    move v7, v2

    .line 353
    move-wide/from16 v17, v5

    .line 354
    .line 355
    move-object v2, v10

    .line 356
    move-wide v13, v11

    .line 357
    :goto_d
    :try_start_8
    iget-boolean v0, v1, Lq41;->R:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 358
    .line 359
    if-eqz v0, :cond_10

    .line 360
    .line 361
    :try_start_9
    iget-object v0, v1, Lq41;->n:[Lez3;

    .line 362
    .line 363
    array-length v4, v0

    .line 364
    move v5, v8

    .line 365
    :goto_e
    if-ge v5, v4, :cond_10

    .line 366
    .line 367
    aget-object v6, v0, v5

    .line 368
    .line 369
    invoke-virtual {v6}, Lez3;->g()Z

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    if-eqz v10, :cond_f

    .line 374
    .line 375
    iget-object v6, v6, Lez3;->e:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v6, Lkq;

    .line 378
    .line 379
    iget v6, v6, Lkq;->o:I

    .line 380
    .line 381
    if-ne v6, v3, :cond_f

    .line 382
    .line 383
    iput-boolean v9, v1, Lq41;->S:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 384
    .line 385
    goto :goto_f

    .line 386
    :catchall_3
    move-exception v0

    .line 387
    goto :goto_a

    .line 388
    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 389
    .line 390
    goto :goto_e

    .line 391
    :cond_10
    :goto_f
    :try_start_a
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 392
    .line 393
    iget v0, v0, Lph3;->e:I

    .line 394
    .line 395
    const/4 v3, 0x4

    .line 396
    if-ne v0, v3, :cond_11

    .line 397
    .line 398
    move v6, v9

    .line 399
    goto :goto_10

    .line 400
    :cond_11
    move v6, v8

    .line 401
    :goto_10
    iget-object v0, v1, Lq41;->F:Lro2;

    .line 402
    .line 403
    iget-object v3, v0, Lro2;->i:Loo2;

    .line 404
    .line 405
    iget-object v0, v0, Lro2;->j:Loo2;

    .line 406
    .line 407
    if-eq v3, v0, :cond_12

    .line 408
    .line 409
    move v5, v9

    .line 410
    :goto_11
    move-wide v3, v13

    .line 411
    goto :goto_12

    .line 412
    :cond_12
    move v5, v8

    .line 413
    goto :goto_11

    .line 414
    :goto_12
    invoke-virtual/range {v1 .. v6}, Lq41;->Y(Lmt2;JZZ)J

    .line 415
    .line 416
    .line 417
    move-result-wide v13
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 418
    cmp-long v0, v11, v13

    .line 419
    .line 420
    if-eqz v0, :cond_13

    .line 421
    .line 422
    goto :goto_13

    .line 423
    :cond_13
    move v9, v8

    .line 424
    :goto_13
    or-int/2addr v9, v7

    .line 425
    :try_start_b
    iget-object v0, v1, Lq41;->V:Lph3;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 426
    .line 427
    move-object v3, v2

    .line 428
    :try_start_c
    iget-object v2, v0, Lph3;->a:Lcu4;

    .line 429
    .line 430
    iget-object v5, v0, Lph3;->b:Lmt2;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 431
    .line 432
    const/4 v8, 0x1

    .line 433
    move-object v4, v2

    .line 434
    move-wide/from16 v6, v17

    .line 435
    .line 436
    :try_start_d
    invoke-virtual/range {v1 .. v8}, Lq41;->C0(Lcu4;Lmt2;Lcu4;Lmt2;JZ)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 437
    .line 438
    .line 439
    move-object v2, v3

    .line 440
    move-wide v5, v6

    .line 441
    move-wide v3, v13

    .line 442
    :goto_14
    const/4 v10, 0x2

    .line 443
    move-wide v7, v3

    .line 444
    move-object/from16 v1, p0

    .line 445
    .line 446
    goto :goto_9

    .line 447
    :catchall_4
    move-exception v0

    .line 448
    move-object v2, v3

    .line 449
    move-wide v5, v6

    .line 450
    :goto_15
    move-wide v3, v13

    .line 451
    goto :goto_17

    .line 452
    :catchall_5
    move-exception v0

    .line 453
    move-object v2, v3

    .line 454
    :goto_16
    move-wide/from16 v5, v17

    .line 455
    .line 456
    goto :goto_15

    .line 457
    :catchall_6
    move-exception v0

    .line 458
    goto :goto_16

    .line 459
    :catchall_7
    move-exception v0

    .line 460
    move-wide/from16 v5, v17

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :catchall_8
    move-exception v0

    .line 464
    move v7, v2

    .line 465
    goto :goto_b

    .line 466
    :goto_17
    const/4 v10, 0x2

    .line 467
    move-wide v7, v3

    .line 468
    invoke-virtual/range {v1 .. v10}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    iput-object v2, v1, Lq41;->V:Lph3;

    .line 473
    .line 474
    throw v0
.end method

.method public final Y(Lmt2;JZZ)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lq41;->v0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Lq41;->D0(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-nez p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, Lq41;->V:Lph3;

    .line 13
    .line 14
    iget p5, p5, Lph3;->e:I

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-ne p5, v3, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v2}, Lq41;->n0(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p5, p0, Lq41;->F:Lro2;

    .line 23
    .line 24
    iget-object p5, p5, Lro2;->i:Loo2;

    .line 25
    .line 26
    move-object v3, p5

    .line 27
    :goto_0
    if-eqz v3, :cond_3

    .line 28
    .line 29
    iget-object v4, v3, Loo2;->g:Lpo2;

    .line 30
    .line 31
    iget-object v4, v4, Lpo2;->a:Lmt2;

    .line 32
    .line 33
    invoke-virtual {p1, v4}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object v3, v3, Loo2;->m:Loo2;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 44
    .line 45
    if-ne p5, v3, :cond_4

    .line 46
    .line 47
    if-eqz v3, :cond_7

    .line 48
    .line 49
    iget-wide p4, v3, Loo2;->p:J

    .line 50
    .line 51
    add-long/2addr p4, p2

    .line 52
    const-wide/16 v4, 0x0

    .line 53
    .line 54
    cmp-long p1, p4, v4

    .line 55
    .line 56
    if-gez p1, :cond_7

    .line 57
    .line 58
    :cond_4
    move p1, v0

    .line 59
    :goto_2
    iget-object p4, p0, Lq41;->n:[Lez3;

    .line 60
    .line 61
    array-length p4, p4

    .line 62
    if-ge p1, p4, :cond_5

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lq41;->i(I)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    const-wide p4, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    iput-wide p4, p0, Lq41;->r0:J

    .line 76
    .line 77
    if-eqz v3, :cond_7

    .line 78
    .line 79
    :goto_3
    iget-object p1, p0, Lq41;->F:Lro2;

    .line 80
    .line 81
    iget-object p4, p1, Lro2;->i:Loo2;

    .line 82
    .line 83
    if-eq p4, v3, :cond_6

    .line 84
    .line 85
    invoke-virtual {p1}, Lro2;->a()Loo2;

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_6
    invoke-virtual {p1, v3}, Lro2;->o(Loo2;)I

    .line 90
    .line 91
    .line 92
    const-wide p4, 0xe8d4a51000L

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    iput-wide p4, v3, Loo2;->p:J

    .line 98
    .line 99
    iget-object p1, p0, Lq41;->n:[Lez3;

    .line 100
    .line 101
    array-length p1, p1

    .line 102
    new-array p1, p1, [Z

    .line 103
    .line 104
    iget-object p4, p0, Lq41;->F:Lro2;

    .line 105
    .line 106
    iget-object p4, p4, Lro2;->j:Loo2;

    .line 107
    .line 108
    invoke-virtual {p4}, Loo2;->e()J

    .line 109
    .line 110
    .line 111
    move-result-wide p4

    .line 112
    invoke-virtual {p0, p1, p4, p5}, Lq41;->m([ZJ)V

    .line 113
    .line 114
    .line 115
    iput-boolean v1, v3, Loo2;->h:Z

    .line 116
    .line 117
    :cond_7
    invoke-virtual {p0}, Lq41;->h()V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lq41;->F:Lro2;

    .line 121
    .line 122
    if-eqz v3, :cond_10

    .line 123
    .line 124
    invoke-virtual {p1, v3}, Lro2;->o(Loo2;)I

    .line 125
    .line 126
    .line 127
    iget-boolean p1, v3, Loo2;->e:Z

    .line 128
    .line 129
    if-nez p1, :cond_8

    .line 130
    .line 131
    iget-object p1, v3, Loo2;->g:Lpo2;

    .line 132
    .line 133
    invoke-virtual {p1, p2, p3}, Lpo2;->b(J)Lpo2;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iput-object p1, v3, Loo2;->g:Lpo2;

    .line 138
    .line 139
    goto/16 :goto_7

    .line 140
    .line 141
    :cond_8
    iget-boolean p1, v3, Loo2;->f:Z

    .line 142
    .line 143
    if-eqz p1, :cond_f

    .line 144
    .line 145
    iget-boolean p1, p0, Lq41;->R:Z

    .line 146
    .line 147
    if-eqz p1, :cond_e

    .line 148
    .line 149
    iget-object p1, p0, Lq41;->Q:Li74;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 155
    .line 156
    iget-object p1, p1, Lph3;->a:Lcu4;

    .line 157
    .line 158
    invoke-virtual {p1}, Lcu4;->p()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_e

    .line 163
    .line 164
    iget-object p1, v3, Loo2;->g:Lpo2;

    .line 165
    .line 166
    iget-object p1, p1, Lpo2;->a:Lmt2;

    .line 167
    .line 168
    iget-object p4, p0, Lq41;->V:Lph3;

    .line 169
    .line 170
    iget-object p4, p4, Lph3;->b:Lmt2;

    .line 171
    .line 172
    invoke-virtual {p1, p4}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-nez p1, :cond_9

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_9
    iget-wide p4, v3, Loo2;->p:J

    .line 180
    .line 181
    add-long/2addr p4, p2

    .line 182
    iget-object p1, p0, Lq41;->n:[Lez3;

    .line 183
    .line 184
    array-length v4, p1

    .line 185
    move v5, v0

    .line 186
    move v6, v1

    .line 187
    :goto_4
    if-ge v5, v4, :cond_c

    .line 188
    .line 189
    aget-object v7, p1, v5

    .line 190
    .line 191
    invoke-virtual {v7}, Lez3;->g()Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-eqz v8, :cond_b

    .line 196
    .line 197
    invoke-virtual {v7, v3}, Lez3;->d(Loo2;)Lkq;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    if-eqz v7, :cond_a

    .line 202
    .line 203
    invoke-virtual {v7, p4, p5}, Lkq;->G(J)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_a

    .line 208
    .line 209
    move v7, v1

    .line 210
    goto :goto_5

    .line 211
    :cond_a
    move v7, v0

    .line 212
    :goto_5
    and-int/2addr v6, v7

    .line 213
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_c
    if-nez v6, :cond_d

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_d
    iget-object p1, v3, Loo2;->a:Lno2;

    .line 220
    .line 221
    iget-object p4, p0, Lq41;->V:Lph3;

    .line 222
    .line 223
    iget-wide p4, p4, Lph3;->s:J

    .line 224
    .line 225
    sget-object v4, Ln84;->c:Ln84;

    .line 226
    .line 227
    invoke-interface {p1, p4, p5, v4}, Lno2;->e(JLn84;)J

    .line 228
    .line 229
    .line 230
    move-result-wide p4

    .line 231
    iget-object p1, v3, Loo2;->a:Lno2;

    .line 232
    .line 233
    invoke-interface {p1, p2, p3, v4}, Lno2;->e(JLn84;)J

    .line 234
    .line 235
    .line 236
    move-result-wide v4

    .line 237
    cmp-long p1, p4, v4

    .line 238
    .line 239
    if-nez p1, :cond_e

    .line 240
    .line 241
    move v1, v0

    .line 242
    goto :goto_7

    .line 243
    :cond_e
    :goto_6
    iget-object p1, v3, Loo2;->a:Lno2;

    .line 244
    .line 245
    invoke-interface {p1, p2, p3}, Lno2;->i(J)J

    .line 246
    .line 247
    .line 248
    move-result-wide p2

    .line 249
    iget-object p1, v3, Loo2;->a:Lno2;

    .line 250
    .line 251
    iget-wide p4, p0, Lq41;->z:J

    .line 252
    .line 253
    sub-long p4, p2, p4

    .line 254
    .line 255
    iget-boolean v3, p0, Lq41;->A:Z

    .line 256
    .line 257
    invoke-interface {p1, v3, p4, p5}, Lno2;->k(ZJ)V

    .line 258
    .line 259
    .line 260
    :cond_f
    :goto_7
    invoke-virtual {p0, v1, p2, p3}, Lq41;->R(ZJ)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0}, Lq41;->D()V

    .line 264
    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_10
    invoke-virtual {p1}, Lro2;->b()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0, v1, p2, p3}, Lq41;->R(ZJ)V

    .line 271
    .line 272
    .line 273
    :goto_8
    invoke-virtual {p0, v0}, Lq41;->v(Z)V

    .line 274
    .line 275
    .line 276
    iget-object p0, p0, Lq41;->u:Lyp4;

    .line 277
    .line 278
    invoke-virtual {p0, v2}, Lyp4;->g(I)V

    .line 279
    .line 280
    .line 281
    return-wide p2
.end method

.method public final Z(Lsk3;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lq41;->u:Lyp4;

    .line 5
    .line 6
    iget-object v1, p1, Lsk3;->e:Landroid/os/Looper;

    .line 7
    .line 8
    iget-object v2, p0, Lq41;->w:Landroid/os/Looper;

    .line 9
    .line 10
    if-ne v1, v2, :cond_2

    .line 11
    .line 12
    monitor-enter p1

    .line 13
    monitor-exit p1

    .line 14
    const/4 v1, 0x1

    .line 15
    :try_start_0
    iget-object v2, p1, Lsk3;->a:Lrk3;

    .line 16
    .line 17
    iget v3, p1, Lsk3;->c:I

    .line 18
    .line 19
    iget-object v4, p1, Lsk3;->d:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {v2, v3, v4}, Lrk3;->c(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lsk3;->a(Z)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lq41;->V:Lph3;

    .line 28
    .line 29
    iget p0, p0, Lph3;->e:I

    .line 30
    .line 31
    const/4 p1, 0x3

    .line 32
    const/4 v1, 0x2

    .line 33
    if-eq p0, p1, :cond_1

    .line 34
    .line 35
    if-ne p0, v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Lyp4;->g(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    invoke-virtual {p1, v1}, Lsk3;->a(Z)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    const/16 p0, 0xf

    .line 49
    .line 50
    invoke-virtual {v0, p0, p1}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Lxp4;->b()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final a(Ll41;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq41;->W:Ln41;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ln41;->e(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iget-object v1, p0, Lq41;->G:Lfo1;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    iget-object p2, v1, Lfo1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    :cond_0
    iget-object v0, p1, Ll41;->a:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object p1, p1, Ll41;->b:Lpd4;

    .line 23
    .line 24
    invoke-virtual {v1, p2, v0, p1}, Lfo1;->b(ILjava/util/ArrayList;Lpd4;)Lcu4;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p0, p1, p2}, Lq41;->w(Lcu4;Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final a0(Lsk3;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lsk3;->e:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string p0, "TAG"

    .line 14
    .line 15
    const-string v0, "Trying to send message on a dead thread."

    .line 16
    .line 17
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    invoke-virtual {p1, p0}, Lsk3;->a(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    iget-object v2, p0, Lq41;->D:Lvp4;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La0;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, La0;-><init>(Lq41;Lsk3;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final b(Lno2;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lq41;->u:Lyp4;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lxp4;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b0(Lil;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lq41;->q:Lpn0;

    .line 2
    .line 3
    iget-object v1, v0, Lpn0;->i:Lil;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lil;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p1, v0, Lpn0;->i:Lil;

    .line 13
    .line 14
    invoke-virtual {v0}, Lpn0;->e()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_1
    iget-object p2, p0, Lq41;->N:Ltl;

    .line 22
    .line 23
    iget-object v0, p2, Ltl;->d:Lil;

    .line 24
    .line 25
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_6

    .line 30
    .line 31
    iput-object p1, p2, Ltl;->d:Lil;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/4 v1, 0x1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    :goto_2
    :pswitch_0
    move v3, v0

    .line 38
    goto :goto_4

    .line 39
    :cond_2
    iget v2, p1, Lil;->c:I

    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    const/4 v4, 0x2

    .line 43
    const-string v5, "AudioFocusManager"

    .line 44
    .line 45
    packed-switch v2, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    :pswitch_1
    const-string p1, "Unidentified audio usage: "

    .line 49
    .line 50
    invoke-static {v2, p1, v5}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :pswitch_2
    const/4 v3, 0x4

    .line 55
    goto :goto_4

    .line 56
    :pswitch_3
    iget p1, p1, Lil;->a:I

    .line 57
    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    :pswitch_4
    move v3, v4

    .line 61
    goto :goto_4

    .line 62
    :goto_3
    :pswitch_5
    move v3, v1

    .line 63
    goto :goto_4

    .line 64
    :pswitch_6
    const-string p1, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."

    .line 65
    .line 66
    invoke-static {v5, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    :goto_4
    :pswitch_7
    iput v3, p2, Ltl;->f:I

    .line 71
    .line 72
    if-eq v3, v1, :cond_4

    .line 73
    .line 74
    if-nez v3, :cond_5

    .line 75
    .line 76
    :cond_4
    move v0, v1

    .line 77
    :cond_5
    const-string p1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."

    .line 78
    .line 79
    invoke-static {p1, v0}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    :cond_6
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 83
    .line 84
    iget-boolean v0, p1, Lph3;->l:Z

    .line 85
    .line 86
    iget v1, p1, Lph3;->n:I

    .line 87
    .line 88
    iget v2, p1, Lph3;->m:I

    .line 89
    .line 90
    iget p1, p1, Lph3;->e:I

    .line 91
    .line 92
    invoke-virtual {p2, p1, v0}, Ltl;->c(IZ)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-virtual {p0, p1, v1, v2, v0}, Lq41;->A0(IIIZ)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object p0, p0, Lq41;->u:Lyp4;

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lyp4;->g(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c0(ZLq90;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq41;->f0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lq41;->f0:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lq41;->n:[Lez3;

    .line 10
    .line 11
    array-length p1, p0

    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-ge v0, p1, :cond_0

    .line 14
    .line 15
    aget-object v1, p0, v0

    .line 16
    .line 17
    invoke-virtual {v1}, Lez3;->k()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2}, Lq90;->d()Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final d(JJLtb1;Landroid/media/MediaFormat;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lq41;->S:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lq41;->u:Lyp4;

    .line 6
    .line 7
    const/16 p1, 0x25

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lyp4;->a(I)Lxp4;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lxp4;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final d0(Ll41;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lq41;->W:Ln41;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ln41;->e(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Ll41;->c:I

    .line 8
    .line 9
    iget-object v1, p1, Ll41;->b:Lpd4;

    .line 10
    .line 11
    iget-object v2, p1, Ll41;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    if-eq v0, v3, :cond_0

    .line 15
    .line 16
    new-instance v0, Lp41;

    .line 17
    .line 18
    new-instance v3, Ltm3;

    .line 19
    .line 20
    invoke-direct {v3, v2, v1}, Ltm3;-><init>(Ljava/util/ArrayList;Lpd4;)V

    .line 21
    .line 22
    .line 23
    iget v4, p1, Ll41;->c:I

    .line 24
    .line 25
    iget-wide v5, p1, Ll41;->d:J

    .line 26
    .line 27
    invoke-direct {v0, v4, v5, v6, v3}, Lp41;-><init>(IJLcu4;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lq41;->j0:Lp41;

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lq41;->G:Lfo1;

    .line 33
    .line 34
    iget-object v0, p1, Lfo1;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-virtual {p1, v4, v3}, Lfo1;->o(II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, v0, v2, v1}, Lfo1;->b(ILjava/util/ArrayList;Lpd4;)Lcu4;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1, v4}, Lq41;->w(Lcu4;Z)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final e()V
    .locals 7

    .line 1
    iget-object v0, p0, Lq41;->n:[Lez3;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_2

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-boolean v4, p0, Lq41;->R:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Lq41;->Q:Li74;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v4, 0x0

    .line 17
    :goto_1
    iget-object v5, v3, Lez3;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Lkq;

    .line 20
    .line 21
    const/16 v6, 0x12

    .line 22
    .line 23
    invoke-interface {v5, v6, v4}, Lrk3;->c(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v3, Lez3;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Lkq;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v3, v6, v4}, Lrk3;->c(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return-void
.end method

.method public final e0(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lq41;->Y:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lq41;->Q()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lq41;->Z:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lq41;->F:Lro2;

    .line 11
    .line 12
    iget-object v0, p1, Lro2;->j:Loo2;

    .line 13
    .line 14
    iget-object p1, p1, Lro2;->i:Loo2;

    .line 15
    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lq41;->W(Z)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lq41;->v(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lq41;->M:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object p0, p0, Lq41;->n:[Lez3;

    .line 8
    .line 9
    array-length v0, p0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, v0, :cond_2

    .line 12
    .line 13
    aget-object v3, p0, v2

    .line 14
    .line 15
    invoke-virtual {v3}, Lez3;->f()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    return v1
.end method

.method public final f0(Lqh3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq41;->u:Lyp4;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lyp4;->f(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lq41;->B:Lxl0;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lxl0;->d(Lqh3;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lxl0;->i()Lqh3;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x1

    .line 18
    iget v1, p1, Lqh3;->a:F

    .line 19
    .line 20
    invoke-virtual {p0, p1, v1, v0, v0}, Lq41;->y(Lqh3;FZZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq41;->O()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lq41;->W(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final g0(Lp31;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lq41;->q0:Lp31;

    .line 2
    .line 3
    iget-object v0, p0, Lq41;->V:Lph3;

    .line 4
    .line 5
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 6
    .line 7
    iget-object p0, p0, Lq41;->F:Lro2;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lro2;->q:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    :goto_0
    iget-object v1, p0, Lro2;->q:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ge v0, v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lro2;->q:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Loo2;

    .line 44
    .line 45
    invoke-virtual {v1}, Loo2;->i()V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iput-object p1, p0, Lro2;->q:Ljava/util/ArrayList;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lro2;->m:Loo2;

    .line 55
    .line 56
    invoke-virtual {p0}, Lro2;->l()V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final h()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lq41;->M:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Lq41;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_6

    .line 12
    :cond_0
    iget-object v0, p0, Lq41;->n:[Lez3;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v3, v1, :cond_6

    .line 18
    .line 19
    aget-object v4, v0, v3

    .line 20
    .line 21
    invoke-virtual {v4}, Lez3;->c()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {v4}, Lez3;->f()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_1

    .line 30
    .line 31
    goto :goto_5

    .line 32
    :cond_1
    iget v6, v4, Lez3;->d:I

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    const/4 v8, 0x4

    .line 36
    if-eq v6, v8, :cond_3

    .line 37
    .line 38
    const/4 v9, 0x2

    .line 39
    if-ne v6, v9, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v9, v2

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    :goto_1
    move v9, v7

    .line 45
    :goto_2
    if-ne v6, v8, :cond_4

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    move v7, v2

    .line 49
    :goto_3
    if-eqz v9, :cond_5

    .line 50
    .line 51
    iget-object v6, v4, Lez3;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, Lkq;

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_5
    iget-object v6, v4, Lez3;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Lkq;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    :goto_4
    iget-object v8, p0, Lq41;->B:Lxl0;

    .line 64
    .line 65
    invoke-virtual {v4, v6, v8}, Lez3;->a(Lkq;Lxl0;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v9}, Lez3;->i(Z)V

    .line 69
    .line 70
    .line 71
    iput v7, v4, Lez3;->d:I

    .line 72
    .line 73
    :goto_5
    iget v6, p0, Lq41;->i0:I

    .line 74
    .line 75
    invoke-virtual {v4}, Lez3;->c()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    sub-int/2addr v5, v4

    .line 80
    sub-int/2addr v6, v5

    .line 81
    iput v6, p0, Lq41;->i0:I

    .line 82
    .line 83
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    iput-wide v0, p0, Lq41;->r0:J

    .line 92
    .line 93
    :cond_7
    :goto_6
    return-void
.end method

.method public final h0(I)V
    .locals 2

    .line 1
    iput p1, p0, Lq41;->d0:I

    .line 2
    .line 3
    iget-object v0, p0, Lq41;->V:Lph3;

    .line 4
    .line 5
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 6
    .line 7
    iget-object v1, p0, Lq41;->F:Lro2;

    .line 8
    .line 9
    iput p1, v1, Lro2;->g:I

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lro2;->s(Lcu4;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 v0, p1, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Lq41;->W(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lq41;->h()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Lq41;->v(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v11, "Playback error"

    .line 6
    .line 7
    const-string v12, "ExoPlayerImplInternal"

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/16 v3, 0x3e8

    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v13, 0x0

    .line 14
    const/4 v14, 0x1

    .line 15
    :try_start_0
    iget v5, v0, Landroid/os/Message;->what:I

    .line 16
    .line 17
    packed-switch v5, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    :pswitch_0
    return v13

    .line 21
    :pswitch_1
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Li74;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lq41;->j0(Li74;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_10

    .line 29
    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :catch_1
    move-exception v0

    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :catch_2
    move-exception v0

    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :catch_3
    move-exception v0

    .line 40
    goto/16 :goto_8

    .line 41
    .line 42
    :catch_4
    move-exception v0

    .line 43
    goto/16 :goto_9

    .line 44
    .line 45
    :catch_5
    move-exception v0

    .line 46
    goto/16 :goto_c

    .line 47
    .line 48
    :catch_6
    move-exception v0

    .line 49
    goto/16 :goto_d

    .line 50
    .line 51
    :pswitch_2
    iput-boolean v13, v1, Lq41;->S:Z

    .line 52
    .line 53
    iget-object v0, v1, Lq41;->T:Lp41;

    .line 54
    .line 55
    if-eqz v0, :cond_14

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Lq41;->X(Lp41;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    iput-object v0, v1, Lq41;->T:Lp41;

    .line 62
    .line 63
    goto/16 :goto_10

    .line 64
    .line 65
    :pswitch_3
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {v1, v0}, Lq41;->i0(Z)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_10

    .line 77
    .line 78
    :pswitch_4
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lc55;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Lq41;->o0(Lc55;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_10

    .line 86
    .line 87
    :pswitch_5
    invoke-virtual {v1}, Lq41;->s()V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_10

    .line 91
    .line 92
    :pswitch_6
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Lq41;->r(I)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_10

    .line 98
    .line 99
    :pswitch_7
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Ljava/lang/Float;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {v1, v0}, Lq41;->q0(F)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_10

    .line 111
    .line 112
    :pswitch_8
    iget-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v5, Lil;

    .line 115
    .line 116
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 117
    .line 118
    if-eqz v0, :cond_0

    .line 119
    .line 120
    move v0, v14

    .line 121
    goto :goto_0

    .line 122
    :cond_0
    move v0, v13

    .line 123
    :goto_0
    invoke-virtual {v1, v5, v0}, Lq41;->b0(Lil;Z)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_10

    .line 127
    .line 128
    :pswitch_9
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Landroid/util/Pair;

    .line 131
    .line 132
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 133
    .line 134
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lq90;

    .line 137
    .line 138
    invoke-virtual {v1, v5, v0}, Lq41;->p0(Ljava/lang/Object;Lq90;)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_10

    .line 142
    .line 143
    :pswitch_a
    invoke-virtual {v1}, Lq41;->K()V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_10

    .line 147
    .line 148
    :pswitch_b
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Lp31;

    .line 151
    .line 152
    invoke-virtual {v1, v0}, Lq41;->g0(Lp31;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_10

    .line 156
    .line 157
    :pswitch_c
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 158
    .line 159
    iget v6, v0, Landroid/os/Message;->arg2:I

    .line 160
    .line 161
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Ljava/util/List;

    .line 164
    .line 165
    invoke-virtual {v1, v5, v6, v0}, Lq41;->y0(IILjava/util/List;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_10

    .line 169
    .line 170
    :pswitch_d
    invoke-virtual {v1}, Lq41;->O()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v14}, Lq41;->W(Z)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_10

    .line 177
    .line 178
    :pswitch_e
    invoke-virtual {v1}, Lq41;->g()V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_10

    .line 182
    .line 183
    :pswitch_f
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 184
    .line 185
    if-eqz v0, :cond_1

    .line 186
    .line 187
    move v0, v14

    .line 188
    goto :goto_1

    .line 189
    :cond_1
    move v0, v13

    .line 190
    :goto_1
    invoke-virtual {v1, v0}, Lq41;->e0(Z)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_10

    .line 194
    .line 195
    :pswitch_10
    invoke-virtual {v1}, Lq41;->I()V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_10

    .line 199
    .line 200
    :pswitch_11
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Lpd4;

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Lq41;->m0(Lpd4;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_10

    .line 208
    .line 209
    :pswitch_12
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 210
    .line 211
    iget v6, v0, Landroid/os/Message;->arg2:I

    .line 212
    .line 213
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Lpd4;

    .line 216
    .line 217
    invoke-virtual {v1, v5, v6, v0}, Lq41;->N(IILpd4;)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_10

    .line 221
    .line 222
    :pswitch_13
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lm41;

    .line 225
    .line 226
    invoke-virtual {v1, v0}, Lq41;->J(Lm41;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_10

    .line 230
    .line 231
    :pswitch_14
    iget-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v5, Ll41;

    .line 234
    .line 235
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 236
    .line 237
    invoke-virtual {v1, v5, v0}, Lq41;->a(Ll41;I)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_10

    .line 241
    .line 242
    :pswitch_15
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Ll41;

    .line 245
    .line 246
    invoke-virtual {v1, v0}, Lq41;->d0(Ll41;)V

    .line 247
    .line 248
    .line 249
    goto/16 :goto_10

    .line 250
    .line 251
    :pswitch_16
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lqh3;

    .line 254
    .line 255
    iget v5, v0, Lqh3;->a:F

    .line 256
    .line 257
    invoke-virtual {v1, v0, v5, v14, v13}, Lq41;->y(Lqh3;FZZ)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_10

    .line 261
    .line 262
    :pswitch_17
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Lsk3;

    .line 265
    .line 266
    invoke-virtual {v1, v0}, Lq41;->a0(Lsk3;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_10

    .line 270
    .line 271
    :pswitch_18
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Lsk3;

    .line 274
    .line 275
    invoke-virtual {v1, v0}, Lq41;->Z(Lsk3;)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_10

    .line 279
    .line 280
    :pswitch_19
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 281
    .line 282
    if-eqz v5, :cond_2

    .line 283
    .line 284
    move v5, v14

    .line 285
    goto :goto_2

    .line 286
    :cond_2
    move v5, v13

    .line 287
    :goto_2
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, Lq90;

    .line 290
    .line 291
    invoke-virtual {v1, v5, v0}, Lq41;->c0(ZLq90;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_10

    .line 295
    .line 296
    :pswitch_1a
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 297
    .line 298
    if-eqz v0, :cond_3

    .line 299
    .line 300
    move v0, v14

    .line 301
    goto :goto_3

    .line 302
    :cond_3
    move v0, v13

    .line 303
    :goto_3
    invoke-virtual {v1, v0}, Lq41;->l0(Z)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_10

    .line 307
    .line 308
    :pswitch_1b
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 309
    .line 310
    invoke-virtual {v1, v0}, Lq41;->h0(I)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_10

    .line 314
    .line 315
    :pswitch_1c
    invoke-virtual {v1}, Lq41;->O()V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_10

    .line 319
    .line 320
    :pswitch_1d
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, Lno2;

    .line 323
    .line 324
    invoke-virtual {v1, v0}, Lq41;->t(Lno2;)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_10

    .line 328
    .line 329
    :pswitch_1e
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Lno2;

    .line 332
    .line 333
    invoke-virtual {v1, v0}, Lq41;->x(Lno2;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_10

    .line 337
    .line 338
    :pswitch_1f
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, Lq90;

    .line 341
    .line 342
    invoke-virtual {v1, v0}, Lq41;->L(Lq90;)V

    .line 343
    .line 344
    .line 345
    return v14

    .line 346
    :pswitch_20
    invoke-virtual {v1, v13, v14}, Lq41;->u0(ZZ)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_10

    .line 350
    .line 351
    :pswitch_21
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Ln84;

    .line 354
    .line 355
    invoke-virtual {v1, v0}, Lq41;->k0(Ln84;)V

    .line 356
    .line 357
    .line 358
    goto/16 :goto_10

    .line 359
    .line 360
    :pswitch_22
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Lqh3;

    .line 363
    .line 364
    invoke-virtual {v1, v0}, Lq41;->f0(Lqh3;)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_10

    .line 368
    .line 369
    :pswitch_23
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, Lp41;

    .line 372
    .line 373
    invoke-virtual {v1, v0}, Lq41;->X(Lp41;)V

    .line 374
    .line 375
    .line 376
    goto/16 :goto_10

    .line 377
    .line 378
    :pswitch_24
    invoke-virtual {v1}, Lq41;->k()V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_10

    .line 382
    .line 383
    :pswitch_25
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 384
    .line 385
    if-eqz v5, :cond_4

    .line 386
    .line 387
    move v5, v14

    .line 388
    goto :goto_4

    .line 389
    :cond_4
    move v5, v13

    .line 390
    :goto_4
    iget v0, v0, Landroid/os/Message;->arg2:I

    .line 391
    .line 392
    shr-int/lit8 v6, v0, 0x4

    .line 393
    .line 394
    and-int/lit8 v0, v0, 0xf

    .line 395
    .line 396
    iget-object v7, v1, Lq41;->W:Ln41;

    .line 397
    .line 398
    invoke-virtual {v7, v14}, Ln41;->e(I)V

    .line 399
    .line 400
    .line 401
    iget-object v7, v1, Lq41;->N:Ltl;

    .line 402
    .line 403
    iget-object v8, v1, Lq41;->V:Lph3;

    .line 404
    .line 405
    iget v8, v8, Lph3;->e:I

    .line 406
    .line 407
    invoke-virtual {v7, v8, v5}, Ltl;->c(IZ)I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    invoke-virtual {v1, v7, v6, v0, v5}, Lq41;->A0(IIIZ)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Landroidx/media3/datasource/DataSourceException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroidx/media3/exoplayer/source/BehindLiveWindowException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    .line 413
    .line 414
    goto/16 :goto_10

    .line 415
    .line 416
    :goto_5
    instance-of v4, v0, Ljava/lang/IllegalStateException;

    .line 417
    .line 418
    if-nez v4, :cond_5

    .line 419
    .line 420
    instance-of v4, v0, Ljava/lang/IllegalArgumentException;

    .line 421
    .line 422
    if-eqz v4, :cond_6

    .line 423
    .line 424
    :cond_5
    const/16 v3, 0x3ec

    .line 425
    .line 426
    :cond_6
    new-instance v4, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 427
    .line 428
    invoke-direct {v4, v2, v0, v3}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    .line 429
    .line 430
    .line 431
    invoke-static {v12, v11, v4}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1, v14, v13}, Lq41;->u0(ZZ)V

    .line 435
    .line 436
    .line 437
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 438
    .line 439
    invoke-virtual {v0, v4}, Lph3;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lph3;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    iput-object v0, v1, Lq41;->V:Lph3;

    .line 444
    .line 445
    goto/16 :goto_10

    .line 446
    .line 447
    :goto_6
    const/16 v2, 0x7d0

    .line 448
    .line 449
    invoke-virtual {v1, v0, v2}, Lq41;->u(Ljava/io/IOException;I)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_10

    .line 453
    .line 454
    :goto_7
    const/16 v2, 0x3ea

    .line 455
    .line 456
    invoke-virtual {v1, v0, v2}, Lq41;->u(Ljava/io/IOException;I)V

    .line 457
    .line 458
    .line 459
    goto/16 :goto_10

    .line 460
    .line 461
    :goto_8
    iget v2, v0, Landroidx/media3/datasource/DataSourceException;->n:I

    .line 462
    .line 463
    invoke-virtual {v1, v0, v2}, Lq41;->u(Ljava/io/IOException;I)V

    .line 464
    .line 465
    .line 466
    goto/16 :goto_10

    .line 467
    .line 468
    :goto_9
    iget-boolean v2, v0, Landroidx/media3/common/ParserException;->n:Z

    .line 469
    .line 470
    iget v5, v0, Landroidx/media3/common/ParserException;->o:I

    .line 471
    .line 472
    if-ne v5, v14, :cond_8

    .line 473
    .line 474
    if-eqz v2, :cond_7

    .line 475
    .line 476
    const/16 v2, 0xbb9

    .line 477
    .line 478
    :goto_a
    move v3, v2

    .line 479
    goto :goto_b

    .line 480
    :cond_7
    const/16 v2, 0xbbb

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_8
    if-ne v5, v4, :cond_a

    .line 484
    .line 485
    if-eqz v2, :cond_9

    .line 486
    .line 487
    const/16 v2, 0xbba

    .line 488
    .line 489
    goto :goto_a

    .line 490
    :cond_9
    const/16 v2, 0xbbc

    .line 491
    .line 492
    goto :goto_a

    .line 493
    :cond_a
    :goto_b
    invoke-virtual {v1, v0, v3}, Lq41;->u(Ljava/io/IOException;I)V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_10

    .line 497
    .line 498
    :goto_c
    iget v2, v0, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;->n:I

    .line 499
    .line 500
    invoke-virtual {v1, v0, v2}, Lq41;->u(Ljava/io/IOException;I)V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_10

    .line 504
    .line 505
    :goto_d
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->w:I

    .line 506
    .line 507
    iget-object v5, v1, Lq41;->F:Lro2;

    .line 508
    .line 509
    if-ne v3, v14, :cond_b

    .line 510
    .line 511
    iget-object v3, v5, Lro2;->j:Loo2;

    .line 512
    .line 513
    if-eqz v3, :cond_b

    .line 514
    .line 515
    iget-object v6, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->B:Lmt2;

    .line 516
    .line 517
    if-nez v6, :cond_b

    .line 518
    .line 519
    iget-object v3, v3, Loo2;->g:Lpo2;

    .line 520
    .line 521
    iget-object v3, v3, Lpo2;->a:Lmt2;

    .line 522
    .line 523
    invoke-virtual {v0, v3}, Landroidx/media3/exoplayer/ExoPlaybackException;->b(Lmt2;)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    :cond_b
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->w:I

    .line 528
    .line 529
    iget-object v15, v1, Lq41;->u:Lyp4;

    .line 530
    .line 531
    if-ne v3, v14, :cond_d

    .line 532
    .line 533
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->B:Lmt2;

    .line 534
    .line 535
    if-eqz v3, :cond_d

    .line 536
    .line 537
    iget v6, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    .line 538
    .line 539
    invoke-virtual {v1, v6, v3}, Lq41;->B(ILmt2;)Z

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    if-eqz v3, :cond_d

    .line 544
    .line 545
    iput-boolean v14, v1, Lq41;->s0:Z

    .line 546
    .line 547
    invoke-virtual {v1}, Lq41;->h()V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v5}, Lro2;->h()Loo2;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    iget-object v3, v5, Lro2;->i:Loo2;

    .line 555
    .line 556
    if-eq v3, v0, :cond_c

    .line 557
    .line 558
    :goto_e
    if-eqz v3, :cond_c

    .line 559
    .line 560
    iget-object v6, v3, Loo2;->m:Loo2;

    .line 561
    .line 562
    if-eq v6, v0, :cond_c

    .line 563
    .line 564
    move-object v3, v6

    .line 565
    goto :goto_e

    .line 566
    :cond_c
    invoke-virtual {v5, v3}, Lro2;->o(Loo2;)I

    .line 567
    .line 568
    .line 569
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 570
    .line 571
    iget v0, v0, Lph3;->e:I

    .line 572
    .line 573
    if-eq v0, v4, :cond_14

    .line 574
    .line 575
    invoke-virtual {v1}, Lq41;->D()V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v15, v2}, Lyp4;->g(I)V

    .line 579
    .line 580
    .line 581
    goto/16 :goto_10

    .line 582
    .line 583
    :cond_d
    iget-object v2, v1, Lq41;->o0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 584
    .line 585
    if-eqz v2, :cond_e

    .line 586
    .line 587
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 588
    .line 589
    .line 590
    iget-object v0, v1, Lq41;->o0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 591
    .line 592
    :cond_e
    iget v2, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->w:I

    .line 593
    .line 594
    if-ne v2, v14, :cond_10

    .line 595
    .line 596
    iget-object v2, v5, Lro2;->i:Loo2;

    .line 597
    .line 598
    iget-object v3, v5, Lro2;->j:Loo2;

    .line 599
    .line 600
    if-eq v2, v3, :cond_10

    .line 601
    .line 602
    :goto_f
    iget-object v2, v5, Lro2;->i:Loo2;

    .line 603
    .line 604
    iget-object v3, v5, Lro2;->j:Loo2;

    .line 605
    .line 606
    if-eq v2, v3, :cond_f

    .line 607
    .line 608
    invoke-virtual {v5}, Lro2;->a()Loo2;

    .line 609
    .line 610
    .line 611
    goto :goto_f

    .line 612
    :cond_f
    invoke-static {v2}, Lrr2;->r(Loo2;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1}, Lq41;->F()V

    .line 616
    .line 617
    .line 618
    iget-object v2, v2, Loo2;->g:Lpo2;

    .line 619
    .line 620
    iget-object v3, v2, Lpo2;->a:Lmt2;

    .line 621
    .line 622
    move-object v5, v3

    .line 623
    iget-wide v3, v2, Lpo2;->b:J

    .line 624
    .line 625
    iget-wide v6, v2, Lpo2;->c:J

    .line 626
    .line 627
    const/4 v9, 0x1

    .line 628
    const/4 v10, 0x0

    .line 629
    move-object v2, v5

    .line 630
    move-wide v5, v6

    .line 631
    move-wide v7, v3

    .line 632
    invoke-virtual/range {v1 .. v10}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    iput-object v2, v1, Lq41;->V:Lph3;

    .line 637
    .line 638
    :cond_10
    iget-boolean v2, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->C:Z

    .line 639
    .line 640
    if-eqz v2, :cond_13

    .line 641
    .line 642
    iget-object v2, v1, Lq41;->o0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 643
    .line 644
    if-eqz v2, :cond_11

    .line 645
    .line 646
    iget v2, v0, Landroidx/media3/common/PlaybackException;->n:I

    .line 647
    .line 648
    const/16 v3, 0x138c

    .line 649
    .line 650
    if-eq v2, v3, :cond_11

    .line 651
    .line 652
    const/16 v3, 0x138b

    .line 653
    .line 654
    if-ne v2, v3, :cond_13

    .line 655
    .line 656
    :cond_11
    const-string v2, "Recoverable renderer error"

    .line 657
    .line 658
    invoke-static {v12, v2, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 659
    .line 660
    .line 661
    iget-object v2, v1, Lq41;->o0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 662
    .line 663
    if-nez v2, :cond_12

    .line 664
    .line 665
    iput-object v0, v1, Lq41;->o0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 666
    .line 667
    :cond_12
    const/16 v2, 0x19

    .line 668
    .line 669
    invoke-virtual {v15, v2, v0}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    iget-object v2, v15, Lyp4;->a:Landroid/os/Handler;

    .line 674
    .line 675
    iget-object v3, v0, Lxp4;->a:Landroid/os/Message;

    .line 676
    .line 677
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Lxp4;->a()V

    .line 684
    .line 685
    .line 686
    goto :goto_10

    .line 687
    :cond_13
    invoke-static {v12, v11, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1, v14, v13}, Lq41;->u0(ZZ)V

    .line 691
    .line 692
    .line 693
    iget-object v2, v1, Lq41;->V:Lph3;

    .line 694
    .line 695
    invoke-virtual {v2, v0}, Lph3;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lph3;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    iput-object v0, v1, Lq41;->V:Lph3;

    .line 700
    .line 701
    :cond_14
    :goto_10
    invoke-virtual {v1}, Lq41;->F()V

    .line 702
    .line 703
    .line 704
    return v14

    .line 705
    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final i(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lq41;->n:[Lez3;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lez3;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget-object v0, v0, p1

    .line 10
    .line 11
    iget-object v2, v0, Lez3;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lkq;

    .line 14
    .line 15
    iget-object v3, p0, Lq41;->B:Lxl0;

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3}, Lez3;->a(Lkq;Lxl0;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, v0, Lez3;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lkq;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget v5, v2, Lkq;->u:I

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    iget v5, v0, Lez3;->d:I

    .line 32
    .line 33
    const/4 v6, 0x3

    .line 34
    if-eq v5, v6, :cond_0

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v5, v4

    .line 39
    :goto_0
    invoke-virtual {v0, v2, v3}, Lez3;->a(Lkq;Lxl0;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v4}, Lez3;->i(Z)V

    .line 43
    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    iget-object v3, v0, Lez3;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lkq;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/16 v5, 0x11

    .line 55
    .line 56
    invoke-interface {v2, v5, v3}, Lrk3;->c(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    iput v4, v0, Lez3;->d:I

    .line 60
    .line 61
    invoke-virtual {p0, p1, v4}, Lq41;->H(IZ)V

    .line 62
    .line 63
    .line 64
    iget p1, p0, Lq41;->i0:I

    .line 65
    .line 66
    sub-int/2addr p1, v1

    .line 67
    iput p1, p0, Lq41;->i0:I

    .line 68
    .line 69
    return-void
.end method

.method public final i0(Z)V
    .locals 4

    .line 1
    if-nez p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lq41;->T:Lp41;

    .line 4
    .line 5
    const/16 v1, 0x25

    .line 6
    .line 7
    iget-object v2, p0, Lq41;->u:Lyp4;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lq41;->S:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v2, Lyp4;->a:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget v0, p0, Lq41;->U:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    iput v0, p0, Lq41;->U:I

    .line 28
    .line 29
    :cond_0
    iget v0, p0, Lq41;->U:I

    .line 30
    .line 31
    if-lez v0, :cond_1

    .line 32
    .line 33
    new-instance v3, La0;

    .line 34
    .line 35
    invoke-direct {v3, p0, v0}, La0;-><init>(Lq41;I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lq41;->L:Lyp4;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lq41;->U:I

    .line 45
    .line 46
    iput-boolean v0, p0, Lq41;->S:Z

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Lyp4;->f(I)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lq41;->T:Lp41;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lq41;->X(Lp41;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    iput-object v1, p0, Lq41;->T:Lp41;

    .line 60
    .line 61
    iput-boolean v0, p0, Lq41;->S:Z

    .line 62
    .line 63
    :cond_2
    iput-boolean p1, p0, Lq41;->R:Z

    .line 64
    .line 65
    invoke-virtual {p0}, Lq41;->e()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final j(Lda4;)V
    .locals 1

    .line 1
    check-cast p1, Lno2;

    .line 2
    .line 3
    iget-object p0, p0, Lq41;->u:Lyp4;

    .line 4
    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lxp4;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final j0(Li74;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq41;->Q:Li74;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq41;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq41;->D:Lvp4;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-object v3, v0, Lq41;->u:Lyp4;

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    invoke-virtual {v3, v4}, Lyp4;->f(I)V

    .line 16
    .line 17
    .line 18
    iget-boolean v3, v0, Lq41;->O:Z

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lq41;->z0()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 26
    .line 27
    iget v3, v3, Lph3;->e:I

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    if-eq v3, v5, :cond_33

    .line 31
    .line 32
    const/4 v6, 0x4

    .line 33
    if-ne v3, v6, :cond_1

    .line 34
    .line 35
    goto/16 :goto_19

    .line 36
    .line 37
    :cond_1
    iget-boolean v3, v0, Lq41;->O:Z

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Lq41;->z0()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v3, v0, Lq41;->F:Lro2;

    .line 45
    .line 46
    iget-object v3, v3, Lro2;->i:Loo2;

    .line 47
    .line 48
    if-nez v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lq41;->V(J)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    const-string v7, "doSomeWork"

    .line 55
    .line 56
    invoke-static {v7}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lq41;->B0()V

    .line 60
    .line 61
    .line 62
    iget-boolean v7, v3, Loo2;->e:Z

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    if-eqz v7, :cond_e

    .line 66
    .line 67
    iget-object v7, v0, Lq41;->D:Lvp4;

    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    invoke-static {v9, v10}, Lf35;->Q(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v9

    .line 80
    iput-wide v9, v0, Lq41;->l0:J

    .line 81
    .line 82
    iget-object v7, v3, Loo2;->a:Lno2;

    .line 83
    .line 84
    iget-object v9, v0, Lq41;->V:Lph3;

    .line 85
    .line 86
    iget-wide v9, v9, Lph3;->s:J

    .line 87
    .line 88
    iget-wide v11, v0, Lq41;->z:J

    .line 89
    .line 90
    sub-long/2addr v9, v11

    .line 91
    iget-boolean v11, v0, Lq41;->A:Z

    .line 92
    .line 93
    invoke-interface {v7, v11, v9, v10}, Lno2;->k(ZJ)V

    .line 94
    .line 95
    .line 96
    move v9, v5

    .line 97
    move v10, v9

    .line 98
    move v7, v8

    .line 99
    :goto_0
    iget-object v11, v0, Lq41;->n:[Lez3;

    .line 100
    .line 101
    array-length v12, v11

    .line 102
    if-ge v7, v12, :cond_f

    .line 103
    .line 104
    aget-object v11, v11, v7

    .line 105
    .line 106
    invoke-virtual {v11}, Lez3;->c()I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-nez v12, :cond_4

    .line 111
    .line 112
    invoke-virtual {v0, v7, v8}, Lq41;->H(IZ)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_4
    iget-wide v12, v0, Lq41;->k0:J

    .line 118
    .line 119
    iget-wide v14, v0, Lq41;->l0:J

    .line 120
    .line 121
    iget-object v5, v11, Lez3;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v5, Lkq;

    .line 124
    .line 125
    iget-object v4, v11, Lez3;->e:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, Lkq;

    .line 128
    .line 129
    invoke-static {v4}, Lez3;->h(Lkq;)Z

    .line 130
    .line 131
    .line 132
    move-result v16

    .line 133
    if-eqz v16, :cond_5

    .line 134
    .line 135
    invoke-virtual {v4, v12, v13, v14, v15}, Lkq;->A(JJ)V

    .line 136
    .line 137
    .line 138
    :cond_5
    if-eqz v5, :cond_6

    .line 139
    .line 140
    iget v4, v5, Lkq;->u:I

    .line 141
    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    invoke-virtual {v5, v12, v13, v14, v15}, Lkq;->A(JJ)V

    .line 145
    .line 146
    .line 147
    :cond_6
    if-eqz v9, :cond_9

    .line 148
    .line 149
    iget-object v4, v11, Lez3;->f:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v4, Lkq;

    .line 152
    .line 153
    iget-object v5, v11, Lez3;->e:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v5, Lkq;

    .line 156
    .line 157
    invoke-static {v5}, Lez3;->h(Lkq;)Z

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-eqz v9, :cond_7

    .line 162
    .line 163
    invoke-virtual {v5}, Lkq;->m()Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    goto :goto_1

    .line 168
    :cond_7
    const/4 v5, 0x1

    .line 169
    :goto_1
    if-eqz v4, :cond_8

    .line 170
    .line 171
    iget v9, v4, Lkq;->u:I

    .line 172
    .line 173
    if-eqz v9, :cond_8

    .line 174
    .line 175
    invoke-virtual {v4}, Lkq;->m()Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    and-int/2addr v5, v4

    .line 180
    :cond_8
    if-eqz v5, :cond_9

    .line 181
    .line 182
    const/4 v9, 0x1

    .line 183
    goto :goto_2

    .line 184
    :cond_9
    move v9, v8

    .line 185
    :goto_2
    invoke-virtual {v11, v3}, Lez3;->d(Loo2;)Lkq;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    if-eqz v4, :cond_b

    .line 190
    .line 191
    invoke-virtual {v4}, Lkq;->l()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-nez v5, :cond_b

    .line 196
    .line 197
    invoke-virtual {v4}, Lkq;->o()Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-nez v5, :cond_b

    .line 202
    .line 203
    invoke-virtual {v4}, Lkq;->m()Z

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    if-eqz v4, :cond_a

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    move v4, v8

    .line 211
    goto :goto_4

    .line 212
    :cond_b
    :goto_3
    const/4 v4, 0x1

    .line 213
    :goto_4
    invoke-virtual {v0, v7, v4}, Lq41;->H(IZ)V

    .line 214
    .line 215
    .line 216
    if-eqz v10, :cond_c

    .line 217
    .line 218
    if-eqz v4, :cond_c

    .line 219
    .line 220
    const/4 v10, 0x1

    .line 221
    goto :goto_5

    .line 222
    :cond_c
    move v10, v8

    .line 223
    :goto_5
    if-nez v4, :cond_d

    .line 224
    .line 225
    invoke-virtual {v0, v7}, Lq41;->G(I)V

    .line 226
    .line 227
    .line 228
    :cond_d
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 229
    .line 230
    const/4 v4, 0x2

    .line 231
    const/4 v5, 0x1

    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_e
    iget-object v4, v3, Loo2;->a:Lno2;

    .line 235
    .line 236
    invoke-interface {v4}, Lno2;->h()V

    .line 237
    .line 238
    .line 239
    const/4 v9, 0x1

    .line 240
    const/4 v10, 0x1

    .line 241
    :cond_f
    iget-object v4, v3, Loo2;->g:Lpo2;

    .line 242
    .line 243
    iget-wide v4, v4, Lpo2;->e:J

    .line 244
    .line 245
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    if-eqz v9, :cond_11

    .line 251
    .line 252
    iget-boolean v7, v3, Loo2;->e:Z

    .line 253
    .line 254
    if-eqz v7, :cond_11

    .line 255
    .line 256
    cmp-long v7, v4, v11

    .line 257
    .line 258
    if-eqz v7, :cond_10

    .line 259
    .line 260
    iget-object v7, v0, Lq41;->V:Lph3;

    .line 261
    .line 262
    iget-wide v13, v7, Lph3;->s:J

    .line 263
    .line 264
    cmp-long v4, v4, v13

    .line 265
    .line 266
    if-gtz v4, :cond_11

    .line 267
    .line 268
    :cond_10
    const/4 v4, 0x1

    .line 269
    goto :goto_7

    .line 270
    :cond_11
    move v4, v8

    .line 271
    :goto_7
    if-eqz v4, :cond_12

    .line 272
    .line 273
    iget-boolean v5, v0, Lq41;->Z:Z

    .line 274
    .line 275
    if-eqz v5, :cond_12

    .line 276
    .line 277
    iput-boolean v8, v0, Lq41;->Z:Z

    .line 278
    .line 279
    iget-object v5, v0, Lq41;->V:Lph3;

    .line 280
    .line 281
    iget v5, v5, Lph3;->n:I

    .line 282
    .line 283
    iget-object v7, v0, Lq41;->W:Ln41;

    .line 284
    .line 285
    invoke-virtual {v7, v8}, Ln41;->e(I)V

    .line 286
    .line 287
    .line 288
    iget-object v7, v0, Lq41;->N:Ltl;

    .line 289
    .line 290
    iget-object v9, v0, Lq41;->V:Lph3;

    .line 291
    .line 292
    iget v9, v9, Lph3;->e:I

    .line 293
    .line 294
    invoke-virtual {v7, v9, v8}, Ltl;->c(IZ)I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    const/4 v9, 0x5

    .line 299
    invoke-virtual {v0, v7, v5, v9, v8}, Lq41;->A0(IIIZ)V

    .line 300
    .line 301
    .line 302
    :cond_12
    const/4 v5, 0x3

    .line 303
    if-eqz v4, :cond_14

    .line 304
    .line 305
    iget-object v4, v3, Loo2;->g:Lpo2;

    .line 306
    .line 307
    iget-boolean v4, v4, Lpo2;->j:Z

    .line 308
    .line 309
    if-eqz v4, :cond_14

    .line 310
    .line 311
    invoke-virtual {v0, v6}, Lq41;->n0(I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Lq41;->v0()V

    .line 315
    .line 316
    .line 317
    :cond_13
    const/4 v6, 0x1

    .line 318
    goto/16 :goto_13

    .line 319
    .line 320
    :cond_14
    iget-object v4, v0, Lq41;->V:Lph3;

    .line 321
    .line 322
    iget v7, v4, Lph3;->e:I

    .line 323
    .line 324
    const/4 v9, 0x2

    .line 325
    if-ne v7, v9, :cond_1e

    .line 326
    .line 327
    iget-object v7, v0, Lq41;->F:Lro2;

    .line 328
    .line 329
    iget v9, v0, Lq41;->i0:I

    .line 330
    .line 331
    if-nez v9, :cond_15

    .line 332
    .line 333
    invoke-virtual {v0}, Lq41;->C()Z

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    :goto_8
    move-wide/from16 v28, v11

    .line 338
    .line 339
    goto/16 :goto_d

    .line 340
    .line 341
    :cond_15
    if-nez v10, :cond_16

    .line 342
    .line 343
    move v4, v8

    .line 344
    goto :goto_8

    .line 345
    :cond_16
    iget-boolean v9, v4, Lph3;->g:Z

    .line 346
    .line 347
    if-nez v9, :cond_18

    .line 348
    .line 349
    :cond_17
    :goto_9
    move-wide/from16 v28, v11

    .line 350
    .line 351
    const/4 v4, 0x1

    .line 352
    goto/16 :goto_d

    .line 353
    .line 354
    :cond_18
    iget-object v9, v7, Lro2;->i:Loo2;

    .line 355
    .line 356
    iget-object v4, v4, Lph3;->a:Lcu4;

    .line 357
    .line 358
    iget-object v13, v9, Loo2;->g:Lpo2;

    .line 359
    .line 360
    iget-object v13, v13, Lpo2;->a:Lmt2;

    .line 361
    .line 362
    invoke-virtual {v0, v4, v13}, Lq41;->s0(Lcu4;Lmt2;)Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_19

    .line 367
    .line 368
    iget-object v4, v0, Lq41;->H:Lul0;

    .line 369
    .line 370
    iget-wide v13, v4, Lul0;->h:J

    .line 371
    .line 372
    move-wide/from16 v26, v13

    .line 373
    .line 374
    goto :goto_a

    .line 375
    :cond_19
    move-wide/from16 v26, v11

    .line 376
    .line 377
    :goto_a
    iget-object v4, v7, Lro2;->l:Loo2;

    .line 378
    .line 379
    invoke-virtual {v4}, Loo2;->g()Z

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    if-eqz v7, :cond_1a

    .line 384
    .line 385
    iget-object v7, v4, Loo2;->g:Lpo2;

    .line 386
    .line 387
    iget-boolean v7, v7, Lpo2;->j:Z

    .line 388
    .line 389
    if-eqz v7, :cond_1a

    .line 390
    .line 391
    const/4 v7, 0x1

    .line 392
    goto :goto_b

    .line 393
    :cond_1a
    move v7, v8

    .line 394
    :goto_b
    iget-object v13, v4, Loo2;->g:Lpo2;

    .line 395
    .line 396
    iget-object v13, v13, Lpo2;->a:Lmt2;

    .line 397
    .line 398
    invoke-virtual {v13}, Lmt2;->b()Z

    .line 399
    .line 400
    .line 401
    move-result v13

    .line 402
    if-eqz v13, :cond_1b

    .line 403
    .line 404
    iget-boolean v13, v4, Loo2;->e:Z

    .line 405
    .line 406
    if-nez v13, :cond_1b

    .line 407
    .line 408
    const/4 v13, 0x1

    .line 409
    goto :goto_c

    .line 410
    :cond_1b
    move v13, v8

    .line 411
    :goto_c
    if-nez v7, :cond_17

    .line 412
    .line 413
    if-eqz v13, :cond_1c

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_1c
    invoke-virtual {v4}, Loo2;->d()J

    .line 417
    .line 418
    .line 419
    move-result-wide v13

    .line 420
    invoke-virtual {v0, v13, v14}, Lq41;->q(J)J

    .line 421
    .line 422
    .line 423
    move-result-wide v22

    .line 424
    iget-object v4, v0, Lq41;->s:Lcd2;

    .line 425
    .line 426
    new-instance v16, Lbd2;

    .line 427
    .line 428
    iget-object v7, v0, Lq41;->J:Lik3;

    .line 429
    .line 430
    iget-object v13, v0, Lq41;->V:Lph3;

    .line 431
    .line 432
    iget-object v13, v13, Lph3;->a:Lcu4;

    .line 433
    .line 434
    iget-object v14, v9, Loo2;->g:Lpo2;

    .line 435
    .line 436
    iget-object v14, v14, Lpo2;->a:Lmt2;

    .line 437
    .line 438
    move-object/from16 v17, v7

    .line 439
    .line 440
    iget-wide v6, v0, Lq41;->k0:J

    .line 441
    .line 442
    move-wide/from16 v28, v11

    .line 443
    .line 444
    iget-wide v11, v9, Loo2;->p:J

    .line 445
    .line 446
    sub-long v20, v6, v11

    .line 447
    .line 448
    iget-object v6, v0, Lq41;->B:Lxl0;

    .line 449
    .line 450
    invoke-virtual {v6}, Lxl0;->i()Lqh3;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    iget v6, v6, Lqh3;->a:F

    .line 455
    .line 456
    iget-object v7, v0, Lq41;->V:Lph3;

    .line 457
    .line 458
    iget-boolean v7, v7, Lph3;->l:Z

    .line 459
    .line 460
    iget-boolean v7, v0, Lq41;->a0:Z

    .line 461
    .line 462
    move/from16 v24, v6

    .line 463
    .line 464
    move/from16 v25, v7

    .line 465
    .line 466
    move-object/from16 v18, v13

    .line 467
    .line 468
    move-object/from16 v19, v14

    .line 469
    .line 470
    invoke-direct/range {v16 .. v27}, Lbd2;-><init>(Lik3;Lcu4;Lmt2;JJFZJ)V

    .line 471
    .line 472
    .line 473
    move-object/from16 v6, v16

    .line 474
    .line 475
    invoke-interface {v4, v6}, Lcd2;->j(Lbd2;)Z

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    :goto_d
    if-eqz v4, :cond_1d

    .line 480
    .line 481
    invoke-virtual {v0, v5}, Lq41;->n0(I)V

    .line 482
    .line 483
    .line 484
    const/4 v4, 0x0

    .line 485
    iput-object v4, v0, Lq41;->o0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 486
    .line 487
    invoke-virtual {v0}, Lq41;->r0()Z

    .line 488
    .line 489
    .line 490
    move-result v4

    .line 491
    if-eqz v4, :cond_13

    .line 492
    .line 493
    invoke-virtual {v0, v8, v8}, Lq41;->D0(ZZ)V

    .line 494
    .line 495
    .line 496
    iget-object v4, v0, Lq41;->B:Lxl0;

    .line 497
    .line 498
    const/4 v6, 0x1

    .line 499
    iput-boolean v6, v4, Lxl0;->s:Z

    .line 500
    .line 501
    iget-object v4, v4, Lxl0;->n:Lzq2;

    .line 502
    .line 503
    invoke-virtual {v4}, Lzq2;->g()V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0}, Lq41;->t0()V

    .line 507
    .line 508
    .line 509
    goto/16 :goto_13

    .line 510
    .line 511
    :cond_1d
    :goto_e
    const/4 v6, 0x1

    .line 512
    goto :goto_f

    .line 513
    :cond_1e
    move-wide/from16 v28, v11

    .line 514
    .line 515
    goto :goto_e

    .line 516
    :goto_f
    iget-object v4, v0, Lq41;->V:Lph3;

    .line 517
    .line 518
    iget v4, v4, Lph3;->e:I

    .line 519
    .line 520
    if-ne v4, v5, :cond_27

    .line 521
    .line 522
    iget v4, v0, Lq41;->i0:I

    .line 523
    .line 524
    if-nez v4, :cond_1f

    .line 525
    .line 526
    invoke-virtual {v0}, Lq41;->C()Z

    .line 527
    .line 528
    .line 529
    move-result v4

    .line 530
    if-eqz v4, :cond_20

    .line 531
    .line 532
    goto :goto_13

    .line 533
    :cond_1f
    if-nez v10, :cond_27

    .line 534
    .line 535
    :cond_20
    invoke-virtual {v0}, Lq41;->r0()Z

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    invoke-virtual {v0, v4, v8}, Lq41;->D0(ZZ)V

    .line 540
    .line 541
    .line 542
    const/4 v9, 0x2

    .line 543
    invoke-virtual {v0, v9}, Lq41;->n0(I)V

    .line 544
    .line 545
    .line 546
    iget-boolean v4, v0, Lq41;->a0:Z

    .line 547
    .line 548
    if-eqz v4, :cond_26

    .line 549
    .line 550
    iget-object v4, v0, Lq41;->F:Lro2;

    .line 551
    .line 552
    iget-object v4, v4, Lro2;->i:Loo2;

    .line 553
    .line 554
    :goto_10
    if-eqz v4, :cond_23

    .line 555
    .line 556
    iget-object v7, v4, Loo2;->o:Lew4;

    .line 557
    .line 558
    iget-object v7, v7, Lew4;->q:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v7, [Lt41;

    .line 561
    .line 562
    array-length v9, v7

    .line 563
    move v10, v8

    .line 564
    :goto_11
    if-ge v10, v9, :cond_22

    .line 565
    .line 566
    aget-object v11, v7, v10

    .line 567
    .line 568
    if-eqz v11, :cond_21

    .line 569
    .line 570
    invoke-interface {v11}, Lt41;->s()V

    .line 571
    .line 572
    .line 573
    :cond_21
    add-int/lit8 v10, v10, 0x1

    .line 574
    .line 575
    goto :goto_11

    .line 576
    :cond_22
    iget-object v4, v4, Loo2;->m:Loo2;

    .line 577
    .line 578
    goto :goto_10

    .line 579
    :cond_23
    iget-object v4, v0, Lq41;->H:Lul0;

    .line 580
    .line 581
    iget-wide v9, v4, Lul0;->h:J

    .line 582
    .line 583
    cmp-long v7, v9, v28

    .line 584
    .line 585
    if-nez v7, :cond_24

    .line 586
    .line 587
    goto :goto_12

    .line 588
    :cond_24
    iget-wide v11, v4, Lul0;->b:J

    .line 589
    .line 590
    add-long/2addr v9, v11

    .line 591
    iput-wide v9, v4, Lul0;->h:J

    .line 592
    .line 593
    iget-wide v11, v4, Lul0;->g:J

    .line 594
    .line 595
    cmp-long v7, v11, v28

    .line 596
    .line 597
    if-eqz v7, :cond_25

    .line 598
    .line 599
    cmp-long v7, v9, v11

    .line 600
    .line 601
    if-lez v7, :cond_25

    .line 602
    .line 603
    iput-wide v11, v4, Lul0;->h:J

    .line 604
    .line 605
    :cond_25
    move-wide/from16 v9, v28

    .line 606
    .line 607
    iput-wide v9, v4, Lul0;->l:J

    .line 608
    .line 609
    :cond_26
    :goto_12
    invoke-virtual {v0}, Lq41;->v0()V

    .line 610
    .line 611
    .line 612
    :cond_27
    :goto_13
    iget-object v4, v0, Lq41;->V:Lph3;

    .line 613
    .line 614
    iget v4, v4, Lph3;->e:I

    .line 615
    .line 616
    const/4 v9, 0x2

    .line 617
    if-ne v4, v9, :cond_2c

    .line 618
    .line 619
    move v4, v8

    .line 620
    :goto_14
    iget-object v7, v0, Lq41;->n:[Lez3;

    .line 621
    .line 622
    array-length v9, v7

    .line 623
    if-ge v4, v9, :cond_29

    .line 624
    .line 625
    aget-object v7, v7, v4

    .line 626
    .line 627
    invoke-virtual {v7, v3}, Lez3;->d(Loo2;)Lkq;

    .line 628
    .line 629
    .line 630
    move-result-object v7

    .line 631
    if-eqz v7, :cond_28

    .line 632
    .line 633
    invoke-virtual {v0, v4}, Lq41;->G(I)V

    .line 634
    .line 635
    .line 636
    :cond_28
    add-int/lit8 v4, v4, 0x1

    .line 637
    .line 638
    goto :goto_14

    .line 639
    :cond_29
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 640
    .line 641
    iget-boolean v4, v3, Lph3;->g:Z

    .line 642
    .line 643
    if-nez v4, :cond_2c

    .line 644
    .line 645
    iget-wide v3, v3, Lph3;->r:J

    .line 646
    .line 647
    const-wide/32 v9, 0x7a120

    .line 648
    .line 649
    .line 650
    cmp-long v3, v3, v9

    .line 651
    .line 652
    if-gez v3, :cond_2c

    .line 653
    .line 654
    iget-object v3, v0, Lq41;->F:Lro2;

    .line 655
    .line 656
    iget-object v3, v3, Lro2;->l:Loo2;

    .line 657
    .line 658
    invoke-static {v3}, Lq41;->A(Loo2;)Z

    .line 659
    .line 660
    .line 661
    move-result v3

    .line 662
    if-eqz v3, :cond_2c

    .line 663
    .line 664
    invoke-virtual {v0}, Lq41;->r0()Z

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    if-eqz v3, :cond_2c

    .line 669
    .line 670
    iget-wide v3, v0, Lq41;->p0:J

    .line 671
    .line 672
    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    cmp-long v3, v3, v28

    .line 678
    .line 679
    iget-object v4, v0, Lq41;->D:Lvp4;

    .line 680
    .line 681
    if-nez v3, :cond_2a

    .line 682
    .line 683
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 687
    .line 688
    .line 689
    move-result-wide v3

    .line 690
    iput-wide v3, v0, Lq41;->p0:J

    .line 691
    .line 692
    goto :goto_15

    .line 693
    :cond_2a
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 697
    .line 698
    .line 699
    move-result-wide v3

    .line 700
    iget-wide v9, v0, Lq41;->p0:J

    .line 701
    .line 702
    sub-long/2addr v3, v9

    .line 703
    const-wide/16 v9, 0xfa0

    .line 704
    .line 705
    cmp-long v3, v3, v9

    .line 706
    .line 707
    if-gez v3, :cond_2b

    .line 708
    .line 709
    goto :goto_15

    .line 710
    :cond_2b
    new-instance v0, Landroidx/media3/common/util/StuckPlayerException;

    .line 711
    .line 712
    const/16 v1, 0xfa0

    .line 713
    .line 714
    invoke-direct {v0, v8, v1}, Landroidx/media3/common/util/StuckPlayerException;-><init>(II)V

    .line 715
    .line 716
    .line 717
    throw v0

    .line 718
    :cond_2c
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    iput-wide v9, v0, Lq41;->p0:J

    .line 724
    .line 725
    :goto_15
    invoke-virtual {v0}, Lq41;->r0()Z

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    if-eqz v3, :cond_2d

    .line 730
    .line 731
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 732
    .line 733
    iget v3, v3, Lph3;->e:I

    .line 734
    .line 735
    if-ne v3, v5, :cond_2d

    .line 736
    .line 737
    move v3, v6

    .line 738
    goto :goto_16

    .line 739
    :cond_2d
    move v3, v8

    .line 740
    :goto_16
    iget-boolean v4, v0, Lq41;->h0:Z

    .line 741
    .line 742
    if-eqz v4, :cond_2e

    .line 743
    .line 744
    iget-boolean v4, v0, Lq41;->g0:Z

    .line 745
    .line 746
    if-eqz v4, :cond_2e

    .line 747
    .line 748
    if-eqz v3, :cond_2e

    .line 749
    .line 750
    goto :goto_17

    .line 751
    :cond_2e
    move v6, v8

    .line 752
    :goto_17
    iget-object v4, v0, Lq41;->V:Lph3;

    .line 753
    .line 754
    iget-boolean v7, v4, Lph3;->p:Z

    .line 755
    .line 756
    if-eq v7, v6, :cond_2f

    .line 757
    .line 758
    invoke-virtual {v4, v6}, Lph3;->i(Z)Lph3;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    iput-object v4, v0, Lq41;->V:Lph3;

    .line 763
    .line 764
    :cond_2f
    iput-boolean v8, v0, Lq41;->g0:Z

    .line 765
    .line 766
    if-nez v6, :cond_32

    .line 767
    .line 768
    iget-object v4, v0, Lq41;->V:Lph3;

    .line 769
    .line 770
    iget v4, v4, Lph3;->e:I

    .line 771
    .line 772
    const/4 v15, 0x4

    .line 773
    if-ne v4, v15, :cond_30

    .line 774
    .line 775
    goto :goto_18

    .line 776
    :cond_30
    if-nez v3, :cond_31

    .line 777
    .line 778
    const/4 v9, 0x2

    .line 779
    if-eq v4, v9, :cond_31

    .line 780
    .line 781
    if-ne v4, v5, :cond_32

    .line 782
    .line 783
    iget v3, v0, Lq41;->i0:I

    .line 784
    .line 785
    if-eqz v3, :cond_32

    .line 786
    .line 787
    :cond_31
    invoke-virtual {v0, v1, v2}, Lq41;->V(J)V

    .line 788
    .line 789
    .line 790
    :cond_32
    :goto_18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 791
    .line 792
    .line 793
    :cond_33
    :goto_19
    return-void
.end method

.method public final k0(Ln84;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq41;->P:Ln84;

    .line 2
    .line 3
    return-void
.end method

.method public final l(Loo2;IZJ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lq41;->n:[Lez3;

    .line 6
    .line 7
    aget-object v10, v2, p2

    .line 8
    .line 9
    invoke-virtual {v10}, Lez3;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, v10, Lez3;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lkq;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_a

    .line 20
    .line 21
    :cond_0
    iget-object v2, v0, Lq41;->F:Lro2;

    .line 22
    .line 23
    iget-object v2, v2, Lro2;->i:Loo2;

    .line 24
    .line 25
    const/4 v11, 0x1

    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    move v12, v11

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v12, 0x0

    .line 31
    :goto_0
    iget-object v2, v1, Loo2;->o:Lew4;

    .line 32
    .line 33
    iget-object v5, v2, Lew4;->p:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, [Ldz3;

    .line 36
    .line 37
    aget-object v5, v5, p2

    .line 38
    .line 39
    iget-object v2, v2, Lew4;->q:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, [Lt41;

    .line 42
    .line 43
    aget-object v2, v2, p2

    .line 44
    .line 45
    invoke-virtual {v0}, Lq41;->r0()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    iget-object v6, v0, Lq41;->V:Lph3;

    .line 52
    .line 53
    iget v6, v6, Lph3;->e:I

    .line 54
    .line 55
    const/4 v7, 0x3

    .line 56
    if-ne v6, v7, :cond_2

    .line 57
    .line 58
    move v13, v11

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v13, 0x0

    .line 61
    :goto_1
    if-nez p3, :cond_3

    .line 62
    .line 63
    if-eqz v13, :cond_3

    .line 64
    .line 65
    move v14, v11

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    const/4 v14, 0x0

    .line 68
    :goto_2
    iget v6, v0, Lq41;->i0:I

    .line 69
    .line 70
    add-int/2addr v6, v11

    .line 71
    iput v6, v0, Lq41;->i0:I

    .line 72
    .line 73
    iget-object v6, v1, Loo2;->c:[Lq44;

    .line 74
    .line 75
    aget-object v6, v6, p2

    .line 76
    .line 77
    iget-wide v7, v1, Loo2;->p:J

    .line 78
    .line 79
    iget-object v9, v1, Loo2;->g:Lpo2;

    .line 80
    .line 81
    iget-object v9, v9, Lpo2;->a:Lmt2;

    .line 82
    .line 83
    iget-object v15, v10, Lez3;->f:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v15, Lkq;

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-interface {v2}, Lt41;->length()I

    .line 90
    .line 91
    .line 92
    move-result v16

    .line 93
    move/from16 v4, v16

    .line 94
    .line 95
    :goto_3
    move-object/from16 v17, v3

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_4
    const/4 v4, 0x0

    .line 99
    goto :goto_3

    .line 100
    :goto_4
    new-array v3, v4, [Ltb1;

    .line 101
    .line 102
    const/4 v11, 0x0

    .line 103
    :goto_5
    if-ge v11, v4, :cond_5

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v11}, Lt41;->g(I)Ltb1;

    .line 109
    .line 110
    .line 111
    move-result-object v18

    .line 112
    aput-object v18, v3, v11

    .line 113
    .line 114
    add-int/lit8 v11, v11, 0x1

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    iget v2, v10, Lez3;->d:I

    .line 118
    .line 119
    iget-object v11, v0, Lq41;->B:Lxl0;

    .line 120
    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    const/4 v4, 0x2

    .line 124
    if-eq v2, v4, :cond_6

    .line 125
    .line 126
    const/4 v4, 0x4

    .line 127
    if-ne v2, v4, :cond_7

    .line 128
    .line 129
    :cond_6
    move-object v4, v6

    .line 130
    const/4 v15, 0x1

    .line 131
    goto :goto_7

    .line 132
    :cond_7
    const/4 v2, 0x1

    .line 133
    iput-boolean v2, v10, Lez3;->b:Z

    .line 134
    .line 135
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget v4, v15, Lkq;->u:I

    .line 139
    .line 140
    if-nez v4, :cond_8

    .line 141
    .line 142
    move v4, v2

    .line 143
    goto :goto_6

    .line 144
    :cond_8
    const/4 v4, 0x0

    .line 145
    :goto_6
    invoke-static {v4}, Lrr2;->w(Z)V

    .line 146
    .line 147
    .line 148
    iput-object v5, v15, Lkq;->q:Ldz3;

    .line 149
    .line 150
    iput-object v9, v15, Lkq;->D:Lmt2;

    .line 151
    .line 152
    iput v2, v15, Lkq;->u:I

    .line 153
    .line 154
    invoke-virtual {v15, v14, v12}, Lkq;->q(ZZ)V

    .line 155
    .line 156
    .line 157
    move-object v4, v15

    .line 158
    move v15, v2

    .line 159
    move-object v2, v4

    .line 160
    move-object v4, v6

    .line 161
    move-wide/from16 v5, p4

    .line 162
    .line 163
    invoke-virtual/range {v2 .. v9}, Lkq;->B([Ltb1;Lq44;JJLmt2;)V

    .line 164
    .line 165
    .line 166
    move-object v4, v2

    .line 167
    move-wide v2, v5

    .line 168
    invoke-virtual {v4, v2, v3, v14, v15}, Lkq;->C(JZZ)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v11, v4}, Lxl0;->a(Lkq;)V

    .line 172
    .line 173
    .line 174
    goto :goto_9

    .line 175
    :goto_7
    iput-boolean v15, v10, Lez3;->a:Z

    .line 176
    .line 177
    move-object/from16 v2, v17

    .line 178
    .line 179
    iget v6, v2, Lkq;->u:I

    .line 180
    .line 181
    if-nez v6, :cond_9

    .line 182
    .line 183
    move/from16 v16, v15

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_9
    const/16 v16, 0x0

    .line 187
    .line 188
    :goto_8
    invoke-static/range {v16 .. v16}, Lrr2;->w(Z)V

    .line 189
    .line 190
    .line 191
    iput-object v5, v2, Lkq;->q:Ldz3;

    .line 192
    .line 193
    iput-object v9, v2, Lkq;->D:Lmt2;

    .line 194
    .line 195
    iput v15, v2, Lkq;->u:I

    .line 196
    .line 197
    invoke-virtual {v2, v14, v12}, Lkq;->q(ZZ)V

    .line 198
    .line 199
    .line 200
    move-wide/from16 v5, p4

    .line 201
    .line 202
    invoke-virtual/range {v2 .. v9}, Lkq;->B([Ltb1;Lq44;JJLmt2;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v5, v6, v14, v15}, Lkq;->C(JZZ)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v11, v2}, Lxl0;->a(Lkq;)V

    .line 209
    .line 210
    .line 211
    :goto_9
    new-instance v2, Lk41;

    .line 212
    .line 213
    invoke-direct {v2, v0}, Lk41;-><init>(Lq41;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10, v1}, Lez3;->d(Loo2;)Lkq;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    const/16 v1, 0xb

    .line 224
    .line 225
    invoke-interface {v0, v1, v2}, Lrk3;->c(ILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    if-eqz v13, :cond_a

    .line 229
    .line 230
    if-eqz v12, :cond_a

    .line 231
    .line 232
    invoke-virtual {v10}, Lez3;->m()V

    .line 233
    .line 234
    .line 235
    :cond_a
    :goto_a
    return-void
.end method

.method public final l0(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lq41;->e0:Z

    .line 2
    .line 3
    iget-object v0, p0, Lq41;->V:Lph3;

    .line 4
    .line 5
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 6
    .line 7
    iget-object v1, p0, Lq41;->F:Lro2;

    .line 8
    .line 9
    iput-boolean p1, v1, Lro2;->h:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lro2;->s(Lcu4;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 v0, p1, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Lq41;->W(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lq41;->h()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Lq41;->v(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final m([ZJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v2, v0, Lro2;->j:Loo2;

    .line 4
    .line 5
    iget-object v0, v2, Loo2;->o:Lew4;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move v3, v1

    .line 9
    :goto_0
    iget-object v7, p0, Lq41;->n:[Lez3;

    .line 10
    .line 11
    array-length v4, v7

    .line 12
    if-ge v3, v4, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Lew4;->n(I)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    aget-object v4, v7, v3

    .line 21
    .line 22
    invoke-virtual {v4}, Lez3;->k()V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v3, v1

    .line 29
    :goto_1
    array-length v1, v7

    .line 30
    if-ge v3, v1, :cond_4

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Lew4;->n(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    aget-object v1, v7, v3

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lez3;->d(Loo2;)Lkq;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    :cond_2
    move-object v1, p0

    .line 47
    move-wide v5, p2

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    aget-boolean v4, p1, v3

    .line 50
    .line 51
    move-object v1, p0

    .line 52
    move-wide v5, p2

    .line 53
    invoke-virtual/range {v1 .. v6}, Lq41;->l(Loo2;IZJ)V

    .line 54
    .line 55
    .line 56
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    move-object p0, v1

    .line 59
    move-wide p2, v5

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    return-void
.end method

.method public final m0(Lpd4;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lq41;->W:Ln41;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ln41;->e(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lq41;->G:Lfo1;

    .line 8
    .line 9
    iget-object v1, v0, Lfo1;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p1, Lpd4;->b:[I

    .line 18
    .line 19
    array-length v2, v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eq v2, v1, :cond_0

    .line 22
    .line 23
    new-instance v2, Lpd4;

    .line 24
    .line 25
    new-instance v4, Ljava/util/Random;

    .line 26
    .line 27
    iget-object p1, p1, Lpd4;->a:Ljava/util/Random;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-direct {v4, v5, v6}, Ljava/util/Random;-><init>(J)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v4}, Lpd4;-><init>(Ljava/util/Random;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3, v1}, Lpd4;->a(II)Lpd4;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_0
    iput-object p1, v0, Lfo1;->k:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v0}, Lfo1;->f()Lcu4;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1, v3}, Lq41;->w(Lcu4;Z)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final n(Lcu4;Ljava/lang/Object;J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lq41;->y:Lzt4;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Lzt4;->c:I

    .line 8
    .line 9
    iget-object p0, p0, Lq41;->x:Lbu4;

    .line 10
    .line 11
    invoke-virtual {p1, p2, p0}, Lcu4;->n(ILbu4;)V

    .line 12
    .line 13
    .line 14
    iget-wide p1, p0, Lbu4;->e:J

    .line 15
    .line 16
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long p1, p1, v1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lbu4;->a()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-boolean p1, p0, Lbu4;->h:Z

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-wide p1, p0, Lbu4;->f:J

    .line 37
    .line 38
    invoke-static {p1, p2}, Lf35;->B(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    iget-wide v1, p0, Lbu4;->e:J

    .line 43
    .line 44
    sub-long/2addr p1, v1

    .line 45
    invoke-static {p1, p2}, Lf35;->Q(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    iget-wide v0, v0, Lzt4;->e:J

    .line 50
    .line 51
    add-long/2addr p3, v0

    .line 52
    sub-long/2addr p0, p3

    .line 53
    return-wide p0

    .line 54
    :cond_1
    :goto_0
    return-wide v1
.end method

.method public final n0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lq41;->V:Lph3;

    .line 2
    .line 3
    iget v1, v0, Lph3;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Lq41;->p0:J

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x3

    .line 18
    if-eq p1, v1, :cond_1

    .line 19
    .line 20
    iget-boolean v1, v0, Lph3;->p:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Lph3;->i(Z)Lph3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lq41;->V:Lph3;

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lq41;->V:Lph3;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lph3;->h(I)Lph3;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lq41;->V:Lph3;

    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final o(Loo2;)J
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-wide/16 p0, 0x0

    .line 4
    .line 5
    return-wide p0

    .line 6
    :cond_0
    iget-wide v0, p1, Loo2;->p:J

    .line 7
    .line 8
    iget-boolean v2, p1, Loo2;->e:Z

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_1
    const/4 v2, 0x0

    .line 14
    :goto_0
    iget-object v3, p0, Lq41;->n:[Lez3;

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    if-ge v2, v4, :cond_4

    .line 18
    .line 19
    aget-object v4, v3, v2

    .line 20
    .line 21
    invoke-virtual {v4, p1}, Lez3;->d(Loo2;)Lkq;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_3

    .line 26
    .line 27
    aget-object v3, v3, v2

    .line 28
    .line 29
    invoke-virtual {v3, p1}, Lez3;->d(Loo2;)Lkq;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget-wide v3, v3, Lkq;->z:J

    .line 37
    .line 38
    const-wide/high16 v5, -0x8000000000000000L

    .line 39
    .line 40
    cmp-long v7, v3, v5

    .line 41
    .line 42
    if-nez v7, :cond_2

    .line 43
    .line 44
    return-wide v5

    .line 45
    :cond_2
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    return-wide v0
.end method

.method public final o0(Lc55;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lq41;->n:[Lez3;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_2

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    iget-object v3, v2, Lez3;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lkq;

    .line 12
    .line 13
    iget v4, v3, Lkq;->o:I

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    if-eq v4, v5, :cond_0

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    if-eq v4, v5, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v4, 0x7

    .line 23
    invoke-interface {v3, v4, p1}, Lrk3;->c(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v2, Lez3;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lkq;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v2, v4, p1}, Lrk3;->c(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return-void
.end method

.method public final p(Lcu4;)Landroid/util/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcu4;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lph3;->u:Lmt2;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-boolean v0, p0, Lq41;->e0:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcu4;->a(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    iget-object v5, p0, Lq41;->y:Lzt4;

    .line 27
    .line 28
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lq41;->x:Lbu4;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, Lcu4;->i(Lbu4;Lzt4;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 41
    .line 42
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v3, v4, v1, v2}, Lro2;->q(Lcu4;Ljava/lang/Object;J)Lmt2;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-virtual {v0}, Lmt2;->b()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    iget-object p1, v0, Lmt2;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object p0, p0, Lq41;->y:Lzt4;

    .line 65
    .line 66
    invoke-virtual {v3, p1, p0}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 67
    .line 68
    .line 69
    iget p1, v0, Lmt2;->c:I

    .line 70
    .line 71
    iget v3, v0, Lmt2;->b:I

    .line 72
    .line 73
    invoke-virtual {p0, v3}, Lzt4;->f(I)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ne p1, v3, :cond_1

    .line 78
    .line 79
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 80
    .line 81
    iget-wide v1, p0, Lz5;->b:J

    .line 82
    .line 83
    :cond_1
    move-wide v4, v1

    .line 84
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

.method public final p0(Ljava/lang/Object;Lq90;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lq41;->n:[Lez3;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x2

    .line 6
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    iget-object v5, v4, Lez3;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v5, Lkq;

    .line 13
    .line 14
    iget v6, v5, Lkq;->o:I

    .line 15
    .line 16
    if-eq v6, v3, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    iget v3, v4, Lez3;->d:I

    .line 20
    .line 21
    const/4 v6, 0x4

    .line 22
    const/4 v7, 0x1

    .line 23
    if-eq v3, v6, :cond_2

    .line 24
    .line 25
    if-ne v3, v7, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-interface {v5, v7, p1}, Lrk3;->c(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    :goto_1
    iget-object v3, v4, Lez3;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Lkq;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-interface {v3, v7, p1}, Lrk3;->c(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 46
    .line 47
    iget p1, p1, Lph3;->e:I

    .line 48
    .line 49
    const/4 v0, 0x3

    .line 50
    if-eq p1, v0, :cond_4

    .line 51
    .line 52
    if-ne p1, v3, :cond_5

    .line 53
    .line 54
    :cond_4
    iget-object p0, p0, Lq41;->u:Lyp4;

    .line 55
    .line 56
    invoke-virtual {p0, v3}, Lyp4;->g(I)V

    .line 57
    .line 58
    .line 59
    :cond_5
    if-eqz p2, :cond_6

    .line 60
    .line 61
    invoke-virtual {p2}, Lq90;->d()Z

    .line 62
    .line 63
    .line 64
    :cond_6
    return-void
.end method

.method public final q(J)J
    .locals 7

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v0, v0, Lro2;->l:Loo2;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    iget-wide v3, p0, Lq41;->k0:J

    .line 11
    .line 12
    iget-wide v5, v0, Loo2;->p:J

    .line 13
    .line 14
    sub-long/2addr v3, v5

    .line 15
    sub-long/2addr p1, v3

    .line 16
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    return-wide p0
.end method

.method public final q0(F)V
    .locals 6

    .line 1
    iput p1, p0, Lq41;->t0:F

    .line 2
    .line 3
    iget-object v0, p0, Lq41;->N:Ltl;

    .line 4
    .line 5
    iget v0, v0, Ltl;->g:F

    .line 6
    .line 7
    mul-float/2addr p1, v0

    .line 8
    iget-object p0, p0, Lq41;->n:[Lez3;

    .line 9
    .line 10
    array-length v0, p0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_2

    .line 13
    .line 14
    aget-object v2, p0, v1

    .line 15
    .line 16
    iget-object v3, v2, Lez3;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lkq;

    .line 19
    .line 20
    iget v4, v3, Lkq;->o:I

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v4, v5, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v5, 0x2

    .line 31
    invoke-interface {v3, v5, v4}, Lrk3;->c(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v2, Lez3;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lkq;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v2, v5, v3}, Lrk3;->c(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method

.method public final r(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lq41;->V:Lph3;

    .line 2
    .line 3
    iget-boolean v1, v0, Lph3;->l:Z

    .line 4
    .line 5
    iget v2, v0, Lph3;->n:I

    .line 6
    .line 7
    iget v0, v0, Lph3;->m:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, v2, v0, v1}, Lq41;->A0(IIIZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r0()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lq41;->V:Lph3;

    .line 2
    .line 3
    iget-boolean v0, p0, Lph3;->l:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, Lph3;->n:I

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final s()V
    .locals 1

    .line 1
    iget v0, p0, Lq41;->t0:F

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lq41;->q0(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s0(Lcu4;Lmt2;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Lmt2;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcu4;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p2, p2, Lmt2;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p0, Lq41;->y:Lzt4;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p2, p2, Lzt4;->c:I

    .line 23
    .line 24
    iget-object p0, p0, Lq41;->x:Lbu4;

    .line 25
    .line 26
    invoke-virtual {p1, p2, p0}, Lcu4;->n(ILbu4;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lbu4;->a()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-boolean p1, p0, Lbu4;->h:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-wide p0, p0, Lbu4;->e:J

    .line 40
    .line 41
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long p0, p0, v0

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public final t(Lno2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v1, v0, Lro2;->l:Loo2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Loo2;->a:Lno2;

    .line 8
    .line 9
    if-ne v1, p1, :cond_0

    .line 10
    .line 11
    iget-wide v1, p0, Lq41;->k0:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lro2;->n(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lq41;->D()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, v0, Lro2;->m:Loo2;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Loo2;->a:Lno2;

    .line 25
    .line 26
    if-ne v0, p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lq41;->E()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final t0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v0, v0, Lro2;->i:Loo2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v0, v0, Loo2;->o:Lew4;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, Lq41;->n:[Lez3;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-ge v1, v3, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lew4;->n(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    aget-object v2, v2, v1

    .line 24
    .line 25
    invoke-virtual {v2}, Lez3;->m()V

    .line 26
    .line 27
    .line 28
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_2
    return-void
.end method

.method public final u(Ljava/io/IOException;I)V
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1, p2}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lq41;->F:Lro2;

    .line 8
    .line 9
    iget-object p1, p1, Lro2;->i:Loo2;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Loo2;->g:Lpo2;

    .line 14
    .line 15
    iget-object p1, p1, Lpo2;->a:Lmt2;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlaybackException;->b(Lmt2;)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string p2, "Playback error"

    .line 24
    .line 25
    invoke-static {p1, p2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v1}, Lq41;->u0(ZZ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lph3;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lph3;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lq41;->V:Lph3;

    .line 38
    .line 39
    return-void
.end method

.method public final u0(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lq41;->f0:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v1

    .line 13
    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, Lq41;->P(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lq41;->W:Ln41;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ln41;->e(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lq41;->s:Lcd2;

    .line 22
    .line 23
    iget-object p2, p0, Lq41;->J:Lik3;

    .line 24
    .line 25
    invoke-interface {p1, p2}, Lcd2;->c(Lik3;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 29
    .line 30
    iget-boolean p1, p1, Lph3;->l:Z

    .line 31
    .line 32
    iget-object p2, p0, Lq41;->N:Ltl;

    .line 33
    .line 34
    invoke-virtual {p2, v1, p1}, Ltl;->c(IZ)I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lq41;->n0(I)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final v(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v0, v0, Lro2;->l:Loo2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lq41;->V:Lph3;

    .line 8
    .line 9
    iget-object v1, v1, Lph3;->b:Lmt2;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Loo2;->g:Lpo2;

    .line 13
    .line 14
    iget-object v1, v1, Lpo2;->a:Lmt2;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, Lq41;->V:Lph3;

    .line 17
    .line 18
    iget-object v2, v2, Lph3;->k:Lmt2;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, Lq41;->V:Lph3;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Lph3;->c(Lmt2;)Lph3;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Lq41;->V:Lph3;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, Lq41;->V:Lph3;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-wide v3, v1, Lph3;->s:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, Loo2;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_1
    iput-wide v3, v1, Lph3;->q:J

    .line 46
    .line 47
    iget-object v1, p0, Lq41;->V:Lph3;

    .line 48
    .line 49
    iget-wide v3, v1, Lph3;->q:J

    .line 50
    .line 51
    invoke-virtual {p0, v3, v4}, Lq41;->q(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, Lph3;->r:J

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-boolean p1, v0, Loo2;->e:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, v0, Loo2;->g:Lpo2;

    .line 68
    .line 69
    iget-object p1, p1, Lpo2;->a:Lmt2;

    .line 70
    .line 71
    iget-object v1, v0, Loo2;->n:Ltv4;

    .line 72
    .line 73
    iget-object v0, v0, Loo2;->o:Lew4;

    .line 74
    .line 75
    invoke-virtual {p0, p1, v1, v0}, Lq41;->x0(Lmt2;Ltv4;Lew4;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method public final v0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lq41;->B:Lxl0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lxl0;->s:Z

    .line 5
    .line 6
    iget-object v0, v0, Lxl0;->n:Lzq2;

    .line 7
    .line 8
    iget-boolean v2, v0, Lzq2;->p:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lzq2;->j()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {v0, v2, v3}, Lzq2;->f(J)V

    .line 17
    .line 18
    .line 19
    iput-boolean v1, v0, Lzq2;->p:Z

    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Lq41;->n:[Lez3;

    .line 22
    .line 23
    array-length v0, p0

    .line 24
    :goto_0
    if-ge v1, v0, :cond_3

    .line 25
    .line 26
    aget-object v2, p0, v1

    .line 27
    .line 28
    iget-object v3, v2, Lez3;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lkq;

    .line 31
    .line 32
    iget-object v2, v2, Lez3;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lkq;

    .line 35
    .line 36
    invoke-static {v2}, Lez3;->h(Lkq;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-static {v2}, Lez3;->b(Lkq;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    if-eqz v3, :cond_2

    .line 46
    .line 47
    iget v2, v3, Lkq;->u:I

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-static {v3}, Lez3;->b(Lkq;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    return-void
.end method

.method public final w(Lcu4;Z)V
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 4
    .line 5
    iget-object v3, v1, Lq41;->j0:Lp41;

    .line 6
    .line 7
    iget-object v9, v1, Lq41;->F:Lro2;

    .line 8
    .line 9
    iget v4, v1, Lq41;->d0:I

    .line 10
    .line 11
    iget-boolean v5, v1, Lq41;->e0:Z

    .line 12
    .line 13
    iget-object v2, v1, Lq41;->x:Lbu4;

    .line 14
    .line 15
    iget-object v8, v1, Lq41;->y:Lzt4;

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Lcu4;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/4 v10, 0x4

    .line 22
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    new-instance v18, Lo41;

    .line 30
    .line 31
    sget-object v19, Lph3;->u:Lmt2;

    .line 32
    .line 33
    const/16 v25, 0x1

    .line 34
    .line 35
    const/16 v26, 0x0

    .line 36
    .line 37
    const-wide/16 v20, 0x0

    .line 38
    .line 39
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const/16 v24, 0x0

    .line 45
    .line 46
    invoke-direct/range {v18 .. v26}, Lo41;-><init>(Lmt2;JJZZZ)V

    .line 47
    .line 48
    .line 49
    move-object/from16 v2, p1

    .line 50
    .line 51
    move-object/from16 v10, v18

    .line 52
    .line 53
    goto/16 :goto_18

    .line 54
    .line 55
    :cond_0
    iget-object v6, v0, Lph3;->b:Lmt2;

    .line 56
    .line 57
    iget-object v14, v6, Lmt2;->a:Ljava/lang/Object;

    .line 58
    .line 59
    iget-object v7, v0, Lph3;->a:Lcu4;

    .line 60
    .line 61
    invoke-virtual {v7}, Lcu4;->p()Z

    .line 62
    .line 63
    .line 64
    move-result v20

    .line 65
    if-nez v20, :cond_2

    .line 66
    .line 67
    iget-object v15, v6, Lmt2;->a:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v7, v15, v8}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    iget-boolean v7, v7, Lzt4;->f:Z

    .line 74
    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const/4 v15, 0x0

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    :goto_0
    const/4 v15, 0x1

    .line 81
    :goto_1
    iget-object v7, v0, Lph3;->b:Lmt2;

    .line 82
    .line 83
    invoke-virtual {v7}, Lmt2;->b()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-nez v7, :cond_4

    .line 88
    .line 89
    if-eqz v15, :cond_3

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    iget-wide v11, v0, Lph3;->s:J

    .line 93
    .line 94
    :goto_2
    move-wide/from16 v24, v11

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_4
    :goto_3
    iget-wide v11, v0, Lph3;->c:J

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :goto_4
    if-eqz v3, :cond_8

    .line 101
    .line 102
    move-object v7, v6

    .line 103
    move v6, v5

    .line 104
    move v5, v4

    .line 105
    const/4 v4, 0x1

    .line 106
    move-object v13, v7

    .line 107
    const/4 v11, -0x1

    .line 108
    const-wide/16 v30, 0x1

    .line 109
    .line 110
    move-object v7, v2

    .line 111
    move-object/from16 v2, p1

    .line 112
    .line 113
    invoke-static/range {v2 .. v8}, Lq41;->T(Lcu4;Lp41;ZIZLbu4;Lzt4;)Landroid/util/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    if-nez v4, :cond_5

    .line 118
    .line 119
    invoke-virtual {v2, v6}, Lcu4;->a(Z)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    move v5, v3

    .line 124
    move-wide/from16 v3, v24

    .line 125
    .line 126
    const/4 v6, 0x1

    .line 127
    const/4 v12, 0x0

    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_5
    iget-wide v5, v3, Lp41;->c:J

    .line 132
    .line 133
    cmp-long v3, v5, v16

    .line 134
    .line 135
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 136
    .line 137
    if-nez v3, :cond_6

    .line 138
    .line 139
    invoke-virtual {v2, v5, v8}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget v3, v3, Lzt4;->c:I

    .line 144
    .line 145
    move v5, v3

    .line 146
    move-wide/from16 v3, v24

    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    goto :goto_5

    .line 150
    :cond_6
    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v3, Ljava/lang/Long;

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    move-object v14, v5

    .line 159
    move v5, v11

    .line 160
    const/4 v6, 0x1

    .line 161
    :goto_5
    iget v12, v0, Lph3;->e:I

    .line 162
    .line 163
    if-ne v12, v10, :cond_7

    .line 164
    .line 165
    const/4 v12, 0x1

    .line 166
    goto :goto_6

    .line 167
    :cond_7
    const/4 v12, 0x0

    .line 168
    :goto_6
    move/from16 v19, v6

    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    :goto_7
    move/from16 v39, v6

    .line 172
    .line 173
    move/from16 v38, v12

    .line 174
    .line 175
    move/from16 v40, v19

    .line 176
    .line 177
    move-wide/from16 v41, v3

    .line 178
    .line 179
    move-object v3, v7

    .line 180
    move-wide/from16 v6, v41

    .line 181
    .line 182
    move v4, v11

    .line 183
    const-wide/16 v10, 0x0

    .line 184
    .line 185
    goto/16 :goto_d

    .line 186
    .line 187
    :cond_8
    move-object v7, v2

    .line 188
    move-object v13, v6

    .line 189
    const/4 v11, -0x1

    .line 190
    const-wide/16 v30, 0x1

    .line 191
    .line 192
    move-object/from16 v2, p1

    .line 193
    .line 194
    move v6, v5

    .line 195
    move v5, v4

    .line 196
    iget-object v3, v0, Lph3;->a:Lcu4;

    .line 197
    .line 198
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_9

    .line 203
    .line 204
    invoke-virtual {v2, v6}, Lcu4;->a(Z)I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    move v5, v3

    .line 209
    move-object v3, v7

    .line 210
    :goto_8
    move v4, v11

    .line 211
    move-wide/from16 v6, v24

    .line 212
    .line 213
    const-wide/16 v10, 0x0

    .line 214
    .line 215
    :goto_9
    const/16 v38, 0x0

    .line 216
    .line 217
    const/16 v39, 0x0

    .line 218
    .line 219
    :goto_a
    const/16 v40, 0x0

    .line 220
    .line 221
    goto/16 :goto_d

    .line 222
    .line 223
    :cond_9
    invoke-virtual {v2, v14}, Lcu4;->b(Ljava/lang/Object;)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-ne v3, v11, :cond_b

    .line 228
    .line 229
    move-object v3, v7

    .line 230
    iget-object v7, v0, Lph3;->a:Lcu4;

    .line 231
    .line 232
    move-object v4, v8

    .line 233
    move-object v8, v2

    .line 234
    move-object v2, v3

    .line 235
    move-object v3, v4

    .line 236
    move v4, v5

    .line 237
    move v5, v6

    .line 238
    move-object v6, v14

    .line 239
    invoke-static/range {v2 .. v8}, Lq41;->U(Lbu4;Lzt4;IZLjava/lang/Object;Lcu4;Lcu4;)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    move-object/from16 v41, v3

    .line 244
    .line 245
    move-object v3, v2

    .line 246
    move-object v2, v8

    .line 247
    move-object/from16 v8, v41

    .line 248
    .line 249
    if-ne v4, v11, :cond_a

    .line 250
    .line 251
    invoke-virtual {v2, v5}, Lcu4;->a(Z)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    move v7, v4

    .line 256
    const/4 v4, 0x1

    .line 257
    goto :goto_b

    .line 258
    :cond_a
    move v7, v4

    .line 259
    const/4 v4, 0x0

    .line 260
    :goto_b
    move/from16 v39, v4

    .line 261
    .line 262
    move-object v14, v6

    .line 263
    move v5, v7

    .line 264
    move v4, v11

    .line 265
    move-wide/from16 v6, v24

    .line 266
    .line 267
    const-wide/16 v10, 0x0

    .line 268
    .line 269
    const/16 v38, 0x0

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_b
    move-object v3, v7

    .line 273
    move-object v6, v14

    .line 274
    cmp-long v4, v24, v16

    .line 275
    .line 276
    if-nez v4, :cond_c

    .line 277
    .line 278
    invoke-virtual {v2, v6, v8}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    iget v7, v4, Lzt4;->c:I

    .line 283
    .line 284
    move-object v14, v6

    .line 285
    move v5, v7

    .line 286
    goto :goto_8

    .line 287
    :cond_c
    if-eqz v15, :cond_f

    .line 288
    .line 289
    iget-object v4, v0, Lph3;->a:Lcu4;

    .line 290
    .line 291
    iget-object v5, v13, Lmt2;->a:Ljava/lang/Object;

    .line 292
    .line 293
    invoke-virtual {v4, v5, v8}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 294
    .line 295
    .line 296
    iget-object v4, v0, Lph3;->a:Lcu4;

    .line 297
    .line 298
    iget v5, v8, Lzt4;->c:I

    .line 299
    .line 300
    const-wide/16 v10, 0x0

    .line 301
    .line 302
    invoke-virtual {v4, v5, v3, v10, v11}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    iget v4, v4, Lbu4;->m:I

    .line 307
    .line 308
    iget-object v5, v0, Lph3;->a:Lcu4;

    .line 309
    .line 310
    iget-object v7, v13, Lmt2;->a:Ljava/lang/Object;

    .line 311
    .line 312
    invoke-virtual {v5, v7}, Lcu4;->b(Ljava/lang/Object;)I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-ne v4, v5, :cond_d

    .line 317
    .line 318
    iget-wide v4, v8, Lzt4;->e:J

    .line 319
    .line 320
    add-long v4, v24, v4

    .line 321
    .line 322
    invoke-virtual {v2, v6, v8}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    iget v6, v6, Lzt4;->c:I

    .line 327
    .line 328
    move-wide/from16 v41, v4

    .line 329
    .line 330
    move v5, v6

    .line 331
    move-wide/from16 v6, v41

    .line 332
    .line 333
    move-object v4, v8

    .line 334
    invoke-virtual/range {v2 .. v7}, Lcu4;->i(Lbu4;Lzt4;IJ)Landroid/util/Pair;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    iget-object v14, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 339
    .line 340
    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v4, Ljava/lang/Long;

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 345
    .line 346
    .line 347
    move-result-wide v4

    .line 348
    goto :goto_c

    .line 349
    :cond_d
    invoke-virtual {v2, v6, v8}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    iget-wide v4, v4, Lzt4;->d:J

    .line 354
    .line 355
    cmp-long v4, v4, v16

    .line 356
    .line 357
    if-eqz v4, :cond_e

    .line 358
    .line 359
    iget-wide v4, v8, Lzt4;->d:J

    .line 360
    .line 361
    sub-long v28, v4, v30

    .line 362
    .line 363
    const-wide/16 v26, 0x0

    .line 364
    .line 365
    invoke-static/range {v24 .. v29}, Lf35;->k(JJJ)J

    .line 366
    .line 367
    .line 368
    move-result-wide v4

    .line 369
    move-object v14, v6

    .line 370
    goto :goto_c

    .line 371
    :cond_e
    move-object v14, v6

    .line 372
    move-wide/from16 v4, v24

    .line 373
    .line 374
    :goto_c
    move-wide v6, v4

    .line 375
    const/4 v4, -0x1

    .line 376
    const/4 v5, -0x1

    .line 377
    const/16 v38, 0x0

    .line 378
    .line 379
    const/16 v39, 0x0

    .line 380
    .line 381
    const/16 v40, 0x1

    .line 382
    .line 383
    goto :goto_d

    .line 384
    :cond_f
    const-wide/16 v10, 0x0

    .line 385
    .line 386
    move-object v14, v6

    .line 387
    move-wide/from16 v6, v24

    .line 388
    .line 389
    const/4 v4, -0x1

    .line 390
    const/4 v5, -0x1

    .line 391
    goto/16 :goto_9

    .line 392
    .line 393
    :goto_d
    if-eq v5, v4, :cond_10

    .line 394
    .line 395
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    move-object/from16 v41, v8

    .line 401
    .line 402
    move v8, v4

    .line 403
    move-object/from16 v4, v41

    .line 404
    .line 405
    invoke-virtual/range {v2 .. v7}, Lcu4;->i(Lbu4;Lzt4;IJ)Landroid/util/Pair;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    iget-object v14, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 410
    .line 411
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v3, Ljava/lang/Long;

    .line 414
    .line 415
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 416
    .line 417
    .line 418
    move-result-wide v6

    .line 419
    move-wide/from16 v22, v16

    .line 420
    .line 421
    goto :goto_e

    .line 422
    :cond_10
    move-object/from16 v41, v8

    .line 423
    .line 424
    move v8, v4

    .line 425
    move-object/from16 v4, v41

    .line 426
    .line 427
    move-wide/from16 v22, v6

    .line 428
    .line 429
    :goto_e
    invoke-virtual {v9, v2, v14, v6, v7}, Lro2;->q(Lcu4;Ljava/lang/Object;J)Lmt2;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    iget v5, v3, Lmt2;->e:I

    .line 434
    .line 435
    if-eq v5, v8, :cond_12

    .line 436
    .line 437
    iget v9, v13, Lmt2;->e:I

    .line 438
    .line 439
    if-eq v9, v8, :cond_11

    .line 440
    .line 441
    if-lt v5, v9, :cond_11

    .line 442
    .line 443
    goto :goto_f

    .line 444
    :cond_11
    const/4 v5, 0x0

    .line 445
    goto :goto_10

    .line 446
    :cond_12
    :goto_f
    const/4 v5, 0x1

    .line 447
    :goto_10
    iget-object v8, v13, Lmt2;->a:Ljava/lang/Object;

    .line 448
    .line 449
    invoke-virtual {v8, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v8

    .line 453
    if-eqz v8, :cond_13

    .line 454
    .line 455
    invoke-virtual {v13}, Lmt2;->b()Z

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    if-nez v9, :cond_13

    .line 460
    .line 461
    invoke-virtual {v3}, Lmt2;->b()Z

    .line 462
    .line 463
    .line 464
    move-result v9

    .line 465
    if-nez v9, :cond_13

    .line 466
    .line 467
    if-eqz v5, :cond_13

    .line 468
    .line 469
    const/4 v5, 0x1

    .line 470
    goto :goto_11

    .line 471
    :cond_13
    const/4 v5, 0x0

    .line 472
    :goto_11
    invoke-virtual {v2, v14, v4}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    if-nez v15, :cond_15

    .line 477
    .line 478
    cmp-long v15, v24, v22

    .line 479
    .line 480
    if-nez v15, :cond_15

    .line 481
    .line 482
    iget-object v15, v13, Lmt2;->a:Ljava/lang/Object;

    .line 483
    .line 484
    iget v10, v13, Lmt2;->c:I

    .line 485
    .line 486
    iget v11, v13, Lmt2;->b:I

    .line 487
    .line 488
    iget-object v12, v3, Lmt2;->a:Ljava/lang/Object;

    .line 489
    .line 490
    invoke-virtual {v15, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v12

    .line 494
    if-nez v12, :cond_14

    .line 495
    .line 496
    goto :goto_13

    .line 497
    :cond_14
    invoke-virtual {v13}, Lmt2;->b()Z

    .line 498
    .line 499
    .line 500
    move-result v12

    .line 501
    if-eqz v12, :cond_16

    .line 502
    .line 503
    invoke-virtual {v9, v11}, Lzt4;->h(I)Z

    .line 504
    .line 505
    .line 506
    move-result v12

    .line 507
    if-eqz v12, :cond_16

    .line 508
    .line 509
    invoke-virtual {v9, v11, v10}, Lzt4;->e(II)I

    .line 510
    .line 511
    .line 512
    move-result v12

    .line 513
    const/4 v15, 0x4

    .line 514
    if-eq v12, v15, :cond_15

    .line 515
    .line 516
    invoke-virtual {v9, v11, v10}, Lzt4;->e(II)I

    .line 517
    .line 518
    .line 519
    move-result v9

    .line 520
    const/4 v10, 0x2

    .line 521
    if-eq v9, v10, :cond_15

    .line 522
    .line 523
    :goto_12
    const/4 v9, 0x1

    .line 524
    goto :goto_14

    .line 525
    :cond_15
    :goto_13
    const/4 v9, 0x0

    .line 526
    goto :goto_14

    .line 527
    :cond_16
    invoke-virtual {v3}, Lmt2;->b()Z

    .line 528
    .line 529
    .line 530
    move-result v10

    .line 531
    if-eqz v10, :cond_15

    .line 532
    .line 533
    iget v10, v3, Lmt2;->b:I

    .line 534
    .line 535
    invoke-virtual {v9, v10}, Lzt4;->h(I)Z

    .line 536
    .line 537
    .line 538
    move-result v9

    .line 539
    if-eqz v9, :cond_15

    .line 540
    .line 541
    goto :goto_12

    .line 542
    :goto_14
    if-nez v5, :cond_17

    .line 543
    .line 544
    if-eqz v9, :cond_18

    .line 545
    .line 546
    :cond_17
    move-object v3, v13

    .line 547
    :cond_18
    invoke-virtual {v3}, Lmt2;->b()Z

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    if-eqz v5, :cond_1c

    .line 552
    .line 553
    invoke-virtual {v3, v13}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    if-eqz v5, :cond_1a

    .line 558
    .line 559
    iget-wide v6, v0, Lph3;->s:J

    .line 560
    .line 561
    :cond_19
    :goto_15
    move-wide/from16 v34, v6

    .line 562
    .line 563
    move-wide/from16 v36, v22

    .line 564
    .line 565
    goto/16 :goto_17

    .line 566
    .line 567
    :cond_1a
    iget-object v0, v3, Lmt2;->a:Ljava/lang/Object;

    .line 568
    .line 569
    invoke-virtual {v2, v0, v4}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 570
    .line 571
    .line 572
    iget v0, v3, Lmt2;->c:I

    .line 573
    .line 574
    iget v5, v3, Lmt2;->b:I

    .line 575
    .line 576
    invoke-virtual {v4, v5}, Lzt4;->f(I)I

    .line 577
    .line 578
    .line 579
    move-result v5

    .line 580
    if-ne v0, v5, :cond_1b

    .line 581
    .line 582
    iget-object v0, v4, Lzt4;->g:Lz5;

    .line 583
    .line 584
    iget-wide v4, v0, Lz5;->b:J

    .line 585
    .line 586
    move-wide v6, v4

    .line 587
    goto :goto_15

    .line 588
    :cond_1b
    const-wide/16 v6, 0x0

    .line 589
    .line 590
    goto :goto_15

    .line 591
    :cond_1c
    if-eqz v8, :cond_19

    .line 592
    .line 593
    invoke-virtual {v13}, Lmt2;->b()Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-eqz v5, :cond_19

    .line 598
    .line 599
    invoke-virtual {v2, v14, v4}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    iget-object v5, v5, Lzt4;->g:Lz5;

    .line 604
    .line 605
    iget v8, v13, Lmt2;->b:I

    .line 606
    .line 607
    invoke-virtual {v5, v8}, Lz5;->a(I)Lx5;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    iget-wide v8, v5, Lx5;->j:J

    .line 612
    .line 613
    iget-wide v10, v0, Lph3;->c:J

    .line 614
    .line 615
    cmp-long v0, v10, v16

    .line 616
    .line 617
    if-eqz v0, :cond_1d

    .line 618
    .line 619
    move-object v0, v13

    .line 620
    iget-wide v12, v5, Lx5;->a:J

    .line 621
    .line 622
    const-wide/high16 v27, -0x8000000000000000L

    .line 623
    .line 624
    cmp-long v15, v12, v27

    .line 625
    .line 626
    if-eqz v15, :cond_1e

    .line 627
    .line 628
    add-long/2addr v12, v8

    .line 629
    cmp-long v10, v12, v10

    .line 630
    .line 631
    if-gtz v10, :cond_1e

    .line 632
    .line 633
    goto :goto_15

    .line 634
    :cond_1d
    move-object v0, v13

    .line 635
    :cond_1e
    iget v10, v5, Lx5;->b:I

    .line 636
    .line 637
    move-object v13, v0

    .line 638
    iget v0, v13, Lmt2;->c:I

    .line 639
    .line 640
    if-le v10, v0, :cond_19

    .line 641
    .line 642
    iget-object v5, v5, Lx5;->f:[I

    .line 643
    .line 644
    aget v0, v5, v0

    .line 645
    .line 646
    const/4 v10, 0x2

    .line 647
    if-ne v0, v10, :cond_19

    .line 648
    .line 649
    invoke-virtual {v2, v14, v4}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    iget-wide v4, v0, Lzt4;->d:J

    .line 654
    .line 655
    cmp-long v0, v4, v16

    .line 656
    .line 657
    if-eqz v0, :cond_1f

    .line 658
    .line 659
    sub-long v4, v4, v30

    .line 660
    .line 661
    add-long/2addr v6, v8

    .line 662
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 663
    .line 664
    .line 665
    move-result-wide v4

    .line 666
    move-wide v6, v4

    .line 667
    goto :goto_16

    .line 668
    :cond_1f
    add-long/2addr v6, v8

    .line 669
    :goto_16
    move-wide/from16 v34, v6

    .line 670
    .line 671
    move-wide/from16 v36, v34

    .line 672
    .line 673
    :goto_17
    new-instance v32, Lo41;

    .line 674
    .line 675
    move-object/from16 v33, v3

    .line 676
    .line 677
    invoke-direct/range {v32 .. v40}, Lo41;-><init>(Lmt2;JJZZZ)V

    .line 678
    .line 679
    .line 680
    move-object/from16 v10, v32

    .line 681
    .line 682
    :goto_18
    iget-object v11, v10, Lo41;->a:Lmt2;

    .line 683
    .line 684
    iget-wide v12, v10, Lo41;->c:J

    .line 685
    .line 686
    iget-boolean v6, v10, Lo41;->d:Z

    .line 687
    .line 688
    iget-wide v14, v10, Lo41;->b:J

    .line 689
    .line 690
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 691
    .line 692
    iget-object v0, v0, Lph3;->b:Lmt2;

    .line 693
    .line 694
    invoke-virtual {v0, v11}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    if-eqz v0, :cond_21

    .line 699
    .line 700
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 701
    .line 702
    iget-wide v3, v0, Lph3;->s:J

    .line 703
    .line 704
    cmp-long v0, v14, v3

    .line 705
    .line 706
    if-eqz v0, :cond_20

    .line 707
    .line 708
    goto :goto_19

    .line 709
    :cond_20
    const/16 v22, 0x0

    .line 710
    .line 711
    goto :goto_1a

    .line 712
    :cond_21
    :goto_19
    const/16 v22, 0x1

    .line 713
    .line 714
    :goto_1a
    const/16 v23, 0x3

    .line 715
    .line 716
    :try_start_0
    iget-boolean v0, v10, Lo41;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    .line 717
    .line 718
    if-eqz v0, :cond_23

    .line 719
    .line 720
    :try_start_1
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 721
    .line 722
    iget v0, v0, Lph3;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 723
    .line 724
    const/4 v4, 0x1

    .line 725
    if-eq v0, v4, :cond_22

    .line 726
    .line 727
    const/4 v5, 0x4

    .line 728
    :try_start_2
    invoke-virtual {v1, v5}, Lq41;->n0(I)V

    .line 729
    .line 730
    .line 731
    :goto_1b
    const/4 v7, 0x0

    .line 732
    goto :goto_1d

    .line 733
    :catchall_0
    move-exception v0

    .line 734
    :goto_1c
    move-object/from16 v20, v11

    .line 735
    .line 736
    move-object v11, v2

    .line 737
    move-object/from16 v2, v20

    .line 738
    .line 739
    move/from16 v20, v4

    .line 740
    .line 741
    move/from16 v26, v5

    .line 742
    .line 743
    move-wide/from16 v24, v12

    .line 744
    .line 745
    const/4 v12, 0x0

    .line 746
    goto/16 :goto_32

    .line 747
    .line 748
    :cond_22
    const/4 v5, 0x4

    .line 749
    goto :goto_1b

    .line 750
    :goto_1d
    invoke-virtual {v1, v7, v7, v7, v4}, Lq41;->P(ZZZZ)V

    .line 751
    .line 752
    .line 753
    goto :goto_1e

    .line 754
    :catchall_1
    move-exception v0

    .line 755
    const/4 v4, 0x1

    .line 756
    const/4 v5, 0x4

    .line 757
    goto :goto_1c

    .line 758
    :cond_23
    const/4 v4, 0x1

    .line 759
    const/4 v5, 0x4

    .line 760
    :goto_1e
    iget-object v0, v1, Lq41;->n:[Lez3;

    .line 761
    .line 762
    array-length v7, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 763
    const/4 v8, 0x0

    .line 764
    :goto_1f
    if-ge v8, v7, :cond_26

    .line 765
    .line 766
    :try_start_3
    aget-object v9, v0, v8

    .line 767
    .line 768
    iget-object v3, v9, Lez3;->e:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v3, Lkq;

    .line 771
    .line 772
    iget-object v4, v3, Lkq;->C:Lcu4;

    .line 773
    .line 774
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-result v4

    .line 778
    if-nez v4, :cond_24

    .line 779
    .line 780
    iput-object v2, v3, Lkq;->C:Lcu4;

    .line 781
    .line 782
    invoke-virtual {v3}, Lkq;->y()V

    .line 783
    .line 784
    .line 785
    :cond_24
    iget-object v3, v9, Lez3;->f:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v3, Lkq;

    .line 788
    .line 789
    if-eqz v3, :cond_25

    .line 790
    .line 791
    iget-object v4, v3, Lkq;->C:Lcu4;

    .line 792
    .line 793
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result v4

    .line 797
    if-nez v4, :cond_25

    .line 798
    .line 799
    iput-object v2, v3, Lkq;->C:Lcu4;

    .line 800
    .line 801
    invoke-virtual {v3}, Lkq;->y()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 802
    .line 803
    .line 804
    :cond_25
    add-int/lit8 v8, v8, 0x1

    .line 805
    .line 806
    const/4 v4, 0x1

    .line 807
    goto :goto_1f

    .line 808
    :goto_20
    move-object/from16 v20, v11

    .line 809
    .line 810
    move-object v11, v2

    .line 811
    move-object/from16 v2, v20

    .line 812
    .line 813
    move/from16 v26, v5

    .line 814
    .line 815
    move-wide/from16 v24, v12

    .line 816
    .line 817
    const/4 v12, 0x0

    .line 818
    const/16 v20, 0x1

    .line 819
    .line 820
    goto/16 :goto_32

    .line 821
    .line 822
    :catchall_2
    move-exception v0

    .line 823
    goto :goto_20

    .line 824
    :cond_26
    if-nez v22, :cond_2c

    .line 825
    .line 826
    :try_start_4
    iget-object v0, v1, Lq41;->F:Lro2;

    .line 827
    .line 828
    iget-object v0, v0, Lro2;->j:Loo2;

    .line 829
    .line 830
    if-nez v0, :cond_27

    .line 831
    .line 832
    const-wide/16 v6, 0x0

    .line 833
    .line 834
    goto :goto_21

    .line 835
    :cond_27
    invoke-virtual {v1, v0}, Lq41;->o(Loo2;)J

    .line 836
    .line 837
    .line 838
    move-result-wide v3

    .line 839
    move-wide v6, v3

    .line 840
    :goto_21
    invoke-virtual {v1}, Lq41;->f()Z

    .line 841
    .line 842
    .line 843
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    .line 844
    if-eqz v0, :cond_29

    .line 845
    .line 846
    :try_start_5
    iget-object v0, v1, Lq41;->F:Lro2;

    .line 847
    .line 848
    iget-object v0, v0, Lro2;->k:Loo2;

    .line 849
    .line 850
    if-nez v0, :cond_28

    .line 851
    .line 852
    goto :goto_22

    .line 853
    :cond_28
    invoke-virtual {v1, v0}, Lq41;->o(Loo2;)J

    .line 854
    .line 855
    .line 856
    move-result-wide v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 857
    move-wide v8, v3

    .line 858
    goto :goto_23

    .line 859
    :cond_29
    :goto_22
    const-wide/16 v8, 0x0

    .line 860
    .line 861
    :goto_23
    :try_start_6
    iget-object v2, v1, Lq41;->F:Lro2;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 862
    .line 863
    move v3, v5

    .line 864
    :try_start_7
    iget-wide v4, v1, Lq41;->k0:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 865
    .line 866
    move/from16 v26, v3

    .line 867
    .line 868
    move-wide/from16 v24, v12

    .line 869
    .line 870
    const/4 v12, 0x0

    .line 871
    const/16 v20, 0x1

    .line 872
    .line 873
    move-object/from16 v3, p1

    .line 874
    .line 875
    :try_start_8
    invoke-virtual/range {v2 .. v9}, Lro2;->t(Lcu4;JJJ)I

    .line 876
    .line 877
    .line 878
    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 879
    move-object v8, v3

    .line 880
    and-int/lit8 v2, v0, 0x1

    .line 881
    .line 882
    if-eqz v2, :cond_2a

    .line 883
    .line 884
    const/4 v7, 0x0

    .line 885
    :try_start_9
    invoke-virtual {v1, v7}, Lq41;->W(Z)V

    .line 886
    .line 887
    .line 888
    goto :goto_26

    .line 889
    :catchall_3
    move-exception v0

    .line 890
    :goto_24
    move-object v2, v11

    .line 891
    :goto_25
    move-object v11, v8

    .line 892
    goto/16 :goto_32

    .line 893
    .line 894
    :cond_2a
    const/16 v21, 0x2

    .line 895
    .line 896
    and-int/lit8 v0, v0, 0x2

    .line 897
    .line 898
    if-eqz v0, :cond_2b

    .line 899
    .line 900
    invoke-virtual {v1}, Lq41;->h()V

    .line 901
    .line 902
    .line 903
    :cond_2b
    :goto_26
    move-object v2, v11

    .line 904
    goto/16 :goto_2c

    .line 905
    .line 906
    :catchall_4
    move-exception v0

    .line 907
    move-object v8, v3

    .line 908
    goto :goto_24

    .line 909
    :catchall_5
    move-exception v0

    .line 910
    move-object/from16 v8, p1

    .line 911
    .line 912
    move/from16 v26, v3

    .line 913
    .line 914
    :goto_27
    move-wide/from16 v24, v12

    .line 915
    .line 916
    const/4 v12, 0x0

    .line 917
    const/16 v20, 0x1

    .line 918
    .line 919
    goto :goto_24

    .line 920
    :catchall_6
    move-exception v0

    .line 921
    move-object/from16 v8, p1

    .line 922
    .line 923
    :goto_28
    move/from16 v26, v5

    .line 924
    .line 925
    goto :goto_27

    .line 926
    :catchall_7
    move-exception v0

    .line 927
    move-object v8, v2

    .line 928
    goto :goto_28

    .line 929
    :cond_2c
    move-object v8, v2

    .line 930
    move/from16 v26, v5

    .line 931
    .line 932
    move-wide/from16 v24, v12

    .line 933
    .line 934
    const/4 v12, 0x0

    .line 935
    const/16 v20, 0x1

    .line 936
    .line 937
    invoke-virtual {v8}, Lcu4;->p()Z

    .line 938
    .line 939
    .line 940
    move-result v0

    .line 941
    if-nez v0, :cond_2b

    .line 942
    .line 943
    iget-object v0, v1, Lq41;->F:Lro2;

    .line 944
    .line 945
    iget-object v0, v0, Lro2;->i:Loo2;

    .line 946
    .line 947
    :goto_29
    if-eqz v0, :cond_2e

    .line 948
    .line 949
    iget-object v2, v0, Loo2;->g:Lpo2;

    .line 950
    .line 951
    iget-object v2, v2, Lpo2;->a:Lmt2;

    .line 952
    .line 953
    invoke-virtual {v2, v11}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    if-eqz v2, :cond_2d

    .line 958
    .line 959
    iget-object v2, v1, Lq41;->F:Lro2;

    .line 960
    .line 961
    iget-object v3, v0, Loo2;->g:Lpo2;

    .line 962
    .line 963
    invoke-virtual {v2, v8, v3}, Lro2;->i(Lcu4;Lpo2;)Lpo2;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    iput-object v2, v0, Loo2;->g:Lpo2;

    .line 968
    .line 969
    invoke-virtual {v0}, Loo2;->k()V

    .line 970
    .line 971
    .line 972
    :cond_2d
    iget-object v0, v0, Loo2;->m:Loo2;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 973
    .line 974
    goto :goto_29

    .line 975
    :cond_2e
    :try_start_a
    iget-object v0, v1, Lq41;->F:Lro2;

    .line 976
    .line 977
    iget-object v2, v0, Lro2;->i:Loo2;

    .line 978
    .line 979
    iget-object v0, v0, Lro2;->j:Loo2;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 980
    .line 981
    if-eq v2, v0, :cond_2f

    .line 982
    .line 983
    move/from16 v5, v20

    .line 984
    .line 985
    :goto_2a
    move-object v2, v11

    .line 986
    move-wide v3, v14

    .line 987
    goto :goto_2b

    .line 988
    :cond_2f
    const/4 v5, 0x0

    .line 989
    goto :goto_2a

    .line 990
    :goto_2b
    :try_start_b
    invoke-virtual/range {v1 .. v6}, Lq41;->Y(Lmt2;JZZ)J

    .line 991
    .line 992
    .line 993
    move-result-wide v14
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 994
    goto :goto_2c

    .line 995
    :catchall_8
    move-exception v0

    .line 996
    move-wide v14, v3

    .line 997
    goto :goto_25

    .line 998
    :catchall_9
    move-exception v0

    .line 999
    goto :goto_24

    .line 1000
    :goto_2c
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 1001
    .line 1002
    iget-object v4, v0, Lph3;->a:Lcu4;

    .line 1003
    .line 1004
    iget-object v5, v0, Lph3;->b:Lmt2;

    .line 1005
    .line 1006
    iget-boolean v0, v10, Lo41;->f:Z

    .line 1007
    .line 1008
    if-eqz v0, :cond_30

    .line 1009
    .line 1010
    move-wide v6, v14

    .line 1011
    goto :goto_2d

    .line 1012
    :cond_30
    move-wide/from16 v6, v16

    .line 1013
    .line 1014
    :goto_2d
    const/4 v8, 0x0

    .line 1015
    move-object v3, v2

    .line 1016
    move-object/from16 v2, p1

    .line 1017
    .line 1018
    invoke-virtual/range {v1 .. v8}, Lq41;->C0(Lcu4;Lmt2;Lcu4;Lmt2;JZ)V

    .line 1019
    .line 1020
    .line 1021
    move-object v11, v2

    .line 1022
    move-object v2, v3

    .line 1023
    if-nez v22, :cond_31

    .line 1024
    .line 1025
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 1026
    .line 1027
    iget-wide v3, v0, Lph3;->c:J

    .line 1028
    .line 1029
    cmp-long v0, v24, v3

    .line 1030
    .line 1031
    if-eqz v0, :cond_35

    .line 1032
    .line 1033
    :cond_31
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 1034
    .line 1035
    iget-object v3, v0, Lph3;->b:Lmt2;

    .line 1036
    .line 1037
    iget-object v3, v3, Lmt2;->a:Ljava/lang/Object;

    .line 1038
    .line 1039
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 1040
    .line 1041
    if-eqz v22, :cond_32

    .line 1042
    .line 1043
    if-eqz p2, :cond_32

    .line 1044
    .line 1045
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v4

    .line 1049
    if-nez v4, :cond_32

    .line 1050
    .line 1051
    iget-object v4, v1, Lq41;->y:Lzt4;

    .line 1052
    .line 1053
    invoke-virtual {v0, v3, v4}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    iget-boolean v0, v0, Lzt4;->f:Z

    .line 1058
    .line 1059
    if-nez v0, :cond_32

    .line 1060
    .line 1061
    move/from16 v9, v20

    .line 1062
    .line 1063
    goto :goto_2e

    .line 1064
    :cond_32
    const/4 v9, 0x0

    .line 1065
    :goto_2e
    if-eqz v9, :cond_33

    .line 1066
    .line 1067
    move-wide v7, v14

    .line 1068
    goto :goto_2f

    .line 1069
    :cond_33
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 1070
    .line 1071
    iget-wide v4, v0, Lph3;->d:J

    .line 1072
    .line 1073
    move-wide v7, v4

    .line 1074
    :goto_2f
    invoke-virtual {v11, v3}, Lcu4;->b(Ljava/lang/Object;)I

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    const/4 v4, -0x1

    .line 1079
    if-ne v0, v4, :cond_34

    .line 1080
    .line 1081
    move/from16 v10, v26

    .line 1082
    .line 1083
    :goto_30
    move-wide v3, v14

    .line 1084
    move-wide/from16 v5, v24

    .line 1085
    .line 1086
    goto :goto_31

    .line 1087
    :cond_34
    move/from16 v10, v23

    .line 1088
    .line 1089
    goto :goto_30

    .line 1090
    :goto_31
    invoke-virtual/range {v1 .. v10}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    iput-object v0, v1, Lq41;->V:Lph3;

    .line 1095
    .line 1096
    :cond_35
    invoke-virtual {v1}, Lq41;->Q()V

    .line 1097
    .line 1098
    .line 1099
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 1100
    .line 1101
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 1102
    .line 1103
    invoke-virtual {v1, v11, v0}, Lq41;->S(Lcu4;Lcu4;)V

    .line 1104
    .line 1105
    .line 1106
    iget-object v0, v1, Lq41;->V:Lph3;

    .line 1107
    .line 1108
    invoke-virtual {v0, v11}, Lph3;->j(Lcu4;)Lph3;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    iput-object v0, v1, Lq41;->V:Lph3;

    .line 1113
    .line 1114
    invoke-virtual {v11}, Lcu4;->p()Z

    .line 1115
    .line 1116
    .line 1117
    move-result v0

    .line 1118
    if-nez v0, :cond_36

    .line 1119
    .line 1120
    iput-object v12, v1, Lq41;->j0:Lp41;

    .line 1121
    .line 1122
    :cond_36
    const/4 v7, 0x0

    .line 1123
    invoke-virtual {v1, v7}, Lq41;->v(Z)V

    .line 1124
    .line 1125
    .line 1126
    iget-object v0, v1, Lq41;->u:Lyp4;

    .line 1127
    .line 1128
    const/4 v10, 0x2

    .line 1129
    invoke-virtual {v0, v10}, Lyp4;->g(I)V

    .line 1130
    .line 1131
    .line 1132
    return-void

    .line 1133
    :catchall_a
    move-exception v0

    .line 1134
    move-object/from16 v20, v11

    .line 1135
    .line 1136
    move-object v11, v2

    .line 1137
    move-object/from16 v2, v20

    .line 1138
    .line 1139
    move-wide/from16 v24, v12

    .line 1140
    .line 1141
    const/4 v12, 0x0

    .line 1142
    const/16 v20, 0x1

    .line 1143
    .line 1144
    const/16 v26, 0x4

    .line 1145
    .line 1146
    :goto_32
    iget-object v3, v1, Lq41;->V:Lph3;

    .line 1147
    .line 1148
    iget-object v4, v3, Lph3;->a:Lcu4;

    .line 1149
    .line 1150
    iget-object v5, v3, Lph3;->b:Lmt2;

    .line 1151
    .line 1152
    iget-boolean v3, v10, Lo41;->f:Z

    .line 1153
    .line 1154
    if-eqz v3, :cond_37

    .line 1155
    .line 1156
    move-wide v6, v14

    .line 1157
    goto :goto_33

    .line 1158
    :cond_37
    move-wide/from16 v6, v16

    .line 1159
    .line 1160
    :goto_33
    const/4 v8, 0x0

    .line 1161
    move-object v3, v2

    .line 1162
    move-object v2, v11

    .line 1163
    invoke-virtual/range {v1 .. v8}, Lq41;->C0(Lcu4;Lmt2;Lcu4;Lmt2;JZ)V

    .line 1164
    .line 1165
    .line 1166
    move-object v2, v3

    .line 1167
    if-nez v22, :cond_38

    .line 1168
    .line 1169
    iget-object v3, v1, Lq41;->V:Lph3;

    .line 1170
    .line 1171
    iget-wide v3, v3, Lph3;->c:J

    .line 1172
    .line 1173
    cmp-long v3, v24, v3

    .line 1174
    .line 1175
    if-eqz v3, :cond_3c

    .line 1176
    .line 1177
    :cond_38
    iget-object v3, v1, Lq41;->V:Lph3;

    .line 1178
    .line 1179
    iget-object v4, v3, Lph3;->b:Lmt2;

    .line 1180
    .line 1181
    iget-object v4, v4, Lmt2;->a:Ljava/lang/Object;

    .line 1182
    .line 1183
    iget-object v3, v3, Lph3;->a:Lcu4;

    .line 1184
    .line 1185
    if-eqz v22, :cond_39

    .line 1186
    .line 1187
    if-eqz p2, :cond_39

    .line 1188
    .line 1189
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 1190
    .line 1191
    .line 1192
    move-result v5

    .line 1193
    if-nez v5, :cond_39

    .line 1194
    .line 1195
    iget-object v5, v1, Lq41;->y:Lzt4;

    .line 1196
    .line 1197
    invoke-virtual {v3, v4, v5}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v3

    .line 1201
    iget-boolean v3, v3, Lzt4;->f:Z

    .line 1202
    .line 1203
    if-nez v3, :cond_39

    .line 1204
    .line 1205
    move/from16 v9, v20

    .line 1206
    .line 1207
    goto :goto_34

    .line 1208
    :cond_39
    const/4 v9, 0x0

    .line 1209
    :goto_34
    if-eqz v9, :cond_3a

    .line 1210
    .line 1211
    move-wide v7, v14

    .line 1212
    goto :goto_35

    .line 1213
    :cond_3a
    iget-object v3, v1, Lq41;->V:Lph3;

    .line 1214
    .line 1215
    iget-wide v5, v3, Lph3;->d:J

    .line 1216
    .line 1217
    move-wide v7, v5

    .line 1218
    :goto_35
    invoke-virtual {v11, v4}, Lcu4;->b(Ljava/lang/Object;)I

    .line 1219
    .line 1220
    .line 1221
    move-result v3

    .line 1222
    const/4 v4, -0x1

    .line 1223
    if-ne v3, v4, :cond_3b

    .line 1224
    .line 1225
    move/from16 v10, v26

    .line 1226
    .line 1227
    :goto_36
    move-wide v3, v14

    .line 1228
    move-wide/from16 v5, v24

    .line 1229
    .line 1230
    goto :goto_37

    .line 1231
    :cond_3b
    move/from16 v10, v23

    .line 1232
    .line 1233
    goto :goto_36

    .line 1234
    :goto_37
    invoke-virtual/range {v1 .. v10}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v2

    .line 1238
    iput-object v2, v1, Lq41;->V:Lph3;

    .line 1239
    .line 1240
    :cond_3c
    invoke-virtual {v1}, Lq41;->Q()V

    .line 1241
    .line 1242
    .line 1243
    iget-object v2, v1, Lq41;->V:Lph3;

    .line 1244
    .line 1245
    iget-object v2, v2, Lph3;->a:Lcu4;

    .line 1246
    .line 1247
    invoke-virtual {v1, v11, v2}, Lq41;->S(Lcu4;Lcu4;)V

    .line 1248
    .line 1249
    .line 1250
    iget-object v2, v1, Lq41;->V:Lph3;

    .line 1251
    .line 1252
    invoke-virtual {v2, v11}, Lph3;->j(Lcu4;)Lph3;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v2

    .line 1256
    iput-object v2, v1, Lq41;->V:Lph3;

    .line 1257
    .line 1258
    invoke-virtual {v11}, Lcu4;->p()Z

    .line 1259
    .line 1260
    .line 1261
    move-result v2

    .line 1262
    if-nez v2, :cond_3d

    .line 1263
    .line 1264
    iput-object v12, v1, Lq41;->j0:Lp41;

    .line 1265
    .line 1266
    :cond_3d
    const/4 v7, 0x0

    .line 1267
    invoke-virtual {v1, v7}, Lq41;->v(Z)V

    .line 1268
    .line 1269
    .line 1270
    iget-object v1, v1, Lq41;->u:Lyp4;

    .line 1271
    .line 1272
    const/4 v10, 0x2

    .line 1273
    invoke-virtual {v1, v10}, Lyp4;->g(I)V

    .line 1274
    .line 1275
    .line 1276
    throw v0
.end method

.method public final w0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v0, v0, Lro2;->l:Loo2;

    .line 4
    .line 5
    iget-boolean v1, p0, Lq41;->c0:Z

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Loo2;->a:Lno2;

    .line 12
    .line 13
    invoke-interface {v0}, Lda4;->f()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    :goto_1
    iget-object v1, p0, Lq41;->V:Lph3;

    .line 24
    .line 25
    iget-boolean v2, v1, Lph3;->g:Z

    .line 26
    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lph3;->b(Z)Lph3;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lq41;->V:Lph3;

    .line 34
    .line 35
    :cond_2
    return-void
.end method

.method public final x(Lno2;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lq41;->F:Lro2;

    .line 2
    .line 3
    iget-object v1, v0, Lro2;->l:Loo2;

    .line 4
    .line 5
    iget-object v2, p0, Lq41;->B:Lxl0;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    iget-object v4, v1, Loo2;->a:Lno2;

    .line 11
    .line 12
    if-ne v4, p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean p1, v1, Loo2;->e:Z

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Lxl0;->i()Lqh3;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget p1, p1, Lqh3;->a:F

    .line 26
    .line 27
    iget-object v2, p0, Lq41;->V:Lph3;

    .line 28
    .line 29
    iget-object v4, v2, Lph3;->a:Lcu4;

    .line 30
    .line 31
    iget-boolean v2, v2, Lph3;->l:Z

    .line 32
    .line 33
    invoke-virtual {v1, p1, v4, v2}, Loo2;->f(FLcu4;Z)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, v1, Loo2;->g:Lpo2;

    .line 37
    .line 38
    iget-object p1, p1, Lpo2;->a:Lmt2;

    .line 39
    .line 40
    iget-object v2, v1, Loo2;->n:Ltv4;

    .line 41
    .line 42
    iget-object v4, v1, Loo2;->o:Lew4;

    .line 43
    .line 44
    invoke-virtual {p0, p1, v2, v4}, Lq41;->x0(Lmt2;Ltv4;Lew4;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, Lro2;->i:Loo2;

    .line 48
    .line 49
    if-ne v1, p1, :cond_1

    .line 50
    .line 51
    iget-object p1, v1, Loo2;->g:Lpo2;

    .line 52
    .line 53
    iget-wide v4, p1, Lpo2;->b:J

    .line 54
    .line 55
    invoke-virtual {p0, v3, v4, v5}, Lq41;->R(ZJ)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lq41;->n:[Lez3;

    .line 59
    .line 60
    array-length p1, p1

    .line 61
    new-array p1, p1, [Z

    .line 62
    .line 63
    iget-object v0, v0, Lro2;->j:Loo2;

    .line 64
    .line 65
    invoke-virtual {v0}, Loo2;->e()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    invoke-virtual {p0, p1, v4, v5}, Lq41;->m([ZJ)V

    .line 70
    .line 71
    .line 72
    iput-boolean v3, v1, Loo2;->h:Z

    .line 73
    .line 74
    iget-object p1, p0, Lq41;->V:Lph3;

    .line 75
    .line 76
    iget-object v3, p1, Lph3;->b:Lmt2;

    .line 77
    .line 78
    iget-object v0, v1, Loo2;->g:Lpo2;

    .line 79
    .line 80
    iget-wide v4, v0, Lpo2;->b:J

    .line 81
    .line 82
    iget-wide v6, p1, Lph3;->c:J

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v11, 0x5

    .line 86
    move-wide v8, v4

    .line 87
    move-object v2, p0

    .line 88
    invoke-virtual/range {v2 .. v11}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    move-object v1, v2

    .line 93
    iput-object p0, v1, Lq41;->V:Lph3;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move-object v1, p0

    .line 97
    :goto_0
    invoke-virtual {v1}, Lq41;->D()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    move-object v1, p0

    .line 102
    const/4 p0, 0x0

    .line 103
    :goto_1
    iget-object v4, v0, Lro2;->q:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-ge p0, v4, :cond_4

    .line 110
    .line 111
    iget-object v4, v0, Lro2;->q:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Loo2;

    .line 118
    .line 119
    iget-object v5, v4, Loo2;->a:Lno2;

    .line 120
    .line 121
    if-ne v5, p1, :cond_3

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const/4 v4, 0x0

    .line 128
    :goto_2
    if-eqz v4, :cond_5

    .line 129
    .line 130
    iget-boolean p0, v4, Loo2;->e:Z

    .line 131
    .line 132
    xor-int/2addr p0, v3

    .line 133
    invoke-static {p0}, Lrr2;->w(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lxl0;->i()Lqh3;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    iget p0, p0, Lqh3;->a:F

    .line 141
    .line 142
    iget-object v2, v1, Lq41;->V:Lph3;

    .line 143
    .line 144
    iget-object v3, v2, Lph3;->a:Lcu4;

    .line 145
    .line 146
    iget-boolean v2, v2, Lph3;->l:Z

    .line 147
    .line 148
    invoke-virtual {v4, p0, v3, v2}, Loo2;->f(FLcu4;Z)V

    .line 149
    .line 150
    .line 151
    iget-object p0, v0, Lro2;->m:Loo2;

    .line 152
    .line 153
    if-eqz p0, :cond_5

    .line 154
    .line 155
    iget-object p0, p0, Loo2;->a:Lno2;

    .line 156
    .line 157
    if-ne p0, p1, :cond_5

    .line 158
    .line 159
    invoke-virtual {v1}, Lq41;->E()V

    .line 160
    .line 161
    .line 162
    :cond_5
    return-void
.end method

.method public final x0(Lmt2;Ltv4;Lew4;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 4
    .line 5
    iget-object v2, v1, Lro2;->l:Loo2;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, v1, Lro2;->i:Loo2;

    .line 11
    .line 12
    iget-wide v3, v0, Lq41;->k0:J

    .line 13
    .line 14
    iget-wide v5, v2, Loo2;->p:J

    .line 15
    .line 16
    if-ne v2, v1, :cond_0

    .line 17
    .line 18
    :goto_0
    sub-long/2addr v3, v5

    .line 19
    move-wide v9, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    sub-long/2addr v3, v5

    .line 22
    iget-object v1, v2, Loo2;->g:Lpo2;

    .line 23
    .line 24
    iget-wide v5, v1, Lpo2;->b:J

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    invoke-virtual {v2}, Loo2;->d()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-virtual {v0, v3, v4}, Lq41;->q(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v11

    .line 35
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 36
    .line 37
    iget-object v1, v1, Lph3;->a:Lcu4;

    .line 38
    .line 39
    iget-object v2, v2, Loo2;->g:Lpo2;

    .line 40
    .line 41
    iget-object v2, v2, Lpo2;->a:Lmt2;

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lq41;->s0(Lcu4;Lmt2;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget-object v1, v0, Lq41;->H:Lul0;

    .line 50
    .line 51
    iget-wide v1, v1, Lul0;->h:J

    .line 52
    .line 53
    :goto_2
    move-wide v15, v1

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :goto_3
    new-instance v5, Lbd2;

    .line 62
    .line 63
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 64
    .line 65
    iget-object v7, v1, Lph3;->a:Lcu4;

    .line 66
    .line 67
    iget-object v1, v0, Lq41;->B:Lxl0;

    .line 68
    .line 69
    invoke-virtual {v1}, Lxl0;->i()Lqh3;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget v13, v1, Lqh3;->a:F

    .line 74
    .line 75
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 76
    .line 77
    iget-boolean v1, v1, Lph3;->l:Z

    .line 78
    .line 79
    iget-boolean v14, v0, Lq41;->a0:Z

    .line 80
    .line 81
    iget-object v6, v0, Lq41;->J:Lik3;

    .line 82
    .line 83
    move-object/from16 v8, p1

    .line 84
    .line 85
    invoke-direct/range {v5 .. v16}, Lbd2;-><init>(Lik3;Lcu4;Lmt2;JJFZJ)V

    .line 86
    .line 87
    .line 88
    move-object/from16 v1, p3

    .line 89
    .line 90
    iget-object v1, v1, Lew4;->q:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, [Lt41;

    .line 93
    .line 94
    iget-object v0, v0, Lq41;->s:Lcd2;

    .line 95
    .line 96
    move-object/from16 v2, p2

    .line 97
    .line 98
    invoke-interface {v0, v5, v2, v1}, Lcd2;->f(Lbd2;Ltv4;[Lt41;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final y(Lqh3;FZZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lq41;->W:Ln41;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Ln41;->e(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Lq41;->V:Lph3;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Lph3;->g(Lqh3;)Lph3;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Lq41;->V:Lph3;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, Lqh3;->a:F

    .line 20
    .line 21
    iget-object p4, p0, Lq41;->F:Lro2;

    .line 22
    .line 23
    iget-object p4, p4, Lro2;->i:Loo2;

    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-eqz p4, :cond_4

    .line 27
    .line 28
    iget-object v1, p4, Loo2;->o:Lew4;

    .line 29
    .line 30
    iget-object v1, v1, Lew4;->q:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, [Lt41;

    .line 33
    .line 34
    array-length v2, v1

    .line 35
    :goto_1
    if-ge v0, v2, :cond_3

    .line 36
    .line 37
    aget-object v3, v1, v0

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-interface {v3, p3}, Lt41;->p(F)V

    .line 42
    .line 43
    .line 44
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object p4, p4, Loo2;->m:Loo2;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    iget-object p0, p0, Lq41;->n:[Lez3;

    .line 51
    .line 52
    array-length p3, p0

    .line 53
    :goto_2
    if-ge v0, p3, :cond_6

    .line 54
    .line 55
    aget-object p4, p0, v0

    .line 56
    .line 57
    iget v1, p1, Lqh3;->a:F

    .line 58
    .line 59
    iget-object v2, p4, Lez3;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lkq;

    .line 62
    .line 63
    invoke-virtual {v2, p2, v1}, Lkq;->D(FF)V

    .line 64
    .line 65
    .line 66
    iget-object p4, p4, Lez3;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p4, Lkq;

    .line 69
    .line 70
    if-eqz p4, :cond_5

    .line 71
    .line 72
    invoke-virtual {p4, p2, v1}, Lkq;->D(FF)V

    .line 73
    .line 74
    .line 75
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_6
    return-void
.end method

.method public final y0(IILjava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lq41;->W:Ln41;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ln41;->e(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lq41;->G:Lfo1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lfo1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-ltz p1, :cond_0

    .line 18
    .line 19
    if-gt p1, p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-gt p2, v4, :cond_0

    .line 26
    .line 27
    move v4, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v3

    .line 30
    :goto_0
    invoke-static {v4}, Lrr2;->l(Z)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    sub-int v5, p2, p1

    .line 38
    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v3

    .line 43
    :goto_1
    invoke-static {v1}, Lrr2;->l(Z)V

    .line 44
    .line 45
    .line 46
    move v1, p1

    .line 47
    :goto_2
    if-ge v1, p2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lbu2;

    .line 54
    .line 55
    iget-object v4, v4, Lbu2;->a:Lrg2;

    .line 56
    .line 57
    sub-int v5, v1, p1

    .line 58
    .line 59
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Lgn2;

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Lrg2;->s(Lgn2;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-virtual {v0}, Lfo1;->f()Lcu4;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0, p1, v3}, Lq41;->w(Lcu4;Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final z(Lmt2;JJJZI)Lph3;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v4, p4

    .line 6
    .line 7
    move/from16 v2, p9

    .line 8
    .line 9
    iget-boolean v3, v0, Lq41;->n0:Z

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 15
    .line 16
    iget-wide v8, v3, Lph3;->s:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 23
    .line 24
    iget-object v3, v3, Lph3;->b:Lmt2;

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v7

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 36
    :goto_1
    iput-boolean v3, v0, Lq41;->n0:Z

    .line 37
    .line 38
    invoke-virtual {v0}, Lq41;->Q()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 42
    .line 43
    iget-object v8, v3, Lph3;->h:Ltv4;

    .line 44
    .line 45
    iget-object v9, v3, Lph3;->i:Lew4;

    .line 46
    .line 47
    iget-object v10, v3, Lph3;->j:Ljava/util/List;

    .line 48
    .line 49
    iget-object v11, v0, Lq41;->G:Lfo1;

    .line 50
    .line 51
    iget-boolean v11, v11, Lfo1;->a:Z

    .line 52
    .line 53
    if-eqz v11, :cond_10

    .line 54
    .line 55
    iget-object v3, v0, Lq41;->F:Lro2;

    .line 56
    .line 57
    iget-object v3, v3, Lro2;->i:Loo2;

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    sget-object v8, Ltv4;->d:Ltv4;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v8, v3, Loo2;->n:Ltv4;

    .line 65
    .line 66
    :goto_2
    if-nez v3, :cond_3

    .line 67
    .line 68
    iget-object v9, v0, Lq41;->r:Lew4;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v9, v3, Loo2;->o:Lew4;

    .line 72
    .line 73
    :goto_3
    iget-object v10, v9, Lew4;->q:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v10, [Lt41;

    .line 76
    .line 77
    new-instance v11, Luw1;

    .line 78
    .line 79
    const/4 v12, 0x4

    .line 80
    invoke-direct {v11, v12}, Lpw1;-><init>(I)V

    .line 81
    .line 82
    .line 83
    array-length v12, v10

    .line 84
    move v13, v7

    .line 85
    move v14, v13

    .line 86
    :goto_4
    if-ge v13, v12, :cond_6

    .line 87
    .line 88
    aget-object v15, v10, v13

    .line 89
    .line 90
    if-eqz v15, :cond_5

    .line 91
    .line 92
    invoke-interface {v15, v7}, Lt41;->g(I)Ltb1;

    .line 93
    .line 94
    .line 95
    move-result-object v15

    .line 96
    iget-object v15, v15, Ltb1;->l:Lqv2;

    .line 97
    .line 98
    if-nez v15, :cond_4

    .line 99
    .line 100
    new-instance v15, Lqv2;

    .line 101
    .line 102
    new-array v6, v7, [Lpv2;

    .line 103
    .line 104
    invoke-direct {v15, v6}, Lqv2;-><init>([Lpv2;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11, v15}, Lpw1;->c(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_4
    invoke-virtual {v11, v15}, Lpw1;->c(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/4 v14, 0x1

    .line 115
    :cond_5
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    if-eqz v14, :cond_7

    .line 119
    .line 120
    invoke-virtual {v11}, Luw1;->f()Lgy3;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    :goto_6
    move-object v10, v6

    .line 125
    goto :goto_7

    .line 126
    :cond_7
    sget-object v6, Lyw1;->o:Lvw1;

    .line 127
    .line 128
    sget-object v6, Lgy3;->r:Lgy3;

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :goto_7
    if-eqz v3, :cond_8

    .line 132
    .line 133
    iget-object v6, v3, Loo2;->g:Lpo2;

    .line 134
    .line 135
    iget-wide v11, v6, Lpo2;->c:J

    .line 136
    .line 137
    cmp-long v11, v11, v4

    .line 138
    .line 139
    if-eqz v11, :cond_8

    .line 140
    .line 141
    invoke-virtual {v6, v4, v5}, Lpo2;->a(J)Lpo2;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    iput-object v6, v3, Loo2;->g:Lpo2;

    .line 146
    .line 147
    :cond_8
    iget-object v3, v0, Lq41;->n:[Lez3;

    .line 148
    .line 149
    iget-object v6, v0, Lq41;->F:Lro2;

    .line 150
    .line 151
    iget-object v11, v6, Lro2;->i:Loo2;

    .line 152
    .line 153
    iget-object v6, v6, Lro2;->j:Loo2;

    .line 154
    .line 155
    if-eq v11, v6, :cond_9

    .line 156
    .line 157
    goto :goto_b

    .line 158
    :cond_9
    if-eqz v11, :cond_f

    .line 159
    .line 160
    iget-object v6, v11, Loo2;->o:Lew4;

    .line 161
    .line 162
    move v11, v7

    .line 163
    move v12, v11

    .line 164
    :goto_8
    array-length v13, v3

    .line 165
    if-ge v11, v13, :cond_c

    .line 166
    .line 167
    invoke-virtual {v6, v11}, Lew4;->n(I)Z

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    if-eqz v13, :cond_b

    .line 172
    .line 173
    aget-object v13, v3, v11

    .line 174
    .line 175
    iget-object v13, v13, Lez3;->e:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v13, Lkq;

    .line 178
    .line 179
    iget v13, v13, Lkq;->o:I

    .line 180
    .line 181
    const/4 v14, 0x1

    .line 182
    if-eq v13, v14, :cond_a

    .line 183
    .line 184
    move v14, v7

    .line 185
    goto :goto_9

    .line 186
    :cond_a
    iget-object v13, v6, Lew4;->p:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v13, [Ldz3;

    .line 189
    .line 190
    aget-object v13, v13, v11

    .line 191
    .line 192
    iget v13, v13, Ldz3;->a:I

    .line 193
    .line 194
    if-eqz v13, :cond_b

    .line 195
    .line 196
    const/4 v12, 0x1

    .line 197
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_c
    const/4 v14, 0x1

    .line 201
    :goto_9
    if-eqz v12, :cond_d

    .line 202
    .line 203
    if-eqz v14, :cond_d

    .line 204
    .line 205
    const/4 v14, 0x1

    .line 206
    goto :goto_a

    .line 207
    :cond_d
    move v14, v7

    .line 208
    :goto_a
    iget-boolean v3, v0, Lq41;->h0:Z

    .line 209
    .line 210
    if-ne v14, v3, :cond_e

    .line 211
    .line 212
    goto :goto_b

    .line 213
    :cond_e
    iput-boolean v14, v0, Lq41;->h0:Z

    .line 214
    .line 215
    if-nez v14, :cond_f

    .line 216
    .line 217
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 218
    .line 219
    iget-boolean v3, v3, Lph3;->p:Z

    .line 220
    .line 221
    if-eqz v3, :cond_f

    .line 222
    .line 223
    iget-object v3, v0, Lq41;->u:Lyp4;

    .line 224
    .line 225
    const/4 v6, 0x2

    .line 226
    invoke-virtual {v3, v6}, Lyp4;->g(I)V

    .line 227
    .line 228
    .line 229
    :cond_f
    :goto_b
    move-object v11, v9

    .line 230
    move-object v12, v10

    .line 231
    move-object v10, v8

    .line 232
    goto :goto_c

    .line 233
    :cond_10
    iget-object v3, v3, Lph3;->b:Lmt2;

    .line 234
    .line 235
    invoke-virtual {v1, v3}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-nez v3, :cond_f

    .line 240
    .line 241
    sget-object v8, Ltv4;->d:Ltv4;

    .line 242
    .line 243
    iget-object v9, v0, Lq41;->r:Lew4;

    .line 244
    .line 245
    sget-object v10, Lgy3;->r:Lgy3;

    .line 246
    .line 247
    goto :goto_b

    .line 248
    :goto_c
    if-eqz p8, :cond_13

    .line 249
    .line 250
    iget-object v3, v0, Lq41;->W:Ln41;

    .line 251
    .line 252
    iget-boolean v6, v3, Ln41;->e:Z

    .line 253
    .line 254
    if-eqz v6, :cond_12

    .line 255
    .line 256
    iget v6, v3, Ln41;->c:I

    .line 257
    .line 258
    const/4 v8, 0x5

    .line 259
    if-eq v6, v8, :cond_12

    .line 260
    .line 261
    if-ne v2, v8, :cond_11

    .line 262
    .line 263
    const/4 v6, 0x1

    .line 264
    goto :goto_d

    .line 265
    :cond_11
    move v6, v7

    .line 266
    :goto_d
    invoke-static {v6}, Lrr2;->l(Z)V

    .line 267
    .line 268
    .line 269
    goto :goto_e

    .line 270
    :cond_12
    const/4 v14, 0x1

    .line 271
    iput-boolean v14, v3, Ln41;->d:Z

    .line 272
    .line 273
    iput-boolean v14, v3, Ln41;->e:Z

    .line 274
    .line 275
    iput v2, v3, Ln41;->c:I

    .line 276
    .line 277
    :cond_13
    :goto_e
    iget-object v2, v0, Lq41;->V:Lph3;

    .line 278
    .line 279
    iget-wide v6, v2, Lph3;->q:J

    .line 280
    .line 281
    invoke-virtual {v0, v6, v7}, Lq41;->q(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v8

    .line 285
    move-wide/from16 v6, p6

    .line 286
    .line 287
    move-object v0, v2

    .line 288
    move-wide/from16 v2, p2

    .line 289
    .line 290
    invoke-virtual/range {v0 .. v12}, Lph3;->d(Lmt2;JJJJLtv4;Lew4;Ljava/util/List;)Lph3;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    return-object v0
.end method

.method public final z0()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 4
    .line 5
    iget-object v1, v1, Lph3;->a:Lcu4;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_54

    .line 12
    .line 13
    iget-object v1, v0, Lq41;->G:Lfo1;

    .line 14
    .line 15
    iget-boolean v1, v1, Lfo1;->a:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2d

    .line 20
    .line 21
    :cond_0
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 22
    .line 23
    iget-wide v2, v0, Lq41;->k0:J

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Lro2;->n(J)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 29
    .line 30
    iget-object v2, v1, Lro2;->l:Loo2;

    .line 31
    .line 32
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v11, 0x1

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v3, v2, Loo2;->g:Lpo2;

    .line 42
    .line 43
    iget-boolean v3, v3, Lpo2;->j:Z

    .line 44
    .line 45
    if-nez v3, :cond_d

    .line 46
    .line 47
    invoke-virtual {v2}, Loo2;->g()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_d

    .line 52
    .line 53
    iget-object v2, v1, Lro2;->l:Loo2;

    .line 54
    .line 55
    iget-object v2, v2, Loo2;->g:Lpo2;

    .line 56
    .line 57
    iget-wide v2, v2, Lpo2;->e:J

    .line 58
    .line 59
    cmp-long v2, v2, v8

    .line 60
    .line 61
    if-eqz v2, :cond_d

    .line 62
    .line 63
    iget v1, v1, Lro2;->n:I

    .line 64
    .line 65
    const/16 v2, 0x64

    .line 66
    .line 67
    if-ge v1, v2, :cond_d

    .line 68
    .line 69
    :cond_1
    iget-object v12, v0, Lq41;->F:Lro2;

    .line 70
    .line 71
    iget-wide v1, v0, Lq41;->k0:J

    .line 72
    .line 73
    iget-object v3, v0, Lq41;->V:Lph3;

    .line 74
    .line 75
    iget-object v4, v12, Lro2;->l:Loo2;

    .line 76
    .line 77
    if-nez v4, :cond_2

    .line 78
    .line 79
    iget-object v13, v3, Lph3;->a:Lcu4;

    .line 80
    .line 81
    iget-object v14, v3, Lph3;->b:Lmt2;

    .line 82
    .line 83
    iget-wide v1, v3, Lph3;->c:J

    .line 84
    .line 85
    iget-wide v3, v3, Lph3;->s:J

    .line 86
    .line 87
    move-wide v15, v1

    .line 88
    move-wide/from16 v17, v3

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Lro2;->e(Lcu4;Lmt2;JJ)Lpo2;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iget-object v3, v3, Lph3;->a:Lcu4;

    .line 96
    .line 97
    invoke-virtual {v12, v3, v4, v1, v2}, Lro2;->d(Lcu4;Loo2;J)Lpo2;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :goto_0
    if-eqz v1, :cond_d

    .line 102
    .line 103
    iget-object v2, v0, Lq41;->F:Lro2;

    .line 104
    .line 105
    iget-object v3, v2, Lro2;->l:Loo2;

    .line 106
    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    const-wide v3, 0xe8d4a51000L

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    :goto_1
    move-wide v14, v3

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    iget-wide v4, v3, Loo2;->p:J

    .line 117
    .line 118
    iget-object v3, v3, Loo2;->g:Lpo2;

    .line 119
    .line 120
    iget-wide v6, v3, Lpo2;->e:J

    .line 121
    .line 122
    add-long/2addr v4, v6

    .line 123
    iget-wide v6, v1, Lpo2;->b:J

    .line 124
    .line 125
    sub-long v3, v4, v6

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :goto_2
    move v3, v10

    .line 129
    :goto_3
    iget-object v4, v2, Lro2;->q:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    const/4 v5, 0x0

    .line 136
    if-ge v3, v4, :cond_6

    .line 137
    .line 138
    iget-object v4, v2, Lro2;->q:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Loo2;

    .line 145
    .line 146
    iget-object v4, v4, Loo2;->g:Lpo2;

    .line 147
    .line 148
    iget-wide v6, v4, Lpo2;->e:J

    .line 149
    .line 150
    iget-wide v12, v1, Lpo2;->e:J

    .line 151
    .line 152
    cmp-long v16, v6, v8

    .line 153
    .line 154
    if-eqz v16, :cond_4

    .line 155
    .line 156
    cmp-long v6, v6, v12

    .line 157
    .line 158
    if-nez v6, :cond_5

    .line 159
    .line 160
    :cond_4
    iget-wide v6, v4, Lpo2;->b:J

    .line 161
    .line 162
    iget-wide v12, v1, Lpo2;->b:J

    .line 163
    .line 164
    cmp-long v6, v6, v12

    .line 165
    .line 166
    if-nez v6, :cond_5

    .line 167
    .line 168
    iget-object v4, v4, Lpo2;->a:Lmt2;

    .line 169
    .line 170
    iget-object v6, v1, Lpo2;->a:Lmt2;

    .line 171
    .line 172
    invoke-virtual {v4, v6}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_5

    .line 177
    .line 178
    iget-object v4, v2, Lro2;->q:Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Loo2;

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    move-object v3, v5

    .line 191
    :goto_4
    if-nez v3, :cond_7

    .line 192
    .line 193
    iget-object v3, v2, Lro2;->e:Lcn;

    .line 194
    .line 195
    iget-object v3, v3, Lcn;->o:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v3, Lq41;

    .line 198
    .line 199
    new-instance v12, Loo2;

    .line 200
    .line 201
    iget-object v13, v3, Lq41;->o:[Lkq;

    .line 202
    .line 203
    iget-object v4, v3, Lq41;->q:Lpn0;

    .line 204
    .line 205
    iget-object v6, v3, Lq41;->s:Lcd2;

    .line 206
    .line 207
    iget-object v7, v3, Lq41;->J:Lik3;

    .line 208
    .line 209
    invoke-interface {v6, v7}, Lcd2;->g(Lik3;)Lr20;

    .line 210
    .line 211
    .line 212
    move-result-object v17

    .line 213
    iget-object v6, v3, Lq41;->G:Lfo1;

    .line 214
    .line 215
    iget-object v7, v3, Lq41;->r:Lew4;

    .line 216
    .line 217
    iget-object v3, v3, Lq41;->q0:Lp31;

    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-object/from16 v19, v1

    .line 223
    .line 224
    move-object/from16 v16, v4

    .line 225
    .line 226
    move-object/from16 v18, v6

    .line 227
    .line 228
    move-object/from16 v20, v7

    .line 229
    .line 230
    invoke-direct/range {v12 .. v20}, Loo2;-><init>([Lkq;JLpn0;Ln9;Lfo1;Lpo2;Lew4;)V

    .line 231
    .line 232
    .line 233
    move-object v3, v12

    .line 234
    goto :goto_5

    .line 235
    :cond_7
    iput-object v1, v3, Loo2;->g:Lpo2;

    .line 236
    .line 237
    iput-wide v14, v3, Loo2;->p:J

    .line 238
    .line 239
    :goto_5
    iget-object v4, v2, Lro2;->l:Loo2;

    .line 240
    .line 241
    if-eqz v4, :cond_9

    .line 242
    .line 243
    iget-object v6, v4, Loo2;->m:Loo2;

    .line 244
    .line 245
    if-ne v3, v6, :cond_8

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_8
    invoke-virtual {v4}, Loo2;->b()V

    .line 249
    .line 250
    .line 251
    iput-object v3, v4, Loo2;->m:Loo2;

    .line 252
    .line 253
    invoke-virtual {v4}, Loo2;->c()V

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_9
    iput-object v3, v2, Lro2;->i:Loo2;

    .line 258
    .line 259
    iput-object v3, v2, Lro2;->j:Loo2;

    .line 260
    .line 261
    iput-object v3, v2, Lro2;->k:Loo2;

    .line 262
    .line 263
    :goto_6
    iput-object v5, v2, Lro2;->o:Ljava/lang/Object;

    .line 264
    .line 265
    iput-object v3, v2, Lro2;->l:Loo2;

    .line 266
    .line 267
    iget v4, v2, Lro2;->n:I

    .line 268
    .line 269
    add-int/2addr v4, v11

    .line 270
    iput v4, v2, Lro2;->n:I

    .line 271
    .line 272
    invoke-virtual {v2}, Lro2;->m()V

    .line 273
    .line 274
    .line 275
    iget-boolean v2, v3, Loo2;->d:Z

    .line 276
    .line 277
    if-nez v2, :cond_a

    .line 278
    .line 279
    iget-wide v4, v1, Lpo2;->b:J

    .line 280
    .line 281
    iput-boolean v11, v3, Loo2;->d:Z

    .line 282
    .line 283
    iget-object v2, v3, Loo2;->a:Lno2;

    .line 284
    .line 285
    invoke-interface {v2, v0, v4, v5}, Lno2;->m(Lmo2;J)V

    .line 286
    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_a
    iget-boolean v2, v3, Loo2;->e:Z

    .line 290
    .line 291
    if-eqz v2, :cond_b

    .line 292
    .line 293
    iget-object v2, v0, Lq41;->u:Lyp4;

    .line 294
    .line 295
    const/16 v4, 0x8

    .line 296
    .line 297
    iget-object v5, v3, Loo2;->a:Lno2;

    .line 298
    .line 299
    invoke-virtual {v2, v4, v5}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v2}, Lxp4;->b()V

    .line 304
    .line 305
    .line 306
    :cond_b
    :goto_7
    iget-object v2, v0, Lq41;->F:Lro2;

    .line 307
    .line 308
    iget-object v2, v2, Lro2;->i:Loo2;

    .line 309
    .line 310
    if-ne v2, v3, :cond_c

    .line 311
    .line 312
    iget-wide v1, v1, Lpo2;->b:J

    .line 313
    .line 314
    invoke-virtual {v0, v11, v1, v2}, Lq41;->R(ZJ)V

    .line 315
    .line 316
    .line 317
    :cond_c
    invoke-virtual {v0, v10}, Lq41;->v(Z)V

    .line 318
    .line 319
    .line 320
    :cond_d
    iget-boolean v1, v0, Lq41;->c0:Z

    .line 321
    .line 322
    if-eqz v1, :cond_e

    .line 323
    .line 324
    iget-object v1, v0, Lq41;->F:Lro2;

    .line 325
    .line 326
    iget-object v1, v1, Lro2;->l:Loo2;

    .line 327
    .line 328
    invoke-static {v1}, Lq41;->A(Loo2;)Z

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    iput-boolean v1, v0, Lq41;->c0:Z

    .line 333
    .line 334
    invoke-virtual {v0}, Lq41;->w0()V

    .line 335
    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_e
    invoke-virtual {v0}, Lq41;->D()V

    .line 339
    .line 340
    .line 341
    :goto_8
    iget-object v6, v0, Lq41;->F:Lro2;

    .line 342
    .line 343
    iget-boolean v1, v0, Lq41;->Z:Z

    .line 344
    .line 345
    const-wide/32 v12, 0x989680

    .line 346
    .line 347
    .line 348
    const/4 v14, 0x4

    .line 349
    if-nez v1, :cond_17

    .line 350
    .line 351
    iget-boolean v1, v0, Lq41;->M:Z

    .line 352
    .line 353
    if-eqz v1, :cond_17

    .line 354
    .line 355
    iget-boolean v1, v0, Lq41;->s0:Z

    .line 356
    .line 357
    if-nez v1, :cond_17

    .line 358
    .line 359
    invoke-virtual {v0}, Lq41;->f()Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-eqz v1, :cond_f

    .line 364
    .line 365
    goto/16 :goto_c

    .line 366
    .line 367
    :cond_f
    iget-object v1, v6, Lro2;->k:Loo2;

    .line 368
    .line 369
    if-eqz v1, :cond_17

    .line 370
    .line 371
    iget-object v2, v6, Lro2;->j:Loo2;

    .line 372
    .line 373
    if-ne v1, v2, :cond_17

    .line 374
    .line 375
    iget-object v1, v1, Loo2;->m:Loo2;

    .line 376
    .line 377
    if-eqz v1, :cond_17

    .line 378
    .line 379
    iget-boolean v2, v1, Loo2;->e:Z

    .line 380
    .line 381
    if-nez v2, :cond_10

    .line 382
    .line 383
    goto/16 :goto_c

    .line 384
    .line 385
    :cond_10
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1}, Loo2;->e()J

    .line 389
    .line 390
    .line 391
    move-result-wide v1

    .line 392
    iget-wide v3, v0, Lq41;->k0:J

    .line 393
    .line 394
    sub-long/2addr v1, v3

    .line 395
    long-to-float v1, v1

    .line 396
    iget-object v2, v0, Lq41;->B:Lxl0;

    .line 397
    .line 398
    invoke-virtual {v2}, Lxl0;->i()Lqh3;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    iget v2, v2, Lqh3;->a:F

    .line 403
    .line 404
    div-float/2addr v1, v2

    .line 405
    float-to-long v1, v1

    .line 406
    cmp-long v1, v1, v12

    .line 407
    .line 408
    if-lez v1, :cond_11

    .line 409
    .line 410
    goto/16 :goto_c

    .line 411
    .line 412
    :cond_11
    iget-object v1, v6, Lro2;->k:Loo2;

    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    iget-object v1, v1, Loo2;->m:Loo2;

    .line 418
    .line 419
    iput-object v1, v6, Lro2;->k:Loo2;

    .line 420
    .line 421
    invoke-virtual {v6}, Lro2;->m()V

    .line 422
    .line 423
    .line 424
    iget-object v1, v6, Lro2;->k:Loo2;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    iget-object v1, v0, Lq41;->n:[Lez3;

    .line 430
    .line 431
    iget-object v2, v6, Lro2;->k:Loo2;

    .line 432
    .line 433
    if-nez v2, :cond_12

    .line 434
    .line 435
    goto/16 :goto_c

    .line 436
    .line 437
    :cond_12
    iget-object v3, v2, Loo2;->o:Lew4;

    .line 438
    .line 439
    move-object v4, v2

    .line 440
    move v2, v10

    .line 441
    :goto_9
    array-length v5, v1

    .line 442
    if-ge v2, v5, :cond_16

    .line 443
    .line 444
    invoke-virtual {v3, v2}, Lew4;->n(I)Z

    .line 445
    .line 446
    .line 447
    move-result v5

    .line 448
    if-eqz v5, :cond_15

    .line 449
    .line 450
    aget-object v5, v1, v2

    .line 451
    .line 452
    iget-object v7, v5, Lez3;->f:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v7, Lkq;

    .line 455
    .line 456
    if-eqz v7, :cond_15

    .line 457
    .line 458
    invoke-virtual {v5}, Lez3;->f()Z

    .line 459
    .line 460
    .line 461
    move-result v5

    .line 462
    if-nez v5, :cond_15

    .line 463
    .line 464
    aget-object v5, v1, v2

    .line 465
    .line 466
    invoke-virtual {v5}, Lez3;->f()Z

    .line 467
    .line 468
    .line 469
    move-result v7

    .line 470
    xor-int/2addr v7, v11

    .line 471
    invoke-static {v7}, Lrr2;->w(Z)V

    .line 472
    .line 473
    .line 474
    iget-object v7, v5, Lez3;->e:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v7, Lkq;

    .line 477
    .line 478
    invoke-static {v7}, Lez3;->h(Lkq;)Z

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    if-eqz v7, :cond_13

    .line 483
    .line 484
    const/4 v7, 0x3

    .line 485
    goto :goto_a

    .line 486
    :cond_13
    iget-object v7, v5, Lez3;->f:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v7, Lkq;

    .line 489
    .line 490
    if-eqz v7, :cond_14

    .line 491
    .line 492
    iget v7, v7, Lkq;->u:I

    .line 493
    .line 494
    if-eqz v7, :cond_14

    .line 495
    .line 496
    move v7, v14

    .line 497
    goto :goto_a

    .line 498
    :cond_14
    const/4 v7, 0x2

    .line 499
    :goto_a
    iput v7, v5, Lez3;->d:I

    .line 500
    .line 501
    move-object v5, v3

    .line 502
    const/4 v3, 0x0

    .line 503
    move-object v7, v1

    .line 504
    move-object v1, v4

    .line 505
    move-object/from16 v17, v5

    .line 506
    .line 507
    invoke-virtual {v1}, Loo2;->e()J

    .line 508
    .line 509
    .line 510
    move-result-wide v4

    .line 511
    invoke-virtual/range {v0 .. v5}, Lq41;->l(Loo2;IZJ)V

    .line 512
    .line 513
    .line 514
    goto :goto_b

    .line 515
    :cond_15
    move-object v7, v1

    .line 516
    move-object/from16 v17, v3

    .line 517
    .line 518
    move-object v1, v4

    .line 519
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 520
    .line 521
    move-object v4, v1

    .line 522
    move-object v1, v7

    .line 523
    move-object/from16 v3, v17

    .line 524
    .line 525
    goto :goto_9

    .line 526
    :cond_16
    move-object v1, v4

    .line 527
    invoke-virtual {v0}, Lq41;->f()Z

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    if-eqz v2, :cond_17

    .line 532
    .line 533
    iget-object v2, v1, Loo2;->a:Lno2;

    .line 534
    .line 535
    invoke-interface {v2}, Lno2;->l()J

    .line 536
    .line 537
    .line 538
    move-result-wide v2

    .line 539
    iput-wide v2, v0, Lq41;->r0:J

    .line 540
    .line 541
    invoke-virtual {v1}, Loo2;->g()Z

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    if-nez v2, :cond_17

    .line 546
    .line 547
    invoke-virtual {v6, v1}, Lro2;->o(Loo2;)I

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v10}, Lq41;->v(Z)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0}, Lq41;->D()V

    .line 554
    .line 555
    .line 556
    :cond_17
    :goto_c
    iget-boolean v1, v0, Lq41;->M:Z

    .line 557
    .line 558
    iget-object v2, v0, Lq41;->n:[Lez3;

    .line 559
    .line 560
    iget-object v3, v0, Lq41;->F:Lro2;

    .line 561
    .line 562
    iget-object v4, v3, Lro2;->j:Loo2;

    .line 563
    .line 564
    if-nez v4, :cond_19

    .line 565
    .line 566
    :cond_18
    :goto_d
    const/4 v10, 0x2

    .line 567
    goto/16 :goto_1b

    .line 568
    .line 569
    :cond_19
    iget-object v5, v4, Loo2;->m:Loo2;

    .line 570
    .line 571
    if-eqz v5, :cond_1a

    .line 572
    .line 573
    iget-boolean v5, v0, Lq41;->Z:Z

    .line 574
    .line 575
    if-eqz v5, :cond_1b

    .line 576
    .line 577
    :cond_1a
    move-object v11, v2

    .line 578
    const/4 v10, 0x2

    .line 579
    goto/16 :goto_18

    .line 580
    .line 581
    :cond_1b
    iget-boolean v5, v4, Loo2;->e:Z

    .line 582
    .line 583
    if-nez v5, :cond_1c

    .line 584
    .line 585
    goto :goto_d

    .line 586
    :cond_1c
    move v5, v10

    .line 587
    :goto_e
    array-length v6, v2

    .line 588
    if-ge v5, v6, :cond_1d

    .line 589
    .line 590
    aget-object v6, v2, v5

    .line 591
    .line 592
    iget-object v7, v6, Lez3;->e:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v7, Lkq;

    .line 595
    .line 596
    invoke-virtual {v6, v4, v7}, Lez3;->e(Loo2;Lkq;)Z

    .line 597
    .line 598
    .line 599
    move-result v7

    .line 600
    if-eqz v7, :cond_18

    .line 601
    .line 602
    iget-object v7, v6, Lez3;->f:Ljava/lang/Object;

    .line 603
    .line 604
    check-cast v7, Lkq;

    .line 605
    .line 606
    invoke-virtual {v6, v4, v7}, Lez3;->e(Loo2;Lkq;)Z

    .line 607
    .line 608
    .line 609
    move-result v6

    .line 610
    if-eqz v6, :cond_18

    .line 611
    .line 612
    add-int/lit8 v5, v5, 0x1

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :cond_1d
    invoke-virtual {v0}, Lq41;->f()Z

    .line 616
    .line 617
    .line 618
    move-result v5

    .line 619
    if-eqz v5, :cond_1e

    .line 620
    .line 621
    iget-object v5, v3, Lro2;->k:Loo2;

    .line 622
    .line 623
    iget-object v6, v3, Lro2;->j:Loo2;

    .line 624
    .line 625
    if-ne v5, v6, :cond_1e

    .line 626
    .line 627
    goto :goto_d

    .line 628
    :cond_1e
    iget-object v5, v4, Loo2;->m:Loo2;

    .line 629
    .line 630
    iget-boolean v6, v5, Loo2;->e:Z

    .line 631
    .line 632
    if-nez v6, :cond_1f

    .line 633
    .line 634
    iget-wide v6, v0, Lq41;->k0:J

    .line 635
    .line 636
    invoke-virtual {v5}, Loo2;->e()J

    .line 637
    .line 638
    .line 639
    move-result-wide v17

    .line 640
    cmp-long v5, v6, v17

    .line 641
    .line 642
    if-gez v5, :cond_1f

    .line 643
    .line 644
    goto :goto_d

    .line 645
    :cond_1f
    iget-object v5, v4, Loo2;->m:Loo2;

    .line 646
    .line 647
    iget-boolean v6, v5, Loo2;->e:Z

    .line 648
    .line 649
    if-eqz v6, :cond_20

    .line 650
    .line 651
    invoke-static {v6}, Lrr2;->w(Z)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v5}, Loo2;->e()J

    .line 655
    .line 656
    .line 657
    move-result-wide v5

    .line 658
    move-wide/from16 v17, v12

    .line 659
    .line 660
    iget-wide v12, v0, Lq41;->k0:J

    .line 661
    .line 662
    sub-long/2addr v5, v12

    .line 663
    long-to-float v5, v5

    .line 664
    iget-object v6, v0, Lq41;->B:Lxl0;

    .line 665
    .line 666
    invoke-virtual {v6}, Lxl0;->i()Lqh3;

    .line 667
    .line 668
    .line 669
    move-result-object v6

    .line 670
    iget v6, v6, Lqh3;->a:F

    .line 671
    .line 672
    div-float/2addr v5, v6

    .line 673
    float-to-long v5, v5

    .line 674
    cmp-long v5, v5, v17

    .line 675
    .line 676
    if-lez v5, :cond_20

    .line 677
    .line 678
    goto :goto_d

    .line 679
    :cond_20
    iget-object v12, v4, Loo2;->o:Lew4;

    .line 680
    .line 681
    iget-object v5, v3, Lro2;->k:Loo2;

    .line 682
    .line 683
    iget-object v6, v3, Lro2;->j:Loo2;

    .line 684
    .line 685
    if-ne v5, v6, :cond_21

    .line 686
    .line 687
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    iget-object v5, v6, Loo2;->m:Loo2;

    .line 691
    .line 692
    iput-object v5, v3, Lro2;->k:Loo2;

    .line 693
    .line 694
    :cond_21
    iget-object v5, v3, Lro2;->j:Loo2;

    .line 695
    .line 696
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    iget-object v5, v5, Loo2;->m:Loo2;

    .line 700
    .line 701
    iput-object v5, v3, Lro2;->j:Loo2;

    .line 702
    .line 703
    invoke-virtual {v3}, Lro2;->m()V

    .line 704
    .line 705
    .line 706
    iget-object v13, v3, Lro2;->j:Loo2;

    .line 707
    .line 708
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    iget-object v5, v13, Loo2;->o:Lew4;

    .line 712
    .line 713
    iget-object v6, v0, Lq41;->V:Lph3;

    .line 714
    .line 715
    iget-object v6, v6, Lph3;->a:Lcu4;

    .line 716
    .line 717
    iget-object v7, v13, Loo2;->g:Lpo2;

    .line 718
    .line 719
    iget-object v7, v7, Lpo2;->a:Lmt2;

    .line 720
    .line 721
    iget-object v4, v4, Loo2;->g:Lpo2;

    .line 722
    .line 723
    iget-object v4, v4, Lpo2;->a:Lmt2;

    .line 724
    .line 725
    move/from16 v18, v1

    .line 726
    .line 727
    move-object/from16 v17, v5

    .line 728
    .line 729
    move-object v1, v6

    .line 730
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    move-object/from16 v19, v2

    .line 736
    .line 737
    move-object v2, v7

    .line 738
    const/4 v7, 0x0

    .line 739
    move-object/from16 v20, v3

    .line 740
    .line 741
    move-object v3, v1

    .line 742
    move-object/from16 v15, v17

    .line 743
    .line 744
    move-object/from16 v11, v19

    .line 745
    .line 746
    move-object/from16 v10, v20

    .line 747
    .line 748
    invoke-virtual/range {v0 .. v7}, Lq41;->C0(Lcu4;Lmt2;Lcu4;Lmt2;JZ)V

    .line 749
    .line 750
    .line 751
    iget-boolean v1, v13, Loo2;->e:Z

    .line 752
    .line 753
    const/4 v2, -0x2

    .line 754
    if-eqz v1, :cond_2d

    .line 755
    .line 756
    if-eqz v18, :cond_22

    .line 757
    .line 758
    iget-wide v3, v0, Lq41;->r0:J

    .line 759
    .line 760
    cmp-long v1, v3, v8

    .line 761
    .line 762
    if-nez v1, :cond_23

    .line 763
    .line 764
    :cond_22
    iget-object v1, v13, Loo2;->a:Lno2;

    .line 765
    .line 766
    invoke-interface {v1}, Lno2;->l()J

    .line 767
    .line 768
    .line 769
    move-result-wide v3

    .line 770
    cmp-long v1, v3, v8

    .line 771
    .line 772
    if-eqz v1, :cond_2d

    .line 773
    .line 774
    :cond_23
    iput-wide v8, v0, Lq41;->r0:J

    .line 775
    .line 776
    if-eqz v18, :cond_24

    .line 777
    .line 778
    iget-boolean v1, v0, Lq41;->s0:Z

    .line 779
    .line 780
    if-nez v1, :cond_24

    .line 781
    .line 782
    const/4 v1, 0x1

    .line 783
    goto :goto_f

    .line 784
    :cond_24
    const/4 v1, 0x0

    .line 785
    :goto_f
    if-eqz v1, :cond_27

    .line 786
    .line 787
    const/4 v3, 0x0

    .line 788
    :goto_10
    array-length v4, v11

    .line 789
    if-ge v3, v4, :cond_27

    .line 790
    .line 791
    invoke-virtual {v15, v3}, Lew4;->n(I)Z

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    iget-object v5, v15, Lew4;->q:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v5, [Lt41;

    .line 798
    .line 799
    if-eqz v4, :cond_26

    .line 800
    .line 801
    aget-object v4, v11, v3

    .line 802
    .line 803
    iget-object v4, v4, Lez3;->e:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v4, Lkq;

    .line 806
    .line 807
    iget v4, v4, Lkq;->o:I

    .line 808
    .line 809
    if-ne v4, v2, :cond_25

    .line 810
    .line 811
    goto :goto_11

    .line 812
    :cond_25
    aget-object v4, v5, v3

    .line 813
    .line 814
    invoke-interface {v4}, Lt41;->m()Ltb1;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    iget-object v4, v4, Ltb1;->n:Ljava/lang/String;

    .line 819
    .line 820
    aget-object v5, v5, v3

    .line 821
    .line 822
    invoke-interface {v5}, Lt41;->m()Ltb1;

    .line 823
    .line 824
    .line 825
    move-result-object v5

    .line 826
    iget-object v5, v5, Ltb1;->k:Ljava/lang/String;

    .line 827
    .line 828
    invoke-static {v4, v5}, Llw2;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 829
    .line 830
    .line 831
    move-result v4

    .line 832
    if-nez v4, :cond_26

    .line 833
    .line 834
    aget-object v4, v11, v3

    .line 835
    .line 836
    invoke-virtual {v4}, Lez3;->f()Z

    .line 837
    .line 838
    .line 839
    move-result v4

    .line 840
    if-nez v4, :cond_26

    .line 841
    .line 842
    const/4 v1, 0x0

    .line 843
    goto :goto_12

    .line 844
    :cond_26
    :goto_11
    add-int/lit8 v3, v3, 0x1

    .line 845
    .line 846
    goto :goto_10

    .line 847
    :cond_27
    :goto_12
    if-nez v1, :cond_2d

    .line 848
    .line 849
    invoke-virtual {v13}, Loo2;->e()J

    .line 850
    .line 851
    .line 852
    move-result-wide v1

    .line 853
    array-length v3, v11

    .line 854
    const/4 v4, 0x0

    .line 855
    :goto_13
    if-ge v4, v3, :cond_2b

    .line 856
    .line 857
    aget-object v5, v11, v4

    .line 858
    .line 859
    iget-object v6, v5, Lez3;->f:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v6, Lkq;

    .line 862
    .line 863
    iget-object v7, v5, Lez3;->e:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast v7, Lkq;

    .line 866
    .line 867
    invoke-static {v7}, Lez3;->h(Lkq;)Z

    .line 868
    .line 869
    .line 870
    move-result v8

    .line 871
    if-eqz v8, :cond_28

    .line 872
    .line 873
    iget v8, v5, Lez3;->d:I

    .line 874
    .line 875
    if-eq v8, v14, :cond_28

    .line 876
    .line 877
    const/4 v9, 0x2

    .line 878
    if-eq v8, v9, :cond_29

    .line 879
    .line 880
    invoke-static {v7, v1, v2}, Lez3;->l(Lkq;J)V

    .line 881
    .line 882
    .line 883
    goto :goto_14

    .line 884
    :cond_28
    const/4 v9, 0x2

    .line 885
    :cond_29
    :goto_14
    if-eqz v6, :cond_2a

    .line 886
    .line 887
    iget v7, v6, Lkq;->u:I

    .line 888
    .line 889
    if-eqz v7, :cond_2a

    .line 890
    .line 891
    iget v5, v5, Lez3;->d:I

    .line 892
    .line 893
    const/4 v7, 0x3

    .line 894
    if-eq v5, v7, :cond_2a

    .line 895
    .line 896
    invoke-static {v6, v1, v2}, Lez3;->l(Lkq;J)V

    .line 897
    .line 898
    .line 899
    :cond_2a
    add-int/lit8 v4, v4, 0x1

    .line 900
    .line 901
    goto :goto_13

    .line 902
    :cond_2b
    const/4 v9, 0x2

    .line 903
    invoke-virtual {v13}, Loo2;->g()Z

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    if-nez v1, :cond_2c

    .line 908
    .line 909
    invoke-virtual {v10, v13}, Lro2;->o(Loo2;)I

    .line 910
    .line 911
    .line 912
    const/4 v1, 0x0

    .line 913
    invoke-virtual {v0, v1}, Lq41;->v(Z)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v0}, Lq41;->D()V

    .line 917
    .line 918
    .line 919
    :cond_2c
    move v10, v9

    .line 920
    goto/16 :goto_1b

    .line 921
    .line 922
    :cond_2d
    const/4 v9, 0x2

    .line 923
    array-length v1, v11

    .line 924
    const/4 v3, 0x0

    .line 925
    :goto_15
    if-ge v3, v1, :cond_2c

    .line 926
    .line 927
    aget-object v4, v11, v3

    .line 928
    .line 929
    invoke-virtual {v13}, Loo2;->e()J

    .line 930
    .line 931
    .line 932
    move-result-wide v5

    .line 933
    iget-object v7, v4, Lez3;->e:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v7, Lkq;

    .line 936
    .line 937
    iget v8, v4, Lez3;->c:I

    .line 938
    .line 939
    invoke-virtual {v12, v8}, Lew4;->n(I)Z

    .line 940
    .line 941
    .line 942
    move-result v10

    .line 943
    invoke-virtual {v15, v8}, Lew4;->n(I)Z

    .line 944
    .line 945
    .line 946
    move-result v18

    .line 947
    iget-object v9, v4, Lez3;->f:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v9, Lkq;

    .line 950
    .line 951
    if-eqz v9, :cond_2e

    .line 952
    .line 953
    iget v14, v4, Lez3;->d:I

    .line 954
    .line 955
    const/4 v2, 0x3

    .line 956
    if-eq v14, v2, :cond_2e

    .line 957
    .line 958
    if-nez v14, :cond_2f

    .line 959
    .line 960
    invoke-static {v7}, Lez3;->h(Lkq;)Z

    .line 961
    .line 962
    .line 963
    move-result v2

    .line 964
    if-eqz v2, :cond_2f

    .line 965
    .line 966
    :cond_2e
    move-object v9, v7

    .line 967
    :cond_2f
    if-eqz v10, :cond_32

    .line 968
    .line 969
    iget-boolean v2, v9, Lkq;->A:Z

    .line 970
    .line 971
    if-nez v2, :cond_32

    .line 972
    .line 973
    iget v2, v7, Lkq;->o:I

    .line 974
    .line 975
    const/4 v7, -0x2

    .line 976
    if-ne v2, v7, :cond_30

    .line 977
    .line 978
    const/4 v2, 0x1

    .line 979
    goto :goto_16

    .line 980
    :cond_30
    const/4 v2, 0x0

    .line 981
    :goto_16
    iget-object v10, v12, Lew4;->p:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast v10, [Ldz3;

    .line 984
    .line 985
    aget-object v10, v10, v8

    .line 986
    .line 987
    iget-object v14, v15, Lew4;->p:Ljava/lang/Object;

    .line 988
    .line 989
    check-cast v14, [Ldz3;

    .line 990
    .line 991
    aget-object v8, v14, v8

    .line 992
    .line 993
    if-eqz v18, :cond_31

    .line 994
    .line 995
    invoke-static {v8, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    move-result v8

    .line 999
    if-eqz v8, :cond_31

    .line 1000
    .line 1001
    if-nez v2, :cond_31

    .line 1002
    .line 1003
    invoke-virtual {v4}, Lez3;->f()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v2

    .line 1007
    if-eqz v2, :cond_33

    .line 1008
    .line 1009
    :cond_31
    invoke-static {v9, v5, v6}, Lez3;->l(Lkq;J)V

    .line 1010
    .line 1011
    .line 1012
    goto :goto_17

    .line 1013
    :cond_32
    const/4 v7, -0x2

    .line 1014
    :cond_33
    :goto_17
    add-int/lit8 v3, v3, 0x1

    .line 1015
    .line 1016
    move v2, v7

    .line 1017
    const/4 v9, 0x2

    .line 1018
    const/4 v14, 0x4

    .line 1019
    goto :goto_15

    .line 1020
    :goto_18
    iget-object v1, v4, Loo2;->g:Lpo2;

    .line 1021
    .line 1022
    iget-boolean v1, v1, Lpo2;->j:Z

    .line 1023
    .line 1024
    if-nez v1, :cond_34

    .line 1025
    .line 1026
    iget-boolean v1, v0, Lq41;->Z:Z

    .line 1027
    .line 1028
    if-eqz v1, :cond_37

    .line 1029
    .line 1030
    :cond_34
    array-length v1, v11

    .line 1031
    const/4 v2, 0x0

    .line 1032
    :goto_19
    if-ge v2, v1, :cond_37

    .line 1033
    .line 1034
    aget-object v3, v11, v2

    .line 1035
    .line 1036
    invoke-virtual {v3, v4}, Lez3;->d(Loo2;)Lkq;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v5

    .line 1040
    if-eqz v5, :cond_36

    .line 1041
    .line 1042
    invoke-virtual {v3, v4}, Lez3;->d(Loo2;)Lkq;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v5

    .line 1046
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v5}, Lkq;->l()Z

    .line 1050
    .line 1051
    .line 1052
    move-result v5

    .line 1053
    if-eqz v5, :cond_36

    .line 1054
    .line 1055
    iget-object v5, v4, Loo2;->g:Lpo2;

    .line 1056
    .line 1057
    iget-wide v5, v5, Lpo2;->e:J

    .line 1058
    .line 1059
    cmp-long v7, v5, v8

    .line 1060
    .line 1061
    if-eqz v7, :cond_35

    .line 1062
    .line 1063
    const-wide/high16 v12, -0x8000000000000000L

    .line 1064
    .line 1065
    cmp-long v7, v5, v12

    .line 1066
    .line 1067
    if-eqz v7, :cond_35

    .line 1068
    .line 1069
    iget-wide v12, v4, Loo2;->p:J

    .line 1070
    .line 1071
    add-long/2addr v12, v5

    .line 1072
    goto :goto_1a

    .line 1073
    :cond_35
    move-wide v12, v8

    .line 1074
    :goto_1a
    invoke-virtual {v3, v4}, Lez3;->d(Loo2;)Lkq;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v3

    .line 1078
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    invoke-static {v3, v12, v13}, Lez3;->l(Lkq;J)V

    .line 1082
    .line 1083
    .line 1084
    :cond_36
    add-int/lit8 v2, v2, 0x1

    .line 1085
    .line 1086
    goto :goto_19

    .line 1087
    :cond_37
    :goto_1b
    iget-object v6, v0, Lq41;->F:Lro2;

    .line 1088
    .line 1089
    iget-object v1, v6, Lro2;->j:Loo2;

    .line 1090
    .line 1091
    if-eqz v1, :cond_41

    .line 1092
    .line 1093
    iget-object v2, v6, Lro2;->i:Loo2;

    .line 1094
    .line 1095
    if-eq v2, v1, :cond_41

    .line 1096
    .line 1097
    iget-boolean v2, v1, Loo2;->h:Z

    .line 1098
    .line 1099
    if-eqz v2, :cond_38

    .line 1100
    .line 1101
    goto/16 :goto_21

    .line 1102
    .line 1103
    :cond_38
    iget-object v7, v0, Lq41;->n:[Lez3;

    .line 1104
    .line 1105
    iget-object v8, v1, Loo2;->o:Lew4;

    .line 1106
    .line 1107
    const/4 v2, 0x0

    .line 1108
    const/4 v9, 0x1

    .line 1109
    :goto_1c
    array-length v3, v7

    .line 1110
    if-ge v2, v3, :cond_3d

    .line 1111
    .line 1112
    aget-object v3, v7, v2

    .line 1113
    .line 1114
    invoke-virtual {v3}, Lez3;->c()I

    .line 1115
    .line 1116
    .line 1117
    move-result v3

    .line 1118
    aget-object v4, v7, v2

    .line 1119
    .line 1120
    iget-object v5, v0, Lq41;->B:Lxl0;

    .line 1121
    .line 1122
    iget-object v11, v4, Lez3;->e:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v11, Lkq;

    .line 1125
    .line 1126
    invoke-virtual {v4, v11, v1, v8, v5}, Lez3;->j(Lkq;Loo2;Lew4;Lxl0;)I

    .line 1127
    .line 1128
    .line 1129
    move-result v11

    .line 1130
    iget-object v12, v4, Lez3;->f:Ljava/lang/Object;

    .line 1131
    .line 1132
    check-cast v12, Lkq;

    .line 1133
    .line 1134
    invoke-virtual {v4, v12, v1, v8, v5}, Lez3;->j(Lkq;Loo2;Lew4;Lxl0;)I

    .line 1135
    .line 1136
    .line 1137
    move-result v4

    .line 1138
    const/4 v5, 0x1

    .line 1139
    if-ne v11, v5, :cond_39

    .line 1140
    .line 1141
    move v11, v4

    .line 1142
    :cond_39
    and-int/lit8 v4, v11, 0x2

    .line 1143
    .line 1144
    if-eqz v4, :cond_3b

    .line 1145
    .line 1146
    iget-boolean v4, v0, Lq41;->h0:Z

    .line 1147
    .line 1148
    if-eqz v4, :cond_3b

    .line 1149
    .line 1150
    if-nez v4, :cond_3a

    .line 1151
    .line 1152
    goto :goto_1d

    .line 1153
    :cond_3a
    const/4 v4, 0x0

    .line 1154
    iput-boolean v4, v0, Lq41;->h0:Z

    .line 1155
    .line 1156
    iget-object v4, v0, Lq41;->V:Lph3;

    .line 1157
    .line 1158
    iget-boolean v4, v4, Lph3;->p:Z

    .line 1159
    .line 1160
    if-eqz v4, :cond_3b

    .line 1161
    .line 1162
    iget-object v4, v0, Lq41;->u:Lyp4;

    .line 1163
    .line 1164
    invoke-virtual {v4, v10}, Lyp4;->g(I)V

    .line 1165
    .line 1166
    .line 1167
    :cond_3b
    :goto_1d
    iget v4, v0, Lq41;->i0:I

    .line 1168
    .line 1169
    aget-object v5, v7, v2

    .line 1170
    .line 1171
    invoke-virtual {v5}, Lez3;->c()I

    .line 1172
    .line 1173
    .line 1174
    move-result v5

    .line 1175
    sub-int/2addr v3, v5

    .line 1176
    sub-int/2addr v4, v3

    .line 1177
    iput v4, v0, Lq41;->i0:I

    .line 1178
    .line 1179
    and-int/lit8 v3, v11, 0x1

    .line 1180
    .line 1181
    if-eqz v3, :cond_3c

    .line 1182
    .line 1183
    const/4 v3, 0x1

    .line 1184
    goto :goto_1e

    .line 1185
    :cond_3c
    const/4 v3, 0x0

    .line 1186
    :goto_1e
    and-int/2addr v9, v3

    .line 1187
    add-int/lit8 v2, v2, 0x1

    .line 1188
    .line 1189
    goto :goto_1c

    .line 1190
    :cond_3d
    if-eqz v9, :cond_40

    .line 1191
    .line 1192
    const/4 v2, 0x0

    .line 1193
    :goto_1f
    array-length v3, v7

    .line 1194
    if-ge v2, v3, :cond_40

    .line 1195
    .line 1196
    invoke-virtual {v8, v2}, Lew4;->n(I)Z

    .line 1197
    .line 1198
    .line 1199
    move-result v3

    .line 1200
    if-eqz v3, :cond_3f

    .line 1201
    .line 1202
    aget-object v3, v7, v2

    .line 1203
    .line 1204
    invoke-virtual {v3, v1}, Lez3;->d(Loo2;)Lkq;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v3

    .line 1208
    if-eqz v3, :cond_3e

    .line 1209
    .line 1210
    goto :goto_20

    .line 1211
    :cond_3e
    const/4 v3, 0x0

    .line 1212
    invoke-virtual {v1}, Loo2;->e()J

    .line 1213
    .line 1214
    .line 1215
    move-result-wide v4

    .line 1216
    invoke-virtual/range {v0 .. v5}, Lq41;->l(Loo2;IZJ)V

    .line 1217
    .line 1218
    .line 1219
    :cond_3f
    :goto_20
    add-int/lit8 v2, v2, 0x1

    .line 1220
    .line 1221
    goto :goto_1f

    .line 1222
    :cond_40
    if-eqz v9, :cond_41

    .line 1223
    .line 1224
    iget-object v1, v6, Lro2;->j:Loo2;

    .line 1225
    .line 1226
    const/4 v5, 0x1

    .line 1227
    iput-boolean v5, v1, Loo2;->h:Z

    .line 1228
    .line 1229
    :cond_41
    :goto_21
    iget-object v11, v0, Lq41;->n:[Lez3;

    .line 1230
    .line 1231
    iget-object v12, v0, Lq41;->F:Lro2;

    .line 1232
    .line 1233
    const/4 v1, 0x0

    .line 1234
    :goto_22
    invoke-virtual {v0}, Lq41;->r0()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v2

    .line 1238
    if-nez v2, :cond_42

    .line 1239
    .line 1240
    goto/16 :goto_2c

    .line 1241
    .line 1242
    :cond_42
    iget-boolean v2, v0, Lq41;->Z:Z

    .line 1243
    .line 1244
    if-eqz v2, :cond_43

    .line 1245
    .line 1246
    goto/16 :goto_2c

    .line 1247
    .line 1248
    :cond_43
    iget-object v2, v12, Lro2;->i:Loo2;

    .line 1249
    .line 1250
    if-nez v2, :cond_44

    .line 1251
    .line 1252
    goto/16 :goto_2c

    .line 1253
    .line 1254
    :cond_44
    iget-object v2, v2, Loo2;->m:Loo2;

    .line 1255
    .line 1256
    if-eqz v2, :cond_53

    .line 1257
    .line 1258
    iget-wide v3, v0, Lq41;->k0:J

    .line 1259
    .line 1260
    invoke-virtual {v2}, Loo2;->e()J

    .line 1261
    .line 1262
    .line 1263
    move-result-wide v5

    .line 1264
    cmp-long v3, v3, v5

    .line 1265
    .line 1266
    if-ltz v3, :cond_53

    .line 1267
    .line 1268
    iget-boolean v2, v2, Loo2;->h:Z

    .line 1269
    .line 1270
    if-eqz v2, :cond_53

    .line 1271
    .line 1272
    if-eqz v1, :cond_45

    .line 1273
    .line 1274
    invoke-virtual {v0}, Lq41;->F()V

    .line 1275
    .line 1276
    .line 1277
    :cond_45
    const/4 v1, 0x0

    .line 1278
    iput-boolean v1, v0, Lq41;->s0:Z

    .line 1279
    .line 1280
    invoke-virtual {v12}, Lro2;->a()Loo2;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v13

    .line 1284
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 1288
    .line 1289
    iget-object v1, v1, Lph3;->b:Lmt2;

    .line 1290
    .line 1291
    iget-object v1, v1, Lmt2;->a:Ljava/lang/Object;

    .line 1292
    .line 1293
    iget-object v2, v13, Loo2;->g:Lpo2;

    .line 1294
    .line 1295
    iget-object v2, v2, Lpo2;->a:Lmt2;

    .line 1296
    .line 1297
    iget-object v2, v2, Lmt2;->a:Ljava/lang/Object;

    .line 1298
    .line 1299
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v1

    .line 1303
    if-eqz v1, :cond_46

    .line 1304
    .line 1305
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 1306
    .line 1307
    iget-object v1, v1, Lph3;->b:Lmt2;

    .line 1308
    .line 1309
    iget v2, v1, Lmt2;->b:I

    .line 1310
    .line 1311
    const/4 v3, -0x1

    .line 1312
    if-ne v2, v3, :cond_46

    .line 1313
    .line 1314
    iget-object v2, v13, Loo2;->g:Lpo2;

    .line 1315
    .line 1316
    iget-object v2, v2, Lpo2;->a:Lmt2;

    .line 1317
    .line 1318
    iget v4, v2, Lmt2;->b:I

    .line 1319
    .line 1320
    if-ne v4, v3, :cond_46

    .line 1321
    .line 1322
    iget v1, v1, Lmt2;->e:I

    .line 1323
    .line 1324
    iget v2, v2, Lmt2;->e:I

    .line 1325
    .line 1326
    if-eq v1, v2, :cond_46

    .line 1327
    .line 1328
    const/4 v1, 0x1

    .line 1329
    goto :goto_23

    .line 1330
    :cond_46
    const/4 v1, 0x0

    .line 1331
    :goto_23
    iget-object v2, v13, Loo2;->g:Lpo2;

    .line 1332
    .line 1333
    move v3, v1

    .line 1334
    iget-object v1, v2, Lpo2;->a:Lmt2;

    .line 1335
    .line 1336
    iget-wide v4, v2, Lpo2;->b:J

    .line 1337
    .line 1338
    iget-wide v6, v2, Lpo2;->c:J

    .line 1339
    .line 1340
    const/16 v16, 0x1

    .line 1341
    .line 1342
    xor-int/lit8 v8, v3, 0x1

    .line 1343
    .line 1344
    const/4 v9, 0x0

    .line 1345
    move-wide v2, v4

    .line 1346
    move-wide v4, v6

    .line 1347
    move-wide v6, v2

    .line 1348
    invoke-virtual/range {v0 .. v9}, Lq41;->z(Lmt2;JJJZI)Lph3;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    iput-object v1, v0, Lq41;->V:Lph3;

    .line 1353
    .line 1354
    invoke-virtual {v0}, Lq41;->Q()V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v0}, Lq41;->B0()V

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v0}, Lq41;->f()Z

    .line 1361
    .line 1362
    .line 1363
    move-result v1

    .line 1364
    if-eqz v1, :cond_4d

    .line 1365
    .line 1366
    iget-object v1, v12, Lro2;->k:Loo2;

    .line 1367
    .line 1368
    if-ne v13, v1, :cond_4d

    .line 1369
    .line 1370
    array-length v1, v11

    .line 1371
    const/4 v2, 0x0

    .line 1372
    :goto_24
    if-ge v2, v1, :cond_4d

    .line 1373
    .line 1374
    aget-object v3, v11, v2

    .line 1375
    .line 1376
    iget v4, v3, Lez3;->d:I

    .line 1377
    .line 1378
    const/4 v7, 0x3

    .line 1379
    const/4 v5, 0x4

    .line 1380
    if-eq v4, v7, :cond_47

    .line 1381
    .line 1382
    if-ne v4, v5, :cond_48

    .line 1383
    .line 1384
    :cond_47
    const/4 v6, 0x0

    .line 1385
    goto :goto_25

    .line 1386
    :cond_48
    if-ne v4, v10, :cond_49

    .line 1387
    .line 1388
    const/4 v6, 0x0

    .line 1389
    iput v6, v3, Lez3;->d:I

    .line 1390
    .line 1391
    goto :goto_29

    .line 1392
    :cond_49
    const/4 v6, 0x0

    .line 1393
    goto :goto_29

    .line 1394
    :goto_25
    if-ne v4, v5, :cond_4a

    .line 1395
    .line 1396
    move/from16 v4, v16

    .line 1397
    .line 1398
    goto :goto_26

    .line 1399
    :cond_4a
    move v4, v6

    .line 1400
    :goto_26
    iget-object v5, v3, Lez3;->e:Ljava/lang/Object;

    .line 1401
    .line 1402
    check-cast v5, Lkq;

    .line 1403
    .line 1404
    iget-object v7, v3, Lez3;->f:Ljava/lang/Object;

    .line 1405
    .line 1406
    check-cast v7, Lkq;

    .line 1407
    .line 1408
    const/16 v8, 0x11

    .line 1409
    .line 1410
    if-eqz v4, :cond_4b

    .line 1411
    .line 1412
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1413
    .line 1414
    .line 1415
    invoke-interface {v7, v8, v5}, Lrk3;->c(ILjava/lang/Object;)V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_27

    .line 1419
    :cond_4b
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1420
    .line 1421
    .line 1422
    invoke-interface {v5, v8, v7}, Lrk3;->c(ILjava/lang/Object;)V

    .line 1423
    .line 1424
    .line 1425
    :goto_27
    iget v4, v3, Lez3;->d:I

    .line 1426
    .line 1427
    const/4 v5, 0x4

    .line 1428
    if-ne v4, v5, :cond_4c

    .line 1429
    .line 1430
    move v4, v6

    .line 1431
    goto :goto_28

    .line 1432
    :cond_4c
    move/from16 v4, v16

    .line 1433
    .line 1434
    :goto_28
    iput v4, v3, Lez3;->d:I

    .line 1435
    .line 1436
    :goto_29
    add-int/lit8 v2, v2, 0x1

    .line 1437
    .line 1438
    goto :goto_24

    .line 1439
    :cond_4d
    const/4 v5, 0x4

    .line 1440
    const/4 v6, 0x0

    .line 1441
    iget-object v1, v0, Lq41;->V:Lph3;

    .line 1442
    .line 1443
    iget v1, v1, Lph3;->e:I

    .line 1444
    .line 1445
    const/4 v7, 0x3

    .line 1446
    if-ne v1, v7, :cond_4e

    .line 1447
    .line 1448
    invoke-virtual {v0}, Lq41;->t0()V

    .line 1449
    .line 1450
    .line 1451
    :cond_4e
    iget-object v1, v12, Lro2;->i:Loo2;

    .line 1452
    .line 1453
    iget-object v1, v1, Loo2;->o:Lew4;

    .line 1454
    .line 1455
    move v2, v6

    .line 1456
    :goto_2a
    array-length v3, v11

    .line 1457
    if-ge v2, v3, :cond_52

    .line 1458
    .line 1459
    invoke-virtual {v1, v2}, Lew4;->n(I)Z

    .line 1460
    .line 1461
    .line 1462
    move-result v3

    .line 1463
    if-nez v3, :cond_4f

    .line 1464
    .line 1465
    goto :goto_2b

    .line 1466
    :cond_4f
    aget-object v3, v11, v2

    .line 1467
    .line 1468
    iget-object v4, v3, Lez3;->f:Ljava/lang/Object;

    .line 1469
    .line 1470
    check-cast v4, Lkq;

    .line 1471
    .line 1472
    iget-object v3, v3, Lez3;->e:Ljava/lang/Object;

    .line 1473
    .line 1474
    check-cast v3, Lkq;

    .line 1475
    .line 1476
    invoke-static {v3}, Lez3;->h(Lkq;)Z

    .line 1477
    .line 1478
    .line 1479
    move-result v8

    .line 1480
    if-eqz v8, :cond_50

    .line 1481
    .line 1482
    invoke-virtual {v3}, Lkq;->e()V

    .line 1483
    .line 1484
    .line 1485
    goto :goto_2b

    .line 1486
    :cond_50
    if-eqz v4, :cond_51

    .line 1487
    .line 1488
    iget v3, v4, Lkq;->u:I

    .line 1489
    .line 1490
    if-eqz v3, :cond_51

    .line 1491
    .line 1492
    invoke-virtual {v4}, Lkq;->e()V

    .line 1493
    .line 1494
    .line 1495
    :cond_51
    :goto_2b
    add-int/lit8 v2, v2, 0x1

    .line 1496
    .line 1497
    goto :goto_2a

    .line 1498
    :cond_52
    move/from16 v1, v16

    .line 1499
    .line 1500
    goto/16 :goto_22

    .line 1501
    .line 1502
    :cond_53
    :goto_2c
    iget-object v0, v0, Lq41;->q0:Lp31;

    .line 1503
    .line 1504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1505
    .line 1506
    .line 1507
    :cond_54
    :goto_2d
    return-void
.end method
